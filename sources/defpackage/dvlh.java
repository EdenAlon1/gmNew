package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvlh extends dvjq {
    @Override // defpackage.dvjq
    public final void a(exwt exwtVar, evwg evwgVar) {
        evyf evyfVar = (evyf) evyg.a.createBuilder();
        int i = exwtVar.d;
        evyfVar.copyOnWrite();
        evyg evygVar = (evyg) evyfVar.instance;
        evygVar.b |= 1;
        evygVar.c = i;
        int i2 = exwtVar.e;
        evyfVar.copyOnWrite();
        evyg evygVar2 = (evyg) evyfVar.instance;
        evygVar2.b |= 2;
        evygVar2.d = i2;
        evwgVar.copyOnWrite();
        evwh evwhVar = (evwh) evwgVar.instance;
        evyg evygVar3 = (evyg) evyfVar.build();
        evwh evwhVar2 = evwh.a;
        evygVar3.getClass();
        evwhVar.d = evygVar3;
        evwhVar.c = 2;
    }
}
