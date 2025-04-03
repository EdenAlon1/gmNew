package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhza implements Serializable {
    private static final long serialVersionUID = -3464451825208522308L;
    public final Map a = new TreeMap();
    public transient long b;

    public fhza(long j) {
        this.b = j;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.b = objectInputStream.available() != 0 ? objectInputStream.readLong() : 0L;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.b);
    }

    final void a(int i, byte[] bArr, byte[] bArr2, fhzl fhzlVar) {
        Map map = this.a;
        Integer valueOf = Integer.valueOf(i);
    }

    public fhza(fhza fhzaVar, long j) {
        for (Integer num : fhzaVar.a.keySet()) {
            this.a.put(num, new fhyz((fhyz) fhzaVar.a.get(num)));
        }
        this.b = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if ((r20 % ((long) java.lang.Math.pow(r13, r5))) == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fhza(defpackage.fhzu r25, long r26, byte[] r28, byte[] r29) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhza.<init>(fhzu, long, byte[], byte[]):void");
    }
}
