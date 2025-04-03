package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ogc extends ffkk implements ffix {
    final /* synthetic */ ogd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogc(ogd ogdVar) {
        super(0);
        this.a = ogdVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ogo ogoVar = (ogo) ffdx.M(this.a.b.a.a.a());
        if (ogoVar == null || !(ogoVar instanceof ogl)) {
            return null;
        }
        ogl oglVar = (ogl) ogoVar;
        if (oglVar.b != ofz.a) {
            return null;
        }
        return oglVar;
    }
}
