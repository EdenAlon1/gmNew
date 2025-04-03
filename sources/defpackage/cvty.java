package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvty extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eey b;
    final /* synthetic */ cvsj c;
    final /* synthetic */ Context d;
    final /* synthetic */ View e;
    final /* synthetic */ jdt f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvty(eey eeyVar, cvsj cvsjVar, jdt jdtVar, Context context, View view, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eeyVar;
        this.c = cvsjVar;
        this.f = jdtVar;
        this.d = context;
        this.e = view;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvty) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final eey eeyVar = this.b;
            ffxx a = hkt.a(new ffix() { // from class: cvtw
                @Override // defpackage.ffix
                public final Object invoke() {
                    return Boolean.valueOf(eey.this.i());
                }
            });
            cvtx cvtxVar = new cvtx(this.c, this.f, this.d, this.e);
            this.a = 1;
            if (a.a(cvtxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvty(this.b, this.c, this.f, this.d, this.e, ffguVar);
    }
}
