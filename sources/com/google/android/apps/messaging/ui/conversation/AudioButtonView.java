package com.google.android.apps.messaging.ui.conversation;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.MediaRecorder;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;
import defpackage.a;
import defpackage.alcb;
import defpackage.aldm;
import defpackage.aldr;
import defpackage.arby;
import defpackage.ardj;
import defpackage.axnw;
import defpackage.axos;
import defpackage.bcpt;
import defpackage.bcqk;
import defpackage.bcvr;
import defpackage.bcwz;
import defpackage.bcxb;
import defpackage.bcxc;
import defpackage.cful;
import defpackage.cqoh;
import defpackage.crnx;
import defpackage.csix;
import defpackage.csjy;
import defpackage.ctch;
import defpackage.ctcp;
import defpackage.ctcy;
import defpackage.ctcz;
import defpackage.ctda;
import defpackage.cxrj;
import defpackage.cxro;
import defpackage.cxwi;
import defpackage.cxxp;
import defpackage.cxxq;
import defpackage.cxxr;
import defpackage.cxxs;
import defpackage.dclb;
import defpackage.dcle;
import defpackage.dcln;
import defpackage.ddym;
import defpackage.ddzb;
import defpackage.dteh;
import defpackage.ehdr;
import defpackage.emwl;
import defpackage.eohh;
import defpackage.eppr;
import defpackage.epts;
import defpackage.eptu;
import defpackage.eqln;
import defpackage.erpp;
import defpackage.errk;
import defpackage.errl;
import defpackage.errm;
import defpackage.ffbr;
import defpackage.ueg;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AudioButtonView extends cxwi implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener {
    private static final dcle A = dcle.b(epts.VOICE, eptu.COLLAPSED);
    public static final /* synthetic */ int z = 0;
    private AppCompatImageView B;
    private AppCompatImageView C;
    private AppCompatImageView D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private GestureDetector H;
    private ddym I;
    private int J;
    private int K;
    private long L;
    private Runnable M;
    private int N;
    private int O;
    public long a;
    public bcpt b;
    public boolean c;
    public errk d;
    public int e;
    public cqoh f;
    public ctcy g;
    public cxxp h;
    public arby i;
    public ContentResolver j;
    public errl k;
    public errl l;
    public errm m;
    public ffbr n;
    public ffbr o;
    public aldm p;
    public aldr q;
    public ddzb r;
    public bcwz s;
    public alcb t;
    public ffbr u;
    public ffbr v;
    public int w;
    public cxxr x;
    public cxxq y;

    public AudioButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = 1;
        this.e = 307200;
    }

    public final void a() {
        this.p.b(TimeUnit.MILLISECONDS.toSeconds(this.f.f().toEpochMilli() - this.a), 2, eqln.NOISE_CANCELLATION_STATE_UNKNOWN);
        this.c = true;
        d(false);
        cxxr cxxrVar = this.x;
        if (cxxrVar != null) {
            cxxrVar.a.a();
        }
        g(1);
        Toast.makeText(getContext(), R.string.audio_recorder_recording_cancelled_text, 0).show();
    }

    public final void b(int i, ctda ctdaVar) {
        ctcy ctcyVar = this.g;
        ctcp ctcpVar = new ctcp();
        ctcpVar.a = ctch.b(i);
        ctcpVar.b(new AudioAttributes.Builder().setUsage(13).build());
        axnw.h(ctcyVar.b(ctcpVar.a(), new cxrj(ctdaVar)).e(ctcz.class, new emwl() { // from class: cxrk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i2 = AudioButtonView.z;
                csjy.p("BugleAudio", (ctcz) obj, "Failed to play sound for audio button");
                return ctck.c(2);
            }
        }, erpp.a));
    }

    public final void c() {
        long epochMilli = this.f.f().toEpochMilli();
        if (epochMilli - this.L < this.K) {
            this.q.o(new Supplier() { // from class: aldq
                @Override // java.util.function.Supplier
                public final Object get() {
                    return aldr.c(3, 2);
                }
            });
            return;
        }
        this.q.o(new Supplier() { // from class: aldp
            @Override // java.util.function.Supplier
            public final Object get() {
                return aldr.c(2, 2);
            }
        });
        this.I.c();
        removeCallbacks(this.M);
        postDelayed(this.M, this.J);
        this.L = epochMilli;
    }

    public final void d(boolean z2) {
        eppr epprVar;
        errk errkVar = this.d;
        if (errkVar != null) {
            errkVar.cancel(true);
            this.d = null;
        }
        long epochMilli = this.f.f().toEpochMilli() - this.a;
        if (!f() || epochMilli <= 0) {
            g(1);
            return;
        }
        final Uri b = this.i.b();
        if (b != null) {
            if (this.c) {
                axos.a(new Runnable() { // from class: cxrm
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioButtonView.this.j.delete(b, null, null);
                    }
                }, this.l);
                g(5);
                return;
            }
            if (((Boolean) cful.o.e()).booleanValue()) {
                dteh dtehVar = dteh.a;
                if (dtehVar == null) {
                    throw new NullPointerException("Null voiceMetadata");
                }
                String str = true != ((Boolean) ardj.a.e()).booleanValue() ? "audio/amr" : "audio/mp4";
                eohh eohhVar = eohh.AUDIO_CHOOSER;
                if (eohhVar == null) {
                    throw new NullPointerException("Null contentSource");
                }
                ueg uegVar = new ueg(str, b, eohhVar, epochMilli, dtehVar);
                bcvr bcvrVar = (bcvr) this.b.a();
                dcle dcleVar = A;
                String b2 = this.b.b();
                MessagePartCoreData a = bcvrVar.F.a(uegVar, dcleVar);
                if (a instanceof PendingAttachmentData ? bcvrVar.W((PendingAttachmentData) a, b2) : bcvrVar.V(a)) {
                    bcvrVar.I();
                }
                bcvrVar.J(1);
                epprVar = dclb.a(uegVar, dcleVar);
            } else {
                bcwz bcwzVar = this.s;
                bcxb C = bcxc.C();
                bcqk bcqkVar = (bcqk) C;
                bcqkVar.c = true == ((Boolean) ardj.a.e()).booleanValue() ? "audio/mp4" : "audio/amr";
                bcqkVar.d = b;
                bcqkVar.e = b;
                C.g(epochMilli);
                C.o(eohh.AUDIO_CHOOSER);
                MessagePartData c = bcwzVar.c(C.r());
                eppr b3 = dcln.b(c, A);
                c.h = b3;
                ((bcvr) this.b.a()).U(Collections.singletonList(c), this.b.b());
                epprVar = b3;
            }
            this.t.g(epprVar, ((bcvr) this.b.a()).k() - 1);
            if (z2) {
                aldm aldmVar = this.p;
                final long seconds = TimeUnit.MILLISECONDS.toSeconds(epochMilli);
                final eqln eqlnVar = eqln.NOISE_CANCELLATION_STATE_UNKNOWN;
                aldmVar.o(new Supplier() { // from class: aldl
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return aldm.d(4, seconds, 2, eqlnVar);
                    }
                });
            } else {
                this.p.c(TimeUnit.MILLISECONDS.toSeconds(epochMilli), 2, eqln.NOISE_CANCELLATION_STATE_UNKNOWN);
            }
        }
        g(5);
        b(R.raw.audio_end, new ctda() { // from class: cxrn
            @Override // defpackage.ctda
            public final void a() {
                AudioButtonView audioButtonView = AudioButtonView.this;
                if (audioButtonView.w == 5) {
                    audioButtonView.g(1);
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.H.onTouchEvent(motionEvent);
    }

    protected final void e() {
        int i = this.w;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            this.h.a(this, this.C, this.D).end();
            this.C.setImageDrawable(null);
            this.E.setColorFilter(this.N, PorterDuff.Mode.SRC_ATOP);
            this.B.setImageDrawable(this.E);
            this.C.setScaleX(1.0f);
            this.C.setScaleY(1.0f);
            this.D.setVisibility(8);
            return;
        }
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                csix.c("Invalid mode for AudioRecordView!");
                return;
            }
            this.E.setColorFilter(getContext().getColor(R.color.audio_button_pressed_icon_color), PorterDuff.Mode.SRC_ATOP);
            this.B.setImageDrawable(this.E);
            this.G.setColorFilter(this.O, PorterDuff.Mode.SRC_ATOP);
            this.C.setImageDrawable(this.G);
            float fraction = getResources().getFraction(R.fraction.audio_button_animation_start_size, 1, 1);
            this.C.setScaleX(fraction);
            this.C.setScaleY(fraction);
            this.D.setVisibility(0);
            this.h.a(this, this.C, this.D).start();
        }
    }

    public final boolean f() {
        int i = this.w;
        return i == 3 || i == 4;
    }

    public final void g(int i) {
        if (this.w != i) {
            this.w = i;
            cxxr cxxrVar = this.x;
            if (cxxrVar != null) {
                int i2 = i - 1;
                if (i2 == 0) {
                    cxxrVar.a.d(false);
                } else if (i2 == 1) {
                    cxxs cxxsVar = cxxrVar.a;
                    cxxsVar.b.e = cxxsVar.a.H().n();
                    cxxrVar.a.c.g(4);
                    cxxrVar.a.d.g(4);
                    cxxrVar.a.e.g(4);
                } else if (i2 == 2) {
                    cxxrVar.a.c(false);
                    cxxrVar.a.d(true);
                    if (crnx.j(cxxrVar.a.b.getContext())) {
                        cxxrVar.a.e();
                    }
                } else if (i2 != 3) {
                    cxxrVar.a.a();
                    cxxrVar.a.d(false);
                    if (crnx.j(cxxrVar.a.b.getContext())) {
                        cxxrVar.a.e();
                    }
                } else {
                    cxxrVar.a.e();
                    cxxrVar.a.c(true);
                }
            }
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d(false);
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        csjy.f("Bugle", a.r(i2, i, "Error occurred during audio recording what=", ", extra="));
        this.q.b(2);
        this.r.k(R.string.audio_recording_error);
        d(false);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        new FrameLayout.LayoutParams(-2, -2).gravity = 17;
        this.D = (AppCompatImageView) findViewById(R.id.audio_button_view_recording_indicator);
        this.C = (AppCompatImageView) findViewById(R.id.audio_button_view_background);
        this.B = (AppCompatImageView) findViewById(R.id.audio_button_view_microphone_icon);
        this.E = getContext().getDrawable(R.drawable.quantum_gm_ic_mic_none_white_24);
        Drawable drawable = getContext().getDrawable(R.drawable.quantum_ic_done_black_24);
        this.F = drawable;
        drawable.setColorFilter(getContext().getColor(R.color.audio_button_check_icon_color), PorterDuff.Mode.SRC_ATOP);
        this.G = getContext().getDrawable(R.drawable.compose2o_voice_message_button_background);
        this.H = new cxro(this, getContext(), new GestureDetector.SimpleOnGestureListener());
        this.N = ehdr.b(this.B, R.attr.colorInactiveComposeIcon);
        this.O = ehdr.b(this.B, R.attr.colorActiveComposeIcon);
        ddym ddymVar = new ddym((FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.voice_messages_single_tap_popup, (ViewGroup) null), 1, this, 2);
        this.I = ddymVar;
        ddymVar.b(ehdr.b(this, R.attr.colorPrimaryContainer));
        this.J = getResources().getInteger(R.integer.hold_to_record_tooltip_showup_duration_millis);
        this.K = getResources().getInteger(R.integer.hold_to_record_tooltip_showup_gap_millis);
        this.L = -r0;
        final ddym ddymVar2 = this.I;
        ddymVar2.getClass();
        this.M = new Runnable() { // from class: cxrl
            @Override // java.lang.Runnable
            public final void run() {
                ddym.this.a();
            }
        };
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 800) {
            csjy.i("Bugle", "Max duration reached while recording audio");
            Toast.makeText(getContext(), R.string.audio_recorder_time_limit_reached_text, 0).show();
            d(true);
        } else if (i == 801) {
            csjy.i("Bugle", "Max size reached while recording audio");
            d(true);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            e();
        }
    }
}
