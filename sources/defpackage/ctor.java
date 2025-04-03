package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctor extends ffhv implements ffji {
    int a;
    final /* synthetic */ ctos b;
    final /* synthetic */ ffbr c;
    final /* synthetic */ errl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctor(ctos ctosVar, ffbr ffbrVar, errl errlVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = ctosVar;
        this.c = ffbrVar;
        this.d = errlVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ctos ctosVar = this.b;
            ffbr ffbrVar = this.c;
            errl errlVar = this.d;
            ffhd a = ekxi.a(ctosVar.a);
            ctoq ctoqVar = new ctoq(null, ffbrVar, errlVar);
            this.a = 1;
            obj = ffra.a(a, ctoqVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        emmp emmpVar = (emmp) obj;
        this.b.b = emmpVar;
        return emmpVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ctor(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
