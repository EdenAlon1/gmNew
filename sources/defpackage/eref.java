package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eref {
    public static final /* synthetic */ erdc a(erda erdaVar) {
        eyfy build = erdaVar.build();
        build.getClass();
        return (erdc) build;
    }

    public static final void b(int i, erda erdaVar) {
        erdaVar.copyOnWrite();
        erdc erdcVar = (erdc) erdaVar.instance;
        erdc erdcVar2 = erdc.a;
        erdcVar.b |= 2;
        erdcVar.d = i;
    }

    public static final void c(erda erdaVar) {
        erdaVar.copyOnWrite();
        erdc erdcVar = (erdc) erdaVar.instance;
        erdc erdcVar2 = erdc.a;
        erdcVar.c = 1;
        erdcVar.b = 1 | erdcVar.b;
    }
}
