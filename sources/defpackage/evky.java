package defpackage;

import java.io.IOException;
import java.io.Reader;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evky {
    public static evkt a(evpl evplVar) {
        int i = evplVar.i;
        if (i == 2) {
            evplVar.u(1);
        }
        try {
            try {
                return evnc.a(evplVar);
            } catch (OutOfMemoryError e) {
                throw new evkx(a.b(evplVar, "Failed parsing JSON source: ", " to Json"), e);
            } catch (StackOverflowError e2) {
                throw new evkx(a.b(evplVar, "Failed parsing JSON source: ", " to Json"), e2);
            }
        } finally {
            evplVar.u(i);
        }
    }

    public static evkt b(Reader reader) {
        try {
            evpl evplVar = new evpl(reader);
            evkt a = a(evplVar);
            if (!(a instanceof evkv) && evplVar.t() != 10) {
                throw new evlb("Did not consume the entire document.");
            }
            return a;
        } catch (evpo e) {
            throw new evlb(e);
        } catch (IOException e2) {
            throw new evku(e2);
        } catch (NumberFormatException e3) {
            throw new evlb(e3);
        }
    }
}
