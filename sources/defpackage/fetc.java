package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fetc extends fdxt {
    long a;
    final /* synthetic */ fetu b;
    private final fets c;

    public fetc(fetu fetuVar, fets fetsVar) {
        this.b = fetuVar;
        this.c = fetsVar;
    }

    @Override // defpackage.fedo
    public final void c(long j) {
        if (this.b.w.f != null) {
            return;
        }
        synchronized (this.b.q) {
            if (this.b.w.f == null) {
                fets fetsVar = this.c;
                if (!fetsVar.b) {
                    long j2 = this.a + j;
                    this.a = j2;
                    fetu fetuVar = this.b;
                    long j3 = fetuVar.B;
                    if (j2 <= j3) {
                        return;
                    }
                    if (j2 > fetuVar.s) {
                        fetsVar.c = true;
                    } else {
                        long a = fetuVar.r.a(j2 - j3);
                        fetu fetuVar2 = this.b;
                        fetuVar2.B = this.a;
                        if (a > fetuVar2.t) {
                            this.c.c = true;
                        }
                    }
                    fets fetsVar2 = this.c;
                    Runnable t = fetsVar2.c ? this.b.t(fetsVar2) : null;
                    if (t != null) {
                        t.run();
                    }
                }
            }
        }
    }
}
