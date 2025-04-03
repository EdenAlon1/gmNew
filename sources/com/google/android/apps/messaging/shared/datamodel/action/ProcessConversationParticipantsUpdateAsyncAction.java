package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessConversationParticipantsUpdateAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akzt;
import defpackage.baka;
import defpackage.bakb;
import defpackage.bdeo;
import defpackage.bdgq;
import defpackage.bzax;
import defpackage.bzej;
import defpackage.bzgd;
import defpackage.chhj;
import defpackage.chqc;
import defpackage.chww;
import defpackage.cskc;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.engw;
import defpackage.enpx;
import defpackage.enqv;
import defpackage.eogt;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.erqj;
import defpackage.errl;
import defpackage.fbzx;
import defpackage.ffbr;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class ProcessConversationParticipantsUpdateAsyncAction extends Action<List<fbzx>> {
    public final ffbr b;
    public final akzt c;
    public final ffbr d;
    public final chww e;
    private final erqj f;
    private final ffbr g;
    private final bzgd h;
    private final errl i;
    private final errl j;
    private final chqc k;
    public static final cskc a = cskc.g("BugleAction", "ProcessConversationParticipantsUpdateAsyncAction");
    public static final Parcelable.Creator<Action<List<fbzx>>> CREATOR = new baka();

    /* compiled from: PG */
    public interface a {
        bakb hW();
    }

    public ProcessConversationParticipantsUpdateAsyncAction(Parcel parcel, ffbr ffbrVar, ffbr ffbrVar2, chhj chhjVar, chww chwwVar, bzgd bzgdVar, akzt akztVar, errl errlVar, errl errlVar2, chqc chqcVar, ffbr ffbrVar3) {
        super(parcel, eogt.PROCESS_CONVERSATION_PARTICIPANTS_UPDATE_ACTION);
        this.g = ffbrVar;
        this.b = ffbrVar2;
        this.f = chhjVar;
        this.e = chwwVar;
        this.h = bzgdVar;
        this.c = akztVar;
        this.i = errlVar;
        this.j = errlVar2;
        this.k = chqcVar;
        this.d = ffbrVar3;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessConversationParticipantsUpdateAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessConversationParticipantUpdate.ExecuteAction.Latency";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        elfl a2;
        Boolean bool = (Boolean) bzax.a.e();
        if (bool.booleanValue()) {
            this.c.e("Bugle.Ditto.Action.Success.Metrics.Counts", 17);
        }
        engw l = this.h.l();
        if (l.isEmpty()) {
            a2 = elfo.e(Collections.EMPTY_LIST);
        } else {
            Set<BugleConversationId> enpxVar = this.t.x("conversation_id_key") ? new enpx(new BugleConversationId(bdgq.b(this.t.l("conversation_id_key")))) : (Set) Collection.EL.stream(((bdeo) this.g.b()).b(this.t.e("conversation_timestamp_key", Long.MAX_VALUE))).map(new Function() { // from class: bajv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bcyk) obj).Q();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: bajw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new BugleConversationId((ConversationIdType) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: bajx
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new cmj();
                }
            }));
            ekzz f = eleg.f("ProcessConversationParticipantsUpdateAsyncAction::workOnAllActiveDesktops_dsdrGroupsFlag");
            try {
                ArrayList arrayList = new ArrayList();
                for (final BugleConversationId bugleConversationId : enpxVar) {
                    final elfl c = this.k.c(bugleConversationId);
                    final elfl a3 = this.k.a(bugleConversationId);
                    elfl a4 = elfo.m(c, a3).a(new Callable() { // from class: bajy
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cskc cskcVar = ProcessConversationParticipantsUpdateAsyncAction.a;
                            erxg erxgVar = (erxg) erxi.a.createBuilder();
                            erus erusVar = (erus) erut.a.createBuilder();
                            String a5 = BugleConversationId.this.a.a();
                            erusVar.copyOnWrite();
                            erut erutVar = (erut) erusVar.instance;
                            a5.getClass();
                            erutVar.b = a5;
                            erusVar.a((Iterable) erqt.q(c));
                            erusVar.a((Iterable) erqt.q(a3));
                            erxgVar.copyOnWrite();
                            erxi erxiVar = (erxi) erxgVar.instance;
                            erut erutVar2 = (erut) erusVar.build();
                            erutVar2.getClass();
                            erxiVar.c = erutVar2;
                            erxiVar.b = 8;
                            return (erxi) erxgVar.build();
                        }
                    }, this.j);
                    enqv it = l.iterator();
                    while (it.hasNext()) {
                        final bzej bzejVar = (bzej) it.next();
                        final String e = bzejVar.e();
                        if (TextUtils.isEmpty(e)) {
                            a.r("Skip desktop due to empty request id");
                        } else {
                            arrayList.add(a4.i(new eroh() { // from class: bajz
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj) {
                                    chwv a5;
                                    bzej bzejVar2 = bzejVar;
                                    erxi erxiVar = (erxi) obj;
                                    fcek d = bzejVar2.d();
                                    ProcessConversationParticipantsUpdateAsyncAction processConversationParticipantsUpdateAsyncAction = ProcessConversationParticipantsUpdateAsyncAction.this;
                                    boolean a6 = ((cgcu) processConversationParticipantsUpdateAsyncAction.d.b()).a();
                                    String str = e;
                                    if (a6) {
                                        chwu a7 = processConversationParticipantsUpdateAsyncAction.e.a(bzejVar2.c(), esaa.GET_UPDATES);
                                        a7.c = str;
                                        a7.b(erxiVar);
                                        a5 = a7.a();
                                    } else {
                                        chwu c2 = processConversationParticipantsUpdateAsyncAction.e.c(d, Optional.empty(), esaa.GET_UPDATES);
                                        c2.c = str;
                                        c2.b(erxiVar);
                                        a5 = c2.a();
                                    }
                                    if (((Optional) processConversationParticipantsUpdateAsyncAction.b.b()).isEmpty()) {
                                        return elfo.d(new UnsupportedOperationException("DittoRetryExecutor is not available on this device."));
                                    }
                                    elfl a8 = ((cikg) ((Optional) processConversationParticipantsUpdateAsyncAction.b.b()).get()).a(a5);
                                    a5.q(a8);
                                    return a8;
                                }
                            }, this.j));
                        }
                    }
                }
                a2 = elfo.a(arrayList);
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
        elfl e2 = a2.e(Throwable.class, new emwl() { // from class: bajt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ProcessConversationParticipantsUpdateAsyncAction.a.s("Action failed.", (Throwable) obj);
                int i = engw.d;
                return enou.a;
            }
        }, erpp.a);
        if (bool.booleanValue()) {
            e2 = e2.h(new emwl() { // from class: baju
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    List list = (List) obj;
                    ProcessConversationParticipantsUpdateAsyncAction.this.c.e("Bugle.Ditto.Action.Success.Metrics.Counts", 18);
                    return list;
                }
            }, this.i);
        }
        e2.k(this.f, erpp.a);
        return e2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }
}
