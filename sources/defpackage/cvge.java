package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvge {
    private final ffbr a;

    public cvge(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    public final void a() {
        b(3);
    }

    public final void b(int i) {
        akxn a = ((akyb) this.a.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.MEET_CALLING_EVENT, eoluVar);
        eqtv eqtvVar = (eqtv) eqtx.a.createBuilder();
        eqtvVar.getClass();
        eqtvVar.copyOnWrite();
        eqtx eqtxVar = (eqtx) eqtvVar.instance;
        eqtxVar.c = i - 1;
        eqtxVar.b |= 1;
        eyfy build = eqtvVar.build();
        build.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.cb = (eqtx) build;
        eolvVar.h |= 8;
        a.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_MEET_CALLING_EVENTS);
    }
}
