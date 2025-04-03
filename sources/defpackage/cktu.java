package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cktu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cktv b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ cknh f;
    final /* synthetic */ String g;
    final /* synthetic */ aoku h;
    final /* synthetic */ SelfIdentityId i;
    final /* synthetic */ List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cktu(cktv cktvVar, ConversationIdType conversationIdType, String str, String str2, cknh cknhVar, String str3, aoku aokuVar, SelfIdentityId selfIdentityId, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cktvVar;
        this.c = conversationIdType;
        this.d = str;
        this.e = str2;
        this.f = cknhVar;
        this.g = str3;
        this.h = aokuVar;
        this.i = selfIdentityId;
        this.j = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cktu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cktv cktvVar = this.b;
        ConversationIdType conversationIdType = this.c;
        String str = this.d;
        String str2 = this.e;
        cknh cknhVar = this.f;
        String str3 = this.g;
        aoku aokuVar = this.h;
        SelfIdentityId selfIdentityId = this.i;
        List list = this.j;
        this.a = 1;
        Object b = cktvVar.b(conversationIdType, str, str2, cknhVar, str3, aokuVar, selfIdentityId, list, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cktu(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ffguVar);
    }
}
