package com.stripe.android.ui.core.elements

import kotlinx.serialization.Serializable

/**
 * Header that displays promo information about Affirm
 */
@Serializable
internal data class AffirmTextSpec(
    override val apiPath: IdentifierSpec = IdentifierSpec.Generic("affirm_header")
) : FormItemSpec() {
    fun transform(): FormElement =
        AffirmHeaderElement(this.apiPath)
}
