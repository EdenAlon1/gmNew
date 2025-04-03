package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mww {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final Spatializer$OnSpatializerStateChangedListener d;

    public mww(Context context, mxd mxdVar) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager audioManager = context == null ? null : (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            lti.f(context);
            if (!lvf.ab(context)) {
                spatializer = audioManager.getSpatializer();
                this.a = spatializer;
                immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
                this.b = immersiveAudioLevel != 0;
                mwv mwvVar = new mwv(mxdVar);
                this.d = mwvVar;
                Looper myLooper = Looper.myLooper();
                lti.g(myLooper);
                final Handler handler = new Handler(myLooper);
                this.c = handler;
                spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: mwu
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler.post(runnable);
                    }
                }, mwvVar);
                return;
            }
        }
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = null;
    }
}
