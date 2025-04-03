package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtgd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtgp b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtgd(dtgp dtgpVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtgpVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtgd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dtgp dtgpVar = this.b;
            Uri uri = this.c;
            this.a = 1;
            if (dtgpVar.d.a.b(uri) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtgd(this.b, this.c, ffguVar);
    }
}
