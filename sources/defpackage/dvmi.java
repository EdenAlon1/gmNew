package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvmi extends dvkj {
    static final emwl a = new dvmg();
    static final emwl b = new dvln();
    static final emwd c = new dvlr();

    @Override // defpackage.dvkj
    public final void a(exzb exzbVar, ewaf ewafVar) {
        exyv exyvVar = exzbVar.j;
        if (exyvVar == null) {
            exyvVar = exyv.a;
        }
        for (String str : exyvVar.b) {
            evyb evybVar = (evyb) evye.a.createBuilder();
            evso evsoVar = (evso) evsp.a.createBuilder();
            evsoVar.copyOnWrite();
            evsp evspVar = (evsp) evsoVar.instance;
            str.getClass();
            evspVar.c = 4;
            evspVar.d = str;
            evybVar.copyOnWrite();
            evye evyeVar = (evye) evybVar.instance;
            evsp evspVar2 = (evsp) evsoVar.build();
            evspVar2.getClass();
            evyeVar.c = evspVar2;
            evyeVar.b |= 1;
            evybVar.copyOnWrite();
            evye evyeVar2 = (evye) evybVar.instance;
            evyeVar2.d = 2;
            evyeVar2.b |= 2;
            ewafVar.a(evybVar);
        }
        exyv exyvVar2 = exzbVar.j;
        if (exyvVar2 == null) {
            exyvVar2 = exyv.a;
        }
        for (String str2 : exyvVar2.c) {
            evyb evybVar2 = (evyb) evye.a.createBuilder();
            evso evsoVar2 = (evso) evsp.a.createBuilder();
            evsoVar2.copyOnWrite();
            evsp evspVar3 = (evsp) evsoVar2.instance;
            str2.getClass();
            evspVar3.c = 4;
            evspVar3.d = str2;
            evybVar2.copyOnWrite();
            evye evyeVar3 = (evye) evybVar2.instance;
            evsp evspVar4 = (evsp) evsoVar2.build();
            evspVar4.getClass();
            evyeVar3.c = evspVar4;
            evyeVar3.b |= 1;
            evybVar2.copyOnWrite();
            evye evyeVar4 = (evye) evybVar2.instance;
            evyeVar4.d = 1;
            evyeVar4.b |= 2;
            ewafVar.a(evybVar2);
        }
    }

    @Override // defpackage.dvkj
    public final void b(exzb exzbVar, ewaf ewafVar) {
        evyo evyoVar = (evyo) evyp.a.createBuilder();
        emwl emwlVar = b;
        exyr b2 = exyr.b(exzbVar.c);
        if (b2 == null) {
            b2 = exyr.CONNECTIVITY_STATE_UNSPECIFIED;
        }
        Object apply = emwlVar.apply(b2);
        evyoVar.copyOnWrite();
        evyp evypVar = (evyp) evyoVar.instance;
        evypVar.c = ((evsy) apply).a();
        evypVar.b |= 1;
        ewafVar.copyOnWrite();
        ewag ewagVar = (ewag) ewafVar.instance;
        evyp evypVar2 = (evyp) evyoVar.build();
        ewag ewagVar2 = ewag.a;
        evypVar2.getClass();
        ewagVar.c = evypVar2;
        ewagVar.b |= 1;
    }
}
