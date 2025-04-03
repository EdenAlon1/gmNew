package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehc extends ffkk implements ffji {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehc(int i) {
        super(1);
        this.a = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ekf ekfVar = (ekf) obj;
        hrw a = hrv.a();
        hrv.e(a, hrv.b(a), a != null ? a.k() : null);
        for (int i = 0; i < 2; i++) {
            ekfVar.a(this.a + i);
        }
        return ffcu.a;
    }
}
