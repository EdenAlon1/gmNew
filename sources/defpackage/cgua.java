package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgua extends cgue {
    public final ewgz a;
    private final String b;

    public cgua(String str, ewgz ewgzVar) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.b = str;
        if (ewgzVar == null) {
            throw new NullPointerException("Null configurationType");
        }
        this.a = ewgzVar;
    }

    @Override // defpackage.cgue
    public final ewgz a() {
        return this.a;
    }

    @Override // defpackage.cgue
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgue) {
            cgue cgueVar = (cgue) obj;
            if (this.b.equals(cgueVar.b()) && this.a.equals(cgueVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "MobileConfigurationId{simId=" + this.b + ", configurationType=" + this.a.toString() + "}";
    }
}
