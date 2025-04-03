package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eol extends ffkk implements ffji {
    final /* synthetic */ eot a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eol(eot eotVar) {
        super(1);
        this.a = eotVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        eot eotVar = this.a;
        ekf ekfVar = (ekf) obj;
        hrw a = hrv.a();
        ffji k = a != null ? a.k() : null;
        hrw b = hrv.b(a);
        try {
            ekfVar.a(eotVar.f);
            hrv.e(a, b, k);
            return ffcu.a;
        } catch (Throwable th) {
            hrv.e(a, b, k);
            throw th;
        }
    }
}
