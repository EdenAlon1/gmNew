package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class csxb extends csxq {
    private final String a;

    public csxb(String str) {
        if (str == null) {
            throw new NullPointerException("Null status");
        }
        this.a = str;
    }

    @Override // defpackage.csxq
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csxq) {
            return this.a.equals(((csxq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TenorRegisterShareResponse{status=" + this.a + "}";
    }
}
