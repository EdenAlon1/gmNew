package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mlx extends AudioDeviceCallback {
    final /* synthetic */ mma a;

    public mlx(mma mmaVar) {
        this.a = mmaVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        mma mmaVar = this.a;
        mmaVar.a(mlw.b(mmaVar.a, mmaVar.h, mmaVar.g));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        mmb mmbVar = this.a.g;
        int i = lvf.a;
        int length = audioDeviceInfoArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i2], mmbVar)) {
                this.a.g = null;
                break;
            }
            i2++;
        }
        mma mmaVar = this.a;
        mmaVar.a(mlw.b(mmaVar.a, mmaVar.h, mmaVar.g));
    }
}
