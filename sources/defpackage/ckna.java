package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckna extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ cknb f;
    final /* synthetic */ awvy g;
    final /* synthetic */ ConversationIdType h;
    final /* synthetic */ ezkp i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckna(cknb cknbVar, awvy awvyVar, ConversationIdType conversationIdType, ezkp ezkpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = cknbVar;
        this.g = awvyVar;
        this.h = conversationIdType;
        this.i = ezkpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckna) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [aoku] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        cknb cknbVar;
        String str;
        Object obj5;
        int i;
        String str2;
        awui awuiVar;
        Optional m;
        ffhh ffhhVar = ffhh.a;
        if (this.e != 0) {
            obj4 = this.d;
            obj3 = this.c;
            obj2 = this.b;
            ?? r4 = this.a;
            ffci.b(obj);
            cknbVar = r4;
        } else {
            ffci.b(obj);
            cknb cknbVar2 = this.f;
            obj2 = this.g;
            obj3 = this.h;
            ezkp ezkpVar = this.i;
            this.a = cknbVar2;
            this.b = obj2;
            this.c = obj3;
            this.d = ezkpVar;
            this.e = 1;
            Object a = cknbVar2.a(this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            obj4 = ezkpVar;
            obj = a;
            cknbVar = cknbVar2;
        }
        obj.getClass();
        engw engwVar = (engw) obj;
        entd entdVar = cknb.a;
        cknb cknbVar3 = cknbVar;
        List L = ((bczy) cknbVar3.e.b()).L((ConversationIdType) obj3);
        Set p = ((djrv) cknbVar3.c.b()).p();
        ArrayList arrayList = new ArrayList(ffdx.n(p, 10));
        Iterator it = p.iterator();
        while (it.hasNext()) {
            arrayList.add(((avkc) cknbVar3.d.b()).c(((djrj) it.next()).a));
        }
        Set ar = ffdx.ar(arrayList);
        Iterator it2 = engwVar.iterator();
        while (true) {
            str = null;
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
        ?? r6 = (aquxVar == null || (m = aquxVar.m()) == null) ? 0 : (aoku) fflm.b(m);
        Stream stream = Collection.EL.stream(((awvy) obj2).h);
        final ffji ffjiVar = new ffji() { // from class: ckmu
            @Override // defpackage.ffji
            public final Object invoke(Object obj6) {
                awwq awwqVar = (awwq) obj6;
                awwqVar.getClass();
                return Boolean.valueOf((awwqVar.b & 2) != 0);
            }
        };
        Stream filter = stream.filter(new Predicate() { // from class: ckmv
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj6) {
                return ((Boolean) ffji.this.invoke(obj6)).booleanValue();
            }
        });
        final ffji ffjiVar2 = new ffji() { // from class: ckmw
            @Override // defpackage.ffji
            public final Object invoke(Object obj6) {
                awwq awwqVar = (awwq) obj6;
                awwqVar.getClass();
                entd entdVar2 = cknb.a;
                int i2 = awwqVar.d;
                awwp b = awwp.b(i2);
                if (b == null) {
                    b = awwp.UNKNOWN_STATE;
                }
                boolean z = true;
                if (b != awwp.JOINED) {
                    awwp b2 = awwp.b(i2);
                    if (b2 == null) {
                        b2 = awwp.UNKNOWN_STATE;
                    }
                    if (b2 != awwp.PENDING) {
                        awwp b3 = awwp.b(i2);
                        if (b3 == null) {
                            b3 = awwp.UNKNOWN_STATE;
                        }
                        if (b3 != awwp.UNKNOWN_STATE) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        Object collect = filter.filter(new Predicate() { // from class: ckmx
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj6) {
                return ((Boolean) ffji.this.invoke(obj6)).booleanValue();
            }
        }).collect(endq.a);
        collect.getClass();
        engw engwVar2 = (engw) collect;
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.BUGLE_RCS_GROUP_SELF_PARTICIPANT_INCLUSION, eoluVar);
        ezkq ezkqVar = (ezkq) ezkr.a.createBuilder();
        ezkqVar.getClass();
        ezkn.e((ezkp) obj4, ezkqVar);
        int size = engwVar2.size();
        ezkqVar.copyOnWrite();
        ezkr ezkrVar = (ezkr) ezkqVar.instance;
        ezkrVar.b |= 2;
        ezkrVar.d = size;
        boolean z = false;
        if (engwVar2.isEmpty()) {
            i = 0;
        } else {
            Iterator it3 = engwVar2.iterator();
            i = 0;
            while (it3.hasNext()) {
                awui awuiVar2 = ((awwq) it3.next()).c;
                if (awuiVar2 == null) {
                    awuiVar2 = awui.a;
                }
                if (ar.contains(awuiVar2) && (i = i + 1) < 0) {
                    ffdx.k();
                }
            }
        }
        ezkqVar.copyOnWrite();
        ezkr ezkrVar2 = (ezkr) ezkqVar.instance;
        ezkrVar2.b |= 4;
        ezkrVar2.e = i;
        boolean z2 = r6 == 0;
        if (r6 != 0) {
            Optional e = r6.e();
            if (e != null && (awuiVar = (awui) fflm.b(e)) != null) {
                str = awuiVar.d;
            }
            str2 = str;
            str = r6;
        } else {
            str2 = null;
        }
        if (str != null && !engwVar2.isEmpty()) {
            Iterator it4 = engwVar2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                awwq awwqVar = (awwq) it4.next();
                if ((awwqVar.b & 1) != 0) {
                    awui awuiVar3 = awwqVar.c;
                    if (awuiVar3 == null) {
                        awuiVar3 = awui.a;
                    }
                    if (ffkj.e(awuiVar3.d, str2)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        ezkqVar.copyOnWrite();
        ezkr ezkrVar3 = (ezkr) ezkqVar.instance;
        ezkrVar3.b |= 8;
        ezkrVar3.f = z;
        ezkn.c(((enou) L).c, ezkqVar);
        L.getClass();
        ezkn.d(ckmy.b(L, ar), ezkqVar);
        ezkn.b(ckmy.a(r6, L), ezkqVar);
        ezkn.f(!z2, ezkqVar);
        ezkn.g(cknb.c(engwVar), ezkqVar);
        ezkn.h(ar.size(), ezkqVar);
        eogy.e(ezkn.a(ezkqVar), eoluVar);
        eyfq builder = eogy.a(eoluVar).toBuilder();
        builder.getClass();
        ((akyb) cknbVar3.b.b()).a().h((eolu) builder, alal.LOG_SPEC_DSDR_GROUP_EVENTS);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckna(this.f, this.g, this.h, this.i, ffguVar);
    }
}
