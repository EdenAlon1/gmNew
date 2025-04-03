package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmoc {
    public final ffbr a;

    public cmoc(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final void a(int i) {
        akxn a = ((akyb) this.a.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.REVOKE_CONSENT_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eqzj eqzjVar = (eqzj) eqzk.a.createBuilder();
        eqzl eqzlVar = (eqzl) eqzm.a.createBuilder();
        eqzlVar.copyOnWrite();
        eqzm eqzmVar = (eqzm) eqzlVar.instance;
        eqzmVar.c = i - 1;
        eqzmVar.b |= 1;
        eqzjVar.copyOnWrite();
        eqzk eqzkVar = (eqzk) eqzjVar.instance;
        eqzm eqzmVar2 = (eqzm) eqzlVar.build();
        eqzmVar2.getClass();
        eqzkVar.c = eqzmVar2;
        eqzkVar.b = 2;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqzk eqzkVar2 = (eqzk) eqzjVar.build();
        eqzkVar2.getClass();
        eolvVar2.ch = eqzkVar2;
        eolvVar2.h |= 512;
        a.h(eoluVar, alal.LOG_SPEC_REVOKE_CONSENT_EVENTS);
    }
}
