package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eyfc {
    public static final eyfc a = new eyfc(null);
    private static volatile boolean b = false;
    private static volatile eyfc c;
    private final Map d;

    public eyfc() {
        this.d = new HashMap();
    }

    public static eyfc a() {
        eyfc eyfcVar = c;
        if (eyfcVar != null) {
            return eyfcVar;
        }
        synchronized (eyfc.class) {
            eyfc eyfcVar2 = c;
            if (eyfcVar2 != null) {
                return eyfcVar2;
            }
            eyib eyibVar = eyib.a;
            eyfc b2 = eyfo.b(eyfc.class);
            c = b2;
            return b2;
        }
    }

    public eyfw b(eyhs eyhsVar, int i) {
        return (eyfw) this.d.get(new eyfb(eyhsVar, i));
    }

    public final void c(eyfw eyfwVar) {
        this.d.put(new eyfb(eyfwVar.a, eyfwVar.a()), eyfwVar);
    }

    public eyfc(byte[] bArr) {
        this.d = Collections.EMPTY_MAP;
    }
}
