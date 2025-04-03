package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqs extends ffkk implements ffix {
    final /* synthetic */ hqt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqs(hqt hqtVar) {
        super(0);
        this.a = hqtVar;
    }

    @Override // defpackage.ffix
    public final Object invoke() {
        hqt hqtVar = this.a;
        hrh hrhVar = hqtVar.a;
        Object obj = hqtVar.d;
        if (obj != null) {
            return hrhVar.b(hqtVar, obj);
        }
        throw new IllegalArgumentException("Value should be initialized");
    }
}
