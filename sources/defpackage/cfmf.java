package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfmf {
    public final String a;

    public cfmf(String str) {
        this.a = str;
    }

    public static final cfmf a(String str) {
        if (str != null) {
            return new cfmf(str);
        }
        return null;
    }

    public static final String b(cfmf cfmfVar) {
        if (cfmfVar != null) {
            return cfmfVar.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfmf) && ffkj.e(this.a, ((cfmf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EncryptionId(value=" + this.a + ")";
    }
}
