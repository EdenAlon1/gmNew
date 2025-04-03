package com.google.android.apps.messaging.wearable.action;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.wearable.action.RequestMoreMessagesAction;
import defpackage.bbcg;
import defpackage.bdgq;
import defpackage.ctba;
import defpackage.cvgx;
import defpackage.cvgy;
import defpackage.cvgz;
import defpackage.cvhm;
import defpackage.defb;
import defpackage.dhqv;
import defpackage.dhqy;
import defpackage.dhre;
import defpackage.dhzq;
import defpackage.dhzv;
import defpackage.digi;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elgf;
import defpackage.entd;
import defpackage.eogt;
import defpackage.errl;
import defpackage.ffbr;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RequestMoreMessagesAction extends Action<Void> {
    public cvhm b;
    public ffbr c;
    private Context d;
    private dhzv e;
    private cvgy f;
    private cvgz g;
    private errl h;
    public static final entd a = entd.c("BugleWearable");
    public static final Parcelable.Creator<RequestMoreMessagesAction> CREATOR = new defb();

    /* compiled from: PG */
    public interface a {
        Context R();

        cvgy cZ();

        cvgz da();

        cvhm db();

        dhzv dp();

        ffbr gz();

        errl q();
    }

    public RequestMoreMessagesAction(Parcel parcel) {
        super(parcel, eogt.REQUEST_MORE_MESSAGES_ACTION);
        h();
    }

    private final void h() {
        a aVar = (a) ctba.a(a.class);
        this.d = aVar.R();
        this.e = aVar.dp();
        this.f = aVar.cZ();
        this.g = aVar.da();
        this.b = aVar.db();
        this.c = aVar.gz();
        this.h = aVar.q();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("RequestMoreMessagesAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RequestMoreMessagesAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fR() {
        ConversationIdType b = bdgq.b(this.t.l("conversationId"));
        bbcg bbcgVar = this.t;
        int a2 = bbcgVar.a("offset");
        String l = bbcgVar.l("nodeId");
        cvgz cvgzVar = this.g;
        ffbr ffbrVar = cvgzVar.a;
        ffbr ffbrVar2 = cvgzVar.b;
        cvgx cvgxVar = new cvgx(new dhzq());
        cvgxVar.d(b);
        ArrayList b2 = this.f.b(cvgxVar, null, null, a2, this.d);
        dhzq dhzqVar = new dhzq();
        dhzqVar.n("1", b.a());
        dhzqVar.k("6", b2);
        final String uuid = UUID.randomUUID().toString();
        dhzqVar.n("39", uuid);
        dhre a3 = this.e.a(l, "/bugle/rpc/more_messages/", digi.b(dhzqVar).a.toByteArray());
        a3.q(this.h, elgf.b(new dhqy() { // from class: deez
            @Override // defpackage.dhqy
            public final void e(Object obj) {
                RequestMoreMessagesAction requestMoreMessagesAction = RequestMoreMessagesAction.this;
                ((akzt) requestMoreMessagesAction.b.b.b()).e("Bugle.Wear.Rpc.Outgoing.Count", ((Integer) cvhm.a.getOrDefault("/bugle/rpc/more_messages/", 0)).intValue());
                cvho cvhoVar = (cvho) requestMoreMessagesAction.c.b();
                int intValue = ((Integer) obj).intValue();
                String str = uuid;
                str.getClass();
                if (cvhoVar.b()) {
                    cvhoVar.c(2, "/bugle/rpc/more_messages/", str, null, intValue >= 0 ? cvho.b : cvho.c);
                }
            }
        }));
        a3.p(this.h, elgf.a(new dhqv() { // from class: defa
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                ensz enszVar = (ensz) ((ensz) RequestMoreMessagesAction.a.j()).g(exc);
                enszVar.Y(csux.O, "RequestMoreMessagesAction");
                enszVar.Y(cviu.c, "/bugle/rpc/more_messages/");
                ((ensz) enszVar.h("com/google/android/apps/messaging/wearable/action/RequestMoreMessagesAction", "doBackgroundWork", 197, "RequestMoreMessagesAction.java")).q("Failed to send message to path");
                cvho cvhoVar = (cvho) RequestMoreMessagesAction.this.c.b();
                String str = uuid;
                str.getClass();
                if (cvhoVar.b()) {
                    cvhoVar.c(2, "/bugle/rpc/more_messages/", str, null, cvhoVar.a(exc));
                }
            }
        }));
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public RequestMoreMessagesAction(String str, ConversationIdType conversationIdType, int i) {
        super(eogt.REQUEST_MORE_MESSAGES_ACTION);
        h();
        bbcg bbcgVar = this.t;
        if (bbcgVar == null) {
            return;
        }
        bbcgVar.v("nodeId", str);
        this.t.v("conversationId", conversationIdType.a());
        this.t.r("offset", i);
    }
}
