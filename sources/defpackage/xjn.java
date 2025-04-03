package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjn extends ffhv implements ffjm {
    final /* synthetic */ arae a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjn(ffgu ffguVar, arae araeVar, String str) {
        super(2, ffguVar);
        this.a = araeVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xjn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        arae araeVar = this.a;
        if (araeVar != null) {
            return araeVar.a(this.b);
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xjn xjnVar = new xjn(ffguVar, this.a, this.b);
        xjnVar.c = obj;
        return xjnVar;
    }
}
