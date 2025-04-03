package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnsl implements dnto {
    public final List a;
    public final dntn b;
    public final ffji c;
    public final ffji d;
    public final Long e;
    private final int f;

    public dnsl() {
        this(null, 0, null, null, null, 63);
    }

    @Override // defpackage.dnto
    public final dntn a() {
        return this.b;
    }

    @Override // defpackage.dnto
    public final List b() {
        return this.a;
    }

    @Override // defpackage.dnto
    public final int c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnsl)) {
            return false;
        }
        dnsl dnslVar = (dnsl) obj;
        return ffkj.e(this.a, dnslVar.a) && this.f == dnslVar.f && ffkj.e(this.b, dnslVar.b) && ffkj.e(this.c, dnslVar.c) && ffkj.e(this.d, dnslVar.d) && ffkj.e(this.e, dnslVar.e);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.f) * 31) + this.b.hashCode();
        ffji ffjiVar = this.c;
        int hashCode2 = ((hashCode * 31) + (ffjiVar == null ? 0 : ffjiVar.hashCode())) * 31;
        ffji ffjiVar2 = this.d;
        return ((hashCode2 + (ffjiVar2 != null ? ffjiVar2.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EagerMetatextUiData(metatextList=");
        sb.append(this.a);
        sb.append(", visibility=");
        int i = this.f;
        sb.append((Object) (i != 1 ? i != 2 ? "HIDDEN_BY_DEFAULT" : "SHOWN_BY_DEFAULT" : "ALWAYS_SHOWN"));
        sb.append(", flags=");
        sb.append(this.b);
        sb.append(", onClick=");
        sb.append(this.c);
        sb.append(", onPositionChangedAfterClick=");
        sb.append(this.d);
        sb.append(", durationOfPositionSubscriptionInMillis=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dnsl(List list, int i, dntn dntnVar, ffji ffjiVar, ffji ffjiVar2, int i2) {
        list = (i2 & 1) != 0 ? ffel.a : list;
        i = (i2 & 2) != 0 ? 3 : i;
        dntnVar = (i2 & 4) != 0 ? new dntn(false, false, false, 7) : dntnVar;
        ffjiVar = (i2 & 8) != 0 ? null : ffjiVar;
        ffjiVar2 = (i2 & 16) != 0 ? null : ffjiVar2;
        list.getClass();
        if (i == 0) {
            throw null;
        }
        dntnVar.getClass();
        this.a = list;
        this.f = i;
        this.b = dntnVar;
        this.c = ffjiVar;
        this.d = ffjiVar2;
        this.e = 1000L;
    }
}
