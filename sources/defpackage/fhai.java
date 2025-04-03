package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhai extends fgzi {
    private static final long serialVersionUID = -7635140949183238830L;
    private final Map c;

    public fhai() {
        super("VJOURNAL");
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.put(fhdb.f, new fhaf());
        hashMap.put(fhdb.g, new fhag());
        hashMap.put(fhdb.c, new fhah());
        this.b.add(new fhcn());
    }

    public fhai(fgyw fgywVar) {
        super("VJOURNAL", fgywVar);
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.put(fhdb.f, new fhaf());
        hashMap.put(fhdb.g, new fhag());
        hashMap.put(fhdb.c, new fhah());
    }
}
