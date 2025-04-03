package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkz extends ffkk implements ffji {
    final /* synthetic */ hbt a;
    final /* synthetic */ ecd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkz(hbt hbtVar, ecd ecdVar) {
        super(1);
        this.a = hbtVar;
        this.b = ecdVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.a.b(new dze(this.b, (ecd) obj));
        return ffcu.a;
    }
}
