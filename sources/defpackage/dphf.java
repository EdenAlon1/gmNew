package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dphf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dphf(dpif dpifVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpifVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dphf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpif dpifVar = this.b;
            dpqm a = dpifVar.a();
            drnn drnnVar = dpifVar.j;
            drnnVar.getClass();
            Uri parse = Uri.parse(drnnVar.f());
            parse.getClass();
            this.a = 1;
            if (a.g(parse, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.j = null;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dphf(this.b, ffguVar);
    }
}
