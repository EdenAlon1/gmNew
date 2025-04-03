package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cquo extends Exception {
    private final cqpn a;
    private final boolean b;

    public cquo(boolean z, String str, byte[] bArr) {
        this(z, cqpn.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED, str, (byte[]) null);
    }

    public static elfl a(String str) {
        return elfo.d(new cquo(false, str));
    }

    static elfl b(String str) {
        return elfo.d(new cquo(true, str));
    }

    static elfl c(String str, Throwable th) {
        return elfo.d(new cquo(true, str, th));
    }

    public final Boolean d() {
        return Boolean.valueOf(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cquo)) {
            return false;
        }
        cquo cquoVar = (cquo) obj;
        return d().equals(cquoVar.d()) && this.a.equals(cquoVar.a) && emxe.b(getMessage()).equals(cquoVar.getMessage());
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), this.a, Integer.valueOf(super.hashCode()));
    }

    private cquo(boolean z, cqpn cqpnVar, String str, byte[] bArr) {
        super(str);
        this.a = cqpnVar;
        this.b = z;
    }

    public cquo(boolean z, cqpn cqpnVar, String str) {
        this(z, cqpnVar, str, (byte[]) null);
    }

    public cquo(boolean z, String str) {
        this(z, cqpn.FILE_TRANSFER_FAILURE_REASON_UNKNOWN, str);
    }

    public cquo(boolean z, String str, cqpn cqpnVar, Throwable th) {
        super(str, th);
        this.a = cqpnVar;
        this.b = z;
    }

    public cquo(boolean z, String str, Throwable th) {
        this(z, str, cqpn.FILE_TRANSFER_FAILURE_REASON_UNKNOWN, th);
    }
}
