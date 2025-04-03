package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccus extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ccvj b;
    final /* synthetic */ engw c;
    final /* synthetic */ Optional d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccus(ccvj ccvjVar, engw engwVar, Optional optional, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ccvjVar;
        this.c = engwVar;
        this.d = optional;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccus) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        String b = cdat.d.b(this.b.d);
        ccvj ccvjVar = this.b;
        ccur ccurVar = new ccur(ccvjVar, this.c, this.d, null);
        this.a = 1;
        Object a = albs.a(ccvjVar.b, b, ccurVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ccus(this.b, this.c, this.d, ffguVar);
    }
}
