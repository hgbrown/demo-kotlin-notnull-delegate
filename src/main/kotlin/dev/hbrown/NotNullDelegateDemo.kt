package dev.hbrown

import kotlin.properties.Delegates

class NotNullDelegateDemo {

    var shouldNotBeNull: String by Delegates.notNull()
}
