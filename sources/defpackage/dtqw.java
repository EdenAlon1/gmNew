package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtqw extends dttw {
    private final String a = "$primary";
    private final String b;
    private final String c;

    public dtqw(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.dttw
    public final String a() {
        return this.b;
    }

    @Override // defpackage.dttw
    public final String b() {
        return this.a;
    }

    @Override // defpackage.dttw
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dttw) {
            dttw dttwVar = (dttw) obj;
            if (this.a.equals(dttwVar.b()) && this.b.equals(dttwVar.a()) && this.c.equals(dttwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConditionalIndexData{databaseHandle=" + this.a + ", conditionName=" + this.b + ", indexCreationSql=" + this.c + "}";
    }
}
