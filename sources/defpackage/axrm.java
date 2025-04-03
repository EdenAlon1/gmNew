package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axrm extends ffhv implements ffjm {
    final /* synthetic */ ffsk a;
    final /* synthetic */ long b;
    final /* synthetic */ ffxx[] c;
    final /* synthetic */ boolean[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axrm(ffsk ffskVar, long j, ffxx[] ffxxVarArr, boolean[] zArr, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ffskVar;
        this.b = j;
        this.c = ffxxVarArr;
        this.d = zArr;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axrm) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        axol.k(this.a, null, new axrl(this.b, this.c, this.d, null), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axrm(this.a, this.b, this.c, this.d, ffguVar);
    }
}
