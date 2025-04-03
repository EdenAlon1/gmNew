package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfz implements qtw {
    private final List a;
    private final qtw b;
    private final qxd c;

    public rfz(List list, qtw qtwVar, qxd qxdVar) {
        this.a = list;
        this.b = qtwVar;
        this.c = qxdVar;
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(bArr), i, i2, qtuVar);
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        return !((Boolean) qtuVar.b(rfy.b)).booleanValue() && qto.d(this.a, (InputStream) obj, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}
