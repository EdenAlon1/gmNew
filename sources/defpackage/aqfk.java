package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqfk {
    private final akyb a;

    public aqfk(akyb akybVar) {
        akybVar.getClass();
        this.a = akybVar;
    }

    public final void a(eqkt eqktVar) {
        akxn a = this.a.a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.TOOLSTONE_EVENT, eoluVar);
        eqko eqkoVar = (eqko) eqkp.a.createBuilder();
        eqkoVar.copyOnWrite();
        eqkp eqkpVar = (eqkp) eqkoVar.instance;
        eqkpVar.c = eqktVar;
        eqkpVar.b = 1;
        eqkp eqkpVar2 = (eqkp) eqkoVar.build();
        eqkpVar2.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.cC = eqkpVar2;
        eolvVar.h |= Integer.MIN_VALUE;
        a.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_TOOLSTONE_EVENTS);
    }
}
