package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chgw {
    public static final chgx a(String str) {
        if (ffpc.J(str)) {
            throw new IllegalArgumentException("Tachyon url must not be blank");
        }
        return new chgx(str);
    }

    public static final chgx b() {
        Object e = chgx.a.e();
        e.getClass();
        return a((String) e);
    }
}
