package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amsq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amta b;
    final /* synthetic */ aqux c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amsq(amta amtaVar, aqux aquxVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amtaVar;
        this.c = aquxVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amsq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        amta amtaVar = this.b;
        aqux aquxVar = this.c;
        int i2 = this.d;
        this.a = 1;
        Object h = amtaVar.h(amtaVar.c.a, aquxVar, i2, this);
        return h == ffhhVar ? ffhhVar : h;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amsq(this.b, this.c, this.d, ffguVar);
    }
}
