package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class laz extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ ldh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laz(ldh ldhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ldhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((laz) c((ldh) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ldh ldhVar = (ldh) this.a;
        boolean z = false;
        if ((ldhVar instanceof lah) && ldhVar.c <= this.b.c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        laz lazVar = new laz(this.b, ffguVar);
        lazVar.a = obj;
        return lazVar;
    }
}
