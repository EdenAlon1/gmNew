package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdxb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ccca b;
    final /* synthetic */ cdxe c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdxb(ffgu ffguVar, ccca cccaVar, cdxe cdxeVar) {
        super(2, ffguVar);
        this.b = cccaVar;
        this.c = cdxeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdxb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ConversationIdType C;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ccbz b = ccbz.b(this.b.d);
        if (b == null) {
            b = ccbz.UNSPECIFIED;
        }
        b.getClass();
        Long l = null;
        if (((cdxh) Map.EL.getOrDefault(this.c.b, b, null)) == null) {
            throw new IllegalArgumentException("Undefined CMS Backfill Missing Field task type.");
        }
        bsob e = bsom.e();
        e.z("RcsMsisdnBackfillMissingFieldQueryProvider#getConversationsQueryBuilder");
        e.i(new Function() { // from class: cdxg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsol bsolVar = (bsol) obj2;
                bsolVar.f();
                int intValue = bsom.g().intValue();
                if (intValue < 58540) {
                    dtub.w("rcs_group_self_msisdn", intValue);
                }
                bsolVar.aq(new dtrx("conversations.rcs_group_self_msisdn", 6));
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cccc ccccVar = this.b.c;
        if (ccccVar == null) {
            ccccVar = cccc.a;
        }
        final Long l2 = new Long(ccccVar.f);
        int i2 = cdxe.a;
        e.e(new bsny(bsom.c.a, true));
        e.x(i2);
        e.i(new Function() { // from class: axmn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsol bsolVar = (bsol) obj2;
                bsolVar.r(l2.longValue());
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = e.b().y();
        enqv it = y.iterator();
        it.getClass();
        while (it.hasNext()) {
            bseh bsehVar = (bseh) it.next();
            cdxe cdxeVar = this.c;
            ccca cccaVar = this.b;
            String a = bsehVar.C().a();
            a.getClass();
            cccd cccdVar = (cccd) ccce.a.createBuilder();
            cccdVar.getClass();
            cccc ccccVar2 = cccaVar.c;
            if (ccccVar2 == null) {
                ccccVar2 = cccc.a;
            }
            ccbw.b(ccccVar2.c, cccdVar);
            cccc ccccVar3 = cccaVar.c;
            if (ccccVar3 == null) {
                ccccVar3 = cccc.a;
            }
            ccbw.f(ccccVar3.d, cccdVar);
            ccbw.e(a, cccdVar);
            cccc ccccVar4 = cccaVar.c;
            if (ccccVar4 == null) {
                ccccVar4 = cccc.a;
            }
            ccbw.c(ccccVar4.e, cccdVar);
            ccbw.d(false, cccdVar);
            ((ccdo) cdxeVar.c.b()).c(ccbw.a(cccdVar));
        }
        y.getClass();
        bseh bsehVar2 = (bseh) ffdx.Q(y);
        if (bsehVar2 != null && (C = bsehVar2.C()) != null) {
            l = Long.valueOf(C.a);
        }
        if (l == null) {
            cdxe cdxeVar2 = this.c;
            ccbz b2 = ccbz.b(this.b.d);
            if (b2 == null) {
                b2 = ccbz.UNSPECIFIED;
            }
            b2.getClass();
            this.a = 1;
            Object b3 = cdxeVar2.b(b2, this);
            return b3 == ffhhVar ? ffhhVar : b3;
        }
        ccca cccaVar2 = this.b;
        long longValue = l.longValue();
        ccbx ccbxVar = (ccbx) cccaVar2.toBuilder();
        ccbxVar.getClass();
        cccc ccccVar5 = cccaVar2.c;
        if (ccccVar5 == null) {
            ccccVar5 = cccc.a;
        }
        ccccVar5.getClass();
        cccb cccbVar = (cccb) ccccVar5.toBuilder();
        cccbVar.getClass();
        cccbVar.copyOnWrite();
        cccc ccccVar6 = (cccc) cccbVar.instance;
        ccccVar6.b |= 8;
        ccccVar6.f = longValue;
        ccbb.b(ccbv.a(cccbVar), ccbxVar);
        return ceyt.j(engw.r(ceyr.g("cms_backfill_missing_field_work_handler", ccbb.a(ccbxVar))));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdxb cdxbVar = new cdxb(ffguVar, this.b, this.c);
        cdxbVar.d = obj;
        return cdxbVar;
    }
}
