package j$.time.temporal;

/* loaded from: classes9.dex */
public final /* synthetic */ class k implements TemporalAdjuster {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ k(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal G(Temporal temporal) {
        switch (this.a) {
            case 0:
                return temporal.d(temporal.get(ChronoField.DAY_OF_WEEK) - this.b >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            case 1:
                int i = temporal.get(ChronoField.DAY_OF_WEEK);
                int i2 = this.b;
                if (i == i2) {
                    return temporal;
                }
                return temporal.d(i - i2 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int i3 = temporal.get(ChronoField.DAY_OF_WEEK);
                int i4 = this.b;
                if (i3 == i4) {
                    return temporal;
                }
                return temporal.o(i4 - i3 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
        }
    }
}
