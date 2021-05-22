<template>
    <div class="products-card">
        <div class="products-card__up">
            <img
                class="products-card__up--img"
                src="../../assets/img/material3d-cover.png"
                alt="products-img"
            />
        </div>
        <div class="products-card__bottom">
            <h3 class="products-card__title">Sistema para NPI</h3>
            <div class="products-card__btn">
                <button class="products-card__btn--find">Achar Produto</button>
                <button class="products-card__btn--contribute">Quero Contribuir</button>
            </div>
        </div>
    </div>
</template>

<script>
export default {}
</script>

<style lang="scss" scoped>
.products-card {
    display: flex;
    flex-direction: column;

    height: 27.5rem;
    width: 39.3rem;

    margin: 0 1rem;

    &__up {
        position: relative;
        border-top-left-radius: 0.7rem;
        border-top-right-radius: 0.7rem;
        height: 100%;
        overflow: hidden;
        background-color: rgba(black, 0.45);

        &--img {
            position: absolute;
            top: -50%;
            width: 100%;
        }
    }

    &__bottom {
        padding: 1rem 0;
    }

    &__title {
        font-weight: 700;
        font-size: 2.4rem;
        margin: 0 0 1.5rem 0.5rem;
        color: rgba(black, 0.6);
    }

    &__btn {
        display: flex;
        justify-content: space-between;

        &--find {
            border: 1px solid #2f80ed;
            font-family: 'Roboto', sans-serif;
            font-size: 1.6rem;
            text-transform: uppercase;
            padding: 0.5rem 1.5rem;
            border-radius: 0.7rem;
            font-weight: 500;
            letter-spacing: 0.1rem;
            color: #2f80ed;
            background-color: #fff;
        }

        &--contribute {
            border: none;
            font-family: 'Roboto', sans-serif;
            font-size: 1.6rem;
            text-transform: uppercase;
            padding: 0.5rem 1.5rem;
            border-radius: 0.7rem;
            font-weight: 500;
            letter-spacing: 0.1rem;
            color: #fff;
            background-color: #2f80ed;
        }
    }
}
</style>
