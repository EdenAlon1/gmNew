package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cphw extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        esqf esqfVar = (esqf) obj;
        awuk awukVar = (awuk) awul.a.createBuilder();
        eyee b = esqfVar.b();
        awukVar.copyOnWrite();
        awul awulVar = (awul) awukVar.instance;
        awulVar.b |= 2;
        awulVar.d = b;
        awup awupVar = (awup) cpid.a.m().fP(esqfVar.a());
        awukVar.copyOnWrite();
        awul awulVar2 = (awul) awukVar.instance;
        awupVar.getClass();
        awulVar2.c = awupVar;
        awulVar2.b |= 1;
        return (awul) awukVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awul awulVar = (awul) obj;
        espn espnVar = new espn();
        if ((awulVar.b & 1) != 0) {
            emwd emwdVar = cpid.a;
            awup awupVar = awulVar.c;
            if (awupVar == null) {
                awupVar = awup.a;
            }
            espnVar.c((espr) emwdVar.fP(awupVar));
        }
        if ((awulVar.b & 2) != 0) {
            espnVar.b(awulVar.d);
        }
        return espnVar.a();
    }
}
