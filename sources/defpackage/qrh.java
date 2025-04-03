package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qrh implements qrd {
    private static final String k = "qrh";
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public Bitmap g;
    public Boolean h;
    public final rfn j;
    private int[] l;
    private short[] n;
    private byte[] o;
    private byte[] p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private final int[] m = new int[256];
    public Bitmap.Config i = Bitmap.Config.ARGB_8888;
    public qrf f = new qrf();

    public qrh(rfn rfnVar, qrf qrfVar, ByteBuffer byteBuffer, int i) {
        this.j = rfnVar;
        c(qrfVar, byteBuffer, i);
    }

    private final int d() {
        return this.a.get() & 255;
    }

    private final Bitmap e() {
        Boolean bool = this.h;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.i;
        Bitmap b = this.j.a.b(this.u, this.t, config);
        b.setHasAlpha(true);
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f6, code lost:
    
        if (r0.j == r3.h) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04bc A[Catch: all -> 0x050a, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0011, B:8:0x003c, B:13:0x0046, B:15:0x004f, B:16:0x0057, B:18:0x0069, B:19:0x0075, B:21:0x0079, B:22:0x007d, B:24:0x0081, B:26:0x0089, B:27:0x009a, B:31:0x009e, B:33:0x00a2, B:35:0x00b5, B:37:0x00b9, B:38:0x00bf, B:40:0x00c3, B:42:0x00c7, B:43:0x00cc, B:45:0x00d3, B:47:0x00d7, B:49:0x00db, B:51:0x00e0, B:54:0x00e6, B:56:0x00ea, B:58:0x00f2, B:60:0x00f9, B:61:0x010d, B:63:0x0111, B:65:0x0116, B:67:0x011b, B:71:0x0121, B:73:0x0125, B:75:0x0136, B:77:0x013f, B:78:0x014c, B:80:0x0150, B:82:0x015b, B:84:0x0163, B:85:0x0167, B:87:0x016d, B:88:0x0171, B:90:0x0177, B:91:0x017d, B:93:0x0194, B:95:0x01a0, B:99:0x01c1, B:146:0x01e6, B:147:0x02a6, B:149:0x02af, B:152:0x02b7, B:154:0x02cd, B:158:0x02eb, B:160:0x02f3, B:162:0x02f7, B:164:0x02fb, B:169:0x0302, B:172:0x030a, B:174:0x030e, B:178:0x0322, B:179:0x04b8, B:181:0x04bc, B:185:0x04c3, B:187:0x04c7, B:188:0x04cd, B:189:0x04dd, B:193:0x0317, B:200:0x032a, B:202:0x0351, B:205:0x0359, B:212:0x037e, B:213:0x0385, B:215:0x0389, B:222:0x03a3, B:224:0x03ae, B:226:0x03bc, B:229:0x03b5, B:234:0x0496, B:235:0x03c1, B:237:0x03ca, B:238:0x03de, B:240:0x03e4, B:243:0x03ed, B:245:0x03f8, B:247:0x0414, B:251:0x041b, B:252:0x041e, B:254:0x0423, B:257:0x042c, B:259:0x0437, B:261:0x0455, B:269:0x0478, B:271:0x0486, B:274:0x047f, B:278:0x0464, B:293:0x04a6, B:297:0x04b2, B:298:0x04ae, B:104:0x01f3, B:107:0x0210, B:111:0x0231, B:113:0x023b, B:118:0x024c, B:121:0x0256, B:123:0x025f, B:125:0x026b, B:129:0x027c, B:132:0x0289, B:299:0x01ce, B:303:0x0153, B:304:0x0147, B:306:0x04ee, B:308:0x04f7, B:311:0x0015, B:313:0x001d, B:314:0x003a), top: B:3:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111 A[Catch: all -> 0x050a, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0011, B:8:0x003c, B:13:0x0046, B:15:0x004f, B:16:0x0057, B:18:0x0069, B:19:0x0075, B:21:0x0079, B:22:0x007d, B:24:0x0081, B:26:0x0089, B:27:0x009a, B:31:0x009e, B:33:0x00a2, B:35:0x00b5, B:37:0x00b9, B:38:0x00bf, B:40:0x00c3, B:42:0x00c7, B:43:0x00cc, B:45:0x00d3, B:47:0x00d7, B:49:0x00db, B:51:0x00e0, B:54:0x00e6, B:56:0x00ea, B:58:0x00f2, B:60:0x00f9, B:61:0x010d, B:63:0x0111, B:65:0x0116, B:67:0x011b, B:71:0x0121, B:73:0x0125, B:75:0x0136, B:77:0x013f, B:78:0x014c, B:80:0x0150, B:82:0x015b, B:84:0x0163, B:85:0x0167, B:87:0x016d, B:88:0x0171, B:90:0x0177, B:91:0x017d, B:93:0x0194, B:95:0x01a0, B:99:0x01c1, B:146:0x01e6, B:147:0x02a6, B:149:0x02af, B:152:0x02b7, B:154:0x02cd, B:158:0x02eb, B:160:0x02f3, B:162:0x02f7, B:164:0x02fb, B:169:0x0302, B:172:0x030a, B:174:0x030e, B:178:0x0322, B:179:0x04b8, B:181:0x04bc, B:185:0x04c3, B:187:0x04c7, B:188:0x04cd, B:189:0x04dd, B:193:0x0317, B:200:0x032a, B:202:0x0351, B:205:0x0359, B:212:0x037e, B:213:0x0385, B:215:0x0389, B:222:0x03a3, B:224:0x03ae, B:226:0x03bc, B:229:0x03b5, B:234:0x0496, B:235:0x03c1, B:237:0x03ca, B:238:0x03de, B:240:0x03e4, B:243:0x03ed, B:245:0x03f8, B:247:0x0414, B:251:0x041b, B:252:0x041e, B:254:0x0423, B:257:0x042c, B:259:0x0437, B:261:0x0455, B:269:0x0478, B:271:0x0486, B:274:0x047f, B:278:0x0464, B:293:0x04a6, B:297:0x04b2, B:298:0x04ae, B:104:0x01f3, B:107:0x0210, B:111:0x0231, B:113:0x023b, B:118:0x024c, B:121:0x0256, B:123:0x025f, B:125:0x026b, B:129:0x027c, B:132:0x0289, B:299:0x01ce, B:303:0x0153, B:304:0x0147, B:306:0x04ee, B:308:0x04f7, B:311:0x0015, B:313:0x001d, B:314:0x003a), top: B:3:0x0009 }] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17, types: [short] */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // defpackage.qrd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.Bitmap a() {
        /*
            Method dump skipped, instructions count: 1293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrh.a():android.graphics.Bitmap");
    }

    @Override // defpackage.qrd
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }

    public final synchronized void c(qrf qrfVar, ByteBuffer byteBuffer, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.h(i, "Sample size must be >=0, not: "));
        }
        int highestOneBit = Integer.highestOneBit(i);
        this.r = 0;
        this.f = qrfVar;
        this.e = -1;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.a = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.q = false;
        Iterator it = qrfVar.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((qre) it.next()).g == 3) {
                this.q = true;
                break;
            }
        }
        this.s = highestOneBit;
        int i2 = qrfVar.f;
        this.u = i2 / highestOneBit;
        int i3 = qrfVar.g;
        this.t = i3 / highestOneBit;
        this.c = this.j.c(i2 * i3);
        rfn rfnVar = this.j;
        int i4 = this.u * this.t;
        qxd qxdVar = rfnVar.b;
        this.d = qxdVar == null ? new int[i4] : (int[]) qxdVar.a(i4, int[].class);
    }
}
