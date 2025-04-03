package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cetm extends ceyr {
    public final String a;
    public final eyhs b;
    public final cfkl c;
    private final cqor d;

    public cetm(String str, eyhs eyhsVar, cfkl cfklVar, cqor cqorVar) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.a = str;
        if (eyhsVar == null) {
            throw new NullPointerException("Null rawData");
        }
        this.b = eyhsVar;
        this.c = cfklVar;
        this.d = cqorVar;
    }

    @Override // defpackage.ceyr
    public final cfkl a() {
        return this.c;
    }

    @Override // defpackage.ceyr
    public final cqor b() {
        return this.d;
    }

    @Override // defpackage.ceyr
    public final eyhs c() {
        return this.b;
    }

    @Override // defpackage.ceyr
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ceyr) {
            ceyr ceyrVar = (ceyr) obj;
            if (this.a.equals(ceyrVar.d()) && this.b.equals(ceyrVar.c()) && this.c.equals(ceyrVar.a()) && this.d.equals(ceyrVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        cqor cqorVar = this.d;
        cfkl cfklVar = this.c;
        return "WorkQueueRequest{key=" + this.a + ", rawData=" + this.b.toString() + ", extras=" + cfklVar.toString() + ", traceSpanSupplier=" + cqorVar.toString() + "}";
    }
}
