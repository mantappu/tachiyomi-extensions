package eu.kanade.tachiyomi.extension.id.manwhaindo

import eu.kanade.tachiyomi.multisrc.wpmangareader.WPMangaReader
import java.text.SimpleDateFormat
import java.util.Locale

class ManhwaIndo : WPMangaReader("ManhwaIndo", "https://Manhwaindo.id", "id", dateFormat = SimpleDateFormat("MMMM d, yyyy", Locale("id")))
