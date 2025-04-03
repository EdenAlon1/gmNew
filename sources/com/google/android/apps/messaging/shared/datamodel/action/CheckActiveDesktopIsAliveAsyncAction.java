package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.CheckActiveDesktopIsAliveAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.akzt;
import defpackage.bacr;
import defpackage.bbem;
import defpackage.bstt;
import defpackage.bsuz;
import defpackage.bsve;
import defpackage.bzaq;
import defpackage.bzax;
import defpackage.bzea;
import defpackage.bzee;
import defpackage.bzef;
import defpackage.bzej;
import defpackage.bzgd;
import defpackage.cgcu;
import defpackage.chep;
import defpackage.chez;
import defpackage.chwu;
import defpackage.chwv;
import defpackage.chww;
import defpackage.cqoh;
import defpackage.cskc;
import defpackage.csvw;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.eogt;
import defpackage.erpp;
import defpackage.errl;
import defpackage.ertu;
import defpackage.erxg;
import defpackage.erxi;
import defpackage.esaa;
import defpackage.eyfc;
import defpackage.eyfy;
import defpackage.eygu;
import defpackage.fazb;
import defpackage.fbzr;
import defpackage.fcek;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CheckActiveDesktopIsAliveAsyncAction extends Action<Void> {
    public final bbem d;
    public final bzgd e;
    public final akzt f;
    public final ffbr g;
    private final fazb h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final errl l;
    private final errl m;
    private final cqoh n;
    private final chww o;
    public static final cskc a = cskc.g("BugleAction", "CheckActiveDesktopIsAliveAsyncAction");
    public static final long b = TimeUnit.MINUTES.toMillis(((Integer) bzaq.l.e()).intValue());
    static final long c = TimeUnit.HOURS.toMillis(((Integer) bzaq.k.e()).intValue());
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bacr();

    /* compiled from: PG */
    public interface a {
        bbem aP();
    }

    public CheckActiveDesktopIsAliveAsyncAction(bbem bbemVar, bzgd bzgdVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar, errl errlVar2, cqoh cqohVar, akzt akztVar, chww chwwVar, ffbr ffbrVar4, Parcel parcel) {
        super(parcel, eogt.CHECK_ACTIVE_DESKTOP_IS_ALIVE_ACTION);
        this.d = bbemVar;
        this.e = bzgdVar;
        this.h = fazbVar;
        this.i = ffbrVar;
        this.j = ffbrVar2;
        this.k = ffbrVar3;
        this.l = errlVar;
        this.m = errlVar2;
        this.n = cqohVar;
        this.f = akztVar;
        this.o = chwwVar;
        this.g = ffbrVar4;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("CheckActiveDesktopIsAliveAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.CheckActiveDesktopIsAlive.ExecuteAction.Latency";
    }

    public final elfl d(byte[] bArr, String str, bzej bzejVar) {
        final fcek fcekVar;
        String str2;
        long j;
        chwu c2;
        try {
            if (((cgcu) this.g.b()).a()) {
                fcekVar = bzejVar.c().d;
                str2 = bzejVar.e();
            } else {
                fcekVar = (fcek) eyfy.parseFrom(fcek.a, bArr, eyfc.a());
                str2 = str;
            }
        } catch (eygu unused) {
        }
        if (!this.e.z(fcekVar)) {
            ((bzef) this.h.b()).n(fcekVar, bzee.SESSION_TERMINATED);
            return elfo.e(null);
        }
        bzgd bzgdVar = this.e;
        ekzz f = eleg.f("DittoDesktops#getMillisSinceLastDesktopConnection");
        try {
            bsuz a2 = bsve.a();
            a2.z("getMillisSinceLastDesktopConnection");
            a2.f(new Function() { // from class: bzfi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsvd bsvdVar = (bsvd) obj;
                    cskc cskcVar = bzgd.a;
                    bsvdVar.b(fcek.this.c);
                    return bsvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            a2.e(new Function() { // from class: bzfj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = bzgd.a;
                    return ((bstr) obj).c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            a2.x(1);
            bstt bsttVar = (bstt) a2.b().o();
            try {
                if (bsttVar.moveToFirst()) {
                    j = bzgdVar.e.f().toEpochMilli() - bsttVar.e();
                    bsttVar.close();
                    f.close();
                } else {
                    bsttVar.close();
                    f.close();
                    j = -1;
                }
                bsuz a3 = bsve.a();
                a3.z("getDesktopChallengeTime");
                a3.f(new Function() { // from class: bzew
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsvd bsvdVar = (bsvd) obj;
                        cskc cskcVar = bzgd.a;
                        bsvdVar.b(fcek.this.c);
                        return bsvdVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                a3.e(new Function() { // from class: bzfh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cskc cskcVar = bzgd.a;
                        return ((bstr) obj).d;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                a3.x(1);
                bstt bsttVar2 = (bstt) a3.b().o();
                try {
                    long f2 = bsttVar2.moveToFirst() ? bsttVar2.f() : -1L;
                    bsttVar2.close();
                    if (j > c) {
                        if (f2 < 0) {
                            if (((cgcu) this.g.b()).a()) {
                                c2 = this.o.a(bzejVar.c(), esaa.GET_UPDATES);
                                c2.c = str2;
                                erxg erxgVar = (erxg) erxi.a.createBuilder();
                                ertu ertuVar = ertu.a;
                                erxgVar.copyOnWrite();
                                erxi erxiVar = (erxi) erxgVar.instance;
                                ertuVar.getClass();
                                erxiVar.c = ertuVar;
                                erxiVar.b = 7;
                                c2.b(erxgVar.build());
                            } else {
                                c2 = this.o.c(fcekVar, Optional.empty(), esaa.GET_UPDATES);
                                c2.c = str;
                                erxg erxgVar2 = (erxg) erxi.a.createBuilder();
                                ertu ertuVar2 = ertu.a;
                                erxgVar2.copyOnWrite();
                                erxi erxiVar2 = (erxi) erxgVar2.instance;
                                ertuVar2.getClass();
                                erxiVar2.c = ertuVar2;
                                erxiVar2.b = 7;
                                c2.b(erxgVar2.build());
                            }
                            c2.i = fbzr.USER;
                            chwv a4 = c2.a();
                            ((bzea) this.i.b()).f(str2, fcekVar.c, esaa.GET_UPDATES.a(), 7, a4.c);
                            elfl a5 = ((cgcu) this.g.b()).a() ? ((chez) this.k.b()).a(a4) : ((chep) this.j.b()).a(a4);
                            a4.q(a5);
                            a5.k(new csvw(new Consumer() { // from class: back
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    CheckActiveDesktopIsAliveAsyncAction checkActiveDesktopIsAliveAsyncAction = CheckActiveDesktopIsAliveAsyncAction.this;
                                    checkActiveDesktopIsAliveAsyncAction.f.e("Bugle.Ditto.BrowserChallenge.Outcome", 1);
                                    String[] strArr = bsve.a;
                                    bsvb bsvbVar = new bsvb();
                                    bsvbVar.ap("updateDesktopChallengeTime");
                                    bsvbVar.d(checkActiveDesktopIsAliveAsyncAction.e.e.f().toEpochMilli());
                                    final fcek fcekVar2 = fcekVar;
                                    bsvbVar.f(new Function() { // from class: bzet
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            bsvd bsvdVar = (bsvd) obj2;
                                            cskc cskcVar = bzgd.a;
                                            bsvdVar.b(fcek.this.c);
                                            return bsvdVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    bsvbVar.a().e();
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, new Consumer() { // from class: bacl
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    CheckActiveDesktopIsAliveAsyncAction.this.f.e("Bugle.Ditto.BrowserChallenge.Outcome", 2);
                                    CheckActiveDesktopIsAliveAsyncAction.a.s("Error sending a browser challenge.", (Throwable) obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }), this.l);
                            return a5.h(new emwl() { // from class: bacm
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    cskc cskcVar = CheckActiveDesktopIsAliveAsyncAction.a;
                                    return null;
                                }
                            }, erpp.a);
                        }
                        if (this.n.f().toEpochMilli() - f2 > b) {
                            ((bzef) this.h.b()).n(fcekVar, bzee.SESSION_TIMEOUT);
                        }
                    }
                    return elfo.e(null);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        fcek fcekVar;
        Boolean bool = (Boolean) bzax.a.e();
        if (bool.booleanValue()) {
            this.f.e("Bugle.Ditto.Action.Success.Metrics.Counts", 11);
        }
        byte[] A = this.t.A("desktop_id_key");
        if (A != null) {
            try {
                fcekVar = (fcek) eyfy.parseFrom(fcek.a, A, eyfc.a());
            } catch (eygu unused) {
                fcekVar = null;
            }
            if (fcekVar != null && !this.e.z(fcekVar)) {
                ((bzef) this.h.b()).n(fcekVar, bzee.SESSION_TERMINATED);
            }
        }
        elfl e = this.e.j(new Function() { // from class: bacp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bzej bzejVar = (bzej) obj;
                if (bzejVar.f() || bzejVar.b() == byyv.SATELLITE) {
                    return elfo.e(null);
                }
                CheckActiveDesktopIsAliveAsyncAction checkActiveDesktopIsAliveAsyncAction = CheckActiveDesktopIsAliveAsyncAction.this;
                return ((cgcu) checkActiveDesktopIsAliveAsyncAction.g.b()).a() ? checkActiveDesktopIsAliveAsyncAction.d(bzejVar.c().d.toByteArray(), bzejVar.e(), bzejVar) : checkActiveDesktopIsAliveAsyncAction.d(bzejVar.d().toByteArray(), bzejVar.e(), bzejVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new emwl() { // from class: bacq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    CheckActiveDesktopIsAliveAsyncAction.this.d.a(null, null).y(117, CheckActiveDesktopIsAliveAsyncAction.b);
                }
                return null;
            }
        }, this.m).e(Throwable.class, new emwl() { // from class: bacn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                CheckActiveDesktopIsAliveAsyncAction.a.s("Action failed.", (Throwable) obj);
                return null;
            }
        }, erpp.a);
        return bool.booleanValue() ? e.h(new emwl() { // from class: baco
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                CheckActiveDesktopIsAliveAsyncAction.this.f.e("Bugle.Ditto.Action.Success.Metrics.Counts", 12);
                return null;
            }
        }, this.m) : e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public CheckActiveDesktopIsAliveAsyncAction(bbem bbemVar, bzgd bzgdVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar, errl errlVar2, cqoh cqohVar, akzt akztVar, chww chwwVar, ffbr ffbrVar4, fcek fcekVar, String str) {
        super(eogt.CHECK_ACTIVE_DESKTOP_IS_ALIVE_ACTION);
        this.d = bbemVar;
        this.e = bzgdVar;
        this.h = fazbVar;
        this.i = ffbrVar;
        this.j = ffbrVar2;
        this.k = ffbrVar3;
        this.l = errlVar;
        this.m = errlVar2;
        this.n = cqohVar;
        this.f = akztVar;
        this.o = chwwVar;
        this.g = ffbrVar4;
        if (fcekVar != null) {
            this.t.q("desktop_id_key", fcekVar.toByteArray());
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.t.v("request_id_key", str);
    }
}
