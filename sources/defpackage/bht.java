package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bht {
    private final bhr a;

    private bht(bhr bhrVar) {
        this.a = bhrVar;
    }

    public static bht a() {
        return Build.VERSION.SDK_INT >= 30 ? new bht(new bhq()) : new bht(new bhs());
    }

    public final void b() {
        this.a.a();
    }

    public final void c(String str) {
        this.a.b(str);
    }

    public final void d() {
        this.a.c();
    }
}
