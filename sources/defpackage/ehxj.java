package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehxj extends ehxg {
    static final long serialVersionUID = 1;

    public ehxj() {
        super("Jibe SDK Service not available. Is the Jibe SDK service running? Did you call connect() and wait for the notification before calling an API function?");
    }

    public ehxj(String str) {
        super(str + " not available. Is the " + str + " running? Did you call connect() and wait for the notification before calling an API function?");
    }
}
