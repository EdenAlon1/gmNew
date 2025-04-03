package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgcx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgdb b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgcx(cgdb cgdbVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgdbVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgcx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cgdb cgdbVar = this.b;
        eisx eisxVar = this.c;
        this.a = 1;
        Object b = cgdbVar.b(eisxVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgcx(this.b, this.c, ffguVar);
    }
}
