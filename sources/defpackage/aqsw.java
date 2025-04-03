package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqsw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqsw(aqte aqteVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqteVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqsw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aqte aqteVar = this.b;
        this.a = 1;
        Object i2 = aqteVar.i(this);
        return i2 == ffhhVar ? ffhhVar : i2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqsw(this.b, ffguVar);
    }
}
