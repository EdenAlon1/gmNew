package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqwc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqwd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqwc(dqwd dqwdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqwdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqwc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dqwd dqwdVar = this.b;
        this.a = 1;
        Object b = dqwdVar.a.b(18, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqwc(this.b, ffguVar);
    }
}
