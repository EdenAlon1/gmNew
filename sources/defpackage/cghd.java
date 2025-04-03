package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cghd implements ffji {
    public static final cghd a = new cghd();

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
        cggvVar.copyOnWrite();
        ((cggw) cggvVar.instance).d = true;
        cggw cggwVar2 = (cggw) cggvVar.build();
        cghhVar.copyOnWrite();
        cghi cghiVar2 = (cghi) cghhVar.instance;
        cggwVar2.getClass();
        cghiVar2.c = cggwVar2;
        cghiVar2.b |= 1;
        eyfy build = cghhVar.build();
        build.getClass();
        return (cghi) build;
    }
}
