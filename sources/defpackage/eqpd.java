package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqpd {
    public static final /* synthetic */ eqpc a(eqpb eqpbVar) {
        eyfy build = eqpbVar.build();
        build.getClass();
        return (eqpc) build;
    }

    public static final void b(boolean z, eqpb eqpbVar) {
        eqpbVar.copyOnWrite();
        eqpc eqpcVar = (eqpc) eqpbVar.instance;
        eqpc eqpcVar2 = eqpc.a;
        eqpcVar.b |= 2;
        eqpcVar.d = z;
    }

    public static final void c(boolean z, eqpb eqpbVar) {
        eqpbVar.copyOnWrite();
        eqpc eqpcVar = (eqpc) eqpbVar.instance;
        eqpc eqpcVar2 = eqpc.a;
        eqpcVar.b |= 8;
        eqpcVar.f = z;
    }

    public static final void d(boolean z, eqpb eqpbVar) {
        eqpbVar.copyOnWrite();
        eqpc eqpcVar = (eqpc) eqpbVar.instance;
        eqpc eqpcVar2 = eqpc.a;
        eqpcVar.b |= 4;
        eqpcVar.e = z;
    }

    public static final void e(String str, eqpb eqpbVar) {
        str.getClass();
        eqpbVar.copyOnWrite();
        eqpc eqpcVar = (eqpc) eqpbVar.instance;
        eqpc eqpcVar2 = eqpc.a;
        eqpcVar.b |= 1;
        eqpcVar.c = str;
    }
}
