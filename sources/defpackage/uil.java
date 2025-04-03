package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uil {
    public static final epsw a(dpgo dpgoVar, int i) {
        epso epsoVar = (epso) epsw.a.createBuilder();
        epsoVar.copyOnWrite();
        epsw epswVar = (epsw) epsoVar.instance;
        epswVar.c = i - 1;
        epswVar.b |= 1;
        int i2 = dpgoVar.e - 1;
        int i3 = 3;
        int i4 = i2 != 1 ? i2 != 2 ? 1 : 2 : 3;
        epsoVar.copyOnWrite();
        epsw epswVar2 = (epsw) epsoVar.instance;
        epswVar2.d = i4 - 1;
        epswVar2.b |= 2;
        int i5 = dpgoVar.f - 1;
        int i6 = i5 != 1 ? i5 != 2 ? 1 : 3 : 2;
        epsoVar.copyOnWrite();
        epsw epswVar3 = (epsw) epsoVar.instance;
        epswVar3.e = i6 - 1;
        epswVar3.b |= 4;
        boolean z = dpgoVar.b;
        epsoVar.copyOnWrite();
        epsw epswVar4 = (epsw) epsoVar.instance;
        epswVar4.b |= 8;
        epswVar4.f = z;
        int ordinal = dpgoVar.a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i3 = 2;
            } else {
                if (ordinal != 2) {
                    throw new ffcd();
                }
                i3 = 5;
            }
        }
        epsoVar.copyOnWrite();
        epsw epswVar5 = (epsw) epsoVar.instance;
        epswVar5.i = i3 - 1;
        epswVar5.b |= 64;
        eyfy build = epsoVar.build();
        build.getClass();
        return (epsw) build;
    }
}
