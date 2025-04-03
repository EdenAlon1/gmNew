package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgn {
    private final jzq a;
    private final String b;
    private final String c;

    public kgn(jzq jzqVar, String str, String str2) {
        this.a = jzqVar;
        this.b = str;
        this.c = str2;
    }

    public final khk a() {
        jzq jzqVar = this.a;
        if (jzqVar != null) {
            return new khm(jzqVar.a);
        }
        String str = this.b;
        if (str != null) {
            return khq.a(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + this.c + ". Using WrapContent.");
        return khq.a("wrap");
    }

    public final boolean b() {
        return this.a == null && this.b == null;
    }
}
