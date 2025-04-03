package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtj implements abqv {
    private static final entd a = entd.c("Misthreading");
    private final abqx b;
    private final abti c;
    private final abtc d;

    public abtj(abqx abqxVar, abti abtiVar, abtc abtcVar) {
        this.b = abqxVar;
        this.c = abtiVar;
        this.d = abtcVar;
    }

    @Override // defpackage.abqv
    public final synchronized void a() {
        if (this.b.b()) {
            this.b.a();
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/custodian/inspectors/misthreading/Misthreading", "startAnalysis", 35, "Misthreading.java")).q("Starting analysis.");
            final abti abtiVar = this.c;
            cfup cfupVar = abti.a;
            final Runnable runnable = new Runnable() { // from class: abtf
                @Override // java.lang.Runnable
                public final void run() {
                    abti abtiVar2 = abti.this;
                    abtiVar2.d.L(abtiVar2);
                }
            };
            axnw.h(cfupVar.b().h(new emwl() { // from class: abqu
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return null;
                    }
                    runnable.run();
                    return null;
                }
            }, abtiVar.b));
            final abtc abtcVar = this.d;
            axnw.h(abtcVar.d.a(eldl.c(new erog() { // from class: absw
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    cfup cfupVar2 = abtc.a;
                    final abtc abtcVar2 = abtc.this;
                    final Supplier supplier = new Supplier() { // from class: absz
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            final abtc abtcVar3 = abtc.this;
                            final abtr abtrVar = abtcVar3.b;
                            return elfl.g(new ejlc(new erog() { // from class: abtk
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    final abtr abtrVar2 = abtr.this;
                                    return elfo.f(new Runnable() { // from class: abtl
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ((ensz) abtr.a.n().h("com/google/android/apps/messaging/custodian/inspectors/misthreading/RcsGroupIdUpdateChecker", "cacheExtantRcsGroupIds", 75, "RcsGroupIdUpdateChecker.java")).q("Caching existing RCS Group Ids.");
                                            Stream stream = Collection.EL.stream(abtr.a().entrySet());
                                            final abtr abtrVar3 = abtr.this;
                                            stream.forEach(new Consumer() { // from class: abtq
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void o(Object obj) {
                                                    Map.Entry entry = (Map.Entry) obj;
                                                    abtr.this.e.a.putIfAbsent((ConversationIdType) entry.getKey(), (String) entry.getValue());
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                        }
                                    }, abtrVar2.b);
                                }
                            }, abtrVar.c).c()).h(new emwl() { // from class: absx
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    abtc abtcVar4 = abtc.this;
                                    abtcVar4.e.L(abtcVar4);
                                    return null;
                                }
                            }, abtcVar3.c);
                        }
                    };
                    return cfupVar2.b().i(new eroh() { // from class: abqt
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            Object obj2;
                            if (!((Boolean) obj).booleanValue()) {
                                return elfo.e(null);
                            }
                            obj2 = Supplier.this.get();
                            return (ListenableFuture) obj2;
                        }
                    }, abtcVar2.c);
                }
            }), abtcVar.c));
        }
    }
}
