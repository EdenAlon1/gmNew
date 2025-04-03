package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ frc b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frb(frc frcVar, float f, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = frcVar;
        this.c = f;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((frb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            frc frcVar = this.b;
            fra fraVar = new fra(frcVar, this.c, null);
            this.a = 1;
            a = frcVar.c.a(dhy.a, fraVar, this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new frb(this.b, this.c, ffguVar);
    }
}
