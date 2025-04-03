package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ChangeParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.baci;
import defpackage.bacj;
import defpackage.bdqu;
import defpackage.bdtd;
import defpackage.bvpo;
import defpackage.cbfs;
import defpackage.cbvt;
import defpackage.ckhq;
import defpackage.ckju;
import defpackage.ckjy;
import defpackage.ckjz;
import defpackage.cqoh;
import defpackage.cskc;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.epby;
import defpackage.ffbr;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ChangeParticipantsAction extends Action<Void> implements Parcelable {
    public final ffbr b;
    public final ffbr c;
    public final cbfs d;
    public final cbvt e;
    public final bdtd f;
    public final ffbr g;
    private final cqoh h;
    private final dtuu i;
    private final ckju j;
    public static final cskc a = cskc.g("BugleAction", "ChangeParticipantsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new baci();

    /* compiled from: PG */
    public interface a {
        bacj hE();
    }

    public ChangeParticipantsAction(ffbr ffbrVar, ffbr ffbrVar2, cbfs cbfsVar, cbvt cbvtVar, bdtd bdtdVar, cqoh cqohVar, dtuu dtuuVar, ckju ckjuVar, ffbr ffbrVar3, Bundle bundle) {
        super(bundle, eogt.CHANGE_PARTICIPANTS_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = cbfsVar;
        this.e = cbvtVar;
        this.f = bdtdVar;
        this.h = cqohVar;
        this.i = dtuuVar;
        this.j = ckjuVar;
        this.g = ffbrVar3;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ChangeParticipantsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        ekzz f = eleg.f("ChangeParticipantsAction.executeAction");
        try {
            String l = this.t.l(RcsIntents.EXTRA_USER_ID);
            final long e = this.t.e("rcs.intent.extra.sessionid", -1L);
            final String l2 = this.t.l(RcsIntents.EXTRA_REFERRER);
            if (l2 == null) {
                l2 = l;
            }
            final int b = this.t.b(RcsIntents.EXTRA_EVENT, -1);
            GroupInfo groupInfo = (GroupInfo) this.t.h(RcsIntents.EXTRA_GROUP_INFO);
            ckjy w = ckjz.w();
            final int i = 0;
            w.j(false);
            w.p(false);
            w.q(true);
            w.w(epby.GROUP_NOTIFICATION_VANILLA_RCS);
            w.z(e);
            if (groupInfo != null) {
                ((ckhq) w).a = Optional.of(groupInfo);
            }
            final ConversationIdType a2 = this.j.a(w.D());
            if (a2.b()) {
                a.r("No conversation found for incoming participant change.");
            } else {
                final bvpo f2 = bdqu.f(l);
                switch (b) {
                    case 50020:
                        i = BasePaymentResult.ERROR_REQUEST_FAILED;
                        break;
                    case 50021:
                        i = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
                        break;
                }
                final long epochMilli = this.h.f().toEpochMilli();
                this.i.d("ChangeParticipantsAction#executeAction", new Runnable() { // from class: bach
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean an;
                        String str = l2;
                        ChangeParticipantsAction changeParticipantsAction = ChangeParticipantsAction.this;
                        aztg e2 = changeParticipantsAction.f.e();
                        bvpo f3 = bdqu.f(str);
                        f3.v(((bdrr) changeParticipantsAction.b.b()).j(f3));
                        changeParticipantsAction.d.f(f3, 2);
                        cbfs cbfsVar = changeParticipantsAction.d;
                        bvpo bvpoVar = f2;
                        cbfsVar.f(bvpoVar, 2);
                        ParticipantsTable.BindData a3 = bvpoVar.a();
                        ConversationIdType conversationIdType = a2;
                        if (b == 50021) {
                            an = ((bczy) changeParticipantsAction.c.b()).aj(a3, conversationIdType, true);
                            if (an) {
                                csjb c = ChangeParticipantsAction.a.c();
                                c.j(((bdrt) changeParticipantsAction.g.b()).a(a3, true));
                                c.I("left");
                                c.c(conversationIdType);
                                c.r();
                            } else {
                                csjb b2 = ChangeParticipantsAction.a.b();
                                b2.I("Failed to remove");
                                b2.j(((bdrt) changeParticipantsAction.g.b()).a(a3, true));
                                b2.I("from");
                                b2.c(conversationIdType);
                                b2.r();
                            }
                        } else {
                            an = ((bczy) changeParticipantsAction.c.b()).an(a3, conversationIdType);
                            if (an) {
                                csjb c2 = ChangeParticipantsAction.a.c();
                                c2.j(((bdrt) changeParticipantsAction.g.b()).a(f3.a(), true));
                                c2.I("added");
                                c2.j(((bdrt) changeParticipantsAction.g.b()).a(a3, true));
                                c2.I("to");
                                c2.c(conversationIdType);
                                c2.r();
                            } else {
                                csjb b3 = ChangeParticipantsAction.a.b();
                                b3.I("Failed to add");
                                b3.j(((bdrt) changeParticipantsAction.g.b()).a(a3, true));
                                b3.I("referred by");
                                b3.j(((bdrt) changeParticipantsAction.g.b()).a(f3.a(), true));
                                b3.I("to");
                                b3.c(conversationIdType);
                                b3.r();
                            }
                        }
                        if (!an) {
                            csjb b4 = ChangeParticipantsAction.a.b();
                            b4.I("Not inserting tombstone because of unsuccessful add/remove of participant.");
                            b4.r();
                        } else {
                            long j = e;
                            long j2 = epochMilli;
                            int i2 = i;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(a3);
                            changeParticipantsAction.e.j(Optional.empty(), conversationIdType, e2, f3.a(), arrayList, i2, j2, j);
                        }
                    }
                });
            }
            f.close();
            return null;
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ChangeParticipants.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ChangeParticipantsAction(ffbr ffbrVar, ffbr ffbrVar2, cbfs cbfsVar, cbvt cbvtVar, bdtd bdtdVar, cqoh cqohVar, dtuu dtuuVar, ckju ckjuVar, ffbr ffbrVar3, Parcel parcel) {
        super(parcel, eogt.CHANGE_PARTICIPANTS_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = cbfsVar;
        this.e = cbvtVar;
        this.f = bdtdVar;
        this.h = cqohVar;
        this.i = dtuuVar;
        this.j = ckjuVar;
        this.g = ffbrVar3;
    }
}
