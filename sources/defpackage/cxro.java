package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxro extends GestureDetector {
    final /* synthetic */ AudioButtonView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxro(AudioButtonView audioButtonView, Context context, GestureDetector.OnGestureListener onGestureListener) {
        super(context, onGestureListener);
        this.a = audioButtonView;
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ekzm b;
        int action = motionEvent.getAction();
        if (action == 0) {
            ekzm b2 = ((elbx) this.a.v.b()).b("AudioButtonView ACTION_DOWN");
            try {
                AudioButtonView audioButtonView = this.a;
                if (((ctud) audioButtonView.n.b()).o()) {
                    int mode = ((AudioManager) audioButtonView.u.b()).getMode();
                    if (mode != 2 && mode != 3) {
                        audioButtonView.c = false;
                        if (audioButtonView.w == 1) {
                            audioButtonView.g(2);
                            audioButtonView.b(R.raw.audio_initiate, new cxrq(audioButtonView));
                        }
                    }
                    csjy.i("Bugle", "Cannot record while call is in progress.");
                    audioButtonView.r.k(R.string.audio_recorder_call_in_progress);
                } else {
                    csjy.i("Bugle", "Record audio permission not granted yet.");
                    ((ctuk) audioButtonView.o.b()).j(new cxrr(audioButtonView));
                }
                b2.close();
            } finally {
                try {
                    b2.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } else if (action == 1) {
            b = ((elbx) this.a.v.b()).b("AudioButtonView ACTION_UP");
            try {
                AudioButtonView audioButtonView2 = this.a;
                if (audioButtonView2.w == 2) {
                    audioButtonView2.c();
                }
                audioButtonView2.d(false);
                b.close();
            } finally {
            }
        } else if (action == 2) {
            AudioButtonView audioButtonView3 = this.a;
            cxxq cxxqVar = audioButtonView3.y;
            if (cxxqVar != null && audioButtonView3.f()) {
                float rawX = motionEvent.getRawX();
                motionEvent.getRawY();
                cxxs cxxsVar = cxxqVar.a;
                cxxsVar.a.getLocationOnScreen(cxxsVar.f);
                if (!cxxsVar.h.d() ? rawX < cxxsVar.f[0] + (r3.getWidth() * cxxsVar.g) : rawX > cxxsVar.f[0] + (r3.getWidth() * (1.0f - cxxsVar.g))) {
                    b = ((elbx) cxxqVar.a.i.b()).b("VoiceMessagesUiController#onTouchMove");
                    try {
                        cxxqVar.a.b.a();
                        b.close();
                    } finally {
                    }
                }
            }
        } else if (action == 3) {
            this.a.a();
            return true;
        }
        return true;
    }
}
