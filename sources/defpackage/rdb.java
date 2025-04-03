package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdb implements ImageHeaderParser {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    static final byte[] b = "MPF".getBytes(Charset.forName("UTF-8"));
    private static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static final ImageHeaderParser.ImageType g(rcz rczVar) {
        try {
            int a2 = rczVar.a();
            if (a2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int d = (a2 << 8) | rczVar.d();
            if (d == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int d2 = (d << 8) | rczVar.d();
            if (d2 == -1991225785) {
                rczVar.c(21L);
                try {
                    return rczVar.d() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (rcy unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (d2 == 1380533830) {
                rczVar.c(4L);
                if (((rczVar.a() << 16) | rczVar.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a3 = (rczVar.a() << 16) | rczVar.a();
                if ((a3 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = a3 & PrivateKeyType.INVALID;
                if (i == 88) {
                    rczVar.c(4L);
                    short d3 = rczVar.d();
                    return (d3 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (d3 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                rczVar.c(4L);
                return (rczVar.d() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((rczVar.a() << 16) | rczVar.a()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a4 = (rczVar.a() << 16) | rczVar.a();
            if (a4 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            boolean z = a4 == 1635150182;
            rczVar.c(4L);
            int i2 = d2 - 16;
            if (i2 % 4 == 0) {
                for (int i3 = 0; i3 < 5 && i2 > 0; i3++) {
                    int a5 = (rczVar.a() << 16) | rczVar.a();
                    if (a5 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    z |= !(a5 != 1635150182);
                    i2 -= 4;
                }
            }
            return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (rcy unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static final boolean h(byte[] bArr, int i, byte[] bArr2) {
        boolean z = bArr2 != null && i > bArr2.length;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    private static final int i(rcz rczVar, int i) {
        short d;
        int a2;
        long j;
        long c2;
        do {
            short d2 = rczVar.d();
            if (d2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", a.h(d2, "Unknown segmentId="));
                }
                return -1;
            }
            d = rczVar.d();
            if (d == 218) {
                return -1;
            }
            if (d == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", a.f(i, "Found MARKER_EOI in ", " segment"));
                }
                return -1;
            }
            a2 = rczVar.a() - 2;
            if (d == i) {
                return a2;
            }
            j = a2;
            c2 = rczVar.c(j);
        } while (c2 == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) d) + ", wanted to skip: " + a2 + ", but actually skipped: " + c2);
        }
        return -1;
    }

    private static final int j(rcz rczVar, qxd qxdVar) {
        ByteOrder byteOrder;
        short b2;
        try {
            int a2 = rczVar.a();
            if ((a2 & 65496) != 65496 && a2 != 19789 && a2 != 18761) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", a.h(a2, "Parser doesn't handle magic number: "));
                }
                return -1;
            }
            int i = i(rczVar, 225);
            if (i == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) qxdVar.a(i, byte[].class);
            try {
                int b3 = rczVar.b(bArr, i);
                if (b3 != i) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", a.r(b3, i, "Unable to read exif segment data, length: ", ", actually read: "));
                    }
                } else if (h(bArr, i, a)) {
                    ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
                    short b4 = rcx.b(6, byteBuffer);
                    if (b4 == 18761) {
                        byteOrder = ByteOrder.LITTLE_ENDIAN;
                    } else if (b4 != 19789) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", a.h(b4, "Unknown endianness = "));
                        }
                        byteOrder = ByteOrder.BIG_ENDIAN;
                    } else {
                        byteOrder = ByteOrder.BIG_ENDIAN;
                    }
                    byteBuffer.order(byteOrder);
                    int a3 = rcx.a(10, byteBuffer);
                    short b5 = rcx.b(a3 + 6, byteBuffer);
                    for (int i2 = 0; i2 < b5; i2++) {
                        int i3 = a3 + 8 + (i2 * 12);
                        if (rcx.b(i3, byteBuffer) == 274) {
                            short b6 = rcx.b(i3 + 2, byteBuffer);
                            if (b6 > 0 && b6 <= 12) {
                                int a4 = rcx.a(i3 + 4, byteBuffer);
                                if (a4 >= 0) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Got tagIndex=" + i2 + " tagType=274 formatCode=" + ((int) b6) + " componentCount=" + a4);
                                    }
                                    int i4 = a4 + c[b6];
                                    if (i4 <= 4) {
                                        int i5 = i3 + 8;
                                        if (i5 >= 0 && i5 <= byteBuffer.remaining()) {
                                            if (i4 >= 0 && i4 + i5 <= byteBuffer.remaining()) {
                                                b2 = rcx.b(i5, byteBuffer);
                                                break;
                                            }
                                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                Log.d("DfltImageHeaderParser", a.h(274, "Illegal number of bytes for TI tag data tagType="));
                                            }
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", a.r(274, i5, "Illegal tagValueOffset=", " tagType="));
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", a.h(b6, "Got byte count > 4, not orientation, continuing, formatCode="));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Negative tiff component count");
                                }
                            }
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", a.h(b6, "Got invalid format code = "));
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                }
                b2 = -1;
                return b2;
            } finally {
                qxdVar.c(bArr);
            }
        } catch (rcy unused) {
            return -1;
        }
    }

    private static final int k(rcz rczVar) {
        return i(rczVar, 226);
    }

    private static final boolean l(rcz rczVar, qxd qxdVar) {
        if (g(rczVar) != ImageHeaderParser.ImageType.JPEG) {
            return false;
        }
        int k = k(rczVar);
        while (k > 0) {
            byte[] bArr = (byte[]) qxdVar.a(k, byte[].class);
            try {
                int b2 = rczVar.b(bArr, k);
                if (b2 != k) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", a.r(b2, k, "Unable to read APP2 segment data, length: ", ", actually read: "));
                    }
                } else if (h(bArr, k, b)) {
                    qxdVar.c(bArr);
                    return true;
                }
                qxdVar.c(bArr);
                k = k(rczVar);
            } catch (Throwable th) {
                qxdVar.c(bArr);
                throw th;
            }
        }
        if (!Log.isLoggable("DfltImageHeaderParser", 2)) {
            return false;
        }
        Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(InputStream inputStream, qxd qxdVar) {
        rkf.f(inputStream);
        rda rdaVar = new rda(inputStream);
        rkf.f(qxdVar);
        return j(rdaVar, qxdVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int b(ByteBuffer byteBuffer, qxd qxdVar) {
        rkf.f(byteBuffer);
        rcw rcwVar = new rcw(byteBuffer);
        rkf.f(qxdVar);
        return j(rcwVar, qxdVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        rkf.f(inputStream);
        return g(new rda(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType d(ByteBuffer byteBuffer) {
        rkf.f(byteBuffer);
        return g(new rcw(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean e(InputStream inputStream, qxd qxdVar) {
        rkf.f(inputStream);
        rda rdaVar = new rda(inputStream);
        rkf.f(qxdVar);
        return l(rdaVar, qxdVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final boolean f(ByteBuffer byteBuffer, qxd qxdVar) {
        rkf.f(byteBuffer);
        rcw rcwVar = new rcw(byteBuffer);
        rkf.f(qxdVar);
        return l(rcwVar, qxdVar);
    }
}
