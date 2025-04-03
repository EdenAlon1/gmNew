package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fra extends ffhv implements ffji {
    int a;
    final /* synthetic */ frc b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fra(frc frcVar, float f, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = frcVar;
        this.c = f;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            frc frcVar = this.b;
            float f = this.c;
            float c = frcVar.d.c();
            fqz fqzVar = new fqz(frcVar);
            this.a = 1;
            if (dap.h(c, f, null, fqzVar, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new fra(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
