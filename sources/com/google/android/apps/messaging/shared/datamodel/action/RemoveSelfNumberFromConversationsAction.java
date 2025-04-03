package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.action.RemoveSelfNumberFromConversationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.akzw;
import defpackage.albq;
import defpackage.aolr;
import defpackage.aoqa;
import defpackage.aoqm;
import defpackage.baty;
import defpackage.bbfy;
import defpackage.bczy;
import defpackage.bskp;
import defpackage.bskr;
import defpackage.bsob;
import defpackage.bsom;
import defpackage.byyt;
import defpackage.cbgf;
import defpackage.cfva;
import defpackage.cgsx;
import defpackage.cisd;
import defpackage.cisg;
import defpackage.cish;
import defpackage.cisl;
import defpackage.coto;
import defpackage.covs;
import defpackage.cpxu;
import defpackage.cpxv;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ctvb;
import defpackage.ctwb;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.engw;
import defpackage.enip;
import defpackage.enou;
import defpackage.enqv;
import defpackage.eogt;
import defpackage.ffbr;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RemoveSelfNumberFromConversationsAction extends Action<Void> implements Parcelable {
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final cbgf e;
    private final ctwb f;
    private final ctvb g;
    private final covs h;
    private final albq i;
    private final cisl j;
    private final cish k;
    private final dtuu l;
    private final Context m;
    private final ffbr n;
    public static final cskc a = cskc.g("Bugle", "RemoveSelfNumberFromConversationsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new baty();

    /* compiled from: PG */
    public interface a {
        bbfy bo();
    }

    public RemoveSelfNumberFromConversationsAction(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ctwb ctwbVar, ctvb ctvbVar, covs covsVar, albq albqVar, cisl cislVar, cish cishVar, cbgf cbgfVar, dtuu dtuuVar, ffbr ffbrVar4, Context context, int i) {
        super(eogt.REMOVE_SELF_NUMBER_FROM_CONVERSATIONS_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.f = ctwbVar;
        this.g = ctvbVar;
        this.h = covsVar;
        this.i = albqVar;
        this.j = cislVar;
        this.k = cishVar;
        this.e = cbgfVar;
        this.l = dtuuVar;
        this.m = context;
        this.n = ffbrVar4;
        this.t.r("sub_id", i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("RemoveSelfNumberFromConversationsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RemoveSelfNumberFromConversations.ExecuteAction.Latency";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        akzw akzwVar;
        int i;
        String str = "targetThreadId";
        int i2 = 1;
        Optional i3 = this.f.h(this.t.b("sub_id", -1)).i(true);
        bsob e = bsom.e();
        e.z("RemoveSelfNumberFromConversationsAction#doBackgroundWork");
        e.r();
        bskp bskpVar = bsom.c;
        int i4 = 2;
        e.c(bskpVar.a, bskpVar.q, bskpVar.E, bskpVar.G, bskpVar.F, bskpVar.b);
        e.i(new Function() { // from class: batx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                cskc cskcVar = RemoveSelfNumberFromConversationsAction.a;
                bsolVar.j(1);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bskr bskrVar = (bskr) e.b().o();
        while (bskrVar.moveToNext()) {
            try {
                final ConversationIdType h = bskrVar.h();
                List L = ((bczy) this.b.b()).L(h);
                if (((enou) L).c >= i4) {
                    HashSet C = this.g.C();
                    enip d = this.g.d();
                    enqv it = ((engw) L).iterator();
                    int i5 = 0;
                    int i6 = 0;
                    while (it.hasNext()) {
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                        String U = bindData.U();
                        int i7 = i2;
                        Optional of = Optional.of(((aolr) this.n.b()).q(bindData));
                        if (of.equals(i3)) {
                            i5 = i7;
                            i2 = i5;
                        } else {
                            cfva cfvaVar = aoqm.a;
                            if ((!((Boolean) new aoqa().get()).booleanValue() || d.contains(of.get())) && (((Boolean) new aoqa().get()).booleanValue() || C.contains(U))) {
                                i2 = i7;
                            }
                            i6 = i7;
                            i2 = i6;
                        }
                    }
                    int i8 = i2;
                    if (i5 != 0 && i6 != 0) {
                        final byyt j = bskrVar.j();
                        final boolean z = !bskrVar.w();
                        final boolean z2 = !bskrVar.x();
                        final String r = bskrVar.r();
                        cpxu k = bskrVar.k();
                        ContentResolver contentResolver = this.m.getContentResolver();
                        final ArrayList arrayList = new ArrayList();
                        enqv it2 = ((engw) L).iterator();
                        while (it2.hasNext()) {
                            ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) it2.next();
                            enqv enqvVar = it2;
                            if (!Optional.of(((aolr) this.n.b()).q(bindData2)).equals(i3)) {
                                arrayList.add(bindData2);
                            }
                            it2 = enqvVar;
                        }
                        final long d2 = this.h.d(arrayList);
                        if (d2 < 0) {
                            a.r("failed to create thread.");
                        } else if (((bczy) this.b.b()).o(coto.b, d2).b()) {
                            ContentValues contentValues = new ContentValues(i8);
                            Long valueOf = Long.valueOf(d2);
                            contentValues.put("thread_id", valueOf);
                            akzw b = this.i.b("Bugle.Telephony.Update.Sms.Thread.Latency");
                            int b2 = cgsx.b(contentResolver, Telephony.Sms.CONTENT_URI, contentValues, "thread_id=?", new String[]{Long.toString(cpxv.a(k))});
                            b.c();
                            cskc cskcVar = a;
                            csjb c = cskcVar.c();
                            c.G(b2);
                            c.I("SMS moved.");
                            c.A("from threadId", k);
                            c.z(str, d2);
                            c.r();
                            ContentValues contentValues2 = new ContentValues(1);
                            contentValues2.put("thread_id", valueOf);
                            akzw b3 = this.i.b("Bugle.Telephony.Update.Mms.Thread.Latency");
                            if (k.c()) {
                                akzwVar = b3;
                                i = cgsx.b(contentResolver, Telephony.Mms.CONTENT_URI, contentValues2, "thread_id=?", new String[]{Long.toString(cpxv.a(k))});
                            } else {
                                akzwVar = b3;
                                i = 0;
                            }
                            akzwVar.c();
                            csjb c2 = cskcVar.c();
                            c2.G(i);
                            c2.I("MMS moved.");
                            c2.A("from threadId", k);
                            c2.z(str, d2);
                            c2.r();
                            String str2 = str;
                            this.l.d("removeSelfNumberFromConversation", new Runnable() { // from class: batw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    RemoveSelfNumberFromConversationsAction removeSelfNumberFromConversationsAction = RemoveSelfNumberFromConversationsAction.this;
                                    bczy bczyVar = (bczy) removeSelfNumberFromConversationsAction.b.b();
                                    bdgc y = bdgd.y();
                                    y.z(new cpxu(d2));
                                    byyt byytVar = j;
                                    y.f(byytVar);
                                    y.p(arrayList);
                                    y.n(!z);
                                    y.o(!z2);
                                    ((bczj) y).a = Optional.ofNullable(r);
                                    y.k(false);
                                    y.l(false);
                                    ConversationIdType a2 = bczyVar.j(y.A()).a();
                                    boolean b4 = a2.b();
                                    final ConversationIdType conversationIdType = h;
                                    if (b4) {
                                        csjb e2 = RemoveSelfNumberFromConversationsAction.a.e();
                                        e2.I("Unable to create target conversationId and move ");
                                        e2.c(conversationIdType);
                                        e2.r();
                                        return;
                                    }
                                    String[] strArr = MessagesTable.a;
                                    buxr buxrVar = new buxr();
                                    buxrVar.ap("moveMessageToNewConversationLocally-messages");
                                    buxrVar.n(a2);
                                    buxrVar.Y(new Function() { // from class: batv
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            buxz buxzVar = (buxz) obj;
                                            cskc cskcVar2 = RemoveSelfNumberFromConversationsAction.a;
                                            buxzVar.m(ConversationIdType.this);
                                            return buxzVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    int e3 = buxrVar.b().e();
                                    csjb c3 = RemoveSelfNumberFromConversationsAction.a.c();
                                    c3.G(e3);
                                    c3.I("messages moved from");
                                    c3.b(e3);
                                    c3.I("to target");
                                    c3.c(a2);
                                    c3.r();
                                    String[] strArr2 = PartsTable.a;
                                    bwdi bwdiVar = new bwdi();
                                    bwdiVar.ap("moveMessageToNewConversationLocally-parts");
                                    bwdiVar.k(a2);
                                    bwdm bwdmVar = new bwdm();
                                    bwdmVar.i(conversationIdType);
                                    bwdiVar.C(bwdmVar);
                                    bwdiVar.b().e();
                                    if (!((cgpv) removeSelfNumberFromConversationsAction.d.b()).g(conversationIdType)) {
                                        ((bdfl) removeSelfNumberFromConversationsAction.c.b()).a(conversationIdType, true, byytVar);
                                        RemoveSelfNumberFromConversationsAction.a.r("Source conversation not empty.");
                                    }
                                    ((bdfl) removeSelfNumberFromConversationsAction.c.b()).b(a2, true, byytVar);
                                    removeSelfNumberFromConversationsAction.e.k(conversationIdType);
                                    removeSelfNumberFromConversationsAction.e.k(a2);
                                }
                            });
                            cish cishVar = this.k;
                            cisd cisdVar = (cisd) cisg.a.createBuilder();
                            cisdVar.copyOnWrite();
                            cisg.a((cisg) cisdVar.instance);
                            cishVar.d((cisg) cisdVar.build());
                            this.j.d();
                            str = str2;
                            i2 = 1;
                            i4 = 2;
                        } else {
                            a.r("thread without current self already exists.");
                        }
                    }
                    i2 = i8;
                    i4 = 2;
                }
            } finally {
            }
        }
        bskrVar.close();
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public RemoveSelfNumberFromConversationsAction(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ctwb ctwbVar, ctvb ctvbVar, covs covsVar, albq albqVar, cisl cislVar, cish cishVar, cbgf cbgfVar, dtuu dtuuVar, ffbr ffbrVar4, Context context, Parcel parcel) {
        super(parcel, eogt.REMOVE_SELF_NUMBER_FROM_CONVERSATIONS_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.f = ctwbVar;
        this.g = ctvbVar;
        this.h = covsVar;
        this.i = albqVar;
        this.j = cislVar;
        this.k = cishVar;
        this.e = cbgfVar;
        this.l = dtuuVar;
        this.m = context;
        this.n = ffbrVar4;
    }
}
