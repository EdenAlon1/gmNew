package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deth extends detm {
    public final detl a;
    public final String b;

    public deth(detl detlVar, String str) {
        if (detlVar == null) {
            throw new NullPointerException("Null state");
        }
        this.a = detlVar;
        this.b = str;
    }

    @Override // defpackage.detm
    public final detl a() {
        return this.a;
    }

    @Override // defpackage.detm
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof detm) {
            detm detmVar = (detm) obj;
            if (this.a.equals(detmVar.a()) && ((str = this.b) != null ? str.equals(detmVar.b()) : detmVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (hashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "EffectLoadingState{state=" + this.a.toString() + ", errorString=" + this.b + "}";
    }
}
