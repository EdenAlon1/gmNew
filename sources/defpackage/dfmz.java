package defpackage;

import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.IClearcutLoggerService;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfmz extends dfra implements dfle {
    public static final /* synthetic */ int b = 0;
    public final emyl a;

    static {
        new AtomicBoolean(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dfmz(android.content.Context r5, defpackage.emyl r6) {
        /*
            r4 = this;
            dfqt r0 = defpackage.dfld.c
            dfqo r1 = defpackage.dfqp.q
            dfqy r2 = new dfqy
            r2.<init>()
            dfry r3 = new dfry
            r3.<init>()
            r2.a = r3
            dfqz r2 = r2.a()
            r4.<init>(r5, r0, r1, r2)
            r4.a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfmz.<init>(android.content.Context, emyl):void");
    }

    private final dhre n(final dfkw dfkwVar) {
        ListenableFuture listenableFuture;
        Object e;
        final emwl emwlVar = new emwl() { // from class: dfmu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return dfmz.this.d((dfkw) obj, dfmg.c);
            }
        };
        if (dfkwVar.p) {
            Log.e("AbstractLogEventBuilder", "resolveComplianceData should not be invoked more than once per log.");
            listenableFuture = erre.a;
        } else {
            dfkwVar.p = true;
            dfli dfliVar = dfkwVar.o;
            if (dfliVar == null || dfliVar.b() != faxv.EVENT_OVERRIDE) {
                dflg dflgVar = dfkwVar.a.l;
                dfli a = dflgVar != null ? dflgVar.a() : null;
                if (a != null) {
                    faxv faxvVar = faxv.LOGGER_OVERRIDE_PROVIDER;
                    faxv faxvVar2 = ((dfkx) a).a;
                    if (faxvVar2 != faxvVar && faxvVar2 != faxv.LOGGER_DEFERRING_PROVIDER) {
                        Log.e("AbstractLogEventBuilder", "The provided logger-level ProductIdOrigin value " + faxvVar2.toString() + " is not one of the values expected for a logger-level provider: " + String.valueOf(faxv.LOGGER_OVERRIDE_PROVIDER) + " or " + String.valueOf(faxv.LOGGER_DEFERRING_PROVIDER));
                        a = null;
                    }
                }
                if (a != null) {
                    if (((dfkx) a).a == faxv.LOGGER_OVERRIDE_PROVIDER) {
                        dfkwVar.e(a);
                    }
                }
                dfli dfliVar2 = dfkwVar.m;
                if (dfliVar2 != null && dfliVar2.b() == faxv.CPS_APP_PROCESS_GLOBAL_PROVIDER) {
                    dfkwVar.e(dfliVar2);
                } else if (dfliVar != null) {
                    dfkwVar.e(dfliVar);
                } else if (a != null) {
                    dfkwVar.e(a);
                } else if (dfliVar2 != null) {
                    dfkwVar.e(dfliVar2);
                }
            } else {
                dfkwVar.e(dfliVar);
            }
            if (dfkwVar.a.e()) {
                listenableFuture = erre.a;
            } else {
                final ListenableFuture i = erqt.i(null);
                listenableFuture = erny.f(erny.g(i, new eroh() { // from class: dfku
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        if (((dflj) obj) != null) {
                            return i;
                        }
                        ListenableFuture listenableFuture2 = dfkw.this.n;
                        return listenableFuture2 == null ? erqt.i(null) : listenableFuture2;
                    }
                }, erpp.a), new emwl() { // from class: dfkv
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        dflj dfljVar = (dflj) obj;
                        if (dfljVar == null) {
                            return null;
                        }
                        dfkw dfkwVar2 = dfkw.this;
                        faxw faxwVar = ((faxq) dfkwVar2.b.instance).l;
                        if (faxwVar == null) {
                            faxwVar = faxw.a;
                        }
                        faxt faxtVar = (faxt) faxwVar.toBuilder();
                        faxw faxwVar2 = ((faxq) dfkwVar2.b.instance).l;
                        if (faxwVar2 == null) {
                            faxwVar2 = faxw.a;
                        }
                        ewat ewatVar = faxwVar2.e;
                        if (ewatVar == null) {
                            ewatVar = ewat.a;
                        }
                        ewas ewasVar = (ewas) ewatVar.toBuilder();
                        String b2 = dfljVar.b();
                        ewasVar.copyOnWrite();
                        ewat ewatVar2 = (ewat) ewasVar.instance;
                        b2.getClass();
                        ewatVar2.c = b2;
                        ewar a2 = dfljVar.a();
                        ewasVar.copyOnWrite();
                        ewat ewatVar3 = (ewat) ewasVar.instance;
                        a2.getClass();
                        ewatVar3.d = a2;
                        ewatVar3.b |= 1;
                        faxtVar.copyOnWrite();
                        faxw faxwVar3 = (faxw) faxtVar.instance;
                        ewat ewatVar4 = (ewat) ewasVar.build();
                        ewatVar4.getClass();
                        faxwVar3.e = ewatVar4;
                        faxwVar3.b |= 4;
                        faxw faxwVar4 = (faxw) faxtVar.build();
                        faxp faxpVar = dfkwVar2.b;
                        faxpVar.copyOnWrite();
                        faxq faxqVar = (faxq) faxpVar.instance;
                        faxwVar4.getClass();
                        faxqVar.l = faxwVar4;
                        faxqVar.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                        return null;
                    }
                }, erpp.a);
            }
        }
        if (listenableFuture.isDone() && !listenableFuture.isCancelled()) {
            try {
                ersn.a(listenableFuture);
                e = emwlVar.apply(dfkwVar);
            } catch (RuntimeException | ExecutionException unused) {
            }
            return (dhre) e;
        }
        e = duik.a(listenableFuture).e(erpp.a, new dhqh() { // from class: dfmr
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                int i2 = dfmz.b;
                if (dhreVar.m()) {
                    return emwl.this.apply(dfkwVar);
                }
                Log.e("ClearcutLoggerApiImpl", "Error resolving compliance data.", dhreVar.h());
                return dhreVar;
            }
        });
        return (dhre) e;
    }

    @Override // defpackage.dfle
    public final dhre a(dflc dflcVar) {
        return n(dflcVar);
    }

    @Override // defpackage.dfle
    public final dhre b(dfmm dfmmVar) {
        return n(dfmmVar);
    }

    @Override // defpackage.dfle
    public final void c(TimeUnit timeUnit) {
        try {
            dhrt.g(i(new dfmv()), 1100L, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException | TimeoutException unused2) {
        }
    }

    public final dhre d(dfkw dfkwVar, dfmg dfmgVar) {
        dfmy dfmyVar = new dfmy(this, dfkwVar, this.k, dfmgVar);
        super.m(2, dfmyVar);
        return dfwu.b(dfmyVar);
    }

    public final void e(final BatchedLogErrorParcelable batchedLogErrorParcelable) {
        if (batchedLogErrorParcelable.a.isEmpty()) {
            dhrt.c(Status.a);
            return;
        }
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dfmt
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                int i = dfmz.b;
                ((IClearcutLoggerService) ((dfna) obj).w()).logError(new dfmw((dhri) obj2), BatchedLogErrorParcelable.this);
            }
        };
        dfunVar.b = new Feature[]{dfmd.a};
        dfunVar.b();
        h(dfunVar.a());
    }
}
