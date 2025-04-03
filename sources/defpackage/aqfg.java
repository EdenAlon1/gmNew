package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqfg {
    public static final eqkt a(int i, int i2) {
        eqkr eqkrVar = (eqkr) eqkt.a.createBuilder();
        eqkrVar.getClass();
        int i3 = i2 - 1;
        if (i3 == 1) {
            eqkrVar.copyOnWrite();
            eqkt eqktVar = (eqkt) eqkrVar.instance;
            eqktVar.c = 1;
            eqktVar.b |= 1;
        } else if (i3 == 2) {
            eqkrVar.copyOnWrite();
            eqkt eqktVar2 = (eqkt) eqkrVar.instance;
            eqktVar2.c = 2;
            eqktVar2.b |= 1;
        } else if (i3 != 3) {
            eqkrVar.copyOnWrite();
            eqkt eqktVar3 = (eqkt) eqkrVar.instance;
            eqktVar3.c = 4;
            eqktVar3.b |= 1;
        } else {
            eqkrVar.copyOnWrite();
            eqkt eqktVar4 = (eqkt) eqkrVar.instance;
            eqktVar4.c = 3;
            eqktVar4.b |= 1;
        }
        int i4 = i - 1;
        if (i4 == 1) {
            eqkrVar.copyOnWrite();
            eqkt eqktVar5 = (eqkt) eqkrVar.instance;
            eqktVar5.d = 1;
            eqktVar5.b |= 2;
        } else if (i4 == 2) {
            eqkrVar.copyOnWrite();
            eqkt eqktVar6 = (eqkt) eqkrVar.instance;
            eqktVar6.d = 2;
            eqktVar6.b |= 2;
        } else if (i4 != 3) {
            eqkrVar.copyOnWrite();
            eqkt eqktVar7 = (eqkt) eqkrVar.instance;
            eqktVar7.d = 4;
            eqktVar7.b |= 2;
        } else {
            eqkrVar.copyOnWrite();
            eqkt eqktVar8 = (eqkt) eqkrVar.instance;
            eqktVar8.d = 3;
            eqktVar8.b |= 2;
        }
        eyfy build = eqkrVar.build();
        build.getClass();
        return (eqkt) build;
    }
}
