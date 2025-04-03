package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class druw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ druy b;
    final /* synthetic */ doxj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public druw(druy druyVar, doxj doxjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = druyVar;
        this.c = doxjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((druw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        druy druyVar = this.b;
        doxj doxjVar = this.c;
        this.a = 1;
        Object a = druyVar.a.a(doxjVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new druw(this.b, this.c, ffguVar);
    }
}
