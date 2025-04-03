package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnzy implements dnzz {
    public final Float a;
    public final ffix b;
    private final boolean c;
    private final ffix d;
    private final ffix e;
    private final String f;

    public dnzy(Float f, ffix ffixVar, boolean z, ffix ffixVar2, ffix ffixVar3, String str) {
        this.a = f;
        this.b = ffixVar;
        this.c = z;
        this.d = ffixVar2;
        this.e = ffixVar3;
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
        return this.e;
    }

    @Override // defpackage.dnoq
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnzy)) {
            return false;
        }
        dnzy dnzyVar = (dnzy) obj;
        return ffkj.e(this.a, dnzyVar.a) && ffkj.e(this.b, dnzyVar.b) && this.c == dnzyVar.c && ffkj.e(this.d, dnzyVar.d) && ffkj.e(this.e, dnzyVar.e) && ffkj.e(this.f, dnzyVar.f);
    }

    public final int hashCode() {
        Float f = this.a;
        return ((((((((((f == null ? 0 : f.hashCode()) * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Transferring(progressPercentage=" + this.a + ", onCancelButtonClicked=" + this.b + ", isHighlighted=" + this.c + ", onClick=" + this.d + ", onLayout=" + this.e + ", contentDescription=" + this.f + ")";
    }
}
