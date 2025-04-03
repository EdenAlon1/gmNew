package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqk(dqq dqqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffwm ffwmVar = this.b.c;
        this.a = 1;
        Object a = ffsl.a(new dqf(ffwmVar, null), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqk(this.b, ffguVar);
    }
}
