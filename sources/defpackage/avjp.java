package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avjp extends ffhv implements ffjm {
    final /* synthetic */ avjw a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avjp(avjw avjwVar, int i, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = avjwVar;
        this.c = i;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avjp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final avjw avjwVar = this.a;
        final int i = this.c;
        final ConversationIdType conversationIdType = this.b;
        avjwVar.b.d("RbmToolstoneDatabaseOperations#calculateAndStoreToolstoneAppearance", new Runnable() { // from class: avjo
            @Override // java.lang.Runnable
            public final void run() {
                avjw.this.h(i, conversationIdType);
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new avjp(this.a, this.c, this.b, ffguVar);
    }
}
