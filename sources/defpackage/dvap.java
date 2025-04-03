package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvap extends Exception {
    public dvap(String str, String str2) {
        this(str, str2, null);
    }

    public dvap(String str, String str2, Throwable th) {
        super(a.w(str2, str, ": "), th);
    }
}
