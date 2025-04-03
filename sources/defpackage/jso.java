package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jso extends ffhv implements ffjm {
    int a;
    final /* synthetic */ jrw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jso(jrw jrwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = jrwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jso) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            jrw jrwVar = this.b;
            this.a = 1;
            if (jrwVar.b(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new jso(this.b, ffguVar);
    }
}
