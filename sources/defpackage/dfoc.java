package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfoc extends dfod {
    public dfoc(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // defpackage.dfod
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new dfoe("Invalid response to one way request"));
        }
    }

    @Override // defpackage.dfod
    public final boolean b() {
        return true;
    }
}
