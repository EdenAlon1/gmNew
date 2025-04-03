package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hab extends ffhv implements ffjm {
    /* synthetic */ boolean a;
    final /* synthetic */ gvi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hab(gvi gviVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = gviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((hab) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!this.a) {
            this.b.b();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        hab habVar = new hab(this.b, ffguVar);
        habVar.a = ((Boolean) obj).booleanValue();
        return habVar;
    }
}
