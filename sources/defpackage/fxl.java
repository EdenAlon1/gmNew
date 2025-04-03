package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fxv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxl(fxv fxvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fxvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fxl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fxv fxvVar = this.b;
            if (fxvVar.b) {
                fxvVar.a.j(1);
            }
            fxv fxvVar2 = this.b;
            ftb ftbVar = fxvVar2.a;
            cxt cxtVar = fxvVar2.d;
            this.a = 1;
            Object a = ftbVar.f.a(dhy.c, new fsz(ftbVar, ftbVar.a(guk.b(ftbVar.f(), 0) ? ftbVar.c : ftbVar.d), cxtVar, null), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fxl(this.b, ffguVar);
    }
}
