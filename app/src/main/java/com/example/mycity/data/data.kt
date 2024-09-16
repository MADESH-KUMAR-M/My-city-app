package com.example.mycity.data

import com.example.mycity.R
import com.example.mycity.model.Details

object data {
    val category = listOf(
        R.string.Coffee_shop,
        R.string.parks,
        R.string.restaurant,
        R.string.theatre,
        R.string.shopping
    )

    fun getCoffeeShop(): List<Details> {
        return listOf(
            Details(
                id = 1,
                titleResourceId = R.string.star_bucks,
                logoResourceId = R.drawable.starbucks_logo,
                bannerResourceId = R.drawable.starbucks_banner,
                descriptionResourceId = R.string.starbucks_description
            ),
            Details(
                id = 2,
                titleResourceId = R.string.coffee_bean,
                logoResourceId = R.drawable.coffe_logo03,
                bannerResourceId = R.drawable.coffee_banner03,
                descriptionResourceId = R.string.coffee_bean_description
            ),
            Details(
                id = 3,
                titleResourceId = R.string.love_coffee,
                logoResourceId = R.drawable.coffee_logo04,
                bannerResourceId = R.drawable.cofee_banner04,
                descriptionResourceId = R.string.love_coffee_description
            ),
            Details(
                id = 4,
                titleResourceId = R.string.spell_coffee,
                logoResourceId = R.drawable.coffe_logo02,
                bannerResourceId = R.drawable.coffee_banner02,
                descriptionResourceId = R.string.spell_coffee_description
            ),
            Details(
                id = 5,
                titleResourceId = R.string.coffee_house,
                logoResourceId = R.drawable.coffee_logo01,
                bannerResourceId = R.drawable.coffee_banner01,
                descriptionResourceId = R.string.coffee_house_description
            ),
            Details(
                id = 6,
                titleResourceId = R.string.Steamy_Cup,
                logoResourceId = R.drawable.coffee_logo05,
                bannerResourceId = R.drawable.coffee_banner05,
                descriptionResourceId = R.string.steamy_cup_description
            )
        )
    }

    fun getParks(): List<Details> {
        return listOf(
            Details(
                id = 7,
                titleResourceId = R.string.black_thunder,
                logoResourceId = R.drawable.black_thunder_logo,
                bannerResourceId = R.drawable.black_thunder_banner,
                descriptionResourceId = R.string.black_thunder_description
            ),
            Details(
                id = 8,
                titleResourceId = R.string.vgp,
                logoResourceId = R.drawable.vgp_logo,
                bannerResourceId = R.drawable.vgp_banner,
                descriptionResourceId = R.string.vgp_description
            ),
            Details(
                id = 9,
                titleResourceId = R.string.adventure_park,
                logoResourceId = R.drawable.adventure_park_logo,
                bannerResourceId = R.drawable.adventure_park_banner,
                descriptionResourceId = R.string.adventure_park_description
            ),
            Details(
                id =10,
                titleResourceId = R.string.cultus_park,
                logoResourceId = R.drawable.cultus_logo,
                bannerResourceId = R.drawable.cultus_banner,
                descriptionResourceId = R.string.cultus_park_description
            ),
            Details(
                id = 11,
                titleResourceId = R.string.jolly_land,
                logoResourceId = R.drawable.jolly_land_logo,
                bannerResourceId = R.drawable.jolly_land_banner,
                descriptionResourceId = R.string.jolly_land_description
            )
        )
    }

    fun getRestaurant(): List<Details> {
        return listOf(
            Details(
                id = 12,
                titleResourceId = R.string.kfc,
                logoResourceId = R.drawable.kfc_logo,
                bannerResourceId = R.drawable.kfc_banner,
                descriptionResourceId = R.string.kfc_description
            ),
            Details(
                id = 13,
                titleResourceId = R.string.domino,
                logoResourceId = R.drawable.dominos_pizza_logo_1,
                bannerResourceId = R.drawable.domino_banner,
                descriptionResourceId = R.string.domino_description
            ),
            Details(
                id = 14,
                titleResourceId = R.string.wow_momo,
                logoResourceId = R.drawable.wow_momo_nglish_logo_round,
                bannerResourceId = R.drawable.wow_momos_banner,
                descriptionResourceId = R.string.wow_momo_description
            ),
            Details(
                id = 15,
                titleResourceId = R.string.pizza_hut,
                logoResourceId = R.drawable.pizzahut_logo,
                bannerResourceId = R.drawable.pizzahut_banner,
                descriptionResourceId = R.string.pizza_hut_description
            ),
            Details(
                id = 16,
                titleResourceId = R.string.star_briyani,
                logoResourceId = R.drawable.star_logo,
                bannerResourceId = R.drawable.star_banner,
                descriptionResourceId = R.string.star_briyani_description
            )

        )
    }
    fun getTheatre(): List<Details> {
        return listOf(
            Details(
                id = 17,
                titleResourceId = R.string.pvr,
                logoResourceId = R.drawable.pvr_logo,
                bannerResourceId = R.drawable.pvr_banner,
                descriptionResourceId = R.string.pvr_description
            ),
            Details(
                id = 18,
                titleResourceId = R.string.inox,
                logoResourceId = R.drawable.inox_logo,
                bannerResourceId = R.drawable.inox_banner,
                descriptionResourceId = R.string.inox_description
            ),
            Details(
                id = 19,
                titleResourceId = R.string.ags,
                logoResourceId = R.drawable.ags_logo,
                bannerResourceId = R.drawable.ags_banner,
                descriptionResourceId = R.string.ags_description
            ),
            Details(
                id = 20,
                titleResourceId = R.string.imax,
                logoResourceId = R.drawable.imax_logo,
                bannerResourceId = R.drawable.imax_pt_landing_banner,
                descriptionResourceId = R.string.imax_description
            ),
            Details(
                id = 21,
                titleResourceId = R.string.rohini,
                logoResourceId = R.drawable.rohini_banner,
                bannerResourceId = R.drawable.rohini_banner,
                descriptionResourceId = R.string.rohini_description
            )
        )
    }

    fun getShopping(): List<Details> {
        return listOf(
            Details(
                id = 22,
                titleResourceId = R.string.arena,
                logoResourceId = R.drawable.shopping_logo01,
                bannerResourceId = R.drawable.shopping_banner01,
                descriptionResourceId = R.string.arena_description
            ),
            Details(
                id = 23,
                titleResourceId = R.string.Stylish_trends,
                logoResourceId = R.drawable.shopping_logo03,
                bannerResourceId = R.drawable.shopping_banner03_png,
                descriptionResourceId = R.string.stylish_trends_description
            ),
            Details(
                id = 24,
                titleResourceId = R.string.shopping_market,
                logoResourceId = R.drawable.shopping_logo02,
                bannerResourceId = R.drawable.shopping_banner02,
                descriptionResourceId = R.string.shopping_market_description
            ),
            Details(
                id = 25,
                titleResourceId = R.string.black_friday,
                logoResourceId = R.drawable.shopping_logo04,
                bannerResourceId = R.drawable.shopping_banner04,
                descriptionResourceId = R.string.black_friday_description
            ),
            Details(
                id = 26,
                titleResourceId = R.string.shopping_mall,
                logoResourceId = R.drawable.shopping_logo05,
                bannerResourceId = R.drawable.shopping_banner05,
                descriptionResourceId = R.string.shopping_mall_description
            )
        )


    }




}