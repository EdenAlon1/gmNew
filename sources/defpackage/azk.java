package defpackage;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.util.Size;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azk implements bnd {
    private final bls a;

    public azk(bfx bfxVar) {
        this.a = new bls(bfxVar);
    }

    @Override // defpackage.bnd
    public final /* synthetic */ Object a(Object obj) {
        bmc bmcVar;
        byte[] bArr;
        byte[] copyOfRange;
        try {
            bne bneVar = ((ayf) obj).a;
            int i = ((bmc) bneVar).c;
            int i2 = 2;
            int i3 = 0;
            if (i == 35) {
                avr avrVar = (avr) ((bmc) bneVar).a;
                Rect rect = ((bmc) bneVar).e;
                try {
                    int i4 = ((ayf) obj).b;
                    int i5 = ((bmc) bneVar).f;
                    if (avrVar.a() != 35) {
                        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + avrVar.a());
                    }
                    avq avqVar = avrVar.f()[0];
                    avq avqVar2 = avrVar.f()[1];
                    avq avqVar3 = avrVar.f()[2];
                    ByteBuffer c = avqVar.c();
                    ByteBuffer c2 = avqVar2.c();
                    ByteBuffer c3 = avqVar3.c();
                    c.rewind();
                    c2.rewind();
                    c3.rewind();
                    int remaining = c.remaining();
                    byte[] bArr2 = new byte[remaining + ((avrVar.c() * avrVar.b()) / 2)];
                    int i6 = 0;
                    for (int i7 = 0; i7 < avrVar.b(); i7++) {
                        c.get(bArr2, i6, avrVar.c());
                        i6 += avrVar.c();
                        c.position(Math.min(remaining, (c.position() - avrVar.c()) + avqVar.b()));
                    }
                    int b = avrVar.b() / 2;
                    int c4 = avrVar.c() / 2;
                    int b2 = avqVar3.b();
                    int b3 = avqVar2.b();
                    int a = avqVar3.a();
                    int a2 = avqVar2.a();
                    byte[] bArr3 = new byte[b2];
                    int i8 = i6;
                    byte[] bArr4 = new byte[b3];
                    int i9 = 0;
                    while (i9 < b) {
                        int i10 = b;
                        int i11 = b2;
                        c3.get(bArr3, 0, Math.min(b2, c3.remaining()));
                        c2.get(bArr4, 0, Math.min(b3, c2.remaining()));
                        int i12 = i8;
                        int i13 = 0;
                        int i14 = 0;
                        for (int i15 = 0; i15 < c4; i15++) {
                            int i16 = i12 + 1;
                            bArr2[i12] = bArr3[i13];
                            i12 += 2;
                            bArr2[i16] = bArr4[i14];
                            i13 += a;
                            i14 += a2;
                        }
                        i9++;
                        b = i10;
                        b2 = i11;
                        i8 = i12;
                    }
                    YuvImage yuvImage = new YuvImage(bArr2, 17, avrVar.c(), avrVar.b(), null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    String str = big.d;
                    bif bifVar = new bif(ByteOrder.BIG_ENDIAN);
                    bifVar.b("Orientation", "1");
                    bifVar.b("XResolution", "72/1");
                    bifVar.b("YResolution", "72/1");
                    bifVar.b("ResolutionUnit", "2");
                    bifVar.b("YCbCrPositioning", "1");
                    bifVar.b("Make", Build.MANUFACTURER);
                    bifVar.b("Model", Build.MODEL);
                    if (avrVar.e() != null) {
                        avrVar.e().f(bifVar);
                    }
                    bifVar.c(i5);
                    bifVar.b("ImageWidth", String.valueOf(avrVar.c()));
                    bifVar.b("ImageLength", String.valueOf(avrVar.b()));
                    ArrayList list = Collections.list(new bie(bifVar));
                    if (!((Map) list.get(1)).isEmpty()) {
                        bifVar.a("ExposureProgram", "0", list);
                        bifVar.a("ExifVersion", "0230", list);
                        bifVar.a("ComponentsConfiguration", big.d, list);
                        bifVar.a("MeteringMode", "0", list);
                        bifVar.a("LightSource", "0", list);
                        bifVar.a("FlashpixVersion", "0100", list);
                        bifVar.a("FocalPlaneResolutionUnit", "2", list);
                        bifVar.a("FileSource", "3", list);
                        bifVar.a("SceneType", "1", list);
                        bifVar.a("CustomRendered", "0", list);
                        bifVar.a("SceneCaptureType", "0", list);
                        bifVar.a("Contrast", "0", list);
                        bifVar.a("Saturation", "0", list);
                        bifVar.a("Sharpness", "0", list);
                    }
                    if (!((Map) list.get(2)).isEmpty()) {
                        bifVar.a("GPSVersionID", "2300", list);
                        bifVar.a("GPSSpeedRef", "K", list);
                        bifVar.a("GPSTrackRef", "T", list);
                        bifVar.a("GPSImgDirectionRef", "T", list);
                        bifVar.a("GPSDestBearingRef", "T", list);
                        bifVar.a("GPSDestDistanceRef", "K", list);
                    }
                    if (!yuvImage.compressToJpeg(rect, i4, new bih(byteArrayOutputStream, new big(bifVar.c, list)))) {
                        throw new blx();
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        bmcVar = new bmc(byteArray, bia.c(new ByteArrayInputStream(byteArray)), 256, new Size(rect.width(), rect.height()), new Rect(0, 0, rect.width(), rect.height()), ((bmc) bneVar).f, bix.e(((bmc) bneVar).g, rect), ((bmc) bneVar).h);
                    } catch (IOException e) {
                        throw new avl("Failed to extract Exif from YUV-generated JPEG", e);
                    }
                } catch (blx e2) {
                    throw new avl("Failed to encode the image to JPEG.", e2);
                }
            } else {
                if (i != 256 && i != 4101) {
                    throw new IllegalArgumentException(a.h(i, "Unexpected format: "));
                }
                bls blsVar = this.a;
                avr avrVar2 = (avr) ((bmc) bneVar).a;
                if (blsVar.a == null) {
                    ByteBuffer c5 = avrVar2.f()[0].c();
                    copyOfRange = new byte[c5.capacity()];
                    c5.rewind();
                    c5.get(copyOfRange);
                } else {
                    ByteBuffer c6 = avrVar2.f()[0].c();
                    int capacity = c6.capacity();
                    byte[] bArr5 = new byte[capacity];
                    c6.rewind();
                    c6.get(bArr5);
                    for (int i17 = 2; i17 + 4 <= capacity && bArr5[i17] == -1; i17 += (((bArr5[i17 + 2] & 255) << 8) | (bArr5[i17 + 3] & 255)) + 2) {
                        if (bArr5[i17 + 1] == -38) {
                            break;
                        }
                    }
                    while (true) {
                        int i18 = i2 + 1;
                        if (i18 > capacity) {
                            i3 = -1;
                            break;
                        }
                        if (bArr5[i2] == -1 && bArr5[i18] == -40) {
                            i3 = i2;
                            break;
                        }
                        i2 = i18;
                    }
                    if (i3 == -1) {
                        bArr = bArr5;
                        bia biaVar = ((bmc) bneVar).b;
                        biaVar.getClass();
                        bmcVar = new bmc(bArr, biaVar, i, ((bmc) bneVar).d, ((bmc) bneVar).e, ((bmc) bneVar).f, ((bmc) bneVar).g, ((bmc) bneVar).h);
                    }
                    copyOfRange = Arrays.copyOfRange(bArr5, i3, c6.limit());
                }
                bArr = copyOfRange;
                bia biaVar2 = ((bmc) bneVar).b;
                biaVar2.getClass();
                bmcVar = new bmc(bArr, biaVar2, i, ((bmc) bneVar).d, ((bmc) bneVar).e, ((bmc) bneVar).f, ((bmc) bneVar).g, ((bmc) bneVar).h);
            }
            return bmcVar;
        } finally {
            ((avr) ((bmc) ((ayf) obj).a).a).close();
        }
    }
}
