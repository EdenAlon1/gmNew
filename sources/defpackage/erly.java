package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erly {
    public static final erly b;
    private static final Map d;
    private static final emwv e;
    private final String f;
    private final String g;
    private final engy h;
    private String i;
    private int j;
    private static final engy c = engy.f("charset", emuz.c(StandardCharsets.UTF_8.name()));
    public static final emvz a = new emvh(new emvh(new emvh(emvk.a, new emvv(emvs.a)), new emvr(' ')), emvz.m("()<>@,;:\\\"/[]?="));

    static {
        emvz.m("\"\\\r");
        emvz.l(" \t\r\n");
        d = new HashMap();
        a("*", "*");
        a(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "*");
        a("image", "*");
        a("audio", "*");
        a("video", "*");
        a("application", "*");
        a("font", "*");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "cache-manifest");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "css");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "csv");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "html");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "calendar");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "markdown");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "plain");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "javascript");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "tab-separated-values");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "vcard");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "vnd.wap.wml");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "xml");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        d("image", "svg+xml");
        a("image", "tiff");
        a("image", "avif");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a("audio", "mp4");
        a("audio", "mpeg");
        a("audio", "ogg");
        a("audio", "webm");
        a("audio", "l16");
        a("audio", "l24");
        a("audio", "basic");
        a("audio", "aac");
        a("audio", "vorbis");
        a("audio", "x-ms-wma");
        a("audio", "x-ms-wax");
        a("audio", "vnd.rn-realaudio");
        a("audio", "vnd.wave");
        a("video", "mp4");
        a("video", "mpeg");
        a("video", "ogg");
        a("video", "quicktime");
        a("video", "webm");
        a("video", "x-ms-wmv");
        a("video", "x-flv");
        a("video", "3gpp");
        a("video", "3gpp2");
        d("application", "xml");
        d("application", "atom+xml");
        a("application", "x-bzip2");
        d("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        b = a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", fhpi.e);
        a("application", "cbor");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        d("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        d("application", "json");
        a("application", "jwt");
        d("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        d("application", "opensearchdescription+xml");
        a("application", "pdf");
        a("application", "postscript");
        a("application", "protobuf");
        d("application", "rdf+xml");
        d("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        d("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        d("application", "xhtml+xml");
        d("application", "xrd+xml");
        a("application", "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        e = new emwv(new emww("; "), "=");
    }

    private erly(String str, String str2, engy engyVar) {
        this.f = str;
        this.g = str2;
        this.h = engyVar;
    }

    private static erly a(String str, String str2) {
        erly erlyVar = new erly(str, str2, enet.a);
        c(erlyVar);
        return erlyVar;
    }

    private final Map b() {
        return ennc.l(this.h.map, new emwl() { // from class: erlx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Collection collection = (Collection) obj;
                if (collection instanceof enie) {
                    enie enieVar = (enie) collection;
                    enieVar.l();
                    return enieVar;
                }
                enib enibVar = new enib(collection instanceof enny ? ((enny) collection).i().size() : 11);
                enibVar.b(collection);
                return enibVar.a();
            }
        });
    }

    private static void c(erly erlyVar) {
        d.put(erlyVar, erlyVar);
    }

    private static void d(String str, String str2) {
        c(new erly(str, str2, c));
        emxc.j(StandardCharsets.UTF_8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof erly) {
            erly erlyVar = (erly) obj;
            if (this.f.equals(erlyVar.f) && this.g.equals(erlyVar.g) && b().equals(erlyVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int hash = Objects.hash(this.f, this.g, b());
        this.j = hash;
        return hash;
    }

    public final String toString() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append('/');
        sb.append(this.g);
        if (!this.h.A()) {
            sb.append("; ");
            e.b(sb, new ennq(this.h, new enmg(new emwl() { // from class: erlw
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    if (erly.a.h(str2) && !str2.isEmpty()) {
                        return str2;
                    }
                    StringBuilder sb2 = new StringBuilder(str2.length() + 16);
                    sb2.append('\"');
                    for (int i = 0; i < str2.length(); i++) {
                        char charAt = str2.charAt(i);
                        if (charAt != '\r' && charAt != '\\') {
                            if (charAt == '\"') {
                                charAt = '\"';
                            } else {
                                sb2.append(charAt);
                            }
                        }
                        sb2.append('\\');
                        sb2.append(charAt);
                    }
                    sb2.append('\"');
                    return sb2.toString();
                }
            })).u());
        }
        String sb2 = sb.toString();
        this.i = sb2;
        return sb2;
    }
}
