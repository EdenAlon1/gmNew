package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsm b;
    final /* synthetic */ fchk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsf(ffgu ffguVar, cpsm cpsmVar, fchk fchkVar) {
        super(2, ffguVar);
        this.b = cpsmVar;
        this.c = fchkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        fchk fchkVar = this.c;
        this.a = 1;
        Object r = essz.r(cpsmVar, fchkVar, this);
        return r == ffhhVar ? ffhhVar : r;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpsf cpsfVar = new cpsf(ffguVar, this.b, this.c);
        cpsfVar.d = obj;
        return cpsfVar;
    }
}
