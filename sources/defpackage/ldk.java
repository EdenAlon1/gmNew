package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ldk extends ffhv implements ffjn {
    int a;
    private /* synthetic */ Object b;

    public ldk(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).booleanValue();
        ldk ldkVar = new ldk((ffgu) obj3);
        ldkVar.b = (lcx) obj;
        return ldkVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, lcx] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ?? r3 = this.b;
        this.a = 1;
        Object b = r3.b(this);
        return b == ffhhVar ? ffhhVar : b;
    }
}
