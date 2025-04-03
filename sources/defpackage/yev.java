package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yev implements yei {
    private final ffhd a;

    public yev(ffhd ffhdVar) {
        ffhdVar.getClass();
        this.a = ffhdVar;
    }

    @Override // defpackage.yei
    public final Object a(xhs xhsVar, bswn bswnVar, ffgu ffguVar) {
        Object a = ffra.a(ekxi.a(this.a), new yeu(null, xhsVar, bswnVar), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.yei
    public final void c(bswp bswpVar, xhu xhuVar) {
        xhuVar.getClass();
        MessageId messageId = xhuVar.e;
        bswpVar.f(messageId != null ? messageId.a() : null);
    }

    @Override // defpackage.yei
    public final void d(bsxy bsxyVar, xhu xhuVar) {
        MessageId messageId = xhuVar.e;
        String a = messageId != null ? messageId.a() : null;
        int intValue = bsyb.c().intValue();
        int intValue2 = bsyb.c().intValue();
        if (intValue2 < 59540) {
            dtub.w("replied_to_message_id", intValue2);
        }
        if (intValue >= 59540) {
            dtub.u(bsxyVar.a, "replied_to_message_id", a);
        }
    }

    @Override // defpackage.yei
    public final boolean e(ydx ydxVar) {
        return ydxVar.a(new ffji() { // from class: yet
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                xhu xhuVar = (xhu) obj;
                xhuVar.getClass();
                return xhuVar.e;
            }
        });
    }
}
