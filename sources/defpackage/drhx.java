package defpackage;

import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drhx extends ffhv implements ffjm {
    final /* synthetic */ drie a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drhx(drie drieVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = drieVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drhx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        drie drieVar = this.a;
        esgx esgxVar = drieVar.e;
        if (esgxVar != null) {
            drieVar.q(esgxVar);
        }
        drie drieVar2 = this.a;
        ComposeView composeView = null;
        drieVar2.e = null;
        ComposeView composeView2 = drieVar2.d;
        if (composeView2 == null) {
            ffkj.c("contentComposeView");
        } else {
            composeView = composeView2;
        }
        composeView.a(new hpw(529805232, true, new drid(drieVar2)));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drhx(this.a, ffguVar);
    }
}
