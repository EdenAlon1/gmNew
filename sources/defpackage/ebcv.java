package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebcv extends ebfe {
    public Drawable a;
    public emxc b = emux.a;
    private int c;
    private boolean d;
    private byte e;

    @Override // defpackage.ebfe
    public final ebff a() {
        if (this.e == 3) {
            return new ebcw(this.a, this.c, this.d, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" iconResId");
        }
        if ((this.e & 2) == 0) {
            sb.append(" useTint");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ebfe
    public final void b(int i) {
        this.c = i;
        this.e = (byte) (this.e | 1);
    }

    @Override // defpackage.ebfe
    public final void c(boolean z) {
        this.d = z;
        this.e = (byte) (this.e | 2);
    }
}
