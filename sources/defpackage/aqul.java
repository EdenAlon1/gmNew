package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqul extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqum b;
    final /* synthetic */ SelfIdentityId c;
    final /* synthetic */ aoku d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqul(aqum aqumVar, SelfIdentityId selfIdentityId, aoku aokuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqumVar;
        this.c = selfIdentityId;
        this.d = aokuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqul) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl d = this.b.d(this.c);
            this.a = 1;
            obj = fgfz.c(d, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return null;
        }
        ((aqya) this.b.e.b()).a(((aqux) optional.get()).b(), this.d);
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqul(this.b, this.c, this.d, ffguVar);
    }
}
