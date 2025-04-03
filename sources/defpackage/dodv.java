package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dodv implements dodz {
    public final doco a;
    public final boolean b;
    public final String c;
    public final int d;
    private final String e;
    private final String f;
    private final List g;
    private final ffix h;
    private final ffix i;

    public dodv(String str, String str2, doco docoVar, List list, int i, boolean z, ffix ffixVar, String str3) {
        this.e = str;
        this.f = str2;
        this.a = docoVar;
        this.g = list;
        this.d = i;
        this.b = z;
        this.h = ffixVar;
        this.c = str3;
        if (str == null && str2 == null && docoVar == null) {
            throw new IllegalStateException("One of title, description, or media must be provided.");
        }
        if (docoVar != null && str == null && str2 == null && list.isEmpty()) {
            throw new IllegalStateException("Horizontal rich card cannot only have an attachment.");
        }
        this.i = new ffix() { // from class: dodt
            @Override // defpackage.ffix
            public final Object invoke() {
                return false;
            }
        };
    }

    @Override // defpackage.dnoq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.i;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        return this.h;
    }

    @Override // defpackage.dnoq
    public final boolean d() {
        throw null;
    }

    @Override // defpackage.dodz
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dodv)) {
            return false;
        }
        dodv dodvVar = (dodv) obj;
        return ffkj.e(this.e, dodvVar.e) && ffkj.e(this.f, dodvVar.f) && ffkj.e(this.a, dodvVar.a) && ffkj.e(this.g, dodvVar.g) && this.d == dodvVar.d && this.b == dodvVar.b && ffkj.e(this.h, dodvVar.h) && ffkj.e(this.c, dodvVar.c);
    }

    @Override // defpackage.dodz
    public final String f() {
        return this.e;
    }

    @Override // defpackage.dodz
    public final List g() {
        return this.g;
    }

    public final int hashCode() {
        String str = this.e;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f;
        int hashCode2 = ((hashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31;
        doco docoVar = this.a;
        return ((((((((((hashCode2 + (docoVar != null ? docoVar.hashCode() : 0)) * 31) + this.g.hashCode()) * 31) + this.d) * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.h.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalRichCardUiData(title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", media=");
        sb.append(this.a);
        sb.append(", actions=");
        sb.append(this.g);
        sb.append(", alignment=");
        sb.append((Object) (this.d != 1 ? "End" : "Start"));
        sb.append(", isHighlighted=");
        sb.append(this.b);
        sb.append(", onLayout=");
        sb.append(this.h);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
