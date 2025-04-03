package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkir implements dkif {
    private final dkii a;
    private final dikt b;

    public dkir(dkii dkiiVar, dikt diktVar) {
        this.a = dkiiVar;
        this.b = diktVar;
    }

    @Override // defpackage.dkif
    public final dkie a(djjr djjrVar, dkhc dkhcVar, dkur dkurVar, djtp djtpVar, dkls dklsVar, Context context) {
        return new dkij(djjrVar, dkhcVar, this.a, dkurVar, context, this.b);
    }
}
