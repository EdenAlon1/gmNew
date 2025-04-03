package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xyb extends ffhv implements ffjm {
    final /* synthetic */ xyd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyb(xyd xydVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = xydVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xyb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.c.b()).c("Bugle.ComposeRow.ConstraintNotices.VideoDurationTooLongDialog.Opened.Count");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xyb(this.a, ffguVar);
    }
}
