package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edrn extends edsp {
    private final List a;
    private final List b;

    public edrn(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.edsp
    public final List a() {
        return this.a;
    }

    @Override // defpackage.edsp
    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof edsp) {
            edsp edspVar = (edsp) obj;
            if (this.a.equals(edspVar.a()) && ((list = this.b) != null ? list.equals(edspVar.b()) : edspVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        List list = this.b;
        return (hashCode * 1000003) ^ (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        List list = this.b;
        return "SearchNearbyResponse{places=" + this.a.toString() + ", routingSummaries=" + String.valueOf(list) + "}";
    }
}
