package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecoq extends ecos {
    public int a;
    public emxc b = emux.a;
    public byte c;
    public int d;
    private boolean e;

    @Override // defpackage.ecos
    public final ecot a() {
        int i;
        if (this.c == 3 && (i = this.d) != 0) {
            return new ecor(i, this.a, this.e, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" batchSize");
        }
        if ((this.c & 2) == 0) {
            sb.append(" enableUrlAutoSanitization");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ecos
    public final ecos b(int i) {
        this.d = i;
        return this;
    }

    @Override // defpackage.ecos
    public final void c(boolean z) {
        this.e = z;
        this.c = (byte) (this.c | 2);
    }
}
