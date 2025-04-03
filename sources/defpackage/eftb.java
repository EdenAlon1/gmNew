package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eftb extends efsk {
    private final fahq c;

    public eftb(fahq fahqVar) {
        this.c = fahqVar;
        this.b = 5;
    }

    @Override // defpackage.efsk
    public final ea a(Integer num, int i) {
        efte efteVar = new efte();
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putByteArray("Completion", this.c.toByteArray());
        efteVar.at(bundle);
        return efteVar;
    }
}
