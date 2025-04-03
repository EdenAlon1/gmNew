package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvdk extends dvdq {
    private final int a;
    private final evzm b;

    public dvdk(int i, evzm evzmVar) {
        this.a = i;
        this.b = evzmVar;
    }

    @Override // defpackage.dvdq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dvdq
    public final evzm b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvdq) {
            dvdq dvdqVar = (dvdq) obj;
            if (this.a == dvdqVar.a() && this.b.equals(dvdqVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PromoDisplayContext{screenOrientation=" + this.a + ", theme=" + this.b.toString() + "}";
    }
}
