package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dphc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpif b;
    final /* synthetic */ dpqk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dphc(dpif dpifVar, dpqk dpqkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpifVar;
        this.c = dpqkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dphc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpif dpifVar = this.b;
            dpqk dpqkVar = this.c;
            dpqm a = dpifVar.a();
            Uri parse = Uri.parse(((dpqj) dpqkVar).a.f());
            parse.getClass();
            this.a = 1;
            if (a.g(parse, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dphc(this.b, this.c, ffguVar);
    }
}
