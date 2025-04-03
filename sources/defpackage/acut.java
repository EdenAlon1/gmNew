package defpackage;

import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acut implements acus {
    private static final cskc a = cskc.g("Bugle", "JsBridgeRequestHandler");
    private final Map b;

    public acut(Map map) {
        this.b = map;
    }

    @Override // defpackage.acus
    public final elfl a(esnk esnkVar, esnl esnlVar) {
        int b = esnj.b(esnj.c(esnkVar.b));
        Map map = this.b;
        Integer valueOf = Integer.valueOf(b);
        if (map.containsKey(valueOf)) {
            ffbr ffbrVar = (ffbr) this.b.get(valueOf);
            ffbrVar.getClass();
            return ((acus) ffbrVar.b()).a(esnkVar, esnlVar);
        }
        csjb b2 = a.b();
        b2.I("No handler registered for JsBridge request");
        b2.A("payloadCase", valueOf);
        b2.r();
        return elfo.d(new acur(fagh.INVALID_ARGUMENT, String.format(Locale.US, "No JsBridge handler registered for payloadCase %d", valueOf)));
    }
}
