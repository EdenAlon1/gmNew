package defpackage;

import android.content.pm.ProviderInfo;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drqh extends ffhv implements ffjm {
    final /* synthetic */ Uri a;
    final /* synthetic */ drqi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drqh(Uri uri, drqi drqiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = uri;
        this.b = drqiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drqh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String authority = this.a.getAuthority();
        ProviderInfo resolveContentProvider = authority != null ? this.b.a.getPackageManager().resolveContentProvider(authority, 0) : null;
        return Boolean.valueOf(ffkj.e(resolveContentProvider != null ? resolveContentProvider.packageName : null, this.b.a.getPackageName()));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drqh(this.a, this.b, ffguVar);
    }
}
