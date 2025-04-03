package defpackage;

import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecordingConfiguration;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwa extends AudioManager$AudioRecordingCallback {
    final /* synthetic */ bwb a;

    public bwa(bwb bwbVar) {
        this.a = bwbVar;
    }

    public final void onRecordingConfigChanged(List list) {
        int clientAudioSessionId;
        boolean isClientSilenced;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration m90m = afg$$ExternalSyntheticApiModelOutline0.m90m(it.next());
            clientAudioSessionId = m90m.getClientAudioSessionId();
            if (clientAudioSessionId == this.a.a.getAudioSessionId()) {
                isClientSilenced = m90m.isClientSilenced();
                this.a.f(isClientSilenced);
                return;
            }
        }
    }
}
