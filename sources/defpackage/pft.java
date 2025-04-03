package defpackage;

import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pft implements WebMessagePayloadBoundaryInterface {
    private final int a;
    private final String b;
    private final byte[] c;

    public pft(String str) {
        this.a = 0;
        this.b = str;
        this.c = null;
    }

    private final void a(int i) {
        if (this.a == i) {
            return;
        }
        throw new IllegalStateException("Expected " + i + ", but type is " + this.a);
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.c;
        bArr.getClass();
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final String getAsString() {
        a(0);
        return this.b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final int getType() {
        return this.a;
    }

    public pft(byte[] bArr) {
        this.a = 1;
        this.b = null;
        this.c = bArr;
    }
}
