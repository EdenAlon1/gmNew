package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class delb extends ffhv implements ffjm {
    final /* synthetic */ delf a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public delb(ffgu ffguVar, delf delfVar) {
        super(2, ffguVar);
        this.a = delfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((delb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        long c = ((csxu) this.a.b.b()).c("android_id", 0L);
        if (c == 0) {
            return null;
        }
        return new Long(c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        delb delbVar = new delb(ffguVar, this.a);
        delbVar.b = obj;
        return delbVar;
    }
}
