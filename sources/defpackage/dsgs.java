package defpackage;

import com.google.android.libraries.compose.ui.composable.HugoHostFragment;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsgs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ HugoHostFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsgs(HugoHostFragment hugoHostFragment, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = hugoHostFragment;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsgs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dsfg dsfgVar = this.b.am;
            if (dsfgVar == null) {
                ffkj.c("hugoManager");
                dsfgVar = null;
            }
            ffxx a = ffyy.a(new dsgr(((dsfv) dsfgVar).k, this.b));
            dsgo dsgoVar = new dsgo(this.b);
            this.a = 1;
            if (a.a(dsgoVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsgs(this.b, ffguVar);
    }
}
