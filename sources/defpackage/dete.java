package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dete extends Exception {
    public dete(String str) {
        super(str);
    }

    public dete(Throwable th) {
        super("Failed to make IPC to Fi app", th);
    }
}
