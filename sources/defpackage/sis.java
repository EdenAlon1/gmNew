package defpackage;

import android.speech.SpeechRecognizer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sis implements ffji {
    final /* synthetic */ siz a;
    final /* synthetic */ ffrf b;

    public sis(siz sizVar, ffrf ffrfVar) {
        this.a = sizVar;
        this.b = ffrfVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((SpeechRecognizer) obj).checkRecognitionSupport(slg.a(this.a.d), this.a.h, new siq(this.b));
        return ffcu.a;
    }
}
