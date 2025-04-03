package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aptv implements apvl {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/internal/InternalMessagePager");
    public final aptx a;
    final AtomicReference b = new AtomicReference(Optional.empty());
    private final errl d;
    private final errl e;
    private final apvw f;

    public aptv(errl errlVar, errl errlVar2, apvw apvwVar, aptx aptxVar) {
        this.d = errlVar;
        this.e = errlVar2;
        this.f = apvwVar;
        this.a = aptxVar;
        aptxVar.g();
    }

    private final elfl l(final elfl elflVar, final elfl elflVar2) {
        ekzz f = eleg.f("InternalMessagePager#process");
        try {
            elfl g = elfl.g(elfr.d(elflVar, elflVar2).a(new Callable() { // from class: aptq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    engw engwVar = (engw) erqt.q(elflVar);
                    apvi a = ((apvj) erqt.q(elflVar2)).a(engwVar);
                    return new apvf(engwVar, a.a, a.b, new apts(aptv.this));
                }
            }, this.d));
            f.b(g);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final elfl m(final int i) {
        ekzz f = eleg.f("InternalMessagePager#queryCountFuture");
        try {
            elfl g = elfo.g(new Callable() { // from class: apte
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return aptv.this.a.ac().c(i);
                }
            }, this.e);
            f.b(g);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxy
    public final alxw a(alxr alxrVar) {
        return i(alxrVar.b(), alxrVar.n());
    }

    @Override // defpackage.alxy
    public final alxw b(Integer num) {
        return new apso(num.intValue());
    }

    @Override // defpackage.alxy
    public final ctbx c(alxx alxxVar) {
        ekzz f = eleg.f("InternalMessagePager#subscribeToChanges");
        try {
            ctbx k = this.a.k(new aptr(this, alxxVar));
            f.close();
            return k;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.apvl
    public final void close() {
        j();
    }

    @Override // defpackage.alxy
    public final elfl d(final MessageId messageId) {
        ekzz f = eleg.f("InternalMessagePager#absoluteOffset");
        try {
            elfl h = elfo.h(new erog() { // from class: aptp
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return aptv.this.a.af(messageId);
                }
            }, this.e);
            f.b(h);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxy
    public final elfl e(final alxw alxwVar, final int i) {
        ekzz f = eleg.f("InternalMessagePager#loadAppend");
        try {
            j();
            elfl ah = this.a.ah(alxwVar, i);
            ekzz f2 = eleg.f("InternalMessagePager#queryCountAfterKeyFuture");
            try {
                elfl g = elfo.g(new Callable() { // from class: aptf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return aptv.this.a.ac().a(alxwVar);
                    }
                }, this.e);
                f2.b(g);
                f2.close();
                elfl h = l(ah, g).h(new emwl() { // from class: apth
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        apvf apvfVar = (apvf) obj;
                        engw engwVar = apvfVar.a;
                        aotr aotrVar = (aotr) aptv.this.a.ab();
                        boolean a = aotrVar.a(engwVar);
                        int i2 = i;
                        if (!a) {
                            aotrVar.b(apvfVar, i2);
                            return apvfVar;
                        }
                        engw engwVar2 = apvfVar.a;
                        if (!(((alxr) engwVar2.get(0)).b() instanceof CoreBuglePartialMessageId)) {
                            apvf apvfVar2 = new apvf(aotr.f(engwVar2, 0, i2), apvfVar.b, apvfVar.c + Math.max(0, apvfVar.a.size() - i2), aotrVar.b);
                            aotrVar.b(apvfVar2, i2);
                            return apvfVar2;
                        }
                        for (int i3 = 0; i3 < engwVar2.size(); i3++) {
                            alxw alxwVar2 = alxwVar;
                            alxr alxrVar = (alxr) engwVar2.get(i3);
                            emxf.l(alxrVar.b() instanceof CoreBuglePartialMessageId);
                            CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) alxrVar.b();
                            emxf.l(alxwVar2 instanceof aott);
                            aott aottVar = (aott) alxwVar2;
                            if (coreBuglePartialMessageId.b <= aottVar.b()) {
                                emxf.l(coreBuglePartialMessageId.a.a <= aottVar.a());
                                apvf apvfVar3 = new apvf(aotr.f(engwVar2, i3, i2 + i3), apvfVar.b, (engwVar2.size() - r6.size()) + apvfVar.c, aotrVar.b);
                                aotrVar.b(apvfVar3, i2);
                                return apvfVar3;
                            }
                        }
                        throw new IllegalStateException("Expected to find a valid target for the paging key in the results");
                    }
                }, erpp.a);
                f.b(h);
                f.close();
                return h;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxy
    public final elfl f(final alxw alxwVar, final int i) {
        elfl h;
        ekzz f = eleg.f("InternalMessagePager#loadInitial");
        try {
            ensk h2 = c.h();
            h2.Y(ente.a, "BugleMapi");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/api/messaging/message/internal/InternalMessagePager", "loadInitial", 77, "InternalMessagePager.java")).q("InternalMessagePager loadInitial start.");
            Optional j = j();
            if (alxwVar == null) {
                if (j.isPresent()) {
                    h = ((aptu) j.get()).a;
                    f.b(h);
                } else {
                    h = l(this.a.ag(0, i), m(0)).i(new eroh() { // from class: apti
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            int i2 = i;
                            return aptv.this.a.ab().d((apvf) obj, 0, i2);
                        }
                    }, erpp.a);
                    f.b(h);
                }
            } else if (alxwVar instanceof apus) {
                final int max = Math.max(((apus) alxwVar).a() - (i / 2), 0);
                h = l(this.a.ag(max, i), m(max)).i(new eroh() { // from class: aptj
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        int i2 = max;
                        int i3 = i;
                        return aptv.this.a.ab().d((apvf) obj, i2, i3);
                    }
                }, erpp.a);
                f.b(h);
            } else {
                elfl ai = this.a.ai(alxwVar, i);
                ekzz f2 = eleg.f("InternalMessagePager#queryCountInitialKeyFuture");
                try {
                    elfl g = elfo.g(new Callable() { // from class: apto
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return aptv.this.a.ac().b(alxwVar);
                        }
                    }, this.e);
                    f2.b(g);
                    f2.close();
                    h = l(ai, g).h(new emwl() { // from class: aptk
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            apvf apvfVar = (apvf) obj;
                            engw engwVar = apvfVar.a;
                            aotr aotrVar = (aotr) aptv.this.a.ab();
                            boolean a = aotrVar.a(engwVar);
                            int i2 = i;
                            if (!a) {
                                aotrVar.b(apvfVar, i2);
                                ensk e = aotr.a.e();
                                e.Y(ente.a, "BugleMapi");
                                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "clipInitial", 150, "BuglePagingClipToBounds.java")).u("returning message list without clipping, limit %d, list's size: %d", i2, apvfVar.a.size());
                                return apvfVar;
                            }
                            if (apvfVar.a.size() <= i2) {
                                aotrVar.b(apvfVar, i2);
                                ensk h3 = aotr.a.h();
                                h3.Y(ente.a, "BugleMapi");
                                ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "clipInitial", 159, "BuglePagingClipToBounds.java")).u("Skip clipping despite multi-part messages at boundary, limit %d, list's size: %d", i2, apvfVar.a.size());
                                return apvfVar;
                            }
                            alxw alxwVar2 = alxwVar;
                            engw engwVar2 = apvfVar.a;
                            int a2 = apvfVar.a(alxwVar2);
                            int i3 = i2 / 2;
                            int i4 = a2 - i3;
                            int i5 = a2 + i3;
                            int max2 = Math.max(0, i4);
                            int min = Math.min(i5 + (i2 % 2), engwVar2.size());
                            apvf apvfVar2 = new apvf(aotr.f(engwVar2, max2, min), apvfVar.b + max2, (apvfVar.c + engwVar2.size()) - min, aotrVar.b);
                            aotrVar.b(apvfVar2, i2);
                            return apvfVar2;
                        }
                    }, erpp.a);
                    f.b(h);
                } finally {
                }
            }
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxy
    public final elfl g(final alxw alxwVar, final int i) {
        ekzz f = eleg.f("InternalMessagePager#loadPrepend");
        try {
            j();
            elfl aj = this.a.aj(alxwVar, i);
            ekzz f2 = eleg.f("InternalMessagePager#queryCountBeforeKeyFuture");
            try {
                elfl g = elfo.g(new Callable() { // from class: aptg
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return aptv.this.a.ac().d(alxwVar);
                    }
                }, this.e);
                f2.b(g);
                f2.close();
                elfl h = l(aj, g).h(new emwl() { // from class: aptm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        CoreBuglePartialMessageId coreBuglePartialMessageId;
                        aott aottVar;
                        apvf apvfVar = (apvf) obj;
                        engw engwVar = apvfVar.a;
                        aotr aotrVar = (aotr) aptv.this.a.ab();
                        boolean a = aotrVar.a(engwVar);
                        int i2 = i;
                        if (!a) {
                            aotrVar.b(apvfVar, i2);
                            return apvfVar;
                        }
                        engw engwVar2 = apvfVar.a;
                        if (!(((alxr) enjk.j(engwVar2)).b() instanceof CoreBuglePartialMessageId)) {
                            int max = Math.max(0, apvfVar.a.size() - i2);
                            apvf apvfVar2 = new apvf(aotr.f(engwVar2, max, apvfVar.a.size()), apvfVar.b + max, apvfVar.c, aotrVar.b);
                            aotrVar.b(apvfVar2, i2);
                            return apvfVar2;
                        }
                        int size = apvfVar.a.size();
                        int size2 = engwVar2.size();
                        do {
                            size2--;
                            if (size2 < 0) {
                                throw new IllegalStateException("Expected to find a valid target for the paging key in the results");
                            }
                            alxw alxwVar2 = alxwVar;
                            alxr alxrVar = (alxr) engwVar2.get(size2);
                            emxf.l(alxrVar.b() instanceof CoreBuglePartialMessageId);
                            coreBuglePartialMessageId = (CoreBuglePartialMessageId) alxrVar.b();
                            emxf.l(alxwVar2 instanceof aott);
                            aottVar = (aott) alxwVar2;
                        } while (coreBuglePartialMessageId.b < aottVar.b());
                        emxf.l(coreBuglePartialMessageId.a.a >= aottVar.a());
                        int min = Math.min(size, size2 + 1);
                        apvf apvfVar3 = new apvf(aotr.f(engwVar2, Math.max(0, min - i2), min), (engwVar2.size() - r6.size()) + apvfVar.b, apvfVar.c, aotrVar.b);
                        aotrVar.b(apvfVar3, i2);
                        return apvfVar3;
                    }
                }, erpp.a);
                f.b(h);
                f.close();
                return h;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alxy
    public final elfl h(final MessageId messageId) {
        ekzz f = eleg.f("InternalMessagePager#pagingKeyOf");
        try {
            elfl g = elfo.g(new Callable() { // from class: aptn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    aptv aptvVar = aptv.this;
                    aptx aptxVar = aptvVar.a;
                    MessageId messageId2 = messageId;
                    return aptvVar.i(messageId2, aptxVar.ak(messageId2));
                }
            }, this.e);
            f.b(g);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final alxw i(MessageId messageId, Instant instant) {
        return this.a.aa(messageId, instant);
    }

    public final Optional j() {
        Optional optional = (Optional) this.b.getAndSet(Optional.empty());
        optional.ifPresent(new Consumer() { // from class: aptl
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((aptu) obj).b.a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return optional;
    }

    @Override // defpackage.apvl
    public final void k() {
        ekzz f = eleg.f("InternalMessagePager#startPreload");
        try {
            aptu aptuVar = new aptu();
            aptuVar.b = c(new aptt());
            aptx aptxVar = this.a;
            Object e = this.f.a.e();
            e.getClass();
            aptuVar.a = l(aptxVar.ag(0, ((Number) e).intValue()), m(0));
            emxf.l(((Optional) this.b.getAndSet(Optional.of(aptuVar))).isEmpty());
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
