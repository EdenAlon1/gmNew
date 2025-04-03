package defpackage;

import android.util.Log;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.CRC32;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvt {
    public static ByteBuffer a(Iterable iterable) {
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (iterable.iterator().hasNext()) {
            j += ((eyhs) r1.next()).getSerializedSize() + 12;
            i2++;
        }
        if (i2 == 0) {
            return ByteBuffer.allocate(0);
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) j);
            byte[] array = allocate.array();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                eyhs eyhsVar = (eyhs) it.next();
                int serializedSize = eyhsVar.getSerializedSize();
                try {
                    allocate.putInt(serializedSize);
                    int i3 = i + 4;
                    try {
                        boolean z = eyer.e;
                        eyhsVar.writeTo(new eyeo(array, i3, serializedSize));
                    } catch (IOException e) {
                        Log.e("ProtoLiteUtil", "Exception while writing to buffer.", e);
                    }
                    try {
                        allocate.put(array, i3, serializedSize);
                        int i4 = i3 + serializedSize;
                        CRC32 crc32 = new CRC32();
                        crc32.update(array, i4 - serializedSize, serializedSize);
                        allocate.putLong(crc32.getValue());
                        i = i4 + 8;
                    } catch (BufferOverflowException e2) {
                        c(e2);
                        return null;
                    }
                } catch (BufferOverflowException e3) {
                    c(e3);
                    return null;
                }
            }
            allocate.rewind();
            return allocate;
        } catch (IllegalArgumentException e4) {
            Log.e("ProtoLiteUtil", String.format("Too big to serialize, %s", j > 1073741824 ? String.format(Locale.US, "%.2fGB", Double.valueOf(j / 1.073741824E9d)) : j > 1048576 ? String.format(Locale.US, "%.2fMB", Double.valueOf(j / 1048576.0d)) : j > 1024 ? String.format(Locale.US, "%.2fKB", Double.valueOf(j / 1024.0d)) : String.format(Locale.US, "%d Bytes", Long.valueOf(j))), e4);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1 A[LOOP:0: B:2:0x0017->B:20:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List b(java.nio.ByteBuffer r14, java.lang.Class r15, defpackage.eyhz r16) {
        /*
            java.lang.String r1 = "ProtoLiteUtil"
            java.lang.String r2 = r15.toString()
            int r3 = r14.limit()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r14.limit()
            int r0 = r0 / 1000
            r5 = 1
            int r0 = r0 + r5
            r4.<init>(r0)
        L17:
            int r0 = r14.position()
            if (r0 >= r3) goto Le8
            r6 = 0
            r7 = 0
            int r8 = r14.getInt()     // Catch: java.nio.BufferUnderflowException -> Ld8
            r0 = 2
            if (r8 >= 0) goto L3a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r7] = r14
            r0[r5] = r2
            java.lang.String r14 = "Invalid message size: %d. May have given the wrong message type: %s"
            java.lang.String r14 = java.lang.String.format(r14, r0)
            android.util.Log.e(r1, r14)
            return r6
        L3a:
            int r9 = r14.position()
            int r9 = r9 + r8
            int r9 = r9 + 8
            if (r3 >= r9) goto L5b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r7] = r14
            r0[r5] = r2
            java.lang.String r14 = "Invalid message size: %d (buffer end is %d)"
            java.lang.String r14 = java.lang.String.format(r14, r0)
            android.util.Log.e(r1, r14)
            return r4
        L5b:
            int r9 = r14.position()
            int r9 = r9 + r8
            long r9 = r14.getLong(r9)
            byte[] r11 = r14.array()
            int r12 = r14.arrayOffset()
            int r13 = r14.position()
            int r12 = r12 + r13
            java.util.zip.CRC32 r13 = new java.util.zip.CRC32
            r13.<init>()
            r13.update(r11, r12, r8)
            long r11 = r13.getValue()
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 != 0) goto Lc0
            byte[] r0 = r14.array()
            int r7 = r14.arrayOffset()
            int r9 = r14.position()
            int r7 = r7 + r9
            eyfc r9 = defpackage.eyfc.a     // Catch: defpackage.eygu -> L9d
            eyib r9 = defpackage.eyib.a     // Catch: defpackage.eygu -> L9d
            eyfc r9 = defpackage.eyfc.a     // Catch: defpackage.eygu -> L9d
            r13 = r16
            java.lang.Object r0 = r13.m(r0, r7, r8, r9)     // Catch: defpackage.eygu -> L9b
            goto Lae
        L9b:
            r0 = move-exception
            goto La0
        L9d:
            r0 = move-exception
            r13 = r16
        La0:
            java.lang.String r7 = r15.toString()
            java.lang.String r9 = "Cannot deserialize message of type "
            java.lang.String r7 = r9.concat(r7)
            android.util.Log.e(r1, r7, r0)
            r0 = r6
        Lae:
            if (r0 != 0) goto Lb1
            return r6
        Lb1:
            r4.add(r0)
            int r0 = r14.position()
            int r0 = r0 + r8
            int r0 = r0 + 8
            r14.position(r0)
            goto L17
        Lc0:
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r7] = r14
            r0[r5] = r2
            java.lang.String r14 = "Corrupt protobuf data, expected CRC: %d computed CRC: %d"
            java.lang.String r14 = java.lang.String.format(r14, r0)
            android.util.Log.e(r1, r14)
            return r4
        Ld8:
            r0 = move-exception
            r14 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r7] = r2
            java.lang.String r2 = "Buffer underflow. May have given the wrong message type: %s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            android.util.Log.e(r1, r0, r14)
            return r6
        Le8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxvt.b(java.nio.ByteBuffer, java.lang.Class, eyhz):java.util.List");
    }

    private static void c(BufferOverflowException bufferOverflowException) {
        Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", bufferOverflowException);
    }
}
