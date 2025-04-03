package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecmf extends ecmq {
    public fgmh a;
    public byte b;
    private String c;
    private ecda d;
    private final emxc e;
    private final emxc f;

    public ecmf() {
        emux emuxVar = emux.a;
        this.e = emuxVar;
        this.f = emuxVar;
    }

    @Override // defpackage.ecmq
    public final ecmr a() {
        String str;
        if (this.b == 1 && (str = this.c) != null) {
            return new ecmg(str, this.d, this.a, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" eventName");
        }
        if (this.b == 0) {
            sb.append(" enablePerfettoTraceCollection");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ecmq
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null eventName");
        }
        this.c = str;
    }

    @Override // defpackage.ecmq
    public final void c(ecda ecdaVar) {
        this.d = ecdaVar;
    }
}
