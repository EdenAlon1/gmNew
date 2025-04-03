package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.time.trustedtime.dto.GlobalState;
import com.google.android.gms.time.trustedtime.dto.TimeSignalResult;
import com.google.android.gms.time.trustedtime.internal.ITrustedTimeService;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqol {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/time/clock/TrustedTimeWrapper");
    public final ffsk b;
    private final cqoh c;
    private final ffss d;

    public cqol(Context context, ffsk ffskVar, cqoh cqohVar) {
        dhre dhreVar;
        dhre dhreVar2;
        dhre e;
        context.getClass();
        ffskVar.getClass();
        cqohVar.getClass();
        this.b = ffskVar;
        this.c = cqohVar;
        dhto dhtoVar = new dhto(context);
        final Context applicationContext = context.getApplicationContext();
        synchronized (dhtoVar.b) {
            if (dhtoVar.m == null) {
                final dhuf dhufVar = dhtoVar.a;
                Context context2 = dhtoVar.c;
                synchronized (dhufVar.b) {
                    dhre dhreVar3 = dhufVar.c;
                    if (dhreVar3 != null) {
                        dhufVar.d++;
                        e = dhreVar3.e(erpp.a, new dhqh() { // from class: dhua
                            @Override // defpackage.dhqh
                            public final Object a(dhre dhreVar4) {
                                return dhreVar4.m() ? dhrt.c((dhue) dhreVar4.i()) : dhuu.a(dhreVar4);
                            }
                        });
                    } else {
                        Context applicationContext2 = context2.getApplicationContext();
                        dhtz dhtzVar = dhufVar.e;
                        final dhti dhtiVar = new dhti(applicationContext2);
                        dhufVar.d = 1;
                        synchronized (dhtiVar.b) {
                            if (dhtiVar.n) {
                                throw new IllegalStateException("dispose() has been called");
                            }
                            if (dhtiVar.m == null) {
                                dfun dfunVar = new dfun();
                                dfunVar.b = new Feature[]{dhsf.a};
                                dfunVar.c = 29801;
                                dfunVar.a = new dfuf() { // from class: dhtc
                                    @Override // defpackage.dfuf
                                    public final void a(Object obj, Object obj2) {
                                        dhuo dhuoVar = (dhuo) obj;
                                        int i = dhti.o;
                                        dhtf dhtfVar = new dhtf((dhri) obj2);
                                        Context context3 = dhuoVar.c;
                                        ((ITrustedTimeService) dhuoVar.w()).retrieveGlobalState(dhtfVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                                    }
                                };
                                dhre i = dhtiVar.i(dfunVar.a());
                                final dhth dhthVar = new dhth();
                                final erpp erppVar = erpp.a;
                                dhtiVar.m = i.e(erppVar, new dhqh() { // from class: dhsx
                                    @Override // defpackage.dhqh
                                    public final Object a(dhre dhreVar4) {
                                        int i2 = dhti.o;
                                        dhth dhthVar2 = dhth.this;
                                        if (dhreVar4.m()) {
                                            dhthVar2.a = (GlobalState) dhreVar4.i();
                                            return dhrt.c(dhthVar2);
                                        }
                                        dhthVar2.a();
                                        return dhuu.a(dhreVar4);
                                    }
                                }).e(erppVar, new dhqh() { // from class: dhsy
                                    @Override // defpackage.dhqh
                                    public final Object a(dhre dhreVar4) {
                                        if (!dhreVar4.m()) {
                                            return dhuu.a(dhreVar4);
                                        }
                                        dhth dhthVar2 = (dhth) dhreVar4.i();
                                        GlobalState globalState = dhthVar2.a;
                                        if (globalState == null) {
                                            dhthVar2.a();
                                            return dhrt.b(new IllegalStateException("taskChainState.globalState unexpectedly null"));
                                        }
                                        dhti dhtiVar2 = dhti.this;
                                        Context context3 = dhtiVar2.c;
                                        dhthVar2.b = new dhsv(context3, dhtiVar2, globalState, koa.e(context3));
                                        return dhrt.c(dhthVar2);
                                    }
                                }).e(erppVar, new dhqh() { // from class: dhsz
                                    @Override // defpackage.dhqh
                                    public final Object a(dhre dhreVar4) {
                                        if (!dhreVar4.m()) {
                                            return dhuu.a(dhreVar4);
                                        }
                                        dhti dhtiVar2 = dhti.this;
                                        dhth dhthVar2 = (dhth) dhreVar4.i();
                                        synchronized (dhtiVar2.b) {
                                            if (dhtiVar2.n) {
                                                dhthVar2.a();
                                                return dhrt.b(new IllegalStateException("dispose() called"));
                                            }
                                            final dhsv dhsvVar = dhthVar2.b;
                                            if (dhsvVar == null) {
                                                dhthVar2.a();
                                                return dhrt.b(new IllegalStateException("taskChainState.timeSignalSupplier unexpectedly null"));
                                            }
                                            dhuj dhujVar = dhsvVar.a;
                                            ksp kspVar = new ksp() { // from class: dhsu
                                                @Override // defpackage.ksp
                                                public final void accept(Object obj) {
                                                    dhsv.this.c((TimeSignalResult) obj);
                                                }
                                            };
                                            synchronized (((dhul) dhujVar).d) {
                                                BroadcastReceiver broadcastReceiver = ((dhul) dhujVar).e;
                                                if (broadcastReceiver != null) {
                                                    throw new IllegalStateException(a.G(broadcastReceiver, "timeSignalReceiver != null, timeSignalReceiver="));
                                                }
                                                dhuk dhukVar = new dhuk(kspVar);
                                                ((dhul) dhujVar).e = dhukVar;
                                                dhul.a.incrementAndGet();
                                                IntentFilter intentFilter = new IntentFilter(((dhul) dhujVar).c.b);
                                                dhtk.a.n().D("Registering broadcast receiver=%s with filter=%s", dhukVar, intentFilter);
                                                koa.h(((dhul) dhujVar).b, dhukVar, intentFilter, "com.google.android.gms.time.permission.SEND_TRUSTED_TIME_SIGNAL");
                                            }
                                            return dhrt.c(dhthVar2);
                                        }
                                    }
                                }).e(erppVar, new dhqh() { // from class: dhta
                                    @Override // defpackage.dhqh
                                    public final Object a(dhre dhreVar4) {
                                        Executor executor = erppVar;
                                        if (!dhreVar4.m()) {
                                            return dhuu.a(dhreVar4);
                                        }
                                        dhti dhtiVar2 = dhti.this;
                                        final dhth dhthVar2 = (dhth) dhreVar4.i();
                                        synchronized (dhtiVar2.b) {
                                            if (dhtiVar2.n) {
                                                dhthVar2.a();
                                                return dhrt.b(new IllegalStateException("dispose() called"));
                                            }
                                            dfun dfunVar2 = new dfun();
                                            dfunVar2.b = new Feature[]{dhsf.a};
                                            dfunVar2.c = 29822;
                                            dfunVar2.a = new dfuf() { // from class: dhtd
                                                @Override // defpackage.dfuf
                                                public final void a(Object obj, Object obj2) {
                                                    dhuo dhuoVar = (dhuo) obj;
                                                    int i2 = dhti.o;
                                                    dhtg dhtgVar = new dhtg((dhri) obj2);
                                                    Context context3 = dhuoVar.c;
                                                    ((ITrustedTimeService) dhuoVar.w()).getLatestTimeSignal(dhtgVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                                                }
                                            };
                                            return dhtiVar2.i(dfunVar2.a()).e(executor, new dhqh() { // from class: dhsw
                                                @Override // defpackage.dhqh
                                                public final Object a(dhre dhreVar5) {
                                                    int i2 = dhti.o;
                                                    boolean m = dhreVar5.m();
                                                    dhth dhthVar3 = dhth.this;
                                                    if (!m) {
                                                        dhthVar3.a();
                                                        return dhuu.a(dhreVar5);
                                                    }
                                                    dhsv dhsvVar = dhthVar3.b;
                                                    if (dhsvVar == null) {
                                                        dhthVar3.a();
                                                        return dhrt.b(new IllegalStateException("taskChainState.timeSignalSupplier unexpectedly null"));
                                                    }
                                                    TimeSignalResult timeSignalResult = (TimeSignalResult) dhreVar5.i();
                                                    if (timeSignalResult != null) {
                                                        dhsvVar.c(timeSignalResult);
                                                    }
                                                    return dhrt.c(dhthVar3);
                                                }
                                            });
                                        }
                                    }
                                }).e(erppVar, new dhqh() { // from class: dhtb
                                    @Override // defpackage.dhqh
                                    public final Object a(dhre dhreVar4) {
                                        if (!dhreVar4.m()) {
                                            return dhuu.a(dhreVar4);
                                        }
                                        dhti dhtiVar2 = dhti.this;
                                        dhth dhthVar2 = (dhth) dhreVar4.i();
                                        synchronized (dhtiVar2.b) {
                                            dhsv dhsvVar = dhthVar2.b;
                                            if (dhsvVar == null) {
                                                dhthVar2.a();
                                                return dhrt.b(new IllegalStateException("taskChainState.timeSignalSupplier unexpectedly null"));
                                            }
                                            if (!dhtiVar2.n) {
                                                return dhrt.c(dhsvVar);
                                            }
                                            dhthVar2.a();
                                            return dhrt.b(new IllegalStateException("dispose() called"));
                                        }
                                    }
                                });
                            }
                            dhreVar2 = dhtiVar.m;
                        }
                        dhre e2 = dhreVar2.e(erpp.a, new dhqh() { // from class: dhub
                            @Override // defpackage.dhqh
                            public final Object a(dhre dhreVar4) {
                                dhuf dhufVar2 = dhuf.this;
                                if (dhreVar4.m()) {
                                    return dhrt.c(new dhue(dhufVar2, (dhtt) dhreVar4.i(), new dhtq(erpp.a, new ecda("ShareableTimeSignalSupplierAdapter"))));
                                }
                                dhtiVar.a();
                                synchronized (dhufVar2.b) {
                                    dhufVar2.c = null;
                                    dhufVar2.d = 0;
                                }
                                return dhuu.a(dhreVar4);
                            }
                        });
                        dhufVar.c = e2;
                        e = e2.e(erpp.a, new dhqh() { // from class: dhuc
                            @Override // defpackage.dhqh
                            public final Object a(dhre dhreVar4) {
                                return dhreVar4.m() ? dhrt.c((dhty) dhreVar4.i()) : dhuu.a(dhreVar4);
                            }
                        });
                    }
                }
                dhtoVar.m = e.e(erpp.a, new dhqh() { // from class: dhtn
                    @Override // defpackage.dhqh
                    public final Object a(dhre dhreVar4) {
                        return dhreVar4.m() ? dhrt.c(new dhtm((dhty) dhreVar4.i())) : dhuu.a(dhreVar4);
                    }
                });
            }
            dhreVar = dhtoVar.m;
        }
        dhre c = dhreVar.e(erpp.a, new dhqh() { // from class: dhsi
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar4) {
                if (!dhreVar4.m()) {
                    return dhuu.a(dhreVar4);
                }
                Context context3 = applicationContext;
                return dhrt.c(new dhug(new dhun(new dhus((dhtt) dhreVar4.i()), new dhst(koa.e(context3), new ecda("TrustedTimeClientAdapter"))), new dhuq(context3)));
            }
        }).c(erpp.a, new dhqh() { // from class: cqoi
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar4) {
                if (dhreVar4.m()) {
                    return (dhsj) dhreVar4.i();
                }
                ensk j = cqol.a.j();
                j.Y(ente.a, "BugleMls");
                ((enrr) ((enrr) j).g(dhreVar4.h()).h("com/google/android/apps/messaging/shared/time/clock/TrustedTimeWrapper", "initializeTrustedTimeClientTask$lambda$0", 57, "TrustedTimeWrapper.kt")).q("Unable to initialize trusted client [ctor]");
                return null;
            }
        });
        final ffrq ffrqVar = new ffrq();
        if (c.l()) {
            Exception h = c.h();
            if (h != null) {
                ffrqVar.a(h);
            } else if (((dhrm) c).d) {
                ffrqVar.t(null);
            } else {
                ffrqVar.S(c.i());
            }
        } else {
            c.o(fgjp.a, new dhqs() { // from class: fgjq
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.dhqs
                public final void a(dhre dhreVar4) {
                    ffrp ffrpVar = ffrp.this;
                    Exception h2 = dhreVar4.h();
                    if (h2 != null) {
                        ffrpVar.a(h2);
                    } else if (((dhrm) dhreVar4).d) {
                        ffrpVar.t(null);
                    } else {
                        ((ffuq) ffrpVar).S(dhreVar4.i());
                    }
                }
            });
        }
        this.d = new fgjr(ffrqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cqoj
            if (r0 == 0) goto L13
            r0 = r5
            cqoj r0 = (defpackage.cqoj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqoj r0 = new cqoj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cqol r0 = r0.d
            defpackage.ffci.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            ffss r5 = r4.d
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 == r1) goto L6e
            r0 = r4
        L41:
            ffss r5 = r0.d
            boolean r5 = r5.y()
            if (r5 == 0) goto L64
            ffss r5 = r0.d
            java.lang.Object r5 = r5.d()
            dhsj r5 = (defpackage.dhsj) r5
            if (r5 == 0) goto L5a
            j$.time.Instant r5 = r5.a()
            if (r5 == 0) goto L5a
            return r5
        L5a:
            cqoh r5 = r0.c
            j$.time.Instant r5 = r5.f()
            r5.getClass()
            return r5
        L64:
            cqoh r5 = r0.c
            j$.time.Instant r5 = r5.f()
            r5.getClass()
            return r5
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqol.a(ffgu):java.lang.Object");
    }
}
