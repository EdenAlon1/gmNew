package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mma {
    public final Context a;
    public final Handler b;
    public final mlx c;
    public final BroadcastReceiver d;
    public final mly e;
    public mlw f;
    public mmb g;
    public lpk h;
    public boolean i;
    private final mnf j;

    public mma(Context context, mnf mnfVar, lpk lpkVar, mmb mmbVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.j = mnfVar;
        this.h = lpkVar;
        this.g = mmbVar;
        Handler D = lvf.D();
        this.b = D;
        this.c = new mlx(this);
        this.d = new mlz(this);
        Uri uriFor = mlw.d() ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.e = uriFor != null ? new mly(this, D, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(mlw mlwVar) {
        mii miiVar;
        if (!this.i || mlwVar.equals(this.f)) {
            return;
        }
        this.f = mlwVar;
        mnu mnuVar = this.j.a;
        Looper myLooper = Looper.myLooper();
        Looper looper = mnuVar.Q;
        if (looper != myLooper) {
            throw new IllegalStateException(a.d(looper == null ? "null" : looper.getThread().getName(), myLooper == null ? "null" : myLooper.getThread().getName(), "Current looper (", ") is not the playback looper (", ")"));
        }
        mlw mlwVar2 = mnuVar.q;
        if (mlwVar2 == null || mlwVar.equals(mlwVar2)) {
            return;
        }
        mnuVar.q = mlwVar;
        mnx mnxVar = mnuVar.W;
        if (mnxVar != null) {
            mny mnyVar = mnxVar.a;
            synchronized (mnyVar.a) {
                miiVar = mnyVar.i;
            }
            if (miiVar != null) {
                synchronized (((mxd) miiVar).b) {
                    boolean z = ((mxd) miiVar).d.U;
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        mmb mmbVar = this.g;
        AudioDeviceInfo audioDeviceInfo2 = mmbVar == null ? null : mmbVar.a;
        int i = lvf.a;
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        mmb mmbVar2 = audioDeviceInfo != null ? new mmb(audioDeviceInfo) : null;
        this.g = mmbVar2;
        a(mlw.b(this.a, this.h, mmbVar2));
    }
}
