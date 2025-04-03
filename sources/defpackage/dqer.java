package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqer extends ffhv implements ffjm {
    int a;
    final /* synthetic */ RecyclerView b;
    final /* synthetic */ dqfc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqer(RecyclerView recyclerView, dqfc dqfcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = recyclerView;
        this.c = dqfcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqer) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            RecyclerView recyclerView = this.b;
            dqfc dqfcVar = this.c;
            ffxx d = dslh.d(recyclerView);
            dqeq dqeqVar = new dqeq(dqfcVar, null);
            this.a = 1;
            if (ffyk.b(d, dqeqVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqer(this.b, this.c, ffguVar);
    }
}
