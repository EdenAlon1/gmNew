package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class odc extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffsk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odc(ffgu ffguVar, ffsk ffskVar) {
        super(3, ffguVar);
        this.c = ffskVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        odc odcVar = new odc((ffgu) obj3, this.c);
        odcVar.d = (ffxy) obj;
        odcVar.b = obj2;
        return odcVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r5 = this.d;
            ogd ogdVar = new ogd(this.c, (ojf) this.b);
            this.a = 1;
            if (r5.fQ(ogdVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
