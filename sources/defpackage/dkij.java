package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkij extends dkie {
    private final Context i;
    private final dikt j;

    public dkij(djjr djjrVar, dkhc dkhcVar, dkii dkiiVar, dkur dkurVar, Context context, dikt diktVar) {
        super(djjrVar, dkhcVar, dkiiVar, dkurVar);
        this.i = context;
        this.j = diktVar;
    }

    private final void u(int i) {
        eyws eywsVar = (eyws) eywv.a.createBuilder();
        eywsVar.copyOnWrite();
        eywv eywvVar = (eywv) eywsVar.instance;
        eywvVar.e = 1;
        eywvVar.b = 1 | eywvVar.b;
        eywsVar.copyOnWrite();
        eywv eywvVar2 = (eywv) eywsVar.instance;
        eywvVar2.d = Integer.valueOf(i - 1);
        eywvVar2.c = 2;
        eywv eywvVar3 = (eywv) eywsVar.build();
        ezfn ezfnVar = (ezfn) ezfo.a.createBuilder();
        ezfnVar.copyOnWrite();
        ezfo ezfoVar = (ezfo) ezfnVar.instance;
        eywvVar3.getClass();
        ezfoVar.d = eywvVar3;
        ezfoVar.c = 14;
        this.j.i(this.i, ezfnVar, ezee.UNEXPECTED_EVENT);
    }

    @Override // defpackage.dkie
    public final void s(String str, long j, String str2) {
        u(3);
    }

    @Override // defpackage.dkie
    public final void t(String str) {
        u(2);
    }

    @Override // defpackage.dkgm
    public final void n() {
    }

    @Override // defpackage.dkgm
    public final void o() {
    }
}
