package androidx.car.app.media;

import defpackage.cfs;
import defpackage.cgn;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class OpenMicrophoneRequest {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;

    private OpenMicrophoneRequest() {
        this.mCarAudioCallbackDelegate = null;
    }

    public CarAudioCallbackDelegate getCarAudioCallbackDelegate() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        carAudioCallbackDelegate.getClass();
        return carAudioCallbackDelegate;
    }

    OpenMicrophoneRequest(cgn cgnVar) {
        CarAudioCallbackDelegate carAudioCallbackDelegate = cgnVar.a;
        this.mCarAudioCallbackDelegate = null;
    }
}
