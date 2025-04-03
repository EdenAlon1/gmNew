package defpackage;

import io.grpc.Status;
import j$.time.Instant;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chzv implements ffbc {
    final AtomicBoolean a = new AtomicBoolean(false);
    final /* synthetic */ chzz b;

    public chzv(chzz chzzVar) {
        this.b = chzzVar;
        ekzz f = eleg.f("InnerReceiveMessagesResponseObserver");
        try {
            ((bzea) chzzVar.f.b()).q(eoys.BINDING_STARTED, fagh.OK, ((cgzv) chzzVar.u.b()).D(), chzzVar.J);
            ensk e = chzz.c.e();
            e.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "<init>", 776, "BindHandlerImpl.java")).t("%s BindHandler: New receiveMessages observer, pushing watchdog", epkl.a(chzzVar.J));
            chzzVar.g();
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

    private final void d() {
        if (this.a.compareAndSet(false, true)) {
            ekzz f = eleg.f("InnerReceiveMessagesResponseObserver::onNext::logDittoBindingStatusEvent");
            try {
                ((bzea) this.b.f.b()).q(eoys.FIRST_DATA_RECEIVED, fagh.OK, ((cgzv) this.b.u.b()).D(), this.b.J);
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

    @Override // defpackage.ffbc
    public final void a() {
        ((bzea) this.b.f.b()).q(eoys.ON_COMPLETE, fagh.OK, ((cgzv) this.b.u.b()).D(), this.b.J);
        ensk h = chzz.c.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onCompleted", 894, "BindHandlerImpl.java")).D("%s BindHandler: onCompleted thread: %s", epkl.a(this.b.J), Thread.currentThread().getName());
        this.b.j();
    }

    @Override // defpackage.ffbc
    public final void b(Throwable th) {
        fagh faghVar;
        ffbr ffbrVar = this.b.f;
        Status c = Status.c(th);
        bzea bzeaVar = (bzea) ffbrVar.b();
        eoys eoysVar = eoys.ON_ERROR;
        Status.Code code = c.getCode();
        switch (code) {
            case OK:
                faghVar = fagh.OK;
                break;
            case CANCELLED:
                faghVar = fagh.CANCELLED;
                break;
            case UNKNOWN:
                faghVar = fagh.UNKNOWN;
                break;
            case INVALID_ARGUMENT:
                faghVar = fagh.INVALID_ARGUMENT;
                break;
            case DEADLINE_EXCEEDED:
                faghVar = fagh.DEADLINE_EXCEEDED;
                break;
            case NOT_FOUND:
                faghVar = fagh.NOT_FOUND;
                break;
            case ALREADY_EXISTS:
                faghVar = fagh.ALREADY_EXISTS;
                break;
            case PERMISSION_DENIED:
                faghVar = fagh.PERMISSION_DENIED;
                break;
            case RESOURCE_EXHAUSTED:
                faghVar = fagh.RESOURCE_EXHAUSTED;
                break;
            case FAILED_PRECONDITION:
                faghVar = fagh.FAILED_PRECONDITION;
                break;
            case ABORTED:
                faghVar = fagh.ABORTED;
                break;
            case OUT_OF_RANGE:
                faghVar = fagh.OUT_OF_RANGE;
                break;
            case UNIMPLEMENTED:
                faghVar = fagh.UNIMPLEMENTED;
                break;
            case INTERNAL:
                faghVar = fagh.INTERNAL;
                break;
            case UNAVAILABLE:
                faghVar = fagh.UNAVAILABLE;
                break;
            case DATA_LOSS:
                faghVar = fagh.DATA_LOSS;
                break;
            case UNAUTHENTICATED:
                faghVar = fagh.UNAUTHENTICATED;
                break;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(code.toString()));
        }
        bzeaVar.q(eoysVar, faghVar, ((cgzv) this.b.u.b()).D(), this.b.J);
        this.b.v.e("Bugle.Binding.Error.Counts", c.getCode().value());
        if (th.getCause() instanceof chzw) {
            ensk h = chzz.c.h();
            h.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onError", 857, "BindHandlerImpl.java")).t("%s BindHandler: onError is called with IntendedStreamCloseException. No-op.", epkl.a(this.b.J));
            return;
        }
        if (th.getCause() instanceof chzx) {
            ensk j = chzz.c.j();
            j.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onError", 865, "BindHandlerImpl.java")).t("%s BindHandler: onError triggered due to pong watchdog timeout", epkl.a(this.b.J));
        } else {
            ensk j2 = chzz.c.j();
            j2.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) ((enrr) j2).g(th)).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onError", 869, "BindHandlerImpl.java")).J("%s BindHandler: onError status: %s thread: %s", epkl.a(this.b.J), c, Thread.currentThread().getName());
        }
        if (!chfh.c(c.getCode())) {
            chzz chzzVar = this.b;
            if (c.getCode() != Status.Code.UNAUTHENTICATED) {
                ensk h2 = chzz.c.h();
                h2.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onError", 878, "BindHandlerImpl.java")).t("%s BindHandler: Error is not retriable. Stopping bind handler.", epkl.a(this.b.J));
                this.b.j();
                return;
            }
            ensk h3 = chzz.c.h();
            h3.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "isUnauthenticateAndRetriable", 903, "BindHandlerImpl.java")).t("%s BindHandler: Got Unauthenticated error. Will use refreshed token for next Bind retry", epkl.a(chzzVar.J));
            chzzVar.l.set(true);
        }
        this.b.i();
        final chzz chzzVar2 = this.b;
        AtomicInteger atomicInteger = chzzVar2.k;
        int i = chzzVar2.F;
        int andIncrement = atomicInteger.getAndIncrement();
        int i2 = i - andIncrement;
        boolean z = ((csiy) chzzVar2.g.b()).a;
        if (z) {
            ensk h4 = chzz.c.h();
            h4.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shouldRetry", 915, "BindHandlerImpl.java")).B("%s BindHandler: Retry bind because app is in foreground count: %d", epkl.a(chzzVar2.J), andIncrement);
        } else {
            if (i2 <= 0) {
                ensk h5 = chzz.c.h();
                h5.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shouldRetry", 926, "BindHandlerImpl.java")).K("%s BindHandler: Not retrying bind count: %d left: %d isForeground: %s", epkl.a(chzzVar2.J), Integer.valueOf(andIncrement), Integer.valueOf(i2), false);
                ensk h6 = chzz.c.h();
                h6.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h6).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "retryStreamOrCloseSession", 591, "BindHandlerImpl.java")).t("%s BindHandler: No binding retry times left, skip binding retry", epkl.a(chzzVar2.J));
                chzzVar2.v.e("Bugle.Ditto.Binding.Retry.Counts", 1);
                chzzVar2.j();
                return;
            }
            ensk h7 = chzz.c.h();
            h7.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h7).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shouldRetry", 921, "BindHandlerImpl.java")).J("%s BindHandler: Retry bind count: %d left: %d", epkl.a(chzzVar2.J), Integer.valueOf(andIncrement), Integer.valueOf(i2));
        }
        if (andIncrement == 0) {
            chzzVar2.v.e("Bugle.Ditto.Binding.Retry.Counts", 2);
        } else if (andIncrement == 1) {
            chzzVar2.v.e("Bugle.Ditto.Binding.Retry.Counts", 3);
        } else if (andIncrement != 2) {
            chzzVar2.v.e("Bugle.Ditto.Binding.Retry.Counts", 5);
        } else {
            chzzVar2.v.e("Bugle.Ditto.Binding.Retry.Counts", 4);
        }
        double doubleValue = ((Double) chzz.a.e()).doubleValue();
        int intValue = ((Integer) cgyj.f.e()).intValue();
        int intValue2 = ((Integer) chzz.b.e()).intValue();
        synchronized (chzzVar2.n) {
            ScheduledFuture scheduledFuture = chzzVar2.o;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                ensk e = chzz.c.e();
                e.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "randomizeRetryBackOff", 611, "BindHandlerImpl.java")).t("%s BindHandler: RetryTimeoutFuture is running, skipping", epkl.a(chzzVar2.J));
                return;
            }
            if (z) {
                andIncrement = Math.min(andIncrement, intValue2);
            }
            int pow = (int) (Math.pow(doubleValue, andIncrement) * 1000.0d);
            int nextInt = intValue * (pow - ThreadLocalRandom.current().nextInt(pow / 2));
            ensk h8 = chzz.c.h();
            h8.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h8).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "randomizeRetryBackOff", 619, "BindHandlerImpl.java")).B("%s BindHandler: Start binding retry in: %d ms", epkl.a(chzzVar2.J), nextInt);
            chzzVar2.o = chzzVar2.x.schedule(new Runnable() { // from class: chzq
                @Override // java.lang.Runnable
                public final void run() {
                    chzz chzzVar3 = chzz.this;
                    ekzm b = chzzVar3.i.b("BindHandlerImpl#triggerRetryTimeout");
                    try {
                        ensk h9 = chzz.c.h();
                        h9.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) h9).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerRetryTimeout", 644, "BindHandlerImpl.java")).t("%s BindHandler: Binding retry timeout triggered", epkl.a(chzzVar3.J));
                        synchronized (chzzVar3.n) {
                            chzzVar3.o = null;
                        }
                        chzzVar3.e(false);
                        b.close();
                    } catch (Throwable th2) {
                        try {
                            b.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }, nextInt, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.ffbc
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        fcbj fcbjVar = (fcbj) obj;
        ensk h = chzz.c.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onNext", 785, "BindHandlerImpl.java")).D("%s BindHandler: Received onNext in BindHandlerImpl body: %s", epkl.a(this.b.J), fcau.a(fcbjVar.b));
        try {
            this.b.g();
            int ordinal = fcau.a(fcbjVar.b).ordinal();
            if (ordinal == 0) {
                this.b.v.g("Bugle.Network.Rpc.Response.Size.Bytes", fcbjVar.getSerializedSize());
                chzz chzzVar = this.b;
                fbzt fbztVar = fcbjVar.b == 2 ? (fbzt) fcbjVar.c : fbzt.a;
                ensk h2 = chzz.c.h();
                h2.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "handleInboxMessage", 453, "BindHandlerImpl.java")).D("%s BindHandler: Received message messageId: %s", epkl.a(chzzVar.J), fbztVar.c);
                cimr cimrVar = (cimr) chzzVar.j.b();
                fcbc fcbcVar = fcbjVar.d;
                if (fcbcVar == null) {
                    fcbcVar = fcbc.a;
                }
                fbzs b = fbzs.b(fbztVar.d);
                if (b == null) {
                    b = fbzs.UNRECOGNIZED;
                }
                if (b == fbzs.TACHYGRAM_MESSAGE) {
                    fgke fgkeVar = (fgke) fgkf.a.createBuilder();
                    cimp cimpVar = new cimp();
                    int i = fcbcVar.b;
                    fcbb fcbbVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : fcbb.INITIAL_PULL_MESSAGES : fcbb.COLLIDER_SECOND_FANOUT_ATTEMPT : fcbb.COLLIDER_FIRST_FANOUT_ATTEMPT : fcbb.UNKNOWN_MESSAGE_ORIGIN;
                    if (fcbbVar == null) {
                        fcbbVar = fcbb.UNRECOGNIZED;
                    }
                    fgka fgkaVar = (fgka) cimpVar.fP(fcbbVar);
                    fgkeVar.copyOnWrite();
                    fgkf fgkfVar = (fgkf) fgkeVar.instance;
                    fgkfVar.c = Integer.valueOf(fgkaVar.a());
                    fgkfVar.b = 5;
                    fgkf fgkfVar2 = (fgkf) fgkeVar.build();
                    bdhg a = bdhg.a(fbztVar.c);
                    fgkd fgkdVar = (fgkd) fgki.a.createBuilder();
                    fjay a2 = cslr.a();
                    fgkdVar.copyOnWrite();
                    fgki fgkiVar = (fgki) fgkdVar.instance;
                    a2.getClass();
                    fgkiVar.c = a2;
                    fgkiVar.b = 1 | fgkiVar.b;
                    fgkdVar.copyOnWrite();
                    ((fgki) fgkdVar.instance).e = fgkh.a(9);
                    fgkdVar.copyOnWrite();
                    ((fgki) fgkdVar.instance).g = fgkg.a(50);
                    fgkb fgkbVar = (fgkb) fgkc.a.createBuilder();
                    fgkbVar.a(fbztVar.c);
                    fgkc fgkcVar = (fgkc) fgkbVar.build();
                    fgkdVar.copyOnWrite();
                    fgki fgkiVar2 = (fgki) fgkdVar.instance;
                    fgkcVar.getClass();
                    fgkiVar2.d = fgkcVar;
                    fgkiVar2.b |= 2;
                    fgkdVar.copyOnWrite();
                    fgki fgkiVar3 = (fgki) fgkdVar.instance;
                    fgkfVar2.getClass();
                    fgkiVar3.i = fgkfVar2;
                    fgkiVar3.b |= 32;
                    cimrVar.b(a, fgkdVar);
                }
                chzzVar.h();
                chzzVar.z.a(fbztVar);
            } else if (ordinal == 1) {
                Instant f = this.b.h.f();
                synchronized (this.b.n) {
                    if (f.isAfter(this.b.r)) {
                        ensk h3 = chzz.c.h();
                        h3.Y(ente.a, "BugleNetwork");
                        enrr enrrVar = (enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onNext", 805, "BindHandlerImpl.java");
                        chzz chzzVar2 = this.b;
                        enrrVar.J("%s BindHandler: Received pong after scheduled idle timeout. Treat it as idle timeout. now: %s idleTimerExpirationTime: %s", epkl.a(chzzVar2.J), f, chzzVar2.r);
                        this.b.k();
                    }
                }
            }
        } finally {
            d();
        }
    }
}
