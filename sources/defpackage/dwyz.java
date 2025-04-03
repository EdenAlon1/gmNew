package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dwyz extends dxaa {
    public final String a;
    public final String b;

    public dwyz(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null action");
        }
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.dxaa
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dxaa
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxaa) {
            dxaa dxaaVar = (dxaa) obj;
            if (this.a.equals(dxaaVar.a()) && ((str = this.b) != null ? str.equals(dxaaVar.b()) : dxaaVar.b() == null)) {
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
        return "ActionInfo{action=" + this.a + ", tag=" + this.b + "}";
    }
}
