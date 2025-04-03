package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jej extends ffkk implements ffji {
    final /* synthetic */ ffwm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jej(ffwm ffwmVar) {
        super(1);
        this.a = ffwmVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (jek.b.compareAndSet(false, true)) {
            this.a.b(ffcu.a);
        }
        return ffcu.a;
    }
}
