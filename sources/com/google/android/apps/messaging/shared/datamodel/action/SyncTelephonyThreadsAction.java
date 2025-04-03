package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.action.SyncTelephonyThreadsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.actionfactories.SyncTelephonyThreadsActionFactory$SchedulableSyncTelephonyThreadsAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.akxl;
import defpackage.aoku;
import defpackage.aoqj;
import defpackage.aoqm;
import defpackage.ayhv;
import defpackage.baza;
import defpackage.bazb;
import defpackage.bbfw;
import defpackage.bdfw;
import defpackage.bskr;
import defpackage.bsob;
import defpackage.bsom;
import defpackage.cfup;
import defpackage.cfva;
import defpackage.cfvl;
import defpackage.cgpv;
import defpackage.clav;
import defpackage.clax;
import defpackage.clbd;
import defpackage.cmh;
import defpackage.covs;
import defpackage.coxg;
import defpackage.cpvq;
import defpackage.cpxu;
import defpackage.cpxv;
import defpackage.cqdt;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.emxe;
import defpackage.emyl;
import defpackage.enhd;
import defpackage.enhk;
import defpackage.enix;
import defpackage.eniz;
import defpackage.enoe;
import defpackage.enoz;
import defpackage.enqu;
import defpackage.eogt;
import defpackage.eolt;
import defpackage.eolu;
import defpackage.eolv;
import defpackage.eqqh;
import defpackage.erap;
import defpackage.erar;
import defpackage.eras;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SyncTelephonyThreadsAction extends SyncTelephonyThreadsActionFactory$SchedulableSyncTelephonyThreadsAction implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR;
    public static final cskc a = cskc.g("BugleDataModel", "SyncTelephonyThreadsAction");
    static final cfva b = cfvl.q(182829887);
    static final emyl c = cfvl.x(179796087, "query_rcs_group_telephony_data_on_demand");
    private static final eniz e;
    public final ffbr d;
    private final ffbr f;
    private final ffbr g;
    private final covs h;
    private final ffbr i;
    private final ffbr j;
    private final clbd k;
    private final ffbr l;
    private final ffbr m;

    /* compiled from: PG */
    public interface SyncTelephonyThreadsActionInjector {
        bazb ip();
    }

    static {
        Comparator comparator = eniz.a;
        enix enixVar = new enix(enoe.a);
        enixVar.k(1, erar.BUCKET_ZERO);
        enixVar.k(2, erar.BUCKET_1_TO_2);
        enixVar.k(4, erar.BUCKET_2_TO_4);
        enixVar.k(8, erar.BUCKET_4_TO_8);
        enixVar.k(16, erar.BUCKET_8_TO_16);
        enixVar.k(32, erar.BUCKET_16_TO_32);
        enixVar.k(64, erar.BUCKET_32_TO_64);
        enixVar.k(128, erar.BUCKET_64_TO_128);
        enixVar.k(256, erar.BUCKET_128_TO_256);
        enixVar.k(512, erar.BUCKET_256_TO_512);
        enixVar.k(1024, erar.BUCKET_512_TO_1024);
        enixVar.k(Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY), erar.BUCKET_1024_OR_MORE);
        e = enixVar.c();
        CREATOR = new baza();
    }

    public SyncTelephonyThreadsAction(ffbr<coxg> ffbrVar, ffbr<bdfw> ffbrVar2, ffbr<cgpv> ffbrVar3, covs covsVar, ffbr<cpvq> ffbrVar4, ffbr<bbfw> ffbrVar5, clbd clbdVar, ffbr<akxl> ffbrVar6, ffbr<cqdt> ffbrVar7) {
        super(eogt.SYNC_TELEPHONY_THREADS_ACTION);
        this.d = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = covsVar;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
        this.k = clbdVar;
        this.l = ffbrVar6;
        this.m = ffbrVar7;
    }

    private static erar l(int i) {
        enqu listIterator = e.c.listIterator();
        while (listIterator.hasNext()) {
            Integer num = (Integer) listIterator.next();
            if (i < num.intValue()) {
                return (erar) e.get(num);
            }
        }
        return erar.UNKNOWN;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("SyncTelephonyThreadsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SyncTelephonyThreads.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        enhk c2;
        Bundle bundle;
        boolean equals;
        Bundle bundle2 = null;
        if (((cpvq) this.i.b()).d()) {
            a.p("Not starting SyncTelephonyThreadsAction because reverse telephony sync is running.");
            return null;
        }
        if (((Boolean) ayhv.a.e()).booleanValue()) {
            a.p("Not starting SyncTelephonyThreadsAction because BCM is used.");
            return null;
        }
        int i = 0;
        boolean z = this.t.z("force_full_sync", false);
        a.m("check and delete obsolete threads");
        erap erapVar = (erap) eras.a.createBuilder();
        erapVar.copyOnWrite();
        eras erasVar = (eras) erapVar.instance;
        erasVar.b |= 1;
        erasVar.c = false;
        try {
            cmh cmhVar = new cmh();
            bsob e2 = bsom.e();
            e2.z("getObsoleteThreads");
            e2.i(new Function() { // from class: bayy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    cskc cskcVar = SyncTelephonyThreadsAction.a;
                    bsolVar.aq(new dtrt("conversations.sms_thread_id", 7, Long.valueOf(cpxv.a(new cpxu(0L)))));
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e2.f(new Function() { // from class: bayz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bskp bskpVar = (bskp) obj;
                    cskc cskcVar = SyncTelephonyThreadsAction.a;
                    return new bskq[]{bskpVar.a, bskpVar.b, bskpVar.M, bskpVar.O, bskpVar.ah, bskpVar.aa};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bskr bskrVar = (bskr) e2.b().o();
            try {
                if (((Boolean) ((cfup) c.get()).e()).booleanValue()) {
                    c2 = enoz.a;
                } else {
                    clbd clbdVar = this.k;
                    enhd enhdVar = new enhd();
                    for (Map.Entry entry : clbdVar.b.M().entrySet()) {
                        aoku aokuVar = (aoku) entry.getValue();
                        cfva cfvaVar = aoqm.a;
                        clax a2 = clbdVar.c.a(emxe.b(aokuVar.k(((Boolean) new aoqj().get()).booleanValue())));
                        if (a2 != null) {
                            enhdVar.k((Long) entry.getKey(), a2);
                        }
                    }
                    c2 = enhdVar.c();
                }
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (bskrVar.moveToNext()) {
                    if (bskrVar.v()) {
                        csjb c3 = a.c();
                        c3.I("Skipping conversation because it's awaiting reverse sync");
                        c3.c(bskrVar.h());
                        c3.r();
                        int i5 = ((eras) erapVar.instance).g + 1;
                        erapVar.copyOnWrite();
                        eras erasVar2 = (eras) erapVar.instance;
                        erasVar2.b |= 16;
                        erasVar2.g = i5;
                    } else {
                        int c4 = bskrVar.c();
                        if (c4 == 0) {
                            i2++;
                        } else if (c4 == 1) {
                            i3++;
                        } else if (c4 == 2) {
                            i4++;
                        }
                        if (bskrVar.c() == 2) {
                            if (bskrVar.k().d()) {
                                csjb e3 = a.e();
                                e3.I("telephonyThreadMatchesForRcsGroups: no RcsGroupTelephonyData found because thread was empty");
                                e3.c(bskrVar.h());
                                e3.n(bskrVar.k());
                                e3.r();
                            } else {
                                Optional.empty();
                                Optional ofNullable = ((Boolean) ((cfup) c.get()).e()).booleanValue() ? ((clav) this.k.a(bskrVar.k())).a : Optional.ofNullable((clax) c2.get(Long.valueOf(cpxv.a(bskrVar.k()))));
                                if (ofNullable.isEmpty()) {
                                    csjb e4 = a.e();
                                    e4.I("telephonyThreadMatchesForRcsGroups: no RcsGroupTelephonyData found");
                                    e4.c(bskrVar.h());
                                    e4.n(bskrVar.k());
                                    e4.r();
                                } else if (emxe.c(bskrVar.u())) {
                                    csjb e5 = a.e();
                                    bundle = bundle2;
                                    e5.I("telephonyThreadMatchesForRcsGroups: local conversation data does not have a valid RCS group ID.");
                                    e5.c(bskrVar.h());
                                    e5.n(bskrVar.k());
                                    e5.A("remote rcs group id", ((clax) ofNullable.get()).b());
                                    e5.r();
                                    equals = true;
                                } else {
                                    bundle = bundle2;
                                    csjb a3 = a.a();
                                    a3.I("telephonyThreadMatchesForRcsGroups");
                                    a3.c(bskrVar.h());
                                    a3.n(bskrVar.k());
                                    a3.A("local rcs group id", bskrVar.u());
                                    a3.A("remote rcs group id", ((clax) ofNullable.get()).b());
                                    a3.r();
                                    equals = ((clax) ofNullable.get()).b().equals(bskrVar.u());
                                }
                            }
                            bundle = bundle2;
                            equals = false;
                        } else {
                            bundle = bundle2;
                            long g = this.h.g(((bdfw) this.f.b()).a(bskrVar.h(), false));
                            csjb a4 = a.a();
                            a4.I("telephonyThreadMatches");
                            a4.c(bskrVar.h());
                            a4.A("local thread id", bskrVar.k());
                            a4.z("remote thread id", g);
                            a4.r();
                            equals = cpxu.b(g).equals(bskrVar.k());
                        }
                        if (!equals) {
                            cskc cskcVar = a;
                            csjb e6 = cskcVar.e();
                            e6.I("Found a threadId mismatch");
                            e6.y("convType", bskrVar.c());
                            e6.c(bskrVar.h());
                            e6.n(bskrVar.k());
                            e6.r();
                            int c5 = bskrVar.c();
                            if (c5 == 0) {
                                int i6 = ((eras) erapVar.instance).d + 1;
                                erapVar.copyOnWrite();
                                eras erasVar3 = (eras) erapVar.instance;
                                erasVar3.b |= 2;
                                erasVar3.d = i6;
                            } else if (c5 == 1) {
                                int i7 = ((eras) erapVar.instance).e + 1;
                                erapVar.copyOnWrite();
                                eras erasVar4 = (eras) erapVar.instance;
                                erasVar4.b |= 4;
                                erasVar4.e = i7;
                            } else if (c5 != 2) {
                                csjb e7 = cskcVar.e();
                                e7.I("Found unexpected conversation type.");
                                e7.y("conversationType", bskrVar.c());
                                e7.r();
                            } else {
                                int i8 = ((eras) erapVar.instance).f + 1;
                                erapVar.copyOnWrite();
                                eras erasVar5 = (eras) erapVar.instance;
                                erasVar5.b |= 8;
                                erasVar5.f = i8;
                            }
                            cmhVar.put(Long.valueOf(cpxv.a(bskrVar.k())), bskrVar.h());
                        }
                        bundle2 = bundle;
                    }
                }
                Bundle bundle3 = bundle2;
                if (((Boolean) b.e()).booleanValue()) {
                    if (((eras) erapVar.instance).d > 0) {
                        erar l = l(i2);
                        erapVar.copyOnWrite();
                        eras erasVar6 = (eras) erapVar.instance;
                        erasVar6.i = l.n;
                        erasVar6.b |= 64;
                    }
                    if (((eras) erapVar.instance).e > 0) {
                        erar l2 = l(i3);
                        erapVar.copyOnWrite();
                        eras erasVar7 = (eras) erapVar.instance;
                        erasVar7.j = l2.n;
                        erasVar7.b |= 128;
                    }
                    if (((eras) erapVar.instance).f > 0) {
                        erar l3 = l(i4);
                        erapVar.copyOnWrite();
                        eras erasVar8 = (eras) erapVar.instance;
                        erasVar8.k = l3.n;
                        erasVar8.b |= 256;
                    }
                }
                bskrVar.close();
                for (Long l4 : cmhVar.keySet()) {
                    ConversationIdType conversationIdType = (ConversationIdType) cmhVar.get(l4);
                    long longValue = l4.longValue();
                    if (((cgpv) this.g.b()).d(conversationIdType, Long.MAX_VALUE).c()) {
                        csjb c6 = a.c();
                        c6.I("Deleted local");
                        c6.c(conversationIdType);
                        c6.z("threadId", longValue);
                        c6.r();
                    } else {
                        csjb b2 = a.b();
                        b2.I("failed to delete local");
                        b2.c(conversationIdType);
                        b2.z("threadId", longValue);
                        b2.r();
                        i++;
                    }
                }
                erapVar.copyOnWrite();
                eras erasVar9 = (eras) erapVar.instance;
                erasVar9.b |= 32;
                erasVar9.h = i;
                erapVar.copyOnWrite();
                eras erasVar10 = (eras) erapVar.instance;
                erasVar10.b |= 1;
                erasVar10.c = true;
                boolean isEmpty = cmhVar.isEmpty();
                if (!isEmpty) {
                    ((bbfw) this.j.b()).g();
                }
                Optional empty = Optional.empty();
                if (!isEmpty) {
                    empty = Optional.of(eqqh.SYNC_TELEPHONY_THREADS_FOUND_OBSOLETE_THREADS);
                } else if (z) {
                    empty = Optional.of(eqqh.SYNC_TELEPHONY_THREADS_FORCE_FULL_SYNC);
                } else if (((cqdt) this.m.b()).a().isPresent()) {
                    empty = Optional.of(eqqh.SYNC_TELEPHONY_THREADS_RESUME_SYNC);
                }
                empty.ifPresent(new Consumer() { // from class: bayx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        eqqh eqqhVar = (eqqh) obj;
                        csjb c7 = SyncTelephonyThreadsAction.a.c();
                        c7.I("force full sync");
                        c7.A("sync reason", eqqhVar);
                        c7.r();
                        ((coxg) SyncTelephonyThreadsAction.this.d.b()).k(eqqhVar);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return bundle3;
            } finally {
            }
        } finally {
            h((eras) erapVar.build());
        }
    }

    public final void h(eras erasVar) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.SYNC_TELEPHONY_THREADS;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        erasVar.getClass();
        eolvVar2.aQ = erasVar;
        eolvVar2.e |= 16384;
        ((akxl) this.l.b()).j(eoluVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public SyncTelephonyThreadsAction(ffbr<coxg> ffbrVar, ffbr<bdfw> ffbrVar2, ffbr<cgpv> ffbrVar3, covs covsVar, ffbr<cpvq> ffbrVar4, ffbr<bbfw> ffbrVar5, clbd clbdVar, ffbr<akxl> ffbrVar6, ffbr<cqdt> ffbrVar7, Parcel parcel) {
        super(parcel, eogt.SYNC_TELEPHONY_THREADS_ACTION);
        this.d = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = covsVar;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
        this.k = clbdVar;
        this.l = ffbrVar6;
        this.m = ffbrVar7;
    }

    public SyncTelephonyThreadsAction(ffbr<coxg> ffbrVar, ffbr<bdfw> ffbrVar2, ffbr<cgpv> ffbrVar3, covs covsVar, ffbr<cpvq> ffbrVar4, ffbr<bbfw> ffbrVar5, clbd clbdVar, ffbr<akxl> ffbrVar6, ffbr<cqdt> ffbrVar7, boolean z) {
        super(eogt.SYNC_TELEPHONY_THREADS_ACTION);
        this.d = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = covsVar;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
        this.k = clbdVar;
        this.l = ffbrVar6;
        this.m = ffbrVar7;
        this.t.p("force_full_sync", z);
    }
}
