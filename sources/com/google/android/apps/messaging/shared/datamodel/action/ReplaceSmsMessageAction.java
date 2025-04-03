package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.ContentValues;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.albq;
import defpackage.altk;
import defpackage.basc;
import defpackage.baue;
import defpackage.bbfz;
import defpackage.bdtd;
import defpackage.bdvi;
import defpackage.byzp;
import defpackage.covs;
import defpackage.cskc;
import defpackage.cubr;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.enru;
import defpackage.eogt;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReplaceSmsMessageAction extends Action<MessageCoreData> implements Parcelable {
    private final bdtd A;
    private final altk B;
    private final ffbr C;
    private final ffbr D;
    private final ffbr E;
    private final ffbr F;
    private final ffbr G;
    private final ffbr H;
    private final basc I;
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final bdvi d;
    public final byzp e;
    public final dtuu f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    private final Context l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final cubr q;
    private final albq y;
    private final covs z;
    private static final enru j = enru.c("com/google/android/apps/messaging/shared/datamodel/action/ReplaceSmsMessageAction");
    private static final cskc k = cskc.g("BugleDataModel", "ReplaceSmsMessageAction");
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new baue();

    /* compiled from: PG */
    public interface a {
        bbfz bp();
    }

    public ReplaceSmsMessageAction(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, cubr cubrVar, albq albqVar, covs covsVar, bdtd bdtdVar, altk altkVar, bdvi bdviVar, basc bascVar, byzp byzpVar, dtuu dtuuVar, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, Parcel parcel) {
        super(parcel, eogt.REPLACE_SMS_MESSAGE_ACTION);
        this.l = context;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.m = ffbrVar4;
        this.n = ffbrVar5;
        this.o = ffbrVar6;
        this.p = ffbrVar7;
        this.q = cubrVar;
        this.y = albqVar;
        this.z = covsVar;
        this.A = bdtdVar;
        this.B = altkVar;
        this.d = bdviVar;
        this.I = bascVar;
        this.e = byzpVar;
        this.f = dtuuVar;
        this.C = ffbrVar8;
        this.D = ffbrVar9;
        this.g = ffbrVar10;
        this.E = ffbrVar11;
        this.h = ffbrVar12;
        this.F = ffbrVar13;
        this.G = ffbrVar14;
        this.H = ffbrVar15;
        this.i = ffbrVar16;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ReplaceSmsMessageAction");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0229 A[Catch: all -> 0x03d3, TryCatch #0 {all -> 0x03d3, blocks: (B:3:0x000f, B:6:0x003a, B:8:0x0047, B:9:0x004c, B:11:0x0063, B:12:0x0071, B:14:0x0091, B:15:0x0094, B:110:0x00e2, B:20:0x00ee, B:24:0x00fb, B:26:0x0101, B:27:0x0106, B:30:0x012f, B:32:0x0158, B:33:0x01b3, B:35:0x01b9, B:37:0x01c7, B:39:0x01cf, B:40:0x01d9, B:42:0x01f9, B:44:0x01ff, B:51:0x0213, B:56:0x0229, B:57:0x0232, B:59:0x0239, B:60:0x0242, B:63:0x025e, B:65:0x0276, B:67:0x027d, B:70:0x028b, B:74:0x02f2, B:75:0x0335, B:78:0x035e, B:80:0x03c2, B:81:0x0391, B:94:0x03b8, B:93:0x03b5, B:97:0x025a, B:98:0x023e, B:99:0x022e, B:103:0x03b9, B:104:0x0180, B:105:0x012b, B:114:0x00e7, B:115:0x00ea, B:116:0x0036, B:89:0x03b0, B:107:0x00c2, B:109:0x00c8, B:72:0x02ec, B:82:0x02f6, B:84:0x0305, B:85:0x031d), top: B:2:0x000f, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0239 A[Catch: all -> 0x03d3, TryCatch #0 {all -> 0x03d3, blocks: (B:3:0x000f, B:6:0x003a, B:8:0x0047, B:9:0x004c, B:11:0x0063, B:12:0x0071, B:14:0x0091, B:15:0x0094, B:110:0x00e2, B:20:0x00ee, B:24:0x00fb, B:26:0x0101, B:27:0x0106, B:30:0x012f, B:32:0x0158, B:33:0x01b3, B:35:0x01b9, B:37:0x01c7, B:39:0x01cf, B:40:0x01d9, B:42:0x01f9, B:44:0x01ff, B:51:0x0213, B:56:0x0229, B:57:0x0232, B:59:0x0239, B:60:0x0242, B:63:0x025e, B:65:0x0276, B:67:0x027d, B:70:0x028b, B:74:0x02f2, B:75:0x0335, B:78:0x035e, B:80:0x03c2, B:81:0x0391, B:94:0x03b8, B:93:0x03b5, B:97:0x025a, B:98:0x023e, B:99:0x022e, B:103:0x03b9, B:104:0x0180, B:105:0x012b, B:114:0x00e7, B:115:0x00ea, B:116:0x0036, B:89:0x03b0, B:107:0x00c2, B:109:0x00c8, B:72:0x02ec, B:82:0x02f6, B:84:0x0305, B:85:0x031d), top: B:2:0x000f, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0276 A[Catch: all -> 0x03d3, TryCatch #0 {all -> 0x03d3, blocks: (B:3:0x000f, B:6:0x003a, B:8:0x0047, B:9:0x004c, B:11:0x0063, B:12:0x0071, B:14:0x0091, B:15:0x0094, B:110:0x00e2, B:20:0x00ee, B:24:0x00fb, B:26:0x0101, B:27:0x0106, B:30:0x012f, B:32:0x0158, B:33:0x01b3, B:35:0x01b9, B:37:0x01c7, B:39:0x01cf, B:40:0x01d9, B:42:0x01f9, B:44:0x01ff, B:51:0x0213, B:56:0x0229, B:57:0x0232, B:59:0x0239, B:60:0x0242, B:63:0x025e, B:65:0x0276, B:67:0x027d, B:70:0x028b, B:74:0x02f2, B:75:0x0335, B:78:0x035e, B:80:0x03c2, B:81:0x0391, B:94:0x03b8, B:93:0x03b5, B:97:0x025a, B:98:0x023e, B:99:0x022e, B:103:0x03b9, B:104:0x0180, B:105:0x012b, B:114:0x00e7, B:115:0x00ea, B:116:0x0036, B:89:0x03b0, B:107:0x00c2, B:109:0x00c8, B:72:0x02ec, B:82:0x02f6, B:84:0x0305, B:85:0x031d), top: B:2:0x000f, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x035e A[Catch: all -> 0x03d3, TRY_ENTER, TryCatch #0 {all -> 0x03d3, blocks: (B:3:0x000f, B:6:0x003a, B:8:0x0047, B:9:0x004c, B:11:0x0063, B:12:0x0071, B:14:0x0091, B:15:0x0094, B:110:0x00e2, B:20:0x00ee, B:24:0x00fb, B:26:0x0101, B:27:0x0106, B:30:0x012f, B:32:0x0158, B:33:0x01b3, B:35:0x01b9, B:37:0x01c7, B:39:0x01cf, B:40:0x01d9, B:42:0x01f9, B:44:0x01ff, B:51:0x0213, B:56:0x0229, B:57:0x0232, B:59:0x0239, B:60:0x0242, B:63:0x025e, B:65:0x0276, B:67:0x027d, B:70:0x028b, B:74:0x02f2, B:75:0x0335, B:78:0x035e, B:80:0x03c2, B:81:0x0391, B:94:0x03b8, B:93:0x03b5, B:97:0x025a, B:98:0x023e, B:99:0x022e, B:103:0x03b9, B:104:0x0180, B:105:0x012b, B:114:0x00e7, B:115:0x00ea, B:116:0x0036, B:89:0x03b0, B:107:0x00c2, B:109:0x00c8, B:72:0x02ec, B:82:0x02f6, B:84:0x0305, B:85:0x031d), top: B:2:0x000f, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0391 A[Catch: all -> 0x03d3, TRY_LEAVE, TryCatch #0 {all -> 0x03d3, blocks: (B:3:0x000f, B:6:0x003a, B:8:0x0047, B:9:0x004c, B:11:0x0063, B:12:0x0071, B:14:0x0091, B:15:0x0094, B:110:0x00e2, B:20:0x00ee, B:24:0x00fb, B:26:0x0101, B:27:0x0106, B:30:0x012f, B:32:0x0158, B:33:0x01b3, B:35:0x01b9, B:37:0x01c7, B:39:0x01cf, B:40:0x01d9, B:42:0x01f9, B:44:0x01ff, B:51:0x0213, B:56:0x0229, B:57:0x0232, B:59:0x0239, B:60:0x0242, B:63:0x025e, B:65:0x0276, B:67:0x027d, B:70:0x028b, B:74:0x02f2, B:75:0x0335, B:78:0x035e, B:80:0x03c2, B:81:0x0391, B:94:0x03b8, B:93:0x03b5, B:97:0x025a, B:98:0x023e, B:99:0x022e, B:103:0x03b9, B:104:0x0180, B:105:0x012b, B:114:0x00e7, B:115:0x00ea, B:116:0x0036, B:89:0x03b0, B:107:0x00c2, B:109:0x00c8, B:72:0x02ec, B:82:0x02f6, B:84:0x0305, B:85:0x031d), top: B:2:0x000f, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f6 A[Catch: all -> 0x03ae, TRY_ENTER, TryCatch #4 {all -> 0x03ae, blocks: (B:72:0x02ec, B:82:0x02f6, B:84:0x0305, B:85:0x031d), top: B:71:0x02ec, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0287 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025a A[Catch: all -> 0x03d3, TryCatch #0 {all -> 0x03d3, blocks: (B:3:0x000f, B:6:0x003a, B:8:0x0047, B:9:0x004c, B:11:0x0063, B:12:0x0071, B:14:0x0091, B:15:0x0094, B:110:0x00e2, B:20:0x00ee, B:24:0x00fb, B:26:0x0101, B:27:0x0106, B:30:0x012f, B:32:0x0158, B:33:0x01b3, B:35:0x01b9, B:37:0x01c7, B:39:0x01cf, B:40:0x01d9, B:42:0x01f9, B:44:0x01ff, B:51:0x0213, B:56:0x0229, B:57:0x0232, B:59:0x0239, B:60:0x0242, B:63:0x025e, B:65:0x0276, B:67:0x027d, B:70:0x028b, B:74:0x02f2, B:75:0x0335, B:78:0x035e, B:80:0x03c2, B:81:0x0391, B:94:0x03b8, B:93:0x03b5, B:97:0x025a, B:98:0x023e, B:99:0x022e, B:103:0x03b9, B:104:0x0180, B:105:0x012b, B:114:0x00e7, B:115:0x00ea, B:116:0x0036, B:89:0x03b0, B:107:0x00c2, B:109:0x00c8, B:72:0x02ec, B:82:0x02f6, B:84:0x0305, B:85:0x031d), top: B:2:0x000f, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023e A[Catch: all -> 0x03d3, TryCatch #0 {all -> 0x03d3, blocks: (B:3:0x000f, B:6:0x003a, B:8:0x0047, B:9:0x004c, B:11:0x0063, B:12:0x0071, B:14:0x0091, B:15:0x0094, B:110:0x00e2, B:20:0x00ee, B:24:0x00fb, B:26:0x0101, B:27:0x0106, B:30:0x012f, B:32:0x0158, B:33:0x01b3, B:35:0x01b9, B:37:0x01c7, B:39:0x01cf, B:40:0x01d9, B:42:0x01f9, B:44:0x01ff, B:51:0x0213, B:56:0x0229, B:57:0x0232, B:59:0x0239, B:60:0x0242, B:63:0x025e, B:65:0x0276, B:67:0x027d, B:70:0x028b, B:74:0x02f2, B:75:0x0335, B:78:0x035e, B:80:0x03c2, B:81:0x0391, B:94:0x03b8, B:93:0x03b5, B:97:0x025a, B:98:0x023e, B:99:0x022e, B:103:0x03b9, B:104:0x0180, B:105:0x012b, B:114:0x00e7, B:115:0x00ea, B:116:0x0036, B:89:0x03b0, B:107:0x00c2, B:109:0x00c8, B:72:0x02ec, B:82:0x02f6, B:84:0x0305, B:85:0x031d), top: B:2:0x000f, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022e A[Catch: all -> 0x03d3, TryCatch #0 {all -> 0x03d3, blocks: (B:3:0x000f, B:6:0x003a, B:8:0x0047, B:9:0x004c, B:11:0x0063, B:12:0x0071, B:14:0x0091, B:15:0x0094, B:110:0x00e2, B:20:0x00ee, B:24:0x00fb, B:26:0x0101, B:27:0x0106, B:30:0x012f, B:32:0x0158, B:33:0x01b3, B:35:0x01b9, B:37:0x01c7, B:39:0x01cf, B:40:0x01d9, B:42:0x01f9, B:44:0x01ff, B:51:0x0213, B:56:0x0229, B:57:0x0232, B:59:0x0239, B:60:0x0242, B:63:0x025e, B:65:0x0276, B:67:0x027d, B:70:0x028b, B:74:0x02f2, B:75:0x0335, B:78:0x035e, B:80:0x03c2, B:81:0x0391, B:94:0x03b8, B:93:0x03b5, B:97:0x025a, B:98:0x023e, B:99:0x022e, B:103:0x03b9, B:104:0x0180, B:105:0x012b, B:114:0x00e7, B:115:0x00ea, B:116:0x0036, B:89:0x03b0, B:107:0x00c2, B:109:0x00c8, B:72:0x02ec, B:82:0x02f6, B:84:0x0305, B:85:0x031d), top: B:2:0x000f, inners: #1, #2, #4 }] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ReplaceSmsMessageAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReplaceSmsMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ReplaceSmsMessageAction(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, cubr cubrVar, albq albqVar, covs covsVar, bdtd bdtdVar, altk altkVar, bdvi bdviVar, basc bascVar, byzp byzpVar, dtuu dtuuVar, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, String str, ContentValues contentValues, long j2) {
        super(eogt.REPLACE_SMS_MESSAGE_ACTION);
        this.l = context;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.m = ffbrVar4;
        this.n = ffbrVar5;
        this.o = ffbrVar6;
        this.p = ffbrVar7;
        this.q = cubrVar;
        this.y = albqVar;
        this.z = covsVar;
        this.A = bdtdVar;
        this.B = altkVar;
        this.d = bdviVar;
        this.I = bascVar;
        this.e = byzpVar;
        this.f = dtuuVar;
        this.C = ffbrVar8;
        this.D = ffbrVar9;
        this.g = ffbrVar10;
        this.E = ffbrVar11;
        this.h = ffbrVar12;
        this.F = ffbrVar13;
        this.G = ffbrVar14;
        this.H = ffbrVar15;
        this.i = ffbrVar16;
        this.t.t("message_values", contentValues);
        this.t.v("originating_address", str);
        this.t.s("message_logging_id", j2);
    }
}
