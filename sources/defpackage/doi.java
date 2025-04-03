package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class doi extends ffkk implements ffji {
    final /* synthetic */ ffjm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doi(ffjm ffjmVar) {
        super(1);
        this.a = ffjmVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iku ikuVar = (iku) obj;
        this.a.a(ikuVar, Float.valueOf(Float.intBitsToFloat((int) (ikj.a(ikuVar) & 4294967295L))));
        ikuVar.b();
        return ffcu.a;
    }
}
