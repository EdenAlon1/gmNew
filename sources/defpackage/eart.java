package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eart extends Exception {
    public eart() {
        super("Failed to get ContentProviderClient for accounts from GmsCore");
    }

    public eart(Throwable th) {
        super("Error getting accounts via GmsCore", th);
    }
}
