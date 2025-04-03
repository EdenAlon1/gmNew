package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsm b;
    final /* synthetic */ fcgs c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsb(ffgu ffguVar, cpsm cpsmVar, fcgs fcgsVar) {
        super(2, ffguVar);
        this.b = cpsmVar;
        this.c = fcgsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        fcgs fcgsVar = this.c;
        this.a = 1;
        Object n = essz.n(cpsmVar, fcgsVar, this);
        return n == ffhhVar ? ffhhVar : n;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpsb cpsbVar = new cpsb(ffguVar, this.b, this.c);
        cpsbVar.d = obj;
        return cpsbVar;
    }
}
