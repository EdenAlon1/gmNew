package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceng extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cenh b;
    final /* synthetic */ cenl c;
    final /* synthetic */ Exception d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceng(cenh cenhVar, cenl cenlVar, Exception exc, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cenhVar;
        this.c = cenlVar;
        this.d = exc;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceng) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cenh cenhVar = this.b;
            cenl cenlVar = this.c;
            Exception exc = this.d;
            this.a = 1;
            if (cenhVar.b(cenlVar, exc, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ceng(this.b, this.c, this.d, ffguVar);
    }
}
