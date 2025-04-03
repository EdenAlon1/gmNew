package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.speech.RecognitionListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sky implements RecognitionListener {
    public final Context a;
    private final ffxi b;
    private final ffbz c = ffca.a(new ffix() { // from class: skx
        @Override // defpackage.ffix
        public final Object invoke() {
            cfup cfupVar = shv.a;
            return Boolean.valueOf(shv.a(sky.this.a));
        }
    });

    public sky(Context context, ffxi ffxiVar) {
        this.a = context;
        this.b = ffxiVar;
    }

    private final boolean a() {
        return ((Boolean) this.c.a()).booleanValue();
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSegmentedSession() {
        this.b.e(null);
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        if (i == 7) {
            this.b.e(null);
        } else {
            this.b.e(new skt(a.f(i, "SODA error ", " occurred"), i));
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
        bundle.getClass();
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        bundle.getClass();
        if (!(a() && bundle.getBoolean("final_result")) && bundle.containsKey("soda_event")) {
            this.b.b(new skv(bundle));
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        bundle.getClass();
        this.b.b(sku.a);
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        bundle.getClass();
        this.b.e(null);
    }

    @Override // android.speech.RecognitionListener
    public final void onSegmentResults(Bundle bundle) {
        bundle.getClass();
        if (a() && bundle.containsKey("soda_event")) {
            this.b.b(new skv(bundle));
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
    }
}
