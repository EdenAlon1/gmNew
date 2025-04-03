package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cahx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cahr b;
    final /* synthetic */ caia c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cahx(cahr cahrVar, caia caiaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cahrVar;
        this.c = caiaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cahx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cahr cahrVar = this.b;
        if ((cahrVar.b & 1) == 0) {
            throw new IllegalArgumentException("Local identity is not set for FTD clean up handler, aborting.");
        }
        caia caiaVar = this.c;
        this.a = 1;
        Object m = caiaVar.m(cahrVar, this);
        return m == ffhhVar ? ffhhVar : m;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cahx(this.b, this.c, ffguVar);
    }
}
