package io.github.aj8gh.fpl

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.mordant.rendering.TextColors
import com.github.ajalt.mordant.terminal.Terminal

class Fpl : CliktCommand() {
  override fun run() {
    echo("Yo!")
    val t = Terminal()
    t.println(TextColors.brightRed("This shit is red yo!"))
  }

}
