package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eckf extends eckh {
    public float a;
    public int b;
    public ffbr c;
    public byte d;
    public int e;
    private final emxc f = emux.a;

    @Override // defpackage.eckh
    public final ecki a() {
        int i;
        if (this.d == 3 && (i = this.e) != 0) {
            return new eckg(i, this.a, this.b, this.c, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            sb.append(" startupSamplePercentage");
        }
        if ((this.d & 2) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eckh
    public final eckh b(int i) {
        this.e = i;
        return this;
    }
}
