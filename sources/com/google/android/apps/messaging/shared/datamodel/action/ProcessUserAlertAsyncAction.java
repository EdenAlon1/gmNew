package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessUserAlertAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akzt;
import defpackage.baou;
import defpackage.bbfs;
import defpackage.bzax;
import defpackage.bzgd;
import defpackage.chep;
import defpackage.chww;
import defpackage.chyi;
import defpackage.chyj;
import defpackage.cskc;
import defpackage.ctyx;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.eogt;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.errl;
import defpackage.esea;
import defpackage.eyfc;
import defpackage.eyfy;
import defpackage.eygu;
import defpackage.fbzx;
import defpackage.fccj;
import defpackage.fcek;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessUserAlertAsyncAction extends Action<fbzx> {
    public final ffbr b;
    public final bzgd c;
    public final akzt d;
    public final ffbr e;
    public final chww f;
    private final ffbr g;
    private final errl h;
    private final errl i;
    private final chyj j;
    public static final cskc a = cskc.g("BugleNetwork", "ProcessUserAlertAsyncAction");
    public static final Parcelable.Creator<ProcessUserAlertAsyncAction> CREATOR = new baou();

    /* compiled from: PG */
    public interface a {
        bbfs bj();
    }

    public ProcessUserAlertAsyncAction(ffbr ffbrVar, ffbr ffbrVar2, bzgd bzgdVar, akzt akztVar, errl errlVar, errl errlVar2, chyj chyjVar, chww chwwVar, ffbr ffbrVar3, int i, fcek fcekVar, String str) {
        super(eogt.PROCESS_USER_ALERT_ACTION);
        this.g = ffbrVar;
        this.b = ffbrVar2;
        this.c = bzgdVar;
        this.d = akztVar;
        this.i = errlVar;
        this.h = errlVar2;
        this.j = chyjVar;
        this.f = chwwVar;
        this.e = ffbrVar3;
        this.t.r("alert_type_key", i);
        this.t.q("desktop_id_key", fcekVar.toByteArray());
        this.t.v("request_id_key", str);
        this.t.p("skip_revoke_key", false);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessUserAlertAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessUserAlert.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        w();
        return elfo.e(null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        elfl h;
        Boolean bool = (Boolean) bzax.a.e();
        if (bool.booleanValue()) {
            this.d.e("Bugle.Ditto.Action.Success.Metrics.Counts", 19);
        }
        ekzz f = eleg.f("ProcessUserAlertAsyncAction.executeAction");
        try {
            final esea b = esea.b(this.t.a("alert_type_key"));
            if (b == esea.BROWSER_ACTIVE || b == esea.BROWSER_INACTIVE || b == esea.BROWSER_INACTIVE_FROM_INACTIVITY || b == esea.BROWSER_INACTIVE_FROM_TIMEOUT) {
                byte[] A = this.t.A("desktop_id_key");
                String l = this.t.l("request_id_key");
                if (A == null || l == null) {
                    a.n("Desktop ID or request ID null, skipping UserAlert.");
                    elfo.e(null);
                } else {
                    try {
                        h = h((fcek) eyfy.parseFrom(fcek.a, A, eyfc.a()), l, b, Optional.empty()).h(new emwl() { // from class: baoo
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                cskc cskcVar = ProcessUserAlertAsyncAction.a;
                                return null;
                            }
                        }, erpp.a);
                    } catch (eygu e) {
                        a.o("Desktop ID invalid.", e);
                        elfo.e(null);
                    }
                }
                f.close();
                return null;
            }
            h = this.c.j(new Function() { // from class: baos
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bzej bzejVar = (bzej) obj;
                    return ProcessUserAlertAsyncAction.this.h(bzejVar.d(), bzejVar.e(), b, Optional.of(bzejVar));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).h(new emwl() { // from class: baot
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cskc cskcVar = ProcessUserAlertAsyncAction.a;
                    return null;
                }
            }, erpp.a);
            elfl e2 = h.e(Throwable.class, new emwl() { // from class: baop
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ProcessUserAlertAsyncAction.a.s("Action failed.", (Throwable) obj);
                    return null;
                }
            }, erpp.a);
            if (bool.booleanValue()) {
                e2.h(new emwl() { // from class: baoq
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        fbzx fbzxVar = (fbzx) obj;
                        ProcessUserAlertAsyncAction.this.d.e("Bugle.Ditto.Action.Success.Metrics.Counts", 20);
                        return fbzxVar;
                    }
                }, this.i);
            }
            f.close();
            return null;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final elfl h(final fcek fcekVar, final String str, final esea eseaVar, final Optional optional) {
        elfl e;
        int a2 = this.t.a("alert_type_key");
        if (a2 != 1 && a2 != 7) {
            e = elfo.e(fccj.a);
        } else if (this.t.y("skip_revoke_key")) {
            e = elfo.e(fccj.a);
        } else {
            cskc cskcVar = a;
            cskcVar.q("Revoking messages by this sender.");
            chyj chyjVar = this.j;
            chep chepVar = (chep) chyjVar.a.b();
            chepVar.getClass();
            ctyx ctyxVar = (ctyx) chyjVar.b.b();
            ctyxVar.getClass();
            fcekVar.getClass();
            chyi chyiVar = new chyi(chepVar, ctyxVar, fcekVar);
            if (chyiVar.a > 0) {
                cskcVar.q("Revoking starts.");
                e = ((chep) this.g.b()).a(chyiVar);
            } else {
                e = elfo.e(fccj.a);
            }
        }
        return e.i(new eroh() { // from class: baor
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                chwu c;
                eseb esebVar = (eseb) esec.a.createBuilder();
                esebVar.copyOnWrite();
                esec esecVar = (esec) esebVar.instance;
                esea eseaVar2 = eseaVar;
                esecVar.b = eseaVar2.a();
                esec esecVar2 = (esec) esebVar.build();
                csjb c2 = ProcessUserAlertAsyncAction.a.c();
                c2.I("Sending user alert, type:");
                esea b = esea.b(esecVar2.b);
                if (b == null) {
                    b = esea.UNRECOGNIZED;
                }
                String str2 = str;
                fcek fcekVar2 = fcekVar;
                ProcessUserAlertAsyncAction processUserAlertAsyncAction = ProcessUserAlertAsyncAction.this;
                c2.I(b);
                c2.r();
                if (((cgcu) processUserAlertAsyncAction.e.b()).a()) {
                    Optional optional2 = optional;
                    Object f = optional2.isPresent() ? optional2.get() : processUserAlertAsyncAction.c.f(fcekVar2.c);
                    if (f == null) {
                        ProcessUserAlertAsyncAction.a.r("Paired desktop not found, skip send user alert");
                        return elfo.d(new UnsupportedOperationException("Paired desktop not found, skip send user alert"));
                    }
                    c = processUserAlertAsyncAction.f.a(((bzej) f).c(), esaa.GET_UPDATES);
                    c.c = str2;
                    erxg erxgVar = (erxg) erxi.a.createBuilder();
                    erxgVar.copyOnWrite();
                    erxi erxiVar = (erxi) erxgVar.instance;
                    esecVar2.getClass();
                    erxiVar.c = esecVar2;
                    erxiVar.b = 6;
                    c.b(erxgVar.build());
                } else {
                    c = processUserAlertAsyncAction.f.c(fcekVar2, Optional.empty(), esaa.GET_UPDATES);
                    c.c = str2;
                    erxg erxgVar2 = (erxg) erxi.a.createBuilder();
                    erxgVar2.copyOnWrite();
                    erxi erxiVar2 = (erxi) erxgVar2.instance;
                    esecVar2.getClass();
                    erxiVar2.c = esecVar2;
                    erxiVar2.b = 6;
                    c.b(erxgVar2.build());
                }
                if (eseaVar2 == esea.BROWSER_INACTIVE || eseaVar2 == esea.BROWSER_INACTIVE_FROM_INACTIVITY || eseaVar2 == esea.BROWSER_INACTIVE_FROM_TIMEOUT) {
                    c.i = fbzr.USER;
                }
                chwv a3 = c.a();
                if (((Optional) processUserAlertAsyncAction.b.b()).isEmpty()) {
                    ProcessUserAlertAsyncAction.a.r("DittoRetryExecutor is not available on this device.");
                    return elfo.d(new UnsupportedOperationException("DittoRetryExecutor is not available on this device."));
                }
                elfl a4 = ((cikg) ((Optional) processUserAlertAsyncAction.b.b()).get()).a(a3);
                a3.q(a4);
                return a4;
            }
        }, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ProcessUserAlertAsyncAction(ffbr ffbrVar, ffbr ffbrVar2, bzgd bzgdVar, akzt akztVar, errl errlVar, errl errlVar2, chyj chyjVar, chww chwwVar, ffbr ffbrVar3, Parcel parcel) {
        super(parcel, eogt.PROCESS_USER_ALERT_ACTION);
        this.g = ffbrVar;
        this.b = ffbrVar2;
        this.c = bzgdVar;
        this.d = akztVar;
        this.i = errlVar;
        this.h = errlVar2;
        this.j = chyjVar;
        this.f = chwwVar;
        this.e = ffbrVar3;
    }
}
