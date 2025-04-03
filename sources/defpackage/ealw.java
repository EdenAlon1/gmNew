package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ealw {
    public String a;
    private int b;
    private byte c;

    public final eamh a() {
        String str;
        if (this.c == 1 && (str = this.a) != null) {
            return new eamh(this.b, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" registrationStatus");
        }
        if (this.a == null) {
            sb.append(" environment");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.b = i;
        this.c = (byte) 1;
    }
}
