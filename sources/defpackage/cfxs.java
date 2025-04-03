package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfxs implements cfvx {
    public static final cskc a = cskc.g("BugleNetwork", "PhonePingRefreshHandler");
    public final chbx b;
    public final errl c;
    private final ffbr d;
    private final ffbr e;

    public cfxs(chbx chbxVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = chbxVar;
        this.c = errlVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
    }

    @Override // defpackage.cfvx
    public final elfl a() {
        if (chru.a()) {
            a.p("Refreshing Tachyon phone registration.");
            return elfo.k(((djrv) this.d.b()).f().h(new emwl() { // from class: cfxm
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Stream map = Collection.EL.stream((Set) obj).map(new Function() { // from class: cfxq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((djrj) obj2).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final cfxs cfxsVar = cfxs.this;
                    Stream map2 = map.map(new Function() { // from class: cfxr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cfxs cfxsVar2 = cfxs.this;
                            return cfxsVar2.b.d((String) obj2, 9).i(new eroh() { // from class: cfxp
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    return ((chbu) obj3).w();
                                }
                            }, cfxsVar2.c);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = engw.d;
                    return (engw) map2.collect(endq.a);
                }
            }, this.c)).a(new Callable() { // from class: cfxn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return null;
                }
            }, this.c).e(IllegalArgumentException.class, new emwl() { // from class: cfxo
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cfxs.a.s("Got IllegalArgumentException when refreshing phone registration", (IllegalArgumentException) obj);
                    return null;
                }
            }, erpp.a);
        }
        a.p("Phone registration refresh on ping is not enabled.");
        return elfo.e(null);
    }
}
