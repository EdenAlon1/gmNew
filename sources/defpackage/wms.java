package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wms extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wmt b;
    final /* synthetic */ eqss c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wms(wmt wmtVar, eqss eqssVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wmtVar;
        this.c = eqssVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wms) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            long j = ffpw.a;
            Object e = ctjd.bl.e();
            e.getClass();
            long e2 = ffpy.e(((Number) e).longValue(), ffpz.c);
            this.a = 1;
            if (ffsw.d(e2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) ctjd.bm.e()).booleanValue()) {
            ((enrr) this.b.c.f().h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/analytics/MagicComposeSendClickedLogger$onSendClickedBeforeQueued$1", "invokeSuspend", 68, "MagicComposeSendClickedLogger.kt")).q("Using PWQ");
            wmr wmrVar = (wmr) this.b.b.b();
            eqss eqssVar = this.c;
            cetp cetpVar = new cetp();
            Object e3 = ctjd.bn.e();
            e3.getClass();
            cetpVar.c = Duration.ofMillis(((Number) e3).longValue());
            ((cevh) wmrVar.a.b()).a(ceyr.h("magic_compose_send_clicked_log_handler", eqssVar, cetpVar.a()));
        } else {
            ((enrr) this.b.c.f().h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/analytics/MagicComposeSendClickedLogger$onSendClickedBeforeQueued$1", "invokeSuspend", 81, "MagicComposeSendClickedLogger.kt")).q("Not using PWQ");
            ((wmf) this.b.a.b()).n(this.c);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wms(this.b, this.c, ffguVar);
    }
}
