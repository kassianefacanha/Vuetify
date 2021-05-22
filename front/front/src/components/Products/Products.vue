<template>
    <div class="Products pad-sm">
        <SectionTitle title="Nossas Produtos">
            Seção destinada aos materiais, produtos, serviços ou insumos
            <br />que estão sendo feitas.
        </SectionTitle>
        <Carrousel
            :itemsQuantity="items.length"
            :windowSize="2"
            :paginationFactor="412"
        >
            <ProductsCard v-for="item in items" :key="item" />
        </Carrousel>
    </div>
</template>

<script>
import Carrousel from '../Carrousel/Carrousel.vue'
import SectionTitle from '../utils/SectionTitle.vue'
import ProductsCard from './ProductsCard.vue'

export default {
    name: 'Products',
    components: { SectionTitle, Carrousel, ProductsCard },
    data() {
        return {
            items: [1, 2, 3, 4, 5, 6]
        }
    }
}
</script>

<style></style>
