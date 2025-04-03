package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzuk extends dzvf {
    public dzqb a;
    public dzjn b;
    private byte[] c;
    private String d;

    @Override // defpackage.dzvf
    public final dzvg a() {
        dzqb dzqbVar;
        String str;
        dzjn dzjnVar;
        byte[] bArr = this.c;
        if (bArr != null && (dzqbVar = this.a) != null && (str = this.d) != null && (dzjnVar = this.b) != null) {
            return new dzul(bArr, dzqbVar, str, dzjnVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" icon");
        }
        if (this.a == null) {
            sb.append(" lighterIcon");
        }
        if (this.d == null) {
            sb.append(" displayText");
        }
        if (this.b == null) {
            sb.append(" action");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzvf
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null displayText");
        }
        this.d = str;
    }

    @Override // defpackage.dzvf
    public final void c(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null icon");
        }
        this.c = bArr;
    }
}
