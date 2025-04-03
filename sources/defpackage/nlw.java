package defpackage;

import android.text.Layout;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlw implements nkj {
    private final XmlPullParserFactory i;
    private static final Pattern c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern a = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern b = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern g = Pattern.compile("^(\\d+) (\\d+)$");
    private static final nlu h = new nlu(30.0f, 1, 1);

    public nlw() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.i = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
    
        if (r0.equals("s") != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long d(java.lang.String r18, defpackage.nlu r19) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlw.d(java.lang.String, nlu):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Layout.Alignment e(String str) {
        char c2;
        String c3 = emuz.c(str);
        switch (c3.hashCode()) {
            case -1364013995:
                if (c3.equals("center")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 100571:
                if (c3.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3317767:
                if (c3.equals("left")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 108511772:
                if (c3.equals("right")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 109757538:
                if (c3.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c2 == 2 || c2 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (c2 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private static nlz f(nlz nlzVar) {
        return nlzVar == null ? new nlz() : nlzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.nlz g(org.xmlpull.v1.XmlPullParser r16, defpackage.nlz r17) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlw.g(org.xmlpull.v1.XmlPullParser, nlz):nlz");
    }

    private static String[] h(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : lvf.ag(trim, "\\s+");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:353|(3:354|355|356)|(2:357|358)|(1:(7:361|362|363|33|(2:341|(1:343)(5:344|345|346|347|36))|35|36)(1:367))(1:369)|368|362|363|33|(0)|35|36) */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04e9 A[Catch: IOException -> 0x06f7, XmlPullParserException -> 0x0700, TryCatch #16 {IOException -> 0x06f7, XmlPullParserException -> 0x0700, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0066, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:19:0x0096, B:22:0x00a7, B:23:0x00c0, B:25:0x00d0, B:26:0x00d7, B:28:0x00e3, B:29:0x00ea, B:33:0x015c, B:37:0x01b2, B:40:0x01c4, B:42:0x01ca, B:44:0x01d2, B:46:0x01da, B:48:0x01e2, B:50:0x01ea, B:52:0x01f2, B:54:0x01f8, B:56:0x0200, B:58:0x0208, B:60:0x020e, B:62:0x0214, B:64:0x021c, B:66:0x0224, B:69:0x022d, B:71:0x06df, B:72:0x0251, B:74:0x0257, B:76:0x0260, B:78:0x026f, B:80:0x027a, B:82:0x028c, B:84:0x0290, B:86:0x04ee, B:95:0x0294, B:98:0x029e, B:100:0x02a4, B:102:0x02af, B:104:0x02b5, B:105:0x02bc, B:109:0x02c6, B:114:0x04e9, B:115:0x02d1, B:117:0x02d9, B:119:0x02df, B:121:0x02e7, B:123:0x02eb, B:127:0x0300, B:129:0x0377, B:131:0x0381, B:133:0x0387, B:135:0x038f, B:137:0x0393, B:141:0x03a8, B:143:0x043b, B:145:0x0443, B:158:0x048a, B:160:0x0492, B:176:0x04dc, B:193:0x03c9, B:194:0x03d8, B:197:0x03e0, B:200:0x03f0, B:203:0x0417, B:204:0x0426, B:207:0x031c, B:208:0x0326, B:211:0x0330, B:214:0x033b, B:217:0x035d, B:218:0x0368, B:222:0x0504, B:226:0x0521, B:229:0x0527, B:246:0x05c1, B:254:0x058e, B:258:0x0597, B:251:0x0648, B:264:0x059e, B:269:0x05a7, B:274:0x05b1, B:276:0x05b7, B:278:0x05bc, B:308:0x05dd, B:312:0x05e7, B:315:0x05f0, B:321:0x0604, B:322:0x0614, B:325:0x062f, B:327:0x0634, B:331:0x0609, B:341:0x0167, B:343:0x0173, B:346:0x017e, B:349:0x019d, B:350:0x0103, B:352:0x010f, B:355:0x011b, B:358:0x0129, B:363:0x0144, B:366:0x0152, B:383:0x0662, B:389:0x06a4, B:391:0x06ae, B:392:0x06bf, B:396:0x06d0, B:401:0x06d8, B:403:0x06f1), top: B:2:0x0008, inners: #2, #3, #5, #8, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0492 A[Catch: IOException -> 0x06f7, XmlPullParserException -> 0x0700, TRY_LEAVE, TryCatch #16 {IOException -> 0x06f7, XmlPullParserException -> 0x0700, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0066, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:19:0x0096, B:22:0x00a7, B:23:0x00c0, B:25:0x00d0, B:26:0x00d7, B:28:0x00e3, B:29:0x00ea, B:33:0x015c, B:37:0x01b2, B:40:0x01c4, B:42:0x01ca, B:44:0x01d2, B:46:0x01da, B:48:0x01e2, B:50:0x01ea, B:52:0x01f2, B:54:0x01f8, B:56:0x0200, B:58:0x0208, B:60:0x020e, B:62:0x0214, B:64:0x021c, B:66:0x0224, B:69:0x022d, B:71:0x06df, B:72:0x0251, B:74:0x0257, B:76:0x0260, B:78:0x026f, B:80:0x027a, B:82:0x028c, B:84:0x0290, B:86:0x04ee, B:95:0x0294, B:98:0x029e, B:100:0x02a4, B:102:0x02af, B:104:0x02b5, B:105:0x02bc, B:109:0x02c6, B:114:0x04e9, B:115:0x02d1, B:117:0x02d9, B:119:0x02df, B:121:0x02e7, B:123:0x02eb, B:127:0x0300, B:129:0x0377, B:131:0x0381, B:133:0x0387, B:135:0x038f, B:137:0x0393, B:141:0x03a8, B:143:0x043b, B:145:0x0443, B:158:0x048a, B:160:0x0492, B:176:0x04dc, B:193:0x03c9, B:194:0x03d8, B:197:0x03e0, B:200:0x03f0, B:203:0x0417, B:204:0x0426, B:207:0x031c, B:208:0x0326, B:211:0x0330, B:214:0x033b, B:217:0x035d, B:218:0x0368, B:222:0x0504, B:226:0x0521, B:229:0x0527, B:246:0x05c1, B:254:0x058e, B:258:0x0597, B:251:0x0648, B:264:0x059e, B:269:0x05a7, B:274:0x05b1, B:276:0x05b7, B:278:0x05bc, B:308:0x05dd, B:312:0x05e7, B:315:0x05f0, B:321:0x0604, B:322:0x0614, B:325:0x062f, B:327:0x0634, B:331:0x0609, B:341:0x0167, B:343:0x0173, B:346:0x017e, B:349:0x019d, B:350:0x0103, B:352:0x010f, B:355:0x011b, B:358:0x0129, B:363:0x0144, B:366:0x0152, B:383:0x0662, B:389:0x06a4, B:391:0x06ae, B:392:0x06bf, B:396:0x06d0, B:401:0x06d8, B:403:0x06f1), top: B:2:0x0008, inners: #2, #3, #5, #8, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0167 A[Catch: IOException -> 0x06f7, XmlPullParserException -> 0x0700, TryCatch #16 {IOException -> 0x06f7, XmlPullParserException -> 0x0700, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0066, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:19:0x0096, B:22:0x00a7, B:23:0x00c0, B:25:0x00d0, B:26:0x00d7, B:28:0x00e3, B:29:0x00ea, B:33:0x015c, B:37:0x01b2, B:40:0x01c4, B:42:0x01ca, B:44:0x01d2, B:46:0x01da, B:48:0x01e2, B:50:0x01ea, B:52:0x01f2, B:54:0x01f8, B:56:0x0200, B:58:0x0208, B:60:0x020e, B:62:0x0214, B:64:0x021c, B:66:0x0224, B:69:0x022d, B:71:0x06df, B:72:0x0251, B:74:0x0257, B:76:0x0260, B:78:0x026f, B:80:0x027a, B:82:0x028c, B:84:0x0290, B:86:0x04ee, B:95:0x0294, B:98:0x029e, B:100:0x02a4, B:102:0x02af, B:104:0x02b5, B:105:0x02bc, B:109:0x02c6, B:114:0x04e9, B:115:0x02d1, B:117:0x02d9, B:119:0x02df, B:121:0x02e7, B:123:0x02eb, B:127:0x0300, B:129:0x0377, B:131:0x0381, B:133:0x0387, B:135:0x038f, B:137:0x0393, B:141:0x03a8, B:143:0x043b, B:145:0x0443, B:158:0x048a, B:160:0x0492, B:176:0x04dc, B:193:0x03c9, B:194:0x03d8, B:197:0x03e0, B:200:0x03f0, B:203:0x0417, B:204:0x0426, B:207:0x031c, B:208:0x0326, B:211:0x0330, B:214:0x033b, B:217:0x035d, B:218:0x0368, B:222:0x0504, B:226:0x0521, B:229:0x0527, B:246:0x05c1, B:254:0x058e, B:258:0x0597, B:251:0x0648, B:264:0x059e, B:269:0x05a7, B:274:0x05b1, B:276:0x05b7, B:278:0x05bc, B:308:0x05dd, B:312:0x05e7, B:315:0x05f0, B:321:0x0604, B:322:0x0614, B:325:0x062f, B:327:0x0634, B:331:0x0609, B:341:0x0167, B:343:0x0173, B:346:0x017e, B:349:0x019d, B:350:0x0103, B:352:0x010f, B:355:0x011b, B:358:0x0129, B:363:0x0144, B:366:0x0152, B:383:0x0662, B:389:0x06a4, B:391:0x06ae, B:392:0x06bf, B:396:0x06d0, B:401:0x06d8, B:403:0x06f1), top: B:2:0x0008, inners: #2, #3, #5, #8, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c4 A[Catch: IOException -> 0x06f7, XmlPullParserException -> 0x0700, TRY_ENTER, TryCatch #16 {IOException -> 0x06f7, XmlPullParserException -> 0x0700, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0066, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:19:0x0096, B:22:0x00a7, B:23:0x00c0, B:25:0x00d0, B:26:0x00d7, B:28:0x00e3, B:29:0x00ea, B:33:0x015c, B:37:0x01b2, B:40:0x01c4, B:42:0x01ca, B:44:0x01d2, B:46:0x01da, B:48:0x01e2, B:50:0x01ea, B:52:0x01f2, B:54:0x01f8, B:56:0x0200, B:58:0x0208, B:60:0x020e, B:62:0x0214, B:64:0x021c, B:66:0x0224, B:69:0x022d, B:71:0x06df, B:72:0x0251, B:74:0x0257, B:76:0x0260, B:78:0x026f, B:80:0x027a, B:82:0x028c, B:84:0x0290, B:86:0x04ee, B:95:0x0294, B:98:0x029e, B:100:0x02a4, B:102:0x02af, B:104:0x02b5, B:105:0x02bc, B:109:0x02c6, B:114:0x04e9, B:115:0x02d1, B:117:0x02d9, B:119:0x02df, B:121:0x02e7, B:123:0x02eb, B:127:0x0300, B:129:0x0377, B:131:0x0381, B:133:0x0387, B:135:0x038f, B:137:0x0393, B:141:0x03a8, B:143:0x043b, B:145:0x0443, B:158:0x048a, B:160:0x0492, B:176:0x04dc, B:193:0x03c9, B:194:0x03d8, B:197:0x03e0, B:200:0x03f0, B:203:0x0417, B:204:0x0426, B:207:0x031c, B:208:0x0326, B:211:0x0330, B:214:0x033b, B:217:0x035d, B:218:0x0368, B:222:0x0504, B:226:0x0521, B:229:0x0527, B:246:0x05c1, B:254:0x058e, B:258:0x0597, B:251:0x0648, B:264:0x059e, B:269:0x05a7, B:274:0x05b1, B:276:0x05b7, B:278:0x05bc, B:308:0x05dd, B:312:0x05e7, B:315:0x05f0, B:321:0x0604, B:322:0x0614, B:325:0x062f, B:327:0x0634, B:331:0x0609, B:341:0x0167, B:343:0x0173, B:346:0x017e, B:349:0x019d, B:350:0x0103, B:352:0x010f, B:355:0x011b, B:358:0x0129, B:363:0x0144, B:366:0x0152, B:383:0x0662, B:389:0x06a4, B:391:0x06ae, B:392:0x06bf, B:396:0x06d0, B:401:0x06d8, B:403:0x06f1), top: B:2:0x0008, inners: #2, #3, #5, #8, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0257 A[Catch: IOException -> 0x06f7, XmlPullParserException -> 0x0700, LOOP:1: B:74:0x0257->B:88:0x04fc, LOOP_START, PHI: r9 r10
      0x0257: PHI (r9v9 java.lang.String) = (r9v5 java.lang.String), (r9v30 java.lang.String) binds: [B:73:0x0255, B:88:0x04fc] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r10v28 java.util.ArrayDeque) = (r10v3 java.util.ArrayDeque), (r10v66 java.util.ArrayDeque) binds: [B:73:0x0255, B:88:0x04fc] A[DONT_GENERATE, DONT_INLINE], TryCatch #16 {IOException -> 0x06f7, XmlPullParserException -> 0x0700, blocks: (B:3:0x0008, B:6:0x005a, B:8:0x0066, B:11:0x0075, B:14:0x007f, B:16:0x0087, B:17:0x008e, B:19:0x0096, B:22:0x00a7, B:23:0x00c0, B:25:0x00d0, B:26:0x00d7, B:28:0x00e3, B:29:0x00ea, B:33:0x015c, B:37:0x01b2, B:40:0x01c4, B:42:0x01ca, B:44:0x01d2, B:46:0x01da, B:48:0x01e2, B:50:0x01ea, B:52:0x01f2, B:54:0x01f8, B:56:0x0200, B:58:0x0208, B:60:0x020e, B:62:0x0214, B:64:0x021c, B:66:0x0224, B:69:0x022d, B:71:0x06df, B:72:0x0251, B:74:0x0257, B:76:0x0260, B:78:0x026f, B:80:0x027a, B:82:0x028c, B:84:0x0290, B:86:0x04ee, B:95:0x0294, B:98:0x029e, B:100:0x02a4, B:102:0x02af, B:104:0x02b5, B:105:0x02bc, B:109:0x02c6, B:114:0x04e9, B:115:0x02d1, B:117:0x02d9, B:119:0x02df, B:121:0x02e7, B:123:0x02eb, B:127:0x0300, B:129:0x0377, B:131:0x0381, B:133:0x0387, B:135:0x038f, B:137:0x0393, B:141:0x03a8, B:143:0x043b, B:145:0x0443, B:158:0x048a, B:160:0x0492, B:176:0x04dc, B:193:0x03c9, B:194:0x03d8, B:197:0x03e0, B:200:0x03f0, B:203:0x0417, B:204:0x0426, B:207:0x031c, B:208:0x0326, B:211:0x0330, B:214:0x033b, B:217:0x035d, B:218:0x0368, B:222:0x0504, B:226:0x0521, B:229:0x0527, B:246:0x05c1, B:254:0x058e, B:258:0x0597, B:251:0x0648, B:264:0x059e, B:269:0x05a7, B:274:0x05b1, B:276:0x05b7, B:278:0x05bc, B:308:0x05dd, B:312:0x05e7, B:315:0x05f0, B:321:0x0604, B:322:0x0614, B:325:0x062f, B:327:0x0634, B:331:0x0609, B:341:0x0167, B:343:0x0173, B:346:0x017e, B:349:0x019d, B:350:0x0103, B:352:0x010f, B:355:0x011b, B:358:0x0129, B:363:0x0144, B:366:0x0152, B:383:0x0662, B:389:0x06a4, B:391:0x06ae, B:392:0x06bf, B:396:0x06d0, B:401:0x06d8, B:403:0x06f1), top: B:2:0x0008, inners: #2, #3, #5, #8, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04fc A[LOOP:1: B:74:0x0257->B:88:0x04fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04f4 A[SYNTHETIC] */
    @Override // defpackage.nkj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.njw a(byte[] r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlw.a(byte[], int, int):njw");
    }

    @Override // defpackage.nkj
    public final void b(byte[] bArr, int i, int i2, nki nkiVar, lts ltsVar) {
        njt.a(a(bArr, i, i2), nkiVar, ltsVar);
    }

    @Override // defpackage.nkj
    public final /* synthetic */ void c() {
    }
}
