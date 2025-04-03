package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccwi extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ccwm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccwi(ccwm ccwmVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = ccwmVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ccwi ccwiVar = new ccwi(this.c, (ffgu) obj3);
        ccwiVar.b = (String) obj2;
        return ccwiVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl n = this.c.a.n((String) this.b);
            this.a = 1;
            obj = fgfz.c(n, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ((eswr) obj).c;
    }
}
