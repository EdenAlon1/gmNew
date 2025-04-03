package defpackage;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.IGoogleLocationManagerService;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgzr extends dfra implements dgym {
    static final dfqs a;
    public static final dfqt b;

    static {
        dfqs dfqsVar = new dfqs();
        a = dfqsVar;
        b = new dfqt("LocationServices.API", new dgzp(), dfqsVar);
    }

    public dgzr(Activity activity) {
        super(activity, activity, b, dfqp.q, dfqz.a);
    }

    private final dhre n(final LocationRequest locationRequest, dftp dftpVar) {
        final dgzq dgzqVar = new dgzq(this, dftpVar);
        dfuf dfufVar = new dfuf() { // from class: dgzk
            /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[Catch: all -> 0x0090, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x001c, B:8:0x002a, B:11:0x0041, B:12:0x008e, B:16:0x005c, B:17:0x0032), top: B:3:0x001c }] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[Catch: all -> 0x0090, TryCatch #0 {, blocks: (B:4:0x001c, B:8:0x002a, B:11:0x0041, B:12:0x008e, B:16:0x005c, B:17:0x0032), top: B:3:0x001c }] */
            @Override // defpackage.dfuf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r23, java.lang.Object r24) {
                /*
                    r22 = this;
                    r1 = r22
                    r0 = r23
                    dhal r0 = (defpackage.dhal) r0
                    dfqt r2 = defpackage.dgzr.b
                    dgzq r2 = defpackage.dgzq.this
                    dftp r3 = r2.b()
                    dftn r4 = r3.b
                    r4.getClass()
                    com.google.android.gms.common.Feature r5 = defpackage.dgyl.j
                    boolean r5 = r0.N(r5)
                    cpn r6 = r0.a
                    monitor-enter(r6)
                    cpn r7 = r0.a     // Catch: java.lang.Throwable -> L90
                    java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L90
                    dhak r7 = (defpackage.dhak) r7     // Catch: java.lang.Throwable -> L90
                    r8 = 0
                    if (r7 == 0) goto L32
                    if (r5 == 0) goto L2a
                    goto L32
                L2a:
                    dhad r2 = r7.a     // Catch: java.lang.Throwable -> L90
                    r2.c(r3)     // Catch: java.lang.Throwable -> L90
                    r12 = r7
                    r7 = r8
                    goto L3d
                L32:
                    dhak r3 = new dhak     // Catch: java.lang.Throwable -> L90
                    r3.<init>(r2)     // Catch: java.lang.Throwable -> L90
                    cpn r2 = r0.a     // Catch: java.lang.Throwable -> L90
                    r2.put(r4, r3)     // Catch: java.lang.Throwable -> L90
                    r12 = r3
                L3d:
                    com.google.android.gms.location.LocationRequest r14 = r2
                    if (r5 == 0) goto L5c
                    android.os.IInterface r0 = r0.w()     // Catch: java.lang.Throwable -> L90
                    com.google.android.gms.location.internal.IGoogleLocationManagerService r0 = (com.google.android.gms.location.internal.IGoogleLocationManagerService) r0     // Catch: java.lang.Throwable -> L90
                    java.lang.String r2 = r4.a()     // Catch: java.lang.Throwable -> L90
                    com.google.android.gms.location.internal.LocationReceiver r2 = com.google.android.gms.location.internal.LocationReceiver.b(r7, r12, r2)     // Catch: java.lang.Throwable -> L90
                    dgzz r3 = new dgzz     // Catch: java.lang.Throwable -> L90
                    r4 = r24
                    dhri r4 = (defpackage.dhri) r4     // Catch: java.lang.Throwable -> L90
                    r3.<init>(r8, r4)     // Catch: java.lang.Throwable -> L90
                    r0.registerLocationClient(r2, r14, r3)     // Catch: java.lang.Throwable -> L90
                    goto L8e
                L5c:
                    android.os.IInterface r0 = r0.w()     // Catch: java.lang.Throwable -> L90
                    com.google.android.gms.location.internal.IGoogleLocationManagerService r0 = (com.google.android.gms.location.internal.IGoogleLocationManagerService) r0     // Catch: java.lang.Throwable -> L90
                    com.google.android.gms.location.internal.LocationRequestInternal r13 = new com.google.android.gms.location.internal.LocationRequestInternal     // Catch: java.lang.Throwable -> L90
                    r19 = 0
                    r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    r15 = 0
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L90
                    dhac r15 = new dhac     // Catch: java.lang.Throwable -> L90
                    r2 = r24
                    dhri r2 = (defpackage.dhri) r2     // Catch: java.lang.Throwable -> L90
                    r15.<init>(r2, r12)     // Catch: java.lang.Throwable -> L90
                    java.lang.String r16 = r4.a()     // Catch: java.lang.Throwable -> L90
                    com.google.android.gms.location.internal.LocationRequestUpdateData r9 = new com.google.android.gms.location.internal.LocationRequestUpdateData     // Catch: java.lang.Throwable -> L90
                    r11 = r13
                    r13 = 0
                    r14 = 0
                    r10 = 1
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L90
                    r0.updateLocationRequest(r9)     // Catch: java.lang.Throwable -> L90
                L8e:
                    monitor-exit(r6)     // Catch: java.lang.Throwable -> L90
                    return
                L90:
                    r0 = move-exception
                    monitor-exit(r6)     // Catch: java.lang.Throwable -> L90
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dgzk.a(java.lang.Object, java.lang.Object):void");
            }
        };
        dfud dfudVar = new dfud();
        dfudVar.a = dfufVar;
        dfudVar.b = dgzqVar;
        dfudVar.c = dftpVar;
        dfudVar.e = 2435;
        return j(dfudVar.a());
    }

    @Override // defpackage.dgym
    public final dhre a(final CurrentLocationRequest currentLocationRequest, final dhqd dhqdVar) {
        if (dhqdVar != null) {
            dfwv.b(!((dhqf) dhqdVar).a.l(), "cancellationToken may not be already canceled");
        }
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dgzm
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v4 */
            /* JADX WARN: Type inference failed for: r8v5 */
            /* JADX WARN: Type inference failed for: r8v6 */
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                cpn cpnVar;
                final dhal dhalVar = (dhal) obj;
                dfqt dfqtVar = dgzr.b;
                boolean N = dhalVar.N(dgyl.j);
                dhqd dhqdVar2 = dhqdVar;
                CurrentLocationRequest currentLocationRequest2 = CurrentLocationRequest.this;
                if (N) {
                    final ICancelToken currentLocationWithCallback = ((IGoogleLocationManagerService) dhalVar.w()).getCurrentLocationWithCallback(currentLocationRequest2, new LocationReceiver(4, null, new dhaa((dhri) obj2), null, null));
                    if (dhqdVar2 != null) {
                        dhqdVar2.a(new dhrb() { // from class: dgzs
                            @Override // defpackage.dhrb
                            public final void a() {
                                try {
                                    ICancelToken.this.cancel();
                                } catch (RemoteException unused) {
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                if (dhalVar.N(dgyl.e)) {
                    final ICancelToken currentLocation = ((IGoogleLocationManagerService) dhalVar.w()).getCurrentLocation(currentLocationRequest2, new dhaa((dhri) obj2));
                    if (dhqdVar2 != null) {
                        dhqdVar2.a(new dhrb() { // from class: dgzt
                            @Override // defpackage.dhrb
                            public final void a() {
                                try {
                                    ICancelToken.this.cancel();
                                } catch (RemoteException unused) {
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                final dhri dhriVar = (dhri) obj2;
                dftp c = dftq.c(new dgzx(dhalVar, dhriVar), erpp.a, "GetCurrentLocation");
                final dftn dftnVar = c.b;
                dftnVar.getClass();
                dgzy dgzyVar = new dgzy(c, dhriVar);
                dhri dhriVar2 = new dhri();
                dgyu dgyuVar = new dgyu(currentLocationRequest2.c, 0L);
                dgyuVar.e(0L);
                dgyuVar.b(currentLocationRequest2.d);
                dgyuVar.c(currentLocationRequest2.b);
                dgyuVar.d(currentLocationRequest2.a);
                dgyuVar.b = currentLocationRequest2.e;
                dgyuVar.g(currentLocationRequest2.f);
                ?? r8 = 1;
                boolean z = true;
                dgyuVar.a = true;
                dgyuVar.c = currentLocationRequest2.g;
                LocationRequest a2 = dgyuVar.a();
                dftn dftnVar2 = dgzyVar.a.b;
                dftnVar2.getClass();
                boolean N2 = dhalVar.N(dgyl.j);
                cpn cpnVar2 = dhalVar.v;
                synchronized (cpnVar2) {
                    try {
                        try {
                            dhah dhahVar = (dhah) dhalVar.v.get(dftnVar2);
                            if (dhahVar == null) {
                                z = N2;
                            } else if (!N2) {
                                throw new IllegalStateException();
                            }
                            dhah dhahVar2 = new dhah(dgzyVar);
                            dhalVar.v.put(dftnVar2, dhahVar2);
                            if (z) {
                                ((IGoogleLocationManagerService) dhalVar.w()).registerLocationClient(LocationReceiver.a(dhahVar, dhahVar2, dftnVar2.a()), a2, new dgzz(null, dhriVar2));
                                cpnVar = cpnVar2;
                            } else {
                                cpnVar = cpnVar2;
                                ((IGoogleLocationManagerService) dhalVar.w()).updateLocationRequest(new LocationRequestUpdateData(1, new LocationRequestInternal(a2, null, false, false, false, false, Long.MAX_VALUE), null, dhahVar2, null, new dgzw(dhriVar2, dhahVar2), dftnVar2.a()));
                            }
                            dhriVar2.a.s(new dhqs() { // from class: dgzu
                                @Override // defpackage.dhqs
                                public final void a(dhre dhreVar) {
                                    if (dhreVar.m()) {
                                        return;
                                    }
                                    dhri dhriVar3 = dhri.this;
                                    Exception h = dhreVar.h();
                                    h.getClass();
                                    dhriVar3.c(h);
                                }
                            });
                            if (dhqdVar2 != null) {
                                dhqdVar2.a(new dhrb() { // from class: dgzv
                                    @Override // defpackage.dhrb
                                    public final void a() {
                                        try {
                                            dhal.this.M(dftnVar, true, new dhri());
                                        } catch (RemoteException unused) {
                                        }
                                    }
                                });
                            }
                        } catch (Throwable th) {
                            th = th;
                            r8 = cpnVar2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        };
        dfunVar.c = 2415;
        dhre i = i(dfunVar.a());
        if (dhqdVar == null) {
            return i;
        }
        final dhri dhriVar = new dhri(dhqdVar);
        i.b(new dhqh() { // from class: dgzn
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                dfqt dfqtVar = dgzr.b;
                dhri dhriVar2 = dhri.this;
                if (dhreVar.m()) {
                    dhriVar2.d((Location) dhreVar.i());
                    return null;
                }
                Exception h = dhreVar.h();
                h.getClass();
                dhriVar2.c(h);
                return null;
            }
        });
        return dhriVar.a;
    }

    @Override // defpackage.dgym
    public final dhre b(LocationRequest locationRequest, Executor executor, dgyt dgytVar) {
        return n(locationRequest, dftq.c(dgytVar, executor, "dgyt"));
    }

    @Override // defpackage.dgym
    public final dhre c(int i) {
        dgyg dgygVar = new dgyg();
        dgygVar.c(i);
        return a(dgygVar.a(), (dhqd) null);
    }

    @Override // defpackage.dgym
    public final void d(dgyt dgytVar) {
        k(dftq.a(dgytVar, "dgyt"), 2418).c(new Executor() { // from class: dgzo
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new dhqh() { // from class: dgzl
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                dfqt dfqtVar = dgzr.b;
                return null;
            }
        });
    }

    @Override // defpackage.dgym
    public final void e(LocationRequest locationRequest, dgyt dgytVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            dfwv.o(looper, "invalid null looper");
        }
        n(locationRequest, dftq.b(dgytVar, looper, "dgyt"));
    }

    public dgzr(Context context) {
        super(context, b, dfqp.q, dfqz.a);
    }
}
