package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxjy extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ cxka f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxjy(cxka cxkaVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = cxkaVar;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxjy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Iterator it;
        eqkk eqkkVar;
        cxka cxkaVar;
        Object a;
        Object obj2;
        Object obj3;
        ffhh ffhhVar = ffhh.a;
        int i = this.e;
        if (i != 0) {
            it = null;
            if (i == 1) {
                try {
                    ffci.b(obj);
                    azop azopVar = (azop) obj;
                    cxkaVar = this.f;
                    a = eqwc.a((eqwn) eqwo.a.createBuilder());
                    djrw djrwVar = (djrw) cxkaVar.g.b();
                    azsu b = azopVar.b();
                    this.a = cxkaVar;
                    this.b = a;
                    this.c = a;
                    this.d = a;
                    this.e = 2;
                    obj = djrwVar.n(b, this);
                    if (obj == ffhhVar) {
                        return ffhhVar;
                    }
                    obj2 = a;
                    obj3 = obj2;
                } catch (IllegalArgumentException e) {
                    ((enrr) ((enrr) cxka.a.j()).g(e).h("com/google/android/apps/messaging/ui/appsettings/analytics/ToggleRcsChatsEventLogger$logToggleGlobalRcsChatsEvent$1", "invokeSuspend", 64, "ToggleRcsChatsEventLogger.kt")).q("Failed to log a toggle global RCS Chats Event");
                    eqkkVar = null;
                }
            } else {
                a = this.d;
                obj2 = this.c;
                Object obj4 = this.b;
                Object obj5 = this.a;
                ffci.b(obj);
                obj3 = obj4;
                cxkaVar = obj5;
            }
            ((eqwd) a).c(((djtc) obj).a);
            ((eqwd) obj2).b(((dijt) cxkaVar.d.b()).b(null));
            ((eqwd) obj3).a();
            throw null;
        }
        ffci.b(obj);
        int i2 = this.g;
        eqkk eqkkVar2 = (eqkk) eqkl.a.createBuilder();
        eqkkVar2.getClass();
        eqkkVar2.copyOnWrite();
        eqkl eqklVar = (eqkl) eqkkVar2.instance;
        eqklVar.c = i2 - 1;
        eqklVar.b |= 1;
        eyfy build = eqkkVar2.build();
        build.getClass();
        eyfq builder = ((eqkl) build).toBuilder();
        builder.getClass();
        it = ((cort) this.f.c.b()).n().iterator();
        eqkkVar = (eqkk) builder;
        while (it.hasNext()) {
            djrm djrmVar = (djrm) it.next();
            cxka cxkaVar2 = this.f;
            eqwd a2 = eqwc.a((eqwn) eqwo.a.createBuilder());
            a2.c(((djrv) cxkaVar2.e.b()).b(djrn.a(djrmVar).a).a);
            a2.b(((dijt) cxkaVar2.d.b()).b(djrmVar));
            eqwo a3 = a2.a();
            eqkkVar.copyOnWrite();
            eqkl eqklVar2 = (eqkl) eqkkVar.instance;
            eqkl eqklVar3 = eqkl.a;
            eygr eygrVar = eqklVar2.d;
            if (!eygrVar.c()) {
                eqklVar2.d = eyfy.mutableCopy(eygrVar);
            }
            eqklVar2.d.add(a3);
        }
        akxn a4 = ((akyb) this.f.b.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.TOGGLE_RCS_CHATS_EVENT, eoluVar);
        eqki eqkiVar = (eqki) eqkj.a.createBuilder();
        eqkiVar.getClass();
        eqkl eqklVar4 = (eqkl) eqkkVar.build();
        eqklVar4.getClass();
        eqkiVar.copyOnWrite();
        eqkj eqkjVar = (eqkj) eqkiVar.instance;
        eqkjVar.c = eqklVar4;
        eqkjVar.b = 1;
        eogy.j(erbc.a(eqkiVar), eoluVar);
        a4.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_RCS_SETTINGS_UI_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cxjy(this.f, this.g, ffguVar);
    }
}
