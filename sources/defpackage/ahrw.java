package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahrw implements ahrq {
    public static final enru a = enru.c("com/google/android/apps/messaging/messageclassifications/ConversationClassificationPersisterImpl");
    public final ffbr b;
    public final cqoh c;
    private final ffsk d;
    private final ffhd e;

    public ahrw(ffsk ffskVar, ffsk ffskVar2, ffhd ffhdVar, ffbr ffbrVar, cqoh cqohVar) {
        ffskVar.getClass();
        ffskVar2.getClass();
        ffhdVar.getClass();
        ffbrVar.getClass();
        cqohVar.getClass();
        this.d = ffskVar;
        this.e = ffhdVar;
        this.b = ffbrVar;
        this.c = cqohVar;
    }

    @Override // defpackage.ahrq
    public final elfl a(ConversationIdType conversationIdType, List list) {
        elfl c;
        list.getClass();
        c = axol.c(this.d, ffhe.a, ffsm.a, new ahrv(this, conversationIdType, list, null));
        return c;
    }

    @Override // defpackage.ahrq
    public final Object b(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.e), new ahrs(null, this), ffguVar);
    }

    @Override // defpackage.ahrq
    public final Object c(ConversationIdType conversationIdType, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.e), new ahrt(null, this, conversationIdType), ffguVar);
    }

    @Override // defpackage.ahrq
    public final Object d(ConversationIdType conversationIdType, List list, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.e), new ahru(null, this, conversationIdType, list), ffguVar);
    }
}
