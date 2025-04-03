package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtgf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtgp b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtgf(dtgp dtgpVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtgpVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtgf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            drqm drqmVar = this.b.d.a;
            Uri uri = this.c;
            this.a = 1;
            if (drqmVar.b(uri) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtgf(this.b, this.c, ffguVar);
    }
}
