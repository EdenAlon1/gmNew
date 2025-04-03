package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxjz extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    int h;
    final /* synthetic */ cxka i;
    final /* synthetic */ djrm j;
    final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxjz(cxka cxkaVar, djrm djrmVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.i = cxkaVar;
        this.j = djrmVar;
        this.k = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxjz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        eqkn a;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        djrm djrmVar;
        Object obj7;
        ffhh ffhhVar = ffhh.a;
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                obj2 = this.g;
                Object obj8 = this.f;
                obj5 = this.e;
                obj3 = this.d;
                obj4 = this.c;
                Object obj9 = this.b;
                Object obj10 = this.a;
                ffci.b(obj);
                obj7 = obj8;
                djrmVar = obj9;
                obj6 = obj10;
            } else {
                fflb fflbVar = (fflb) this.c;
                fflb fflbVar2 = (fflb) this.a;
                try {
                    ffci.b(obj);
                    fflbVar.a = (azop) obj;
                    int i2 = this.k;
                    cxka cxkaVar = this.i;
                    djrm djrmVar2 = this.j;
                    erbe a2 = erbd.a((eqkm) eqkn.a.createBuilder());
                    a2.c(i2);
                    eqwd a3 = eqwc.a((eqwn) eqwo.a.createBuilder());
                    djrw djrwVar = (djrw) cxkaVar.g.b();
                    azsu b = ((azop) fflbVar2.a).b();
                    this.a = cxkaVar;
                    this.b = djrmVar2;
                    this.c = a2;
                    this.d = a3;
                    this.e = a3;
                    this.f = a2;
                    this.g = a3;
                    this.h = 2;
                    Object n = djrwVar.n(b, this);
                    if (n == ffhhVar) {
                        return ffhhVar;
                    }
                    obj2 = a3;
                    obj3 = obj2;
                    obj4 = a2;
                    obj = n;
                    obj5 = obj3;
                    obj7 = a2;
                    djrmVar = djrmVar2;
                    obj6 = cxkaVar;
                } catch (IllegalArgumentException e) {
                    ((enrr) ((enrr) cxka.a.j()).g(e).h("com/google/android/apps/messaging/ui/appsettings/analytics/ToggleRcsChatsEventLogger$logTogglePerSimRcsChatsEvent$1", "invokeSuspend", 132, "ToggleRcsChatsEventLogger.kt")).q("Failed to log a toggle global RCS Chats Event");
                    return ffcu.a;
                }
            }
            ((eqwd) obj2).c(((djtc) obj).a);
            ((eqwd) obj5).b(((dijt) ((cxka) obj6).d.b()).b(djrmVar));
            ((erbe) obj7).b(((eqwd) obj3).a());
            a = ((erbe) obj4).a();
        } else {
            ffci.b(obj);
            int i3 = this.k;
            cxka cxkaVar2 = this.i;
            djrm djrmVar3 = this.j;
            erbe a4 = erbd.a((eqkm) eqkn.a.createBuilder());
            a4.c(i3);
            eqwd a5 = eqwc.a((eqwn) eqwo.a.createBuilder());
            a5.c(((djrv) cxkaVar2.e.b()).b(djrn.a(djrmVar3).a).a);
            a5.b(((dijt) cxkaVar2.d.b()).b(djrmVar3));
            a4.b(a5.a());
            a = a4.a();
        }
        akxn a6 = ((akyb) this.i.b.b()).a();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.TOGGLE_RCS_CHATS_EVENT, eoluVar);
        eqki eqkiVar = (eqki) eqkj.a.createBuilder();
        eqkiVar.getClass();
        eqkiVar.copyOnWrite();
        eqkj eqkjVar = (eqkj) eqkiVar.instance;
        eqkjVar.c = a;
        eqkjVar.b = 2;
        eogy.j(erbc.a(eqkiVar), eoluVar);
        a6.j((eolu) eogy.a(eoluVar).toBuilder(), alal.LOG_SPEC_RCS_SETTINGS_UI_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cxjz(this.i, this.j, this.k, ffguVar);
    }
}
