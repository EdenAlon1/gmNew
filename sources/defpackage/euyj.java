package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum euyj implements eusj {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int f;

    euyj(int i) {
        this.f = i;
    }

    @Override // defpackage.eusj
    public final int a() {
        return this.f;
    }
}
