package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egpz extends egqc {
    public egqd a;
    public emxc b = emux.a;
    private egqe c;
    private egpx d;
    private boolean e;
    private fazb f;
    private int g;
    private int h;
    private byte i;

    @Override // defpackage.egqc
    public final egqf a() {
        egqe egqeVar;
        egpx egpxVar;
        fazb fazbVar;
        egqd egqdVar;
        if (this.i == 7 && (egqeVar = this.c) != null && (egpxVar = this.d) != null && (fazbVar = this.f) != null && (egqdVar = this.a) != null) {
            return new egqa(egqeVar, egpxVar, this.e, fazbVar, this.g, this.h, egqdVar, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" kind");
        }
        if (this.d == null) {
            sb.append(" fragmentStartMode");
        }
        if ((this.i & 1) == 0) {
            sb.append(" enabled");
        }
        if (this.f == null) {
            sb.append(" fragmentLazy");
        }
        if ((this.i & 2) == 0) {
            sb.append(" tabNameRes");
        }
        if ((this.i & 4) == 0) {
            sb.append(" visualElementId");
        }
        if (this.a == null) {
            sb.append(" iconApplier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.egqc
    public final void b(boolean z) {
        this.e = z;
        this.i = (byte) (this.i | 1);
    }

    @Override // defpackage.egqc
    public final void c(fazb fazbVar) {
        if (fazbVar == null) {
            throw new NullPointerException("Null fragmentLazy");
        }
        this.f = fazbVar;
    }

    @Override // defpackage.egqc
    public final void d(egpx egpxVar) {
        if (egpxVar == null) {
            throw new NullPointerException("Null fragmentStartMode");
        }
        this.d = egpxVar;
    }

    @Override // defpackage.egqc
    public final void e(egqe egqeVar) {
        if (egqeVar == null) {
            throw new NullPointerException("Null kind");
        }
        this.c = egqeVar;
    }

    @Override // defpackage.egqc
    public final void f(int i) {
        this.g = i;
        this.i = (byte) (this.i | 2);
    }

    @Override // defpackage.egqc
    public final void g(int i) {
        this.h = i;
        this.i = (byte) (this.i | 4);
    }
}
