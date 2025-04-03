package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzeg extends bzei {
    public String a;
    public bzge b;
    private fcek c;
    private long d;
    private byyv e;
    private boolean f;
    private byte g;

    @Override // defpackage.bzei
    public final bzej a() {
        fcek fcekVar;
        String str;
        byyv byyvVar;
        bzge bzgeVar;
        if (this.g == 3 && (fcekVar = this.c) != null && (str = this.a) != null && (byyvVar = this.e) != null && (bzgeVar = this.b) != null) {
            return new bzeh(fcekVar, str, this.d, byyvVar, this.f, bzgeVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" desktopId");
        }
        if (this.a == null) {
            sb.append(" requestId");
        }
        if ((this.g & 1) == 0) {
            sb.append(" lastConnectionTimeMillis");
        }
        if (this.e == null) {
            sb.append(" desktopType");
        }
        if ((this.g & 2) == 0) {
            sb.append(" isPersistent");
        }
        if (this.b == null) {
            sb.append(" dittoIdContainer");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.bzei
    public final void b(fcek fcekVar) {
        if (fcekVar == null) {
            throw new NullPointerException("Null desktopId");
        }
        this.c = fcekVar;
    }

    @Override // defpackage.bzei
    public final void c(byyv byyvVar) {
        if (byyvVar == null) {
            throw new NullPointerException("Null desktopType");
        }
        this.e = byyvVar;
    }

    @Override // defpackage.bzei
    public final void d(boolean z) {
        this.f = z;
        this.g = (byte) (this.g | 2);
    }

    @Override // defpackage.bzei
    public final void e(long j) {
        this.d = j;
        this.g = (byte) (this.g | 1);
    }
}
