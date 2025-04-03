package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekrf extends ekrp {
    public static final /* synthetic */ int a = 0;
    private final boolean c = true;
    private final ekrl d;
    private final ekrh e;
    private final ffbr f;

    public ekrf(boolean z, ekrl ekrlVar, ekrh ekrhVar, ffbr ffbrVar) {
        this.d = ekrlVar;
        this.e = ekrhVar;
        this.f = ffbrVar;
    }

    @Override // defpackage.ekrp
    public final ekrh a() {
        return this.e;
    }

    @Override // defpackage.ekrp
    public final ekrl b() {
        return this.d;
    }

    @Override // defpackage.ekrp
    public final ffbr c() {
        return this.f;
    }

    @Override // defpackage.ekrp
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekrp) {
            ekrp ekrpVar = (ekrp) obj;
            ekrpVar.d();
            ekrl ekrlVar = this.d;
            if (ekrlVar != null ? ekrlVar.equals(ekrpVar.b()) : ekrpVar.b() == null) {
                ekrh ekrhVar = this.e;
                if (ekrhVar != null ? ekrhVar.equals(ekrpVar.a()) : ekrpVar.a() == null) {
                    ffbr ffbrVar = this.f;
                    if (ffbrVar != null ? ffbrVar.equals(ekrpVar.c()) : ekrpVar.c() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ekrl ekrlVar = this.d;
        int hashCode = ekrlVar == null ? 0 : ekrlVar.hashCode();
        ekrh ekrhVar = this.e;
        int hashCode2 = ekrhVar == null ? 0 : ekrhVar.hashCode();
        int i = hashCode ^ 375623332;
        ffbr ffbrVar = this.f;
        return (((i * 1000003) ^ hashCode2) * 1000003) ^ (ffbrVar != null ? ffbrVar.hashCode() : 0);
    }

    public final String toString() {
        ffbr ffbrVar = this.f;
        ekrh ekrhVar = this.e;
        return "SyncletBinding{enabled=true, syncKey=" + String.valueOf(this.d) + ", syncConfig=" + String.valueOf(ekrhVar) + ", syncletProvider=" + String.valueOf(ffbrVar) + "}";
    }
}
