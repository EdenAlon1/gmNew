package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzpt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bzpx b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ aqux d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzpt(bzpx bzpxVar, ConversationIdType conversationIdType, aqux aquxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzpxVar;
        this.c = conversationIdType;
        this.d = aquxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzpt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bzpx bzpxVar = this.b;
            ConversationIdType conversationIdType = this.c;
            aqux aquxVar = this.d;
            this.a = 1;
            if (bzpxVar.d(conversationIdType, aquxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzpt(this.b, this.c, this.d, ffguVar);
    }
}
