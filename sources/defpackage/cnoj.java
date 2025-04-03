package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnoj {
    private final akyb a;

    public cnoj(akyb akybVar) {
        akybVar.getClass();
        this.a = akybVar;
    }

    public final void a(eqzw eqzwVar) {
        akxn a = this.a.a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.SATELLITE_EVENT, eoluVar);
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.cn = eqzwVar;
        eolvVar.h |= 65536;
        a.h((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_SATELLITE_EVENTS);
    }
}
