package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edqs extends edrs {
    public final String a;
    public final List b;
    public final dhqd c;

    public edqs(String str, List list, dhqd dhqdVar) {
        this.a = str;
        this.b = list;
        this.c = dhqdVar;
    }

    @Override // defpackage.edrs, defpackage.edkr
    public final dhqd a() {
        return this.c;
    }

    @Override // defpackage.edrs
    public final String b() {
        return this.a;
    }

    @Override // defpackage.edrs
    public final List c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edrs) {
            edrs edrsVar = (edrs) obj;
            if (this.a.equals(edrsVar.b()) && this.b.equals(edrsVar.c())) {
                edrsVar.e();
                dhqd dhqdVar = this.c;
                if (dhqdVar != null ? dhqdVar.equals(edrsVar.a()) : edrsVar.a() == null) {
                    edrsVar.d();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        dhqd dhqdVar = this.c;
        return ((hashCode * (-721379959)) ^ (dhqdVar == null ? 0 : dhqdVar.hashCode())) * 1000003;
    }

    public final String toString() {
        dhqd dhqdVar = this.c;
        return "FetchPlaceRequest{placeId=" + this.a + ", placeFields=" + this.b.toString() + ", sessionToken=null, cancellationToken=" + String.valueOf(dhqdVar) + ", regionCode=null}";
    }

    @Override // defpackage.edrs
    public final void d() {
    }

    @Override // defpackage.edrs
    public final void e() {
    }
}
