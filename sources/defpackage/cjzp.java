package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjzp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ckac b;
    final /* synthetic */ SelfIdentityId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjzp(ckac ckacVar, SelfIdentityId selfIdentityId, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ckacVar;
        this.c = selfIdentityId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjzp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object k;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            k = ((ffch) obj).a;
        } else {
            ckac ckacVar = this.b;
            SelfIdentityId selfIdentityId = this.c;
            this.a = 1;
            k = ckacVar.k(selfIdentityId, 1, this);
            if (k == ffhhVar) {
                return ffhhVar;
            }
        }
        if (true == (k instanceof ffcg)) {
            k = null;
        }
        return Optional.ofNullable(k);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjzp(this.b, this.c, ffguVar);
    }
}
