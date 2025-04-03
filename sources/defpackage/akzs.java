package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akzs implements akzt {
    private static final cskc a = cskc.g("BugleUsageStatistics", "ConfiguredClearcutCounterEventLogger");
    private final ffbr b;
    private final ffbr c;

    public akzs(ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    public static void j() {
        a.m("Clearcut loggings are disabled.");
    }

    private final boolean l() {
        return ((csxu) this.b.b()).i("bugle_enable_analytics", true);
    }

    @Override // defpackage.akzt
    public final void a() {
        if (!l()) {
            j();
        } else if (this.c.b() != null) {
            ((akzu) this.c.b()).a();
        }
    }

    @Override // defpackage.akzt
    public final void b(String str, eogt eogtVar, long j) {
        if (l()) {
            ((akzu) this.c.b()).b(str, eogtVar, j);
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void c(String str) {
        if (l()) {
            ((akzu) this.c.b()).c(str);
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void d(String str, int i) {
        if (l()) {
            ((akzu) this.c.b()).d(str, Integer.valueOf(i));
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void e(String str, int i) {
        if (l()) {
            ((akzu) this.c.b()).e(str, i);
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void f(String str, int i, long j) {
        if (l()) {
            ((akzu) this.c.b()).f(str, i, j);
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void g(String str, long j) {
        if (l()) {
            ((akzu) this.c.b()).g(str, j);
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void h(String str, long j, String str2) {
        if (l()) {
            ((akzu) this.c.b()).h(str, j, str2);
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void k() {
        if (l()) {
            ((akzu) this.c.b()).i();
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void i() {
    }
}
