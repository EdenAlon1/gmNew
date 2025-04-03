package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqqh extends dqqj {
    public final dqns a;

    public dqqh(dqns dqnsVar) {
        this.a = dqnsVar;
    }

    @Override // defpackage.dqqj
    public final dqns a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqqh) && ffkj.e(this.a, ((dqqh) obj).a);
    }

    @Override // defpackage.dqqj
    public final Set f() {
        return ffen.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SingleEmoji(base=" + this.a + ")";
    }
}
