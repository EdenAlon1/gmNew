package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqz extends RuntimeException {
    public kqz() {
        this(null);
    }

    public kqz(String str) {
        super(str == null ? "The operation has been canceled." : str);
    }
}
