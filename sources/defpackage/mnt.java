package defpackage;

import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mnt {
    public final Handler a = new Handler(Looper.myLooper());
    public final AudioTrack$StreamEventCallback b = new mns(this);
    final /* synthetic */ mnu c;

    public mnt(mnu mnuVar) {
        this.c = mnuVar;
    }
}
