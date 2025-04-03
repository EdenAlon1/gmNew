package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bac {
    final Executor a;
    final bnb b;
    azg c;
    public baa d;
    public bnd e;
    public bnd f;
    public bnd g;
    public bnd h;
    public bnd i;
    public bnd j;
    public final bfx k;
    private final CameraCharacteristics l;

    public bac(Executor executor, CameraCharacteristics cameraCharacteristics, bnb bnbVar) {
        bfx bfxVar = blp.a;
        if (blp.a(LowMemoryQuirk.class) != null) {
            this.a = new bjp(executor);
        } else {
            this.a = executor;
        }
        this.b = bnbVar;
        this.l = cameraCharacteristics;
        this.k = bfxVar;
        bfxVar.d(IncorrectJpegMetadataQuirk.class);
    }

    private final avh b(bne bneVar, avg avgVar) {
        if (this.c == null) {
            CameraCharacteristics cameraCharacteristics = this.l;
            if (cameraCharacteristics == null) {
                throw new avl("CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            bcd bcdVar = ((bmc) bneVar).h;
            if (bcdVar.b() == null) {
                throw new avl("CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CaptureResult b = bcdVar.b();
            b.getClass();
            this.c = new azg(cameraCharacteristics, b);
        }
        azg azgVar = this.c;
        bmc bmcVar = (bmc) bneVar;
        aye ayeVar = new aye((avr) bmcVar.a, bmcVar.f, avgVar);
        avg avgVar2 = ayeVar.c;
        avr avrVar = ayeVar.a;
        int i = ayeVar.b;
        File a = azh.a();
        try {
            try {
                try {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(a);
                        try {
                            azgVar.a.setOrientation(i != 0 ? i != 90 ? i != 180 ? i != 270 ? 0 : 8 : 3 : 6 : 1);
                            azgVar.a.writeImage(fileOutputStream, avrVar.d());
                            fileOutputStream.close();
                            avrVar.close();
                            azh.b(a, avgVar2);
                            return new avh();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IllegalArgumentException e) {
                        throw new avl("Image with an unsupported format was used", e);
                    }
                } catch (IOException e2) {
                    throw new avl("Failed to write to temp file", e2);
                }
            } catch (IllegalStateException e3) {
                throw new avl("Not enough metadata information has been set to write a well-formatted DNG file", e3);
            }
        } catch (Throwable th3) {
            avrVar.close();
            throw th3;
        }
    }

    private static final void c(final bad badVar, final avl avlVar) {
        bjm.a().execute(new Runnable() { // from class: azw
            @Override // java.lang.Runnable
            public final void run() {
                biw.b();
                bag bagVar = bad.this.l;
                if (bagVar.f) {
                    return;
                }
                avl avlVar2 = avlVar;
                bagVar.c();
                bagVar.d();
                bagVar.f(avlVar2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f A[Catch: RuntimeException -> 0x00fa, OutOfMemoryError -> 0x0106, avl -> 0x0112, TryCatch #2 {avl -> 0x0112, OutOfMemoryError -> 0x0106, RuntimeException -> 0x00fa, blocks: (B:3:0x0004, B:5:0x0031, B:9:0x003b, B:11:0x005f, B:13:0x006b, B:15:0x00e1, B:20:0x00eb, B:23:0x007a, B:25:0x007d, B:27:0x009e, B:29:0x00c9, B:30:0x00a2, B:32:0x00b8, B:33:0x00bc, B:34:0x00d7), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void a(defpackage.bab r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bac.a(bab):void");
    }
}
