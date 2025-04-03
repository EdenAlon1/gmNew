package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoea {
    private static final enip a = enip.t("http", "https", "mailto", "ftp");
    private static final enip b = enip.v("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska", "font/ttf");
    private static final enip c = enpd.a;

    public static eodz a(String str) {
        char charAt;
        int i;
        char charAt2;
        char charAt3;
        eodz eodzVar = eodz.a;
        enip enipVar = c;
        String c2 = emuz.c(str);
        enqu listIterator = a.listIterator();
        while (true) {
            if (!listIterator.hasNext()) {
                if (!c2.startsWith("data:")) {
                    enqu listIterator2 = ((enpd) enipVar).listIterator();
                    while (true) {
                        if (listIterator2.hasNext()) {
                            if (c2.startsWith(String.valueOf(emuz.c(((eodv) listIterator2.next()).name()).replace('_', '-')).concat(":"))) {
                                break;
                            }
                        } else {
                            for (int i2 = 0; i2 < str.length() && (charAt = str.charAt(i2)) != '#' && charAt != '/'; i2++) {
                                if (charAt != ':') {
                                    if (charAt == '?') {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    return eodzVar;
                }
                String c3 = emuz.c(str);
                if (c3.startsWith("data:") && c3.length() > 5) {
                    int i3 = 5;
                    while (i3 < c3.length() && (charAt3 = c3.charAt(i3)) != ';' && charAt3 != ',') {
                        i3++;
                    }
                    if (b.contains(c3.substring(5, i3)) && c3.startsWith(";base64,", i3) && (i = i3 + 8) < c3.length()) {
                        while (i < c3.length() && (charAt2 = c3.charAt(i)) != '=') {
                            if ((charAt2 < 'a' || charAt2 > 'z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '/')) {
                                break;
                            }
                            i++;
                        }
                        while (i < c3.length()) {
                            if (c3.charAt(i) == '=') {
                                i++;
                            }
                        }
                    }
                }
                return eodzVar;
            }
            if (c2.startsWith(String.valueOf((String) listIterator.next()).concat(":"))) {
                break;
            }
        }
        return new eodz(str);
    }
}
