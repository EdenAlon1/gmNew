package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingRevocationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aoks;
import defpackage.aolr;
import defpackage.banw;
import defpackage.banx;
import defpackage.bany;
import defpackage.bbfq;
import defpackage.bdmq;
import defpackage.bdnb;
import defpackage.bsob;
import defpackage.bsom;
import defpackage.buuo;
import defpackage.buxl;
import defpackage.buxo;
import defpackage.byzp;
import defpackage.clws;
import defpackage.csux;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.endq;
import defpackage.enip;
import defpackage.ensz;
import defpackage.entd;
import defpackage.eogt;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.ffbr;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessPendingRevocationsAction extends Action<Void> implements Parcelable {
    public final bbfq a;
    public final ffbr b;
    private final ffbr d;
    private final ffbr e;
    private static final entd c = entd.c("BugleRcs");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new banx();

    /* compiled from: PG */
    public interface a {
        bany ib();
    }

    public ProcessPendingRevocationsAction(ffbr ffbrVar, bbfq bbfqVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        super(eogt.PROCESS_PENDING_REVOCATIONS_ACTION);
        this.d = ffbrVar;
        this.a = bbfqVar;
        this.e = ffbrVar2;
        this.b = ffbrVar3;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessPendingRevocationsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        ekzz f = eleg.f("ProcessPendingRevocationsAction.executeAction");
        try {
            w();
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

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessPendingRevocations.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl fS() {
        bdmq bdmqVar = (bdmq) this.d.b();
        Set j = ((clws) this.e.b()).j();
        ekzz f = eleg.f("MessageDatabaseOperations#getMessagesPendingRevocation");
        try {
            buxo d = MessagesTable.d();
            d.z("getMessagesPendingRevocation");
            d.h(new Function() { // from class: bdkm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = bdmq.a;
                    buxzVar.M(3);
                    int intValue = MessagesTable.g().intValue();
                    if (intValue < 41040) {
                        dtub.w("rcs_message_id_with_text_type", intValue);
                    }
                    buxzVar.aq(new dtrx("messages.rcs_message_id_with_text_type", 6));
                    buxzVar.af(15);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final enip enipVar = (enip) Collection.EL.stream(j).map(new Function() { // from class: bdko
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((awui) obj).d;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(endq.b);
            d.h(new Function() { // from class: bdkp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    cskc cskcVar = bdmq.a;
                    buxzVar.Y(enip.this);
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.d(new buxl(MessagesTable.c.i, true));
            bsob e = bsom.e();
            e.g(new Function() { // from class: bdkq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = bdmq.a;
                    return ((bskp) obj).y;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.i(new Function() { // from class: bdkr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    cskc cskcVar = bdmq.a;
                    bsolVar.aq(new dtru("conversations._id", 1, MessagesTable.c.b));
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.n(e.b(), "normalized_destination_expression");
            buuo buuoVar = (buuo) d.b().o();
            try {
                ArrayList<bdnb> arrayList = new ArrayList();
                while (buuoVar.moveToNext()) {
                    MessageCoreData a2 = ((byzp) bdmqVar.e.b()).a();
                    a2.aN(buuoVar);
                    arrayList.add(new bdnb(a2, ((aolr) bdmqVar.d.b()).r(buuoVar.dd("normalized_destination_expression"))));
                }
                buuoVar.close();
                f.close();
                elfl e2 = elfo.e(true);
                for (final bdnb bdnbVar : arrayList) {
                    if (bdnbVar.b.e().isEmpty()) {
                        ensz enszVar = (ensz) c.j();
                        enszVar.Y(csux.e, bdnbVar.a.E().f());
                        enszVar.Y(csux.n, ((aoks) bdnbVar.b).o());
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/action/ProcessPendingRevocationsAction", "processMessagePendingRevokes", 136, "ProcessPendingRevocationsAction.java")).q("Skipping revocation for message with invalid remote destination");
                    } else {
                        e2 = e2.i(new eroh() { // from class: banv
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                elfl c2;
                                if (!((Boolean) obj).booleanValue()) {
                                    return elfo.e(false);
                                }
                                bdnb bdnbVar2 = bdnbVar;
                                ckce ckceVar = (ckce) ProcessPendingRevocationsAction.this.b.b();
                                c2 = axol.c(ckceVar.c, ffhe.a, ffsm.a, new ckbz(ckceVar, bdnbVar2.a, bdnbVar2.b, null));
                                return c2;
                            }
                        }, erpp.a);
                    }
                }
                return e2.h(new banw(this), erpp.a);
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ProcessPendingRevocationsAction(ffbr ffbrVar, bbfq bbfqVar, ffbr ffbrVar2, ffbr ffbrVar3, Parcel parcel) {
        super(parcel, eogt.PROCESS_PENDING_REVOCATIONS_ACTION);
        this.d = ffbrVar;
        this.a = bbfqVar;
        this.e = ffbrVar2;
        this.b = ffbrVar3;
    }
}
