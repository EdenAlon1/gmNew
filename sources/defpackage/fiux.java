package defpackage;

import java.io.DataInput;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiux {
    static long a(DataInput dataInput) {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i == 1) {
            readUnsignedByte = dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        } else if (i == 2) {
            readUnsignedByte = ((readUnsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
            j = 1000;
        } else {
            if (i == 3) {
                return dataInput.readLong();
            }
            readUnsignedByte = (readUnsignedByte2 << 26) >> 26;
            j = 1800000;
        }
        return readUnsignedByte * j;
    }

    public static firk b(DataInput dataInput, String str) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 67) {
            return new fius(fiuv.n(dataInput, str));
        }
        if (readUnsignedByte == 70) {
            fiuz fiuzVar = new fiuz(str, dataInput.readUTF(), (int) a(dataInput), (int) a(dataInput));
            return fiuzVar.equals(firk.a) ? firk.a : fiuzVar;
        }
        if (readUnsignedByte == 80) {
            return fiuv.n(dataInput, str);
        }
        throw new IOException("Invalid encoding");
    }
}
