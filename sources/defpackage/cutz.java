package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cutz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuuc b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutz(cuuc cuucVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cuucVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cutz) c((eisx) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cuuc cuucVar = this.b;
        eisx eisxVar = this.c;
        this.a = 1;
        Object e = cuucVar.e(eisxVar, this);
        return e == ffhhVar ? ffhhVar : e;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cutz(this.b, this.c, ffguVar);
    }
}
