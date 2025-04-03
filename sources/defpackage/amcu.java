package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amcu extends amep {
    public Optional a = Optional.empty();
    public int b;
    private epdh c;
    private int d;
    private byte e;

    @Override // defpackage.amep
    public final ameq a() {
        epdh epdhVar;
        int i;
        if (this.e == 1 && (epdhVar = this.c) != null && (i = this.b) != 0) {
            return new amcv(this.a, epdhVar, this.d, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" reason");
        }
        if (this.e == 0) {
            sb.append(" terminalStatus");
        }
        if (this.b == 0) {
            sb.append(" canFallback");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.amep
    public final void b(epdh epdhVar) {
        if (epdhVar == null) {
            throw new NullPointerException("Null reason");
        }
        this.c = epdhVar;
    }

    @Override // defpackage.amep
    public final void c(int i) {
        this.d = i;
        this.e = (byte) 1;
    }
}
