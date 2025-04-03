package com.google.android.apps.messaging.shared.datamodel.data;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.Formatter;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import defpackage.aoku;
import defpackage.aolr;
import defpackage.aquz;
import defpackage.aqvf;
import defpackage.awui;
import defpackage.axuh;
import defpackage.bcqk;
import defpackage.bcwp;
import defpackage.bcwq;
import defpackage.bcwz;
import defpackage.bcxb;
import defpackage.bcxc;
import defpackage.bcyy;
import defpackage.bdgr;
import defpackage.bdhg;
import defpackage.bdjs;
import defpackage.bdnn;
import defpackage.bdtd;
import defpackage.bdxf;
import defpackage.buoy;
import defpackage.buoz;
import defpackage.buuo;
import defpackage.buxr;
import defpackage.byzg;
import defpackage.byzi;
import defpackage.byzl;
import defpackage.byzp;
import defpackage.cbvv;
import defpackage.cfmh;
import defpackage.cfup;
import defpackage.cfvl;
import defpackage.cjhs;
import defpackage.cjia;
import defpackage.cjic;
import defpackage.cmjj;
import defpackage.cmlk;
import defpackage.cnbt;
import defpackage.cnmd;
import defpackage.cpdl;
import defpackage.cqoh;
import defpackage.cqtk;
import defpackage.csgg;
import defpackage.csix;
import defpackage.csrh;
import defpackage.csrv;
import defpackage.csux;
import defpackage.ctid;
import defpackage.cuxs;
import defpackage.cuxt;
import defpackage.dtub;
import defpackage.ecda;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.emxe;
import defpackage.emxf;
import defpackage.endq;
import defpackage.engr;
import defpackage.engw;
import defpackage.enou;
import defpackage.ensk;
import defpackage.ensz;
import defpackage.entd;
import defpackage.eohh;
import defpackage.eoxo;
import defpackage.fayv;
import defpackage.ffbr;
import defpackage.fjay;
import defpackage.le;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class MessageData implements MessageCoreData {
    public static final Parcelable.Creator<MessageCoreData> CREATOR;
    public static final entd a = entd.c("BugleDataModel");
    public static final long b;
    public static final long c;
    public static final cfup d;
    public static final cfup e;
    private String A;
    private final bcwq B;
    public final bcwz f;
    public final ffbr g;
    public final ffbr h;
    public final ArrayList i;
    public buoy j;
    public MessageUsageStatisticsData k;
    public cnbt l;
    public cnmd m;
    public cmjj n;
    public cmlk o;
    public eoxo p;
    public cjia q;
    public bdnn r;
    private final Context s;
    private final cqoh t;
    private final byzp u;
    private final ffbr v;
    private final ffbr w;
    private final ffbr x;
    private engw y;
    private engw z;

    /* compiled from: PG */
    public interface a {
        byzp bB();
    }

    static {
        long millis = TimeUnit.HOURS.toMillis(12L);
        b = millis;
        long millis2 = TimeUnit.HOURS.toMillis(24L);
        c = millis2;
        d = cfvl.a("zero_connectivity_message_sending_timeout_ms", millis);
        e = cfvl.a("rcs_resend_and_mark_send_failed_timeout_ms", millis2);
        String[] strArr = MessagesTable.a;
        CREATOR = new bcwp();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:6|7|(1:9)(1:50)|(1:11)(1:48)|12|(2:14|(15:16|17|18|19|(3:21|(1:23)|(10:25|26|(1:28)|29|(2:31|(5:33|34|(2:36|(1:38))|39|40))|42|34|(0)|39|40))|44|26|(0)|29|(0)|42|34|(0)|39|40))|47|17|18|19|(0)|44|26|(0)|29|(0)|42|34|(0)|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
    
        ((defpackage.cfyt) r7.a.b()).b(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0 A[Catch: Exception -> 0x00b3, TryCatch #0 {Exception -> 0x00b3, blocks: (B:19:0x009a, B:21:0x00a0, B:25:0x00a6), top: B:18:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MessageData(android.content.Context r2, defpackage.cqoh r3, defpackage.bcwz r4, defpackage.byzp r5, defpackage.ffbr r6, defpackage.cjic r7, defpackage.ffbr r8, android.os.Parcel r9, defpackage.ffbr r10, defpackage.ffbr r11, defpackage.ffbr r12, defpackage.bcwq r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.MessageData.<init>(android.content.Context, cqoh, bcwz, byzp, ffbr, cjic, ffbr, android.os.Parcel, ffbr, ffbr, ffbr, bcwq):void");
    }

    public static MessagePartCoreData H(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            if (messagePartCoreData.aZ()) {
                return messagePartCoreData;
            }
        }
        return null;
    }

    public static ecda X(int i) {
        if (i == -1) {
            return new ecda("UNKNOWN");
        }
        if (i == 0) {
            return new ecda("SMS");
        }
        if (i == 1) {
            return new ecda("MMS");
        }
        if (i == 2) {
            return new ecda("MMS PUSH");
        }
        if (i == 3) {
            return new ecda("RCS");
        }
        if (i == 4) {
            return new ecda("CLOUD SYNC");
        }
        if (i != 7) {
            return null;
        }
        return new ecda("SATELLITE");
    }

    public static String aF(MessageIdType messageIdType, int i, List list) {
        StringBuilder sb = new StringBuilder();
        if (!messageIdType.c()) {
            sb.append(messageIdType.b());
            sb.append("(");
            sb.append(ax(i));
            sb.append("): ");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append((MessagePartCoreData) it.next());
            sb.append(" ");
        }
        return sb.toString();
    }

    public static List aG(bcwz bcwzVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            return engw.r(bcwzVar.i(str));
        }
        int i = engw.d;
        return enou.a;
    }

    public static String aq(int i) {
        switch (i) {
            case 0:
                return "SMS";
            case 1:
                return "MMS";
            case 2:
                return "MMS Push Notification";
            case 3:
                return "RCS";
            case 4:
                return "Cloud Sync";
            case 5:
                return "Tombstone";
            case 6:
                return "EMP";
            case 7:
                return "SATELLITE";
            default:
                throw new IllegalArgumentException("Invalid Message Protocol");
        }
    }

    public static String ax(int i) {
        ecda X = X(i);
        if (X != null) {
            return X.a;
        }
        return null;
    }

    public static boolean cJ(int i) {
        return i >= 100 && i <= 117;
    }

    public static boolean cL(int i) {
        return cJ(i) || dj(i);
    }

    public static boolean cM(int i) {
        return i == 111 || i == 112 || i == 106 || i == 107 || i == 113 || i == 114 || i == 8 || i == 9 || i == 13 || i == 18 || i == 19 || i == 22 || i == 24 || i == 25;
    }

    public static boolean cQ(int i) {
        return i == 1 || i == 2;
    }

    public static boolean cT(int i) {
        return i > 0 && i <= 25;
    }

    public static boolean cU(int i) {
        return i == 8 || i == 9 || i == 13 || i == 18 || i == 19 || i == 22 || i == 24 || i == 25;
    }

    public static boolean cl(int i) {
        return i == 113 || i == 114;
    }

    public static boolean cn(List list) {
        return H(list) != null;
    }

    public static boolean cx(int i) {
        return i == 4;
    }

    public static boolean dg(int i) {
        return i == 0;
    }

    public static boolean dj(int i) {
        return i >= 200 && i <= 267;
    }

    public static int[] dm() {
        return new int[]{1, 2, 11, 15, 14};
    }

    public static int dp(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    private static List dq(bcwz bcwzVar, int i, String str) {
        emxf.a(cbvv.h(i));
        engr engrVar = new engr();
        if (cbvv.g(i)) {
            String b2 = cuxt.b(str, "");
            bcxb C = bcxc.C();
            bcqk bcqkVar = (bcqk) C;
            bcqkVar.b = b2;
            bcqkVar.c = "text/plain";
            C.o(eohh.TOMBSTONE_PART);
            engrVar.h(bcwzVar.c(C.r()));
        }
        return engrVar.g();
    }

    private static boolean dr(int i) {
        emxf.a(cbvv.h(i));
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 219:
            case 220:
            case 221:
            case 222:
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
            case 231:
            case 232:
            case 233:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
            case 239:
            case 240:
            case 241:
            case 242:
            case 243:
            case 244:
            case 245:
            case 246:
            case 247:
            case 248:
            case 249:
            case 250:
            case 251:
            case 252:
            case 253:
            case 254:
            case PrivateKeyType.INVALID /* 255 */:
            case 256:
            case 257:
            case 258:
            case 259:
            case 262:
            case 263:
            case 264:
            case 265:
                return true;
            case 217:
            case 218:
            case 260:
            case 261:
                return false;
            default:
                throw new IllegalStateException(String.format("Tombstone %d has unknown read status", Integer.valueOf(i)));
        }
    }

    private final String ds(int i) {
        int k;
        int k2 = k();
        if (!cbvv.h(k2) || (((k = k()) == 200 || k == 201) && this.z.isEmpty() && !this.i.isEmpty())) {
            return dn(i);
        }
        String dn = cbvv.g(k2) ? dn(i) : "";
        cbvv cbvvVar = (cbvv) this.w.b();
        engw engwVar = this.z;
        buoy buoyVar = this.j;
        return cbvvVar.d(engwVar, buoyVar.k, false, buoyVar.y, buoyVar.c, this.A, dn, this.s);
    }

    public static int e(int i) {
        emxf.a(cbvv.h(i));
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
            case 207:
            case 213:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
            case 220:
            case 221:
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
            case 231:
            case 233:
            case 234:
            case 235:
            case 237:
            case 238:
            case 240:
            case 241:
            case 242:
            case 264:
                return 3;
            case 204:
            case 208:
            case 252:
                return 1;
            case 205:
            case 206:
            case 209:
            case 214:
            case 222:
            case 236:
                return 0;
            case 210:
            case 211:
            case 212:
            case 232:
            case 243:
            case 244:
            case 245:
            case 251:
            case 254:
            case PrivateKeyType.INVALID /* 255 */:
            case 256:
            case 257:
            case 258:
            case 259:
            case 262:
            case 263:
            case 265:
                return 5;
            case 239:
            case 246:
            case 247:
            case 248:
            case 249:
            case 250:
            case 253:
                return 7;
            case 260:
            case 261:
                return 3;
            default:
                csix.c("Tombstone bugle status shouldn't be unknown");
                return -1;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final bdgr A() {
        return this.j.an;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessageIdType B() {
        return this.j.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessageIdType C() {
        return this.j.Y;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final bdhg D() {
        return this.j.R;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final bdhg E() {
        return this.j.C;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final bdnn F() {
        return this.r;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessagePartCoreData G() {
        return H(this.i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessagePartCoreData I() {
        for (MessagePartCoreData messagePartCoreData : this.i) {
            if (le.q(messagePartCoreData.V())) {
                return messagePartCoreData;
            }
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessagesTable.BindData J() {
        return this.j.a();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final buxr K() {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("getUpdateBuilderForMessage");
        buxrVar.n(this.j.b);
        buxrVar.M(this.j.c);
        buxrVar.N(this.j.d);
        buxrVar.K(this.j.y);
        buxrVar.O(this.j.g);
        buxrVar.A(this.j.h);
        buxrVar.G(this.j.i);
        buxrVar.v(this.j.m);
        buxrVar.F(this.j.n);
        buxrVar.z(this.j.j);
        buxrVar.U(this.j.k);
        buxrVar.S(this.j.o);
        buxrVar.a.put("sms_priority", Integer.valueOf(this.j.p));
        buxrVar.R(this.j.q);
        buxrVar.t(this.j.u);
        long j = this.j.v;
        int intValue = MessagesTable.g().intValue();
        int intValue2 = MessagesTable.g().intValue();
        if (intValue2 < 59890) {
            dtub.w("rcs_expiry", intValue2);
        }
        if (intValue >= 59890) {
            buxrVar.a.put("rcs_expiry", Long.valueOf(j));
        }
        dtub.u(buxrVar.a, "mms_subject", cuxs.a(this.j.r));
        buxrVar.u(this.j.s);
        dtub.u(buxrVar.a, "mms_content_location", this.j.t);
        buxrVar.B(this.j.x);
        buxrVar.I(this.j.A);
        buxrVar.E(this.j.C);
        buxrVar.C(this.j.D);
        buxrVar.q(this.j.G);
        String str = this.j.X;
        int intValue3 = MessagesTable.g().intValue();
        int intValue4 = MessagesTable.g().intValue();
        if (intValue4 < 48030) {
            dtub.w("group_private_participant", intValue4);
        }
        if (intValue3 >= 48030) {
            dtub.u(buxrVar.a, "group_private_participant", str);
        }
        buxrVar.L(this.j.Q);
        long j2 = this.j.U;
        int intValue5 = MessagesTable.g().intValue();
        int intValue6 = MessagesTable.g().intValue();
        if (intValue6 < 37030) {
            dtub.w("report_attempt_acounter", intValue6);
        }
        if (intValue5 >= 37030) {
            buxrVar.a.put("report_attempt_acounter", Long.valueOf(j2));
        }
        buxrVar.V(this.j.E);
        buxrVar.D(this.j.I);
        String str2 = this.j.H;
        int intValue7 = MessagesTable.g().intValue();
        int intValue8 = MessagesTable.g().intValue();
        if (intValue8 < 10002) {
            dtub.w("rcs_remote_instance", intValue8);
        }
        if (intValue7 >= 10002) {
            dtub.u(buxrVar.a, "rcs_remote_instance", str2);
        }
        buxrVar.P(this.j.J);
        buxrVar.Q(this.j.K);
        String str3 = this.j.O;
        int intValue9 = MessagesTable.g().intValue();
        int intValue10 = MessagesTable.g().intValue();
        if (intValue10 < 19020) {
            dtub.w("web_id", intValue10);
        }
        if (intValue9 >= 19020) {
            dtub.u(buxrVar.a, "web_id", str3);
        }
        buxrVar.p(this.j.V);
        buxrVar.H(this.j.ac);
        buxrVar.f(this.j.ag);
        buxrVar.h(this.j.ah);
        fjay fjayVar = this.j.ai;
        int intValue11 = MessagesTable.g().intValue();
        int intValue12 = MessagesTable.g().intValue();
        if (intValue12 < 58680) {
            dtub.w("trace_id", intValue12);
        }
        if (intValue11 >= 58680) {
            if (fjayVar == null) {
                buxrVar.a.putNull("trace_id");
            } else {
                buxrVar.a.put("trace_id", fjayVar.toByteArray());
            }
        }
        int i = this.j.am;
        int intValue13 = MessagesTable.g().intValue();
        int intValue14 = MessagesTable.g().intValue();
        if (intValue14 < 59430) {
            dtub.w("message_original_protocol", intValue14);
        }
        if (intValue13 >= 59430) {
            buxrVar.a.put("message_original_protocol", Integer.valueOf(i));
        }
        return buxrVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final byzg L() {
        return this.j.aj;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final byzg M() {
        return this.j.ak;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final byzi N() {
        return this.j.E;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final byzl O() {
        return this.j.al;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final cfmh P() {
        return this.j.ao;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final cjia Q() {
        return this.q;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final cmjj R() {
        return this.n;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final cmlk S() {
        return this.o;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final cnbt T() {
        return this.l;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final cnmd U() {
        return this.m;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final csgg V() {
        return this.j.ad;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final ecda W() {
        return X(d());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final engw Y() {
        return this.y;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final engw Z() {
        return this.z;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int a() {
        return this.j.ag;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aA() {
        return this.j.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aB() {
        return this.j.K;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aC() {
        return axuh.a(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aD() {
        cjia cjiaVar = this.q;
        boolean z = false;
        if (cjiaVar != null && cjiaVar.b == 103) {
            z = true;
        }
        emxf.p(z, "Required complete Google Photos sharing state, got %s", cjiaVar);
        String dn = dn(2);
        cjiaVar.getClass();
        String str = (cjiaVar.b == 103 ? (cjhs) cjiaVar.c : cjhs.a).c;
        return TextUtils.isEmpty(dn) ? str : defpackage.a.w(str, dn, "\n");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aE() {
        return this.j.O;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final List aH() {
        Stream filter = Collection.EL.stream(this.i).filter(new Predicate() { // from class: bcwj
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((MessagePartCoreData) obj).bm();
            }
        });
        int i = engw.d;
        return (List) filter.collect(endq.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final UUID aI() {
        return (UUID) this.j.ab.orElse(null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final fjay aJ() {
        return this.j.ai;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aK(String str, Object obj) {
        buoy buoyVar = this.j;
        if (buoyVar.aA == null) {
            buoyVar.aA = new HashMap();
        }
        buoyVar.aA.put(str, obj);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aL(MessagePartCoreData messagePartCoreData) {
        this.i.add(messagePartCoreData);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aM(MessagesTable.BindData bindData) {
        this.j = bindData.H();
        this.i.clear();
        int i = engw.d;
        this.z = enou.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aN(buuo buuoVar) {
        aM((MessagesTable.BindData) buuoVar.cO());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aO(SelfIdentityId selfIdentityId) {
        this.j.ae(((SelfIdentityIdImpl) selfIdentityId).a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aP(SelfIdentityId selfIdentityId) {
        this.j.ag(((SelfIdentityIdImpl) selfIdentityId).a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aQ(String str) {
        this.j.ag(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aR() {
        this.j = this.j.a().I();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aS() {
        this.j.T(-1L);
        this.j.A(0L);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aT() {
        buoy buoyVar = this.j;
        buoyVar.e(buoyVar.ag + 1);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aU(long j) {
        this.j.ai(j);
        this.j.Y(j);
        this.j.ao(25);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aV(long j, cqtk cqtkVar) {
        if (cqtk.DOWNLOAD.equals(cqtkVar)) {
            this.j.Y(j);
            this.j.ao(110);
        } else {
            this.j.ai(j);
            this.j.ao(12);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aW(long j, cqtk cqtkVar) {
        if (cqtk.DOWNLOAD.equals(cqtkVar)) {
            ba(j);
        } else {
            bk(j);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aX(Instant instant) {
        this.j.ai(instant.toEpochMilli());
        if (!cK()) {
            this.j.ao(7);
            return;
        }
        buoy buoyVar = this.j;
        int i = buoyVar.k;
        int i2 = 104;
        if (i != 105 && i != 104) {
            i2 = 102;
        }
        buoyVar.ao(i2);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aY(long j) {
        if (cK()) {
            this.j.Y(j);
            this.j.ao(110);
        } else {
            this.j.ai(j);
            this.j.ao(12);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aZ(long j) {
        if (!cK()) {
            this.j.ai(j);
            this.j.ao(1);
        } else {
            this.j.Y(j);
            this.j.ao(100);
            this.j.A(0L);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final fayv aa() {
        return this.j.V;
    }

    @Override // defpackage.bdou
    public final List ab() {
        return this.i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Instant ac() {
        return this.j.h;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Optional ad() {
        return this.j.ap;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Optional ae() {
        ekzz f = eleg.f("MessageData#getReceivingMsisdnMessagingIdentity");
        try {
            Optional flatMap = Optional.ofNullable(this.j.e).flatMap(new Function() { // from class: bcwn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    MessageData messageData = MessageData.this;
                    try {
                        return Optional.of(((avkc) messageData.h.b()).c((String) obj));
                    } catch (avkg e2) {
                        ensz enszVar = (ensz) ((ensz) MessageData.a.j()).g(e2);
                        enszVar.Y(csux.a, messageData.j.a.b());
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/data/MessageData", "getReceivingMsisdnMessagingIdentityInternal", 2281, "MessageData.java")).q("Failed to retrieve the receiving rcs msisdn");
                        return Optional.empty();
                    }
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final aolr aolrVar = (aolr) this.v.b();
            aolrVar.getClass();
            Optional map = flatMap.map(new Function() { // from class: bcwo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return aolr.this.b((awui) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            f.close();
            return map;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Optional af() {
        ekzz f = eleg.f("MessageData#getSelfIdentityChatEndpoint");
        try {
            Optional flatMap = cS() ? ag().flatMap(new Function() { // from class: bcwl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((aoku) obj).e();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }) : ae().flatMap(new Function() { // from class: bcwl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((aoku) obj).e();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            f.close();
            return flatMap;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Optional ag() {
        ekzz f = eleg.f("MessageData#getSenderMessagingIdentity");
        try {
            Optional of = this.j.d != null ? Optional.of(((aolr) this.v.b()).r(emxe.b(this.j.d))) : Optional.empty();
            f.close();
            return of;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ah() {
        return this.j.L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ai() {
        return this.j.B;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aj() {
        return this.j.W;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ak() {
        return this.j.M;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String al() {
        if (this.i.isEmpty()) {
            return null;
        }
        return this.i.size() == 1 ? ((MessagePartCoreData) this.i.get(0)).V() : "multipart/mixed";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String am() {
        return this.j.S;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String an() {
        return cK() ? "INCOMING" : "OUTGOING";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ao() {
        String string;
        csix.k(ci());
        MessagePartCoreData G = G();
        if (G == null) {
            return "";
        }
        Context context = this.s;
        String string2 = G.bo() ? context.getString(R.string.file_transfer_via_sms_image) : G.bD() ? context.getString(R.string.file_transfer_via_sms_video) : G.ba() ? context.getString(R.string.file_transfer_via_sms_audio) : G.bC() ? context.getString(R.string.file_transfer_via_sms_contact) : context.getString(R.string.file_transfer_via_sms_other);
        String formatShortFileSize = Formatter.formatShortFileSize(context, G.l());
        String d2 = le.d(G.V());
        if (TextUtils.isEmpty(d2)) {
            string = context.getString(R.string.file_transfer_via_sms_info_no_file_type, formatShortFileSize);
        } else {
            d2.getClass();
            string = context.getString(R.string.file_transfer_via_sms_info, formatShortFileSize, d2);
        }
        String string3 = context.getString(R.string.file_transfer_via_sms_expiry, ((csrh) this.x.b()).a(l()).toString());
        Uri u = G.u();
        u.getClass();
        return context.getString(R.string.file_transfer_via_sms_format, string2, u, string, string3);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ap() {
        return this.j.X;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ar() {
        return ds(2);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String as() {
        return dn(2);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String at() {
        return this.j.t;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String au() {
        return this.j.r;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String av() {
        return this.j.s;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aw() {
        return ax(d());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ay() {
        return ds(1);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String az() {
        return ds(3);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int b() {
        return this.j.p;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bA(Optional optional) {
        this.j.x(optional);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bB(boolean z) {
        this.j.X(z);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bC() {
        this.j.R(0);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bD(Uri uri) {
        this.j.am(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bE(MessageUsageStatisticsData messageUsageStatisticsData) {
        this.k = messageUsageStatisticsData;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bF(long j) {
        this.j.A(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bG(String str) {
        this.j.C(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bH(bdhg bdhgVar) {
        this.j.L(bdhgVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bI(byzg byzgVar) {
        this.j.M(byzgVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bJ(byzg byzgVar) {
        this.j.N(byzgVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bK(Instant instant) {
        this.j.P(instant);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bL(int i) {
        this.j.Q(i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bM(long j) {
        this.j.Y(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bN(aoku aokuVar) {
        aokuVar.e().filter(new Predicate() { // from class: bcwg
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                entd entdVar = MessageData.a;
                awuh b2 = awuh.b(((awui) obj).c);
                if (b2 == null) {
                    b2 = awuh.UNKNOWN_TYPE;
                }
                return b2.equals(awuh.PHONE);
            }
        }).ifPresentOrElse(new Consumer() { // from class: bcwh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                MessageData.this.j.E(((awui) obj).d);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: bcwi
            @Override // java.lang.Runnable
            public final void run() {
                entd entdVar = MessageData.a;
                throw new IllegalArgumentException("Receiving messaging identity doesn't have an RCS identifier");
            }
        });
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bO(cnmd cnmdVar) {
        this.m = cnmdVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bP(int i) {
        this.j.ab(i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bQ(aoku aokuVar) {
        this.j.ah(aokuVar.j());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bR(long j) {
        this.j.ai(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bS(int i) {
        this.j.aj(i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bT(String str) {
        this.j.ak(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bU(long j) {
        this.j.al(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bV(int i) {
        this.j.ao(i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bW(fjay fjayVar) {
        this.j.ap(fjayVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bX(long j) {
        this.j.aq(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bY(String str, List list) {
        this.A = str;
        this.z = engw.n(list);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bZ(MessagesTable.BindData bindData) {
        this.j = bindData.H();
    }

    public final void ba(long j) {
        this.j.Y(j);
        buoy buoyVar = this.j;
        if (buoyVar.k == 101) {
            buoyVar.ao(103);
        } else {
            buoyVar.ao(105);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bb(long j) {
        if (!cK()) {
            this.j.ai(j);
            this.j.Y(j);
            this.j.ao(8);
        } else {
            this.j.Y(j);
            buoy buoyVar = this.j;
            if (buoyVar.k == 105) {
                buoyVar.ao(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
            } else {
                buoyVar.ao(106);
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bc(long j) {
        int i = this.j.k;
        int[] iArr = {10, 4};
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                csix.c("Expected value to be one of " + Arrays.toString(iArr) + " but was " + i);
                break;
            }
            if (i == iArr[i2]) {
                break;
            } else {
                i2++;
            }
        }
        this.j.ai(j);
        this.j.ao(8);
        this.j.Q(10001);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bd(long j) {
        this.j.ai(j);
        this.j.Y(j);
        this.j.ao(9);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void be(long j) {
        if (cK()) {
            ba(j);
        } else {
            bk(j);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bf(long j) {
        this.j.ai(j);
        this.j.ao(7);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bg(long j) {
        this.j.ai(j);
        this.j.Y(j);
        this.j.ao(18);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bh() {
        this.j.ao(15);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bi(long j) {
        this.j.ao(6);
        this.j.ai(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bj(long j) {
        this.j.ai(j);
        this.j.ao(10);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bk(long j) {
        this.j.ao(5);
        this.j.ai(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bl(long j) {
        this.j.ai(j);
        this.j.ao(1);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bm(long j) {
        if (cK()) {
            this.j.Y(j);
            this.j.ao(111);
        } else {
            this.j.ai(j);
            this.j.ao(13);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bn() {
        this.j.e(0);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bo(bdnn bdnnVar) {
        this.r = bdnnVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bp(String str) {
        this.j.h(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bq(String str) {
        this.j.i(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void br(csgg csggVar) {
        this.j.l(csggVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bs(fayv fayvVar) {
        this.j.q(fayvVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bt(UUID uuid) {
        this.j.r(Optional.ofNullable(uuid));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bu(cfmh cfmhVar) {
        this.j.s(cfmhVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bv(eoxo eoxoVar) {
        this.p = eoxoVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bw(cjia cjiaVar) {
        this.q = cjiaVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bx(boolean z) {
        this.j.w(z);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void by() {
        this.j.R(2);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bz(boolean z) {
        this.j.H(z);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int c() {
        return this.i.size();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cA() {
        return this.j.j == 6;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cB() {
        return g() != 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cC() {
        return da() && c() > 0 && Collection.EL.stream(this.i).anyMatch(new Predicate() { // from class: bcwe
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((MessagePartCoreData) obj).bi();
            }
        });
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cD() {
        return cM(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cE() {
        MessagePartCoreData G = G();
        return G != null && G.bp();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cF() {
        return this.j.G;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cG(long j) {
        return j - this.j.A < TimeUnit.MINUTES.toMillis(((Long) this.B.a.b()).longValue());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cH(long j) {
        return j - this.j.A < (cX() ? (Long) e.e() : (Long) d.e()).longValue();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cI() {
        return cJ(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cK() {
        return cL(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cN() {
        return this.j.m;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cO() {
        return this.j.n;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cP() {
        return cQ(this.j.j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cR() {
        return this.j.j == 2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cS() {
        return cT(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cV() {
        int i = this.j.k;
        return i == 104 || i == 102;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cW() {
        int i = this.j.k;
        return i == 4 || i == 7;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cX() {
        return bdjs.C(this.j.j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cY() {
        return cX() && cm() && !cE();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cZ() {
        buoy buoyVar = this.j;
        if (buoyVar.j == 3 || !buoyVar.C.k()) {
            return false;
        }
        buoy buoyVar2 = this.j;
        return buoyVar2.k != 15 && buoyVar2.ah;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void ca(String str) {
        this.j.as(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void cb(byzl byzlVar) {
        this.j.at(byzlVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void cc() {
        csix.a(d(), 0);
        csix.f(cK());
        for (MessagePartCoreData messagePartCoreData : this.i) {
            if (messagePartCoreData.bA()) {
                messagePartCoreData.aN(this.s);
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void cd(MessageIdType messageIdType) {
        csix.k(!messageIdType.c());
        csix.k(this.j.a.c());
        this.j.v(messageIdType);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void ce(bdhg bdhgVar) {
        csix.k(this.j.C.i());
        this.j.U(bdhgVar);
        if (this.j.R.i()) {
            this.j.L(bdhgVar);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void cf(ConversationIdType conversationIdType, Uri uri, long j) {
        this.j.m(conversationIdType);
        this.j.am(uri);
        this.j.X(true);
        this.j.H(true);
        this.j.Y(j);
        this.j.ai(j);
        this.j.ao(4);
        this.j.ac(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void cg() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((MessagePartCoreData) it.next()).ai();
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean ch() {
        if (ctid.h(this.s)) {
            return false;
        }
        int i = this.j.k;
        return i == 102 || i == 104;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean ci() {
        if (!cX() && !df()) {
            return false;
        }
        if (cE()) {
            return true;
        }
        if (!cm()) {
            ensk n = a.n();
            n.Y(csux.a, this.j.a.b());
            ((ensz) n.h("com/google/android/apps/messaging/shared/datamodel/data/MessageData", "canFallbackViaSms", 2706, "MessageData.java")).q("fallback to sms not allowed without attachments");
            return false;
        }
        if (this.j.u > 0) {
            if (this.t.f().toEpochMilli() >= this.j.u + cpdl.a()) {
                ensk n2 = a.n();
                n2.Y(csux.a, this.j.a.b());
                ((ensz) n2.h("com/google/android/apps/messaging/shared/datamodel/data/MessageData", "canFallbackViaSms", 2713, "MessageData.java")).q("fallback to sms not allowed because of expiry");
                return false;
            }
        }
        if (cB() || cp()) {
            return true;
        }
        ensk n3 = a.n();
        n3.Y(csux.a, this.j.a.b());
        ((ensz) n3.h("com/google/android/apps/messaging/shared/datamodel/data/MessageData", "canFallbackViaSms", 2725, "MessageData.java")).q("fallback to sms not allowed due to absent uri");
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cj() {
        if (ctid.h(this.s)) {
            return false;
        }
        int i = this.j.k;
        if (i == 106 || i == 101 || i == 115 || i == 112 || i == 110) {
            return true;
        }
        return bdjs.i(i) && ((csrv) this.g.b()).q();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean ck() {
        int i = this.j.k;
        return i == 4 || i == 7;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cm() {
        return cn(this.i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean co() {
        if (!TextUtils.isEmpty(this.j.r) || cbvv.h(this.j.k) || this.m != null) {
            return true;
        }
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) arrayList.get(i);
            if (messagePartCoreData.aZ()) {
                return true;
            }
            i++;
            if (!TextUtils.isEmpty(messagePartCoreData.ae())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cp() {
        MessagePartCoreData G = G();
        return (G == null || G.u() == null) ? false : true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cq() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            boolean bt = ((MessagePartCoreData) arrayList.get(i)).bt();
            i++;
            if (bt) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cr() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            boolean by = ((MessagePartCoreData) arrayList.get(i)).by();
            i++;
            if (by) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cs() {
        int i = this.j.k;
        return i == 105 || i == 104;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean ct() {
        return this.j.k == 115;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cu() {
        return this.j.k == 10;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cv() {
        return this.j.ah;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cw() {
        return cx(this.j.j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cy() {
        return bdjs.k(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cz() {
        int i = this.j.k;
        return i == 105 || i == 103;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int d() {
        return this.j.j;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean da() {
        return this.j.j == 7;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean db() {
        return this.j.k == 16;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean dc() {
        return bcyy.j(this.z, this.j.c);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean dd() {
        int i = this.j.k;
        return i == 5 || i == 6;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean de() {
        return bdjs.y(this.j.k);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean df() {
        return dg(this.j.j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean dh() {
        return df() && cm() && !cE() && this.q == null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean di() {
        return dj(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean dk() {
        return this.j.k == 4;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final byte[] dl() {
        return this.j.T;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String dn(int i) {
        int i2;
        int i3;
        String property = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        boolean z = false;
        while (i2 < size) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) arrayList.get(i2);
            z |= messagePartCoreData.bh();
            if (messagePartCoreData.bt()) {
                i3 = 3;
                i2 = i != 3 ? i2 + 1 : 0;
            } else {
                i3 = i;
            }
            if (messagePartCoreData.aX()) {
                String W = i3 == 2 ? messagePartCoreData.W() : messagePartCoreData.ae();
                if (!TextUtils.isEmpty(W)) {
                    if (sb.length() > 0) {
                        sb.append(property);
                    }
                    sb.append(W);
                }
            }
        }
        return (TextUtils.isEmpty(sb) && z) ? bdxf.a(this.s, this.i) : sb.toString();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    /* renamed from: do, reason: not valid java name */
    public final void mo253do() {
        this.j.S(-1L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageData) {
            return Objects.equals(this.j.a, ((MessageData) obj).j.a);
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int f() {
        return this.j.x;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int g() {
        return this.j.D;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int h() {
        return this.j.l;
    }

    public final int hashCode() {
        MessageIdType messageIdType = this.j.a;
        if (messageIdType != null) {
            return messageIdType.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int i() {
        return this.j.ac;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int j() {
        return this.j.J;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int k() {
        return this.j.k;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long l() {
        return this.j.u;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long m() {
        return this.j.v;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long n() {
        return this.j.I;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long o() {
        return this.j.i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long p() {
        return this.j.A;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long q() {
        return this.j.Q;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long r() {
        return this.j.g;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long s() {
        return this.j.q;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long t() {
        return this.j.P;
    }

    public final String toString() {
        buoy buoyVar = this.j;
        return aF(buoyVar.a, buoyVar.j, this.i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Uri u() {
        return this.j.o;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final SelfIdentityId v() {
        return aqvf.c(this.j.y);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final awui w() {
        ekzz f = eleg.f("MessageData#getSelfIdentityChatEndpointOrThrow");
        try {
            awui awuiVar = (awui) af().orElseThrow(new Supplier() { // from class: bcwf
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new bcwr();
                }
            });
            f.close();
            return awuiVar;
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
        this.j.a().writeToParcel(parcel, i);
        parcel.writeInt(this.i.size());
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((MessagePartCoreData) arrayList.get(i2), i);
        }
        parcel.writeParcelable(this.k, i);
        cnbt cnbtVar = this.l;
        parcel.writeByteArray(cnbtVar != null ? cnbtVar.a.toByteArray() : null);
        cnmd cnmdVar = this.m;
        parcel.getClass();
        parcel.writeByteArray(cnmdVar != null ? cnmdVar.a.toByteArray() : null);
        cjia cjiaVar = this.q;
        parcel.getClass();
        parcel.writeByteArray(cjiaVar != null ? cjiaVar.toByteArray() : null);
        bdnn bdnnVar = this.r;
        parcel.writeString(bdnnVar == null ? null : bdnnVar.a);
        cmlk cmlkVar = this.o;
        parcel.getClass();
        parcel.writeByteArray(cmlkVar != null ? cmlkVar.a.toByteArray() : null);
        cmjj cmjjVar = this.n;
        parcel.getClass();
        parcel.writeByteArray(cmjjVar != null ? cmjjVar.a.toByteArray() : null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessageCoreData x() {
        MessageCoreData a2 = this.u.a();
        MessageData messageData = (MessageData) a2;
        messageData.j = this.j.a().H();
        messageData.k = this.k.e();
        cnmd cnmdVar = this.m;
        messageData.m = cnmdVar != null ? new cnmd(cnmdVar.a) : null;
        bdnn bdnnVar = this.r;
        messageData.r = bdnnVar != null ? new bdnn(bdnnVar.a) : null;
        messageData.bA(Optional.of(UUID.randomUUID()));
        return a2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessageUsageStatisticsData y() {
        return this.k;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final ConversationIdType z() {
        return this.j.b;
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar) {
        this.i = new ArrayList();
        int i = engw.d;
        engw engwVar = enou.a;
        this.y = engwVar;
        this.z = engwVar;
        this.s = context;
        this.t = cqohVar;
        this.f = bcwzVar;
        this.u = byzpVar;
        this.g = ffbrVar;
        this.v = ffbrVar2;
        this.h = ffbrVar3;
        this.w = ffbrVar4;
        this.x = ffbrVar5;
        this.B = bcwqVar;
        String[] strArr = MessagesTable.a;
        buoz buozVar = new buoz();
        this.j = buozVar;
        buozVar.an(129);
        this.j.aj(-1);
        this.j.ak(null);
        this.j.T(-1L);
        this.j.af(1L);
        this.k = new MessageUsageStatisticsDataImpl();
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, int i, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, conversationIdType, aquz.b(selfIdentityId), selfIdentityId, 3, i, aG(bcwzVar, str), (UUID) null);
        if (i != 0) {
            if (i == 1) {
                this.j.C(null);
                this.j.an(129);
            } else {
                if (i == 3 || i == 6 || i == 7) {
                    return;
                }
                throw new IllegalArgumentException("Unsupported message type: " + i + ", " + ax(i));
            }
        }
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, Uri uri, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, String str2, String str3, long j, long j2, boolean z, boolean z2, long j3) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, cjicVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, conversationIdType, str, selfIdentityId, 100, 0, aG(bcwzVar, str2), j2, j, z, z2);
        buoy buoyVar = this.j;
        buoyVar.am(uri);
        buoyVar.C(str3);
        this.j.aq(j3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MessageData(android.content.Context r19, defpackage.cqoh r20, defpackage.bcwz r21, defpackage.byzp r22, defpackage.ffbr r23, defpackage.cjic r24, defpackage.ffbr r25, defpackage.ffbr r26, defpackage.ffbr r27, defpackage.ffbr r28, defpackage.bcwq r29, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r30, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r31, defpackage.awui r32, java.lang.String r33, java.lang.String r34, java.util.UUID r35) {
        /*
            r18 = this;
            java.lang.String r12 = defpackage.aquz.b(r31)
            int r0 = defpackage.engw.d
            r15 = 3
            engw r16 = defpackage.enou.a
            r14 = 3
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r13 = r31
            r17 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = android.text.TextUtils.isEmpty(r33)
            if (r1 != 0) goto Lbd
            int r1 = r34.hashCode()
            r2 = 622719353(0x251df179, float:1.3699393E-16)
            java.lang.String r4 = "application/vnd.gsma.botsuggestion.response.v1.0+json"
            r5 = 1
            if (r1 == r2) goto L4f
            r2 = 817335912(0x30b78e68, float:1.3355477E-9)
            if (r1 == r2) goto L43
            r2 = r34
            goto L59
        L43:
            java.lang.String r1 = "text/plain"
            r2 = r34
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L59
            r1 = 0
            goto L5a
        L4f:
            r2 = r34
            boolean r1 = r2.equals(r4)
            if (r1 == 0) goto L59
            r1 = r5
            goto L5a
        L59:
            r1 = -1
        L5a:
            if (r1 == 0) goto Lb2
            if (r1 != r5) goto La6
            bcxb r1 = defpackage.bcxc.C()
            r2 = r1
            bcqk r2 = (defpackage.bcqk) r2
            r6 = r33
            r2.b = r6
            r2.c = r4
            eohh r2 = defpackage.eohh.SUGGESTED_REPLY_RESPONSE
            r1.o(r2)
            bcxc r1 = r1.r()
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r1 = r3.c(r1)
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse r2 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseDeserializer.deserializeFromJson(r6)
            if (r2 == 0) goto L93
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse$ConversationSuggestionResponseType r2 = r2.type
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse$ConversationSuggestionResponseType r3 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse.ConversationSuggestionResponseType.ACTION
            if (r2 != r3) goto L93
            eohh r2 = defpackage.eohh.SUGGESTED_ACTION_RESPONSE
            if (r2 != 0) goto L8a
            eohh r2 = defpackage.eohh.UNKNOWN
        L8a:
            bvwp r3 = r1.f
            int r2 = r2.a()
            r3.T(r2)
        L93:
            java.util.ArrayList r2 = r0.i
            r2.add(r1)
            eohh r1 = r1.N()
            eohh r2 = defpackage.eohh.SUGGESTED_ACTION_RESPONSE
            if (r1 != r2) goto Lbd
            buoy r1 = r0.j
            r1.w(r5)
            goto Lbd
        La6:
            java.lang.String r1 = "Unsupported content type: "
            java.lang.String r1 = r1.concat(r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        Lb2:
            r6 = r33
            java.util.ArrayList r1 = r0.i
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r2 = r3.i(r6)
            r1.add(r2)
        Lbd:
            buoy r1 = r0.j
            r2 = r32
            java.lang.String r2 = r2.d
            r1.ah(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.MessageData.<init>(android.content.Context, cqoh, bcwz, byzp, ffbr, cjic, ffbr, ffbr, ffbr, ffbr, bcwq, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, awui, java.lang.String, java.lang.String, java.util.UUID):void");
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, MessageCoreData messageCoreData) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, conversationIdType, ((SelfIdentityIdImpl) selfIdentityId).a, selfIdentityId, 3, -1, messageCoreData.ab(), (UUID) null);
        if (!TextUtils.isEmpty(messageCoreData.aA())) {
            this.j.ag(messageCoreData.aA());
        }
        if (TextUtils.isEmpty(messageCoreData.au())) {
            return;
        }
        this.j.C(messageCoreData.au());
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, awui awuiVar) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, conversationIdType, aquz.b(selfIdentityId), selfIdentityId, 3, 0, aG(bcwzVar, str), (UUID) null);
        this.j.ah(awuiVar.d);
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, String str2, boolean z) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, conversationIdType, aquz.b(selfIdentityId), selfIdentityId, 3, 1, aG(bcwzVar, str), (UUID) null);
        this.j.C(str2);
        this.j.an(true != z ? 129 : 130);
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, ConversationIdType conversationIdType, String str, String str2, UUID uuid) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, conversationIdType, (String) null, (SelfIdentityId) null, 3, 1, aG(bcwzVar, str), uuid);
        this.j.C(str2);
        this.j.an(129);
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, int i, int i2, List list, long j, long j2, boolean z, boolean z2) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, conversationIdType, str, selfIdentityId, i, i2, list, (UUID) null);
        buoy buoyVar = this.j;
        buoyVar.Y(j);
        buoyVar.ai(j2);
        buoyVar.H(z);
        buoyVar.X(z2);
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, int i, int i2, List list, UUID uuid) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar);
        long epochMilli = cqohVar.f().toEpochMilli();
        buoy buoyVar = this.j;
        buoyVar.m(conversationIdType);
        buoyVar.ag(TextUtils.isEmpty(str) ? aquz.b(selfIdentityId) : str);
        buoyVar.ae(aquz.a(selfIdentityId));
        buoyVar.ao(i);
        buoyVar.O(i2);
        buoyVar.Y(epochMilli);
        buoyVar.r(Optional.ofNullable(uuid));
        buoyVar.ai(epochMilli);
        if ((i2 == 0 || i2 == 1) && (i == 3 || i == 4)) {
            this.j.at(byzl.TRANSPORT_NOT_SELECTED);
        }
        this.i.addAll(list);
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, bdhg bdhgVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, int i2, String str2, long j, boolean z, boolean z2, long j2, long j3) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, cjicVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, conversationIdType, str, selfIdentityId, i, 3, aG(bcwzVar, str2), j3, j2, z, z2);
        buoy buoyVar = this.j;
        buoyVar.U(bdhgVar);
        buoyVar.L(bdhgVar);
        buoyVar.V(null);
        buoyVar.al(j);
        buoyVar.y(i2);
        buoyVar.A(Long.MAX_VALUE);
        buoyVar.Q(128);
        if (i == 104 || i == 6) {
            this.j.ac(j3);
        }
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, MessagesTable.BindData bindData, List list) {
        this.i = new ArrayList();
        int i = engw.d;
        engw engwVar = enou.a;
        this.y = engwVar;
        this.z = engwVar;
        this.s = context;
        this.t = cqohVar;
        this.f = bcwzVar;
        this.u = byzpVar;
        this.g = ffbrVar;
        this.v = ffbrVar2;
        this.h = ffbrVar3;
        this.w = ffbrVar4;
        this.x = ffbrVar5;
        this.B = bcwqVar;
        this.j = bindData.H();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.i.add(bcwzVar.e((PartsTable.BindData) it.next()));
        }
        this.k = new MessageUsageStatisticsDataImpl();
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, String str) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar);
        this.j.ao(3);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.i.add(bcwzVar.i(str));
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, String str, long j, long j2, bdhg bdhgVar, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, long j3, long j4, String str3, String str4) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, cjicVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, bdhgVar, str2, selfIdentityId, conversationIdType, i, 1, (String) null, j, z, false, j3, j4);
        this.j.T(-1L);
        this.j.A(j2);
        bcxb C = bcxc.C();
        bcqk bcqkVar = (bcqk) C;
        bcqkVar.c = str;
        C.p(j);
        bcqkVar.j = str3;
        if (str4 != null) {
            bcqkVar.k = str4;
        }
        this.i.add(bcwzVar.c(C.r()));
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, String str2) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, cjicVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, conversationIdType, str, selfIdentityId, i, e(i), dq(bcwzVar, i, str2), j, j, true, dr(i));
        buoy buoyVar = this.j;
        buoyVar.A(Long.MAX_VALUE);
        buoyVar.Q(128);
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, String str, ConversationIdType conversationIdType, String str2, SelfIdentityId selfIdentityId, String str3, String str4, long j, long j2, boolean z, boolean z2, int i, String str5) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, cjicVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, conversationIdType, str2, selfIdentityId, i, 4, aG(bcwzVar, str3), j2, j, z, z2);
        buoy buoyVar = this.j;
        buoyVar.h(str);
        buoyVar.C(str4);
        buoyVar.n(str5);
        buoyVar.B(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MessageData(android.content.Context r25, defpackage.cqoh r26, defpackage.bcwz r27, defpackage.byzp r28, defpackage.ffbr r29, defpackage.cjic r30, defpackage.ffbr r31, defpackage.ffbr r32, defpackage.ffbr r33, defpackage.ffbr r34, defpackage.bcwq r35, java.lang.String r36, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r37, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r38, int r39, long r40, long r42, defpackage.cntb r44, defpackage.bdgr r45) {
        /*
            r24 = this;
            bcxb r0 = defpackage.bcxc.C()
            byte[] r1 = r44.toByteArray()
            r2 = 3
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
            r1.getClass()
            r2 = r0
            bcqk r2 = (defpackage.bcqk) r2
            r2.b = r1
            java.lang.String r1 = "application/x-end-of-emergency-proto"
            r2.c = r1
            eohh r1 = defpackage.eohh.TEXT_PART
            r0.o(r1)
            bcxc r0 = r0.r()
            r3 = r27
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r0 = r3.c(r0)
            engw r17 = defpackage.engw.r(r0)
            r22 = 1
            r23 = 1
            r16 = 7
            r0 = r24
            r1 = r25
            r2 = r26
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r13 = r36
            r14 = r37
            r12 = r38
            r15 = r39
            r20 = r40
            r18 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r23)
            buoy r1 = r0.j
            r2 = 0
            r1.am(r2)
            buoy r1 = r0.j
            r2 = r45
            r1.ad(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.MessageData.<init>(android.content.Context, cqoh, bcwz, byzp, ffbr, cjic, ffbr, ffbr, ffbr, ffbr, bcwq, java.lang.String, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, int, long, long, cntb, bdgr):void");
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str3) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, cjicVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, conversationIdType, str2, selfIdentityId, i, 0, aG(bcwzVar, str3), j2, j, z, z2);
        this.j.am(str == null ? null : Uri.parse(str));
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str2, bdgr bdgrVar) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, cjicVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, conversationIdType, str, selfIdentityId, i, 7, aG(bcwzVar, str2), j2, j, z, z2);
        this.j.am(null);
        if (bdgrVar != null) {
            this.j.ad(bdgrVar);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bcwq bcwqVar, String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, boolean z, int i, String str3, String str4, int i2, String str5, boolean z2, boolean z3, long j, int i3, long j2, long j3, long j4, String str6, byzi byziVar, long j5) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, cjicVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, bcwqVar, conversationIdType, str2, selfIdentityId, i, true == z ? 2 : 1, enou.a, j4, j3, z2, z3);
        int i4 = engw.d;
        buoy buoyVar = this.j;
        buoyVar.z(str3);
        buoyVar.D(str4);
        buoyVar.am(str == null ? null : Uri.parse(str));
        buoyVar.an(i2);
        buoyVar.al(j);
        buoyVar.C(str5);
        buoyVar.A(j2);
        buoyVar.Q(i3);
        buoyVar.B(str6);
        buoyVar.ar(byziVar);
        buoyVar.aq(j5);
        if (i == 104 || i == 6) {
            this.j.ac(j4);
        }
    }

    public MessageData(Context context, cqoh cqohVar, bcwz bcwzVar, byzp byzpVar, ffbr ffbrVar, cjic cjicVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, bcwq bcwqVar, ConversationIdType conversationIdType, int i, long j) {
        this(context, cqohVar, bcwzVar, byzpVar, ffbrVar, cjicVar, ffbrVar2, ffbrVar4, ffbrVar5, ffbrVar6, bcwqVar, conversationIdType, ((SelfIdentityIdImpl) ((bdtd) ffbrVar3.b()).e().g()).a, ((bdtd) ffbrVar3.b()).e().g(), i, e(i), dq(bcwzVar, i, null), j, j, true, dr(i));
        buoy buoyVar = this.j;
        buoyVar.A(Long.MAX_VALUE);
        buoyVar.Q(128);
    }
}
