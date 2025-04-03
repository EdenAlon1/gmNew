package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azlo extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Iterable c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azlo(Iterable iterable, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = iterable;
        this.d = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azlo) c((azmp) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            azmp azmpVar = (azmp) this.b;
            Iterable iterable = this.c;
            List list = this.d;
            this.a = 1;
            if (azmpVar.n(iterable, list, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azlo azloVar = new azlo(this.c, this.d, ffguVar);
        azloVar.b = obj;
        return azloVar;
    }
}
