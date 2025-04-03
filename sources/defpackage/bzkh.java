package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzkh extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzka c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzkh(bzka bzkaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = bzkaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzkh) c((String) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ListenableFuture c = this.c.b.c((String) this.b);
        this.a = 1;
        Object c2 = fgfz.c(c, this);
        return c2 == ffhhVar ? ffhhVar : c2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bzkh bzkhVar = new bzkh(this.c, ffguVar);
        bzkhVar.b = obj;
        return bzkhVar;
    }
}
