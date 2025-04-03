package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class arby {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder");
    public final Context b;
    public final arbt c;
    public MediaRecorder d;
    private final errm e;
    private final errl f;
    private final cvjg g;
    private Uri h;
    private ParcelFileDescriptor i;
    private elfl j;

    public arby(Context context, errm errmVar, errl errlVar, arbt arbtVar, cvjg cvjgVar) {
        this.b = context;
        this.e = errmVar;
        this.f = errlVar;
        this.c = arbtVar;
        this.g = cvjgVar;
    }

    private static int f(int i) {
        int i2 = (i / 307200) * 60;
        return i2 == 0 ? (i / 51200) * 10 : i2;
    }

    private final void g() {
        elfl elflVar = this.j;
        if (elflVar != null && !elflVar.isDone()) {
            this.j.cancel(true);
        }
        this.c.a.e();
    }

    public final int a(int i) {
        if (!this.g.a()) {
            return ((Boolean) ardj.a.e()).booleanValue() ? ((Integer) ardj.b.e()).intValue() : f(i);
        }
        int f = f(i);
        return ((Boolean) ardj.a.e()).booleanValue() ? Math.min(((Integer) ardj.b.e()).intValue(), f) : f;
    }

    public final Uri b() {
        MediaRecorder mediaRecorder;
        synchronized (arby.class) {
            MediaRecorder mediaRecorder2 = this.d;
            if (mediaRecorder2 == null) {
                throw new IllegalStateException("Not currently recording!");
            }
            try {
                try {
                    mediaRecorder2.stop();
                    mediaRecorder = this.d;
                } catch (RuntimeException e) {
                    ensk j = a.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "stopRecording", 207, "LevelTrackingMediaRecorder.java")).t("Something went wrong when stopping media recorder. %s", e);
                    final Uri uri = this.h;
                    if (uri != null) {
                        elfo.f(new Runnable() { // from class: arbu
                            @Override // java.lang.Runnable
                            public final void run() {
                                cbgi.j(arby.this.b, uri);
                            }
                        }, this.f).k(axnw.b(), erpp.a);
                        this.h = null;
                    }
                    MediaRecorder mediaRecorder3 = this.d;
                    if (mediaRecorder3 != null) {
                        mediaRecorder3.release();
                    }
                }
                if (mediaRecorder != null) {
                    mediaRecorder.release();
                    this.d = null;
                }
            } catch (Throwable th) {
                MediaRecorder mediaRecorder4 = this.d;
                if (mediaRecorder4 != null) {
                    mediaRecorder4.release();
                    this.d = null;
                }
                throw th;
            }
        }
        ParcelFileDescriptor parcelFileDescriptor = this.i;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
            this.i = null;
        }
        g();
        return this.h;
    }

    public final elfl c(long j, final long j2) {
        return elfl.g(this.e.schedule(new Callable() { // from class: arbv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                arby arbyVar = arby.this;
                synchronized (arby.class) {
                    if (arbyVar.d != null) {
                        ensk e = arby.a.e();
                        e.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "trackingSoundLevel", 295, "LevelTrackingMediaRecorder.java")).q("start tracking sound level with recorder");
                        arbt arbtVar = arbyVar.c;
                        synchronized (arby.class) {
                            MediaRecorder mediaRecorder = arbyVar.d;
                            z = false;
                            int min = mediaRecorder != null ? Math.min(mediaRecorder.getMaxAmplitude() / 327, 100) : 0;
                            fgcl fgclVar = arbtVar.a;
                            dteo.a(min);
                            fgclVar.h(new dteo(min));
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        }, j, TimeUnit.MILLISECONDS)).i(new eroh() { // from class: arbw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    ensk e = arby.a.e();
                    e.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startTrackingSoundLevelWithDelay", 318, "LevelTrackingMediaRecorder.java")).q("start tracking sound level is over");
                    return elfo.e(null);
                }
                long j3 = j2;
                arby arbyVar = arby.this;
                ensk e2 = arby.a.e();
                e2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startTrackingSoundLevelWithDelay", 321, "LevelTrackingMediaRecorder.java")).q("start tracking sound level again");
                return arbyVar.c(j3, j3);
            }
        }, this.e).e(InterruptedException.class, new emwl() { // from class: arbx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk e = arby.a.e();
                e.Y(ente.a, "Bugle");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startTrackingSoundLevelWithDelay", 330, "LevelTrackingMediaRecorder.java")).q("start tracking sound level interrupted");
                return null;
            }
        }, this.e);
    }

    public final boolean d() {
        return this.d != null;
    }

    public final boolean e(MediaRecorder.OnErrorListener onErrorListener, MediaRecorder.OnInfoListener onInfoListener, int i) {
        synchronized (arby.class) {
            if (this.d != null) {
                throw new IllegalStateException("Trying to start a new recording session while already recording!");
            }
            Uri d = cbgi.d(((Boolean) ardj.a.e()).booleanValue() ? "m4a" : "amr", this.b);
            MediaRecorder mediaRecorder = new MediaRecorder();
            if (d == null) {
                return false;
            }
            try {
                ParcelFileDescriptor openFileDescriptor = this.b.getContentResolver().openFileDescriptor(d, "wt");
                if (openFileDescriptor == null) {
                    ensk i2 = a.i();
                    i2.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) i2).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startRecording", 147, "LevelTrackingMediaRecorder.java")).q("Unable to open the scratch file URI.");
                    return false;
                }
                mediaRecorder.setAudioSource(1);
                int a2 = a(i);
                if (a2 == 0) {
                    ensk i3 = a.i();
                    i3.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) i3).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startRecording", 155, "LevelTrackingMediaRecorder.java")).q("Something went wrong when starting media recorder.");
                    return false;
                }
                mediaRecorder.setMaxDuration((int) TimeUnit.SECONDS.toMillis(a2));
                if (((Boolean) ardj.a.e()).booleanValue()) {
                    mediaRecorder.setOutputFormat(2);
                    mediaRecorder.setAudioEncoder(3);
                    mediaRecorder.setAudioSamplingRate(((Integer) ardj.d.e()).intValue());
                    mediaRecorder.setAudioEncodingBitRate(((Integer) ardj.e.e()).intValue());
                } else {
                    mediaRecorder.setOutputFormat(3);
                    mediaRecorder.setAudioEncoder(1);
                }
                mediaRecorder.setMaxFileSize((int) (i * 0.8f));
                mediaRecorder.setOutputFile(openFileDescriptor.getFileDescriptor());
                mediaRecorder.setOnErrorListener(onErrorListener);
                mediaRecorder.setOnInfoListener(onInfoListener);
                mediaRecorder.prepare();
                mediaRecorder.start();
                g();
                long intValue = ((Integer) ardj.i.e()).intValue();
                if (intValue <= 0) {
                    ensk e = a.e();
                    e.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startTrackingSoundLevel", 340, "LevelTrackingMediaRecorder.java")).q("Audio level polling is disabled by override.");
                } else {
                    this.j = c(0L, intValue);
                }
                this.d = mediaRecorder;
                this.h = d;
                this.i = openFileDescriptor;
                return true;
            } catch (Exception e2) {
                ensk j = a.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/shared/audio/LevelTrackingMediaRecorder", "startRecording", 182, "LevelTrackingMediaRecorder.java")).t("Something went wrong when starting media recorder. %s", e2);
                return false;
            }
        }
    }
}
