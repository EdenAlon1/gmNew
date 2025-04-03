package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzih extends dzix {
    private long a;
    private dzjd b;
    private eyee c;
    private dziz d;
    private byte e;

    @Override // defpackage.dzix
    public final dzja a() {
        dzjd dzjdVar;
        eyee eyeeVar;
        dziz dzizVar;
        if (this.e == 1 && (dzjdVar = this.b) != null && (eyeeVar = this.c) != null && (dzizVar = this.d) != null) {
            return new dzly(this.a, dzjdVar, eyeeVar, dzizVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" registrationId");
        }
        if (this.b == null) {
            sb.append(" accountUsers");
        }
        if (this.c == null) {
            sb.append(" serverRegistrationId");
        }
        if (this.d == null) {
            sb.append(" serverRegistrationStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzix
    public final void b(dzjd dzjdVar) {
        this.b = dzjdVar;
    }

    @Override // defpackage.dzix
    public final void c(long j) {
        this.a = j;
        this.e = (byte) 1;
    }

    @Override // defpackage.dzix
    public final void d(eyee eyeeVar) {
        if (eyeeVar == null) {
            throw new NullPointerException("Null serverRegistrationId");
        }
        this.c = eyeeVar;
    }

    @Override // defpackage.dzix
    public final void e(dziz dzizVar) {
        if (dzizVar == null) {
            throw new NullPointerException("Null serverRegistrationStatus");
        }
        this.d = dzizVar;
    }
}
