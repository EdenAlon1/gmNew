package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.altk;
import defpackage.baam;
import defpackage.bath;
import defpackage.bbel;
import defpackage.bbfu;
import defpackage.bbfw;
import defpackage.bcwz;
import defpackage.bdtd;
import defpackage.bdvi;
import defpackage.buuo;
import defpackage.buxo;
import defpackage.byzp;
import defpackage.cerb;
import defpackage.covs;
import defpackage.coxk;
import defpackage.cqoh;
import defpackage.csix;
import defpackage.cskc;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.enru;
import defpackage.eogt;
import defpackage.ffbr;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReceiveWapPushSiMessageAction extends Action<MessageCoreData> implements Parcelable {
    private final bbfw A;
    private final dtuu B;
    private final ffbr C;
    private final ffbr D;
    private final ffbr E;
    private final cerb F;
    private final ffbr G;
    private final ffbr H;
    private final ffbr I;
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final baam d;
    public final bdvi e;
    public final byzp f;
    public final bcwz g;
    public final ffbr h;
    private final Context k;
    private final cqoh l;
    private final covs m;
    private final altk n;
    private final coxk o;
    private final ffbr p;
    private final ffbr q;
    private final bdtd y;
    private final bbel z;
    private static final cskc i = cskc.g("BugleDataModel", "ReceiveWapPushSiMessageAction");
    private static final enru j = enru.c("com/google/android/apps/messaging/shared/datamodel/action/ReceiveWapPushSiMessageAction");
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new bath();

    /* compiled from: PG */
    public interface a {
        bbfu bl();
    }

    public ReceiveWapPushSiMessageAction(Context context, ffbr ffbrVar, cqoh cqohVar, covs covsVar, altk altkVar, coxk coxkVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bdtd bdtdVar, baam baamVar, bbel bbelVar, bdvi bdviVar, bbfw bbfwVar, byzp byzpVar, bcwz bcwzVar, dtuu dtuuVar, ffbr ffbrVar6, cerb cerbVar, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, int i2, byte[] bArr, long j2) {
        super(eogt.RECEIVE_WAP_PUSH_SI_MESSAGE_ACTION);
        this.A = bbfwVar;
        this.B = dtuuVar;
        this.C = ffbrVar6;
        this.D = ffbrVar7;
        this.E = ffbrVar8;
        this.t.r("sub_id", i2);
        this.t.q("push_data", bArr);
        this.t.s("message_logging_id", j2);
        this.k = context;
        this.a = ffbrVar;
        this.l = cqohVar;
        this.m = covsVar;
        this.n = altkVar;
        this.o = coxkVar;
        this.b = ffbrVar2;
        this.p = ffbrVar3;
        this.c = ffbrVar4;
        this.q = ffbrVar5;
        this.y = bdtdVar;
        this.d = baamVar;
        this.z = bbelVar;
        this.e = bdviVar;
        this.f = byzpVar;
        this.g = bcwzVar;
        this.F = cerbVar;
        this.h = ffbrVar9;
        this.G = ffbrVar10;
        this.H = ffbrVar11;
        this.I = ffbrVar12;
    }

    private final MessageCoreData h(final String str) {
        MessageCoreData messageCoreData;
        ekzz f = eleg.f("ReceiveWapPushSiMessageAction#readWapPushSiMessageData");
        try {
            csix.h();
            buxo d = MessagesTable.d();
            d.z("readWapPushSiMessageData");
            d.h(new Function() { // from class: batd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar = (buxz) obj;
                    buxzVar.aq(new dtrt("messages.mms_transaction_id", 1, String.valueOf(str)));
                    return buxzVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            MessagesTable.BindData bindData = (MessagesTable.BindData) ((buuo) d.b().o()).cS();
            if (bindData != null) {
                messageCoreData = this.f.a();
                messageCoreData.aM(bindData);
            } else {
                messageCoreData = null;
            }
            f.close();
            return messageCoreData;
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
    public final ekzz a() {
        return eleg.f("ReceiveWapPushSiMessageAction");
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0302, code lost:
    
        if (r3 != 0) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0305, code lost:
    
        if (r12 != 1) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x030b, code lost:
    
        if (r4.g > r4.e) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x030d, code lost:
    
        r2 = r4.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02cc, code lost:
    
        if (r8 != r4.e) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x02cf, code lost:
    
        r2 = r2.toString();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:215:0x010b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:283:0x0124. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0322 A[Catch: all -> 0x074f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x074f, blocks: (B:3:0x0007, B:14:0x0322, B:36:0x044a, B:40:0x0455, B:46:0x046f, B:52:0x04a4, B:60:0x04c8, B:62:0x0537, B:64:0x053d, B:65:0x057d, B:66:0x05be, B:68:0x05c4, B:71:0x05cd, B:73:0x05d5, B:75:0x05e2, B:76:0x05e7, B:78:0x05ff, B:79:0x0608, B:81:0x064f, B:85:0x06af, B:87:0x06b4, B:88:0x0722, B:89:0x066e, B:91:0x067a, B:92:0x0682, B:94:0x06a9, B:97:0x0658, B:98:0x071a, B:99:0x0540, B:100:0x058d, B:102:0x0595, B:103:0x05b2, B:104:0x05ac, B:105:0x0728, B:108:0x0737, B:109:0x0741, B:121:0x003c, B:124:0x0043), top: B:2:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0244 A[Catch: all -> 0x031f, TryCatch #1 {all -> 0x031f, blocks: (B:9:0x0315, B:16:0x0344, B:19:0x0358, B:20:0x036d, B:22:0x0375, B:23:0x038a, B:25:0x0397, B:26:0x03bb, B:28:0x03c1, B:29:0x03e1, B:30:0x03f9, B:32:0x041d, B:33:0x0420, B:35:0x0428, B:42:0x045d, B:45:0x0466, B:49:0x0475, B:51:0x0489, B:54:0x04aa, B:56:0x04b0, B:58:0x04ba, B:59:0x04c3, B:110:0x0438, B:111:0x03ff, B:112:0x0405, B:113:0x040b, B:114:0x0411, B:115:0x0417, B:116:0x03dc, B:117:0x03b4, B:118:0x0385, B:119:0x0368, B:136:0x0064, B:138:0x0071, B:141:0x0079, B:142:0x007b, B:143:0x0087, B:157:0x00b6, B:159:0x00bc, B:161:0x00c4, B:163:0x00ca, B:165:0x00d0, B:167:0x00d7, B:169:0x00df, B:172:0x02f4, B:180:0x0307, B:182:0x030d, B:214:0x0103, B:215:0x010b, B:216:0x0110, B:218:0x011c, B:220:0x023b, B:222:0x0244, B:227:0x024c, B:229:0x0252, B:230:0x0259, B:231:0x025e, B:240:0x02d6, B:243:0x0273, B:245:0x027a, B:246:0x02ba, B:248:0x02c2, B:253:0x02ca, B:256:0x02cf, B:260:0x027f, B:261:0x0287, B:263:0x028b, B:265:0x0291, B:267:0x029e, B:270:0x02a6, B:272:0x02ad, B:283:0x0124, B:285:0x0136, B:287:0x0142, B:288:0x014e, B:290:0x0179, B:292:0x0181, B:295:0x0152, B:296:0x015a, B:297:0x015d, B:298:0x0166, B:299:0x016f, B:308:0x018a, B:315:0x0227, B:316:0x022c, B:319:0x019c, B:322:0x01af, B:327:0x01be, B:329:0x01da, B:331:0x01f3, B:333:0x0231, B:344:0x02e8, B:351:0x02f0), top: B:135:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0252 A[Catch: all -> 0x031f, TryCatch #1 {all -> 0x031f, blocks: (B:9:0x0315, B:16:0x0344, B:19:0x0358, B:20:0x036d, B:22:0x0375, B:23:0x038a, B:25:0x0397, B:26:0x03bb, B:28:0x03c1, B:29:0x03e1, B:30:0x03f9, B:32:0x041d, B:33:0x0420, B:35:0x0428, B:42:0x045d, B:45:0x0466, B:49:0x0475, B:51:0x0489, B:54:0x04aa, B:56:0x04b0, B:58:0x04ba, B:59:0x04c3, B:110:0x0438, B:111:0x03ff, B:112:0x0405, B:113:0x040b, B:114:0x0411, B:115:0x0417, B:116:0x03dc, B:117:0x03b4, B:118:0x0385, B:119:0x0368, B:136:0x0064, B:138:0x0071, B:141:0x0079, B:142:0x007b, B:143:0x0087, B:157:0x00b6, B:159:0x00bc, B:161:0x00c4, B:163:0x00ca, B:165:0x00d0, B:167:0x00d7, B:169:0x00df, B:172:0x02f4, B:180:0x0307, B:182:0x030d, B:214:0x0103, B:215:0x010b, B:216:0x0110, B:218:0x011c, B:220:0x023b, B:222:0x0244, B:227:0x024c, B:229:0x0252, B:230:0x0259, B:231:0x025e, B:240:0x02d6, B:243:0x0273, B:245:0x027a, B:246:0x02ba, B:248:0x02c2, B:253:0x02ca, B:256:0x02cf, B:260:0x027f, B:261:0x0287, B:263:0x028b, B:265:0x0291, B:267:0x029e, B:270:0x02a6, B:272:0x02ad, B:283:0x0124, B:285:0x0136, B:287:0x0142, B:288:0x014e, B:290:0x0179, B:292:0x0181, B:295:0x0152, B:296:0x015a, B:297:0x015d, B:298:0x0166, B:299:0x016f, B:308:0x018a, B:315:0x0227, B:316:0x022c, B:319:0x019c, B:322:0x01af, B:327:0x01be, B:329:0x01da, B:331:0x01f3, B:333:0x0231, B:344:0x02e8, B:351:0x02f0), top: B:135:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x024c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0142 A[Catch: all -> 0x031f, TryCatch #1 {all -> 0x031f, blocks: (B:9:0x0315, B:16:0x0344, B:19:0x0358, B:20:0x036d, B:22:0x0375, B:23:0x038a, B:25:0x0397, B:26:0x03bb, B:28:0x03c1, B:29:0x03e1, B:30:0x03f9, B:32:0x041d, B:33:0x0420, B:35:0x0428, B:42:0x045d, B:45:0x0466, B:49:0x0475, B:51:0x0489, B:54:0x04aa, B:56:0x04b0, B:58:0x04ba, B:59:0x04c3, B:110:0x0438, B:111:0x03ff, B:112:0x0405, B:113:0x040b, B:114:0x0411, B:115:0x0417, B:116:0x03dc, B:117:0x03b4, B:118:0x0385, B:119:0x0368, B:136:0x0064, B:138:0x0071, B:141:0x0079, B:142:0x007b, B:143:0x0087, B:157:0x00b6, B:159:0x00bc, B:161:0x00c4, B:163:0x00ca, B:165:0x00d0, B:167:0x00d7, B:169:0x00df, B:172:0x02f4, B:180:0x0307, B:182:0x030d, B:214:0x0103, B:215:0x010b, B:216:0x0110, B:218:0x011c, B:220:0x023b, B:222:0x0244, B:227:0x024c, B:229:0x0252, B:230:0x0259, B:231:0x025e, B:240:0x02d6, B:243:0x0273, B:245:0x027a, B:246:0x02ba, B:248:0x02c2, B:253:0x02ca, B:256:0x02cf, B:260:0x027f, B:261:0x0287, B:263:0x028b, B:265:0x0291, B:267:0x029e, B:270:0x02a6, B:272:0x02ad, B:283:0x0124, B:285:0x0136, B:287:0x0142, B:288:0x014e, B:290:0x0179, B:292:0x0181, B:295:0x0152, B:296:0x015a, B:297:0x015d, B:298:0x0166, B:299:0x016f, B:308:0x018a, B:315:0x0227, B:316:0x022c, B:319:0x019c, B:322:0x01af, B:327:0x01be, B:329:0x01da, B:331:0x01f3, B:333:0x0231, B:344:0x02e8, B:351:0x02f0), top: B:135:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x06b4 A[Catch: all -> 0x074f, TryCatch #2 {all -> 0x074f, blocks: (B:3:0x0007, B:14:0x0322, B:36:0x044a, B:40:0x0455, B:46:0x046f, B:52:0x04a4, B:60:0x04c8, B:62:0x0537, B:64:0x053d, B:65:0x057d, B:66:0x05be, B:68:0x05c4, B:71:0x05cd, B:73:0x05d5, B:75:0x05e2, B:76:0x05e7, B:78:0x05ff, B:79:0x0608, B:81:0x064f, B:85:0x06af, B:87:0x06b4, B:88:0x0722, B:89:0x066e, B:91:0x067a, B:92:0x0682, B:94:0x06a9, B:97:0x0658, B:98:0x071a, B:99:0x0540, B:100:0x058d, B:102:0x0595, B:103:0x05b2, B:104:0x05ac, B:105:0x0728, B:108:0x0737, B:109:0x0741, B:121:0x003c, B:124:0x0043), top: B:2:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0315 A[Catch: all -> 0x031f, TRY_LEAVE, TryCatch #1 {all -> 0x031f, blocks: (B:9:0x0315, B:16:0x0344, B:19:0x0358, B:20:0x036d, B:22:0x0375, B:23:0x038a, B:25:0x0397, B:26:0x03bb, B:28:0x03c1, B:29:0x03e1, B:30:0x03f9, B:32:0x041d, B:33:0x0420, B:35:0x0428, B:42:0x045d, B:45:0x0466, B:49:0x0475, B:51:0x0489, B:54:0x04aa, B:56:0x04b0, B:58:0x04ba, B:59:0x04c3, B:110:0x0438, B:111:0x03ff, B:112:0x0405, B:113:0x040b, B:114:0x0411, B:115:0x0417, B:116:0x03dc, B:117:0x03b4, B:118:0x0385, B:119:0x0368, B:136:0x0064, B:138:0x0071, B:141:0x0079, B:142:0x007b, B:143:0x0087, B:157:0x00b6, B:159:0x00bc, B:161:0x00c4, B:163:0x00ca, B:165:0x00d0, B:167:0x00d7, B:169:0x00df, B:172:0x02f4, B:180:0x0307, B:182:0x030d, B:214:0x0103, B:215:0x010b, B:216:0x0110, B:218:0x011c, B:220:0x023b, B:222:0x0244, B:227:0x024c, B:229:0x0252, B:230:0x0259, B:231:0x025e, B:240:0x02d6, B:243:0x0273, B:245:0x027a, B:246:0x02ba, B:248:0x02c2, B:253:0x02ca, B:256:0x02cf, B:260:0x027f, B:261:0x0287, B:263:0x028b, B:265:0x0291, B:267:0x029e, B:270:0x02a6, B:272:0x02ad, B:283:0x0124, B:285:0x0136, B:287:0x0142, B:288:0x014e, B:290:0x0179, B:292:0x0181, B:295:0x0152, B:296:0x015a, B:297:0x015d, B:298:0x0166, B:299:0x016f, B:308:0x018a, B:315:0x0227, B:316:0x022c, B:319:0x019c, B:322:0x01af, B:327:0x01be, B:329:0x01da, B:331:0x01f3, B:333:0x0231, B:344:0x02e8, B:351:0x02f0), top: B:135:0x0064 }] */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ReceiveWapPushSiMessageAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveWapPushSiMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fV() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        D(parcel, i2);
    }

    public ReceiveWapPushSiMessageAction(Context context, ffbr ffbrVar, cqoh cqohVar, covs covsVar, altk altkVar, coxk coxkVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bdtd bdtdVar, baam baamVar, bbel bbelVar, bdvi bdviVar, bbfw bbfwVar, byzp byzpVar, bcwz bcwzVar, dtuu dtuuVar, ffbr ffbrVar6, cerb cerbVar, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, Parcel parcel) {
        super(parcel, eogt.RECEIVE_WAP_PUSH_SI_MESSAGE_ACTION);
        this.k = context;
        this.a = ffbrVar;
        this.l = cqohVar;
        this.m = covsVar;
        this.n = altkVar;
        this.o = coxkVar;
        this.b = ffbrVar2;
        this.p = ffbrVar3;
        this.c = ffbrVar4;
        this.q = ffbrVar5;
        this.y = bdtdVar;
        this.d = baamVar;
        this.z = bbelVar;
        this.e = bdviVar;
        this.A = bbfwVar;
        this.f = byzpVar;
        this.g = bcwzVar;
        this.B = dtuuVar;
        this.C = ffbrVar6;
        this.F = cerbVar;
        this.D = ffbrVar7;
        this.E = ffbrVar8;
        this.h = ffbrVar9;
        this.G = ffbrVar10;
        this.H = ffbrVar11;
        this.I = ffbrVar12;
    }
}
