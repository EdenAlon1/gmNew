package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lqn {
    public static final lqn a = new lqn(new lqm());
    public final long b;
    public final long c;
    public final long d = Long.MIN_VALUE;
    public final boolean e = false;
    public final boolean f = false;
    public final boolean g = false;

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
        lvf.N(5);
        lvf.N(6);
    }

    public lqn(lqm lqmVar) {
        this.b = lvf.z(lqmVar.a);
        this.c = lqmVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqn)) {
            return false;
        }
        lqn lqnVar = (lqn) obj;
        if (this.c != lqnVar.c) {
            return false;
        }
        long j = lqnVar.d;
        boolean z = lqnVar.e;
        boolean z2 = lqnVar.f;
        boolean z3 = lqnVar.g;
        return true;
    }

    public final int hashCode() {
        long j = this.c;
        return ((((int) (j ^ (j >>> 32))) * 31) + ((int) (-9223372034707292160L))) * 29791;
    }
}
