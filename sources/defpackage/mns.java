package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mns extends AudioTrack$StreamEventCallback {
    final /* synthetic */ mnt a;

    public mns(mnt mntVar) {
        this.a = mntVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        audioTrack.equals(this.a.c.p);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.a.c.p)) {
            this.a.c.I = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(this.a.c.p);
    }
}
