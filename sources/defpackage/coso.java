package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coso extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cosp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coso(cosp cospVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cospVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coso) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cosp cospVar = this.b;
        this.a = 1;
        Object a = cospVar.a(this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new coso(this.b, ffguVar);
    }
}
