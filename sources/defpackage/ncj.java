package defpackage;

import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncj implements nct {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final nci c = new nci(new nch() { // from class: ncf
        @Override // defpackage.nch
        public final Constructor a() {
            int i = ncj.a;
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(nco.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final nci d = new nci(new nch() { // from class: ncg
        @Override // defpackage.nch
        public final Constructor a() {
            int i = ncj.a;
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(nco.class).getConstructor(new Class[0]);
        }
    });
    private engw e;
    private int h;
    private nkh g = new njs();
    private boolean f = true;

    private final void e(int i, List list) {
        switch (i) {
            case 0:
                list.add(new nms());
                break;
            case 1:
                list.add(new nmu());
                break;
            case 2:
                list.add(new nmw(null));
                break;
            case 3:
                list.add(new neb(null));
                break;
            case 4:
                nco a2 = c.a(0);
                if (a2 == null) {
                    list.add(new ner(null));
                    break;
                } else {
                    list.add(a2);
                    break;
                }
            case 5:
                list.add(new net());
                break;
            case 6:
                list.add(new nhd(new nha(), true != this.f ? 2 : 0, this.g));
                break;
            case 7:
                list.add(new nhj(null));
                break;
            case 8:
                nkh nkhVar = this.g;
                int i2 = true != this.f ? 32 : 0;
                int i3 = engw.d;
                list.add(new nif(nkhVar, i2, enou.a));
                list.add(new nil(this.g, true != this.f ? 16 : 0));
                break;
            case 9:
                list.add(new njb());
                break;
            case 10:
                list.add(new nnz());
                break;
            case 11:
                if (this.e == null) {
                    int i4 = engw.d;
                    this.e = enou.a;
                }
                list.add(new noj(!this.f ? 1 : 0, this.g, new lvc(0L), new nmy(this.e)));
                break;
            case 12:
                list.add(new not());
                break;
            case 14:
                list.add(new nez(this.h));
                break;
            case 15:
                nco a3 = d.a(new Object[0]);
                if (a3 != null) {
                    list.add(a3);
                    break;
                }
                break;
            case 16:
                list.add(new nef(!this.f ? 1 : 0, this.g));
                break;
            case 17:
                list.add(new njl());
                break;
            case 18:
                list.add(new noy());
                break;
            case 19:
                list.add(new nen());
                break;
            case 20:
                list.add(new ney());
                break;
            case 21:
                list.add(new nem());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01fb A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fb, B:15:0x01fe, B:20:0x03c3, B:21:0x03c6, B:23:0x03cb, B:26:0x03d1, B:28:0x03d4, B:32:0x03d7, B:37:0x0207, B:39:0x020f, B:42:0x0219, B:45:0x0225, B:47:0x022d, B:50:0x0237, B:53:0x0242, B:56:0x024d, B:59:0x0258, B:61:0x0260, B:63:0x0268, B:66:0x0272, B:68:0x0280, B:71:0x028a, B:74:0x0295, B:76:0x029d, B:78:0x02ab, B:80:0x02b9, B:83:0x02c9, B:85:0x02d7, B:88:0x02e1, B:90:0x02e9, B:92:0x02f1, B:94:0x02f9, B:97:0x0303, B:99:0x030b, B:102:0x031b, B:104:0x0323, B:107:0x032d, B:109:0x0335, B:112:0x033f, B:114:0x0347, B:117:0x0350, B:120:0x035c, B:123:0x0368, B:126:0x0374, B:128:0x037c, B:131:0x0385, B:133:0x038d, B:136:0x0396, B:152:0x0048, B:153:0x0050, B:156:0x01c1, B:179:0x0055, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b2, B:206:0x00be, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010d, B:230:0x0119, B:233:0x0125, B:236:0x0131, B:239:0x013d, B:242:0x0149, B:245:0x0155, B:248:0x0161, B:251:0x016c, B:254:0x0177, B:257:0x0182, B:260:0x018d, B:263:0x0198, B:266:0x01a2, B:269:0x01ac, B:272:0x01b6), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0048 A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fb, B:15:0x01fe, B:20:0x03c3, B:21:0x03c6, B:23:0x03cb, B:26:0x03d1, B:28:0x03d4, B:32:0x03d7, B:37:0x0207, B:39:0x020f, B:42:0x0219, B:45:0x0225, B:47:0x022d, B:50:0x0237, B:53:0x0242, B:56:0x024d, B:59:0x0258, B:61:0x0260, B:63:0x0268, B:66:0x0272, B:68:0x0280, B:71:0x028a, B:74:0x0295, B:76:0x029d, B:78:0x02ab, B:80:0x02b9, B:83:0x02c9, B:85:0x02d7, B:88:0x02e1, B:90:0x02e9, B:92:0x02f1, B:94:0x02f9, B:97:0x0303, B:99:0x030b, B:102:0x031b, B:104:0x0323, B:107:0x032d, B:109:0x0335, B:112:0x033f, B:114:0x0347, B:117:0x0350, B:120:0x035c, B:123:0x0368, B:126:0x0374, B:128:0x037c, B:131:0x0385, B:133:0x038d, B:136:0x0396, B:152:0x0048, B:153:0x0050, B:156:0x01c1, B:179:0x0055, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b2, B:206:0x00be, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010d, B:230:0x0119, B:233:0x0125, B:236:0x0131, B:239:0x013d, B:242:0x0149, B:245:0x0155, B:248:0x0161, B:251:0x016c, B:254:0x0177, B:257:0x0182, B:260:0x018d, B:263:0x0198, B:266:0x01a2, B:269:0x01ac, B:272:0x01b6), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03cb A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fb, B:15:0x01fe, B:20:0x03c3, B:21:0x03c6, B:23:0x03cb, B:26:0x03d1, B:28:0x03d4, B:32:0x03d7, B:37:0x0207, B:39:0x020f, B:42:0x0219, B:45:0x0225, B:47:0x022d, B:50:0x0237, B:53:0x0242, B:56:0x024d, B:59:0x0258, B:61:0x0260, B:63:0x0268, B:66:0x0272, B:68:0x0280, B:71:0x028a, B:74:0x0295, B:76:0x029d, B:78:0x02ab, B:80:0x02b9, B:83:0x02c9, B:85:0x02d7, B:88:0x02e1, B:90:0x02e9, B:92:0x02f1, B:94:0x02f9, B:97:0x0303, B:99:0x030b, B:102:0x031b, B:104:0x0323, B:107:0x032d, B:109:0x0335, B:112:0x033f, B:114:0x0347, B:117:0x0350, B:120:0x035c, B:123:0x0368, B:126:0x0374, B:128:0x037c, B:131:0x0385, B:133:0x038d, B:136:0x0396, B:152:0x0048, B:153:0x0050, B:156:0x01c1, B:179:0x0055, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b2, B:206:0x00be, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010d, B:230:0x0119, B:233:0x0125, B:236:0x0131, B:239:0x013d, B:242:0x0149, B:245:0x0155, B:248:0x0161, B:251:0x016c, B:254:0x0177, B:257:0x0182, B:260:0x018d, B:263:0x0198, B:266:0x01a2, B:269:0x01ac, B:272:0x01b6), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0207 A[Catch: all -> 0x03e5, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:9:0x001e, B:14:0x01fb, B:15:0x01fe, B:20:0x03c3, B:21:0x03c6, B:23:0x03cb, B:26:0x03d1, B:28:0x03d4, B:32:0x03d7, B:37:0x0207, B:39:0x020f, B:42:0x0219, B:45:0x0225, B:47:0x022d, B:50:0x0237, B:53:0x0242, B:56:0x024d, B:59:0x0258, B:61:0x0260, B:63:0x0268, B:66:0x0272, B:68:0x0280, B:71:0x028a, B:74:0x0295, B:76:0x029d, B:78:0x02ab, B:80:0x02b9, B:83:0x02c9, B:85:0x02d7, B:88:0x02e1, B:90:0x02e9, B:92:0x02f1, B:94:0x02f9, B:97:0x0303, B:99:0x030b, B:102:0x031b, B:104:0x0323, B:107:0x032d, B:109:0x0335, B:112:0x033f, B:114:0x0347, B:117:0x0350, B:120:0x035c, B:123:0x0368, B:126:0x0374, B:128:0x037c, B:131:0x0385, B:133:0x038d, B:136:0x0396, B:152:0x0048, B:153:0x0050, B:156:0x01c1, B:179:0x0055, B:182:0x0061, B:185:0x006c, B:188:0x0078, B:191:0x0084, B:194:0x008f, B:197:0x009b, B:200:0x00a6, B:203:0x00b2, B:206:0x00be, B:209:0x00c9, B:212:0x00d5, B:215:0x00e0, B:218:0x00eb, B:221:0x00f6, B:224:0x0102, B:227:0x010d, B:230:0x0119, B:233:0x0125, B:236:0x0131, B:239:0x013d, B:242:0x0149, B:245:0x0155, B:248:0x0161, B:251:0x016c, B:254:0x0177, B:257:0x0182, B:260:0x018d, B:263:0x0198, B:266:0x01a2, B:269:0x01ac, B:272:0x01b6), top: B:3:0x0003 }] */
    @Override // defpackage.nct
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.nco[] a(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncj.a(android.net.Uri, java.util.Map):nco[]");
    }

    @Deprecated
    public final synchronized void b(boolean z) {
        this.f = z;
    }

    public final synchronized void c() {
        this.h = 1;
    }

    public final synchronized void d(nkh nkhVar) {
        this.g = nkhVar;
    }
}
