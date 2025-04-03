package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtfp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtfs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtfp(dtfs dtfsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtfsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtfp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dtfs dtfsVar;
        Uri uri;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0 && (uri = (dtfsVar = this.b).c) != null) {
            drqm a = dtfsVar.a();
            this.a = 1;
            if (a.b(uri) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtfp(this.b, ffguVar);
    }
}
