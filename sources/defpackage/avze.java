package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avze extends ffhv implements ffjm {
    final /* synthetic */ avzh a;
    final /* synthetic */ bwdi b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avze(ffgu ffguVar, avzh avzhVar, bwdi bwdiVar) {
        super(2, ffguVar);
        this.a = avzhVar;
        this.b = bwdiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avze) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.g.c("FileTransferProcessor#updateProcessingId", new avzg(this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        avze avzeVar = new avze(ffguVar, this.a, this.b);
        avzeVar.c = obj;
        return avzeVar;
    }
}
