package androidx.car.app.media;

import android.os.RemoteException;
import androidx.car.app.media.ICarAudioCallback;
import defpackage.cfs;
import defpackage.cgk;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    /* compiled from: PG */
    @cfs
    private static class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final cgk mCarAudioCallback;

        CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            cgk cgkVar = this.mCarAudioCallback;
            cgkVar.getClass();
            cgkVar.a();
        }

        public CarAudioCallbackStub(cgk cgkVar) {
            this.mCarAudioCallback = cgkVar;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }

    static CarAudioCallbackDelegate create(cgk cgkVar) {
        return new CarAudioCallbackDelegate(cgkVar);
    }

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            iCarAudioCallback.getClass();
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private CarAudioCallbackDelegate(cgk cgkVar) {
        this.mCallback = new CarAudioCallbackStub(cgkVar);
    }
}
