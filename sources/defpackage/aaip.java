package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaip {
    private final ffbr a;

    public aaip(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    public final void a(int i, int i2, boolean z) {
        akxn a = ((akyb) this.a.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.DOUBLE_TAP_REACT_PROMOTION_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqot eqotVar = (eqot) eqou.a.createBuilder();
        eqotVar.copyOnWrite();
        eqou eqouVar = (eqou) eqotVar.instance;
        eqouVar.c = i - 1;
        eqouVar.b |= 1;
        eqotVar.copyOnWrite();
        eqou eqouVar2 = (eqou) eqotVar.instance;
        eqouVar2.b |= 2;
        eqouVar2.d = i2;
        eqotVar.copyOnWrite();
        eqou eqouVar3 = (eqou) eqotVar.instance;
        eqouVar3.b |= 4;
        eqouVar3.e = z;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqou eqouVar4 = (eqou) eqotVar.build();
        eqouVar4.getClass();
        eolvVar2.cg = eqouVar4;
        eolvVar2.h |= 256;
        a.j(eoluVar, alal.LOG_SPEC_DOUBLE_TAP_REACT_PROMOTION_EVENTS);
    }
}
