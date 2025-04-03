package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ego implements ejv {
    private final ejq a;
    private final int b;
    public final eft f;

    public ego(eft eftVar, ejq ejqVar, int i) {
        this.f = eftVar;
        this.a = ejqVar;
        this.b = i;
    }

    public abstract egn a(int i, Object obj, int i2, int i3, List list, long j, int i4, int i5);

    @Override // defpackage.ejv
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final egn c(int i, int i2, int i3, long j) {
        return d(i, j, i2, i3, this.b);
    }

    public final egn d(int i, long j, int i2, int i3, int i4) {
        int c;
        eft eftVar = this.f;
        Object d = eftVar.d(i);
        eftVar.c(i);
        boolean k = jzk.k(j);
        List a = this.a.a(i, j);
        if (k) {
            c = jzk.d(j);
        } else {
            if (!jzk.j(j)) {
                dwv.c("does not have fixed height");
            }
            c = jzk.c(j);
        }
        return a(i, d, c, i4, a, j, i2, i3);
    }

    public final elp e() {
        return this.f.b;
    }
}
