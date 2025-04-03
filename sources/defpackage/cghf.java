package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cghf implements ffji {
    final /* synthetic */ int a;

    public cghf(int i) {
        this.a = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cghi cghiVar = (cghi) obj;
        cghiVar.getClass();
        cghh cghhVar = (cghh) cghiVar.toBuilder();
        cggw cggwVar = cghiVar.c;
        if (cggwVar == null) {
            cggwVar = cggw.a;
        }
        cggv cggvVar = (cggv) cggwVar.toBuilder();
        int i = this.a;
        cggvVar.copyOnWrite();
        cggw cggwVar2 = (cggw) cggvVar.instance;
        cggwVar2.b |= 1;
        cggwVar2.c = i;
        cggvVar.copyOnWrite();
        ((cggw) cggvVar.instance).d = false;
        cggw cggwVar3 = (cggw) cggvVar.build();
        cghhVar.copyOnWrite();
        cghi cghiVar2 = (cghi) cghhVar.instance;
        cggwVar3.getClass();
        cghiVar2.c = cggwVar3;
        cghiVar2.b |= 1;
        eyfy build = cghhVar.build();
        build.getClass();
        return (cghi) build;
    }
}
