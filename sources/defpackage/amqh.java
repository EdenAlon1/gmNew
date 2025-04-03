package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amqh extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ atlz c;
    final /* synthetic */ axbh d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqh(atlz atlzVar, axbh axbhVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = atlzVar;
        this.d = axbhVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        amqh amqhVar = new amqh(this.c, this.d, (ffgu) obj3);
        amqhVar.e = (amql) obj;
        amqhVar.b = (ceuw) obj2;
        return amqhVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [ceuw, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        if (i == 0) {
            ffci.b(obj);
            Object obj2 = this.e;
            ?? r7 = this.b;
            axbh axbhVar = this.d;
            amql amqlVar = (amql) obj2;
            ckkz ckkzVar = amqlVar.d;
            if (ckkzVar == null) {
                ckkzVar = ckkz.a;
            }
            ckkz ckkzVar2 = ckkzVar;
            ckkzVar2.getClass();
            BugleConversationId bugleConversationId = new BugleConversationId(amqlVar.c);
            awxv awxvVar = (awxv) awya.a.createBuilder();
            awxvVar.getClass();
            awyb.c(awxz.USER, awxvVar);
            awyb.b(awxx.HIGH, awxvVar);
            awyb.d(awxvVar);
            ffhd ffhdVar = axbhVar.b;
            awya a = awyb.a(awxvVar);
            ffhd a2 = ekxi.a(ffhdVar);
            amqg amqgVar = new amqg(null, bugleConversationId, axbhVar, ckkzVar2, a, r7);
            this.e = null;
            this.a = 2;
            obj = ffra.a(a2, amqgVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        } else {
            if (i == 1) {
                axbh axbhVar2 = (axbh) this.b;
                ceuw ceuwVar = (ceuw) this.e;
                try {
                    ffci.b(obj);
                    return axbhVar2.b((ckbx) obj, ceuwVar);
                } catch (Exception e) {
                    ((enrr) ((enrr) axbh.a.j()).g(e).h("com/google/android/apps/messaging/shared/chatapi/protomessage/workhandler/RcsProtoMessageSenderHandler", "handleWorkForDestination", 119, "RcsProtoMessageSenderHandler.kt")).q("RCS proto message send failed.");
                    return ceyt.k();
                }
            }
            ffci.b(obj);
        }
        return (ceyt) obj;
    }
}
