package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alpx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ alqf b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alpx(ffgu ffguVar, alqf alqfVar, int i, boolean z) {
        super(2, ffguVar);
        this.b = alqfVar;
        this.c = i;
        this.d = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alpx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            alqf alqfVar = this.b;
            int i2 = this.c;
            boolean z = this.d;
            this.a = 1;
            if (alqfVar.d(i2, z, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        alpx alpxVar = new alpx(ffguVar, this.b, this.c, this.d);
        alpxVar.e = obj;
        return alpxVar;
    }
}
