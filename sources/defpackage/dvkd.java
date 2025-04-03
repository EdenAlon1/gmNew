package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvkd extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evtn evtnVar = (evtn) obj;
        exvz exvzVar = (exvz) exwa.a.createBuilder();
        if ((evtnVar.b & 1) != 0) {
            String str = evtnVar.c;
            exvzVar.copyOnWrite();
            exwa exwaVar = (exwa) exvzVar.instance;
            str.getClass();
            exwaVar.b |= 1;
            exwaVar.c = str;
        }
        if ((evtnVar.b & 2) != 0) {
            long j = evtnVar.d;
            exvzVar.copyOnWrite();
            exwa exwaVar2 = (exwa) exvzVar.instance;
            exwaVar2.b |= 2;
            exwaVar2.d = j;
        }
        if ((evtnVar.b & 4) != 0) {
            long j2 = evtnVar.e;
            exvzVar.copyOnWrite();
            exwa exwaVar3 = (exwa) exvzVar.instance;
            exwaVar3.b |= 4;
            exwaVar3.e = j2;
        }
        if ((evtnVar.b & 8) != 0) {
            eyee eyeeVar = evtnVar.f;
            exvzVar.copyOnWrite();
            exwa exwaVar4 = (exwa) exvzVar.instance;
            eyeeVar.getClass();
            exwaVar4.b |= 8;
            exwaVar4.f = eyeeVar;
        }
        return (exwa) exvzVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        exwa exwaVar = (exwa) obj;
        evtm evtmVar = (evtm) evtn.a.createBuilder();
        if ((exwaVar.b & 1) != 0) {
            String str = exwaVar.c;
            evtmVar.copyOnWrite();
            evtn evtnVar = (evtn) evtmVar.instance;
            str.getClass();
            evtnVar.b |= 1;
            evtnVar.c = str;
        }
        if ((exwaVar.b & 2) != 0) {
            long j = exwaVar.d;
            evtmVar.copyOnWrite();
            evtn evtnVar2 = (evtn) evtmVar.instance;
            evtnVar2.b |= 2;
            evtnVar2.d = j;
        }
        if ((exwaVar.b & 4) != 0) {
            long j2 = exwaVar.e;
            evtmVar.copyOnWrite();
            evtn evtnVar3 = (evtn) evtmVar.instance;
            evtnVar3.b |= 4;
            evtnVar3.e = j2;
        }
        if ((exwaVar.b & 8) != 0) {
            eyee eyeeVar = exwaVar.f;
            evtmVar.copyOnWrite();
            evtn evtnVar4 = (evtn) evtmVar.instance;
            eyeeVar.getClass();
            evtnVar4.b |= 8;
            evtnVar4.f = eyeeVar;
        }
        return (evtn) evtmVar.build();
    }
}
