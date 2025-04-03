package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffad extends InputStream implements InputStreamRetargetInterface, feac {
    public eyhs a;
    public final eyhz b;
    public ByteArrayInputStream c;

    public ffad(eyhs eyhsVar, eyhz eyhzVar) {
        this.a = eyhsVar;
        this.b = eyhzVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        eyhs eyhsVar = this.a;
        if (eyhsVar != null) {
            return eyhsVar.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        eyhs eyhsVar = this.a;
        if (eyhsVar != null) {
            this.c = new ByteArrayInputStream(eyhsVar.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        eyhs eyhsVar = this.a;
        if (eyhsVar != null) {
            int serializedSize = eyhsVar.getSerializedSize();
            if (serializedSize == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= serializedSize) {
                boolean z = eyer.e;
                eyeo eyeoVar = new eyeo(bArr, i, serializedSize);
                this.a.writeTo(eyeoVar);
                eyeoVar.ac();
                this.a = null;
                this.c = null;
                return serializedSize;
            }
            this.c = new ByteArrayInputStream(this.a.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
