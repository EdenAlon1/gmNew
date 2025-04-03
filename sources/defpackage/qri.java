package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.OutputStream;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qri {
    public int a;
    public OutputStream e;
    public Bitmap f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    private int l;
    private int m;
    private int n;
    private boolean q;
    public int b = -1;
    public int c = 0;
    public boolean d = false;
    private final boolean[] o = new boolean[256];
    private int p = 7;
    public boolean j = true;
    public int k = 10;

    private final void c() {
        OutputStream outputStream = this.e;
        byte[] bArr = this.i;
        int length = bArr.length;
        outputStream.write(bArr, 0, 768);
        int length2 = this.i.length;
    }

    private final void d(int i) {
        this.e.write(i & PrivateKeyType.INVALID);
        this.e.write((i >> 8) & PrivateKeyType.INVALID);
    }

    public final void a(String str) {
        for (int i = 0; i < str.length(); i++) {
            this.e.write((byte) str.charAt(i));
        }
    }

    public final void b(Bitmap bitmap) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!this.d) {
            return;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.l = width;
            this.m = height;
            this.f = bitmap;
            int width2 = bitmap.getWidth();
            int height2 = this.f.getHeight();
            int i8 = this.l;
            if (width2 != i8 || height2 != this.m) {
                Bitmap createBitmap = Bitmap.createBitmap(i8, this.m, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                this.f = createBitmap;
            }
            int i9 = width2 * height2;
            int[] iArr = new int[i9];
            this.f.getPixels(iArr, 0, width2, 0, 0, width2, height2);
            this.g = new byte[i9 * 3];
            this.q = false;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < i9; i12++) {
                int i13 = iArr[i12];
                if (i13 == 0) {
                    i10++;
                    i13 = 0;
                }
                byte[] bArr = this.g;
                bArr[i11] = (byte) (i13 & PrivateKeyType.INVALID);
                int i14 = i11 + 2;
                bArr[i11 + 1] = (byte) ((i13 >> 8) & PrivateKeyType.INVALID);
                i11 += 3;
                bArr[i14] = (byte) (255 & (i13 >> 16));
            }
            double d = (i10 * 100) / i9;
            this.q = d > 4.0d;
            if (Log.isLoggable("AnimatedGifEncoder", 3)) {
                Log.d("AnimatedGifEncoder", "got pixels for frame with " + d + "% transparent pixels");
            }
            byte[] bArr2 = this.g;
            int length = bArr2.length;
            int i15 = length / 3;
            this.h = new byte[i15];
            int i16 = this.k;
            int[] iArr2 = new int[256];
            int[] iArr3 = new int[256];
            int[] iArr4 = new int[256];
            int[] iArr5 = new int[32];
            int[][] iArr6 = new int[256][];
            for (int i17 = 0; i17 < 256; i17++) {
                iArr6[i17] = new int[]{r6, r6, r6, 0};
                int i18 = (i17 << 12) / 256;
                iArr4[i17] = 256;
                iArr3[i17] = 0;
            }
            int i19 = 1;
            int i20 = 1509;
            if (length < 1509) {
                i16 = 1;
            }
            int i21 = ((i16 - 1) / 3) + 30;
            int i22 = length / (i16 * 3);
            int i23 = i22 / 100;
            int i24 = 0;
            for (int i25 = 32; i24 < i25; i25 = 32) {
                iArr5[i24] = (((1024 - (i24 * i24)) * 256) / 1024) * 1024;
                i24++;
            }
            if (length < 1509) {
                i20 = 3;
            } else if (length % 499 != 0) {
                i20 = 1497;
            } else if (length % 491 != 0) {
                i20 = 1473;
            } else if (length % 487 != 0) {
                i20 = 1461;
            }
            int i26 = 2048;
            int i27 = 1024;
            int i28 = 0;
            int i29 = 0;
            int i30 = i23;
            int i31 = 32;
            while (i28 < i22) {
                byte[] bArr3 = bArr2;
                int i32 = (bArr2[i29] & 255) << 4;
                int i33 = i20;
                int i34 = (bArr3[i29 + 1] & 255) << 4;
                int i35 = (bArr3[i29 + 2] & 255) << 4;
                int i36 = Alert.DURATION_SHOW_INDEFINITELY;
                int i37 = Integer.MAX_VALUE;
                int[][] iArr7 = iArr6;
                int i38 = i21;
                int i39 = 0;
                int i40 = -1;
                int i41 = -1;
                while (i39 < 256) {
                    int[] iArr8 = iArr7[i39];
                    int i42 = i39;
                    int i43 = iArr8[0] - i32;
                    if (i43 < 0) {
                        i43 = -i43;
                    }
                    int i44 = i43;
                    int i45 = iArr8[i19] - i34;
                    if (i45 < 0) {
                        i45 = -i45;
                    }
                    int i46 = i44 + i45;
                    int i47 = iArr8[2] - i35;
                    if (i47 < 0) {
                        i47 = -i47;
                    }
                    int i48 = i46 + i47;
                    int i49 = i48 < i36 ? i48 : i36;
                    if (i48 < i36) {
                        i40 = i42;
                    }
                    int i50 = iArr3[i42];
                    int i51 = i48 - (i50 >> 12);
                    int i52 = i51 < i37 ? i51 : i37;
                    if (i51 < i37) {
                        i41 = i42;
                    }
                    int i53 = iArr4[i42];
                    int i54 = i53 >> 10;
                    iArr4[i42] = i53 - i54;
                    iArr3[i42] = i50 + (i54 << 10);
                    i39 = i42 + 1;
                    i36 = i49;
                    i37 = i52;
                }
                iArr4[i40] = iArr4[i40] + 64;
                iArr3[i40] = iArr3[i40] - 65536;
                int[] iArr9 = iArr7[i41];
                int i55 = iArr9[0];
                iArr9[0] = i55 - (((i55 - i32) * i27) / 1024);
                int i56 = iArr9[i19];
                iArr9[i19] = i56 - (((i56 - i34) * i27) / 1024);
                int i57 = iArr9[2];
                iArr9[2] = i57 - (((i57 - i35) * i27) / 1024);
                if (i31 != 0) {
                    int i58 = i41 - i31;
                    int i59 = i41 + i31;
                    int i60 = i41 + 1;
                    int i61 = i19;
                    int i62 = i41 - 1;
                    i5 = i28;
                    while (true) {
                        if (i59 > 256) {
                            i7 = i59;
                            i6 = 256;
                        } else {
                            i6 = i59;
                            i7 = i6;
                        }
                        int i63 = i58 < -1 ? -1 : i58;
                        if (i60 >= i6 && i62 <= i63) {
                            break;
                        }
                        int i64 = i61 + 1;
                        int i65 = iArr5[i61];
                        if (i60 < i6) {
                            int i66 = i60 + 1;
                            int[] iArr10 = iArr7[i60];
                            try {
                                int i67 = iArr10[0];
                                iArr10[0] = i67 - (((i67 - i32) * i65) / 262144);
                                int i68 = iArr10[i19];
                                iArr10[i19] = i68 - (((i68 - i34) * i65) / 262144);
                                int i69 = iArr10[2];
                                iArr10[2] = i69 - (((i69 - i35) * i65) / 262144);
                            } catch (Exception unused) {
                            }
                            i60 = i66;
                        }
                        if (i62 > i63) {
                            int i70 = i62 - 1;
                            int[] iArr11 = iArr7[i62];
                            try {
                                int i71 = iArr11[0];
                                iArr11[0] = i71 - (((i71 - i32) * i65) / 262144);
                                int i72 = iArr11[i19];
                                iArr11[i19] = i72 - (((i72 - i34) * i65) / 262144);
                                int i73 = iArr11[2];
                                iArr11[2] = i73 - ((i65 * (i73 - i35)) / 262144);
                            } catch (Exception unused2) {
                            }
                            i62 = i70;
                        }
                        i59 = i7;
                        i61 = i64;
                    }
                } else {
                    i5 = i28;
                }
                int i74 = i29 + i33;
                if (i74 >= length) {
                    i74 -= length;
                }
                i29 = i74;
                i28 = i5 + 1;
                if (i30 == 0) {
                    i30 = i19;
                }
                if (i28 % i30 == 0) {
                    i27 -= i27 / i38;
                    i26 -= i26 / 30;
                    int i75 = i26 >> 6;
                    i31 = i75 <= i19 ? 0 : i75;
                    for (int i76 = 0; i76 < i31; i76++) {
                        int i77 = i31 * i31;
                        iArr5[i76] = (((i77 - (i76 * i76)) * 256) / i77) * i27;
                    }
                }
                bArr2 = bArr3;
                i20 = i33;
                iArr6 = iArr7;
                i21 = i38;
                i19 = 1;
            }
            int[][] iArr12 = iArr6;
            int i78 = 0;
            while (true) {
                i = 256;
                if (i78 >= 256) {
                    break;
                }
                int[] iArr13 = iArr12[i78];
                iArr13[0] = iArr13[0] >> 4;
                iArr13[1] = iArr13[1] >> 4;
                iArr13[2] = iArr13[2] >> 4;
                iArr13[3] = i78;
                i78++;
            }
            int i79 = 0;
            int i80 = 0;
            int i81 = 0;
            while (i79 < i) {
                int[] iArr14 = iArr12[i79];
                char c = 1;
                int i82 = iArr14[1];
                int i83 = i79 + 1;
                int i84 = i79;
                int i85 = i83;
                while (i85 < i) {
                    int i86 = iArr12[i85][c];
                    int i87 = i86 < i82 ? i86 : i82;
                    if (i86 < i82) {
                        i84 = i85;
                    }
                    i85++;
                    i82 = i87;
                    i = 256;
                    c = 1;
                }
                int[] iArr15 = iArr12[i84];
                if (i79 != i84) {
                    int i88 = iArr15[0];
                    iArr15[0] = iArr14[0];
                    iArr14[0] = i88;
                    int i89 = iArr15[1];
                    iArr15[1] = iArr14[1];
                    iArr14[1] = i89;
                    int i90 = iArr15[2];
                    iArr15[2] = iArr14[2];
                    iArr14[2] = i90;
                    int i91 = iArr15[3];
                    iArr15[3] = iArr14[3];
                    iArr14[3] = i91;
                }
                if (i82 != i80) {
                    iArr2[i80] = (i81 + i79) >> 1;
                    while (true) {
                        i80++;
                        if (i80 >= i82) {
                            break;
                        } else {
                            iArr2[i80] = i79;
                        }
                    }
                    i81 = i79;
                    i80 = i82;
                }
                i79 = i83;
                i = 256;
            }
            int i92 = PrivateKeyType.INVALID;
            iArr2[i80] = (i81 + PrivateKeyType.INVALID) >> 1;
            int i93 = i80 + 1;
            int i94 = 256;
            while (i93 < 256) {
                iArr2[i93] = i92;
                i93++;
                i92 = PrivateKeyType.INVALID;
            }
            byte[] bArr4 = new byte[768];
            int[] iArr16 = new int[256];
            int i95 = 0;
            while (i95 < i94) {
                iArr16[iArr12[i95][3]] = i95;
                i95++;
                i94 = 256;
            }
            int i96 = 0;
            int i97 = 0;
            for (int i98 = i94; i96 < i98; i98 = 256) {
                int[] iArr17 = iArr12[iArr16[i96]];
                bArr4[i97] = (byte) iArr17[0];
                int i99 = i97 + 2;
                bArr4[i97 + 1] = (byte) iArr17[1];
                i97 += 3;
                bArr4[i99] = (byte) iArr17[2];
                i96++;
            }
            this.i = bArr4;
            int i100 = 0;
            while (true) {
                byte[] bArr5 = this.i;
                int length2 = bArr5.length;
                if (i100 >= 768) {
                    break;
                }
                byte b = bArr5[i100];
                int i101 = i100 + 2;
                bArr5[i100] = bArr5[i101];
                bArr5[i101] = b;
                this.o[i100 / 3] = false;
                i100 += 3;
            }
            int i102 = 0;
            for (int i103 = 0; i103 < i15; i103++) {
                byte[] bArr6 = this.g;
                int i104 = bArr6[i102] & 255;
                int i105 = i102 + 2;
                int i106 = bArr6[i102 + 1] & 255;
                i102 += 3;
                int i107 = bArr6[i105] & 255;
                int i108 = iArr2[i106];
                int i109 = i108 - 1;
                int i110 = 1000;
                int i111 = 256;
                int i112 = i108;
                int i113 = -1;
                while (true) {
                    if (i112 >= i111) {
                        if (i109 >= 0) {
                            i111 = 256;
                        }
                    }
                    if (i112 < i111) {
                        int[] iArr18 = iArr12[i112];
                        int i114 = iArr18[1] - i106;
                        if (i114 >= i110) {
                            i112 = i111;
                        } else {
                            i112++;
                            if (i114 < 0) {
                                i114 = -i114;
                            }
                            int i115 = iArr18[0] - i104;
                            if (i115 < 0) {
                                i115 = -i115;
                            }
                            int i116 = i114 + i115;
                            if (i116 < i110) {
                                int i117 = iArr18[2] - i107;
                                if (i117 < 0) {
                                    i117 = -i117;
                                }
                                int i118 = i116 + i117;
                                if (i118 < i110) {
                                    i113 = iArr18[3];
                                    i110 = i118;
                                }
                            }
                        }
                    }
                    if (i109 >= 0) {
                        int[] iArr19 = iArr12[i109];
                        int i119 = i106 - iArr19[1];
                        if (i119 >= i110) {
                            i109 = -1;
                        } else {
                            i109--;
                            if (i119 < 0) {
                                i119 = -i119;
                            }
                            int i120 = iArr19[0] - i104;
                            if (i120 < 0) {
                                i120 = -i120;
                            }
                            int i121 = i119 + i120;
                            if (i121 < i110) {
                                int i122 = iArr19[2] - i107;
                                if (i122 < 0) {
                                    i122 = -i122;
                                }
                                int i123 = i121 + i122;
                                if (i123 < i110) {
                                    i113 = iArr19[3];
                                    i110 = i123;
                                }
                            }
                        }
                    }
                    i111 = 256;
                }
                this.o[i113] = true;
                this.h[i103] = (byte) i113;
            }
            this.g = null;
            this.n = 8;
            this.p = 7;
            if (this.q) {
                if (this.i == null) {
                    i3 = -1;
                } else {
                    int red = Color.red(0);
                    int green = Color.green(0);
                    int blue = Color.blue(0);
                    int length3 = this.i.length;
                    int i124 = 16777216;
                    i3 = 0;
                    for (int i125 = 0; i125 < 768; i125 += 3) {
                        byte[] bArr7 = this.i;
                        int i126 = red - (bArr7[i125] & 255);
                        int i127 = i125 + 2;
                        int i128 = green - (bArr7[i125 + 1] & 255);
                        int i129 = blue - (bArr7[i127] & 255);
                        int i130 = i126 * i126;
                        int i131 = i128 * i128;
                        int i132 = i127 / 3;
                        if (this.o[i132] && (i4 = i130 + i131 + (i129 * i129)) < i124) {
                            i124 = i4;
                            i3 = i132;
                        }
                    }
                }
                this.a = i3;
            }
            if (this.j) {
                d(this.l);
                d(this.m);
                this.e.write(this.p | 240);
                this.e.write(0);
                this.e.write(0);
                c();
                if (this.b >= 0) {
                    this.e.write(33);
                    this.e.write(PrivateKeyType.INVALID);
                    this.e.write(11);
                    a("NETSCAPE2.0");
                    this.e.write(3);
                    this.e.write(1);
                    d(this.b);
                    this.e.write(0);
                }
            }
            this.e.write(33);
            this.e.write(249);
            this.e.write(4);
            boolean z = this.q;
            this.e.write((z ? 1 : 0) | ((true != z ? 0 : 2) << 2));
            d(this.c);
            this.e.write(this.a);
            this.e.write(0);
            this.e.write(44);
            d(0);
            d(0);
            d(this.l);
            d(this.m);
            if (this.j) {
                this.e.write(0);
            } else {
                this.e.write(this.p | 128);
            }
            if (!this.j) {
                c();
            }
            qrj qrjVar = new qrj(this.l, this.m, this.h, this.n);
            OutputStream outputStream = this.e;
            outputStream.write(qrjVar.c);
            qrjVar.d = qrjVar.a * qrjVar.b;
            qrjVar.e = 0;
            int i133 = qrjVar.c;
            int i134 = i133 + 1;
            qrjVar.l = i134;
            qrjVar.k = false;
            qrjVar.f = i134;
            qrjVar.g = qrj.e(i134);
            int i135 = 1 << i133;
            qrjVar.m = i135;
            qrjVar.n = i135 + 1;
            qrjVar.j = i135 + 2;
            qrjVar.r = 0;
            int a = qrjVar.a();
            int i136 = 5003;
            int i137 = 0;
            while (i136 < 65536) {
                i136 += i136;
                i137++;
            }
            int i138 = 8 - i137;
            qrjVar.f();
            qrjVar.d(qrjVar.m, outputStream);
            while (true) {
                int a2 = qrjVar.a();
                if (a2 == -1) {
                    qrjVar.d(a, outputStream);
                    qrjVar.d(qrjVar.n, outputStream);
                    outputStream.write(0);
                    this.j = false;
                    return;
                }
                int i139 = (a2 << 12) + a;
                int i140 = (a2 << i138) ^ a;
                int i141 = qrjVar.h[i140];
                if (i141 == i139) {
                    a = qrjVar.i[i140];
                } else {
                    if (i141 >= 0) {
                        int i142 = 5003 - i140;
                        if (i140 == 0) {
                            i142 = 1;
                        }
                        do {
                            i140 -= i142;
                            if (i140 < 0) {
                                i140 += 5003;
                            }
                            i2 = qrjVar.h[i140];
                            if (i2 == i139) {
                                a = qrjVar.i[i140];
                                break;
                            }
                        } while (i2 >= 0);
                    }
                    qrjVar.d(a, outputStream);
                    int i143 = qrjVar.j;
                    if (i143 < 4096) {
                        int[] iArr20 = qrjVar.i;
                        qrjVar.j = i143 + 1;
                        iArr20[i140] = i143;
                        qrjVar.h[i140] = i139;
                    } else {
                        qrjVar.f();
                        int i144 = qrjVar.m;
                        qrjVar.j = i144 + 2;
                        qrjVar.k = true;
                        qrjVar.d(i144, outputStream);
                    }
                    a = a2;
                }
            }
        } catch (IOException unused3) {
        }
    }
}
