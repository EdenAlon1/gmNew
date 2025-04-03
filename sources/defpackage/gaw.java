package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gaw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eey b;
    final /* synthetic */ int c;
    final /* synthetic */ ffmj d;
    final /* synthetic */ haq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaw(eey eeyVar, int i, ffmj ffmjVar, haq haqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eeyVar;
        this.c = i;
        this.d = ffmjVar;
        this.e = haqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gaw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eey eeyVar = this.b;
            int i2 = this.c - this.d.a;
            haq haqVar = this.e;
            this.a = 1;
            if (eey.n(eeyVar, ((i2 * 12) + haqVar.b) - 1, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gaw(this.b, this.c, this.d, this.e, ffguVar);
    }
}
