package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zzq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zzw b;
    final /* synthetic */ alyv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(zzw zzwVar, alyv alyvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zzwVar;
        this.c = alyvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zzq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            zzw zzwVar = this.b;
            alyv alyvVar = this.c;
            this.a = 1;
            if (zzwVar.a(alyvVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zzq(this.b, this.c, ffguVar);
    }
}
