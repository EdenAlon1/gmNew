package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dozz extends ffhv implements ffjm {
    final /* synthetic */ dpaa a;
    final /* synthetic */ dpae b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dozz(dpaa dpaaVar, dpae dpaeVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dpaaVar;
        this.b = dpaeVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dozz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dpaa dpaaVar = this.a;
        Uri uri = this.c;
        String a = dqlb.a(uri);
        dozy dozyVar = new dozy(dpaaVar, uri);
        return dpaa.b(this.b, "ofSingle for ".concat(a), true, dozyVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dozz(this.a, this.b, this.c, ffguVar);
    }
}
