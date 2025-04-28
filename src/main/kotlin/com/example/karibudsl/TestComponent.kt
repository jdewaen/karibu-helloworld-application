package com.example.karibudsl

import com.vaadin.flow.component.Tag
import com.vaadin.flow.component.dependency.JsModule
import com.vaadin.flow.component.littemplate.LitTemplate

@JsModule("./test-component.js")
@Tag("test-component")
class TestComponent : LitTemplate()