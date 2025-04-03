package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxxy extends cxyh {
    public final String a;
    public final boolean b;

    public cxxy(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.cxyh
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cxyh
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxyh) {
            cxyh cxyhVar = (cxyh) obj;
            if (this.a.equals(cxyhVar.a()) && this.b == cxyhVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "EnabledState{key=" + this.a + ", enabled=" + this.b + "}";
    }
}
