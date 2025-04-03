package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbyd extends dbye {
    private final String a;
    private final int b;
    private final String c;

    public dbyd(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // defpackage.dbye
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dbye
    public final String b() {
        return this.a;
    }

    @Override // defpackage.dbye
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dbye) {
            dbye dbyeVar = (dbye) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(dbyeVar.b()) : dbyeVar.b() == null) {
                if (this.b == dbyeVar.a() && ((str = this.c) != null ? str.equals(dbyeVar.c()) : dbyeVar.c() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        int i = this.b;
        String str2 = this.c;
        return ((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Detail{content=" + this.a + ", type=" + this.b + ", customLabel=" + this.c + "}";
    }
}
