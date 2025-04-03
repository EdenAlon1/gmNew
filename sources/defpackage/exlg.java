package defpackage;

import android.media.AudioFormat;
import android.os.AsyncTask;
import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exlg implements exkn {
    public static final String a = "exlg";
    public int c;
    public boolean d;
    public final exmn f;
    boolean g;
    public final Object b = new Object();
    public boolean e = false;

    public exlg(exmn exmnVar, int i, boolean z) {
        this.d = false;
        boolean z2 = true;
        this.g = true;
        emxf.a(exmnVar.d != null);
        if (exmnVar.c == null) {
            exmnVar.c = new exmm(exmnVar, i);
            z2 = exmnVar.c.a();
        }
        this.d = z2;
        this.f = exmnVar;
        this.g = z;
    }

    @Override // defpackage.exkn
    public final void a(ByteBuffer byteBuffer, long j, AudioFormat audioFormat) {
        if (this.g && (audioFormat.getChannelCount() != 2 || audioFormat.getSampleRate() != 44100)) {
            Log.e(a, "Producer's AudioFormat doesn't match consumer's AudioFormat");
            return;
        }
        synchronized (this.b) {
            this.c++;
        }
        new exlf(this).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, byteBuffer, Long.valueOf(j));
    }
}
