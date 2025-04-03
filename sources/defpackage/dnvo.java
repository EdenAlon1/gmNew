package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnvo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ doos c;
    final /* synthetic */ Set d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnvo(cxj cxjVar, doos doosVar, Set set, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = doosVar;
        this.d = set;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnvo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxj cxjVar = this.b;
            Float f = new Float(1.0f);
            doos doosVar = this.c;
            dooq dooqVar = doosVar.q;
            cym cymVar = doosVar.r.d;
            final Set set = this.d;
            final String str = this.e;
            dbu c = cxu.c(100, 0, cymVar, 2);
            ffji ffjiVar = new ffji() { // from class: dnvn
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    cxj cxjVar2 = (cxj) obj2;
                    if (((Number) cxjVar2.d()).floatValue() == ((Number) cxjVar2.c()).floatValue()) {
                        set.remove(str);
                    }
                    return ffcu.a;
                }
            };
            this.a = 1;
            if (cxj.j(cxjVar, f, c, ffjiVar, this, 4) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dnvo(this.b, this.c, this.d, this.e, ffguVar);
    }
}
