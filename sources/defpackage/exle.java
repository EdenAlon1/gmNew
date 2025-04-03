package defpackage;

import android.media.AudioFormat;
import android.util.Log;
import android.view.Surface;
import com.google.mediapipe.framework.TextureFrame;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exle implements exky, exkn {
    private static final String c = "exle";
    public final exld a;
    public boolean b;
    private exlg d;
    private exmn e;
    private int f = 0;
    private int g;

    public exle(Object obj) {
        this.a = new exld(obj);
    }

    @Override // defpackage.exkn
    public final void a(ByteBuffer byteBuffer, long j, AudioFormat audioFormat) {
        exlg exlgVar;
        if (this.b && (exlgVar = this.d) != null && exlgVar.e) {
            exlgVar.a(byteBuffer, j, audioFormat);
        }
    }

    public final synchronized void b() {
        emxf.a(this.b);
        Log.d(c, "stopRecordingVideo");
        this.b = false;
        exlg exlgVar = this.d;
        if (exlgVar != null && exlgVar.e) {
            exlgVar.e = false;
            synchronized (exlgVar.b) {
                while (exlgVar.c > 0) {
                    try {
                        exlgVar.b.wait();
                    } catch (InterruptedException e) {
                        Log.e(exlg.a, "Exception: ", e);
                    }
                }
            }
        }
        this.a.b();
        this.e.b();
    }

    public final synchronized void c(String str, int i, int i2, int i3, boolean z) {
        try {
            this.e = new exmn(str);
            Surface surface = null;
            if (i3 > 0) {
                exlg exlgVar = new exlg(this.e, i3, z);
                this.d = exlgVar;
                if (!exlgVar.d) {
                    Log.e(c, "AudioRecorder failed to add audio track to file.");
                    this.d = null;
                }
            }
            exld exldVar = this.a;
            exmn exmnVar = this.e;
            exldVar.g = exmnVar;
            exldVar.b = i;
            exldVar.c = i2;
            int i4 = exldVar.o;
            emxf.a(exmnVar.d != null);
            exmp exmpVar = exmnVar.b;
            if (exmpVar != null) {
                surface = exmpVar.n;
            } else {
                try {
                    exmnVar.b = new exmp(exmnVar, i, i2, i4);
                    surface = exmnVar.b.n;
                } catch (RuntimeException unused) {
                    Log.d(exmn.a, "Failed to create video track encoder");
                }
            }
            exldVar.h = surface;
            this.f = 0;
            this.g = 0;
            exlg exlgVar2 = this.d;
            if (exlgVar2 != null) {
                exlgVar2.e = true;
                exlgVar2.c = 0;
            }
            this.a.c();
            this.b = true;
        } catch (IOException e) {
            Log.e(c, "Failed to create Mp4Encoder!", e);
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.exky
    public final void hI(TextureFrame textureFrame) {
        if (!this.b) {
            textureFrame.release();
            return;
        }
        exld exldVar = this.a;
        if (!exldVar.e) {
            textureFrame.release();
            return;
        }
        int i = this.g + 1;
        this.g = i;
        if (i <= 0) {
            textureFrame.release();
        } else {
            this.f++;
            exldVar.hI(textureFrame);
        }
    }
}
