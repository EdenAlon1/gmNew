package defpackage;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bih extends FilterOutputStream {
    private static final byte[] a = "Exif\u0000\u0000".getBytes(bib.a);
    private final big b;
    private final byte[] c;
    private final ByteBuffer d;
    private int e;
    private int f;
    private int g;

    public bih(OutputStream outputStream, big bigVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.c = new byte[1];
        this.d = ByteBuffer.allocate(4);
        this.e = 0;
        this.b = bigVar;
    }

    private final int a(int i, byte[] bArr, int i2, int i3) {
        int position = i - this.d.position();
        ByteBuffer byteBuffer = this.d;
        int min = Math.min(i3, position);
        byteBuffer.put(bArr, i2, min);
        return min;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        byte b = (byte) (i & PrivateKeyType.INVALID);
        byte[] bArr = this.c;
        bArr[0] = b;
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x038d, code lost:
    
        r17.out.write(r18, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0392, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x038b, code lost:
    
        if (r3 <= 0) goto L159;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bih.write(byte[], int, int):void");
    }
}
