package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdbg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdbf b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdbg(cdbf cdbfVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cdbfVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdbg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cdbf cdbfVar = this.b;
            int i2 = this.c;
            this.a = 1;
            if (cdbfVar.b(i2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cdbg(this.b, this.c, ffguVar);
    }
}
