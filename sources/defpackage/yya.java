package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yya implements yxk {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/sim/SimSelectorUiAdapterImpl");
    public static final dmov b = new dmov(ffel.a, null, new ffji() { // from class: yxl
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            enru enruVar = yya.a;
            ((dmog) obj).getClass();
            return ffcu.a;
        }
    });
    public final ConversationId c;
    public final ffhd d;
    public final alxl e;
    public final yxj f;
    public final auov g;
    public final ydb h;
    private final ffsk i;
    private final ffhd j;
    private final atbw k;
    private final ffxx l;
    private final fgdj m;

    public yya(ConversationId conversationId, ffsk ffskVar, ffhd ffhdVar, ffhd ffhdVar2, alxl alxlVar, yxj yxjVar, ffxx ffxxVar, ffxx ffxxVar2, fgcq fgcqVar, auov auovVar, ydb ydbVar, atbw atbwVar) {
        conversationId.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        alxlVar.getClass();
        ffxxVar2.getClass();
        fgcqVar.getClass();
        ydbVar.getClass();
        atbwVar.getClass();
        this.c = conversationId;
        this.i = ffskVar;
        this.j = ffhdVar;
        this.d = ffhdVar2;
        this.e = alxlVar;
        this.f = yxjVar;
        this.g = auovVar;
        this.h = ydbVar;
        this.k = atbwVar;
        ffxx ffygVar = atbwVar.a() ? new ffyg(false) : ffyy.a(new yxv(new yxs(fgcqVar)));
        this.l = ffygVar;
        axol.k(ffskVar, ffhdVar, new yxo(ffxxVar, this, null), 2);
        ffxx b2 = fgck.b(ffygVar, ffxxVar2, ffxxVar, auovVar.a() ? ydbVar.a : new ffyg(null), new yxz(this, null));
        int i = fgcz.a;
        this.m = fgbn.b(b2, ffskVar, fgcy.b, b);
    }

    @Override // defpackage.yxk
    public final fgdj a() {
        return this.m;
    }

    public final void b(aqux aquxVar) {
        axol.k(this.i, this.j, new yxp(aquxVar, this, null), 2);
    }
}
