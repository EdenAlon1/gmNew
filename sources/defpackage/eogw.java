package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogw {
    public static final /* synthetic */ eojn a(eojk eojkVar) {
        eyfy build = eojkVar.build();
        build.getClass();
        return (eojn) build;
    }

    public static final void b(int i, eojk eojkVar) {
        eojkVar.copyOnWrite();
        eojn eojnVar = (eojn) eojkVar.instance;
        eojn eojnVar2 = eojn.a;
        eojnVar.c = i - 1;
        eojnVar.b |= 1;
    }

    public static final void c(int i, eojk eojkVar) {
        eojkVar.copyOnWrite();
        eojn eojnVar = (eojn) eojkVar.instance;
        eojn eojnVar2 = eojn.a;
        eojnVar.d = i - 1;
        eojnVar.b |= 2;
    }
}
