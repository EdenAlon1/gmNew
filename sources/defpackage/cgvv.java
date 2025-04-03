package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgvv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgwa b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgvv(cgwa cgwaVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgwaVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgvv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cgwa cgwaVar = this.b;
            String str = this.c;
            this.a = 1;
            if (cgwaVar.b(str, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgvv(this.b, this.c, ffguVar);
    }
}
