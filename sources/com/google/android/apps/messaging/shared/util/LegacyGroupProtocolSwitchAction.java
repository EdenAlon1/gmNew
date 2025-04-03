package com.google.android.apps.messaging.shared.util;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.aztg;
import defpackage.bbcg;
import defpackage.bczy;
import defpackage.bdgq;
import defpackage.bdtd;
import defpackage.cbvt;
import defpackage.cbvv;
import defpackage.cqoh;
import defpackage.crmj;
import defpackage.crmk;
import defpackage.csix;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.engw;
import defpackage.enqv;
import defpackage.eogt;
import defpackage.ffbr;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class LegacyGroupProtocolSwitchAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new crmj();
    private final ffbr a;
    private final cbvt b;
    private final bdtd c;
    private final cqoh d;

    /* compiled from: PG */
    public interface a {
        crmk hS();
    }

    public LegacyGroupProtocolSwitchAction(ffbr<bczy> ffbrVar, cbvt cbvtVar, bdtd bdtdVar, cqoh cqohVar, Parcel parcel) {
        super(parcel, eogt.LEGACY_GROUP_PROTOCOL_SWITCH_ACTION);
        this.a = ffbrVar;
        this.b = cbvtVar;
        this.c = bdtdVar;
        this.d = cqohVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List h(ConversationIdType conversationIdType, String str) {
        ArrayList arrayList = new ArrayList();
        enqv it = ((engw) ((bczy) this.a.b()).L(conversationIdType)).iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            if (!str.equals(bindData.S())) {
                arrayList.add(bindData);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("LegacyGroupProtocolSwitchAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.LegacyGroupProtocolSwitch.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        int i;
        ConversationIdType b = bdgq.b(this.t.l("conversation_id"));
        bbcg bbcgVar = this.t;
        cbvt cbvtVar = this.b;
        int a2 = bbcgVar.a("sub_id");
        int a3 = bbcgVar.a("recipient_count");
        boolean y = bbcgVar.y("is_rcs");
        String l = bbcgVar.l("self_id");
        int h = cbvtVar.h(false, b, y, false, a3, a2);
        if (cbvv.f(h)) {
            aztg g = this.c.g(a2);
            cbvt cbvtVar2 = this.b;
            List h2 = h(b, l);
            csix.k(cbvv.f(h));
            long h3 = ((bczy) cbvtVar2.d.b()).h(b);
            cbvtVar2.j(Optional.empty(), b, g, g.a(), h2, h, h3 == 0 ? cbvtVar2.f.f().toEpochMilli() : h3 + 1, -1L);
            return null;
        }
        if (h == 204) {
            i = h;
        } else {
            if (h != 205) {
                return null;
            }
            i = 205;
        }
        long h4 = ((bczy) this.a.b()).h(b);
        this.b.o(Optional.empty(), b, h(b, l), i, h4 == 0 ? this.d.f().toEpochMilli() : h4 + 1);
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public LegacyGroupProtocolSwitchAction(ffbr<bczy> ffbrVar, cbvt cbvtVar, bdtd bdtdVar, cqoh cqohVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, int i, int i2, boolean z) {
        super(eogt.LEGACY_GROUP_PROTOCOL_SWITCH_ACTION);
        this.t.v("conversation_id", conversationIdType.a());
        if (selfIdentityId != null) {
            this.t.v("self_id", selfIdentityId.b());
        }
        this.t.r("sub_id", i);
        this.t.r("recipient_count", i2);
        this.t.p("is_rcs", z);
        this.a = ffbrVar;
        this.b = cbvtVar;
        this.c = bdtdVar;
        this.d = cqohVar;
    }
}
