package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmfu implements dnoq {
    public final String a;
    public final ffix b;
    public final boolean c;
    private final ffix d;
    private final String e;

    public dmfu(String str, ffix ffixVar, ffix ffixVar2, String str2, boolean z) {
        this.a = str;
        this.b = ffixVar;
        this.d = ffixVar2;
        this.e = str2;
        this.c = z;
    }

    @Override // defpackage.dnoq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.b;
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
        if (!(obj instanceof dmfu)) {
            return false;
        }
        dmfu dmfuVar = (dmfu) obj;
        return ffkj.e(this.a, dmfuVar.a) && ffkj.e(this.b, dmfuVar.b) && ffkj.e(this.d, dmfuVar.d) && ffkj.e(this.e, dmfuVar.e) && this.c == dmfuVar.c;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "BreadcrumbBubbleUiData(text=" + this.a + ", onClick=" + this.b + ", onLayout=" + this.d + ", contentDescription=" + this.e + ", isHighlighted=" + this.c + ")";
    }
}
