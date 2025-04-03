package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjzy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ckac b;
    final /* synthetic */ SelfIdentityId c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjzy(ffgu ffguVar, ckac ckacVar, SelfIdentityId selfIdentityId) {
        super(2, ffguVar);
        this.b = ckacVar;
        this.c = selfIdentityId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjzy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object k;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
            k = ((ffch) obj).a;
        } else {
            ffci.b(obj);
            ckac ckacVar = this.b;
            SelfIdentityId selfIdentityId = this.c;
            this.a = 1;
            k = ckacVar.k(selfIdentityId, 2, this);
            if (k == ffhhVar) {
                return ffhhVar;
            }
        }
        ffci.b(k);
        return k;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjzy cjzyVar = new cjzy(ffguVar, this.b, this.c);
        cjzyVar.d = obj;
        return cjzyVar;
    }
}
