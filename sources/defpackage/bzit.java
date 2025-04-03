package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzit extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzid c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzit(bzid bzidVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = bzidVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzit) c((eisx) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ListenableFuture c = ((eixo) this.c.b.b()).c((eisx) this.b);
        this.a = 1;
        Object c2 = fgfz.c(c, this);
        return c2 == ffhhVar ? ffhhVar : c2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bzit bzitVar = new bzit(this.c, ffguVar);
        bzitVar.b = obj;
        return bzitVar;
    }
}
