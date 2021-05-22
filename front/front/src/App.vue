<template>
  <div id="app">
    <div id="home">
       <Navbar />
        <CallToAction />
        <Forms /> 
       <!-- <Actions />-->
        <!--<Products />-->
       <Footer />
    </div>
  </div>
</template>

<script>
import "@/styles/main.scss"
import Forms from './components/Forms/Forms.vue'
//import Actions from './components/Actions/Actions.vue'
import CallToAction from './components/Call to Action/CallToAction.vue'
//import Products from './components/Products/Products.vue'
import Navbar from './components/Header/Navbar.vue'
import Footer from './components/Footer/Footer.vue'

export default {
    components: {
        Forms,
        Navbar,
        //Actions,
        CallToAction,
       // Products,
        Footer
    }
}
</script>
<style>


</style>
