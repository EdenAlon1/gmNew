package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvtu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvsj b;
    final /* synthetic */ dmyw c;
    final /* synthetic */ List d;
    final /* synthetic */ eey e;
    final /* synthetic */ olu f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvtu(cvsj cvsjVar, dmyw dmywVar, List list, eey eeyVar, olu oluVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvsjVar;
        this.c = dmywVar;
        this.d = list;
        this.e = eeyVar;
        this.f = oluVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvtu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final eey eeyVar = this.e;
            cvtq cvtqVar = new cvtq(ffyy.a(new cvtt(hkt.a(new ffix() { // from class: cvtn
                @Override // defpackage.ffix
                public final Object invoke() {
                    return eey.this.d().i();
                }
            }), this.f, this.c, this.d)));
            this.a = 1;
            if (fgbj.a(cvtqVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        cvsj cvsjVar = this.b;
        boolean z = !this.c.b.isEmpty();
        List list = this.d;
        cvsjVar.i.a(Boolean.valueOf(z), Boolean.valueOf(!list.isEmpty()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvtu(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
