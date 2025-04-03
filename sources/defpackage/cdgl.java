package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgl implements cdgt {
    private final int a;

    public cdgl(int i) {
        this.a = i;
    }

    @Override // defpackage.cdgt
    public final void a(epds epdsVar) {
        epdsVar.copyOnWrite();
        epdt epdtVar = (epdt) epdsVar.instance;
        epdt epdtVar2 = epdt.a;
        epdtVar.b |= 8;
        epdtVar.f = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdgl) && this.a == ((cdgl) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AttemptCount(attemptCount=" + this.a + ")";
    }

    @Override // defpackage.cdgt
    public final /* synthetic */ void b(epep epepVar) {
    }

    @Override // defpackage.cdgt
    public final /* synthetic */ void c(bqiv bqivVar) {
    }
}
