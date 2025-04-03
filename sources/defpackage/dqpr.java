package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqpr implements ffji {
    final /* synthetic */ String a;
    final /* synthetic */ dqph b;

    public dqpr(String str, dqph dqphVar) {
        this.a = str;
        this.b = dqphVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dqre dqreVar = (dqre) obj;
        dqreVar.getClass();
        dqrf dqrfVar = (dqrf) dqrg.a.createBuilder();
        dqrfVar.getClass();
        dqph dqphVar = this.b;
        dqnw dqnwVar = dqphVar.a;
        if (dqnwVar != null) {
            String name = dqnwVar.name();
            dqrfVar.copyOnWrite();
            dqrg dqrgVar = (dqrg) dqrfVar.instance;
            name.getClass();
            dqrgVar.b |= 1;
            dqrgVar.c = name;
        } else {
            dqrfVar.copyOnWrite();
            dqrg dqrgVar2 = (dqrg) dqrfVar.instance;
            dqrgVar2.b &= -2;
            dqrgVar2.c = dqrg.a.c;
        }
        dqnz dqnzVar = dqphVar.b;
        if (dqnzVar != null) {
            String name2 = dqnzVar.name();
            dqrfVar.copyOnWrite();
            dqrg dqrgVar3 = (dqrg) dqrfVar.instance;
            name2.getClass();
            dqrgVar3.b |= 2;
            dqrgVar3.d = name2;
        } else {
            dqrfVar.copyOnWrite();
            dqrg dqrgVar4 = (dqrg) dqrfVar.instance;
            dqrgVar4.b &= -3;
            dqrgVar4.d = dqrg.a.d;
        }
        eyfy build = dqrfVar.build();
        build.getClass();
        dqrg dqrgVar5 = (dqrg) build;
        dqreVar.copyOnWrite();
        dqrj dqrjVar = (dqrj) dqreVar.instance;
        dqrj dqrjVar2 = dqrj.a;
        eyhm eyhmVar = dqrjVar.c;
        if (!eyhmVar.b) {
            dqrjVar.c = eyhmVar.a();
        }
        dqrjVar.c.put(this.a, dqrgVar5);
        return ffcu.a;
    }
}
