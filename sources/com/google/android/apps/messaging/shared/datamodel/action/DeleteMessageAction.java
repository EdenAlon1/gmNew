package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.DeleteMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.akzt;
import defpackage.alrv;
import defpackage.ames;
import defpackage.axmw;
import defpackage.badp;
import defpackage.bbfe;
import defpackage.bczy;
import defpackage.bdhb;
import defpackage.bdmq;
import defpackage.bseh;
import defpackage.bueb;
import defpackage.bueg;
import defpackage.buxm;
import defpackage.buxo;
import defpackage.cbbl;
import defpackage.cbbm;
import defpackage.cbif;
import defpackage.cbut;
import defpackage.cgpv;
import defpackage.cish;
import defpackage.cisl;
import defpackage.ckds;
import defpackage.covo;
import defpackage.coxk;
import defpackage.csjb;
import defpackage.csjy;
import defpackage.cskc;
import defpackage.ecda;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.engw;
import defpackage.enin;
import defpackage.eogt;
import defpackage.ffbr;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class DeleteMessageAction extends Action<Bundle> implements Parcelable {
    private final Context b;
    private final ffbr c;
    private final ffbr d;
    private final akzt e;
    private final ckds f;
    private final cbif g;
    private final covo h;
    private final coxk i;
    private final alrv j;
    private final cish k;
    private final cisl l;
    private final cbut m;
    private final axmw n;
    private final ffbr o;
    private final ffbr p;
    private static final cskc a = cskc.g("BugleDataModel", "DeleteMessageAction");
    public static final Parcelable.Creator<Action<Bundle>> CREATOR = new badp();

    /* compiled from: PG */
    public interface a {
        bbfe aY();
    }

    public DeleteMessageAction(Context context, ffbr ffbrVar, ffbr ffbrVar2, akzt akztVar, ckds ckdsVar, cbif cbifVar, covo covoVar, coxk coxkVar, alrv alrvVar, cish cishVar, cisl cislVar, cbut cbutVar, axmw axmwVar, ffbr ffbrVar3, ffbr ffbrVar4, Parcel parcel) {
        super(parcel, eogt.DELETE_MESSAGE_ACTION);
        this.b = context;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = akztVar;
        this.f = ckdsVar;
        this.g = cbifVar;
        this.h = covoVar;
        this.i = coxkVar;
        this.j = alrvVar;
        this.k = cishVar;
        this.l = cislVar;
        this.m = cbutVar;
        this.n = axmwVar;
        this.o = ffbrVar3;
        this.p = ffbrVar4;
    }

    private static Bundle h() {
        return k(false);
    }

    private static Bundle k(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("success_extra", z);
        return bundle;
    }

    private final Bundle l(final List list, boolean z) {
        boolean z2;
        String ai;
        enin eninVar = new enin();
        eninVar.j(list);
        buxo d = MessagesTable.d();
        d.z("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId-subquery");
        d.f(new Function() { // from class: badk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Parcelable.Creator<Action<Bundle>> creator = DeleteMessageAction.CREATOR;
                return ((buum) obj).R;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: badl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                Parcelable.Creator<Action<Bundle>> creator = DeleteMessageAction.CREATOR;
                buxzVar.u(list);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final buxm b = d.b();
        buxo d2 = MessagesTable.d();
        d2.z("+DeleteMessageHandler#getMessageIdsWithSameOriginalRcsMessageId");
        d2.c(MessagesTable.c.a);
        d2.h(new Function() { // from class: badm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                Parcelable.Creator<Action<Bundle>> creator = DeleteMessageAction.CREATOR;
                buxzVar.H(buxm.this);
                buxzVar.z(list);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eninVar.j(d2.b().g());
        bueb a2 = bueg.a();
        a2.z("+DeleteMessageAction#getMessageIdsWithReactions");
        a2.c(bueg.c.b);
        a2.f(new Function() { // from class: bado
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buef buefVar = (buef) obj;
                Parcelable.Creator<Action<Bundle>> creator = DeleteMessageAction.CREATOR;
                buefVar.d(list);
                return buefVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eninVar.j(a2.b().f());
        engw g = eninVar.g().g();
        engw<MessageCoreData> K = ((bdmq) this.c.b()).K(g);
        if (K.isEmpty()) {
            a.r("No messages retrieved to delete");
            return h();
        }
        this.m.n(K);
        ConversationIdType z3 = ((MessageCoreData) K.get(0)).z();
        if (((cgpv) this.d.b()).b(g, z3) == K.size()) {
            ArrayList arrayList = new ArrayList();
            int size = K.size();
            for (int i = 0; i < size; i++) {
                MessageCoreData messageCoreData = (MessageCoreData) K.get(i);
                MessageIdType B = messageCoreData.B();
                cskc cskcVar = a;
                csjb c = cskcVar.c();
                c.I("Deleted local");
                c.d(B);
                c.r();
                if (messageCoreData.cY() && !messageCoreData.de()) {
                    this.e.c("Bugle.Rcs.Files.Transfer.Outgoing.Cancelled.Counts");
                }
                long n = messageCoreData.n();
                if (n != -1) {
                    this.f.x(n);
                    csjb c2 = cskcVar.c();
                    c2.I("Deleting file transfer from RCS engine.");
                    c2.z("rcsFileTransferSessionId", n);
                    c2.r();
                }
                if (z && (ai = messageCoreData.ai()) != null) {
                    arrayList.add(ai);
                }
            }
            if (z) {
                this.n.b(this.b, (String[]) arrayList.toArray(new String[0]));
            }
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (MessageCoreData messageCoreData2 : K) {
            covo covoVar = this.h;
            List ab = messageCoreData2.ab();
            cbbl c3 = ((cbbm) covoVar.a.b()).c(1);
            Iterator it = ab.iterator();
            while (it.hasNext()) {
                Uri t = ((MessagePartCoreData) it.next()).t();
                if (t != null) {
                    csjy.l("Bugle", "Clearing cache for ".concat(t.toString()));
                    c3.e(t.toString());
                }
            }
            Uri u = messageCoreData2.u();
            if (u != null) {
                arrayList2.add(u);
            } else {
                MessageIdType B2 = messageCoreData2.B();
                csjb c4 = a.c();
                c4.I("Local");
                c4.d(B2);
                c4.I("has no telephony uri: Unable to delete from telephony.");
                c4.r();
            }
        }
        this.i.ak(arrayList2);
        boolean z4 = z2 | (K.size() == 0);
        bseh r = ((bczy) this.p.b()).r(z3);
        this.g.c(null, ((ames) this.o.b()).a(z3, r == null ? null : r.aa(), r != null && r.am()));
        return k(z4);
    }

    private final ecda m() {
        ArrayList F = this.t.F();
        return (F == null || F.size() == 1) ? alrv.k : alrv.l;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("DeleteMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        this.j.e(m());
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.DeleteMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        ArrayList arrayList = new ArrayList();
        MessageIdType b = bdhb.b(this.t.l("message_id"));
        if (!b.c()) {
            arrayList.add(b);
        }
        ArrayList F = this.t.F();
        ArrayList arrayList2 = F == null ? null : (ArrayList) Collection.EL.stream(F).map(new Function() { // from class: badn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Parcelable.Creator<Action<Bundle>> creator = DeleteMessageAction.CREATOR;
                return bdhb.b((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: badj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        if (!arrayList.isEmpty()) {
            return l(arrayList, true);
        }
        String l = this.t.l("cloud_sync_id");
        if (l == null || TextUtils.isEmpty(l)) {
            return h();
        }
        MessageCoreData u = ((bdmq) this.c.b()).u(l);
        if (u != null) {
            Bundle l2 = l(Collections.singletonList(u.B()), false);
            this.k.c();
            this.l.d();
            return l2;
        }
        csjb e = a.e();
        e.I("Cloud Message");
        e.A("cloudSyncId", l);
        e.I("no longer exists.");
        e.r();
        return h();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object fU(Bundle bundle) {
        this.j.f(m());
        return bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }
}
