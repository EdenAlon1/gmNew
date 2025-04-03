package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yks implements yju {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl");
    public static final long b;
    public final Context c;
    public final ffhd d;
    public final ffsk e;
    public final ffsk f;
    public final elbx g;
    public final ybv h;
    public final ConversationId i;
    public final Optional j;
    public final yhs k;
    public final ffbr l;
    public final ffbr m;
    public final xgg n;
    public final ffbz o;
    public final fgcm p;
    public final dmof q;
    public final ydb r;
    private final fgcq s;
    private final ffxx t;
    private final ffxx u;
    private final fgdj v;
    private final fgdj w;

    static {
        long j = ffpw.a;
        b = ffpy.d(BasePaymentResult.ERROR_REQUEST_FAILED, ffpz.c);
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [ajmc, java.lang.Object] */
    public yks(Context context, ffhd ffhdVar, ffsk ffskVar, ffsk ffskVar2, elbx elbxVar, ydb ydbVar, ybv ybvVar, fgcq fgcqVar, ConversationId conversationId, Optional optional, yhs yhsVar, Optional optional2, ffbr ffbrVar, ffbr ffbrVar2, ffxx ffxxVar, xgg xggVar, final ffbr ffbrVar3) {
        context.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        elbxVar.getClass();
        ydbVar.getClass();
        ybvVar.getClass();
        fgcqVar.getClass();
        conversationId.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffxxVar.getClass();
        this.c = context;
        this.d = ffhdVar;
        this.e = ffskVar;
        this.f = ffskVar2;
        this.g = elbxVar;
        this.r = ydbVar;
        this.h = ybvVar;
        this.s = fgcqVar;
        this.i = conversationId;
        this.j = optional;
        this.k = yhsVar;
        this.l = ffbrVar;
        this.m = ffbrVar2;
        this.n = xggVar;
        this.o = ffca.a(new ffix() { // from class: yjx
            @Override // defpackage.ffix
            public final Object invoke() {
                enru enruVar = yks.a;
                return (xih) ffbr.this.b();
            }
        });
        fgcm a2 = fgdm.a(false);
        this.p = a2;
        dmof dmofVar = new dmof(dmzz.dm, (ffix) new yjy(this), (ffix) new yjz(this), (String) null, false, new dmoe(1), 56);
        this.q = dmofVar;
        ffxx a3 = ffyy.a(new ykk(new ykh(fgcqVar)));
        this.t = a3;
        fgch fgchVar = new fgch(a2, fgau.b(ffyy.a(new ykn(a3)), new yka(null)), new ykb(null));
        this.u = fgchVar;
        new yke(null);
        optional2.isPresent();
        fgdj a4 = optional2.get().a();
        this.v = a4;
        ffxx a5 = fgck.a(a3, fgchVar, a4, new ykr(this, null));
        int i = fgcz.a;
        this.w = fgbn.b(a5, ffskVar2, fgcy.b, dmofVar);
    }

    @Override // defpackage.yju
    public final fgdj a() {
        return this.w;
    }

    public final void b() {
        ekzm b2 = this.g.b("ComposeRowSendButton.onScheduledSendDisabled");
        try {
            ensk j = a.j();
            j.Y(ente.a, "BugleComposeRow2");
            ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl", "onScheduledSendDisabled", 213, "SendButtonUiAdapterImpl.kt")).q("Skipping onScheduledSend as sending is disabled.");
            ffig.a(b2, null);
        } finally {
        }
    }

    public final void c() {
        ekzm b2 = this.g.b("ComposeRowSendButton.onSendDisabled");
        try {
            ensk j = a.j();
            j.Y(ente.a, "BugleComposeRow2");
            ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl", "onSendDisabled", 207, "SendButtonUiAdapterImpl.kt")).q("Skipping onSend as sending is disabled.");
            ffig.a(b2, null);
        } finally {
        }
    }
}
