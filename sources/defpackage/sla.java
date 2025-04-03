package defpackage;

import android.speech.SpeechRecognizer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sla implements ffji {
    public static final sla a = new sla();

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SpeechRecognizer speechRecognizer = (SpeechRecognizer) obj;
        speechRecognizer.getClass();
        speechRecognizer.stopListening();
        return ffcu.a;
    }
}
