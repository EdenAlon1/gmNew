package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evnc {
    public static evkt a(evpl evplVar) {
        boolean z;
        try {
            try {
                evplVar.t();
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return evnm.e(evplVar);
            } catch (EOFException e2) {
                e = e2;
                z = false;
                if (z) {
                    return evkv.a;
                }
                throw new evlb(e);
            }
        } catch (evpo e3) {
            throw new evlb(e3);
        } catch (IOException e4) {
            throw new evku(e4);
        } catch (NumberFormatException e5) {
            throw new evlb(e5);
        }
    }

    public static void b(evkt evktVar, evpn evpnVar) {
        evpa.T.b(evpnVar, evktVar);
    }
}
