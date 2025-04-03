package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oga extends ffhv implements ffjm {
    final /* synthetic */ ogd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oga(ogd ogdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ogdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oga) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new oga(this.a, ffguVar);
    }
}
