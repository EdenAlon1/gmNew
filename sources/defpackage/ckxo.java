package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxo extends ceut {
    public static final cskc a = cskc.g("BugleDataModel", "ProcessRcsGroupNotifyHandler");
    public final ckju b;
    public final errl c;
    public final errl d;
    public final ffbr e;
    public final cqoh f;
    public final cbvt g;
    public final cbgf h;
    public final akzt i;
    public final ffbr j;
    public final ckra k;
    private final dtuu l;
    private final ffbr m;
    private final cbfs n;
    private final bdtd o;

    public ckxo(errl errlVar, errl errlVar2, ckju ckjuVar, dtuu dtuuVar, ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar, cbfs cbfsVar, cbvt cbvtVar, bdtd bdtdVar, ckra ckraVar, cbgf cbgfVar, akzt akztVar, ffbr ffbrVar3) {
        this.c = errlVar;
        this.d = errlVar2;
        this.b = ckjuVar;
        this.l = dtuuVar;
        this.m = ffbrVar;
        this.e = ffbrVar2;
        this.f = cqohVar;
        this.n = cbfsVar;
        this.g = cbvtVar;
        this.o = bdtdVar;
        this.k = ckraVar;
        this.h = cbgfVar;
        this.i = akztVar;
        this.j = ffbrVar3;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ProcessRcsGroupNotifyHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ckxq.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final ckxq ckxqVar = (ckxq) eyhsVar;
        return elfo.g(new Callable() { // from class: ckxm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ckxq ckxqVar2 = ckxqVar;
                String str = ckxqVar2.c;
                String str2 = ckxqVar2.d;
                ckjy w = ckjz.w();
                w.j(false);
                w.q(true);
                w.w(epby.GROUP_NOTIFICATION_VANILLA_RCS);
                w.p(false);
                w.u(str);
                w.s(str2);
                w.n(ckxqVar2.e);
                crme c = ckxo.this.b.c(w.D());
                if (c != null) {
                    return Optional.of(c);
                }
                ckxo.a.n("Conversation not found for incoming RCS group NOTIFY");
                return Optional.empty();
            }
        }, this.d).i(new eroh() { // from class: ckxe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return elfo.e(ceyt.k());
                }
                final ckxq ckxqVar2 = ckxqVar;
                final ckxo ckxoVar = ckxo.this;
                final crme crmeVar = (crme) optional.get();
                ListenableFuture[] listenableFutureArr = new ListenableFuture[3];
                final ConversationIdType a2 = crmeVar.a();
                final String str = ckxqVar2.e;
                final boolean z = 1 == (ckxqVar2.b & 1);
                final ckra ckraVar = ckxoVar.k;
                final elfl a3 = ckraVar.a(a2);
                final elfl g = elfo.g(new Callable() { // from class: ckqx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bseh r = ((bczy) ckra.this.c.b()).r(a2);
                        r.getClass();
                        return Boolean.valueOf(ckrv.a(str, r.X(), r.H()));
                    }
                }, ckraVar.e);
                listenableFutureArr[0] = elfo.k(a3, g).b(new erog() { // from class: ckqy
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final String str2 = (String) erqt.q(a3);
                        final ckrb ckrbVar = new ckrb(((Boolean) erqt.q(g)).booleanValue(), z);
                        Callable callable = new Callable() { // from class: ckri
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                epbr epbrVar = (epbr) epbs.a.createBuilder();
                                epbrVar.copyOnWrite();
                                epbs epbsVar = (epbs) epbrVar.instance;
                                epbsVar.b |= 2;
                                ckrb ckrbVar2 = (ckrb) ckrc.this;
                                epbsVar.d = ckrbVar2.a;
                                epbrVar.copyOnWrite();
                                epbs epbsVar2 = (epbs) epbrVar.instance;
                                epbsVar2.b |= 1;
                                epbsVar2.c = ckrbVar2.b;
                                return (epbs) epbrVar.build();
                            }
                        };
                        final ckrs ckrsVar = (ckrs) ckra.this.b;
                        return elfo.g(callable, ckrsVar.e).i(new eroh() { // from class: ckrk
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                ckrs ckrsVar2 = ckrs.this;
                                final epbs epbsVar = (epbs) obj2;
                                return ckrsVar2.d(str2, 8).h(new emwl() { // from class: ckro
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        eomj eomjVar = (eomj) obj3;
                                        eomjVar.copyOnWrite();
                                        eomn eomnVar = (eomn) eomjVar.instance;
                                        eomn eomnVar2 = eomn.a;
                                        epbs epbsVar2 = epbs.this;
                                        epbsVar2.getClass();
                                        eomnVar.j = epbsVar2;
                                        eomnVar.b |= 128;
                                        return ckrs.c((eomn) eomjVar.build());
                                    }
                                }, ckrsVar2.e);
                            }
                        }, ckrsVar.e).i(new ckrl(ckrsVar), ckrsVar.e);
                    }
                }, ckraVar.f).e(Exception.class, new emwl() { // from class: ckqz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        ckra.a.s("Failed to log group rename notify event.", (Exception) obj2);
                        return null;
                    }
                }, ckraVar.f);
                listenableFutureArr[1] = elfo.g(new Callable() { // from class: ckxi
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bsob e = bsom.e();
                        e.z("getConversationData");
                        e.c(new bskq[0]);
                        final crme crmeVar2 = crme.this;
                        e.i(new Function() { // from class: ckxl
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bsol bsolVar = (bsol) obj2;
                                bsolVar.q(crme.this.a());
                                return bsolVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        return (bseh) ((bskr) e.b().o()).cS();
                    }
                }, ckxoVar.d).h(new emwl() { // from class: ckxf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        bseh bsehVar = (bseh) obj2;
                        String[] strArr = bsom.a;
                        bsoe bsoeVar = new bsoe();
                        bsoeVar.ap("updateGroupMetadata");
                        final crme crmeVar2 = crmeVar;
                        bsoeVar.ad(new Function() { // from class: ckxh
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                bsol bsolVar = (bsol) obj3;
                                bsolVar.q(crme.this.a());
                                return bsolVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bsoeVar.A(0);
                        bsoeVar.x(ayhd.NONE);
                        bsoeVar.b().e();
                        ckxo ckxoVar2 = ckxo.this;
                        ckxoVar2.h.d(crmeVar2.a());
                        if (bsehVar == null) {
                            return null;
                        }
                        if (bsehVar.m() == 4) {
                            ckxoVar2.i.c("Bugle.Rcs.Groups.Recovery.ConversationRecoveredFromTelephony.Enabled.Counts");
                            return null;
                        }
                        if (bsehVar.m() != 7) {
                            return null;
                        }
                        ckxoVar2.i.c("Bugle.Rcs.Groups.Recovery.ConversationDowngradedFromChatApiToVanillaRcs.Enabled.Counts");
                        return null;
                    }
                }, ckxoVar.d);
                listenableFutureArr[2] = elfo.f(new Runnable() { // from class: ckxk
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ckxo ckxoVar2 = ckxo.this;
                        ffbr ffbrVar = ckxoVar2.e;
                        crme crmeVar2 = crmeVar;
                        ConversationIdType a4 = crmeVar2.a();
                        eygr<ckxc> eygrVar = ckxqVar2.f;
                        List L = ((bczy) ffbrVar.b()).L(a4);
                        HashMap hashMap = new HashMap();
                        for (ckxc ckxcVar : eygrVar) {
                            hashMap.put(cuxt.d(ckxcVar.b), ckxcVar);
                        }
                        ArrayList arrayList = new ArrayList();
                        enqv it = ((engw) L).iterator();
                        while (it.hasNext()) {
                            String U = ((ParticipantsTable.BindData) it.next()).U();
                            if (emxe.c(U) || hashMap.containsKey(U)) {
                                ckxc ckxcVar2 = (ckxc) hashMap.remove(U);
                                if (ckxcVar2 != null && ckxcVar2.d) {
                                    arrayList.add(ckxcVar2);
                                }
                            } else {
                                ckxb ckxbVar = (ckxb) ckxc.a.createBuilder();
                                ckxbVar.copyOnWrite();
                                ckxc ckxcVar3 = (ckxc) ckxbVar.instance;
                                U.getClass();
                                ckxcVar3.b = U;
                                arrayList.add((ckxc) ckxbVar.build());
                            }
                        }
                        engr engrVar = new engr();
                        for (ckxc ckxcVar4 : hashMap.values()) {
                            if (!ckxcVar4.d) {
                                engrVar.h(ckxcVar4);
                            }
                        }
                        ckxa ckxaVar = new ckxa(engw.n(arrayList), engrVar.g());
                        long epochMilli = ckxoVar2.f.f().toEpochMilli();
                        HashSet hashSet = new HashSet();
                        engw engwVar = ckxaVar.b;
                        for (int i = 0; i < ((enou) engwVar).c; i++) {
                            ckxoVar2.k(crmeVar2, 50020, epochMilli, (ckxc) engwVar.get(i), hashSet);
                        }
                        engw engwVar2 = ckxaVar.a;
                        int size = engwVar2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ckxoVar2.k(crmeVar2, 50021, epochMilli, (ckxc) engwVar2.get(i2), hashSet);
                        }
                    }
                }, ckxoVar.d);
                return elfo.k(listenableFutureArr).b(new erog() { // from class: ckxg
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final crme crmeVar2 = crmeVar;
                        final ckxq ckxqVar3 = ckxqVar2;
                        return elfo.g(new Callable() { // from class: ckxj
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ckxx ckxxVar;
                                ConversationIdType a4 = crme.this.a();
                                ckxq ckxqVar4 = ckxqVar3;
                                String str2 = ckxqVar4.e;
                                if ((ckxqVar4.b & 1) != 0) {
                                    ckxxVar = ckxqVar4.g;
                                    if (ckxxVar == null) {
                                        ckxxVar = ckxx.a;
                                    }
                                } else {
                                    ckxxVar = null;
                                }
                                cksu cksuVar = (cksu) cksv.a.createBuilder();
                                cksuVar.copyOnWrite();
                                cksv cksvVar = (cksv) cksuVar.instance;
                                str2.getClass();
                                cksvVar.d = str2;
                                String a5 = a4.a();
                                cksuVar.copyOnWrite();
                                cksv cksvVar2 = (cksv) cksuVar.instance;
                                a5.getClass();
                                cksvVar2.h = a5;
                                if (ckxxVar != null) {
                                    if ((ckxxVar.b & 1) != 0) {
                                        eyja eyjaVar = ckxxVar.c;
                                        if (eyjaVar == null) {
                                            eyjaVar = eyja.a;
                                        }
                                        cksuVar.copyOnWrite();
                                        cksv cksvVar3 = (cksv) cksuVar.instance;
                                        eyjaVar.getClass();
                                        cksvVar3.f = eyjaVar;
                                        cksvVar3.b |= 1;
                                    }
                                    String str3 = ckxxVar.d;
                                    cksuVar.copyOnWrite();
                                    cksv cksvVar4 = (cksv) cksuVar.instance;
                                    str3.getClass();
                                    cksvVar4.g = str3;
                                }
                                ceyr g2 = ceyr.g("update_rcs_group_name", cksuVar.build());
                                ceys h = ceyt.h();
                                h.b(true);
                                h.c(false);
                                ((cetn) h).a = engw.r(g2);
                                return h.a();
                            }
                        }, ckxo.this.d);
                    }
                }, ckxoVar.c);
            }
        }, this.c);
    }

    public final void k(final crme crmeVar, final int i, final long j, final ckxc ckxcVar, Set set) {
        String str = ckxcVar.b;
        String str2 = ckxcVar.c;
        if (true == TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        bvpo f = bdqu.f(str);
        final int i2 = i != 50020 ? BasePaymentResult.ERROR_REQUEST_TIMEOUT : BasePaymentResult.ERROR_REQUEST_FAILED;
        final aztg e = this.o.e();
        bvpo f2 = bdqu.f(str2);
        f2.v(((bdrr) this.m.b()).j(f2));
        if (!set.contains(f.g)) {
            this.n.f(f, 4);
            set.add(f.g);
        }
        if (!set.contains(f2.g)) {
            this.n.f(f2, 4);
            set.add(f2.g);
        }
        final ParticipantsTable.BindData a2 = f.a();
        final ParticipantsTable.BindData a3 = f2.a();
        this.l.d("insertTombstoneForUser#insertTombstoneForUser", new Runnable() { // from class: ckxd
            @Override // java.lang.Runnable
            public final void run() {
                boolean an;
                int i3 = i;
                ParticipantsTable.BindData bindData = a2;
                ParticipantsTable.BindData bindData2 = a3;
                ckxo ckxoVar = ckxo.this;
                crme crmeVar2 = crmeVar;
                if (i3 == 50021) {
                    an = ((bczy) ckxoVar.e.b()).aj(bindData, crmeVar2.a(), true);
                    if (an) {
                        csjb a4 = ckxo.a.a();
                        a4.j(((bdrt) ckxoVar.j.b()).a(bindData, true));
                        a4.I("left");
                        a4.c(crmeVar2.a());
                        a4.r();
                    } else {
                        csjb b = ckxo.a.b();
                        b.I("Failed to remove");
                        b.j(((bdrt) ckxoVar.j.b()).a(bindData, true));
                        b.I("from");
                        b.c(crmeVar2.a());
                        b.r();
                    }
                } else {
                    an = ((bczy) ckxoVar.e.b()).an(bindData, crmeVar2.a());
                    if (an) {
                        csjb a5 = ckxo.a.a();
                        a5.j(((bdrt) ckxoVar.j.b()).a(bindData2, true));
                        a5.I("added");
                        a5.j(((bdrt) ckxoVar.j.b()).a(bindData, true));
                        a5.I("to");
                        a5.c(crmeVar2.a());
                        a5.r();
                    } else {
                        csjb b2 = ckxo.a.b();
                        b2.I("Failed to add");
                        b2.j(((bdrt) ckxoVar.j.b()).a(bindData, true));
                        b2.I("referred by");
                        b2.j(((bdrt) ckxoVar.j.b()).a(bindData2, true));
                        b2.I("to");
                        b2.c(crmeVar2.a());
                        b2.r();
                    }
                }
                ckxc ckxcVar2 = ckxcVar;
                if (an && !ckxcVar2.d) {
                    long j2 = j;
                    int i4 = i2;
                    aztg aztgVar = e;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bindData);
                    ckxoVar.g.j(Optional.empty(), crmeVar2.a(), aztgVar, bindData2, arrayList, i4, j2, -1L);
                    return;
                }
                if (ckxcVar2.d) {
                    csjb a6 = ckxo.a.a();
                    a6.I("Not inserting tombstone because of self participant removal. This will happen in the scenario where the conversation is recovered from Telephony and enabled again.");
                    a6.r();
                } else {
                    csjb b3 = ckxo.a.b();
                    b3.I("Not inserting tombstone because of unsuccessful add/remove of participant.");
                    b3.r();
                }
            }
        });
    }
}
