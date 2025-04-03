package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjgd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjge b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjgd(cjge cjgeVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjgeVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjgd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjeo cjeoVar = (cjeo) ((Optional) this.b.a.b()).get();
            this.a = 1;
            obj = cjeoVar.d(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ffkj.e(this.c, (String) obj);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjgd(this.b, this.c, ffguVar);
    }
}
