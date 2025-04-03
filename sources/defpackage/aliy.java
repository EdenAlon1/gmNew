package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aliy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ alja b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ SelfIdentityId d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aliy(alja aljaVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aljaVar;
        this.c = conversationIdType;
        this.d = selfIdentityId;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aliy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            alja aljaVar = this.b;
            ConversationIdType conversationIdType = this.c;
            SelfIdentityId selfIdentityId = this.d;
            int i2 = this.e;
            this.a = 1;
            if (aljaVar.b(conversationIdType, selfIdentityId, i2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aliy(this.b, this.c, this.d, this.e, ffguVar);
    }
}
