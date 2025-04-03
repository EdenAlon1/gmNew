package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djsx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ djsz b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djsx(ffgu ffguVar, djsz djszVar) {
        super(2, ffguVar);
        this.b = djszVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djsx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            djsz djszVar = this.b;
            this.a = 1;
            Object a = ffra.a(ekxi.a(djszVar.d), new djsy(null, djszVar), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        djsx djsxVar = new djsx(ffguVar, this.b);
        djsxVar.c = obj;
        return djsxVar;
    }
}
