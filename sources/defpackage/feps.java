package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feps implements Runnable {
    final /* synthetic */ fepv a;
    final /* synthetic */ fepw b;

    public feps(fepw fepwVar, fepv fepvVar) {
        this.a = fepvVar;
        this.b = fepwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a.get() != feqc.e) {
            this.a.j();
            return;
        }
        feqc feqcVar = this.b.c;
        if (feqcVar.x == null) {
            feqcVar.x = new LinkedHashSet();
            feqc feqcVar2 = this.b.c;
            feqcVar2.S.c(feqcVar2.y, true);
        }
        fepw fepwVar = this.b;
        fepwVar.c.x.add(this.a);
    }
}
