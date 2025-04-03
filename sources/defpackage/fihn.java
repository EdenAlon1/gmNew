package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fihn {
    DISABLED(0, false),
    DISK(1, true),
    DISK_NO_HTTP(1, false),
    MEMORY(2, true);

    public final int e;
    public final boolean f;

    fihn(int i, boolean z) {
        this.f = z;
        this.e = i;
    }
}
