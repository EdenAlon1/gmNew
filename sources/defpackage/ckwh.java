package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ckwi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckwh(ckwi ckwiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ckwiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckwh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ckwi ckwiVar = this.b;
        this.a = 1;
        Object b = ckwiVar.b(true, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckwh(this.b, ffguVar);
    }
}
