package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuqy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ curb b;
    final /* synthetic */ boolean c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuqy(ffgu ffguVar, curb curbVar, boolean z) {
        super(2, ffguVar);
        this.b = curbVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuqy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        curb curbVar = this.b;
        cura curaVar = new cura(this.c);
        this.a = 1;
        Object d = curbVar.a.d(curaVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuqy cuqyVar = new cuqy(ffguVar, this.b, this.c);
        cuqyVar.d = obj;
        return cuqyVar;
    }
}
