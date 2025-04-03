package defpackage;

import com.google.android.libraries.compose.ui.composable.HugoHostFragment;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dshk extends ffhv implements ffjm {
    final /* synthetic */ ixm a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dshk(ixm ixmVar, ffjm ffjmVar, Object obj, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ixmVar;
        this.b = ffjmVar;
        this.c = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dshk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        HugoHostFragment hugoHostFragment = (HugoHostFragment) this.a.a;
        if (hugoHostFragment != null) {
            this.b.a(hugoHostFragment, this.c);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dshk(this.a, this.b, this.c, ffguVar);
    }
}
