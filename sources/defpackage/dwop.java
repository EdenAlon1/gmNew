package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwop extends dwxh {
    private boolean a;
    private boolean b;
    private boolean c;
    private byte d;

    @Override // defpackage.dwxh
    public final dwxi a() {
        if (this.d == 7) {
            return new dwoq(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" requiresDeviceIdle");
        }
        if ((this.d & 2) == 0) {
            sb.append(" requiresCharging");
        }
        if ((this.d & 4) == 0) {
            sb.append(" requiresBatteryNotLow");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwxh
    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }

    @Override // defpackage.dwxh
    public final void c(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 2);
    }

    @Override // defpackage.dwxh
    public final void d(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }
}
