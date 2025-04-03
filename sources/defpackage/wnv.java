package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wnv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ woi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnv(woi woiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = woiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wnv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        woi woiVar = this.b;
        this.a = 1;
        Object c = woiVar.c.c(this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wnv(this.b, ffguVar);
    }
}
