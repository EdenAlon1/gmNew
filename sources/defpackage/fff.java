package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fff extends ffkk implements ffji {
    final /* synthetic */ fft a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fff(fft fftVar) {
        super(1);
        this.a = fftVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fcx fcxVar;
        fcx fcxVar2;
        long longValue = ((Number) obj).longValue();
        fcy f = this.a.f();
        if (f != null && (fcxVar2 = f.a) != null && longValue == fcxVar2.c) {
            this.a.v(null);
        }
        fcy f2 = this.a.f();
        if (f2 != null && (fcxVar = f2.b) != null && longValue == fcxVar.c) {
            this.a.q(null);
        }
        if (this.a.a.b().b(longValue)) {
            this.a.x();
        }
        return ffcu.a;
    }
}
