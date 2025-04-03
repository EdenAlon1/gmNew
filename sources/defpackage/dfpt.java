package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dfpt extends dfpr {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b;

    public dfpt(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] a();

    @Override // defpackage.dfpr
    public final byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.b.get();
            if (bArr == null) {
                bArr = a();
                this.b = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
