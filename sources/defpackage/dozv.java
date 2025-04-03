package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dozv extends ffhv implements ffjm {
    final /* synthetic */ dpaa a;
    final /* synthetic */ dpae b;
    final /* synthetic */ Uri c;
    final /* synthetic */ Bundle d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dozv(dpaa dpaaVar, dpae dpaeVar, Uri uri, Bundle bundle, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dpaaVar;
        this.b = dpaeVar;
        this.c = uri;
        this.d = bundle;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dozv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return dpaa.b(this.b, "ofList for " + dqlb.a(this.c) + " with " + this.d, false, new dozu(this.a, this.c, this.d));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dozv(this.a, this.b, this.c, this.d, ffguVar);
    }
}
