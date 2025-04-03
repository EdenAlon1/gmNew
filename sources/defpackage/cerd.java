package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cerd extends ceut {
    private final errl a;
    private final ffbr b;
    private final ffbr c;

    public cerd(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = errlVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("LogMessageSentOrReceivedHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cerm.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cerm cermVar = (cerm) eyhsVar;
        return elfo.g(new Callable() { // from class: cerc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cerd.this.k(cermVar);
                return ceyt.i();
            }
        }, this.a);
    }

    public final void k(cerm cermVar) {
        MessageCoreData v = ((bdmq) this.c.b()).v(bdhb.b(cermVar.c));
        if (v != null) {
            eopq eopqVar = cermVar.f;
            if (eopqVar == null) {
                eopqVar = eopq.a;
            }
            int a = eopg.a(eopqVar.Y);
            if (a == 0) {
                a = 1;
            }
            eopq eopqVar2 = cermVar.f;
            if (eopqVar2 == null) {
                eopqVar2 = eopq.a;
            }
            eoop eoopVar = (eoop) eopqVar2.toBuilder();
            eoopVar.copyOnWrite();
            eopq eopqVar3 = (eopq) eoopVar.instance;
            eopqVar3.Y = a - 1;
            eopqVar3.c |= 524288;
            eopq eopqVar4 = cermVar.f;
            if (eopqVar4 == null) {
                eopqVar4 = eopq.a;
            }
            fjay fjayVar = eopqVar4.o;
            if (fjayVar == null) {
                fjayVar = fjay.a;
            }
            eoopVar.copyOnWrite();
            eopq eopqVar5 = (eopq) eoopVar.instance;
            fjayVar.getClass();
            eopqVar5.o = fjayVar;
            eopqVar5.b |= 1024;
            eopq eopqVar6 = cermVar.f;
            eoov b = eoov.b((eopqVar6 == null ? eopq.a : eopqVar6).ak);
            if (b == null) {
                b = eoov.UNKNOWN_FORMAT_TYPE;
            }
            eopa b2 = eopa.b((eopqVar6 == null ? eopq.a : eopqVar6).al);
            if (b2 == null) {
                b2 = eopa.UNKNOWN_IS_IMS;
            }
            if (eopqVar6 == null) {
                eopqVar6 = eopq.a;
            }
            eoox b3 = eoox.b(eopqVar6.am);
            if (b3 == null) {
                b3 = eoox.UNKNOWN_HANDLED_BY;
            }
            if (b != eoov.UNKNOWN_FORMAT_TYPE) {
                eoopVar.copyOnWrite();
                eopq eopqVar7 = (eopq) eoopVar.instance;
                eopqVar7.ak = b.d;
                eopqVar7.c |= Integer.MIN_VALUE;
            }
            if (b2 != eopa.UNKNOWN_IS_IMS) {
                eoopVar.copyOnWrite();
                eopq eopqVar8 = (eopq) eoopVar.instance;
                eopqVar8.al = b2.d;
                eopqVar8.d = 1 | eopqVar8.d;
            }
            if (b3 != eoox.UNKNOWN_HANDLED_BY) {
                eoopVar.copyOnWrite();
                eopq eopqVar9 = (eopq) eoopVar.instance;
                eopqVar9.am = b3.d;
                eopqVar9.d |= 2;
            }
            altk altkVar = (altk) this.b.b();
            int i = cermVar.d;
            long j = cermVar.e;
            altkVar.aP(v, i, new akzo(cermVar.g, cermVar.h), eoopVar);
        }
    }
}
