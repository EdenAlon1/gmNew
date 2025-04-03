package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yeb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yec b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yeb(ffgu ffguVar, yec yecVar) {
        super(2, ffguVar);
        this.b = yecVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yeb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            yec yecVar = this.b;
            this.a = 1;
            if (yecVar.a(null, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yeb yebVar = new yeb(ffguVar, this.b);
        yebVar.c = obj;
        return yebVar;
    }
}
