package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efzz {
    public final egac a;

    public efzz(egac egacVar) {
        this.a = egacVar;
    }

    public final Bitmap a(Uri uri) {
        DataInputStream dataInputStream = new DataInputStream(eepn.b(this.a.a, uri, eepm.c));
        try {
            byte[] bArr = new byte[dataInputStream.readInt()];
            int readInt = dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
            dataInputStream.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
            createBitmap.copyPixelsFromBuffer(wrap);
            dataInputStream.close();
            return createBitmap;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(Bitmap bitmap, Uri uri) {
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        DataOutputStream dataOutputStream = new DataOutputStream(this.a.a(uri));
        try {
            dataOutputStream.writeInt(array.length);
            dataOutputStream.writeInt(bitmap.getWidth());
            dataOutputStream.writeInt(bitmap.getHeight());
            dataOutputStream.writeUTF(bitmap.getConfig().toString());
            dataOutputStream.write(array);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
