package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mio implements mhd {
    public lri a = lri.a;
    private boolean b;
    private long c;
    private long d;

    @Override // defpackage.mhd
    public final long a() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        return j + (this.a.b == 1.0f ? lvf.u(elapsedRealtime) : elapsedRealtime * r4.d);
    }

    @Override // defpackage.mhd
    public final lri b() {
        return this.a;
    }

    public final void c(long j) {
        this.c = j;
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.mhd
    public final void d(lri lriVar) {
        if (this.b) {
            c(a());
        }
        this.a = lriVar;
    }

    public final void e() {
        if (this.b) {
            return;
        }
        this.d = SystemClock.elapsedRealtime();
        this.b = true;
    }

    public final void f() {
        if (this.b) {
            c(a());
            this.b = false;
        }
    }

    @Override // defpackage.mhd
    public final /* synthetic */ boolean g() {
        return false;
    }
}
