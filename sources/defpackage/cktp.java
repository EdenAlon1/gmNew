package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cktp extends ffhv implements ffjm {
    final /* synthetic */ cktv a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ SelfIdentityId d;
    final /* synthetic */ cknh e;
    final /* synthetic */ aoku f;
    final /* synthetic */ ConversationIdType g;
    final /* synthetic */ String h;
    final /* synthetic */ List i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cktp(ffgu ffguVar, cktv cktvVar, String str, String str2, SelfIdentityId selfIdentityId, cknh cknhVar, aoku aokuVar, ConversationIdType conversationIdType, String str3, List list) {
        super(2, ffguVar);
        this.a = cktvVar;
        this.b = str;
        this.c = str2;
        this.d = selfIdentityId;
        this.e = cknhVar;
        this.f = aokuVar;
        this.g = conversationIdType;
        this.h = str3;
        this.i = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cktp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String str = this.b;
        String str2 = this.c;
        SelfIdentityId selfIdentityId = this.d;
        ConversationIdType conversationIdType = this.g;
        cktv cktvVar = this.a;
        return cktvVar.a.c("MmsGroupUpgradeDatabaseOperations#upgradeMmsGroupToRcs", new cktt(str, str2, selfIdentityId, this.e, this.f, conversationIdType, cktvVar, this.h, this.i));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cktp cktpVar = new cktp(ffguVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        cktpVar.j = obj;
        return cktpVar;
    }
}
