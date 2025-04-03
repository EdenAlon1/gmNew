package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgfq implements ffxy {
    private final ffhd a;
    private final Object b;
    private final ffjm c;

    public fgfq(ffxy ffxyVar, ffhd ffhdVar) {
        this.a = ffhdVar;
        this.b = fghv.a(ffhdVar);
        this.c = new fgfp(ffxyVar, null);
    }

    @Override // defpackage.ffxy
    public final Object fQ(Object obj, ffgu ffguVar) {
        Object a = fgeb.a(this.a, obj, this.b, this.c, ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
