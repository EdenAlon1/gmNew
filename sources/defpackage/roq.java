package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class roq implements rps {
    public static final byte[] a = {68, 85, 77, 80};
    private final ror b;

    public roq(ror rorVar) {
        this.b = rorVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0237, code lost:
    
        throw new java.lang.RuntimeException("Cannot add value, list full.");
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0255 A[Catch: RuntimeException -> 0x0369, rol -> 0x036b, fhom -> 0x036d, rop -> 0x0382, TryCatch #2 {rop -> 0x0382, blocks: (B:5:0x000c, B:6:0x001a, B:8:0x0020, B:10:0x002c, B:11:0x003b, B:13:0x0042, B:15:0x004c, B:17:0x0065, B:18:0x006a, B:19:0x0073, B:23:0x007d, B:25:0x0085, B:28:0x0106, B:29:0x0108, B:31:0x010b, B:33:0x0115, B:36:0x008e, B:38:0x0094, B:40:0x009a, B:42:0x00a0, B:44:0x00aa, B:45:0x00ae, B:47:0x00b8, B:49:0x00c7, B:50:0x00e0, B:52:0x00ec, B:53:0x00fb, B:54:0x00ff, B:69:0x011b, B:70:0x0130, B:72:0x0136, B:77:0x0297, B:79:0x029d, B:82:0x02a9, B:92:0x0147, B:95:0x014e, B:97:0x0154, B:99:0x015c, B:100:0x0162, B:102:0x016a, B:104:0x0178, B:105:0x0189, B:107:0x0198, B:108:0x01a7, B:110:0x01b0, B:112:0x01b6, B:114:0x01c4, B:117:0x01ca, B:167:0x0242, B:119:0x0248, B:124:0x0273, B:126:0x0269, B:127:0x0270, B:128:0x0255, B:173:0x0181, B:175:0x027b, B:176:0x028c, B:177:0x028d, B:179:0x02b4, B:181:0x02be, B:183:0x02cc, B:185:0x02d2, B:187:0x02de, B:188:0x02ed, B:190:0x02f3, B:192:0x0301, B:194:0x030b, B:196:0x0317, B:198:0x031f, B:200:0x032c, B:202:0x033d, B:203:0x0347, B:204:0x0354, B:205:0x0355, B:206:0x035c, B:207:0x035d, B:208:0x0361, B:209:0x0368), top: B:4:0x000c, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0106 A[Catch: RuntimeException -> 0x036f, rol -> 0x0373, fhom -> 0x0377, rop -> 0x0382, TryCatch #2 {rop -> 0x0382, blocks: (B:5:0x000c, B:6:0x001a, B:8:0x0020, B:10:0x002c, B:11:0x003b, B:13:0x0042, B:15:0x004c, B:17:0x0065, B:18:0x006a, B:19:0x0073, B:23:0x007d, B:25:0x0085, B:28:0x0106, B:29:0x0108, B:31:0x010b, B:33:0x0115, B:36:0x008e, B:38:0x0094, B:40:0x009a, B:42:0x00a0, B:44:0x00aa, B:45:0x00ae, B:47:0x00b8, B:49:0x00c7, B:50:0x00e0, B:52:0x00ec, B:53:0x00fb, B:54:0x00ff, B:69:0x011b, B:70:0x0130, B:72:0x0136, B:77:0x0297, B:79:0x029d, B:82:0x02a9, B:92:0x0147, B:95:0x014e, B:97:0x0154, B:99:0x015c, B:100:0x0162, B:102:0x016a, B:104:0x0178, B:105:0x0189, B:107:0x0198, B:108:0x01a7, B:110:0x01b0, B:112:0x01b6, B:114:0x01c4, B:117:0x01ca, B:167:0x0242, B:119:0x0248, B:124:0x0273, B:126:0x0269, B:127:0x0270, B:128:0x0255, B:173:0x0181, B:175:0x027b, B:176:0x028c, B:177:0x028d, B:179:0x02b4, B:181:0x02be, B:183:0x02cc, B:185:0x02d2, B:187:0x02de, B:188:0x02ed, B:190:0x02f3, B:192:0x0301, B:194:0x030b, B:196:0x0317, B:198:0x031f, B:200:0x032c, B:202:0x033d, B:203:0x0347, B:204:0x0354, B:205:0x0355, B:206:0x035c, B:207:0x035d, B:208:0x0361, B:209:0x0368), top: B:4:0x000c, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0297 A[EXC_TOP_SPLITTER, LOOP:5: B:76:0x0297->B:84:0x0297, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02af A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void b(defpackage.ror r18, defpackage.rox r19, java.lang.String[] r20) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.roq.b(ror, rox, java.lang.String[]):void");
    }

    private static IOException c(String str) {
        roi.d(str);
        throw new IOException(str);
    }

    @Override // defpackage.rps
    public final void a(rpr rprVar) {
        String[] strArr;
        DataInputStream dataInputStream = new DataInputStream(rprVar.a());
        byte[] bArr = new byte[4];
        dataInputStream.readFully(bArr);
        if (!Arrays.equals(a, bArr)) {
            throw c("Incompatible protocol, are you using an old dumpapp script?");
        }
        int readInt = dataInputStream.readInt();
        if (readInt != 1) {
            throw c(a.h(readInt, "Expected version=1; got="));
        }
        rox roxVar = new rox(dataInputStream, rprVar.b());
        synchronized (roxVar) {
            byte a2 = roxVar.a();
            if (a2 != 33) {
                throw new rom(a.h(a2, "Expected enter frame, got: "));
            }
            int b = roxVar.b();
            strArr = new String[b];
            for (int i = 0; i < b; i++) {
                byte[] bArr2 = new byte[roxVar.a.readUnsignedShort()];
                roxVar.a.readFully(bArr2);
                strArr[i] = new String(bArr2, Charset.forName("UTF-8"));
            }
        }
        b(this.b, roxVar, strArr);
    }
}
