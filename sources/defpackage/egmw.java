package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egmw extends egnm {
    private final egnl a;
    private final boolean b;
    private final engw c;

    public egmw(egnl egnlVar, boolean z, engw engwVar) {
        this.a = egnlVar;
        this.b = z;
        this.c = engwVar;
    }

    @Override // defpackage.egnm
    public final egnl a() {
        return this.a;
    }

    @Override // defpackage.egnm
    public final engw b() {
        return this.c;
    }

    @Override // defpackage.egnm
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egnm) {
            egnm egnmVar = (egnm) obj;
            if (this.a.equals(egnmVar.a()) && this.b == egnmVar.c() && enkr.h(this.c, egnmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        engw engwVar = this.c;
        return "GooglePhotosSection{content=" + this.a.toString() + ", hasMore=" + this.b + ", eventLogs=" + engwVar.toString() + "}";
    }
}
