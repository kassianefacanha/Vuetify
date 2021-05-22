<template>
    <div class="action-card" >
        <img class="action-card__image" src="../../assets/img/covid-mask.jpg" alt="post-image" />
        <div class="action-card__text">
            <h1 class="action-card__text--title">Ação 1</h1>
            <h2 class="action-card__text--sub">Texto Texto Texto Texto Texto Texto Texto Texto Texto
                Texto Texto Texto Texto Texto Texto Texto Texto Texto
                Texto Texto Texto Texto Texto Texto Texto Texto Texto
                Texto Texto Texto Texto Texto Texto Texto Texto Texto
                Texto Texto Texto Texto Texto Texto Texto Texto Texto
            </h2>
        </div>
    </div>
</template>

<script>
export default {

}
</script>

<style lang="scss" scoped>
/* Color Variables & Theme Definitions */

* {
    transition: 0.2s ease-out;
}

/* Elements Styling */
.action-card {
    display: grid;
    grid-template-rows: 1fr 1fr;

    height: 32.5rem;
    width: 39rem;

    border: 1px solid;
    border-color: rgb(200, 198, 198);
    border-radius: 0.8rem;
    overflow: hidden;

    &__image {
        width: 100%;
        height: 100%;
    }

    &__text {
        padding: 1rem 0.8rem;

        &--title {
            font-weight: 700;
            font-size: 2.4rem;
            color: var(--title-color);

            margin: 0.2rem 0;
        }

        &--sub {
            font-family: 'Merriweather';
            font-weight: 400;
            color: var(--title-color);

            margin: 1rem 0;
        }

        &--link {
            font-size: 1.8rem;
            font-weight: 500;
            text-transform: uppercase;
            text-decoration: none;
            color: #2f80ed;

            margin-top: 0.2rem;

            cursor: pointer;
        }
    }
}
</style>
