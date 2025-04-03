package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum euyi implements eusj {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    private final int f;

    euyi(int i) {
        this.f = i;
    }

    @Override // defpackage.eusj
    public final int a() {
        return this.f;
    }
}
