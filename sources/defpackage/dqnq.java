package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqnq extends dqns {
    public final CharSequence a;
    public final Set b;
    private final ffbz e;

    public dqnq(CharSequence charSequence, Set set) {
        set.getClass();
        this.a = charSequence;
        this.b = set;
        this.e = ffca.a(new ffix() { // from class: dqnp
            @Override // defpackage.ffix
            public final Object invoke() {
                dqnq dqnqVar = dqnq.this;
                if (dqnqVar.b.isEmpty()) {
                    return dqnqVar.a;
                }
                dqqm dqqmVar = dqqn.a;
                StringBuilder sb = dqqn.a.get();
                sb.append(((dqnw) ffdx.J(dqnqVar.b)).f.a());
                sb.append(dqof.c.a());
                sb.append(dqnqVar.a);
                sb.append(dqof.d.a());
                return sb.toString();
            }
        });
    }

    @Override // defpackage.dqof
    public final CharSequence a() {
        return (CharSequence) this.e.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqnq)) {
            return false;
        }
        dqnq dqnqVar = (dqnq) obj;
        return ffkj.e(this.a, dqnqVar.a) && ffkj.e(this.b, dqnqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PersonComposed(plainLiteral=" + ((Object) this.a) + ", supportedGenders=" + this.b + ")";
    }
}
