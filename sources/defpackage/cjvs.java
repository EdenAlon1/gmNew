package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjvs {
    public static final cjvt a(cjvw cjvwVar) {
        String str = cjvwVar.c;
        String str2 = cjvwVar.d;
        String str3 = cjvwVar.e;
        cjwi b = cjwi.b(cjvwVar.f);
        if (b == null) {
            b = cjwi.UNRECOGNIZED;
        }
        cjwi cjwiVar = b;
        cjwiVar.getClass();
        return new cjvt(str, str2, str3, cjwiVar, false, 16);
    }

    public static final cjvu b(cjvz cjvzVar) {
        String str = cjvzVar.c;
        str.getClass();
        Uri parse = str.length() == 0 ? null : Uri.parse(cjvzVar.c);
        cjwi b = cjwi.b(cjvzVar.d);
        if (b == null) {
            b = cjwi.UNRECOGNIZED;
        }
        b.getClass();
        return new cjvu(parse, b, false, 4);
    }
}
