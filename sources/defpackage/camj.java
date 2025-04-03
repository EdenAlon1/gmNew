package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camj extends camn {
    private final String a;
    private final enhk b;
    private final int c;
    private final int d;

    public camj(int i, String str, enhk enhkVar, int i2) {
        this.d = i;
        if (str == null) {
            throw new NullPointerException("Null requestId");
        }
        this.a = str;
        this.b = enhkVar;
        this.c = i2;
    }

    @Override // defpackage.camn
    public final int a() {
        return this.c;
    }

    @Override // defpackage.camn
    public final enhk b() {
        return this.b;
    }

    @Override // defpackage.camn
    public final String c() {
        return this.a;
    }

    @Override // defpackage.camn
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof camn) {
            camn camnVar = (camn) obj;
            if (this.d == camnVar.d() && this.a.equals(camnVar.c()) && this.b.equals(camnVar.b()) && this.c == camnVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? "STATUS_RUNTIME_EXCEPTION" : "EMPTY_PHONE_NUMBER" : "SUCCESS";
        String str2 = this.a;
        enhk enhkVar = this.b;
        int i2 = this.c;
        return "TachyonRegistrationRpcResult{kind=" + str + ", requestId=" + str2 + ", remoteRegistrationMap=" + enhkVar.toString() + ", rpcErrorCode=" + i2 + "}";
    }
}
