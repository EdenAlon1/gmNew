package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cicw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ erxs b;
    final /* synthetic */ cida c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cicw(ffgu ffguVar, erxs erxsVar, cida cidaVar) {
        super(2, ffguVar);
        this.b = erxsVar;
        this.c = cidaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cicw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ffci.b(obj);
                return obj;
            }
            ffci.b(obj);
            return obj;
        }
        ffci.b(obj);
        ConversationIdType b = bdgq.b(this.b.b);
        csta cstaVar = (csta) this.c.c.b();
        escu escuVar = this.b.c;
        if (escuVar == null) {
            escuVar = escu.a;
        }
        escuVar.getClass();
        Integer num = (Integer) fflm.b(cstaVar.a(escuVar));
        if (num != null) {
            cida cidaVar = this.c;
            int intValue = num.intValue();
            this.a = 1;
            Object b2 = cidaVar.b(intValue, b, this);
            if (b2 != ffhhVar) {
                return b2;
            }
        } else {
            ensk j = cida.a.j();
            j.Y(ente.a, "BugleDitto");
            ((enrr) j.h("com/google/android/apps/messaging/shared/net/handler/ditto/DittoConversationLeaverImpl$getSelfChatEndpoint$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 89, "DittoConversationLeaverImpl.kt")).q("SubId is not set in leaveRcsGroupRequest, performing leave operation with current active SelfIdentity");
            cida cidaVar2 = this.c;
            this.a = 2;
            Object c = cidaVar2.c(b, this);
            if (c != ffhhVar) {
                return c;
            }
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cicw cicwVar = new cicw(ffguVar, this.b, this.c);
        cicwVar.d = obj;
        return cicwVar;
    }
}
