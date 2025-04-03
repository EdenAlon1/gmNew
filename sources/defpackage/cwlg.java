package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwlg extends ffhv implements ffjm {
    final /* synthetic */ cwlh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwlg(cwlh cwlhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cwlhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwlg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((ctqh) this.a.b.b()).n();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwlg(this.a, ffguVar);
    }
}
