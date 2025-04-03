package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpag extends cpat {
    private final Object a;
    private final cpas b;

    public cpag(Object obj, cpas cpasVar) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.a = obj;
        if (cpasVar == null) {
            throw new NullPointerException("Null carrierConfigSource");
        }
        this.b = cpasVar;
    }

    @Override // defpackage.cpat
    public final cpas a() {
        return this.b;
    }

    @Override // defpackage.cpat
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpat) {
            cpat cpatVar = (cpat) obj;
            if (this.a.equals(cpatVar.b()) && this.b.equals(cpatVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        cpas cpasVar = this.b;
        return "CarrierConfigValueInfo{value=" + this.a.toString() + ", carrierConfigSource=" + cpasVar.toString() + "}";
    }
}
