package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvph extends dvpj {
    public final int a;
    public final int b;
    public final String c;
    public final long d;

    public dvph(int i, int i2, String str, long j) {
        this.a = i;
        this.b = i2;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.c = str;
        this.d = j;
    }

    @Override // defpackage.dvpj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dvpj
    public final int b() {
        return this.a;
    }

    @Override // defpackage.dvpj
    public final long c() {
        return this.d;
    }

    @Override // defpackage.dvpj
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvpj) {
            dvpj dvpjVar = (dvpj) obj;
            dvpjVar.e();
            if (this.a == dvpjVar.b() && this.b == dvpjVar.a() && this.c.equals(dvpjVar.d()) && this.d == dvpjVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a ^ (-721379959)) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ClearcutEventRecord{account=null, logSource=" + this.a + ", eventCode=" + this.b + ", packageName=" + this.c + ", timestampMs=" + this.d + "}";
    }

    @Override // defpackage.dvpj
    public final void e() {
    }
}
