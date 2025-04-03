package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfq extends acfs {
    public final String a;
    public final String b;

    public acfq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.acfs
    public final String a() {
        return this.a;
    }

    @Override // defpackage.acfs
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acfs) {
            acfs acfsVar = (acfs) obj;
            if (this.a.equals(acfsVar.a()) && this.b.equals(acfsVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GServicesPhenotypeScenarioOptions{bugleGservices=" + this.a + ", phenotypeValues=" + this.b + "}";
    }
}
