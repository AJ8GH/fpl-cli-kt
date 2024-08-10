package io.github.aj8gh.fpl

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.mordant.rendering.BorderType.Companion.SQUARE_DOUBLE_SECTION_SEPARATOR
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.rendering.TextColors.Companion.rgb
import com.github.ajalt.mordant.rendering.TextStyles.bold
import com.github.ajalt.mordant.rendering.TextStyles.strikethrough
import com.github.ajalt.mordant.table.Borders
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

class Fpl : CliktCommand(name = "fpl", invokeWithoutSubcommand = true) {
  override fun run() {
    val t = Terminal()
    t.println(brightRed("This shit is red yo!"))
    t.println(brightRed("You can use any of the standard ANSI colors"))

    val style = (bold + black + strikethrough)
    t.println(
      cyan("You ${(green on white)("can ${style("nest")} styles")} arbitrarily")
    )

    t.println(rgb("#b4eeb4")("You can also use true color and color spaces like HSL"))

    t.println(
      table {
        borderType = SQUARE_DOUBLE_SECTION_SEPARATOR
        borderStyle = rgb("#4b25b9")
        align = TextAlign.CENTER
        tableBorders = Borders.ALL

        header { row("name", "goals", "assists") }
        body {
          row("Haaland", 3, 2)
          row("Salah", 2, 3)
          row("Saka", 1, 2)
        }
      }
    )
  }
}
