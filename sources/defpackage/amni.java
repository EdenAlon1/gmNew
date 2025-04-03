package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amni extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amnr b;
    final /* synthetic */ azcr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amni(amnr amnrVar, azcr azcrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amnrVar;
        this.c = azcrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amni) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        amnr amnrVar = this.b;
        azcr azcrVar = this.c;
        this.a = 1;
        Object d = amnrVar.d(azcrVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amni(this.b, this.c, ffguVar);
    }
}
