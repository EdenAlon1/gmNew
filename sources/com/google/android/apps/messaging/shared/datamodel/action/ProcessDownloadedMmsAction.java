package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDownloadedMmsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.akvz;
import defpackage.albq;
import defpackage.alkw;
import defpackage.altk;
import defpackage.aqkp;
import defpackage.aslt;
import defpackage.asmg;
import defpackage.axol;
import defpackage.azei;
import defpackage.baam;
import defpackage.baim;
import defpackage.bakv;
import defpackage.bakw;
import defpackage.baky;
import defpackage.bame;
import defpackage.bamf;
import defpackage.bamm;
import defpackage.bamn;
import defpackage.bamw;
import defpackage.bamx;
import defpackage.bauj;
import defpackage.bbcg;
import defpackage.bbfw;
import defpackage.bcwz;
import defpackage.bdgq;
import defpackage.bdhb;
import defpackage.bdtd;
import defpackage.bdvi;
import defpackage.bdxd;
import defpackage.cbgf;
import defpackage.cbut;
import defpackage.cbvt;
import defpackage.cncp;
import defpackage.covo;
import defpackage.covp;
import defpackage.covr;
import defpackage.coxg;
import defpackage.coxk;
import defpackage.cpdg;
import defpackage.cqoh;
import defpackage.csix;
import defpackage.csrv;
import defpackage.csux;
import defpackage.cubr;
import defpackage.djsi;
import defpackage.dtuu;
import defpackage.ecrj;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eogt;
import defpackage.ffbr;
import defpackage.ffhd;
import defpackage.ffhe;
import defpackage.ffsk;
import defpackage.ffsm;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessDownloadedMmsAction extends Action<MessageCoreData> {
    private final ffbr b;
    private final ffbr c;
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/action/ProcessDownloadedMmsAction");
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new bakv();

    /* compiled from: PG */
    public interface a {
        baky hY();
    }

    public ProcessDownloadedMmsAction(ffbr ffbrVar, ffbr ffbrVar2, int i, Bundle bundle) {
        super(eogt.PROCESS_DOWNLOADED_MMS_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        MessageIdType b = bdhb.b(bundle.getString("message_id"));
        Uri uri = (Uri) bundle.getParcelable("content_uri");
        Uri uri2 = (Uri) bundle.getParcelable("notification_uri");
        ConversationIdType b2 = bdgq.b(bundle.getString("conversation_id"));
        String string = bundle.getString("participant_id");
        csix.l(b);
        csix.l(uri);
        csix.l(uri2);
        csix.l(b2);
        csix.l(string);
        this.t.p("downloaded_by_mms_api_or_lib", true);
        this.t.v("message_id", b.b());
        this.t.r("result_code", i);
        this.t.r("http_status_code", bundle.getInt("android.telephony.extra.MMS_HTTP_STATUS", 0));
        this.t.t("content_uri", uri);
        this.t.t("notification_uri", uri2);
        this.t.r("sub_id", bundle.getInt("sub_id", -1));
        this.t.v("sub_phone_number", bundle.getString("sub_phone_number"));
        this.t.v("transaction_id", bundle.getString("transaction_id"));
        this.t.v("content_location", bundle.getString("content_location"));
        this.t.p("auto_download", bundle.getBoolean("auto_download"));
        this.t.s("received_timestamp", bundle.getLong("received_timestamp"));
        this.t.v("conversation_id", b2.a());
        this.t.v("participant_id", string);
        this.t.r("status_if_failed", bundle.getInt("status_if_failed"));
        this.t.s("message_logging_id", bundle.getLong("message_logging_id"));
        this.t.r("mms_last_connection_failure_cause_code", bundle.getInt("android.telephony.extra.LAST_CONNECTION_FAILURE_CAUSE_CODE"));
        if (bundle.getBoolean("android.telephony.extra.EXTRA_HANDLED_BY_CARRIER_APP")) {
            this.t.r("mms_api", 3);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessDownloadedMmsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessDownloadedMms.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        elfl c;
        elfl c2;
        bbcg bbcgVar = this.t;
        bakw h = h();
        bbcgVar.getClass();
        if (((Boolean) bamw.c().e()).booleanValue()) {
            bamw bamwVar = (bamw) h;
            c2 = axol.c(bamwVar.t, ffhe.a, ffsm.a, new bame(bamwVar, null));
            return c2;
        }
        bamw bamwVar2 = (bamw) h;
        c = axol.c(bamwVar2.u, ffhe.a, ffsm.a, new bamf(bamwVar2, null));
        return c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl fT() {
        elfl c;
        elfl c2;
        bakw h = h();
        if (((Boolean) bamw.c().e()).booleanValue()) {
            bamw bamwVar = (bamw) h;
            c2 = axol.c(bamwVar.t, ffhe.a, ffsm.a, new bamm(bamwVar, null));
            return c2;
        }
        bamw bamwVar2 = (bamw) h;
        c = axol.c(bamwVar2.u, ffhe.a, ffsm.a, new bamn(bamwVar2, null));
        return c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fV() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v84, types: [fazb, java.lang.Object] */
    final bakw h() {
        if (TextUtils.isEmpty(this.t.l("sub_phone_number"))) {
            int b = this.t.b("sub_id", -1);
            if (b == -1) {
                ensk j = a.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessDownloadedMmsAction", "populateRcsSelfNumberIfRawIsAbsent", 362, "ProcessDownloadedMmsAction.java")).q("Missing subId when downloading MMS");
            } else {
                Optional map = ((djsi) this.c.b()).g(b).map(new Function() { // from class: bakt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((djrj) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ensk j2 = a.j();
                j2.Y(ente.a, "Bugle");
                enrr enrrVar = (enrr) j2;
                enrrVar.Y(csux.t, Integer.valueOf(b));
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/action/ProcessDownloadedMmsAction", "populateRcsSelfNumberIfRawIsAbsent", 374, "ProcessDownloadedMmsAction.java")).t("Missing self number when downloading MMS, fallback to RCS number on the sub: %s", Boolean.valueOf(map.isPresent()));
                map.ifPresent(new Consumer() { // from class: baku
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ProcessDownloadedMmsAction.this.t.v("sub_phone_number", (String) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
        bamx bamxVar = (bamx) this.b.b();
        Context context = (Context) bamxVar.a.b();
        context.getClass();
        cqoh cqohVar = (cqoh) bamxVar.b.b();
        cqohVar.getClass();
        covr covrVar = (covr) bamxVar.c.b();
        covrVar.getClass();
        cpdg cpdgVar = (cpdg) bamxVar.d.b();
        cpdgVar.getClass();
        ffbr ffbrVar = bamxVar.e;
        bdxd bdxdVar = (bdxd) bamxVar.f.b();
        bdxdVar.getClass();
        Optional optional = (Optional) bamxVar.g.b();
        optional.getClass();
        cbvt cbvtVar = (cbvt) bamxVar.h.b();
        cbvtVar.getClass();
        altk altkVar = (altk) bamxVar.i.b();
        altkVar.getClass();
        ((akvz) bamxVar.j.b()).getClass();
        ffbr ffbrVar2 = bamxVar.k;
        ffbr ffbrVar3 = bamxVar.l;
        ffbr ffbrVar4 = bamxVar.m;
        ffbr ffbrVar5 = bamxVar.n;
        ffbr ffbrVar6 = bamxVar.o;
        ffbr ffbrVar7 = bamxVar.p;
        albq albqVar = (albq) bamxVar.q.b();
        albqVar.getClass();
        cubr cubrVar = (cubr) bamxVar.r.b();
        cubrVar.getClass();
        ffbr ffbrVar8 = bamxVar.s;
        coxk coxkVar = (coxk) bamxVar.t.b();
        coxkVar.getClass();
        ffbr ffbrVar9 = bamxVar.u;
        bdtd bdtdVar = (bdtd) bamxVar.v.b();
        bdtdVar.getClass();
        covo covoVar = (covo) bamxVar.w.b();
        covoVar.getClass();
        baam baamVar = (baam) bamxVar.x.b();
        baamVar.getClass();
        covp covpVar = (covp) bamxVar.y.b();
        covpVar.getClass();
        bbfw bbfwVar = (bbfw) bamxVar.z.b();
        bbfwVar.getClass();
        cbgf cbgfVar = (cbgf) bamxVar.A.b();
        cbgfVar.getClass();
        bdvi bdviVar = (bdvi) bamxVar.B.b();
        bdviVar.getClass();
        dtuu dtuuVar = (dtuu) bamxVar.C.b();
        dtuuVar.getClass();
        bauj baujVar = (bauj) bamxVar.D.b();
        baujVar.getClass();
        baim baimVar = (baim) bamxVar.E.b();
        baimVar.getClass();
        bcwz bcwzVar = (bcwz) bamxVar.F.b();
        bcwzVar.getClass();
        csrv csrvVar = (csrv) bamxVar.G.b();
        csrvVar.getClass();
        coxg coxgVar = (coxg) bamxVar.H.b();
        coxgVar.getClass();
        cbut cbutVar = (cbut) bamxVar.I.b();
        cbutVar.getClass();
        cncp cncpVar = (cncp) bamxVar.J.b();
        cncpVar.getClass();
        alkw alkwVar = (alkw) bamxVar.K.b();
        alkwVar.getClass();
        ffbr ffbrVar10 = bamxVar.L;
        Optional optional2 = (Optional) bamxVar.M.b();
        optional2.getClass();
        ffbr ffbrVar11 = bamxVar.N;
        ffbr ffbrVar12 = bamxVar.O;
        ffsk ffskVar = (ffsk) bamxVar.P.b();
        ffskVar.getClass();
        ffsk ffskVar2 = (ffsk) bamxVar.Q.b();
        ffskVar2.getClass();
        ffhd ffhdVar = (ffhd) bamxVar.R.b();
        ffhdVar.getClass();
        ffhd ffhdVar2 = (ffhd) bamxVar.S.b();
        ffhdVar2.getClass();
        ffbr ffbrVar13 = bamxVar.T;
        ffbr ffbrVar14 = bamxVar.U;
        ffbr ffbrVar15 = bamxVar.V;
        ffbr ffbrVar16 = bamxVar.W;
        ?? b2 = bamxVar.X.b();
        b2.getClass();
        ffbr ffbrVar17 = bamxVar.Y;
        ecrj ecrjVar = (ecrj) bamxVar.Z.b();
        ecrjVar.getClass();
        ffbr ffbrVar18 = bamxVar.aa;
        ffbr ffbrVar19 = bamxVar.ab;
        ffbr ffbrVar20 = bamxVar.ac;
        ffbr ffbrVar21 = bamxVar.ad;
        ffbr ffbrVar22 = bamxVar.ae;
        ffbr ffbrVar23 = bamxVar.af;
        ffbr ffbrVar24 = bamxVar.ag;
        ffbr ffbrVar25 = bamxVar.ah;
        ffbr ffbrVar26 = bamxVar.ai;
        aslt asltVar = (aslt) bamxVar.aj.b();
        asltVar.getClass();
        ffbr ffbrVar27 = bamxVar.ak;
        ffbr ffbrVar28 = bamxVar.al;
        ffbr ffbrVar29 = bamxVar.am;
        ffbr ffbrVar30 = bamxVar.an;
        ffbr ffbrVar31 = bamxVar.ao;
        ffbr ffbrVar32 = bamxVar.ap;
        ffbr ffbrVar33 = bamxVar.aq;
        ffbr ffbrVar34 = bamxVar.ar;
        ffbr ffbrVar35 = bamxVar.as;
        ffbr ffbrVar36 = bamxVar.at;
        ffbr ffbrVar37 = bamxVar.au;
        azei azeiVar = (azei) bamxVar.av.b();
        azeiVar.getClass();
        aqkp aqkpVar = (aqkp) bamxVar.aw.b();
        aqkpVar.getClass();
        asmg asmgVar = (asmg) bamxVar.ax.b();
        asmgVar.getClass();
        return new bamw(context, cqohVar, covrVar, cpdgVar, ffbrVar, bdxdVar, optional, cbvtVar, altkVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, ffbrVar6, ffbrVar7, albqVar, cubrVar, ffbrVar8, coxkVar, ffbrVar9, bdtdVar, covoVar, baamVar, covpVar, bbfwVar, cbgfVar, bdviVar, dtuuVar, baujVar, baimVar, bcwzVar, csrvVar, coxgVar, cbutVar, cncpVar, alkwVar, ffbrVar10, optional2, ffbrVar11, ffbrVar12, ffskVar, ffskVar2, ffhdVar, ffhdVar2, ffbrVar13, ffbrVar14, ffbrVar15, ffbrVar16, b2, ffbrVar17, ecrjVar, ffbrVar18, ffbrVar19, ffbrVar20, ffbrVar21, ffbrVar22, ffbrVar24, ffbrVar25, ffbrVar26, asltVar, ffbrVar27, ffbrVar28, ffbrVar29, ffbrVar30, ffbrVar31, ffbrVar32, ffbrVar33, ffbrVar34, ffbrVar35, ffbrVar36, ffbrVar37, azeiVar, aqkpVar, asmgVar, bamxVar.ay, bamxVar.az, bamxVar.aA, bamxVar.aB, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ProcessDownloadedMmsAction(ffbr ffbrVar, ffbr ffbrVar2, int i, String str, String[] strArr, String[] strArr2, Bundle bundle) {
        super(eogt.PROCESS_DOWNLOADED_MMS_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.t.p("downloaded_by_mms_api_or_lib", false);
        if (str != null) {
            this.t.v("cloud_sync_id", str);
        }
        this.t.w("attachments_types", strArr);
        this.t.w("attachments_values", strArr2);
        this.t.r("status", i);
        this.t.p("auto_download", bundle.getBoolean("auto_download"));
        this.t.r("status_if_failed", bundle.getInt("status_if_failed"));
    }

    public ProcessDownloadedMmsAction(ffbr ffbrVar, ffbr ffbrVar2, Parcel parcel) {
        super(parcel, eogt.PROCESS_DOWNLOADED_MMS_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    public ProcessDownloadedMmsAction(ffbr ffbrVar, ffbr ffbrVar2, MessageIdType messageIdType, ConversationIdType conversationIdType, String str, int i, int i2, String str2) {
        super(eogt.PROCESS_DOWNLOADED_MMS_ACTION);
        csix.l(messageIdType);
        csix.l(conversationIdType);
        csix.l(str);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.t.p("downloaded_by_mms_api_or_lib", false);
        this.t.v("message_id", messageIdType.b());
        this.t.r("status", 2);
        this.t.r("raw_status", 0);
        this.t.v("conversation_id", conversationIdType.a());
        this.t.v("participant_id", str);
        this.t.r("status_if_failed", i);
        this.t.r("sub_id", i2);
        this.t.v("transaction_id", str2);
    }

    public ProcessDownloadedMmsAction(ffbr ffbrVar, ffbr ffbrVar2, MessageIdType messageIdType, Uri uri, ConversationIdType conversationIdType, String str, Uri uri2, int i, String str2, int i2, boolean z, String str3, int i3) {
        super(eogt.PROCESS_DOWNLOADED_MMS_ACTION);
        csix.l(messageIdType);
        csix.l(uri);
        csix.l(conversationIdType);
        csix.l(str);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.t.p("downloaded_by_mms_api_or_lib", true);
        this.t.v("message_id", messageIdType.b());
        this.t.r("result_code", i3);
        this.t.t("notification_uri", uri);
        this.t.r("sub_id", i);
        this.t.v("sub_phone_number", str2);
        this.t.v("content_location", uri2.toString());
        this.t.p("auto_download", z);
        this.t.v("conversation_id", conversationIdType.a());
        this.t.v("participant_id", str);
        this.t.r("status_if_failed", i2);
        this.t.v("transaction_id", str3);
    }

    public ProcessDownloadedMmsAction(ffbr ffbrVar, ffbr ffbrVar2, MessageIdType messageIdType, String str, String str2, int i) {
        super(eogt.PROCESS_DOWNLOADED_MMS_ACTION);
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.t.v("message_id", messageIdType.b());
        this.t.v("transaction_id", str);
        this.t.v("content_location", str2);
        this.t.p("send_deferred_resp_status", true);
        this.t.r("sub_id", i);
    }
}
