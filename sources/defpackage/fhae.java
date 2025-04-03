package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhae extends fgzi {
    private static final long serialVersionUID = 1046534053331139832L;
    private final Map c;

    public fhae() {
        super("VFREEBUSY");
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.put(fhdb.c, new fhab());
        hashMap.put(fhdb.e, new fhac());
        hashMap.put(fhdb.d, new fhad());
        this.b.add(new fhcn());
    }

    public fhae(fgyw fgywVar) {
        super("VFREEBUSY", fgywVar);
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.put(fhdb.c, new fhab());
        hashMap.put(fhdb.e, new fhac());
        hashMap.put(fhdb.d, new fhad());
    }
}
