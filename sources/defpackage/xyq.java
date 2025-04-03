package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyq extends ffhv implements ffjm {
    final /* synthetic */ xyr a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyq(ffgu ffguVar, xyr xyrVar, String str) {
        super(2, ffguVar);
        this.a = xyrVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xyq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.a.b(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xyq xyqVar = new xyq(ffguVar, this.a, this.b);
        xyqVar.c = obj;
        return xyqVar;
    }
}
