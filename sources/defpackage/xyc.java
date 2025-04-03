package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xyc extends ffhv implements ffjm {
    final /* synthetic */ xyd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyc(xyd xydVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = xydVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xyc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.c.b()).c("Bugle.ComposeRow.ConstraintNotices.VideoDurationTooLongDialog.Dismissed.Count");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xyc(this.a, ffguVar);
    }
}
