package defpackage;

import android.webkit.MimeTypeMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caqv {
    public static String a(ewmw ewmwVar) {
        char c;
        int b = ewmu.b(ewmwVar.e);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        if (i == 2) {
            return "image/png";
        }
        if (i == 3) {
            return "image/gif";
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(ewmwVar.c);
        int hashCode = fileExtensionFromUrl.hashCode();
        if (hashCode != 102340) {
            if (hashCode == 111145 && fileExtensionFromUrl.equals("png")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (fileExtensionFromUrl.equals("gif")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? "image/*" : "image/gif" : "image/png";
    }
}
