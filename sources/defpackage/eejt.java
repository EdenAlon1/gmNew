package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eejt implements eejv {
    public static final dktn a = new dktn("BasicDiscoveryStrategyImpl");
    private static final engw c;
    public final eekb b;
    private final eeew d;

    static {
        int i = engw.d;
        c = enou.a;
    }

    public eejt(eeew eeewVar, eekb eekbVar) {
        this.d = eeewVar;
        this.b = eekbVar;
    }

    public static String a(String str) {
        return (!TextUtils.isEmpty(str) && str.endsWith(".")) ? str.substring(0, str.length() - 1) : str;
    }

    private static List c(ListenableFuture listenableFuture, String str) {
        try {
            return (List) listenableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            dkty.j(e, a, "error processing %s records", str);
            return c;
        }
    }

    @Override // defpackage.eejv
    public final List b(String str) {
        ArrayList arrayList = new ArrayList();
        for (final fiyj fiyjVar : c(this.d.b(str), "NAPTR")) {
            for (final fizp fizpVar : c(this.d.c(fiyjVar.c.toString()), "SRV")) {
                String a2 = a(fizpVar.d.toString());
                if (erlu.b(a2) && (erlu.a(a2) instanceof Inet4Address)) {
                    arrayList.add(new eeju(fiyjVar, fizpVar, a2, a2, this.b));
                } else {
                    arrayList.addAll((Collection) Collection.EL.stream(c(this.d.a(a2), "A_or_AAAA")).filter(new Predicate() { // from class: eejq
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
                        public final boolean test(Object obj) {
                            InetAddress inetAddress = (InetAddress) obj;
                            boolean z = inetAddress != null && (!((eejl) eejt.this.b).a || (inetAddress instanceof Inet4Address));
                            if (!z) {
                                dkty.r(eejt.a, "dropping InetAddress from SIP discovery: [%s]", inetAddress == null ? "null" : "IPv6 result in force IPv4 mode");
                            }
                            return z;
                        }
                    }).map(new Function() { // from class: eejr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            InetAddress inetAddress = (InetAddress) obj;
                            return new eeju(fiyjVar, fizpVar, inetAddress.getHostAddress(), eejt.a(inetAddress.getHostName()), eejt.this.b);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toList()));
                }
            }
        }
        try {
            Collections.sort(arrayList);
        } catch (IllegalArgumentException e) {
            dkty.j(new eejs(e), a, "error sorting records: %s", arrayList);
        }
        dkty.d(a, "Resolved %d NAPTR records, to %d SRV records, to %d IP addresses, DNS discovery results: %s", Long.valueOf(Collection.EL.stream(arrayList).map(new Function() { // from class: eejn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dktn dktnVar = eejt.a;
                return ((eeju) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).distinct().count()), Long.valueOf(Collection.EL.stream(arrayList).map(new Function() { // from class: eejo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dktn dktnVar = eejt.a;
                return ((eeju) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).distinct().count()), Long.valueOf(arrayList.size()), Collection.EL.stream(arrayList).map(new Function() { // from class: eejp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Objects.toString((eeju) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(";")));
        return engw.n(arrayList);
    }
}
