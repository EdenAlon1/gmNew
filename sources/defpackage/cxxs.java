package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.constraint.ConstraintLayout;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.audio.attachment.ui.PausableChronometer;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxxs {
    private final cxxr A;
    public final ComposeMessageView a;
    public final AudioButtonView b;
    public final crly c;
    public final crly d;
    public final crly e;
    public final int[] f;
    public final float g;
    public final cuxh h;
    public final ffbr i;
    public boolean j;
    private Integer k;
    private final Context l;
    private final Vibrator m;
    private ImageView n;
    private final View o;
    private final View p;
    private final PlainTextEditText q;
    private final cxxp r;
    private final Transition s;
    private final Transition t;
    private final AttachmentsContainer u;
    private ImageView v;
    private aw w;
    private aw x;
    private final int y;
    private final cxxq z;

    public cxxs(cxxp cxxpVar, Context context, Vibrator vibrator, cuxh cuxhVar, ffbr ffbrVar, ffbr ffbrVar2, ComposeMessageView composeMessageView, bcpt bcptVar) {
        this.n = null;
        cxxq cxxqVar = new cxxq(this);
        this.z = cxxqVar;
        cxxr cxxrVar = new cxxr(this);
        this.A = cxxrVar;
        this.l = context;
        this.m = vibrator;
        this.h = cuxhVar;
        this.i = ffbrVar;
        this.r = cxxpVar;
        cxxpVar.b = composeMessageView;
        this.a = composeMessageView;
        this.d = new crly(composeMessageView, R.id.audio_timer_dot_view_stub, R.id.audio_timer_dot);
        this.c = new crly(composeMessageView, R.id.audio_timer_view_stub, R.id.audio_timer_text);
        this.q = (PlainTextEditText) composeMessageView.findViewById(R.id.compose_message_text);
        this.o = composeMessageView.findViewById(R.id.send_message_button_container);
        this.p = composeMessageView.findViewById(R.id.send_message_button_icon);
        this.u = (AttachmentsContainer) composeMessageView.findViewById(R.id.attachments_container);
        AudioButtonView audioButtonView = (AudioButtonView) composeMessageView.findViewById(R.id.audio_button_view);
        this.b = audioButtonView;
        audioButtonView.b = bcptVar;
        audioButtonView.x = cxxrVar;
        audioButtonView.y = cxxqVar;
        if (((Boolean) ((cfup) uky.p.get()).e()).booleanValue()) {
            this.n = (ImageView) new crly(composeMessageView, R.id.audio_button_compose_view_stub, R.id.audio_button_compose_view).b();
        }
        this.e = new crly(composeMessageView, R.id.record_cancel_button_view_v1_stub, R.id.record_cancel_button_v1);
        this.f = new int[2];
        this.s = TransitionInflater.from(composeMessageView.getContext()).inflateTransition(true != g(ffbrVar2) ? R.transition.message_box_slide_left_transition : R.transition.message_box_slide_left_transition_magic_compose);
        this.t = TransitionInflater.from(composeMessageView.getContext()).inflateTransition(true != g(ffbrVar2) ? R.transition.message_box_slide_right_transition : R.transition.message_box_slide_right_transition_magic_compose);
        this.y = context.getColor(R.color.voice_messages_slide_to_cancel_triangle_icon_color);
        this.g = composeMessageView.getResources().getFraction(R.fraction.swipe_to_cancel_gesture_trigger_ratio, 1, 1);
    }

    private final void f(boolean z) {
        this.o.setVisibility(true != this.b.f() ? 0 : 4);
        cxrx e = this.a.H().e();
        int dimension = (int) this.a.getResources().getDimension(R.dimen.compose_message_text_box_padding_top_bottom);
        if (z) {
            this.o.setTranslationX(0.0f);
            this.p.setTranslationX(0.0f);
            this.q.setPaddingRelative(0, dimension, 0, dimension);
            if (e != null) {
                ((cxsn) e).d.setTranslationX(0.0f);
                return;
            }
            return;
        }
        if (e == null) {
            this.o.setTranslationX(this.a.getResources().getDimension(R.dimen.multi_sim_translation_x_when_audio_button_up_leveled) * (true == this.h.d() ? -1 : 1));
            this.p.setTranslationX(0.0f);
            this.q.setPaddingRelative(0, dimension, 0, dimension);
        } else {
            this.o.setTranslationX(this.a.getResources().getDimension(R.dimen.multi_sim_translation_x_when_audio_button_and_emoji_buttonup_leveled) * (true != this.h.d() ? 1 : -1));
            ((cxsn) e).d.setTranslationX(this.a.getResources().getDimension(R.dimen.emoji_button_translation_x_when_audio_button_up_leveled) * (true != this.h.d() ? 1 : -1));
            this.p.setTranslationX(this.a.getResources().getDimension(R.dimen.sim_icon_translation_x_when_audio_button_and_emoji_button_up_leveled) * (true == this.h.d() ? -1 : 1));
            this.q.setPaddingRelative(0, dimension, (int) this.a.getResources().getDimension(R.dimen.edit_text_end_padding_when_audio_button_and_emoji_buttonup_leveled), dimension);
        }
    }

    private static boolean g(ffbr ffbrVar) {
        return ctjd.c() && ((ctyz) ffbrVar.b()).k();
    }

    public final void a() {
        ((PausableChronometer) this.c.b()).stop();
        crly crlyVar = this.d;
        View b = this.c.b();
        View b2 = crlyVar.b();
        cxxp cxxpVar = this.r;
        if (cxxpVar.a == null) {
            cxwf cxwfVar = cxxpVar.c;
            ObjectAnimator a = cxwf.a(b, true, cxxpVar.b.getResources().getInteger(R.integer.audio_button_fade_in_animation_duration_millis));
            cxwf cxwfVar2 = cxxpVar.c;
            ObjectAnimator a2 = cxwf.a(b2, true, cxxpVar.b.getResources().getInteger(R.integer.audio_button_fade_in_animation_duration_millis));
            cxxpVar.a = new AnimatorSet();
            cxxpVar.a.addListener(new cxxo(b, b2));
            cxxpVar.a.play(a).with(a2);
        }
        cxxpVar.a.start();
        this.r.c(this.q).start();
        if (this.w == null) {
            return;
        }
        TransitionManager.beginDelayedTransition(this.a, this.t);
        aw awVar = this.w;
        awVar.getClass();
        awVar.b(this.a);
        b();
        this.u.H().p = 0;
    }

    public final void b() {
        boolean k = this.a.H().k();
        boolean f = this.b.f();
        ImageView imageView = this.n;
        int i = 4;
        if (imageView != null) {
            imageView.setVisibility(true != k ? 0 : 4);
        } else {
            this.b.setVisibility((!k || f) ? 0 : 4);
        }
        if (this.j) {
            f(k);
            return;
        }
        View view = this.o;
        if (k && !f) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public final void c(boolean z) {
        if (!z) {
            if (this.k != null) {
                ((PausableChronometer) this.c.b()).setTextColor(this.k.intValue());
            }
        } else {
            Context context = this.l;
            crly crlyVar = this.c;
            int color = context.getColor(R.color.chronometer_text_color_near_limit);
            this.k = Integer.valueOf(((PausableChronometer) crlyVar.b()).getTextColors().getDefaultColor());
            ((PausableChronometer) this.c.b()).setTextColor(color);
        }
    }

    public final void d(boolean z) {
        cxrx e = this.a.H().e();
        if (!z) {
            Activity e2 = ddzb.e(this.l);
            e2.getClass();
            e2.getWindow().clearFlags(128);
            this.r.b(this.c.b(), this.d.b()).end();
            if (this.j) {
                f(this.a.H().k());
            }
            if (e != null) {
                ((cxsn) e).d.setVisibility(0);
                return;
            }
            return;
        }
        Activity e3 = ddzb.e(this.l);
        e3.getClass();
        e3.getWindow().addFlags(128);
        PausableChronometer pausableChronometer = (PausableChronometer) this.c.b();
        pausableChronometer.stop();
        pausableChronometer.setBase(pausableChronometer.a.a());
        pausableChronometer.b = 0L;
        pausableChronometer.start();
        this.c.g(0);
        this.d.g(0);
        ((ImageView) this.d.b()).setVisibility(0);
        this.o.setVisibility(4);
        TransitionManager.beginDelayedTransition(this.a, this.s);
        if (this.x == null) {
            if (this.w == null) {
                aw awVar = new aw();
                this.w = awVar;
                awVar.e(this.a);
            }
            aw awVar2 = new aw();
            this.x = awVar2;
            awVar2.e(this.a);
            this.x.f(R.id.compose_message_box_linear_layout, 6, ((Boolean) cful.p.e()).booleanValue() ? this.a.getId() : R.id.message_compose_view_container_with_c2o, 6, (int) this.a.getResources().getDimension(R.dimen.message_box_slide_margin));
            this.x.l(R.id.plus_button, 4);
            this.x.l(R.id.camera_gallery_button, 4);
            this.x.d(R.id.plus_button, 6);
            this.x.d(R.id.camera_gallery_button, 6);
            this.x.f(R.id.camera_gallery_button, 7, R.id.compose_message_box_linear_layout, 6, 0);
            this.x.l(R.id.record_cancel_button_v1, 0);
            this.x.f(R.id.record_cancel_button_v1, 7, R.id.audio_button_view, 6, 0);
            this.x.f(R.id.record_cancel_button_v1, 6, R.id.audio_timer_text, 7, 0);
        }
        this.x.b(this.a);
        AttachmentsContainer attachmentsContainer = this.u;
        attachmentsContainer.H().p = this.l.getResources().getInteger(R.integer.message_box_sliding_animation_duration_millis);
        if (e != null) {
            ((cxsn) e).d.setVisibility(4);
        }
        this.r.c(this.q).reverse();
        this.r.b(this.c.b(), this.d.b()).start();
        if (this.v == null) {
            this.v = (ImageView) ((ConstraintLayout) this.e.b()).findViewById(R.id.triangle_icon);
        }
        ImageView imageView = this.v;
        imageView.getDrawable().setColorFilter(this.y, PorterDuff.Mode.SRC_ATOP);
        imageView.setRotation(true != this.h.d() ? 0.0f : 180.0f);
        this.r.b(this.c.b(), this.d.b()).start();
    }

    public final void e() {
        VibrationEffect createOneShot;
        long integer = this.l.getResources().getInteger(R.integer.audio_timer_warning_vibration_duration_millis);
        Vibrator vibrator = this.m;
        createOneShot = VibrationEffect.createOneShot(integer, -1);
        vibrator.vibrate(createOneShot);
    }
}
