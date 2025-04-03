package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feea extends fdyy {
    public Context a;
    private final feaw b;

    static {
        try {
            try {
                try {
                    ((feay) Class.forName("fexw").asSubclass(feay.class).getConstructor(new Class[0]).newInstance(new Object[0])).c();
                } catch (Exception e) {
                    Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e);
                }
            } catch (ClassCastException e2) {
                Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e2);
            }
        } catch (ClassNotFoundException e3) {
            Log.w("AndroidChannelBuilder", "Failed to find OkHttpChannelProvider", e3);
        }
    }

    public feea(feaw feawVar) {
        this.b = feawVar;
    }

    @Override // defpackage.fdyx, defpackage.feaw
    public final feau a() {
        return new fedz(this.b.a(), this.a);
    }

    @Override // defpackage.fdyy, defpackage.fdyx
    protected final feaw b() {
        return this.b;
    }
}
