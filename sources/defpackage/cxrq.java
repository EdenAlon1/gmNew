package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxrq implements ctda {
    final /* synthetic */ AudioButtonView a;

    public cxrq(AudioButtonView audioButtonView) {
        this.a = audioButtonView;
    }

    @Override // defpackage.ctda
    public final void a() {
        AudioButtonView audioButtonView = this.a;
        if (audioButtonView.w == 2) {
            if (!audioButtonView.i.e(audioButtonView, audioButtonView, audioButtonView.e)) {
                this.a.r.k(R.string.audio_recording_start_failed);
                return;
            }
            AudioButtonView audioButtonView2 = this.a;
            audioButtonView2.a = audioButtonView2.f.f().toEpochMilli();
            this.a.g(3);
            AudioButtonView audioButtonView3 = this.a;
            int a = audioButtonView3.i.a(audioButtonView3.e) - this.a.getResources().getInteger(R.integer.audio_timer_warning_duration_seconds);
            AudioButtonView audioButtonView4 = this.a;
            audioButtonView4.d = audioButtonView4.m.schedule(new eroi(null), a, TimeUnit.SECONDS);
            AudioButtonView audioButtonView5 = this.a;
            elfr.l(audioButtonView5.d, new cxrp(this), audioButtonView5.k);
        }
    }
}
