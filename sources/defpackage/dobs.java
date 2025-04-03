package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobs implements dnoq {
    public final List a;
    public final dobr b;
    public final boolean c;
    public final ffix d;
    public final ffix e;
    public final String f;
    public final int g;

    public dobs(List list, int i, dobr dobrVar, boolean z, ffix ffixVar, ffix ffixVar2, String str) {
        this.a = list;
        this.g = i;
        this.b = dobrVar;
        this.c = z;
        this.d = ffixVar;
        this.e = ffixVar2;
        this.f = str;
    }

    @Override // defpackage.dnoq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.d;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dobs)) {
            return false;
        }
        dobs dobsVar = (dobs) obj;
        return ffkj.e(this.a, dobsVar.a) && this.g == dobsVar.g && ffkj.e(this.b, dobsVar.b) && this.c == dobsVar.c && ffkj.e(this.d, dobsVar.d) && ffkj.e(this.e, dobsVar.e) && ffkj.e(this.f, dobsVar.f);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.g) * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RichCardCarouselUiData(cards=");
        sb.append(this.a);
        sb.append(", cardWidth=");
        int i = this.g;
        sb.append((Object) (i != 120 ? i != 232 ? "null" : "Medium" : "Small"));
        sb.append(", sizeConfigurations=");
        sb.append(this.b);
        sb.append(", isHighlighted=");
        sb.append(this.c);
        sb.append(", onClick=");
        sb.append(this.d);
        sb.append(", onLayout=");
        sb.append(this.e);
        sb.append(", contentDescription=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
