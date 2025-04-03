package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoen {
    public static final byte[] a(File file) {
        eoel eoelVar = new eoel();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            eoelVar.a(fileInputStream);
            long size = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size();
            int i = eoej.a;
            emxf.e(size >= 0, "expectedSize (%s) must be non-negative", size);
            if (size > 2147483639) {
                throw new OutOfMemoryError(size + " bytes is too large to fit in a byte array");
            }
            int i2 = (int) size;
            byte[] bArr = new byte[i2];
            int i3 = i2;
            while (true) {
                if (i3 > 0) {
                    int i4 = i2 - i3;
                    int read = fileInputStream.read(bArr, i4, i3);
                    if (read == -1) {
                        bArr = Arrays.copyOf(bArr, i4);
                        break;
                    }
                    i3 -= read;
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        ArrayDeque arrayDeque = new ArrayDeque(22);
                        arrayDeque.add(bArr);
                        arrayDeque.add(new byte[]{(byte) read2});
                        bArr = eoej.c(fileInputStream, arrayDeque, i2 + 1);
                    }
                }
            }
            return bArr;
        } catch (Throwable th) {
            try {
                eoelVar.a = th;
                emyt.d(th, IOException.class);
                emyt.e(th);
                throw new RuntimeException(th);
            } finally {
                eoelVar.close();
            }
        }
    }
}
