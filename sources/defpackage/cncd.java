package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cncd {
    private final akyw a;
    private final cpbs b;

    public cncd(akyw akywVar, cpbs cpbsVar) {
        this.a = akywVar;
        this.b = cpbsVar;
    }

    public final epdq a(int i) {
        epdo epdoVar = (epdo) epdq.a.createBuilder();
        eoqk a = this.a.a(i);
        epdoVar.copyOnWrite();
        epdq epdqVar = (epdq) epdoVar.instance;
        epdqVar.c = a;
        epdqVar.b |= 1;
        int d = this.b.a(i).d();
        epdoVar.copyOnWrite();
        epdq epdqVar2 = (epdq) epdoVar.instance;
        epdqVar2.b |= 2;
        epdqVar2.d = d;
        int intValue = ((Integer) cncc.c.e()).intValue();
        epdoVar.copyOnWrite();
        epdq epdqVar3 = (epdq) epdoVar.instance;
        epdqVar3.b |= 4;
        epdqVar3.e = intValue;
        epdoVar.copyOnWrite();
        epdq epdqVar4 = (epdq) epdoVar.instance;
        epdqVar4.f = 1;
        epdqVar4.b |= 8;
        return (epdq) epdoVar.build();
    }
}
