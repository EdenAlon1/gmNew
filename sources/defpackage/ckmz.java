package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckmz extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ cknb e;
    final /* synthetic */ awvt f;
    final /* synthetic */ ConversationIdType g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckmz(cknb cknbVar, awvt awvtVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = cknbVar;
        this.f = awvtVar;
        this.g = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckmz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        aoku aokuVar;
        Object obj5;
        Optional m;
        ffhh ffhhVar = ffhh.a;
        if (this.d != 0) {
            obj3 = this.c;
            obj2 = this.b;
            Object obj6 = this.a;
            ffci.b(obj);
            obj4 = obj6;
        } else {
            ffci.b(obj);
            cknb cknbVar = this.e;
            obj2 = this.f;
            ConversationIdType conversationIdType = this.g;
            this.a = cknbVar;
            this.b = obj2;
            this.c = conversationIdType;
            this.d = 1;
            Object a = cknbVar.a(this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            obj3 = conversationIdType;
            obj = a;
            obj4 = cknbVar;
        }
        obj.getClass();
        engw engwVar = (engw) obj;
        entd entdVar = cknb.a;
        cknb cknbVar2 = (cknb) obj4;
        List L = ((bczy) cknbVar2.e.b()).L((ConversationIdType) obj3);
        Set p = ((djrv) cknbVar2.c.b()).p();
        ArrayList arrayList = new ArrayList(ffdx.n(p, 10));
        Iterator it = p.iterator();
        while (it.hasNext()) {
            arrayList.add(((avkc) cknbVar2.d.b()).c(((djrj) it.next()).a));
        }
        Set ar = ffdx.ar(arrayList);
        Iterator<E> it2 = engwVar.iterator();
        while (true) {
            aokuVar = null;
            if (!it2.hasNext()) {
                obj5 = null;
                break;
            }
            obj5 = it2.next();
            if (((aqux) obj5).u()) {
                break;
            }
        }
        aqux aquxVar = (aqux) obj5;
        if (aquxVar != null && (m = aquxVar.m()) != null) {
            aokuVar = (aoku) fflm.b(m);
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.BUGLE_RCS_GROUP_SELF_PARTICIPANT_INCLUSION, eoluVar);
        ezkq ezkqVar = (ezkq) ezkr.a.createBuilder();
        ezkqVar.getClass();
        ezkn.e(ezkp.GROUP_EVENT_NOTIFICATION, ezkqVar);
        awvt awvtVar = (awvt) obj2;
        int size = awvtVar.g.size();
        ezkqVar.copyOnWrite();
        ezkr ezkrVar = (ezkr) ezkqVar.instance;
        ezkrVar.b |= 8192;
        ezkrVar.m = size;
        eygr eygrVar = awvtVar.g;
        eygrVar.getClass();
        boolean c = ckmy.c(aokuVar, eygrVar);
        ezkqVar.copyOnWrite();
        ezkr ezkrVar2 = (ezkr) ezkqVar.instance;
        ezkrVar2.b |= 32768;
        ezkrVar2.o = c;
        eygr eygrVar2 = awvtVar.g;
        eygrVar2.getClass();
        int d = ckmy.d(eygrVar2, ar);
        ezkqVar.copyOnWrite();
        ezkr ezkrVar3 = (ezkr) ezkqVar.instance;
        ezkrVar3.b |= 16384;
        ezkrVar3.n = d;
        int size2 = awvtVar.h.size();
        ezkqVar.copyOnWrite();
        ezkr ezkrVar4 = (ezkr) ezkqVar.instance;
        ezkrVar4.b |= 65536;
        ezkrVar4.p = size2;
        eygr eygrVar3 = awvtVar.h;
        eygrVar3.getClass();
        boolean c2 = ckmy.c(aokuVar, eygrVar3);
        ezkqVar.copyOnWrite();
        ezkr ezkrVar5 = (ezkr) ezkqVar.instance;
        ezkrVar5.b |= 262144;
        ezkrVar5.r = c2;
        eygr eygrVar4 = awvtVar.h;
        eygrVar4.getClass();
        int d2 = ckmy.d(eygrVar4, ar);
        ezkqVar.copyOnWrite();
        ezkr ezkrVar6 = (ezkr) ezkqVar.instance;
        ezkrVar6.b |= 131072;
        ezkrVar6.q = d2;
        ezkn.c(((enou) L).c, ezkqVar);
        L.getClass();
        ezkn.d(ckmy.b(L, ar), ezkqVar);
        ezkn.b(ckmy.a(aokuVar, L), ezkqVar);
        ezkn.f(aokuVar != null, ezkqVar);
        ezkn.g(cknb.c(engwVar), ezkqVar);
        ezkn.h(ar.size(), ezkqVar);
        eogy.e(ezkn.a(ezkqVar), eoluVar);
        eyfq builder = eogy.a(eoluVar).toBuilder();
        builder.getClass();
        ((akyb) cknbVar2.b.b()).a().h((eolu) builder, alal.LOG_SPEC_DSDR_GROUP_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckmz(this.e, this.f, this.g, ffguVar);
    }
}
