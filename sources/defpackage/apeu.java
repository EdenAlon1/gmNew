package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apeu implements apeq {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/classification/ClassificationControllerImpl");
    public final ffbr b;
    public final BugleConversationId c;
    private final apfk d;
    private final ffhd e;

    public apeu(apfk apfkVar, ffbr ffbrVar, ffhd ffhdVar, BugleConversationId bugleConversationId) {
        this.d = apfkVar;
        this.b = ffbrVar;
        this.e = ffhdVar;
        this.c = bugleConversationId;
    }

    @Override // defpackage.apeq
    public final aqge a() {
        apfk apfkVar = this.d;
        ffsk ffskVar = (ffsk) apfkVar.a.b();
        ffskVar.getClass();
        ffsk ffskVar2 = (ffsk) apfkVar.b.b();
        ffskVar2.getClass();
        ctbk ctbkVar = (ctbk) apfkVar.c.b();
        ctbkVar.getClass();
        becj becjVar = (becj) apfkVar.d.b();
        becjVar.getClass();
        Optional optional = (Optional) apfkVar.e.b();
        optional.getClass();
        cjdj cjdjVar = (cjdj) apfkVar.f.b();
        cjdjVar.getClass();
        cjdi cjdiVar = (cjdi) apfkVar.g.b();
        cjdiVar.getClass();
        return new apfj(ffskVar, ffskVar2, ctbkVar, becjVar, optional, cjdjVar, cjdiVar, this.c);
    }

    @Override // defpackage.apeq
    public final Object b(apep apepVar, ffgu ffguVar) {
        Object a2;
        MessageIdType messageIdType = ((CoreBugleMessageId) apepVar.c).a;
        return (messageIdType != null && (a2 = ffra.a(ekxi.a(this.e), new apes(null, this, messageIdType), ffguVar)) == ffhh.a) ? a2 : ffcu.a;
    }

    @Override // defpackage.apeq
    public final Object c(apep apepVar) {
        Object m = ((ctjh) this.b.b()).m(new Long(apepVar.d), apepVar.e, this.c.a, apepVar.b, eopx.SHOWN);
        return m == ffhh.a ? m : ffcu.a;
    }
}
