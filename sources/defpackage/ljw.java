package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljw implements lkp {
    private final ljv a;
    private final lkp b;

    public ljw(ljv ljvVar, lkp lkpVar) {
        this.a = ljvVar;
        this.b = lkpVar;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        switch (lkiVar) {
            case ON_CREATE:
                this.a.gZ(lkrVar);
                break;
            case ON_START:
                this.a.ha(lkrVar);
                break;
            case ON_RESUME:
                this.a.d(lkrVar);
                break;
            case ON_PAUSE:
                this.a.c(lkrVar);
                break;
            case ON_STOP:
                this.a.f(lkrVar);
                break;
            case ON_DESTROY:
                this.a.ff(lkrVar);
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        lkp lkpVar = this.b;
        if (lkpVar != null) {
            lkpVar.hg(lkrVar, lkiVar);
        }
    }
}
