package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckvy extends ffhv implements ffjm {
    final /* synthetic */ ckwi a;
    final /* synthetic */ SelfIdentityId b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckvy(ckwi ckwiVar, SelfIdentityId selfIdentityId, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ckwiVar;
        this.b = selfIdentityId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckvy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.j.f(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckvy(this.a, this.b, ffguVar);
    }
}
