package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egk extends ffkk implements ffji {
    final /* synthetic */ egq a;
    final /* synthetic */ ego b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egk(egq egqVar, ego egoVar) {
        super(1);
        this.a = egqVar;
        this.b = egoVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        this.a.b(intValue);
        return this.b.c(intValue, 0, 1, this.a.c(0, 1));
    }
}
