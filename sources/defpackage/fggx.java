package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fggx extends ffsd implements ffsu {
    public final ffsd a;
    private final /* synthetic */ ffsu b;
    private final int c;
    private final ffql d;
    private final fghd e;
    private final Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public fggx(ffsd ffsdVar, int i) {
        ffsu ffsuVar = ffsdVar instanceof ffsu ? (ffsu) ffsdVar : null;
        this.b = ffsuVar == null ? ffsr.a : ffsuVar;
        this.a = ffsdVar;
        this.c = i;
        this.d = new ffql(0, ffqo.a);
        this.e = new fghd();
        this.f = new Object();
    }

    private final boolean j() {
        synchronized (this.f) {
            if (this.d.c >= this.c) {
                return false;
            }
            this.d.b();
            return true;
        }
    }

    @Override // defpackage.ffsd
    public final void a(ffhd ffhdVar, Runnable runnable) {
        Runnable g;
        this.e.d(runnable);
        if (this.d.c >= this.c || !j() || (g = g()) == null) {
            return;
        }
        this.a.a(this, new fggw(this, g));
    }

    @Override // defpackage.ffsu
    public final ffte c(long j, Runnable runnable, ffhd ffhdVar) {
        return this.b.c(j, runnable, ffhdVar);
    }

    @Override // defpackage.ffsu
    public final void d(long j, ffrf ffrfVar) {
        this.b.d(j, ffrfVar);
    }

    public final Runnable g() {
        while (true) {
            Runnable runnable = (Runnable) this.e.b();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f) {
                this.d.a();
                if (this.e.a() == 0) {
                    return null;
                }
                this.d.b();
            }
        }
    }

    @Override // defpackage.ffsd
    public final void h(ffhd ffhdVar, Runnable runnable) {
        Runnable g;
        this.e.d(runnable);
        if (this.d.c >= this.c || !j() || (g = g()) == null) {
            return;
        }
        this.a.h(this, new fggw(this, g));
    }

    @Override // defpackage.ffsd
    public final ffsd i(int i) {
        fggy.a(1);
        return this.c <= 1 ? this : super.i(1);
    }

    @Override // defpackage.ffsd
    public final String toString() {
        return this.a + ".limitedParallelism(" + this.c + ")";
    }
}
