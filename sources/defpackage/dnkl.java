package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnkl implements dndt {
    public final String a;
    public final List b;

    public dnkl(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnkl)) {
            return false;
        }
        dnkl dnklVar = (dnkl) obj;
        return ffkj.e(this.a, dnklVar.a) && ffkj.e(this.b, dnklVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SimSwitcherUiData(selectedId=" + this.a + ", items=" + this.b + ")";
    }
}
