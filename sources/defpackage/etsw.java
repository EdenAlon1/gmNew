package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsw {
    public final Map a;
    public final Map b;

    public etsw() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public final void a(etsv etsvVar) {
        if (etsvVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        etsx etsxVar = new etsx(etsvVar.b, etsvVar.c);
        if (!this.a.containsKey(etsxVar)) {
            this.a.put(etsxVar, etsvVar);
            return;
        }
        etsv etsvVar2 = (etsv) this.a.get(etsxVar);
        if (!etsvVar2.equals(etsvVar) || !etsvVar.equals(etsvVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(etsxVar.toString()));
        }
    }

    public final void b(ettc ettcVar) {
        Map map = this.b;
        Class b = ettcVar.b();
        if (!map.containsKey(b)) {
            this.b.put(b, ettcVar);
            return;
        }
        ettc ettcVar2 = (ettc) this.b.get(b);
        if (!ettcVar2.equals(ettcVar) || !ettcVar.equals(ettcVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(b.toString()));
        }
    }

    public etsw(etsy etsyVar) {
        this.a = new HashMap(etsyVar.a);
        this.b = new HashMap(etsyVar.b);
    }
}
