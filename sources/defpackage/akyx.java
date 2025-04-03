package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akyx implements akzt {
    private static final cskc a = cskc.g("BugleUsageStatistics", "ClearcutCounterEventLogger");
    private final ffbr b;
    private final ffbr c;
    private boolean d = false;

    public akyx(ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = ffbrVar;
        this.b = ffbrVar2;
    }

    public static void j() {
        a.m("Clearcut loggings are disabled.");
    }

    @Override // defpackage.akzt
    public final void a() {
        if (!this.d) {
            j();
        } else if (this.b.b() != null) {
            ((akxl) this.b.b()).a();
        }
    }

    @Override // defpackage.akzt
    public final void b(String str, eogt eogtVar, long j) {
        if (this.d) {
            ((akxl) this.b.b()).c(str, eogtVar, j);
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void c(String str) {
        if (this.d) {
            ((akxl) this.b.b()).d(str);
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void d(String str, int i) {
        if (this.d) {
            ((akxl) this.b.b()).e(str, i);
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void e(String str, int i) {
        if (this.d) {
            ((akxl) this.b.b()).f(str, i);
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void f(String str, int i, long j) {
        if (this.d) {
            ((akxl) this.b.b()).g(str, i, j);
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void g(String str, long j) {
        if (this.d) {
            ((akxl) this.b.b()).h(str, j);
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void h(String str, long j, String str2) {
        if (this.d) {
            ((akxl) this.b.b()).i(str, j, str2);
        } else {
            j();
        }
    }

    @Override // defpackage.akzt
    public final void i() {
        if (((csxu) this.c.b()).i("bugle_enable_analytics", true)) {
            this.d = true;
        }
    }

    @Override // defpackage.akzt
    public final void k() {
        if (this.d) {
            ((akxl) this.b.b()).s();
        } else {
            j();
        }
    }
}
