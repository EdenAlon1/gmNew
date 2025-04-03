package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfxg implements cfvv {
    public static final cskc a = cskc.g("BugleNetwork", "NewLightTickleFcmHandler");
    final Map b;
    private final cfvu c;
    private final cqoh d;
    private final ffbr e;

    public cfxg(Map map, cfvu cfvuVar, cqoh cqohVar, ffbr ffbrVar) {
        this.b = map;
        this.c = cfvuVar;
        this.d = cqohVar;
        this.e = ffbrVar;
    }

    private final boolean d() {
        return chru.a();
    }

    @Override // defpackage.cfvv
    public final int a(euxg euxgVar) {
        return 0;
    }

    @Override // defpackage.cfvv
    public final void b(euxg euxgVar) {
        if (!((Boolean) cful.i.e()).booleanValue() && !d()) {
            a.m("Ignore received Firebase messages because features are not enabled.");
            return;
        }
        String str = (String) euxgVar.c().get("tickle");
        if (str == null) {
            csjb c = a.c();
            c.I("Received FCM tickle without tickle key.");
            c.r();
            return;
        }
        fcek a2 = cfye.a((String) euxgVar.c().get("receiverId"));
        if (a2 == null) {
            csjb c2 = a.c();
            c2.I("Received FCM tickle without a receiver id.");
            c2.r();
            return;
        }
        fgtg b = fgtg.b(a2.b);
        if (b == null) {
            b = fgtg.UNRECOGNIZED;
        }
        Integer valueOf = Integer.valueOf(b.a());
        if (!this.b.containsKey(valueOf)) {
            csjb c3 = a.c();
            c3.I("No handler registered for tickle type");
            c3.A("IdType", valueOf);
            c3.r();
            return;
        }
        cfvy cfvyVar = (cfvy) ((ffbr) this.b.get(valueOf)).b();
        if (euxgVar.b() == 2 && euxgVar.a() == 1) {
            csjb c4 = a.c();
            c4.I("FireBase message priority downgraded.");
            c4.r();
            cfvyVar.b(this.d.f().toEpochMilli());
        }
        cfvyVar.c(a2, str, euxgVar.b(), euxgVar.a());
    }

    @Override // defpackage.cfvv
    public final void c() {
        if (!((Boolean) cful.i.e()).booleanValue() && !d()) {
            a.m("Skipping Firebase Instance ID refresh because feature is not enabled.");
            return;
        }
        cskc cskcVar = a;
        csjb c = cskcVar.c();
        c.I("Handling firebase new token");
        c.r();
        if (this.c == null) {
            cskcVar.n("firebaseInstanceIDManager is null");
        } else {
            elfr.l(elfo.l((Iterable) Collection.EL.stream(((enhk) this.b).values()).map(new Function() { // from class: cfxa
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (cfvy) ((ffbr) obj).b();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: cfxb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((cfvy) obj).a();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: cfxc
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }))).a(new Callable() { // from class: cfxd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return null;
                }
            }, erpp.a), new csvw(new Consumer() { // from class: cfxe
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    csjb c2 = cfxg.a.c();
                    c2.I("Successfully handled firebase new token.");
                    c2.r();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: cfxf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    csjb b = cfxg.a.b();
                    b.I("Failed to handle firebase new token.");
                    b.s((Throwable) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), erpp.a);
        }
    }
}
