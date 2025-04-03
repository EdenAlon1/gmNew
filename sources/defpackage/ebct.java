package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebct extends ebeg {
    private int a;
    private int b;
    private int c;
    private byte d;

    @Override // defpackage.ebeg
    public final ebeh a() {
        if (this.d == 7) {
            return new ebcu(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" cardCellId");
        }
        if ((this.d & 2) == 0) {
            sb.append(" cardMainActionId");
        }
        if ((this.d & 4) == 0) {
            sb.append(" cardSecondaryActionId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ebeg
    public final void b(int i) {
        this.a = i;
        this.d = (byte) (this.d | 1);
    }

    @Override // defpackage.ebeg
    public final void c(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    @Override // defpackage.ebeg
    public final void d(int i) {
        this.c = i;
        this.d = (byte) (this.d | 4);
    }
}
