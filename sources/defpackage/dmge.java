package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmge extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ cyl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmge(cxj cxjVar, cyl cylVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = cylVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmge) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxj cxjVar = this.b;
            Float f = new Float(9.424778f);
            czz czzVar = new czz(3, this.c, dag.b(BasePaymentResult.ERROR_REQUEST_FAILED));
            this.a = 1;
            if (cxj.j(cxjVar, f, czzVar, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmge(this.b, this.c, ffguVar);
    }
}
