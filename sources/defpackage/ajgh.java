package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajgh implements csza {
    public final ffbr a;
    private final errl b;
    private final ffbr c;
    private final ffbr d;

    public ajgh(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = errlVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.a = ffbrVar3;
    }

    @Override // defpackage.csza
    public final double a() {
        return ((Double) cszt.w.e()).doubleValue();
    }

    @Override // defpackage.csza
    public final elfl b() {
        return ((alxl) this.a.b()).g(new anvc(engw.r(((aqkp) this.d.b()).f(((aolr) this.c.b()).v())), enou.a, Optional.empty(), 3, false, null, false, false)).i(new eroh() { // from class: ajgf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                engw engwVar = (engw) obj;
                if (engwVar.isEmpty()) {
                    return elfo.e(0);
                }
                ajgh ajghVar = ajgh.this;
                return ((alxl) ajghVar.a.b()).a((ConversationId) engwVar.get(0), alxk.MINIMAL).c().v();
            }
        }, this.b).h(new emwl() { // from class: ajgg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((long) ((Integer) obj).intValue()) >= ((Long) ctjd.aL.e()).longValue());
            }
        }, this.b);
    }

    @Override // defpackage.cszb
    public final eovb c() {
        return eovb.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
    }

    @Override // defpackage.csza
    public final String d() {
        return (String) cszt.v.e();
    }
}
