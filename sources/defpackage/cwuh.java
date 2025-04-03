package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwuh extends cxet {
    private final String a;
    private final aoku b;
    private final String c;
    private final int d;
    private final int e;

    public cwuh(String str, aoku aokuVar, String str2, int i, int i2) {
        this.a = str;
        this.b = aokuVar;
        this.c = str2;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.cxet
    public final int a() {
        return this.e;
    }

    @Override // defpackage.cxet
    public final int b() {
        return this.d;
    }

    @Override // defpackage.cxet
    public final aoku c() {
        return this.b;
    }

    @Override // defpackage.cxet
    public final String d() {
        return this.a;
    }

    @Override // defpackage.cxet
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxet) {
            cxet cxetVar = (cxet) obj;
            String str = this.a;
            if (str != null ? str.equals(cxetVar.d()) : cxetVar.d() == null) {
                aoku aokuVar = this.b;
                if (aokuVar != null ? aokuVar.equals(cxetVar.c()) : cxetVar.c() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(cxetVar.e()) : cxetVar.e() == null) {
                        if (this.d == cxetVar.b() && this.e == cxetVar.a()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        aoku aokuVar = this.b;
        int hashCode2 = aokuVar == null ? 0 : aokuVar.hashCode();
        int i = hashCode ^ 1000003;
        String str2 = this.c;
        return (((((((i * 1000003) ^ hashCode2) * 1000003) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "SimMessagesData{message=" + this.a + ", sender=" + String.valueOf(this.b) + ", timestampText=" + this.c + ", index=" + this.d + ", id=" + this.e + "}";
    }
}
