package com.google.android.apps.messaging.audio.attachment;

import android.animation.TimeAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.shared.audio.attachment.ui.AudioPlaybackSeekBar;
import com.google.android.apps.messaging.shared.audio.attachment.ui.PausableChronometer;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import defpackage.arck;
import defpackage.arcl;
import defpackage.bcse;
import defpackage.cfup;
import defpackage.crij;
import defpackage.crik;
import defpackage.crly;
import defpackage.cxqh;
import defpackage.ddzb;
import defpackage.ehdr;
import defpackage.ekyo;
import defpackage.ekzz;
import defpackage.elav;
import defpackage.elbt;
import defpackage.elbx;
import defpackage.eleg;
import defpackage.ellq;
import defpackage.emxf;
import defpackage.emyl;
import defpackage.ffbr;
import defpackage.sgu;
import defpackage.sgx;
import defpackage.sgy;
import defpackage.shw;
import defpackage.smn;
import defpackage.smu;
import defpackage.smw;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AudioAttachmentView extends sgy implements crij {
    public ViewSwitcher a;
    PausableChronometer b;
    AudioPlaybackSeekBar c;
    crly d;
    public boolean e;
    public crik f;
    public cxqh g;
    public smw h;
    public ffbr i;
    public ffbr j;
    public ffbr k;
    public ffbr l;
    public ffbr m;
    public ffbr n;
    final int o;
    private GradientDrawable p;
    private final RectF q;
    private Uri r;
    private final int s;
    private final Path t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private int y;

    public AudioAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = new RectF();
        new arcl(3, Duration.ofMillis(-1L), Duration.ZERO);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sgx.a);
        int i = new int[]{1, 2, 3}[obtainStyledAttributes.getInt(0, 0)];
        this.o = i;
        LayoutInflater from = LayoutInflater.from(getContext());
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        from.inflate(i2 != 1 ? i2 != 2 ? R.layout.audio_attachment_view_normal_layout : R.layout.audio_attachment_view_mini_layout : R.layout.audio_attachment_view_compact_layout, (ViewGroup) this, true);
        obtainStyledAttributes.recycle();
        setWillNotDraw(i == 3);
        this.t = new Path();
        this.s = context.getResources().getDimensionPixelSize(R.dimen.audio_attachment_corner_radius);
        setContentDescription(context.getString(R.string.audio_attachment_content_description));
    }

    private final void k(boolean z, Duration duration) {
        PausableChronometer pausableChronometer = this.b;
        if (pausableChronometer == null) {
            return;
        }
        pausableChronometer.stop();
        pausableChronometer.b = pausableChronometer.a.a() - pausableChronometer.getBase();
        pausableChronometer.c(duration.isNegative() ? 0L : duration.toMillis());
        if (z) {
            pausableChronometer.setBase(pausableChronometer.a.a() - pausableChronometer.b);
            pausableChronometer.start();
        }
    }

    private final void l(boolean z, Duration duration, Duration duration2) {
        AudioPlaybackSeekBar audioPlaybackSeekBar = this.c;
        if (audioPlaybackSeekBar == null) {
            return;
        }
        long millis = duration.toMillis();
        audioPlaybackSeekBar.d += audioPlaybackSeekBar.a.a() - audioPlaybackSeekBar.e;
        if (audioPlaybackSeekBar.c.isStarted()) {
            audioPlaybackSeekBar.c.end();
        }
        audioPlaybackSeekBar.b = Math.max(millis, 0L);
        audioPlaybackSeekBar.setProgress(millis > 0 ? (int) ((duration2.toMillis() * 100) / millis) : 0);
        audioPlaybackSeekBar.a();
        if (z) {
            audioPlaybackSeekBar.e = audioPlaybackSeekBar.a.a();
            if (audioPlaybackSeekBar.c.isStarted()) {
                return;
            }
            audioPlaybackSeekBar.c.start();
        }
    }

    private final void m() {
        if (f()) {
            this.b.setTextColor(cxqh.f(getContext()));
            final AudioPlaybackSeekBar audioPlaybackSeekBar = this.c;
            smw smwVar = this.h;
            int d = ehdr.d(getContext(), R.attr.colorSurfaceVariant, "AudioDrawables");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(2);
            gradientDrawable.setStroke((int) TypedValue.applyDimension(1, 2.0f, smwVar.b.getDisplayMetrics()), d);
            smw smwVar2 = this.h;
            int d2 = ehdr.d(getContext(), R.attr.colorPrimaryBrandIcon, "AudioDrawables");
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.setIntrinsicHeight(smwVar2.a);
            shapeDrawable.setIntrinsicWidth(smwVar2.a);
            shapeDrawable.setColorFilter(d2, PorterDuff.Mode.SRC_ATOP);
            audioPlaybackSeekBar.f = gradientDrawable;
            audioPlaybackSeekBar.g = shapeDrawable;
            audioPlaybackSeekBar.setProgressDrawable(audioPlaybackSeekBar.f);
            audioPlaybackSeekBar.setThumb(audioPlaybackSeekBar.g);
            if (audioPlaybackSeekBar.c == null) {
                audioPlaybackSeekBar.c = new TimeAnimator();
                audioPlaybackSeekBar.c.setRepeatCount(-1);
                audioPlaybackSeekBar.c.setTimeListener(new TimeAnimator.TimeListener() { // from class: ardd
                    @Override // android.animation.TimeAnimator.TimeListener
                    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
                        AudioPlaybackSeekBar audioPlaybackSeekBar2 = AudioPlaybackSeekBar.this;
                        int i = 0;
                        if (audioPlaybackSeekBar2.b > 0) {
                            i = ermn.b((int) ((((audioPlaybackSeekBar2.d + (audioPlaybackSeekBar2.a != null ? r4.a() : 0L)) - audioPlaybackSeekBar2.e) / audioPlaybackSeekBar2.b) * 100.0f), 0, 100);
                        }
                        audioPlaybackSeekBar2.setProgress(i);
                    }
                });
            }
        }
    }

    @Override // defpackage.arcc
    public final Uri a() {
        Uri uri = this.r;
        return uri == null ? Uri.EMPTY : uri;
    }

    @Override // defpackage.crij
    public final void b(crik crikVar) {
        crik crikVar2;
        boolean z = true;
        if (crikVar != null && (crikVar2 = this.f) != null && crikVar2 != crikVar) {
            z = false;
        }
        emxf.a(z);
        this.f = crikVar;
    }

    @Override // defpackage.crid
    public final void d(boolean z, bcse bcseVar, Drawable drawable, float[] fArr) {
        boolean z2 = true;
        if (this.o == 1) {
            if (this.p == null) {
                this.p = cxqh.o(getContext());
            }
            this.p.setColor(cxqh.c(getContext(), isSelected()));
            this.p.setCornerRadii(fArr);
            setBackground(this.p);
        }
        boolean az = bcseVar.az();
        int d = this.g.d();
        boolean z3 = az || z;
        if (this.y == d && this.w == z3 && this.x == z) {
            z2 = false;
        }
        this.x = z;
        this.w = z3;
        this.y = d;
        if (z2) {
            m();
        }
    }

    @Override // defpackage.arcc
    public final void e(arck arckVar) {
        arcl arclVar = (arcl) arckVar;
        int i = arclVar.c - 1;
        if (i == 0) {
            this.a.setDisplayedChild(1);
            k(true, arclVar.b);
            l(true, arclVar.a, arclVar.b);
        } else if (i != 1) {
            this.a.setDisplayedChild(0);
            k(false, arclVar.a);
            l(false, arclVar.a, Duration.ZERO);
        } else {
            this.a.setDisplayedChild(0);
            k(false, arclVar.b);
            l(false, arclVar.a, arclVar.b);
        }
    }

    public final boolean f() {
        int i = this.o;
        return i == 2 || i == 1;
    }

    @Override // defpackage.crii
    public final void g(MessagePartCoreData messagePartCoreData, boolean z, String str, int i) {
        emxf.a(messagePartCoreData == null || messagePartCoreData.ba());
        Uri t = messagePartCoreData != null ? messagePartCoreData.t() : null;
        long k = messagePartCoreData != null ? messagePartCoreData.k() : -1L;
        this.e = z;
        elav a = ((ekyo) this.i.b()).a("AudioAttachmentView#bind");
        try {
            ekzz f = eleg.f("AudioAttachmentView#bind");
            try {
                this.r = t;
                this.e = z;
                m();
                e(new arcl(3, Duration.ofMillis(k), Duration.ZERO));
                f.close();
                a.close();
                if (((Boolean) ((cfup) shw.a.get()).e()).booleanValue()) {
                    MessageIdType B = messagePartCoreData.B();
                    String aa = messagePartCoreData.aa();
                    VmtTable.BindData F = messagePartCoreData.F();
                    if (this.o == 1 && this.e && ((Optional) this.j.b()).isPresent() && ((Optional) this.k.b()).isPresent()) {
                        ((smn) ((Optional) this.j.b()).get()).a(this.d, B, aa, a(), F, (smu) ((Optional) this.k.b()).get(), str);
                    }
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.arcc
    public final void h() {
        ((ddzb) this.n.b()).h(R.string.audio_recording_replay_failed);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (this.u != width || this.v != height) {
            this.q.set(0.0f, 0.0f, width, height);
            this.t.reset();
            Path path = this.t;
            RectF rectF = this.q;
            float f = this.s;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            this.u = width;
            this.v = height;
        }
        canvas.clipPath(this.t);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        View findViewById;
        GradientDrawable gradientDrawable;
        super.onFinishInflate();
        if (this.o == 2 && (findViewById = findViewById(R.id.audio_preview_container)) != null && (gradientDrawable = (GradientDrawable) findViewById.getBackground()) != null) {
            gradientDrawable.setColor(ehdr.d(getContext(), R.attr.colorPrimaryBackground, "AudioDrawables"));
            setBackground(gradientDrawable);
        }
        this.a = (ViewSwitcher) findViewById(R.id.play_pause_button);
        if (f()) {
            PausableChronometer pausableChronometer = (PausableChronometer) findViewById(R.id.timer);
            pausableChronometer.getClass();
            AudioPlaybackSeekBar audioPlaybackSeekBar = (AudioPlaybackSeekBar) findViewById(R.id.seek);
            audioPlaybackSeekBar.getClass();
            this.b = pausableChronometer;
            this.c = audioPlaybackSeekBar;
            audioPlaybackSeekBar.setOnSeekBarChangeListener(new elbt((elbx) this.l.b(), new sgu(this, audioPlaybackSeekBar, pausableChronometer)));
            if (this.o == 1) {
                audioPlaybackSeekBar.setOnTouchListener(new View.OnTouchListener() { // from class: ardc
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int i = AudioPlaybackSeekBar.h;
                        if (motionEvent.getAction() == 0) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            view.getParent().requestDisallowInterceptTouchEvent(false);
                        }
                        return false;
                    }
                });
            }
        }
        ((ellq) this.m.b()).c(this.a, new emyl() { // from class: sgt
            @Override // defpackage.emyl
            public final Object get() {
                return new arcd(AudioAttachmentView.this);
            }
        });
        this.d = new crly(this, R.id.vmt_container_stub, R.id.vmt_container);
    }

    @Override // android.view.View
    public final void setLongClickable(boolean z) {
        super.setLongClickable(z);
        this.a.setOnLongClickListener(z ? new View.OnLongClickListener() { // from class: sgs
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                AudioAttachmentView audioAttachmentView = AudioAttachmentView.this;
                crik crikVar = audioAttachmentView.f;
                if (crikVar == null) {
                    return false;
                }
                return crikVar.g(audioAttachmentView);
            }
        } : null);
    }

    @Override // defpackage.crii
    public final void c() {
    }
}
