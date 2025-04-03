package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axxe {
    public final String a;
    public final String b;
    private final long c;

    public axxe(long j, String str, String str2) {
        this.c = j;
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axxe)) {
            return false;
        }
        axxe axxeVar = (axxe) obj;
        return this.c == axxeVar.c && ffkj.e(this.a, axxeVar.a) && ffkj.e(this.b, axxeVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.c;
        String str2 = this.b;
        return (((((int) (j ^ (j >>> 32))) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "RawContactEvents(contactId=" + this.c + ", birthday=" + this.a + ", anniversary=" + this.b + ")";
    }
}
