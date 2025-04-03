package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jrt extends ffhv implements ffji {
    int a;
    final /* synthetic */ jrw b;
    final /* synthetic */ jsd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrt(jrw jrwVar, jsd jsdVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = jrwVar;
        this.c = jsdVar;
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
        Object c = jrwVar.c(jsdVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new jrt(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
