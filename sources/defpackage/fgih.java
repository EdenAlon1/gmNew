package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgih extends ffts {
    private final String a;
    private final fgid b;

    public fgih(int i, int i2, long j, String str) {
        this.a = str;
        this.b = new fgid(i, i2, j, str);
    }

    @Override // defpackage.ffsd
    public final void a(ffhd ffhdVar, Runnable runnable) {
        fgid.e(this.b, runnable, false, 6);
    }

    public final void c(Runnable runnable, boolean z) {
        this.b.a(runnable, true, z);
    }

    public void close() {
        this.b.close();
    }

    @Override // defpackage.ffts
    public final Executor g() {
        return this.b;
    }

    @Override // defpackage.ffsd
    public final void h(ffhd ffhdVar, Runnable runnable) {
        fgid.e(this.b, runnable, true, 2);
    }
}
