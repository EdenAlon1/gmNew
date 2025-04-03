package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aauh extends ffhv implements ffjm {
    final /* synthetic */ aaul a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aauh(aaul aaulVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aaulVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aauh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.a.c("Bugle.Conv2.Paging.ErrorRecovery");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aauh(this.a, ffguVar);
    }
}
