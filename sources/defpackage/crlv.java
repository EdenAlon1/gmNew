package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crlv {
    private static final entd a = entd.c("Bugle");
    private final String b;
    private final ffix c;
    private boolean d;
    private boolean e;

    public crlv(String str, ffix ffixVar) {
        this.b = str;
        this.c = ffixVar;
    }

    public final void a(Bundle bundle) {
        if (this.e) {
            bundle.putBoolean(this.b, this.d);
        } else {
            ((ensz) a.j()).t("Didn't read using savedInstanceState first for %s, use default value instead", this.b);
            bundle.putBoolean(this.b, ((Boolean) this.c.invoke()).booleanValue());
        }
    }

    public final boolean b() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Must read using savedInstanceState first");
    }

    public final boolean c(Bundle bundle) {
        boolean booleanValue;
        if (this.e) {
            return this.d;
        }
        if (bundle == null || !bundle.containsKey(this.b)) {
            booleanValue = ((Boolean) this.c.invoke()).booleanValue();
            this.d = booleanValue;
        } else {
            booleanValue = bundle.getBoolean(this.b);
            this.d = booleanValue;
        }
        this.e = true;
        return booleanValue;
    }

    public final void d() {
        this.d = true;
        this.e = true;
    }
}
