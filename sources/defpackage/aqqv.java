package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqqv extends ffhv implements ffjm {
    final /* synthetic */ aqqw a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqqv(aqqw aqqwVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqqwVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqqv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((akzt) this.a.a.b()).e("Bugle.Recipient.Sync.ParticipantContactSync.Status.Count", this.b - 1);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqqv(this.a, this.b, ffguVar);
    }
}
