package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oku extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffwm b;
    final /* synthetic */ ffjm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oku(ffwm ffwmVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffwmVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oku) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ola olaVar = new ola((ffsk) this.d, this.b);
            ffjm ffjmVar = this.c;
            this.a = 1;
            if (ffjmVar.a(olaVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        oku okuVar = new oku(this.b, this.c, ffguVar);
        okuVar.d = obj;
        return okuVar;
    }
}
