package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgby {
    public static final dgbr a = new dgbr();
    private static SoftReference e;
    public final Context b;
    public final dgbu c;
    public final dgci d;
    private final dgbq f;

    public dgby(Context context, dgbu dgbuVar, dgbq dgbqVar, dgci dgciVar) {
        this.b = context;
        this.c = dgbuVar;
        this.f = dgbqVar;
        this.d = dgciVar;
    }

    public static synchronized dgby c(Context context, dgbu dgbuVar, dgbq dgbqVar, dgci dgciVar) {
        dgby dgbyVar;
        synchronized (dgby.class) {
            SoftReference softReference = e;
            if (softReference != null && (dgbyVar = (dgby) softReference.get()) != null) {
                return dgbyVar;
            }
            dgby dgbyVar2 = new dgby(context, dgbuVar, dgbqVar, dgciVar);
            e = new SoftReference(dgbyVar2);
            return dgbyVar2;
        }
    }

    public final boolean a() {
        SoftReference softReference = e;
        return softReference != null && this == ((dgby) softReference.get());
    }

    public final boolean b(File file) {
        Pair b;
        boolean z = false;
        try {
            dgbq dgbqVar = this.f;
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file.getAbsolutePath(), "r");
                    try {
                        if (randomAccessFile.length() < 22) {
                            b = null;
                        } else {
                            b = qmw.b(randomAccessFile, 0);
                            if (b == null) {
                                b = qmw.b(randomAccessFile, 65535);
                            }
                        }
                        if (b == null) {
                            throw new qms("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                        }
                        ByteBuffer byteBuffer = (ByteBuffer) b.first;
                        long longValue = ((Long) b.second).longValue();
                        long j = (-20) + longValue;
                        if (j >= 0) {
                            randomAccessFile.seek(j);
                            if (randomAccessFile.readInt() == 1347094023) {
                                throw new qms("ZIP64 APK not supported");
                            }
                        }
                        qmw.c(byteBuffer);
                        long a2 = qmw.a(byteBuffer, byteBuffer.position() + 16);
                        if (a2 >= longValue) {
                            throw new qms(a.D(longValue, a2, "ZIP Central Directory offset out of range: ", ". ZIP End of Central Directory offset: "));
                        }
                        qmw.c(byteBuffer);
                        if (qmw.a(byteBuffer, byteBuffer.position() + 12) + a2 != longValue) {
                            throw new qms("ZIP Central Directory is not immediately followed by End of Central Directory");
                        }
                        if (a2 < 32) {
                            throw new qms(a.s(a2, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
                        }
                        ByteBuffer allocate = ByteBuffer.allocate(24);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(a2 - allocate.capacity());
                        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                        if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                            throw new qms("No APK Signing Block before ZIP Central Directory");
                        }
                        long j2 = allocate.getLong(0);
                        if (j2 < allocate.capacity() || j2 > 2147483639) {
                            throw new qms(a.s(j2, "APK Signing Block size out of range: "));
                        }
                        int i = (int) (8 + j2);
                        long j3 = a2 - i;
                        if (j3 < 0) {
                            throw new qms(a.s(j3, "APK Signing Block offset out of range: "));
                        }
                        ByteBuffer allocate2 = ByteBuffer.allocate(i);
                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile.seek(j3);
                        randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                        long j4 = allocate2.getLong(0);
                        if (j4 != j2) {
                            throw new qms(a.D(j2, j4, "APK Signing Block sizes in header and footer do not match: ", " vs "));
                        }
                        Pair create = Pair.create(allocate2, Long.valueOf(j3));
                        ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                        long longValue2 = ((Long) create.second).longValue();
                        if (byteBuffer2.order() != ByteOrder.LITTLE_ENDIAN) {
                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                        }
                        int capacity = byteBuffer2.capacity() - 24;
                        if (capacity < 8) {
                            throw new IllegalArgumentException(a.r(8, capacity, "end < start: ", " < "));
                        }
                        int capacity2 = byteBuffer2.capacity();
                        if (capacity > byteBuffer2.capacity()) {
                            throw new IllegalArgumentException(a.r(capacity2, capacity, "end > capacity: ", " > "));
                        }
                        int limit = byteBuffer2.limit();
                        int position = byteBuffer2.position();
                        try {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(capacity);
                            byteBuffer2.position(8);
                            ByteBuffer slice = byteBuffer2.slice();
                            slice.order(byteBuffer2.order());
                            try {
                                byteBuffer2.position(0);
                                byteBuffer2.limit(limit);
                                byteBuffer2.position(position);
                                int i2 = 0;
                                while (slice.hasRemaining()) {
                                    i2++;
                                    boolean z2 = z;
                                    if (slice.remaining() < 8) {
                                        throw new qms(a.h(i2, "Insufficient data to read size of APK Signing Block entry #"));
                                    }
                                    long j5 = slice.getLong();
                                    if (j5 < 4 || j5 > 2147483647L) {
                                        throw new qms("APK Signing Block entry #" + i2 + " size out of range: " + j5);
                                    }
                                    int i3 = (int) j5;
                                    int position2 = slice.position() + i3;
                                    if (i3 > slice.remaining()) {
                                        throw new qms("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + slice.remaining());
                                    }
                                    if (slice.getInt() == 1896449818) {
                                        X509Certificate[][] b2 = qmv.b(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()), new qmr(qmv.a(slice, i3 - 4), longValue2, a2, longValue, byteBuffer));
                                        randomAccessFile.close();
                                        try {
                                            randomAccessFile.close();
                                        } catch (IOException unused) {
                                        }
                                        if (b2.length != 1) {
                                            throw new GeneralSecurityException("APK has more than one signature.");
                                        }
                                        byte[] digest = MessageDigest.getInstance("SHA-256").digest(b2[z2 ? 1 : 0][z2 ? 1 : 0].getEncoded());
                                        if (!Arrays.equals(((dgbt) dgbqVar).d, digest)) {
                                            if ("user".equals(Build.TYPE)) {
                                                return z2;
                                            }
                                            if (!Arrays.equals(((dgbt) dgbqVar).c, digest)) {
                                                return z2;
                                            }
                                        }
                                        return true;
                                    }
                                    long j6 = longValue2;
                                    long j7 = longValue;
                                    slice.position(position2);
                                    longValue = j7;
                                    longValue2 = j6;
                                    z = z2 ? 1 : 0;
                                }
                                throw new qms("No APK Signature Scheme v2 block in APK Signing Block");
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused2) {
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(limit);
                            byteBuffer2.position(position);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e2) {
                    e = e2;
                    throw new GeneralSecurityException("Failed to verify signatures", e);
                }
            } catch (RuntimeException e3) {
                e = e3;
                throw new GeneralSecurityException("Failed to verify signatures", e);
            } catch (qms e4) {
                throw new GeneralSecurityException("Package is not signed", e4);
            }
        } catch (GeneralSecurityException e5) {
            Log.e("DG", "APK at " + file.getAbsolutePath() + " failed signature verification", e5);
            return false;
        }
    }
}
