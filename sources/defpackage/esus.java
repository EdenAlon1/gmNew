package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esus {
    public final Iterable a;
    public final Iterable b;
    private final eyee c;
    private final fcfa d;
    private final long e;

    public esus(eyee eyeeVar, fcfa fcfaVar, long j, Iterable iterable, Iterable iterable2) {
        this.c = eyeeVar;
        this.d = fcfaVar;
        this.e = j;
        this.a = iterable;
        this.b = iterable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esus)) {
            return false;
        }
        esus esusVar = (esus) obj;
        return ffkj.e(this.c, esusVar.c) && ffkj.e(this.d, esusVar.d) && this.e == esusVar.e && ffkj.e(this.a, esusVar.a) && ffkj.e(this.b, esusVar.b);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        long j = this.e;
        return (((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DeviceRegistration(registrationId=" + this.c + ", identityKey=" + this.d + ", registrationHash=" + this.e + ", capabilities=" + this.a + ", features=" + this.b + ")";
    }
}
