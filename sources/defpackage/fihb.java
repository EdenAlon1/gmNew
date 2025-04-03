package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fihb extends file {
    public fihb(String str, int i, int i2) {
        super(str, i, i2);
    }

    @Override // defpackage.file, org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        int i = this.b;
        if (i == -358 || i == -352) {
            return true;
        }
        return super.immediatelyRetryable();
    }
}
