package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chff extends cpdo {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/TachyonBackgroundStartupTask");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final errl i;
    private final ffbr j;

    public chff(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, errl errlVar, ffbr ffbrVar8) {
        this.b = ffbrVar;
        this.f = ffbrVar3;
        this.c = ffbrVar4;
        this.g = ffbrVar5;
        this.d = ffbrVar2;
        this.h = ffbrVar6;
        this.e = ffbrVar7;
        this.i = errlVar;
        this.j = ffbrVar8;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("TachyonBackgroundStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        elfl i;
        ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
        csjy.i("BugleNetwork", "Startup: registering tachyon.");
        listenableFutureArr[0] = ((cgwk) this.b.b()).u().i(new eroh() { // from class: chfd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((Boolean) obj).booleanValue() ? erqt.i(fcdu.a) : ((cgwk) chff.this.b.b()).s();
            }
        }, erpp.a);
        if (!chru.a()) {
            i = elfo.e(null);
        } else if (((ctwb) this.g.b()).r()) {
            csjy.i("BugleNetwork", "Startup: registering tachyon for phone.");
            ((colj) this.f.b()).o((ehxi) this.c.b());
            i = ((djrv) this.h.b()).f().i(new eroh() { // from class: chfe
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Set set = (Set) obj;
                    if (set.isEmpty()) {
                        ensk j = chff.a.j();
                        j.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/TachyonBackgroundStartupTask", "registerByPhones", 122, "TachyonBackgroundStartupTask.java")).q("No available phone number to start tachyon for.");
                        return elfo.e(null);
                    }
                    final chff chffVar = chff.this;
                    Stream map = Collection.EL.stream(set).map(new Function() { // from class: chfb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            String str = ((djrj) obj2).a;
                            chff chffVar2 = chff.this;
                            ((chxe) chffVar2.d.b()).a(str, 22);
                            return ((chfz) chffVar2.c.b()).a(Optional.of(((avkc) chffVar2.e.b()).c(str)));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i2 = engw.d;
                    return elfo.j((Iterable) map.collect(endq.a)).a(new Callable() { // from class: chfc
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return null;
                        }
                    }, erpp.a);
                }
            }, this.i);
        } else {
            csjy.i("BugleNetwork", "Startup: skip phone registration because of no sim.");
            i = elfo.e(null);
        }
        listenableFutureArr[1] = i;
        return elfl.g(elfr.b(listenableFutureArr).a(new eroi(null), this.i));
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}
