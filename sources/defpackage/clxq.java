package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clxq extends cmek {
    private final String a;
    private final ezck b;

    public clxq(String str, ezck ezckVar) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.a = str;
        if (ezckVar == null) {
            throw new NullPointerException("Null msisdnSource");
        }
        this.b = ezckVar;
    }

    @Override // defpackage.cmek
    public final ezck a() {
        return this.b;
    }

    @Override // defpackage.cmek
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmek) {
            cmek cmekVar = (cmek) obj;
            if (this.a.equals(cmekVar.b()) && this.b.equals(cmekVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
