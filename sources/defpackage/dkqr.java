package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dkqr extends Exception {
    private static final long serialVersionUID = 1;
    public final int a;

    public dkqr(int i, String str) {
        super(str);
        this.a = i;
    }

    public dkqr(String str, Throwable th) {
        super(str, th);
        this.a = 0;
    }

    public dkqr(Throwable th) {
        super(th);
        this.a = 0;
    }
}
