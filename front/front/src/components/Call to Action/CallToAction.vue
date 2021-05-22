<template>
    <div class="call-to-action">

        <img
            id="call-to-action-img"
            src="../../assets/img/call-to-action-cover.jpg"
            alt="call-to-action-cover"
        />

        <button>Universidade Federal do Ceará </button>

    </div>
</template>

<script>
export default {
    name: 'CallToAction'
}
</script>

<style lang="scss" scoped>
.call-to-action {
    position: relative;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    overflow: hidden;

    height: 35rem;
    width: 100%;

 

    button {
        border: none;
        border-radius: 0.7rem;
        padding: 1rem 3rem;
        margin: 2.5rem 0;

        font-family: 'Roboto', sans-serif;
        font-size: 1.8rem;
        font-weight: 700;
        text-transform: uppercase;

        color: white;
        background-color: #2f80ed;

        z-index: 3;
    }
}

#purple-effect {
    position: absolute;
    z-index: 2;
}

#call-to-action-img {
    position: absolute;
    width: 100%;
    z-index: 0;
}
</style>
