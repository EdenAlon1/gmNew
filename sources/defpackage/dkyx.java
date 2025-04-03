package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkyx {
    public final etga a;
    private final String b = null;

    public dkyx(etga etgaVar) {
        this.a = etgaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkyx)) {
            return false;
        }
        dkyx dkyxVar = (dkyx) obj;
        if (!ffkj.e(this.a, dkyxVar.a)) {
            return false;
        }
        String str = dkyxVar.b;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ProtectionEncryptionKey{ vm_owner=null }";
    }
}
