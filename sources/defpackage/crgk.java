package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crgk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ crgn b;
    final /* synthetic */ crgf c;
    final /* synthetic */ Map d;
    final /* synthetic */ crgp e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crgk(ffgu ffguVar, crgn crgnVar, crgf crgfVar, Map map, crgp crgpVar) {
        super(2, ffguVar);
        this.b = crgnVar;
        this.c = crgfVar;
        this.d = map;
        this.e = crgpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crgk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            enip c = ((crgy) this.b.d.b()).a().u().f().c(this.c);
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = c.iterator();
            while (it.hasNext()) {
                crgw crgwVar = (crgw) this.d.get((djro) it.next());
                if (crgwVar != null) {
                    arrayList.add(crgwVar);
                }
            }
            Set ar = ffdx.ar(arrayList);
            ensk h = crgn.a.h();
            h.Y(ente.a, "BugleTransport");
            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl$refreshMultiSimTransportRegistration$2$invokeSuspend$lambda$2$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 244, "ChatTransportControllerImpl.kt");
            ArrayList arrayList2 = new ArrayList(ffdx.n(ar, 10));
            Iterator it2 = ar.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new Integer(((crgw) it2.next()).b));
            }
            enrrVar.D("Deregister all SIMs except for SIMs with subIds: %s from chat transport: %s.", arrayList2, this.c.name());
            crgp crgpVar = this.e;
            this.a = 1;
            if (crgpVar.a(ar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        crgk crgkVar = new crgk(ffguVar, this.b, this.c, this.d, this.e);
        crgkVar.f = obj;
        return crgkVar;
    }
}
