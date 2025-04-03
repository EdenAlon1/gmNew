package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mno {
    public final AudioTrack a;
    public final mma b;
    public AudioRouting$OnRoutingChangedListener c = new AudioRouting$OnRoutingChangedListener() { // from class: mnn
        public final void onRoutingChanged(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            AudioDeviceInfo routedDevice2;
            mno mnoVar = mno.this;
            if (mnoVar.c == null) {
                return;
            }
            routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null) {
                mma mmaVar = mnoVar.b;
                routedDevice2 = audioRouting.getRoutedDevice();
                mmaVar.b(routedDevice2);
            }
        }
    };

    public mno(AudioTrack audioTrack, mma mmaVar) {
        this.a = audioTrack;
        this.b = mmaVar;
        audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
    }
}
