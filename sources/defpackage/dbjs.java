package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbjs extends ffhv implements ffji {
    int a;
    final /* synthetic */ dbjv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbjs(dbjv dbjvVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dbjvVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dbjv dbjvVar = this.b;
            ffhd a = ekxi.a(dbjvVar.c);
            dbjr dbjrVar = new dbjr(null, dbjvVar);
            this.a = 1;
            if (ffra.a(a, dbjrVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbjs(this.b, (ffgu) obj).b(ffcu.a);
    }
}
