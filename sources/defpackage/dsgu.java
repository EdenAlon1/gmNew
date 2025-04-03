package defpackage;

import com.google.android.libraries.compose.ui.composable.HugoHostFragment;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsgu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ HugoHostFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsgu(HugoHostFragment hugoHostFragment, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = hugoHostFragment;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsgu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            dsgt dsgtVar = new dsgt(this.b);
            this.a = 1;
            if (((dsfv) dsfgVar).k.a(dsgtVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsgu(this.b, ffguVar);
    }
}
