package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dozx extends ffhv implements ffjm {
    final /* synthetic */ String[] a;
    final /* synthetic */ String[] b;
    final /* synthetic */ int c;
    final /* synthetic */ Uri d;
    final /* synthetic */ String e;
    final /* synthetic */ dpaa f;
    final /* synthetic */ dpae g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dozx(String[] strArr, String[] strArr2, int i, Uri uri, String str, dpaa dpaaVar, dpae dpaeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = strArr;
        this.b = strArr2;
        this.c = i;
        this.d = uri;
        this.e = str;
        this.f = dpaaVar;
        this.g = dpaeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dozx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        int i = dpaa.c;
        String str = ffdo.R(this.b, ", ", 62).concat(" DESC") + " LIMIT 20 OFFSET " + this.c;
        return dpaa.b(this.g, "ofList for " + dqlb.a(this.d) + " with " + this.e + ", null, " + str, false, new dozw(this.f, this.d, this.e, str));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dozx(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ffguVar);
    }
}
