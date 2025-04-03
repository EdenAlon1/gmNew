package defpackage;

import android.util.Pair;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhc {
    public byte[] P;
    public ndv V;
    public boolean W;
    public ndu Z;
    public boolean a;
    public int aa;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public byte[] j;
    public ndt k;
    public byte[] l;
    public lpw m;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = 0;
    public int t = -1;
    public float u = 0.0f;
    public float v = 0.0f;
    public float w = 0.0f;
    public byte[] x = null;
    public int y = -1;
    public boolean z = false;
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = 1000;
    public int E = BasePaymentResult.ERROR_REQUEST_FAILED;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public float N = -1.0f;
    public float O = -1.0f;
    public int Q = 1;
    public int R = -1;
    public int S = 8000;
    public long T = 0;
    public long U = 0;
    public boolean X = true;
    public String Y = "eng";

    protected nhc() {
    }

    public static Pair a(luv luvVar) {
        try {
            luvVar.L(16);
            long p = luvVar.p();
            if (p == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (p == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (p != 826496599) {
                luj.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int i = luvVar.b + 20;
            byte[] bArr = luvVar.a;
            while (true) {
                int length = bArr.length;
                if (i >= length - 4) {
                    throw new lrg("Failed to find FourCC VC1 initialization data", null, true, 1);
                }
                int i2 = i + 1;
                if (bArr[i] == 0 && bArr[i2] == 0 && bArr[i + 2] == 1 && bArr[i + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, i, length)));
                }
                i = i2;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new lrg("Error parsing FourCC private data", null, true, 1);
        }
    }

    public static List b(byte[] bArr) {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw new lrg("Error parsing vorbis codec private", null, true, 1);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & PrivateKeyType.INVALID;
                if (i != 255) {
                    break;
                }
                i3 += PrivateKeyType.INVALID;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & PrivateKeyType.INVALID;
                if (i2 != 255) {
                    break;
                }
                i7 += PrivateKeyType.INVALID;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw new lrg("Error parsing vorbis codec private", null, true, 1);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw new lrg("Error parsing vorbis codec private", null, true, 1);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw new lrg("Error parsing vorbis codec private", null, true, 1);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new lrg("Error parsing vorbis codec private", null, true, 1);
        }
    }

    public static boolean d(luv luvVar) {
        try {
            int h = luvVar.h();
            if (h == 1) {
                return true;
            }
            if (h == 65534) {
                luvVar.K(24);
                if (luvVar.q() == nhd.b.getMostSignificantBits()) {
                    if (luvVar.q() == nhd.b.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new lrg("Error parsing MS/ACM codec private", null, true, 1);
        }
    }

    public final void c() {
        lti.f(this.Z);
    }

    public final byte[] e(String str) {
        byte[] bArr = this.l;
        if (bArr != null) {
            return bArr;
        }
        throw new lrg("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null, true, 1);
    }
}
