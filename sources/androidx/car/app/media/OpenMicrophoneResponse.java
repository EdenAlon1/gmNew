package androidx.car.app.media;

import android.os.ParcelFileDescriptor;
import defpackage.cfs;
import defpackage.cgo;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class OpenMicrophoneResponse {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;
    private final ParcelFileDescriptor mCarMicrophoneDescriptor;

    private OpenMicrophoneResponse() {
        this.mCarMicrophoneDescriptor = null;
        this.mCarAudioCallbackDelegate = null;
    }

    public CarAudioCallbackDelegate getCarAudioCallback() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        carAudioCallbackDelegate.getClass();
        return carAudioCallbackDelegate;
    }

    public InputStream getCarMicrophoneInputStream() {
        ParcelFileDescriptor parcelFileDescriptor = this.mCarMicrophoneDescriptor;
        if (parcelFileDescriptor == null) {
            try {
                ParcelFileDescriptor[] createReliablePipe = ParcelFileDescriptor.createReliablePipe();
                createReliablePipe[1].close();
                parcelFileDescriptor = createReliablePipe[0];
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
    }

    OpenMicrophoneResponse(cgo cgoVar) {
        CarAudioCallbackDelegate carAudioCallbackDelegate = cgoVar.a;
        this.mCarAudioCallbackDelegate = null;
        ParcelFileDescriptor parcelFileDescriptor = cgoVar.b;
        this.mCarMicrophoneDescriptor = null;
    }
}
