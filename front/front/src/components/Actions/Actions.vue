<template>
    <div class="actions pad-sm">
        <SectionTitle title="Nossas Ações">
            Seção destinada as ações realizadas pela UFC e por pessoas
            externas para
            <br /> aperfeiçoamento do campus.
        </SectionTitle>
        <Carrousel
            style="margin-bottom: 5rem"
            :itemsQuantity="actions.length"
            :windowSize="2"
            :paginationFactor="405"
        >
            <ActionCard v-for="action in actions" :key="action"  />
        </Carrousel>
    </div>
</template>

<script>
//import axios from 'axios'

import Carrousel from '../Carrousel/Carrousel.vue'
import SectionTitle from '../utils/SectionTitle.vue'
import ActionCard from './ActionCard.vue'

export default {
    components: { Carrousel, SectionTitle, ActionCard },
    data() {
        return {
           actions: [1, 2, 3, 4, 5, 6]
        }
    }
}
</script>

<style lang="scss" scoped>
.actions {
    background-color: #fff;
}

.action-card {
    margin-right: 1.5rem;

    &:last-child {
        margin-right: 0;
    }
}
</style>
