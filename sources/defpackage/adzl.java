package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adzl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adzm b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adzl(adzm adzmVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = adzmVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adzl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            adzm adzmVar = this.b;
            adzk adzkVar = new adzk(this.c);
            this.a = 1;
            if (fgct.g((fgct) adzmVar.c.a, adzkVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adzl(this.b, this.c, ffguVar);
    }
}
