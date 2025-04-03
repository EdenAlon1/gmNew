package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxya extends cxyj {
    public cxyi a;
    public int b;
    private boolean c;
    private byte d;

    public cxya() {
    }

    @Override // defpackage.cxyj
    public final cxyk a() {
        int i;
        cxyi cxyiVar;
        if (this.d == 1 && (i = this.b) != 0 && (cxyiVar = this.a) != null) {
            return new cxyb(i, cxyiVar, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" eligibility");
        }
        if (this.a == null) {
            sb.append(" priority");
        }
        if (this.d == 0) {
            sb.append(" hasBeenShown");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cxyj
    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    public cxya(cxyk cxykVar) {
        cxyb cxybVar = (cxyb) cxykVar;
        this.b = cxybVar.c;
        this.a = cxybVar.a;
        this.c = cxybVar.b;
        this.d = (byte) 1;
    }
}
