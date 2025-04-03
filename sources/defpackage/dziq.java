package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dziq extends dzpn {
    private static final long serialVersionUID = 0;
    public final String a;
    public final String b;

    public dziq(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null appName");
        }
        this.b = str2;
    }

    @Override // defpackage.dzpn
    public final String a() {
        return this.b;
    }

    @Override // defpackage.dzpn
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzpn) {
            dzpn dzpnVar = (dzpn) obj;
            if (this.a.equals(dzpnVar.b()) && this.b.equals(dzpnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GroupId{id=" + this.a + ", appName=" + this.b + "}";
    }
}
