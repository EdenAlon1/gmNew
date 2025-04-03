package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abba extends ffhv implements ffjm {
    final /* synthetic */ abbb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abba(abbb abbbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = abbbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abba) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.a.c("Bugle.RcsEdit.Ui.Selected");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abba(this.a, ffguVar);
    }
}
