package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtrc extends dtvj {
    public final String a;
    public final boolean b;
    public final dtui c;
    public final String d;

    public dtrc(String str, boolean z, dtui dtuiVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = dtuiVar;
        this.d = str2;
    }

    @Override // defpackage.dtvj
    public final dtui a() {
        return this.c;
    }

    @Override // defpackage.dtvj
    public final String b() {
        return this.d;
    }

    @Override // defpackage.dtvj
    public final String c() {
        return this.a;
    }

    @Override // defpackage.dtvj
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtvj) {
            dtvj dtvjVar = (dtvj) obj;
            if (this.a.equals(dtvjVar.c()) && this.b == dtvjVar.d() && this.c.equals(dtvjVar.a()) && ((str = this.d) != null ? str.equals(dtvjVar.b()) : dtvjVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
        String str = this.d;
        return (hashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DeleteParameters{tableName=" + this.a + ", exemptFromQueryPlanChecking=" + this.b + ", loggingTag=" + this.c.toString() + ", databaseName=" + this.d + "}";
    }
}
