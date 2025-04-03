package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvkz implements cvkr, cvkn {
    public static final cskc a = cskc.g("BugleDataModel", "XmsViaTelephonySender");
    public final Context b;
    public final cpbw c;
    public final coxk d;
    public final cgtc e;
    public final covr f;
    public final ecnx g;
    public final cvks h;
    private final errl i;
    private final errl j;
    private final errl k;
    private final cvkm l;
    private final ffbr m;

    public cvkz(Context context, errl errlVar, errl errlVar2, errl errlVar3, cpbw cpbwVar, coxk coxkVar, cgtc cgtcVar, covr covrVar, ecnx ecnxVar, cvks cvksVar, cvkm cvkmVar, ffbr ffbrVar) {
        this.b = context;
        this.j = errlVar;
        this.i = errlVar2;
        this.k = errlVar3;
        this.c = cpbwVar;
        this.d = coxkVar;
        this.e = cgtcVar;
        this.f = covrVar;
        this.g = ecnxVar;
        this.h = cvksVar;
        this.l = cvkmVar;
        this.m = ffbrVar;
    }

    public static ckbx c() {
        return ckbx.j(2, 0).a();
    }

    @Override // defpackage.cvkn
    public final elfl a(cvkp cvkpVar) {
        Optional empty;
        cvkk cvkkVar = (cvkk) cvkpVar;
        final MessageCoreData messageCoreData = cvkkVar.a;
        emxf.a(messageCoreData.cP());
        cvkm cvkmVar = this.l;
        csrv csrvVar = cvkmVar.d;
        final long t = messageCoreData.t();
        boolean z = csrvVar.k;
        final int i = cvkkVar.c;
        final Uri uri = cvkkVar.b;
        if (z) {
            csjb e = cvkm.a.e();
            e.I("emulate MMS send failure for debugging.");
            e.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            e.w(t);
            e.r();
            ckbw j = ckbx.j(1, 0);
            ((ckaw) j).c = uri;
            j.b(8);
            empty = Optional.of(j.a());
        } else if (!cvkmVar.b.a(i).r()) {
            csjb e2 = cvkm.a.e();
            e2.I("MMS is not enabled by carrier.");
            e2.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            e2.w(t);
            e2.r();
            ckbw j2 = ckbx.j(3, 0);
            ((ckaw) j2).c = uri;
            j2.b(7);
            empty = Optional.of(j2.a());
        } else if (cvkmVar.c.b()) {
            empty = Optional.empty();
        } else {
            csjb e3 = cvkm.a.e();
            e3.I("Outgoing MMS is not enabled by Knox policy.");
            e3.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            e3.w(t);
            e3.r();
            ckbw j3 = ckbx.j(3, 0);
            ((ckaw) j3).c = uri;
            j3.b(7);
            empty = Optional.of(j3.a());
        }
        if (!empty.isPresent()) {
            return elfo.g(new Callable() { // from class: cvkt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(cvkz.this.d(messageCoreData));
                }
            }, this.i).h(new emwl() { // from class: cvku
                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:106:0x0397 A[Catch: lj -> 0x041a, TryCatch #16 {lj -> 0x041a, blocks: (B:261:0x01c7, B:262:0x01ca, B:268:0x01c0, B:99:0x01cd, B:105:0x0394, B:106:0x0397, B:107:0x03e2, B:108:0x03f3, B:109:0x039a, B:15:0x0420, B:110:0x03a1, B:111:0x03a8, B:112:0x03af, B:113:0x03b6, B:114:0x03bc, B:115:0x03c2, B:116:0x03c8, B:117:0x03db, B:118:0x03dc, B:119:0x01e6, B:226:0x0368, B:127:0x0386, B:129:0x038a, B:124:0x0380, B:229:0x03f6, B:230:0x03f9, B:273:0x03fa, B:274:0x0403, B:13:0x0416, B:281:0x040a, B:282:0x040f, B:42:0x005e, B:44:0x0065, B:47:0x006d, B:48:0x0073, B:50:0x0077, B:52:0x0089, B:54:0x008f, B:60:0x00b0, B:61:0x00b6, B:63:0x00ba, B:66:0x00cc, B:71:0x00d4, B:72:0x00da, B:74:0x00de, B:77:0x00f0, B:82:0x00f8, B:83:0x00fe, B:85:0x0102, B:87:0x0114, B:133:0x0210, B:136:0x0218, B:137:0x021f, B:139:0x0225, B:141:0x0231, B:143:0x023d, B:144:0x0244, B:146:0x024d, B:147:0x0250, B:149:0x0257, B:150:0x025a, B:152:0x0261, B:153:0x0264, B:155:0x026b, B:157:0x0275, B:158:0x0278, B:160:0x027f, B:161:0x0282, B:163:0x02ae, B:165:0x02b4, B:167:0x02ba, B:169:0x02c7, B:171:0x02cf, B:188:0x02f9, B:184:0x0348, B:186:0x0352, B:191:0x02fe, B:197:0x031c, B:202:0x0324, B:201:0x0321, B:213:0x0325, B:215:0x0331, B:216:0x0338, B:221:0x035c, B:222:0x0363, B:122:0x0373), top: B:41:0x005e, inners: #5, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:109:0x039a A[Catch: lj -> 0x041a, TryCatch #16 {lj -> 0x041a, blocks: (B:261:0x01c7, B:262:0x01ca, B:268:0x01c0, B:99:0x01cd, B:105:0x0394, B:106:0x0397, B:107:0x03e2, B:108:0x03f3, B:109:0x039a, B:15:0x0420, B:110:0x03a1, B:111:0x03a8, B:112:0x03af, B:113:0x03b6, B:114:0x03bc, B:115:0x03c2, B:116:0x03c8, B:117:0x03db, B:118:0x03dc, B:119:0x01e6, B:226:0x0368, B:127:0x0386, B:129:0x038a, B:124:0x0380, B:229:0x03f6, B:230:0x03f9, B:273:0x03fa, B:274:0x0403, B:13:0x0416, B:281:0x040a, B:282:0x040f, B:42:0x005e, B:44:0x0065, B:47:0x006d, B:48:0x0073, B:50:0x0077, B:52:0x0089, B:54:0x008f, B:60:0x00b0, B:61:0x00b6, B:63:0x00ba, B:66:0x00cc, B:71:0x00d4, B:72:0x00da, B:74:0x00de, B:77:0x00f0, B:82:0x00f8, B:83:0x00fe, B:85:0x0102, B:87:0x0114, B:133:0x0210, B:136:0x0218, B:137:0x021f, B:139:0x0225, B:141:0x0231, B:143:0x023d, B:144:0x0244, B:146:0x024d, B:147:0x0250, B:149:0x0257, B:150:0x025a, B:152:0x0261, B:153:0x0264, B:155:0x026b, B:157:0x0275, B:158:0x0278, B:160:0x027f, B:161:0x0282, B:163:0x02ae, B:165:0x02b4, B:167:0x02ba, B:169:0x02c7, B:171:0x02cf, B:188:0x02f9, B:184:0x0348, B:186:0x0352, B:191:0x02fe, B:197:0x031c, B:202:0x0324, B:201:0x0321, B:213:0x0325, B:215:0x0331, B:216:0x0338, B:221:0x035c, B:222:0x0363, B:122:0x0373), top: B:41:0x005e, inners: #5, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:110:0x03a1 A[Catch: lj -> 0x041a, TryCatch #16 {lj -> 0x041a, blocks: (B:261:0x01c7, B:262:0x01ca, B:268:0x01c0, B:99:0x01cd, B:105:0x0394, B:106:0x0397, B:107:0x03e2, B:108:0x03f3, B:109:0x039a, B:15:0x0420, B:110:0x03a1, B:111:0x03a8, B:112:0x03af, B:113:0x03b6, B:114:0x03bc, B:115:0x03c2, B:116:0x03c8, B:117:0x03db, B:118:0x03dc, B:119:0x01e6, B:226:0x0368, B:127:0x0386, B:129:0x038a, B:124:0x0380, B:229:0x03f6, B:230:0x03f9, B:273:0x03fa, B:274:0x0403, B:13:0x0416, B:281:0x040a, B:282:0x040f, B:42:0x005e, B:44:0x0065, B:47:0x006d, B:48:0x0073, B:50:0x0077, B:52:0x0089, B:54:0x008f, B:60:0x00b0, B:61:0x00b6, B:63:0x00ba, B:66:0x00cc, B:71:0x00d4, B:72:0x00da, B:74:0x00de, B:77:0x00f0, B:82:0x00f8, B:83:0x00fe, B:85:0x0102, B:87:0x0114, B:133:0x0210, B:136:0x0218, B:137:0x021f, B:139:0x0225, B:141:0x0231, B:143:0x023d, B:144:0x0244, B:146:0x024d, B:147:0x0250, B:149:0x0257, B:150:0x025a, B:152:0x0261, B:153:0x0264, B:155:0x026b, B:157:0x0275, B:158:0x0278, B:160:0x027f, B:161:0x0282, B:163:0x02ae, B:165:0x02b4, B:167:0x02ba, B:169:0x02c7, B:171:0x02cf, B:188:0x02f9, B:184:0x0348, B:186:0x0352, B:191:0x02fe, B:197:0x031c, B:202:0x0324, B:201:0x0321, B:213:0x0325, B:215:0x0331, B:216:0x0338, B:221:0x035c, B:222:0x0363, B:122:0x0373), top: B:41:0x005e, inners: #5, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:111:0x03a8 A[Catch: lj -> 0x041a, TryCatch #16 {lj -> 0x041a, blocks: (B:261:0x01c7, B:262:0x01ca, B:268:0x01c0, B:99:0x01cd, B:105:0x0394, B:106:0x0397, B:107:0x03e2, B:108:0x03f3, B:109:0x039a, B:15:0x0420, B:110:0x03a1, B:111:0x03a8, B:112:0x03af, B:113:0x03b6, B:114:0x03bc, B:115:0x03c2, B:116:0x03c8, B:117:0x03db, B:118:0x03dc, B:119:0x01e6, B:226:0x0368, B:127:0x0386, B:129:0x038a, B:124:0x0380, B:229:0x03f6, B:230:0x03f9, B:273:0x03fa, B:274:0x0403, B:13:0x0416, B:281:0x040a, B:282:0x040f, B:42:0x005e, B:44:0x0065, B:47:0x006d, B:48:0x0073, B:50:0x0077, B:52:0x0089, B:54:0x008f, B:60:0x00b0, B:61:0x00b6, B:63:0x00ba, B:66:0x00cc, B:71:0x00d4, B:72:0x00da, B:74:0x00de, B:77:0x00f0, B:82:0x00f8, B:83:0x00fe, B:85:0x0102, B:87:0x0114, B:133:0x0210, B:136:0x0218, B:137:0x021f, B:139:0x0225, B:141:0x0231, B:143:0x023d, B:144:0x0244, B:146:0x024d, B:147:0x0250, B:149:0x0257, B:150:0x025a, B:152:0x0261, B:153:0x0264, B:155:0x026b, B:157:0x0275, B:158:0x0278, B:160:0x027f, B:161:0x0282, B:163:0x02ae, B:165:0x02b4, B:167:0x02ba, B:169:0x02c7, B:171:0x02cf, B:188:0x02f9, B:184:0x0348, B:186:0x0352, B:191:0x02fe, B:197:0x031c, B:202:0x0324, B:201:0x0321, B:213:0x0325, B:215:0x0331, B:216:0x0338, B:221:0x035c, B:222:0x0363, B:122:0x0373), top: B:41:0x005e, inners: #5, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:112:0x03af A[Catch: lj -> 0x041a, TryCatch #16 {lj -> 0x041a, blocks: (B:261:0x01c7, B:262:0x01ca, B:268:0x01c0, B:99:0x01cd, B:105:0x0394, B:106:0x0397, B:107:0x03e2, B:108:0x03f3, B:109:0x039a, B:15:0x0420, B:110:0x03a1, B:111:0x03a8, B:112:0x03af, B:113:0x03b6, B:114:0x03bc, B:115:0x03c2, B:116:0x03c8, B:117:0x03db, B:118:0x03dc, B:119:0x01e6, B:226:0x0368, B:127:0x0386, B:129:0x038a, B:124:0x0380, B:229:0x03f6, B:230:0x03f9, B:273:0x03fa, B:274:0x0403, B:13:0x0416, B:281:0x040a, B:282:0x040f, B:42:0x005e, B:44:0x0065, B:47:0x006d, B:48:0x0073, B:50:0x0077, B:52:0x0089, B:54:0x008f, B:60:0x00b0, B:61:0x00b6, B:63:0x00ba, B:66:0x00cc, B:71:0x00d4, B:72:0x00da, B:74:0x00de, B:77:0x00f0, B:82:0x00f8, B:83:0x00fe, B:85:0x0102, B:87:0x0114, B:133:0x0210, B:136:0x0218, B:137:0x021f, B:139:0x0225, B:141:0x0231, B:143:0x023d, B:144:0x0244, B:146:0x024d, B:147:0x0250, B:149:0x0257, B:150:0x025a, B:152:0x0261, B:153:0x0264, B:155:0x026b, B:157:0x0275, B:158:0x0278, B:160:0x027f, B:161:0x0282, B:163:0x02ae, B:165:0x02b4, B:167:0x02ba, B:169:0x02c7, B:171:0x02cf, B:188:0x02f9, B:184:0x0348, B:186:0x0352, B:191:0x02fe, B:197:0x031c, B:202:0x0324, B:201:0x0321, B:213:0x0325, B:215:0x0331, B:216:0x0338, B:221:0x035c, B:222:0x0363, B:122:0x0373), top: B:41:0x005e, inners: #5, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:113:0x03b6 A[Catch: lj -> 0x041a, TryCatch #16 {lj -> 0x041a, blocks: (B:261:0x01c7, B:262:0x01ca, B:268:0x01c0, B:99:0x01cd, B:105:0x0394, B:106:0x0397, B:107:0x03e2, B:108:0x03f3, B:109:0x039a, B:15:0x0420, B:110:0x03a1, B:111:0x03a8, B:112:0x03af, B:113:0x03b6, B:114:0x03bc, B:115:0x03c2, B:116:0x03c8, B:117:0x03db, B:118:0x03dc, B:119:0x01e6, B:226:0x0368, B:127:0x0386, B:129:0x038a, B:124:0x0380, B:229:0x03f6, B:230:0x03f9, B:273:0x03fa, B:274:0x0403, B:13:0x0416, B:281:0x040a, B:282:0x040f, B:42:0x005e, B:44:0x0065, B:47:0x006d, B:48:0x0073, B:50:0x0077, B:52:0x0089, B:54:0x008f, B:60:0x00b0, B:61:0x00b6, B:63:0x00ba, B:66:0x00cc, B:71:0x00d4, B:72:0x00da, B:74:0x00de, B:77:0x00f0, B:82:0x00f8, B:83:0x00fe, B:85:0x0102, B:87:0x0114, B:133:0x0210, B:136:0x0218, B:137:0x021f, B:139:0x0225, B:141:0x0231, B:143:0x023d, B:144:0x0244, B:146:0x024d, B:147:0x0250, B:149:0x0257, B:150:0x025a, B:152:0x0261, B:153:0x0264, B:155:0x026b, B:157:0x0275, B:158:0x0278, B:160:0x027f, B:161:0x0282, B:163:0x02ae, B:165:0x02b4, B:167:0x02ba, B:169:0x02c7, B:171:0x02cf, B:188:0x02f9, B:184:0x0348, B:186:0x0352, B:191:0x02fe, B:197:0x031c, B:202:0x0324, B:201:0x0321, B:213:0x0325, B:215:0x0331, B:216:0x0338, B:221:0x035c, B:222:0x0363, B:122:0x0373), top: B:41:0x005e, inners: #5, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:114:0x03bc A[Catch: lj -> 0x041a, TryCatch #16 {lj -> 0x041a, blocks: (B:261:0x01c7, B:262:0x01ca, B:268:0x01c0, B:99:0x01cd, B:105:0x0394, B:106:0x0397, B:107:0x03e2, B:108:0x03f3, B:109:0x039a, B:15:0x0420, B:110:0x03a1, B:111:0x03a8, B:112:0x03af, B:113:0x03b6, B:114:0x03bc, B:115:0x03c2, B:116:0x03c8, B:117:0x03db, B:118:0x03dc, B:119:0x01e6, B:226:0x0368, B:127:0x0386, B:129:0x038a, B:124:0x0380, B:229:0x03f6, B:230:0x03f9, B:273:0x03fa, B:274:0x0403, B:13:0x0416, B:281:0x040a, B:282:0x040f, B:42:0x005e, B:44:0x0065, B:47:0x006d, B:48:0x0073, B:50:0x0077, B:52:0x0089, B:54:0x008f, B:60:0x00b0, B:61:0x00b6, B:63:0x00ba, B:66:0x00cc, B:71:0x00d4, B:72:0x00da, B:74:0x00de, B:77:0x00f0, B:82:0x00f8, B:83:0x00fe, B:85:0x0102, B:87:0x0114, B:133:0x0210, B:136:0x0218, B:137:0x021f, B:139:0x0225, B:141:0x0231, B:143:0x023d, B:144:0x0244, B:146:0x024d, B:147:0x0250, B:149:0x0257, B:150:0x025a, B:152:0x0261, B:153:0x0264, B:155:0x026b, B:157:0x0275, B:158:0x0278, B:160:0x027f, B:161:0x0282, B:163:0x02ae, B:165:0x02b4, B:167:0x02ba, B:169:0x02c7, B:171:0x02cf, B:188:0x02f9, B:184:0x0348, B:186:0x0352, B:191:0x02fe, B:197:0x031c, B:202:0x0324, B:201:0x0321, B:213:0x0325, B:215:0x0331, B:216:0x0338, B:221:0x035c, B:222:0x0363, B:122:0x0373), top: B:41:0x005e, inners: #5, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:115:0x03c2 A[Catch: lj -> 0x041a, TryCatch #16 {lj -> 0x041a, blocks: (B:261:0x01c7, B:262:0x01ca, B:268:0x01c0, B:99:0x01cd, B:105:0x0394, B:106:0x0397, B:107:0x03e2, B:108:0x03f3, B:109:0x039a, B:15:0x0420, B:110:0x03a1, B:111:0x03a8, B:112:0x03af, B:113:0x03b6, B:114:0x03bc, B:115:0x03c2, B:116:0x03c8, B:117:0x03db, B:118:0x03dc, B:119:0x01e6, B:226:0x0368, B:127:0x0386, B:129:0x038a, B:124:0x0380, B:229:0x03f6, B:230:0x03f9, B:273:0x03fa, B:274:0x0403, B:13:0x0416, B:281:0x040a, B:282:0x040f, B:42:0x005e, B:44:0x0065, B:47:0x006d, B:48:0x0073, B:50:0x0077, B:52:0x0089, B:54:0x008f, B:60:0x00b0, B:61:0x00b6, B:63:0x00ba, B:66:0x00cc, B:71:0x00d4, B:72:0x00da, B:74:0x00de, B:77:0x00f0, B:82:0x00f8, B:83:0x00fe, B:85:0x0102, B:87:0x0114, B:133:0x0210, B:136:0x0218, B:137:0x021f, B:139:0x0225, B:141:0x0231, B:143:0x023d, B:144:0x0244, B:146:0x024d, B:147:0x0250, B:149:0x0257, B:150:0x025a, B:152:0x0261, B:153:0x0264, B:155:0x026b, B:157:0x0275, B:158:0x0278, B:160:0x027f, B:161:0x0282, B:163:0x02ae, B:165:0x02b4, B:167:0x02ba, B:169:0x02c7, B:171:0x02cf, B:188:0x02f9, B:184:0x0348, B:186:0x0352, B:191:0x02fe, B:197:0x031c, B:202:0x0324, B:201:0x0321, B:213:0x0325, B:215:0x0331, B:216:0x0338, B:221:0x035c, B:222:0x0363, B:122:0x0373), top: B:41:0x005e, inners: #5, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:116:0x03c8 A[Catch: lj -> 0x041a, TryCatch #16 {lj -> 0x041a, blocks: (B:261:0x01c7, B:262:0x01ca, B:268:0x01c0, B:99:0x01cd, B:105:0x0394, B:106:0x0397, B:107:0x03e2, B:108:0x03f3, B:109:0x039a, B:15:0x0420, B:110:0x03a1, B:111:0x03a8, B:112:0x03af, B:113:0x03b6, B:114:0x03bc, B:115:0x03c2, B:116:0x03c8, B:117:0x03db, B:118:0x03dc, B:119:0x01e6, B:226:0x0368, B:127:0x0386, B:129:0x038a, B:124:0x0380, B:229:0x03f6, B:230:0x03f9, B:273:0x03fa, B:274:0x0403, B:13:0x0416, B:281:0x040a, B:282:0x040f, B:42:0x005e, B:44:0x0065, B:47:0x006d, B:48:0x0073, B:50:0x0077, B:52:0x0089, B:54:0x008f, B:60:0x00b0, B:61:0x00b6, B:63:0x00ba, B:66:0x00cc, B:71:0x00d4, B:72:0x00da, B:74:0x00de, B:77:0x00f0, B:82:0x00f8, B:83:0x00fe, B:85:0x0102, B:87:0x0114, B:133:0x0210, B:136:0x0218, B:137:0x021f, B:139:0x0225, B:141:0x0231, B:143:0x023d, B:144:0x0244, B:146:0x024d, B:147:0x0250, B:149:0x0257, B:150:0x025a, B:152:0x0261, B:153:0x0264, B:155:0x026b, B:157:0x0275, B:158:0x0278, B:160:0x027f, B:161:0x0282, B:163:0x02ae, B:165:0x02b4, B:167:0x02ba, B:169:0x02c7, B:171:0x02cf, B:188:0x02f9, B:184:0x0348, B:186:0x0352, B:191:0x02fe, B:197:0x031c, B:202:0x0324, B:201:0x0321, B:213:0x0325, B:215:0x0331, B:216:0x0338, B:221:0x035c, B:222:0x0363, B:122:0x0373), top: B:41:0x005e, inners: #5, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:118:0x03dc A[Catch: lj -> 0x041a, TryCatch #16 {lj -> 0x041a, blocks: (B:261:0x01c7, B:262:0x01ca, B:268:0x01c0, B:99:0x01cd, B:105:0x0394, B:106:0x0397, B:107:0x03e2, B:108:0x03f3, B:109:0x039a, B:15:0x0420, B:110:0x03a1, B:111:0x03a8, B:112:0x03af, B:113:0x03b6, B:114:0x03bc, B:115:0x03c2, B:116:0x03c8, B:117:0x03db, B:118:0x03dc, B:119:0x01e6, B:226:0x0368, B:127:0x0386, B:129:0x038a, B:124:0x0380, B:229:0x03f6, B:230:0x03f9, B:273:0x03fa, B:274:0x0403, B:13:0x0416, B:281:0x040a, B:282:0x040f, B:42:0x005e, B:44:0x0065, B:47:0x006d, B:48:0x0073, B:50:0x0077, B:52:0x0089, B:54:0x008f, B:60:0x00b0, B:61:0x00b6, B:63:0x00ba, B:66:0x00cc, B:71:0x00d4, B:72:0x00da, B:74:0x00de, B:77:0x00f0, B:82:0x00f8, B:83:0x00fe, B:85:0x0102, B:87:0x0114, B:133:0x0210, B:136:0x0218, B:137:0x021f, B:139:0x0225, B:141:0x0231, B:143:0x023d, B:144:0x0244, B:146:0x024d, B:147:0x0250, B:149:0x0257, B:150:0x025a, B:152:0x0261, B:153:0x0264, B:155:0x026b, B:157:0x0275, B:158:0x0278, B:160:0x027f, B:161:0x0282, B:163:0x02ae, B:165:0x02b4, B:167:0x02ba, B:169:0x02c7, B:171:0x02cf, B:188:0x02f9, B:184:0x0348, B:186:0x0352, B:191:0x02fe, B:197:0x031c, B:202:0x0324, B:201:0x0321, B:213:0x0325, B:215:0x0331, B:216:0x0338, B:221:0x035c, B:222:0x0363, B:122:0x0373), top: B:41:0x005e, inners: #5, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:127:0x0386 A[Catch: lj -> 0x041a, TryCatch #16 {lj -> 0x041a, blocks: (B:261:0x01c7, B:262:0x01ca, B:268:0x01c0, B:99:0x01cd, B:105:0x0394, B:106:0x0397, B:107:0x03e2, B:108:0x03f3, B:109:0x039a, B:15:0x0420, B:110:0x03a1, B:111:0x03a8, B:112:0x03af, B:113:0x03b6, B:114:0x03bc, B:115:0x03c2, B:116:0x03c8, B:117:0x03db, B:118:0x03dc, B:119:0x01e6, B:226:0x0368, B:127:0x0386, B:129:0x038a, B:124:0x0380, B:229:0x03f6, B:230:0x03f9, B:273:0x03fa, B:274:0x0403, B:13:0x0416, B:281:0x040a, B:282:0x040f, B:42:0x005e, B:44:0x0065, B:47:0x006d, B:48:0x0073, B:50:0x0077, B:52:0x0089, B:54:0x008f, B:60:0x00b0, B:61:0x00b6, B:63:0x00ba, B:66:0x00cc, B:71:0x00d4, B:72:0x00da, B:74:0x00de, B:77:0x00f0, B:82:0x00f8, B:83:0x00fe, B:85:0x0102, B:87:0x0114, B:133:0x0210, B:136:0x0218, B:137:0x021f, B:139:0x0225, B:141:0x0231, B:143:0x023d, B:144:0x0244, B:146:0x024d, B:147:0x0250, B:149:0x0257, B:150:0x025a, B:152:0x0261, B:153:0x0264, B:155:0x026b, B:157:0x0275, B:158:0x0278, B:160:0x027f, B:161:0x0282, B:163:0x02ae, B:165:0x02b4, B:167:0x02ba, B:169:0x02c7, B:171:0x02cf, B:188:0x02f9, B:184:0x0348, B:186:0x0352, B:191:0x02fe, B:197:0x031c, B:202:0x0324, B:201:0x0321, B:213:0x0325, B:215:0x0331, B:216:0x0338, B:221:0x035c, B:222:0x0363, B:122:0x0373), top: B:41:0x005e, inners: #5, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0427  */
                /* JADX WARN: Removed duplicated region for block: B:196:0x031c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:203:? A[Catch: all -> 0x036c, SYNTHETIC, TryCatch #7 {all -> 0x036c, blocks: (B:133:0x0210, B:136:0x0218, B:137:0x021f, B:139:0x0225, B:141:0x0231, B:143:0x023d, B:144:0x0244, B:146:0x024d, B:147:0x0250, B:149:0x0257, B:150:0x025a, B:152:0x0261, B:153:0x0264, B:155:0x026b, B:157:0x0275, B:158:0x0278, B:160:0x027f, B:161:0x0282, B:163:0x02ae, B:165:0x02b4, B:167:0x02ba, B:169:0x02c7, B:171:0x02cf, B:188:0x02f9, B:184:0x0348, B:186:0x0352, B:191:0x02fe, B:197:0x031c, B:202:0x0324, B:201:0x0321, B:213:0x0325, B:215:0x0331, B:216:0x0338, B:221:0x035c, B:222:0x0363, B:122:0x0373), top: B:132:0x0210, outer: #16, inners: #13, #14 }] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x044e  */
                /* JADX WARN: Type inference failed for: r10v55 */
                /* JADX WARN: Type inference failed for: r10v57 */
                /* JADX WARN: Type inference failed for: r10v6, types: [int] */
                /* JADX WARN: Type inference failed for: r10v7, types: [int] */
                /* JADX WARN: Type inference failed for: r15v28, types: [android.util.SparseIntArray] */
                /* JADX WARN: Type inference failed for: r9v21, types: [android.util.SparseIntArray] */
                @Override // defpackage.emwl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r27) {
                    /*
                        Method dump skipped, instructions count: 1334
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cvku.apply(java.lang.Object):java.lang.Object");
                }
            }, this.j).h(new emwl() { // from class: cvkv
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ((ckbx) obj).l(byzl.TELEPHONY_UNSPECIFIED);
                }
            }, this.k);
        }
        return elfl.g(erqt.i(((ckbx) empty.get()).l(byzl.TELEPHONY_UNSPECIFIED)));
    }

    @Override // defpackage.cvkr
    public final elfl b(final cvkq cvkqVar) {
        final MessageCoreData messageCoreData = ((cvkl) cvkqVar).a;
        emxf.a(messageCoreData.df());
        return elfo.g(new Callable() { // from class: cvkw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(cvkz.this.d(messageCoreData));
            }
        }, this.i).h(new emwl() { // from class: cvkx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String b;
                boolean booleanValue;
                if (!((Boolean) obj).booleanValue()) {
                    return cvkz.c();
                }
                MessageCoreData messageCoreData2 = messageCoreData;
                cvkq cvkqVar2 = cvkqVar;
                cvkz cvkzVar = cvkz.this;
                if (!((Boolean) cjja.a.e()).booleanValue() || messageCoreData2.Q() == null) {
                    MessagePartCoreData G = messageCoreData2.G();
                    b = G == null ? emxe.b(messageCoreData2.ar()) : messageCoreData2.cq() ? cvkzVar.h.a.b(G) : messageCoreData2.ao();
                } else {
                    b = ((Boolean) cjja.b.e()).booleanValue() ? emxe.b(messageCoreData2.ar()) : messageCoreData2.aD();
                }
                String str = b;
                cvkl cvklVar = (cvkl) cvkqVar2;
                aoku aokuVar = cvklVar.d;
                if (((Boolean) cfvp.a.e()).booleanValue()) {
                    Context context = cvkzVar.b;
                    if (ctib.c()) {
                        cfva cfvaVar = aoqm.a;
                        if ("119".equals(aokuVar.k(((Boolean) new emyl() { // from class: aoqi
                            @Override // defpackage.emyl
                            public final Object get() {
                                return Boolean.valueOf(ersy.a("bugle.enable_mi_in_national_emergency_util", "bugle"));
                            }
                        }.get()).booleanValue()))) {
                            Intent intent = new Intent("com.lge.mms.action.MMS_119APP_REQUEST");
                            intent.putExtra("startFlag", "003");
                            context.sendBroadcast(intent);
                        }
                    }
                }
                int i = cvklVar.c;
                coxk coxkVar = cvkzVar.d;
                Uri uri = cvklVar.b;
                String str2 = cvklVar.e;
                cpbw cpbwVar = cvkzVar.c;
                if (cpbwVar.d.a(i).v()) {
                    boolean u = cpbwVar.d.a(i).u();
                    booleanValue = ((Boolean) cpbwVar.b(i).f().orElse(Boolean.valueOf(u))).booleanValue();
                    ensk e = cpbw.a.e();
                    e.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/sms/config/MmsSmsPreferenceUtils", "isDeliveryReportRequired", 77, "MmsSmsPreferenceUtils.java")).I("SMS delivery reports pref: %b (default: %b)", booleanValue, u);
                } else {
                    ensk e2 = cpbw.a.e();
                    e2.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/sms/config/MmsSmsPreferenceUtils", "isDeliveryReportRequired", 69, "MmsSmsPreferenceUtils.java")).q("SMS delivery reports disabled by subscription");
                    booleanValue = false;
                }
                return coxkVar.s(aokuVar, str, uri, i, emxe.b(str2), booleanValue, messageCoreData2.B(), messageCoreData2.t());
            }
        }, this.j).h(new emwl() { // from class: cvky
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((ckbx) obj).l(byzl.TELEPHONY_UNSPECIFIED);
            }
        }, this.k);
    }

    public final boolean d(MessageCoreData messageCoreData) {
        messageCoreData.cb(byzl.TELEPHONY_UNSPECIFIED);
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("updateXmsTransport");
        buxrVar.al();
        buxrVar.W(byzl.TELEPHONY_UNSPECIFIED);
        buxrVar.ap("updateXmsTransport");
        boolean U = ((bdmq) this.m.b()).U(messageCoreData.z(), messageCoreData.B(), buxrVar);
        if (!U) {
            csjb e = a.e();
            e.I("Unable to update XmsTransport when trying to send the message via Telephony");
            e.A("messageId", messageCoreData.B());
            e.r();
        }
        return U;
    }
}
