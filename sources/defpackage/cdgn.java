package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgn implements cdgt {
    private final ccce a;

    public cdgn(ccce ccceVar) {
        this.a = ccceVar;
    }

    @Override // defpackage.cdgt
    public final void a(epds epdsVar) {
        int i = this.a.h;
        epdsVar.copyOnWrite();
        epdt epdtVar = (epdt) epdsVar.instance;
        epdt epdtVar2 = epdt.a;
        epdtVar.b |= 8;
        epdtVar.f = i;
        int i2 = true != this.a.g ? 3 : 2;
        epdsVar.copyOnWrite();
        epdt epdtVar3 = (epdt) epdsVar.instance;
        epdtVar3.g = i2 - 1;
        epdtVar3.b |= 16;
    }

    @Override // defpackage.cdgt
    public final void c(bqiv bqivVar) {
        bqivVar.i(this.a);
        bqivVar.f(this.a.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdgn) && ffkj.e(this.a, ((cdgn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CmsBackupContext(parameters=" + this.a + ")";
    }

    @Override // defpackage.cdgt
    public final /* synthetic */ void b(epep epepVar) {
    }
}
