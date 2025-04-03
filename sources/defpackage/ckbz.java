package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ckce b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ aoku d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckbz(ckce ckceVar, MessageCoreData messageCoreData, aoku aokuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ckceVar;
        this.c = messageCoreData;
        this.d = aokuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckbz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ((akzt) this.b.e.b()).c("Bugle.Rcs.Chat.Message.Revoke.Send.Counts");
        ensk e = ckce.a.e();
        e.Y(ente.a, "BugleAction");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.b, this.c.B());
        enrrVar.Y(csux.e, this.c.E().b);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/RcsRevocationSenderImpl$revokeMessage$1", "invokeSuspend", 50, "RcsRevocationSenderImpl.kt")).q("Revocation send attempt.");
        ckce ckceVar = this.b;
        MessageCoreData messageCoreData = this.c;
        aoku aokuVar = this.d;
        this.a = 1;
        Object a = ffra.a(ekxi.a(ckceVar.b), new ckca(null, messageCoreData, aokuVar, ckceVar), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckbz(this.b, this.c, this.d, ffguVar);
    }
}
