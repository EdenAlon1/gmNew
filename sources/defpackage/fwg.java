package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fwg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ hss b;
    final /* synthetic */ dwn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwg(dwn dwnVar, hss hssVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dwnVar;
        this.b = hssVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fwg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dwn dwnVar = this.c;
            fwf fwfVar = new fwf(this.b);
            this.a = 1;
            if (fgct.g((fgct) dwnVar.a, fwfVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fwg(this.c, this.b, ffguVar);
    }
}
