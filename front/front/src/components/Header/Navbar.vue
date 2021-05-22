<template>
       <nav class="navbar pad-sm" >
        <img  src="@/assets/img/logo_ufc_horizontal_white.png" alt="logo" />

     
        <ul class="navbar__list">
            <li >Home</li>
            <li>Ações</li>
            <li>Produtos</li>
        </ul>
        <div class="navbar__actions">
            <a>Contatos</a>
            <button>Login</button>
        </div>


        <svg class="navbar__menu">
            <use xlink:href="@/assets/svg/sprites.svg#menu-1" />
        </svg>
    </nav>

</template>
<script>

export default {

    computed: {}
}
</script>

<style lang="scss" scoped>
/* Color Variables & Theme Definitions */

/* Elements styling */
.navbar {
    display: flex;
    align-items: center;
    justify-content: space-between;
    background-color: #1E90FF;
    height: 7rem;

    position: fixed;
    top: 0;
    z-index: 1000;
    width: 100%;

    img {
        cursor: pointer;
        height: auto;
        width: 250px;
    }

    &__menu {
        display: none;
        height: 2.4rem;
        width: 2.4rem;
        fill: white;

    }

    &__list {


        display: flex;
        flex: 1;
        justify-content: flex-end;
        list-style-type: none;

        border-right: 1px solid rgba(0, 0, 0, 0.25);

        li {
            font-size: 1.6rem;
            color:white;

            margin: 0 2.5rem;
            cursor: pointer;

            &:hover {
                color:  rgba(0, 0, 0, 0.87);
            }

        }
    }

    &__actions {

        button {
            background-color: rgba(255, 255, 255, 0.5);
            color: rgba(255, 255, 255, 1);

            font-size: 1.4rem;
            font-weight: 500;
            text-transform: uppercase;
            letter-spacing: 0.2rem;

            padding: 1rem 5rem;
            border: none;
            border-radius: 4rem;

            cursor: pointer;
            outline: none;

            transition: 0.2s ease-out;

            &:hover {
                transform: scale(1.1);
            }
        }

        a {
            color:  white;
            font-size: 1.4rem;
            font-weight: 500;
            text-transform: uppercase;
            letter-spacing: 0.2rem;

            margin: 0 3rem;

            cursor: pointer;
        }
    }
}
</style>
