package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfl extends ffhv implements ffjn {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ dfp c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfl(dfp dfpVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = dfpVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((iak) obj2).a;
        dfl dflVar = new dfl(this.c, (ffgu) obj3);
        dflVar.d = (dqt) obj;
        dflVar.b = j;
        return dflVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [dqt, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r6 = this.d;
            long j = this.b;
            dfp dfpVar = this.c;
            if (((ddx) dfpVar).b) {
                this.a = 1;
                if (dfpVar.f(r6, j, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        }
        return ffcu.a;
    }
}
