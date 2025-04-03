package defpackage;

import android.content.pm.ProviderInfo;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqhh extends ffhv implements ffjm {
    final /* synthetic */ Uri a;
    final /* synthetic */ dqhs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqhh(Uri uri, dqhs dqhsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = uri;
        this.b = dqhsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqhh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ProviderInfo resolveContentProvider;
        ffci.b(obj);
        String authority = this.a.getAuthority();
        if (authority == null || (resolveContentProvider = this.b.g.getPackageManager().resolveContentProvider(authority, 0)) == null) {
            return null;
        }
        return resolveContentProvider.packageName;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqhh(this.a, this.b, ffguVar);
    }
}
