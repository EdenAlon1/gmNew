package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgr implements cdgt {
    private final epeg a;

    public cdgr(epeg epegVar) {
        epegVar.getClass();
        this.a = epegVar;
    }

    @Override // defpackage.cdgt
    public final void a(epds epdsVar) {
        epdsVar.copyOnWrite();
        epdt epdtVar = (epdt) epdsVar.instance;
        epdt epdtVar2 = epdt.a;
        epdtVar.e = this.a.bs;
        epdtVar.b |= 4;
    }

    @Override // defpackage.cdgt
    public final void b(epep epepVar) {
        epepVar.copyOnWrite();
        epeq epeqVar = (epeq) epepVar.instance;
        epeq epeqVar2 = epeq.a;
        epeqVar.e = this.a.bs;
        epeqVar.b |= 4;
    }

    @Override // defpackage.cdgt
    public final void c(bqiv bqivVar) {
        bqivVar.l(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdgr) && this.a == ((cdgr) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailureReason(failureReason=" + this.a + ")";
    }
}
