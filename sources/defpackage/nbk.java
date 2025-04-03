package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbk extends GLSurfaceView {
    public final CopyOnWriteArrayList a;
    public final Handler b;
    public final nbg c;
    public SurfaceTexture d;
    public Surface e;
    private final SensorManager f;
    private final Sensor g;
    private final nay h;
    private final nbm i;
    private final boolean j;
    private boolean k;
    private boolean l;

    public nbk(Context context) {
        super(context, null);
        this.a = new CopyOnWriteArrayList();
        this.b = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        lti.f(systemService);
        SensorManager sensorManager = (SensorManager) systemService;
        this.f = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.g = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        nbg nbgVar = new nbg();
        this.c = nbgVar;
        nbj nbjVar = new nbj(this, nbgVar);
        nbm nbmVar = new nbm(context, nbjVar);
        this.i = nbmVar;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        lti.f(windowManager);
        this.h = new nay(windowManager.getDefaultDisplay(), nbmVar, nbjVar);
        this.j = true;
        setEGLContextClientVersion(2);
        setRenderer(nbjVar);
        setOnTouchListener(nbmVar);
    }

    public static void a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private final void b() {
        boolean z = this.j && this.k;
        Sensor sensor = this.g;
        if (sensor == null || z == this.l) {
            return;
        }
        if (z) {
            this.f.registerListener(this.h, sensor, 0);
        } else {
            this.f.unregisterListener(this.h);
        }
        this.l = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.post(new Runnable() { // from class: nbh
            @Override // java.lang.Runnable
            public final void run() {
                nbk nbkVar = nbk.this;
                Surface surface = nbkVar.e;
                if (surface != null) {
                    Iterator it = nbkVar.a.iterator();
                    while (it.hasNext()) {
                        ((mgi) it.next()).b();
                    }
                }
                nbk.a(nbkVar.d, surface);
                nbkVar.d = null;
                nbkVar.e = null;
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.k = false;
        b();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.k = true;
        b();
    }
}
