package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ohq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ oia b;
    final /* synthetic */ ffwm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohq(oia oiaVar, ffwm ffwmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = oiaVar;
        this.c = ffwmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ohq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            oia oiaVar = this.b;
            ohp ohpVar = new ohp(this.c);
            this.a = 1;
            if (oiaVar.c.a(ohpVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ohq(this.b, this.c, ffguVar);
    }
}
