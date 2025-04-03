package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgp implements cdgt {
    private final String a;

    public cdgp(String str) {
        this.a = str;
    }

    @Override // defpackage.cdgt
    public final void b(epep epepVar) {
        epepVar.copyOnWrite();
        epeq epeqVar = (epeq) epepVar.instance;
        epeq epeqVar2 = epeq.a;
        epeqVar.b |= 2048;
        epeqVar.o = this.a;
    }

    @Override // defpackage.cdgt
    public final void c(bqiv bqivVar) {
        bqivVar.k(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdgp) && ffkj.e(this.a, ((cdgp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CmsId(cmsId=" + this.a + ")";
    }

    @Override // defpackage.cdgt
    public final /* synthetic */ void a(epds epdsVar) {
    }
}
