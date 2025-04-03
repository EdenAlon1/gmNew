package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class laj extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laj(List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((laj) c((lat) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            lat latVar = (lat) this.b;
            List list = this.c;
            lan lanVar = lao.a;
            this.a = 1;
            if (lanVar.a(list, latVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        laj lajVar = new laj(this.c, ffguVar);
        lajVar.b = obj;
        return lajVar;
    }
}
