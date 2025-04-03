package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewy extends ffhv implements ffjn {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ ffsk c;
    final /* synthetic */ hho d;
    final /* synthetic */ dwn e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewy(ffsk ffskVar, hho hhoVar, dwn dwnVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = ffskVar;
        this.d = hhoVar;
        this.e = dwnVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((iak) obj2).a;
        ewy ewyVar = new ewy(this.c, this.d, this.e, (ffgu) obj3);
        ewyVar.f = (dqt) obj;
        ewyVar.b = j;
        return ewyVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [dqt, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r11 = this.f;
            ffqy.d(this.c, null, null, new eww(this.d, this.b, this.e, null), 3);
            this.a = 1;
            obj = r11.b(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ffqy.d(this.c, null, null, new ewx(this.d, ((Boolean) obj).booleanValue(), this.e, null), 3);
        return ffcu.a;
    }
}
