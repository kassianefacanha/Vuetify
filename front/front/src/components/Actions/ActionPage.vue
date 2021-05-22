<template>
    <div class="action-page" >
        <Navbar />
        <div class="post pad-sm">
            <h1 class="post__title">{{ action.title }}</h1>
            <h2 class="post__subtitle">{{ action.subtitle }}</h2>

            <div class="post__info">
                <div class="post__info--headers">
                    <h3>{{ action.user.fullname }}</h3>
                    <h4>05 de abril de 2020 - 12h15</h4>
                    <h4>Última Atualizalição há uma hora</h4>
                </div>
                <div class="post__info--social">
                    <svg class="social-icon">
                        <use xlink:href="@/assets/svg/sprites.svg#facebook-1" />
                    </svg>
                    <svg class="social-icon">
                        <use xlink:href="@/assets/svg/sprites.svg#twitter-1" />
                    </svg>
                    <svg class="social-icon">
                        <use xlink:href="@/assets/svg/sprites.svg#whatsapp" />
                    </svg>
                    <svg class="social-icon">
                        <use xlink:href="@/assets/svg/sprites.svg#pinterest" />
                    </svg>
                </div>
            </div>

            <hr />

            <SwitchLight />

            <div class="post__content" ></div>

            <SectionTitle title="Recomendadas para você"></SectionTitle>

            <div class="post__recommended">
                <ActionCard
                    style="margin: 0 1rem;"
                />
            </div>
        </div>
        <Footer />
    </div>
</template>

<script>
//import axios from 'axios'

import Navbar from '../Header/Navbar.vue'
import SectionTitle from '../utils/SectionTitle.vue'
import SwitchLight from '../utils/SwitchLight.vue'
import Footer from '../Footer/Footer.vue'
import ActionCard from './ActionCard.vue'

export default {
    components: {
        Navbar,
        SectionTitle,
        SwitchLight,
        Footer,
        ActionCard
    },
    data() {
        return {
            action: {},
            recommended: []
        }
    },
    methods: {
   
    },
    mounted() {
        
    }
}
</script>

<style lang="scss">
/* Color Variables & Theme Definitions */

* {
    transition: 0.2s ease-out;
}

/* Elements Styling */
.post {
    background-color: white;
    margin: 7rem 0;

    &__title {
        font-family: 'Raleway', sans-serif;
        font-size: 6.4rem;
        font-weight: 700;
        line-height: 8rem;
        color: rgb(160, 160, 160);
    }

    &__subtitle {
        font-family: 'Merriweather', sans-serif;
        font-size: 2rem;
        font-weight: lighter;
        color: rgb(160, 160, 160);
    }

    &__info {
        display: flex;
        justify-content: space-between;
        align-items: flex-end;
        margin-top: 3rem;
        margin-bottom: 1rem;

        &--headers {
            h3 {
                font-size: 1.8rem;
                font-weight: 500;
                color: rgb(160, 160, 160);
            }

            h4 {
                font-size: 1.8rem;
                font-weight: 400;
                color: rgb(160, 160, 160);
            }
        }

        &--social {
            .social-icon {
                height: 2.5rem;
                width: 2.5rem;
                margin-left: 1.5rem;
            }
        }
    }

    &__content {
        font-family: 'Merriweather', sans-serif;
        font-size: 1.8rem;
        color: rgb(160, 160, 160);
    }

    &__recommended {
        display: flex;
    }
}
</style>
