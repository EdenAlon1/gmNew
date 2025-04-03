package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egai {
    public static Uri a(ewlp ewlpVar) {
        StringBuilder sb = new StringBuilder("https://lh3.googleusercontent.com/p/");
        if ((ewlpVar.b & 1) != 0) {
            sb.append(ewlpVar.c);
        }
        if ((ewlpVar.b & 2) != 0) {
            sb.append("=iv");
            sb.append(ewlpVar.d);
        }
        return Uri.parse(sb.toString());
    }
}
