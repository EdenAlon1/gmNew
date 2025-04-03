package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dwm b;
    final /* synthetic */ ffte c;
    final /* synthetic */ dwn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgc(dwn dwnVar, dwm dwmVar, ffte ffteVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = dwnVar;
        this.b = dwmVar;
        this.c = ffteVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dgc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dwn dwnVar = this.d;
            dwm dwmVar = this.b;
            this.a = 1;
            if (dwnVar.a(dwmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        ffte ffteVar = this.c;
        if (ffteVar != null) {
            ffteVar.hO();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dgc(this.d, this.b, this.c, ffguVar);
    }
}
