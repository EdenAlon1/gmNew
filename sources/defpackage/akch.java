package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akch {
    public static final /* synthetic */ akcg a(akcf akcfVar) {
        eyfy build = akcfVar.build();
        build.getClass();
        return (akcg) build;
    }

    public static final void b(akcb akcbVar, akcf akcfVar) {
        akcfVar.copyOnWrite();
        akcg akcgVar = (akcg) akcfVar.instance;
        akcg akcgVar2 = akcg.a;
        akcgVar.d = akcbVar;
        akcgVar.c = 3;
    }

    public static final void c(akcd akcdVar, akcf akcfVar) {
        akcfVar.copyOnWrite();
        akcg akcgVar = (akcg) akcfVar.instance;
        akcg akcgVar2 = akcg.a;
        akcgVar.d = akcdVar;
        akcgVar.c = 2;
    }

    public static final void d(String str, akcf akcfVar) {
        str.getClass();
        akcfVar.copyOnWrite();
        akcg akcgVar = (akcg) akcfVar.instance;
        akcg akcgVar2 = akcg.a;
        akcgVar.b |= 1;
        akcgVar.e = str;
    }
}
