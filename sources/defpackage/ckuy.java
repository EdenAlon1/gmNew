package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckuy {
    private final akyb a;

    public ckuy(akyb akybVar) {
        akybVar.getClass();
        this.a = akybVar;
    }

    private final void g(eqbu eqbuVar) {
        akxn a = this.a.a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.MMS_MERGING_EVENT, eoluVar);
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.cx = eqbuVar;
        eolvVar.h |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        a.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_MMS_MERGING_EVENT);
    }

    public final void a() {
        eqbq eqbqVar = (eqbq) eqbu.a.createBuilder();
        eqbqVar.getClass();
        equj.b(3, eqbqVar);
        equj.c(4, eqbqVar);
        g(equj.a(eqbqVar));
    }

    public final void b() {
        eqbq eqbqVar = (eqbq) eqbu.a.createBuilder();
        eqbqVar.getClass();
        equj.b(3, eqbqVar);
        equj.c(5, eqbqVar);
        g(equj.a(eqbqVar));
    }

    public final void c() {
        eqbq eqbqVar = (eqbq) eqbu.a.createBuilder();
        eqbqVar.getClass();
        equj.b(3, eqbqVar);
        equj.c(3, eqbqVar);
        g(equj.a(eqbqVar));
    }

    public final void d() {
        eqbq eqbqVar = (eqbq) eqbu.a.createBuilder();
        eqbqVar.getClass();
        equj.b(3, eqbqVar);
        equj.c(2, eqbqVar);
        g(equj.a(eqbqVar));
    }

    public final void e() {
        eqbq eqbqVar = (eqbq) eqbu.a.createBuilder();
        eqbqVar.getClass();
        equj.b(4, eqbqVar);
        eqbqVar.copyOnWrite();
        eqbu eqbuVar = (eqbu) eqbqVar.instance;
        eqbuVar.e = 1;
        eqbuVar.b = 4 | eqbuVar.b;
        g(equj.a(eqbqVar));
    }

    public final void f() {
        eqbq eqbqVar = (eqbq) eqbu.a.createBuilder();
        eqbqVar.getClass();
        equj.b(2, eqbqVar);
        g(equj.a(eqbqVar));
    }
}
