package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgm implements cdgt {
    private final String a;

    public cdgm(String str) {
        this.a = str;
    }

    @Override // defpackage.cdgt
    public final void a(epds epdsVar) {
        epdsVar.copyOnWrite();
        epdt epdtVar = (epdt) epdsVar.instance;
        epdt epdtVar2 = epdt.a;
        epdtVar.b |= 64;
        String str = this.a;
        if (str == null) {
            str = "";
        }
        epdtVar.i = str;
    }

    @Override // defpackage.cdgt
    public final void c(bqiv bqivVar) {
        bqivVar.g(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdgm) && ffkj.e(this.a, ((cdgm) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "BugleId(bugleId=" + this.a + ")";
    }

    @Override // defpackage.cdgt
    public final /* synthetic */ void b(epep epepVar) {
    }
}
