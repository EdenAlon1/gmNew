package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aadu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aaee b;
    final /* synthetic */ aacn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aadu(aaee aaeeVar, aacn aacnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aaeeVar;
        this.c = aacnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aadu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aaee aaeeVar = this.b;
            aacn aacnVar = this.c;
            elfl H = aaeeVar.f.H(aacnVar.a.b(), true != aacnVar.b ? 4 : 3);
            H.getClass();
            this.a = 1;
            if (fgfz.c(H, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aadu(this.b, this.c, ffguVar);
    }
}
