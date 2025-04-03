package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsm b;
    final /* synthetic */ fchv c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsj(ffgu ffguVar, cpsm cpsmVar, fchv fchvVar) {
        super(2, ffguVar);
        this.b = cpsmVar;
        this.c = fchvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cpsm cpsmVar = this.b;
        fchv fchvVar = this.c;
        this.a = 1;
        Object v = essz.v(cpsmVar, fchvVar, this);
        return v == ffhhVar ? ffhhVar : v;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpsj cpsjVar = new cpsj(ffguVar, this.b, this.c);
        cpsjVar.d = obj;
        return cpsjVar;
    }
}
