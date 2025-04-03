package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeva {
    private final ffbr a;

    public aeva(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final void a(epys epysVar) {
        akxl akxlVar = (akxl) this.a.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.IN_APP_UPDATE_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        epysVar.getClass();
        eolvVar2.by = epysVar;
        eolvVar2.g |= 1;
        akxlVar.k(eoluVar, epyw.IN_APP_UPDATE_EVENT);
    }

    public final void b(int i, boolean z) {
        epyo epyoVar = (epyo) epys.a.createBuilder();
        epyoVar.copyOnWrite();
        epys epysVar = (epys) epyoVar.instance;
        epysVar.c = i - 1;
        epysVar.b |= 1;
        epyoVar.copyOnWrite();
        epys epysVar2 = (epys) epyoVar.instance;
        epysVar2.d = (true != z ? 3 : 2) - 1;
        epysVar2.b |= 2;
        a((epys) epyoVar.build());
    }
}
