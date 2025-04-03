package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class och extends ffhv implements ffjm {
    /* synthetic */ boolean a;

    public och(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((och) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(!this.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        och ochVar = new och(ffguVar);
        ochVar.a = ((Boolean) obj).booleanValue();
        return ochVar;
    }
}
