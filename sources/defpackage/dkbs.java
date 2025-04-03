package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkbs extends Exception {
    private static final long serialVersionUID = -6835067110707517025L;

    public dkbs(String str, int i) {
        super(a(str, i));
    }

    private static final String a(String str, int i) {
        StringBuilder sb = new StringBuilder("validation failed: ");
        int i2 = i - 1;
        if (i2 == 0) {
            sb.append("characteristic invalid");
            if (!emxe.c(str)) {
                sb.append(str);
            }
        } else if (i2 != 1) {
            sb.append("parameter not found: ");
            sb.append(str);
        } else {
            sb.append("parameter invalid: ");
            sb.append(str);
        }
        return sb.toString();
    }

    public dkbs(String str, Throwable th) {
        super(a(str, 2), th);
    }
}
