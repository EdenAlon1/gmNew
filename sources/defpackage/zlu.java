package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zlu extends ffhv implements ffjm {
    /* synthetic */ boolean a;

    public zlu(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((zlu) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        zlu zluVar = new zlu(ffguVar);
        zluVar.a = ((Boolean) obj).booleanValue();
        return zluVar;
    }
}
