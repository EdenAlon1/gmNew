package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amnq extends ffhv implements ffjm {
    final /* synthetic */ amnr a;
    final /* synthetic */ bseh b;
    final /* synthetic */ azcr c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amnq(ffgu ffguVar, amnr amnrVar, bseh bsehVar, azcr azcrVar) {
        super(2, ffguVar);
        this.a = amnrVar;
        this.b = bsehVar;
        this.c = azcrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amnq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ConversationIdType C = this.b.C();
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.p(this.c);
        if (bsoeVar.f(C)) {
            ensk h = amnr.a.h();
            h.Y(ente.a, "BugleCME");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.p, C);
            enrrVar.Y(csux.ab, this.c);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleDestinationConversationMatcher$updateConversationTableWithDestinationToken$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 225, "BugleDestinationConversationMatcher.kt")).q("Updated destination token in the conversation.");
        } else {
            ensk j = amnr.a.j();
            j.Y(ente.a, "BugleCME");
            enrr enrrVar2 = (enrr) j;
            enrrVar2.Y(csux.p, C);
            enrrVar2.Y(csux.ab, this.c);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/destination/BugleDestinationConversationMatcher$updateConversationTableWithDestinationToken$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 219, "BugleDestinationConversationMatcher.kt")).q("Tried updating destination token in conversation that does not exist.");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        amnq amnqVar = new amnq(ffguVar, this.a, this.b, this.c);
        amnqVar.d = obj;
        return amnqVar;
    }
}
