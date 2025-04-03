package defpackage;

import android.view.animation.OvershootInterpolator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dofa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ float c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dofa(cxj cxjVar, float f, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = f;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dofa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxj cxjVar = this.b;
            Float f = new Float(this.c);
            dbu dbuVar = new dbu(275, this.d, new cym() { // from class: doez
                @Override // defpackage.cym
                public final float a(float f2) {
                    return new OvershootInterpolator(2.4f).getInterpolation(f2);
                }
            });
            this.a = 1;
            if (cxj.j(cxjVar, f, dbuVar, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dofa(this.b, this.c, this.d, ffguVar);
    }
}
