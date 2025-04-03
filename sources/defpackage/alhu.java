package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alhu {
    public static epzq a(int i, int i2, eprl eprlVar, boolean z) {
        epzo epzoVar = (epzo) epzq.a.createBuilder();
        epzoVar.copyOnWrite();
        epzq epzqVar = (epzq) epzoVar.instance;
        epzqVar.b |= 1;
        epzqVar.c = i;
        epzoVar.copyOnWrite();
        epzq epzqVar2 = (epzq) epzoVar.instance;
        epzqVar2.d = i2 - 1;
        epzqVar2.b |= 2;
        epzoVar.copyOnWrite();
        epzq epzqVar3 = (epzq) epzoVar.instance;
        eprlVar.getClass();
        epzqVar3.e = eprlVar;
        epzqVar3.b |= 4;
        epzoVar.copyOnWrite();
        epzq epzqVar4 = (epzq) epzoVar.instance;
        epzqVar4.b |= 8;
        epzqVar4.f = z;
        return (epzq) epzoVar.build();
    }
}
