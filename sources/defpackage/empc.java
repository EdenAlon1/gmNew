package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class empc implements empj {
    private final engw a;
    private final emrc b;

    public empc(engw engwVar, emrc emrcVar) {
        if (engwVar == null || engwVar.isEmpty()) {
            throw new IllegalStateException("ModelBasedProvider must be initialized with a model.");
        }
        this.a = engwVar;
        this.b = emrcVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x0240. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x020e A[Catch: Exception -> 0x0da2, TryCatch #0 {Exception -> 0x0da2, blocks: (B:14:0x0046, B:15:0x004c, B:17:0x0052, B:19:0x005c, B:20:0x005e, B:22:0x0064, B:23:0x0066, B:24:0x006e, B:26:0x0074, B:29:0x009c, B:31:0x00ad, B:33:0x00c6, B:38:0x00eb, B:39:0x0207, B:41:0x020e, B:43:0x0218, B:44:0x021a, B:60:0x0240, B:61:0x0243, B:63:0x0248, B:64:0x02a3, B:66:0x02bd, B:67:0x02d0, B:68:0x02c2, B:69:0x031d, B:70:0x0362, B:71:0x03a5, B:73:0x03a9, B:74:0x03c3, B:76:0x03c9, B:78:0x03dc, B:79:0x03e0, B:81:0x03e6, B:86:0x03fd, B:88:0x0401, B:89:0x0408, B:95:0x0b8a, B:99:0x0496, B:101:0x04c8, B:102:0x04e4, B:103:0x053a, B:105:0x0550, B:107:0x0560, B:109:0x056c, B:111:0x0604, B:114:0x0614, B:115:0x062a, B:118:0x06a6, B:120:0x06ca, B:122:0x06de, B:124:0x06f3, B:127:0x06f8, B:128:0x0746, B:130:0x079f, B:131:0x0814, B:133:0x085e, B:134:0x08b0, B:136:0x0937, B:138:0x0970, B:141:0x097e, B:144:0x09a9, B:147:0x099f, B:148:0x0a15, B:150:0x0a86, B:151:0x0af9, B:154:0x00d2, B:156:0x00da, B:158:0x00e2, B:161:0x00f9, B:162:0x0103, B:164:0x0109, B:166:0x0123, B:168:0x0147, B:173:0x0186, B:174:0x0156, B:176:0x0160, B:178:0x0164, B:179:0x016c, B:180:0x017f, B:188:0x0195, B:190:0x01a6, B:192:0x01b3, B:193:0x01bf, B:195:0x01c7, B:196:0x01d3, B:198:0x01db, B:199:0x01e7, B:201:0x01eb, B:203:0x01f3, B:204:0x01ff, B:206:0x0b9c, B:207:0x0ba3, B:212:0x0d8b, B:214:0x0bad, B:216:0x0bc5, B:218:0x0bcf, B:219:0x0c2e, B:221:0x0c36, B:223:0x0cd7, B:224:0x0ce4, B:226:0x0cf0, B:227:0x0cfd, B:229:0x0d09, B:230:0x0d16, B:232:0x0d22, B:233:0x0d2f, B:235:0x0d3b, B:236:0x0d48, B:237:0x0d68), top: B:13:0x0046 }] */
    @Override // defpackage.empj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(defpackage.fbts r37, java.util.Locale r38) {
        /*
            Method dump skipped, instructions count: 3530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.empc.a(fbts, java.util.Locale):java.util.ArrayList");
    }

    @Override // defpackage.empj
    public final void b() {
        int i = 0;
        while (true) {
            engw engwVar = this.a;
            if (i >= ((enou) engwVar).c) {
                return;
            }
            ((emnk) engwVar.get(i)).b();
            i++;
        }
    }
}
