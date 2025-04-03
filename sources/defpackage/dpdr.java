package defpackage;

import com.google.research.xeno.effect.Callbacks$StatusCallback;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpdr implements Callbacks$StatusCallback {
    final /* synthetic */ dpds a;
    final /* synthetic */ ffrf b;

    public dpdr(dpds dpdsVar, ffrf ffrfVar) {
        this.a = dpdsVar;
        this.b = ffrfVar;
    }

    @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
    public final void onCompletion(boolean z, String str) {
        if (z) {
            ensk h = dpds.a.h();
            h.Y(ente.a, "HugoAudio");
            enrr enrrVar = (enrr) h.h("com/google/android/libraries/compose/audio/processor/XenoAudioProcessor$stopProcessingInternal$2$1", "onCompletion", 159, "XenoAudioProcessor.kt");
            dpds dpdsVar = this.a;
            enrrVar.u("Successfully stopped audio processing. Received %d bytes. Produced %d bytes.", dpdsVar.j, dpdsVar.k);
        } else {
            ensk j = dpds.a.j();
            j.Y(ente.a, "HugoAudio");
            ((enrr) ((enrr) j).g(new IllegalStateException(str)).h("com/google/android/libraries/compose/audio/processor/XenoAudioProcessor$stopProcessingInternal$2$1", "onCompletion", 165, "XenoAudioProcessor.kt")).o();
        }
        this.b.w(ffcu.a);
    }
}
