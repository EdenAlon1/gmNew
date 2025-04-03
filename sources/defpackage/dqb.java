package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqb {
    public final long a;
    public final long b;
    public final boolean c = false;

    public dqb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final dqb a(dqb dqbVar) {
        return new dqb(iak.f(this.a, dqbVar.a), Math.max(this.b, dqbVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqb)) {
            return false;
        }
        dqb dqbVar = (dqb) obj;
        if (!iak.i(this.a, dqbVar.a) || this.b != dqbVar.b) {
            return false;
        }
        boolean z = dqbVar.c;
        return true;
    }

    public final int hashCode() {
        long j = this.b;
        return (((iaj.a(this.a) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + 1237;
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) iak.h(this.a)) + ", timeMillis=" + this.b + ", shouldApplyImmediately=false)";
    }
}
