package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fje extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fkk b;
    final /* synthetic */ dwm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fje(fkk fkkVar, dwm dwmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fkkVar;
        this.c = dwmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fje) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fkk fkkVar = this.b;
            dwm dwmVar = this.c;
            this.a = 1;
            if (fkkVar.a(dwmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fje(this.b, this.c, ffguVar);
    }
}
