package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fxv b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxn(fxv fxvVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fxvVar;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fxn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.b.e += iak.b(this.c);
            this.b.f += iak.c(this.c);
            fxv fxvVar = this.b;
            ftb ftbVar = fxvVar.a;
            float b = fxvVar.f - kaa.b(fxvVar.f());
            float a = this.b.e - kaa.a(r7.f());
            fxv fxvVar2 = this.b;
            float a2 = guj.a(b, a);
            cxt cxtVar = fxvVar2.d;
            this.a = 1;
            if (ftbVar.g(a2, cxtVar, false, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        fxv fxvVar3 = this.b;
        guj.u(fxvVar3.a, fxvVar3.e, fxvVar3.f, fxvVar3.b(), fxvVar3.f());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fxn(this.b, this.c, ffguVar);
    }
}
