package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveCloudSyncMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.altk;
import defpackage.aolm;
import defpackage.aqky;
import defpackage.axmt;
import defpackage.aztg;
import defpackage.bajq;
import defpackage.baph;
import defpackage.bbft;
import defpackage.bbfw;
import defpackage.bdfl;
import defpackage.bdjr;
import defpackage.bdmq;
import defpackage.bdrr;
import defpackage.bdtd;
import defpackage.byzp;
import defpackage.cpbw;
import defpackage.crrm;
import defpackage.csjy;
import defpackage.cskc;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.ffbr;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReceiveCloudSyncMessageAction extends Action<Void> implements Parcelable {
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final altk f;
    public final cpbw g;
    public final byzp h;
    public final ffbr i;
    public final ffbr j;
    public final aqky k;
    public final ffbr l;
    private final bdtd m;
    private final bbfw n;
    private final dtuu o;
    public static final cskc a = cskc.g("BugleDataModel", "ReceiveCloudSyncMessageAction");
    public static final Parcelable.Creator<Action<?>> CREATOR = new baph();

    /* compiled from: PG */
    public interface a {
        bbft bk();
    }

    public ReceiveCloudSyncMessageAction(ffbr<axmt> ffbrVar, ffbr<bdrr> ffbrVar2, ffbr<bdmq> ffbrVar3, ffbr<bdfl> ffbrVar4, bdtd bdtdVar, altk altkVar, cpbw cpbwVar, bbfw bbfwVar, byzp byzpVar, ffbr<crrm> ffbrVar5, dtuu dtuuVar, ffbr<bdjr> ffbrVar6, aqky aqkyVar, ffbr<aolm> ffbrVar7, Parcel parcel) {
        super(parcel, eogt.RECEIVE_CLOUD_SYNC_MESSAGE_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.m = bdtdVar;
        this.f = altkVar;
        this.g = cpbwVar;
        this.n = bbfwVar;
        this.h = byzpVar;
        this.i = ffbrVar5;
        this.o = dtuuVar;
        this.j = ffbrVar6;
        this.k = aqkyVar;
        this.l = ffbrVar7;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ReceiveCloudSyncMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        final aztg e = this.m.e();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        this.o.d("ReceiveCloudSyncMessageAction.executeAction", new Runnable() { // from class: bapg
            @Override // java.lang.Runnable
            public final void run() {
                Parcelable[] parcelableArr;
                int i;
                bapg bapgVar = this;
                ReceiveCloudSyncMessageAction receiveCloudSyncMessageAction = ReceiveCloudSyncMessageAction.this;
                Parcelable[] D = receiveCloudSyncMessageAction.t.D();
                int i2 = 0;
                while (i2 < D.length) {
                    Bundle bundle = (Bundle) D[i2];
                    String string = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.ID");
                    MessageCoreData u = TextUtils.isEmpty(string) ? null : ((bdmq) receiveCloudSyncMessageAction.d.b()).u(string);
                    Set set = hashSet2;
                    Set set2 = hashSet;
                    if (u == null) {
                        aztg aztgVar = e;
                        int e2 = aztgVar.e();
                        String string2 = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.SENDER");
                        string2.getClass();
                        ffbr ffbrVar = receiveCloudSyncMessageAction.i;
                        bvpo f = bdqu.f(string2);
                        boolean e3 = ((crrm) ffbrVar.b()).e(f.f);
                        ArrayList arrayList = new ArrayList();
                        cfva cfvaVar = aoqm.a;
                        ArrayList parcelableArrayList = ((Boolean) new aops().get()).booleanValue() ? bundle.getParcelableArrayList("com.google.android.apps.messaging.cloudsync.extra.OTHER_PARTICIPANTS_MI") : null;
                        if (parcelableArrayList != null) {
                            int size = parcelableArrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                arrayList.add(receiveCloudSyncMessageAction.k.a(((aolm) receiveCloudSyncMessageAction.l.b()).c((eyjv) parcelableArrayList.get(i3))));
                                i3++;
                                D = D;
                            }
                            parcelableArr = D;
                        } else {
                            parcelableArr = D;
                            String[] stringArray = bundle.getStringArray("com.google.android.apps.messaging.cloudsync.extra.OTHER_PARTICIPANTS");
                            if (stringArray == null) {
                                throw new IllegalStateException("Other participants are null");
                            }
                            for (String str : stringArray) {
                                arrayList.add(bdqu.b(str));
                            }
                        }
                        String string3 = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.ID");
                        String string4 = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.TEXT");
                        String string5 = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.SUBJECT");
                        long j = bundle.getLong("com.google.android.apps.messaging.cloudsync.extra.TIME_RECEIVED_MS");
                        long j2 = bundle.getLong("com.google.android.apps.messaging.cloudsync.extra.TIME_SENT_MS");
                        boolean z = bundle.getBoolean("com.google.android.apps.messaging.cloudsync.extra.INCOMING");
                        boolean z2 = !z || bundle.getBoolean("com.google.android.apps.messaging.cloudsync.extra.READ");
                        boolean z3 = z2 || bundle.getBoolean("com.google.android.apps.messaging.cloudsync.extra.NOTIFIED");
                        if (bundle.getBoolean("com.google.android.apps.messaging.cloudsync.extra.HAS_ATTACHMENTS")) {
                            i = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                            if (!z2 && !e3 && receiveCloudSyncMessageAction.g.c(-1)) {
                                i = 104;
                            }
                        } else {
                            i = 100;
                        }
                        int i4 = i;
                        String string6 = bundle.getString("com.google.android.apps.messaging.cloudsync.extra.CORRELATION_ID");
                        boolean z4 = arrayList.size() > 1;
                        axmt axmtVar = (axmt) receiveCloudSyncMessageAction.b.b();
                        ekzz f2 = eleg.f("CloudSyncDatabaseOperations#getCloudSyncConversation");
                        try {
                            efbd.b();
                            ConversationIdType a2 = axmt.a(axmtVar.c(arrayList));
                            f2.close();
                            final byyt F = ((bdmq) receiveCloudSyncMessageAction.d.b()).F(a2, f.f, e3, z4);
                            if (a2.b()) {
                                a2 = ((axmt) receiveCloudSyncMessageAction.b.b()).b(F, arrayList);
                            }
                            final ConversationIdType conversationIdType = a2;
                            if (conversationIdType.b()) {
                                ReceiveCloudSyncMessageAction.a.r("Could not get or create cloud sync conversation");
                            } else {
                                SelfIdentityId g = aztgVar.g();
                                MessageCoreData d = receiveCloudSyncMessageAction.h.d(string3, conversationIdType, z ? ((bdrr) receiveCloudSyncMessageAction.c.b()).j(f) : ((SelfIdentityIdImpl) g).a, g, string4, string5, j2, j, z3, z2, i4, string6);
                                ((bdjr) receiveCloudSyncMessageAction.j.b()).a(d);
                                final bdfl bdflVar = (bdfl) receiveCloudSyncMessageAction.e.b();
                                final MessageIdType B = d.B();
                                final long o = d.o();
                                f2 = eleg.f("ConversationMetadataDatabaseOperations#maybeUpdateConversationMetadata");
                                try {
                                    bdflVar.d(new Runnable() { // from class: bdfg
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            csix.h();
                                            final bdfl bdflVar2 = bdfl.this;
                                            final long j3 = o;
                                            final ConversationIdType conversationIdType2 = conversationIdType;
                                            final MessageIdType messageIdType = B;
                                            final byyt byytVar = F;
                                            bsom.m(conversationIdType2, new Consumer() { // from class: bdfh
                                                @Override // java.util.function.Consumer
                                                public final void accept(Object obj) {
                                                    long x = ((bseh) obj).x();
                                                    long j4 = j3;
                                                    if (j4 > x) {
                                                        byyt byytVar2 = byytVar;
                                                        MessageIdType messageIdType2 = messageIdType;
                                                        bdfl.this.g(conversationIdType2, messageIdType2, Long.valueOf(j4), byytVar2, null, true);
                                                    }
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                        }
                                    }, "ConversationMetadataDatabaseOperations#maybeUpdateConversationMetadata", conversationIdType);
                                    f2.close();
                                    altk altkVar = receiveCloudSyncMessageAction.f;
                                    eoop eoopVar = (eoop) eopq.a.createBuilder();
                                    eoopVar.copyOnWrite();
                                    eopq eopqVar = (eopq) eoopVar.instance;
                                    eopqVar.h = 2;
                                    eopqVar.b = 2 | eopqVar.b;
                                    boolean cN = d.cN();
                                    eoopVar.copyOnWrite();
                                    eopq eopqVar2 = (eopq) eoopVar.instance;
                                    eopqVar2.c |= 1073741824;
                                    eopqVar2.aj = cN;
                                    altkVar.O(d, e2, eoopVar);
                                    set2.add(conversationIdType);
                                    if (z && !z2) {
                                        set.add(conversationIdType);
                                    }
                                    csjb c = ReceiveCloudSyncMessageAction.a.c();
                                    c.I("Received message.");
                                    c.d(d.B());
                                    c.u(',');
                                    c.c(d.z());
                                    c.A("cloudSyncId", string3);
                                    c.r();
                                } finally {
                                }
                            }
                        } finally {
                        }
                    } else {
                        parcelableArr = D;
                        csjb e4 = ReceiveCloudSyncMessageAction.a.e();
                        e4.I("Message already added.");
                        e4.A("cloudSyncId", string);
                        e4.r();
                        if (((axmt) receiveCloudSyncMessageAction.b.b()).e(string, bundle, u)) {
                            ConversationIdType z5 = u.z();
                            set2.add(z5);
                            set.add(z5);
                        }
                    }
                    i2++;
                    bapgVar = this;
                    D = parcelableArr;
                }
            }
        });
        bajq.d(4, this);
        this.n.g();
        csjy.b = false;
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveCloudSyncMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ReceiveCloudSyncMessageAction(ffbr<axmt> ffbrVar, ffbr<bdrr> ffbrVar2, ffbr<bdmq> ffbrVar3, ffbr<bdfl> ffbrVar4, bdtd bdtdVar, altk altkVar, cpbw cpbwVar, bbfw bbfwVar, byzp byzpVar, ffbr<crrm> ffbrVar5, dtuu dtuuVar, ffbr<bdjr> ffbrVar6, aqky aqkyVar, ffbr<aolm> ffbrVar7, Parcelable[] parcelableArr) {
        super(eogt.RECEIVE_CLOUD_SYNC_MESSAGE_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.m = bdtdVar;
        this.f = altkVar;
        this.g = cpbwVar;
        this.n = bbfwVar;
        this.h = byzpVar;
        this.i = ffbrVar5;
        this.o = dtuuVar;
        this.j = ffbrVar6;
        this.k = aqkyVar;
        this.l = ffbrVar7;
        this.t.H(parcelableArr);
    }
}
