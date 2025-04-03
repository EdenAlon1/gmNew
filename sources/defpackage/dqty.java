package defpackage;

import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqty extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqtz b;
    final /* synthetic */ TabLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqty(dqtz dqtzVar, TabLayout tabLayout, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqtzVar;
        this.c = tabLayout;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqty) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqth dqthVar = this.b.aq;
            if (dqthVar == null) {
                ffkj.c("views");
                dqthVar = null;
            }
            ffxx d = dslh.d(dqthVar.a);
            dqtx dqtxVar = new dqtx(this.c, this.b);
            this.a = 1;
            if (d.a(dqtxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqty(this.b, this.c, ffguVar);
    }
}
