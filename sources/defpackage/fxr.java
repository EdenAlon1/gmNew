package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fxv b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxr(fxv fxvVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fxvVar;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fxr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fxv fxvVar = this.b;
            long j = this.c;
            ftb ftbVar = fxvVar.a;
            float b = iak.b(j);
            float c = iak.c(j);
            float b2 = fxvVar.b();
            boolean z = fxvVar.b;
            long f = fxvVar.f();
            cxt cxtVar = fxvVar.d;
            this.a = 1;
            if (guj.h(ftbVar, b, c, b2, z, f, cxtVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fxr(this.b, this.c, ffguVar);
    }
}
