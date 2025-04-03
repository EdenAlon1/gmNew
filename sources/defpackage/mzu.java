package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzu extends GLSurfaceView {
    private final mzt a;

    public mzu(Context context) {
        super(context, null);
        mzt mztVar = new mzt(this);
        this.a = mztVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(mztVar);
        setRenderMode(0);
    }
}
