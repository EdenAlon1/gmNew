package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceon extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceop b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceon(ffgu ffguVar, ceop ceopVar) {
        super(2, ffguVar);
        this.b = ceopVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceon) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        this.a = 1;
        Object a = ceny.a();
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceon ceonVar = new ceon(ffguVar, this.b);
        ceonVar.c = obj;
        return ceonVar;
    }
}
