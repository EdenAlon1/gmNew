package defpackage;

import com.google.android.apps.messaging.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfv {
    public final drqm a;
    public final dtft b;
    public final dtfu c;
    public final boolean d;
    public final Duration e;
    public final Duration f;
    private final int g = R.string.audio_recording_start_failed;
    private final int h = R.string.audio_recording_error;
    private final Integer i = null;
    private final Integer j = null;

    public dtfv(drqm drqmVar, dtft dtftVar, dtfu dtfuVar, boolean z, Duration duration, Duration duration2) {
        this.a = drqmVar;
        this.b = dtftVar;
        this.c = dtfuVar;
        this.d = z;
        this.e = duration;
        this.f = duration2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtfv)) {
            return false;
        }
        dtfv dtfvVar = (dtfv) obj;
        if (!ffkj.e(this.a, dtfvVar.a) || !ffkj.e(this.b, dtfvVar.b) || !ffkj.e(this.c, dtfvVar.c)) {
            return false;
        }
        int i = dtfvVar.g;
        int i2 = dtfvVar.h;
        Integer num = dtfvVar.i;
        if (!ffkj.e(null, null)) {
            return false;
        }
        Integer num2 = dtfvVar.j;
        return ffkj.e(null, null) && this.d == dtfvVar.d && ffkj.e(this.e, dtfvVar.e) && ffkj.e(this.f, dtfvVar.f);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + R.string.audio_recording_start_failed) * 31) + R.string.audio_recording_error) * 29791) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "VoiceRecordingConfiguration(outputFileProvider=" + this.a + ", encoding=" + this.b + ", eventObserver=" + this.c + ", recordingStartErrorMessage=2132082980, recordingErrorMessage=2132082978, recordingStartedSound=null, recordingStoppedSound=null, enableSavingAudioLevels=" + this.d + ", minimumAttachmentDuration=" + this.e + ", audioLevelPollInterval=" + this.f + ")";
    }
}
