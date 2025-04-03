package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eflm extends eflw {
    public final String a;
    public final int b;

    public eflm(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.eflw
    public final int a() {
        return this.b;
    }

    @Override // defpackage.eflw
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eflw) {
            eflw eflwVar = (eflw) obj;
            if (this.a.equals(eflwVar.b()) && this.b == eflwVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "Body{text=" + this.a + ", charSet=" + this.b + "}";
    }
}
