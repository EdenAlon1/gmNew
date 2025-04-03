package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqer extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqes b;
    final /* synthetic */ aqvj c;
    final /* synthetic */ BugleConversationId d;
    final /* synthetic */ aqge e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqer(aqes aqesVar, aqvj aqvjVar, BugleConversationId bugleConversationId, aqge aqgeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqesVar;
        this.c = aqvjVar;
        this.d = bugleConversationId;
        this.e = aqgeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqer) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        aqes aqesVar = this.b;
        aqvj aqvjVar = this.c;
        BugleConversationId bugleConversationId = this.d;
        aqge aqgeVar = this.e;
        this.a = 1;
        if (aqesVar.b(aqvjVar, bugleConversationId, aqgeVar, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqer(this.b, this.c, this.d, this.e, ffguVar);
    }
}
