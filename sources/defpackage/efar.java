package defpackage;

import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efar implements efas {
    private static final String a = "efas";

    @Override // defpackage.efas
    public final void a(efap efapVar) {
        try {
            dhoz.a(efapVar.b);
        } catch (dfqc e) {
            Log.e(a, "Attempted to use SSL unpatched. Google Play Services unavailable.", e);
            dfpi.a.c(efapVar.b, e.a);
            int i = efapVar.c;
            throw new IOException("Blocked unpatched use of SSL stack.", e);
        } catch (dfqd e2) {
            dfpi.a.c(efapVar.b, e2.a);
            int i2 = efapVar.c;
            throw new IOException("Attempted to use SSL unpatched. Google Play Services needs update.", e2);
        }
    }
}
