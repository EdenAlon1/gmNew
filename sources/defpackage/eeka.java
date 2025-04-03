package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.http.conn.util.InetAddressUtils;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeka implements eejv {
    private static final engw d;
    public final eeew a;
    public final eejk b;
    public final eekb c;
    private final boolean e;

    static {
        int i = engw.d;
        d = enou.a;
    }

    public eeka(eeew eeewVar, eekb eekbVar) {
        this.a = eeewVar;
        eejl eejlVar = (eejl) eekbVar;
        this.e = eejlVar.b;
        this.b = eejlVar.c;
        this.c = eekbVar;
    }

    static final InetAddress c(InetAddress[] inetAddressArr, boolean z) {
        for (InetAddress inetAddress : inetAddressArr) {
            if ((true != z ? Inet4Address.class : Inet6Address.class).isInstance(inetAddress)) {
                return inetAddress;
            }
        }
        return null;
    }

    public final eejz a(fizp fizpVar) {
        eejz eejzVar = new eejz();
        eejzVar.a = fizpVar;
        String fiytVar = fizpVar.d.toString();
        if (!TextUtils.isEmpty(fiytVar) && fiytVar.endsWith(".")) {
            fiytVar = fiytVar.substring(0, fiytVar.length() - 1);
        }
        try {
            if (InetAddressUtils.isIPv4Address(fiytVar)) {
                eejzVar.b = fiytVar;
                return eejzVar;
            }
            eejzVar.c = fiytVar;
            try {
                InetAddress[] inetAddressArr = (InetAddress[]) ((List) this.a.a(fiytVar).get()).toArray(new InetAddress[0]);
                InetAddress c = c(inetAddressArr, this.e);
                if (c == null) {
                    c = c(inetAddressArr, !this.e);
                }
                if (c == null) {
                    dkty.q("Resolved address empty, skipping SRV record: %s", fizpVar);
                    return null;
                }
                dkty.c("Resolved %s to %s", fiytVar, c);
                eejzVar.b = c.getHostAddress();
                return eejzVar;
            } catch (ExecutionException e) {
                if (e.getCause() instanceof UnknownHostException) {
                    throw ((UnknownHostException) e.getCause());
                }
                throw new RuntimeException(e.getCause());
            }
        } catch (InterruptedException | UnknownHostException unused) {
            dkty.q("Unknown host exception, skipping SRV record: %s", fizpVar);
            return null;
        }
    }

    @Override // defpackage.eejv
    public final List b(final String str) {
        Object call;
        Object obj;
        Callable callable = new Callable() { // from class: eejw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eejk eejkVar;
                String str2 = str;
                dkty.c("LegacyDiscoveryStrategy: looking up proxy %s", str2);
                eeka eekaVar = eeka.this;
                List<fiyj> list = (List) eekaVar.a.b(str2).get();
                ArrayList arrayList = new ArrayList();
                for (fiyj fiyjVar : list) {
                    if (fiyjVar == null) {
                        dkty.q("Skipping invalid NAPTR null record", new Object[0]);
                    } else {
                        arrayList.add(fiyjVar.c.toString());
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List<fizp> list2 = (List) eekaVar.a.c((String) it.next()).get();
                    ArrayList<eejz> arrayList3 = new ArrayList();
                    for (fizp fizpVar : list2) {
                        if (fizpVar == null) {
                            dkty.q("Skipping invalid SRV null record", new Object[0]);
                        } else {
                            eejz a = eekaVar.a(fizpVar);
                            if (a != null) {
                                arrayList3.add(a);
                            }
                        }
                    }
                    for (eejz eejzVar : arrayList3) {
                        eejzVar.getClass();
                        fizp fizpVar2 = eejzVar.a;
                        fizpVar2.getClass();
                        String fiytVar = fizpVar2.f.toString();
                        if (fiytVar.startsWith("_sip._udp")) {
                            eejkVar = eejk.UDP;
                        } else if (fiytVar.startsWith("_sip._tcp")) {
                            eejkVar = eejk.TCP;
                        } else if (fiytVar.startsWith("_sips._tcp")) {
                            eejkVar = eejk.TLS;
                        } else {
                            dkty.q("NAPTR response contains unknown protocol: %s", fiytVar);
                            eejkVar = null;
                        }
                        if (eejkVar == null) {
                            eejkVar = eejk.TCP;
                        }
                        arrayList2.add(new eejm(eejzVar.b, eejzVar.c, fizpVar2.c, eejkVar));
                    }
                }
                return arrayList2;
            }
        };
        eeew eeewVar = this.a;
        try {
            if (eeewVar instanceof eeff) {
                ((eeff) eeewVar).d();
                synchronized (eeff.class) {
                    call = callable.call();
                }
                obj = call;
            } else {
                dkty.q("expected LegacyDnsClientImpl, but using %s", eeewVar.getClass().getName());
                obj = callable.call();
            }
            final List list = (List) obj;
            emxc j = list.isEmpty() ? emux.a : emxc.j((eekc) Collection.EL.stream(list).filter(new Predicate() { // from class: eejx
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return eeka.this.b.equals(((eekc) obj2).b());
                }
            }).findFirst().orElseGet(new Supplier() { // from class: eejy
                @Override // java.util.function.Supplier
                public final Object get() {
                    eeka eekaVar = eeka.this;
                    emxf.m(((eejl) eekaVar.c).d.g(), "failed to set log prefix for LegacyDiscoveryStrategy");
                    dkty.r((dktn) ((eejl) eekaVar.c).d.c(), "Unable to find proxy for protocol %s. Returning first found proxy to attempt fallback.", eekaVar.b);
                    return (eekc) list.get(0);
                }
            }));
            return j.g() ? engw.r(j.c()) : d;
        } catch (Exception e) {
            dkty.i(e, "Error resolving DNS in doWithLegacyLock", new Object[0]);
            throw new RuntimeException(e);
        }
    }
}
