package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvwm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvwo b;
    final /* synthetic */ ambh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvwm(cvwo cvwoVar, ambh ambhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvwoVar;
        this.c = ambhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvwm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cvwo cvwoVar = this.b;
            ambh ambhVar = this.c;
            aqux aquxVar = (aqux) cvwoVar.d.a().c();
            this.a = 1;
            if (cvwoVar.b.a(ambhVar.a, aquxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvwm(this.b, this.c, ffguVar);
    }
}
