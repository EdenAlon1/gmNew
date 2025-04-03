package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eidj extends eidt {
    private final String a;
    private final String b;
    private final String c;

    public eidj(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.eidt
    public final String a() {
        return this.b;
    }

    @Override // defpackage.eidt
    public final String b() {
        return this.a;
    }

    @Override // defpackage.eidt
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eidt) {
            eidt eidtVar = (eidt) obj;
            if (this.a.equals(eidtVar.b()) && this.b.equals(eidtVar.a()) && this.c.equals(eidtVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CpimMessageHeader{namespace=" + this.a + ", name=" + this.b + ", value=" + this.c + "}";
    }
}
