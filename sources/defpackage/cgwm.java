package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum cgwm {
    CACHE_ALLOWED(true, true),
    FORCE_REFRESH(false, true),
    REFRESH_WITHOUT_REREGISTER(false, false);

    public final boolean d;
    public final boolean e;

    cgwm(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }
}
