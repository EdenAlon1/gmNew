package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azot extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azow b;
    final /* synthetic */ awui c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azot(azow azowVar, awui awuiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azowVar;
        this.c = awuiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azot) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        azow azowVar = this.b;
        awui awuiVar = this.c;
        this.a = 1;
        Object d = azowVar.a.d(awuiVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azot(this.b, this.c, ffguVar);
    }
}
