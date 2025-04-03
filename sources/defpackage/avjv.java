package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avjv extends ffhv implements ffjm {
    final /* synthetic */ avjw a;
    final /* synthetic */ boolean b;
    final /* synthetic */ avji c;
    final /* synthetic */ ConversationIdType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avjv(avjw avjwVar, boolean z, avji avjiVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = avjwVar;
        this.b = z;
        this.c = avjiVar;
        this.d = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avjv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final avji avjiVar = this.c;
        final avjw avjwVar = this.a;
        final boolean z = this.b;
        final ConversationIdType conversationIdType = this.d;
        avjwVar.b.d("RbmToolstoneDatabaseOperations#persistToolstoneState", new Runnable() { // from class: avju
            @Override // java.lang.Runnable
            public final void run() {
                ConversationIdType conversationIdType2 = conversationIdType;
                avji avjiVar2 = avjiVar;
                avjw avjwVar2 = avjwVar;
                if (z && avjiVar2 == avji.HIDE) {
                    avjwVar2.f(conversationIdType2);
                } else {
                    avjwVar2.d(conversationIdType2, avjiVar2);
                }
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new avjv(this.a, this.b, this.c, this.d, ffguVar);
    }
}
