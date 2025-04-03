package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akzt;
import defpackage.aswh;
import defpackage.aswi;
import defpackage.bako;
import defpackage.bbfl;
import defpackage.bzax;
import defpackage.bzgd;
import defpackage.bzlh;
import defpackage.chqc;
import defpackage.chrr;
import defpackage.chww;
import defpackage.cskc;
import defpackage.ecda;
import defpackage.ecri;
import defpackage.ecrj;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.enrr;
import defpackage.eogt;
import defpackage.erog;
import defpackage.erpp;
import defpackage.errl;
import defpackage.ersb;
import defpackage.fbzx;
import defpackage.fcek;
import defpackage.ffbr;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessConversationUpdateAsyncAction extends Action<fbzx> {
    private final ffbr A;
    private final ffbr B;
    private final Executor C;
    public final bzgd c;
    public final akzt d;
    public final errl e;
    public final errl f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final chqc j;
    public final chrr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final chww p;
    private final errl q;
    private final ffbr y;
    private final ffbr z;
    public static final cskc a = cskc.g("BugleNetwork", "ProcessConversationUpdateAsyncAction");
    public static final ecda b = new ecda("ProcessConversationUpdateAsyncActionTimer");
    public static final Parcelable.Creator<Action<fbzx>> CREATOR = new bako();

    /* compiled from: PG */
    public interface a {
        bbfl be();
    }

    public ProcessConversationUpdateAsyncAction(bzgd bzgdVar, akzt akztVar, errl errlVar, errl errlVar2, errl errlVar3, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, chww chwwVar, chqc chqcVar, ffbr ffbrVar5, chrr chrrVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, Parcel parcel, ffbr ffbrVar12) {
        super(parcel, eogt.PROCESS_CONVERSATION_UPDATE_ACTION);
        this.c = bzgdVar;
        this.d = akztVar;
        this.e = errlVar;
        this.f = errlVar2;
        this.q = errlVar3;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.p = chwwVar;
        this.j = chqcVar;
        this.l = ffbrVar5;
        this.k = chrrVar;
        this.m = ffbrVar6;
        this.z = ffbrVar9;
        this.A = ffbrVar10;
        this.B = ffbrVar11;
        this.y = ffbrVar7;
        this.n = ffbrVar8;
        if (((aswi) ffbrVar7.b()).a()) {
            this.C = (Executor) ffbrVar.b();
        } else {
            this.C = new ersb(errlVar3);
        }
        this.o = ffbrVar12;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessConversationUpdateAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessConversationUpdate.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        if (!((aswh) this.z.b()).a()) {
        } else if (((bzlh) this.B.b()).b()) {
            ((enrr) a.h().h("com/google/android/apps/messaging/shared/datamodel/action/ProcessConversationUpdateAsyncAction", "executeActionInternal", 388, "ProcessConversationUpdateAsyncAction.java")).q("Ditto Push Updates Rate limit exceeded, Ignoring Conversation Update");
        }
        Boolean bool = (Boolean) bzax.a.e();
        if (bool.booleanValue()) {
            this.d.e("Bugle.Ditto.Action.Success.Metrics.Counts", 15);
        }
        final ecri d = ((ecrj) this.n.b()).d();
        elfl h = elfo.h(new erog() { // from class: bakc
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final ProcessConversationUpdateAsyncAction processConversationUpdateAsyncAction = ProcessConversationUpdateAsyncAction.this;
                final engw l = processConversationUpdateAsyncAction.c.l();
                if (l.isEmpty()) {
                    return elfo.e(null);
                }
                return processConversationUpdateAsyncAction.j.b(bdgq.b(processConversationUpdateAsyncAction.t.l("conversation_id_key"))).i(new eroh() { // from class: bakn
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final ProcessConversationUpdateAsyncAction processConversationUpdateAsyncAction2 = ProcessConversationUpdateAsyncAction.this;
                        final engw engwVar = (engw) obj;
                        ConversationIdType b2 = bdgq.b(processConversationUpdateAsyncAction2.t.l("conversation_id_key"));
                        final erux eruxVar = (erux) eruy.a.createBuilder();
                        if (!b2.b()) {
                            bcyk a2 = ((azwh) processConversationUpdateAsyncAction2.l.b()).a(b2);
                            if (a2 != null) {
                                return ((cgzv) processConversationUpdateAsyncAction2.h.b()).e(a2, engwVar).h(new emwl() { // from class: bakm
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        cskc cskcVar = ProcessConversationUpdateAsyncAction.a;
                                        erux eruxVar2 = erux.this;
                                        eruxVar2.b((erur) obj2);
                                        return (eruy) eruxVar2.build();
                                    }
                                }, processConversationUpdateAsyncAction2.e);
                            }
                            eruxVar.b(((cgzv) processConversationUpdateAsyncAction2.h.b()).k(b2));
                            return elfo.e((eruy) eruxVar.build());
                        }
                        bbcg bbcgVar = processConversationUpdateAsyncAction2.t;
                        ffbr ffbrVar = processConversationUpdateAsyncAction2.g;
                        List b3 = ((bdeo) ffbrVar.b()).b(bbcgVar.e("conversation_timestamp_key", Long.MAX_VALUE));
                        csjb c = ProcessConversationUpdateAsyncAction.a.c();
                        c.L("conversationsToUpdate", b3);
                        c.I("conversations need retrying.");
                        c.r();
                        Stream map = Collection.EL.stream(b3).map(new Function() { // from class: bakk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((cgzv) ProcessConversationUpdateAsyncAction.this.h.b()).e((bcyk) obj2, engwVar);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = engw.d;
                        return elfo.a((engw) map.collect(endq.a)).h(new emwl() { // from class: bakl
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                cskc cskcVar = ProcessConversationUpdateAsyncAction.a;
                                erux eruxVar2 = erux.this;
                                eruxVar2.a((List) obj2);
                                return (eruy) eruxVar2.build();
                            }
                        }, processConversationUpdateAsyncAction2.e);
                    }
                }, processConversationUpdateAsyncAction.f).i(new eroh() { // from class: bakd
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        eruy eruyVar = (eruy) obj;
                        return ((Boolean) ((cfup) bzaq.o.get()).e()).booleanValue() ? ProcessConversationUpdateAsyncAction.this.k.a(eruyVar) : elfo.e(eruyVar);
                    }
                }, processConversationUpdateAsyncAction.e).i(new eroh() { // from class: bake
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        engw n;
                        eruy eruyVar = (eruy) obj;
                        ArrayList arrayList = new ArrayList();
                        if (eruyVar.b.size() <= 1) {
                            arrayList.add(eruyVar);
                            n = engw.n(arrayList);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            for (erur erurVar : eruyVar.b) {
                                if (erurVar.h) {
                                    arrayList2.add(erurVar);
                                } else {
                                    arrayList3.add(erurVar);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                erux eruxVar = (erux) eruy.a.createBuilder();
                                eruxVar.a(arrayList2);
                                arrayList.add((eruy) eruxVar.build());
                            }
                            if (!arrayList3.isEmpty()) {
                                erux eruxVar2 = (erux) eruy.a.createBuilder();
                                eruxVar2.a(arrayList3);
                                arrayList.add((eruy) eruxVar2.build());
                            }
                            n = engw.n(arrayList);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        int size = n.size();
                        for (int i = 0; i < size; i++) {
                            List list = l;
                            final ProcessConversationUpdateAsyncAction processConversationUpdateAsyncAction2 = ProcessConversationUpdateAsyncAction.this;
                            final eruy eruyVar2 = (eruy) n.get(i);
                            arrayList4.add(bzgd.E(list, new Function() { // from class: baki
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    chwu c;
                                    bzej bzejVar = (bzej) obj2;
                                    fcek d2 = bzejVar.d();
                                    String e = bzejVar.e();
                                    ProcessConversationUpdateAsyncAction processConversationUpdateAsyncAction3 = ProcessConversationUpdateAsyncAction.this;
                                    boolean a2 = ((cgcu) processConversationUpdateAsyncAction3.m.b()).a();
                                    eruy eruyVar3 = eruyVar2;
                                    if (a2) {
                                        c = processConversationUpdateAsyncAction3.p.a(bzejVar.c(), esaa.GET_UPDATES);
                                        c.c = e;
                                        erxg erxgVar = (erxg) erxi.a.createBuilder();
                                        erxgVar.copyOnWrite();
                                        erxi erxiVar = (erxi) erxgVar.instance;
                                        eruyVar3.getClass();
                                        erxiVar.c = eruyVar3;
                                        erxiVar.b = 2;
                                        c.b(erxgVar.build());
                                    } else {
                                        c = processConversationUpdateAsyncAction3.p.c(d2, Optional.empty(), esaa.GET_UPDATES);
                                        c.c = e;
                                        erxg erxgVar2 = (erxg) erxi.a.createBuilder();
                                        erxgVar2.copyOnWrite();
                                        erxi erxiVar2 = (erxi) erxgVar2.instance;
                                        eruyVar3.getClass();
                                        erxiVar2.c = eruyVar3;
                                        erxiVar2.b = 2;
                                        c.b(erxgVar2.build());
                                    }
                                    if (processConversationUpdateAsyncAction3.t.z("send_push_key", false)) {
                                        if (((atmu) processConversationUpdateAsyncAction3.o.b()).a()) {
                                            c.i = fbzr.STATUS;
                                        } else {
                                            c.i = fbzr.USER;
                                            Iterator<E> it = eruyVar3.b.iterator();
                                            if (it.hasNext() && ((erur) it.next()).h) {
                                                c.i = fbzr.STATUS;
                                            }
                                        }
                                    }
                                    chwv a3 = c.a();
                                    if (((Optional) processConversationUpdateAsyncAction3.i.b()).isEmpty()) {
                                        return elfo.d(new UnsupportedOperationException("DittoRetryExecutor is not available on this device."));
                                    }
                                    elfl a4 = ((cikg) ((Optional) processConversationUpdateAsyncAction3.i.b()).get()).a(a3);
                                    a3.q(a4);
                                    return a4;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }));
                        }
                        return elfo.a(arrayList4).h(new emwl() { // from class: bakj
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                cskc cskcVar = ProcessConversationUpdateAsyncAction.a;
                                return null;
                            }
                        }, erpp.a);
                    }
                }, processConversationUpdateAsyncAction.f);
            }
        }, ((aswi) this.y.b()).a() ? this.C : this.q).e(Throwable.class, new emwl() { // from class: bakf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ecrj ecrjVar = (ecrj) ProcessConversationUpdateAsyncAction.this.n.b();
                ecri ecriVar = d;
                ecriVar.getClass();
                ecrjVar.f(ecriVar, ProcessConversationUpdateAsyncAction.b, null, ecrh.ERROR);
                ProcessConversationUpdateAsyncAction.a.s("Action failed.", (Throwable) obj);
                return null;
            }
        }, erpp.a).h(new emwl() { // from class: bakg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fbzx fbzxVar = (fbzx) obj;
                ecrj ecrjVar = (ecrj) ProcessConversationUpdateAsyncAction.this.n.b();
                ecri ecriVar = d;
                ecriVar.getClass();
                ecrjVar.f(ecriVar, ProcessConversationUpdateAsyncAction.b, null, ecrh.SUCCESS);
                return fbzxVar;
            }
        }, this.e);
        if (bool.booleanValue()) {
            h.h(new emwl() { // from class: bakh
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    fbzx fbzxVar = (fbzx) obj;
                    ProcessConversationUpdateAsyncAction.this.d.e("Bugle.Ditto.Action.Success.Metrics.Counts", 16);
                    return fbzxVar;
                }
            }, this.e);
        }
        return elfo.e(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ProcessConversationUpdateAsyncAction(bzgd bzgdVar, akzt akztVar, errl errlVar, errl errlVar2, errl errlVar3, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, chww chwwVar, chqc chqcVar, ffbr ffbrVar5, chrr chrrVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, fcek fcekVar, String str, long j) {
        super(eogt.PROCESS_CONVERSATION_UPDATE_ACTION);
        this.c = bzgdVar;
        this.d = akztVar;
        this.e = errlVar;
        this.f = errlVar2;
        this.q = errlVar3;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.p = chwwVar;
        this.j = chqcVar;
        this.k = chrrVar;
        this.m = ffbrVar6;
        this.t.q("desktop_id_key", fcekVar.toByteArray());
        this.t.v("request_id_key", str);
        this.l = ffbrVar5;
        this.t.s("conversation_timestamp_key", j);
        this.z = ffbrVar10;
        this.A = ffbrVar11;
        this.B = ffbrVar12;
        this.y = ffbrVar7;
        this.n = ffbrVar8;
        if (((aswi) ffbrVar7.b()).a()) {
            this.C = (Executor) ffbrVar.b();
        } else {
            this.C = new ersb(errlVar3);
        }
        this.o = ffbrVar9;
    }

    public ProcessConversationUpdateAsyncAction(bzgd bzgdVar, akzt akztVar, errl errlVar, errl errlVar2, errl errlVar3, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, chww chwwVar, chqc chqcVar, ffbr ffbrVar5, chrr chrrVar, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, fcek fcekVar, String str, ConversationIdType conversationIdType, boolean z) {
        super(eogt.PROCESS_CONVERSATION_UPDATE_ACTION);
        this.c = bzgdVar;
        this.d = akztVar;
        this.e = errlVar;
        this.f = errlVar2;
        this.q = errlVar3;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.p = chwwVar;
        this.j = chqcVar;
        this.l = ffbrVar5;
        this.k = chrrVar;
        this.m = ffbrVar6;
        this.t.q("desktop_id_key", fcekVar.toByteArray());
        this.t.v("request_id_key", str);
        this.t.v("conversation_id_key", conversationIdType.a());
        this.t.p("send_push_key", z);
        this.z = ffbrVar10;
        this.A = ffbrVar11;
        this.B = ffbrVar12;
        this.y = ffbrVar7;
        this.n = ffbrVar8;
        if (((aswi) ffbrVar7.b()).a()) {
            this.C = (Executor) ffbrVar.b();
        } else {
            this.C = new ersb(errlVar3);
        }
        this.o = ffbrVar9;
    }
}
