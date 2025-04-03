package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecrq extends ecrx {
    public int a;
    public boolean b;
    public byte c;
    public int d;
    public ecry e;

    @Override // defpackage.ecrx
    public final ecrz a() {
        int i;
        ecry ecryVar;
        if (this.c == 7 && (i = this.d) != 0 && (ecryVar = this.e) != null) {
            return new ecrr(i, this.a, ecryVar, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if (this.e == null) {
            sb.append(" dynamicSampler");
        }
        if ((this.c & 2) == 0) {
            sb.append(" recordTimerDuration");
        }
        if ((this.c & 4) == 0) {
            sb.append(" sendEmptyTraces");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ecrx
    public final ecrx b(int i) {
        this.d = i;
        return this;
    }
}
