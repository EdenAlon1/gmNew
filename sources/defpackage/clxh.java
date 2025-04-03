package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clxh extends ffhv implements ffjm {
    final /* synthetic */ buxm a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clxh(ffgu ffguVar, buxm buxmVar) {
        super(2, ffguVar);
        this.a = buxmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clxh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.h();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        clxh clxhVar = new clxh(ffguVar, this.a);
        clxhVar.b = obj;
        return clxhVar;
    }
}
