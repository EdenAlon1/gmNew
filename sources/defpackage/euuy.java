package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euuy extends euvc {
    public String a;
    public String b;
    public String c;
    public String d;
    private long e;
    private long f;
    private byte g;
    private int h;

    public euuy() {
    }

    @Override // defpackage.euvc
    public final euvd a() {
        if (this.g == 3 && this.h != 0) {
            return new euuz(this.a, this.h, this.b, this.c, this.e, this.f, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.g & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.g & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.euvc
    public final void b(long j) {
        this.e = j;
        this.g = (byte) (this.g | 1);
    }

    @Override // defpackage.euvc
    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.h = i;
    }

    @Override // defpackage.euvc
    public final void d(long j) {
        this.f = j;
        this.g = (byte) (this.g | 2);
    }

    public euuy(euvd euvdVar) {
        euuz euuzVar = (euuz) euvdVar;
        this.a = euuzVar.a;
        this.h = euuzVar.g;
        this.b = euuzVar.b;
        this.c = euuzVar.c;
        this.e = euuzVar.d;
        this.f = euuzVar.e;
        this.d = euuzVar.f;
        this.g = (byte) 3;
    }
}
