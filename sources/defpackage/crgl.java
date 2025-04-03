package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crgl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Map b;
    final /* synthetic */ djro c;
    final /* synthetic */ crgf d;
    final /* synthetic */ crgn e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crgl(ffgu ffguVar, Map map, djro djroVar, crgf crgfVar, crgn crgnVar) {
        super(2, ffguVar);
        this.b = map;
        this.c = djroVar;
        this.d = crgfVar;
        this.e = crgnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crgl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            crgw crgwVar = (crgw) this.b.get(this.c);
            if (crgwVar != null) {
                ensk h = crgn.a.h();
                h.Y(ente.a, "BugleTransport");
                ((enrr) h.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl$refreshMultiSimTransportRegistration$2$invokeSuspend$lambda$4$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 265, "ChatTransportControllerImpl.kt")).w("Register SIM with subId: %d on chat transport: %s.", crgwVar.b, this.d.name());
                crgn crgnVar = this.e;
                crgp crgpVar = (crgp) crgnVar.b.get(this.d);
                if (crgpVar != null) {
                    this.a = 1;
                    if (crgpVar.b(crgwVar, this) == ffhhVar) {
                        return ffhhVar;
                    }
                }
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        crgl crglVar = new crgl(ffguVar, this.b, this.c, this.d, this.e);
        crglVar.f = obj;
        return crglVar;
    }
}
