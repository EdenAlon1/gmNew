package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bdfn extends ffhv implements ffjn {
    int a;
    final /* synthetic */ bcll b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdfn(bcll bcllVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = bcllVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new bdfn(this.b, (ffgu) obj3).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ensk h = bdfo.a.h();
            h.Y(ente.a, "BugleDatabase");
            enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationMetadataFullSyncWorkHandler$1", "invokeSuspend", 42, "ConversationMetadataFullSyncWorkHandler.kt");
            bsob e = bsom.e();
            e.z("debug_conversations");
            enrrVar.r("Finished a Conversation Metadata Refresh from PWQ. Total conversations: %d", e.b().i());
            bcll bcllVar = this.b;
            this.a = 1;
            if (bcllVar.a(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        ensk h2 = bdfo.a.h();
        h2.Y(ente.a, "BugleDatabase");
        ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationMetadataFullSyncWorkHandler$1", "invokeSuspend", 50, "ConversationMetadataFullSyncWorkHandler.kt")).q("Finished a Conversation Metadata Refresh from PWQ");
        return ceyt.i();
    }
}
