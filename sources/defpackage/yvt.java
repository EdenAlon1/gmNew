package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class yvt extends ffkh implements ffji {
    public yvt(Object obj) {
        super(1, obj, yvz.class, "onSwipeToCancelRecording", "onSwipeToCancelRecording(Landroid/content/Context;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        yvz yvzVar = (yvz) this.g;
        ensk e = yvz.a.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter", "onSwipeToCancelRecording", 160, "VoiceInputUiAdapter.kt")).q("Voice input swipe to cancel");
        yvzVar.b(context, R.string.audio_recorder_recording_cancelled_text);
        dtij.a(yvzVar.a(), false, false, null, 6);
        return ffcu.a;
    }
}
