package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyxb implements doau {
    public final cyvj a;
    public final cyup b;
    public final cyxc c;
    public final long d;
    public final ffix e;
    public final cyyj f;
    public final cyxa g;
    public final int h;
    private final ffix i;

    public cyxb(cyvj cyvjVar, cyup cyupVar, cyxc cyxcVar, long j, int i, ffix ffixVar, ffix ffixVar2, cyyj cyyjVar, cyxa cyxaVar) {
        cyxcVar.getClass();
        this.a = cyvjVar;
        this.b = cyupVar;
        this.c = cyxcVar;
        this.d = j;
        this.h = i;
        this.i = ffixVar;
        this.e = ffixVar2;
        this.f = cyyjVar;
        this.g = cyxaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyxb)) {
            return false;
        }
        cyxb cyxbVar = (cyxb) obj;
        return ffkj.e(this.a, cyxbVar.a) && ffkj.e(this.b, cyxbVar.b) && this.c == cyxbVar.c && kaa.f(this.d, cyxbVar.d) && this.h == cyxbVar.h && ffkj.e(this.i, cyxbVar.i) && ffkj.e(this.e, cyxbVar.e) && ffkj.e(this.f, cyxbVar.f) && ffkj.e(this.g, cyxbVar.g);
    }

    public final int hashCode() {
        cyvj cyvjVar = this.a;
        int hashCode = cyvjVar == null ? 0 : cyvjVar.hashCode();
        cyup cyupVar = this.b;
        int hashCode2 = (((((((((((hashCode * 31) + (cyupVar == null ? 0 : cyupVar.hashCode())) * 31) + this.c.hashCode()) * 31) + jzz.a(this.d)) * 31) + this.h) * 31) + this.i.hashCode()) * 31) + this.e.hashCode();
        cyyj cyyjVar = this.f;
        return (((hashCode2 * 31) + (cyyjVar != null ? cyyjVar.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "MiniConversationDetailsUiData(avatarUiData=" + this.a + ", actionsUiData=" + this.b + ", visibilityState=" + this.c + ", parentAvatarPositionData=" + kaa.e(this.d) + ", callerSource=" + ((Object) cyvn.a(this.h)) + ", onOpen=" + this.i + ", onDismiss=" + this.e + ", photoSelector=" + this.f + ", flags=" + this.g + ")";
    }
}
