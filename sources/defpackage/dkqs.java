package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dkqs extends Exception {
    private static final long serialVersionUID = 1;
    public final int a;

    public dkqs() {
        super("ImsServiceSessionException: 6");
        this.a = 6;
    }

    public dkqs(int i, String str) {
        super(str);
        this.a = i;
    }

    public dkqs(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }

    public dkqs(Throwable th) {
        super("ImsServiceSessionException: 0", th);
        this.a = 0;
    }
}
