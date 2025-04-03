package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jrv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ jrw b;
    final /* synthetic */ jsd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrv(jrw jrwVar, jsd jsdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = jrwVar;
        this.c = jsdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jrv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        jrw jrwVar = this.b;
        jsd jsdVar = this.c;
        this.a = 1;
        Object a = jrwVar.a.a(jsdVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new jrv(this.b, this.c, ffguVar);
    }
}
