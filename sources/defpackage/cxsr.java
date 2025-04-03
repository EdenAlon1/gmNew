package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxsr {
    public final Optional b;
    public final ComposeMessageView c;
    public final View d;
    public ImageView e;
    public SharedPreferences.OnSharedPreferenceChangeListener f;
    public final cxrx g;
    public final cxrx h;
    public cxrx i;
    public cxrx j;
    public aw k;
    public aw l;
    public Transition m;
    public Transition n;
    public final boolean o;
    public final List p;
    public ValueAnimator q;
    private final elbx u;
    private final ImageView v;
    private final LinearLayout w;
    private static final cfva r = cfvl.q(134702254);
    public static final cfva a = cfvl.d(cfvl.b, "collapse_attach_buttons_text_threshold", 0.75f);
    private static final cxsq[] s = {new cxsq(R.drawable.ic_compose_plus_unselected, R.drawable.ic_compose_plus_selected), new cxsq(R.drawable.ic_compose_plus_unselected_v2, R.drawable.ic_compose_plus_selected_v2), new cxsq(R.drawable.ic_compose_plus_unselected_v2, R.drawable.ic_compose_plus_selected_v2)};
    private static final cxsq[] t = {new cxsq(R.drawable.ic_compose_camera_gallery_unselected, R.drawable.ic_compose_camera_gallery_selected, 0.08f, 0.12f), new cxsq(R.drawable.ic_compose_camera_gallery_unselected_v2, R.drawable.ic_compose_camera_gallery_selected_v2, 0.18f, 0.24f), new cxsq(R.drawable.ic_compose_camera_gallery_unselected_v3, R.drawable.ic_compose_camera_gallery_selected_v3, 0.17f, 0.25f)};

    public cxsr(final Context context, elbx elbxVar, Optional optional, ffbr ffbrVar, final ffbr ffbrVar2, ComposeMessageView composeMessageView, final ffbr ffbrVar3, ffbr ffbrVar4) {
        ComposeMessageView composeMessageView2;
        cxrx cxrxVar;
        int i;
        int i2;
        final ComposeMessageView composeMessageView3;
        cxrx cxrxVar2;
        int i3;
        ImageView imageView;
        this.u = elbxVar;
        this.c = composeMessageView;
        ImageView imageView2 = (ImageView) composeMessageView.findViewById(R.id.expand_attach_button);
        this.v = imageView2;
        LinearLayout linearLayout = (LinearLayout) composeMessageView.findViewById(R.id.compose_message_box_linear_layout);
        this.w = linearLayout;
        this.d = composeMessageView.findViewById(R.id.compress_info_image_view);
        this.b = optional;
        if (!g() || composeMessageView.findViewById(R.id.magic_button) == null) {
            composeMessageView2 = composeMessageView;
        } else {
            LayoutInflater from = LayoutInflater.from(composeMessageView.getContext());
            if (!((asuf) ffbrVar4.b()).a() || ((Boolean) ctjd.bg.e()).booleanValue()) {
                i3 = R.layout.magic_compose_button;
            } else {
                i3 = R.layout.magic_compose_with_only_rewrite_button;
            }
            composeMessageView2 = composeMessageView;
            this.e = (ImageView) crly.c(ImageView.class, from, composeMessageView, R.id.magic_button, i3, R.id.magic_button);
            if (((Boolean) ((cfup) ctjd.aY.get()).e()).booleanValue() && (imageView = this.e) != null) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(ehdr.b(imageView, R.attr.colorPrimary)), Integer.valueOf(kps.h(ehdr.b(this.e, R.attr.colorSecondaryContainer), 127)));
                this.q = ofObject;
                ofObject.setDuration(1000L);
                this.q.setRepeatCount(3);
                this.q.setRepeatMode(2);
                this.q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cxrz
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        cxsr.this.e.setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                this.q.addListener(new cxsp(this));
            }
        }
        this.p = new ArrayList();
        ImageView imageView3 = (ImageView) composeMessageView2.findViewById(R.id.plus_button);
        ImageView imageView4 = (ImageView) composeMessageView2.findViewById(R.id.camera_gallery_button);
        int b = ehdr.b(composeMessageView2, R.attr.colorInactiveComposeIcon);
        int b2 = ehdr.b(composeMessageView2, R.attr.colorActiveComposeIcon);
        cxrx h = h(imageView3, b, b2, f(s, "PLUS_ICON_VERSIONS"), R.string.attachMediaButtonContentDescription, "PlusButton::OnClick");
        this.g = h;
        cxrx h2 = h(imageView4, b, b2, f(t, "CAMERA_GALLERY_ICON_VERSIONS"), R.string.c2o_open_gallery_button_content_description, "CameraGalleryButton::OnClick");
        this.h = h2;
        if (((Boolean) cful.g.e()).booleanValue()) {
            ImageView imageView5 = (ImageView) ((ViewStub) composeMessageView2.findViewById(R.id.emoji_button_view_stub)).inflate();
            imageView5.setVisibility(0);
            i = b;
            i2 = b2;
            cxrxVar = h2;
            composeMessageView3 = composeMessageView;
            this.i = e(imageView5, new cxrw(R.drawable.ic_compose_emoji_gallery_unselected, b, R.string.c2o_category_emoji_content_description), new cxrw(R.drawable.ic_compose_emoji_gallery_unselected, b, R.string.c2o_category_emoji_content_description), new cxrw(R.drawable.ic_compose_emoji_gallery_selected, b2, R.string.keyboard_content_description), 0.0f, 0.16f, "EmojiButton::OnClick");
        } else {
            cxrxVar = h2;
            i = b;
            i2 = b2;
            composeMessageView3 = composeMessageView2;
        }
        if (((Boolean) ((cfup) uky.p.get()).e()).booleanValue()) {
            this.j = h((ImageView) new crly(composeMessageView3, R.id.audio_button_compose_view_stub, R.id.audio_button_compose_view).b(), i, ehdr.b(composeMessageView3, R.attr.colorSecondary), new cxsq(R.drawable.gs_sound_sensing_vd_theme_24, R.drawable.gs_sound_sensing_vd_theme_24, 0.0f, 0.0f, Integer.valueOf(R.drawable.compose_audio_button_selected_background)), R.string.audio_button_open_compose_content_description, "AudioButton::OnClick");
        }
        au auVar = (au) linearLayout.getLayoutParams();
        if (((Boolean) ctjd.aQ.e()).booleanValue()) {
            auVar.m = R.id.magic_button;
        } else {
            auVar.m = R.id.camera_gallery_button;
        }
        linearLayout.setLayoutParams(auVar);
        imageView2.setBackground(null);
        imageView2.setElevation(0.0f);
        imageView2.setColorFilter(i2);
        final cxtc H = composeMessageView3.H();
        Runnable runnable = new Runnable() { // from class: cxsd
            @Override // java.lang.Runnable
            public final void run() {
                cxtc cxtcVar = cxtc.this;
                ((alrv) cxtcVar.b.b()).e(alrv.D);
                cxvv cxvvVar = cxtcVar.c;
                cylx cylxVar = cxvvVar.j;
                if (cylxVar != null) {
                    cylxVar.T(new Consumer() { // from class: cxug
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            cskc cskcVar = cxvv.a;
                            ((ugg) obj).r(ugo.C2O, true, true);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, new Consumer() { // from class: cxuh
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            czgj czgjVar = (czgj) obj;
                            cskc cskcVar = cxvv.a;
                            if (czgjVar != null) {
                                czgjVar.t();
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                ((ctyx) cxvvVar.M.b()).k("last_opened_media_picker_time_millis", ((cqoh) cxvvVar.Q.b()).f().toEpochMilli());
            }
        };
        final cxtc H2 = composeMessageView3.H();
        h.c(runnable, new Runnable() { // from class: cxse
            @Override // java.lang.Runnable
            public final void run() {
                cxtc.this.c.E();
            }
        });
        final cxtc H3 = composeMessageView3.H();
        Runnable runnable2 = new Runnable() { // from class: cxsf
            @Override // java.lang.Runnable
            public final void run() {
                cxtc cxtcVar = cxtc.this;
                ((alrv) cxtcVar.b.b()).e(alrv.A);
                ((alrv) cxtcVar.b.b()).e(alrv.B);
                vvn vvnVar = (vvn) cxtcVar.c.j;
                vvnVar.aL.g(new ejlp(elfl.g(vvnVar.aM.a.a()).h(new emwl() { // from class: colu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((akuu) obj).c);
                    }
                }, erpp.a)), vvnVar.f);
            }
        };
        final cxtc H4 = composeMessageView3.H();
        cxrx cxrxVar3 = cxrxVar;
        cxrxVar3.c(runnable2, new Runnable() { // from class: cxse
            @Override // java.lang.Runnable
            public final void run() {
                cxtc.this.c.E();
            }
        });
        if (this.e != null) {
            this.f = new elbe(elbxVar, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: cxsg
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    if (str.equals(context.getString(R.string.mc_enabled_pref_key))) {
                        ComposeMessageView composeMessageView4 = composeMessageView3;
                        ffbr ffbrVar5 = ffbrVar2;
                        cxsr cxsrVar = cxsr.this;
                        ((csmj) ffbrVar5.b()).k(cxsrVar.e, 8, null);
                        cxsrVar.m = TransitionInflater.from(composeMessageView4.getContext()).inflateTransition(R.transition.compose_icons_collapse_transition);
                        cxsrVar.n = TransitionInflater.from(composeMessageView4.getContext()).inflateTransition(R.transition.compose_icons_expand_transition);
                        cxsrVar.k.l(R.id.magic_button, 8);
                    }
                }
            }, "ComposeEntryPointsController");
            ((ctyx) ffbrVar.b()).m(this.f);
            this.e.addOnAttachStateChangeListener(new cxsm(this, ffbrVar));
            this.e.setOnClickListener(new View.OnClickListener() { // from class: cxsh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cxsr cxsrVar;
                    ValueAnimator valueAnimator;
                    cylx cylxVar;
                    final cxvv cxvvVar = composeMessageView3.H().c;
                    if (ctjd.c() && (cylxVar = cxvvVar.j) != null) {
                        cylxVar.T(new Consumer() { // from class: cxtg
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                ugg uggVar = (ugg) obj;
                                if (uggVar.c() == ugo.MAGIC_COMPOSE) {
                                    uggVar.r(ugo.IME, true, false);
                                    return;
                                }
                                cxvv cxvvVar2 = cxvv.this;
                                if (cxvvVar2.m.length() != 0 || (!((Boolean) ctjd.bg.e()).booleanValue() && ((asuf) cxvvVar2.ar.b()).a())) {
                                    ((Optional) cxvvVar2.ao.b()).ifPresent(new Consumer() { // from class: cxuq
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj2) {
                                            cskc cskcVar = cxvv.a;
                                            ((wmu) obj2).g();
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    ellj.g(wlt.a, cxvvVar2.an);
                                } else {
                                    ((Optional) cxvvVar2.ao.b()).ifPresent(new Consumer() { // from class: cxuo
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj2) {
                                            cskc cskcVar = cxvv.a;
                                            ((wmu) obj2).l();
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    ((Optional) cxvvVar2.ap.b()).ifPresent(new Consumer() { // from class: cxup
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj2) {
                                            cskc cskcVar = cxvv.a;
                                            ((wmf) obj2).i();
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    ellj.g(wos.a, cxvvVar2.an);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, new Consumer() { // from class: cxth
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                cskc cskcVar = cxvv.a;
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                    if (((Boolean) ((cfup) ctjd.aY.get()).e()).booleanValue() && (valueAnimator = (cxsrVar = cxsr.this).q) != null && valueAnimator.isRunning()) {
                        ffbr ffbrVar5 = ffbrVar3;
                        cxsrVar.q.end();
                        ((woi) ffbrVar5.b()).b(true);
                    }
                }
            });
        }
        cxrx cxrxVar4 = this.i;
        if (cxrxVar4 != null) {
            final cxtc H5 = composeMessageView3.H();
            Runnable runnable3 = new Runnable() { // from class: cxsi
                @Override // java.lang.Runnable
                public final void run() {
                    cxtc cxtcVar = cxtc.this;
                    ((alrv) cxtcVar.b.b()).e(alrv.E);
                    cylx cylxVar = cxtcVar.c.j;
                    if (cylxVar != null) {
                        cylxVar.T(new Consumer() { // from class: cxut
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                cskc cskcVar = cxvv.a;
                                ((ugg) obj).r(ugo.EMOTIVE, false, true);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }, new Consumer() { // from class: cxuu
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                czgj czgjVar = (czgj) obj;
                                cskc cskcVar = cxvv.a;
                                if (czgjVar != null) {
                                    czgjVar.u(eptm.DRAFT_END_EMOJI_BUTTON);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                }
            };
            final cxtc H6 = composeMessageView3.H();
            cxrxVar4.c(runnable3, new Runnable() { // from class: cxse
                @Override // java.lang.Runnable
                public final void run() {
                    cxtc.this.c.E();
                }
            });
        }
        ((cxsn) h).d.setVisibility(0);
        boolean booleanValue = ((Boolean) cful.V.e()).booleanValue();
        this.o = booleanValue;
        if (booleanValue) {
            ((cxsn) cxrxVar3).d.setVisibility(0);
            int id = ((cxsn) h).d.getId();
            int id2 = ((cxsn) cxrxVar3).d.getId();
            float dimensionPixelSize = composeMessageView3.getResources().getDimensionPixelSize(R.dimen.compose_message_view_attach_button_size) / 2;
            imageView2.setPivotX(dimensionPixelSize);
            imageView2.setPivotY(dimensionPixelSize);
            ((cxsn) h).d.setPivotX(dimensionPixelSize);
            ((cxsn) h).d.setPivotY(dimensionPixelSize);
            ((cxsn) cxrxVar3).d.setPivotX(dimensionPixelSize);
            ((cxsn) cxrxVar3).d.setPivotY(dimensionPixelSize);
            aw awVar = new aw();
            this.k = awVar;
            awVar.e(a());
            aw awVar2 = new aw();
            this.l = awVar2;
            awVar2.e(a());
            this.l.d(id2, 7);
            if (((Boolean) cful.p.e()).booleanValue()) {
                this.l.d(id, 6);
                this.l.m(id2, 6, 0);
            } else {
                this.l.m(id2, 6, R.id.message_compose_view_container_with_c2o);
            }
            this.l.m(id, 7, R.id.compose_message_box_linear_layout);
            this.l.m(R.id.expand_attach_button, 7, R.id.compose_message_box_linear_layout);
            if (g()) {
                this.l.m(R.id.magic_button, 6, 0);
                this.l.m(R.id.magic_button, 7, R.id.compose_message_box_linear_layout);
                this.l.k(R.id.magic_button, dimensionPixelSize, dimensionPixelSize);
            }
            this.l.k(id, dimensionPixelSize, dimensionPixelSize);
            this.l.k(id2, dimensionPixelSize, dimensionPixelSize);
            this.l.k(R.id.expand_attach_button, 0.0f, 0.0f);
            this.l.i(id, 0.001f);
            this.l.j(id, 0.001f);
            this.l.l(id, 4);
            this.l.i(id2, 0.001f);
            this.l.j(id2, 0.001f);
            this.l.l(id2, 4);
            if (g()) {
                this.l.i(R.id.magic_button, 0.001f);
                this.l.j(R.id.magic_button, 0.001f);
                this.l.l(R.id.magic_button, 4);
            }
            this.l.h(id2, 6, composeMessageView3.getResources().getDimensionPixelSize(R.dimen.compose_message_view_attach_button_margin_start));
            this.l.i(R.id.expand_attach_button, 1.0f);
            this.l.j(R.id.expand_attach_button, 1.0f);
            this.l.l(R.id.expand_attach_button, 0);
            d(false);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: cxsj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cxsr.this.c();
                }
            });
        }
        if (!((Boolean) ((cfup) uky.p.get()).e()).booleanValue() || (cxrxVar2 = this.j) == null) {
            return;
        }
        final cxtc H7 = composeMessageView3.H();
        Runnable runnable4 = new Runnable() { // from class: cxsk
            @Override // java.lang.Runnable
            public final void run() {
                cylx cylxVar = cxtc.this.c.j;
                if (cylxVar != null) {
                    cylxVar.T(new Consumer() { // from class: cxuv
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            cskc cskcVar = cxvv.a;
                            ((ugg) obj).r(ugo.VOICE, false, true);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, null);
                }
            }
        };
        final cxtc H8 = composeMessageView3.H();
        cxrxVar2.c(runnable4, new Runnable() { // from class: cxse
            @Override // java.lang.Runnable
            public final void run() {
                cxtc.this.c.E();
            }
        });
    }

    private final cxrx e(final ImageView imageView, cxrw cxrwVar, cxrw cxrwVar2, cxrw cxrwVar3, float f, float f2, String str) {
        cxpv cxpvVar = new cxpv(this.c.getContext().getDrawable(cxrwVar.a), this.c.getContext().getDrawable(cxrwVar3.a), f, f2);
        imageView.setImageDrawable(cxpvVar);
        if (((Boolean) r.e()).booleanValue()) {
            imageView.addOnLayoutChangeListener(new cxso(imageView));
        }
        final cxsn cxsnVar = new cxsn(new BiConsumer() { // from class: cxsl
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                cxrv cxrvVar;
                cxrx cxrxVar = (cxrx) obj;
                cxrv cxrvVar2 = (cxrv) obj2;
                int ordinal = cxrvVar2.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        cxrvVar = cxrv.HIGHLIGHTED;
                    } else {
                        if (ordinal != 2) {
                            throw new IllegalStateException("Unexpected state ".concat(String.valueOf(String.valueOf(cxrvVar2))));
                        }
                        cxrvVar = cxrv.INACTIVE;
                    }
                    for (cxrx cxrxVar2 : cxsr.this.p) {
                        if (cxrxVar2 != cxrxVar) {
                            cxrxVar2.d(cxrvVar);
                        }
                    }
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, cxrv.HIGHLIGHTED, imageView, cxpvVar, cxrwVar, cxrwVar2, cxrwVar3);
        imageView.setOnClickListener(new elay(this.u, str, new View.OnClickListener() { // from class: cxsa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cxrv cxrvVar;
                cfva cfvaVar = cxsr.a;
                final ImageView imageView2 = imageView;
                imageView2.animate().scaleX(1.06f).scaleY(1.06f).setInterpolator(new ljm()).setDuration(250L).withEndAction(new Runnable() { // from class: cxsc
                    @Override // java.lang.Runnable
                    public final void run() {
                        cfva cfvaVar2 = cxsr.a;
                        imageView2.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new ljm()).setDuration(167L);
                    }
                });
                cxrx cxrxVar = cxsnVar;
                int ordinal = cxrxVar.c.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    cxrvVar = cxrv.OPEN;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException("Unable to determine state after ".concat(String.valueOf(String.valueOf(cxrxVar.c))));
                    }
                    cxrvVar = cxrv.HIGHLIGHTED;
                }
                cxrxVar.d(cxrvVar);
                if (cxrvVar == cxrv.OPEN) {
                    Runnable runnable = cxrxVar.a;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                Runnable runnable2 = cxrxVar.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        }));
        this.p.add(cxsnVar);
        return cxsnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 >= 3) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.cxsq f(defpackage.cxsq[] r3, java.lang.String r4) {
        /*
            cfup r0 = defpackage.cful.W
            java.lang.Object r0 = r0.e()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L12
            int r1 = r3.length
            r1 = 3
            if (r0 < r1) goto L24
        L12:
            boolean r1 = defpackage.csjc.c()
            if (r1 != 0) goto L27
            cfup r4 = defpackage.cful.W
            cfun r4 = (defpackage.cfun) r4
            java.lang.Object r4 = r4.c
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r0 = r4.intValue()
        L24:
            r3 = r3[r0]
            return r3
        L27:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unhandled \""
            java.lang.String r2 = "\" version "
            java.lang.String r4 = defpackage.a.z(r0, r4, r1, r2)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxsr.f(cxsq[], java.lang.String):cxsq");
    }

    private final boolean g() {
        return ctjd.c() && this.b.isPresent();
    }

    private final cxrx h(ImageView imageView, int i, int i2, cxsq cxsqVar, int i3, String str) {
        int i4 = cxsqVar.a;
        return e(imageView, new cxrw(i4, i, i3), new cxrw(i4, i, i3), new cxrw(cxsqVar.b, i2, R.string.keyboard_content_description, cxsqVar.e), cxsqVar.c, cxsqVar.d, str);
    }

    public final ConstraintLayout a() {
        return ((Boolean) cful.p.e()).booleanValue() ? this.c : this.c.H().c.h;
    }

    public final void b(final ImageView imageView, int i, int i2) {
        final Drawable drawable = this.c.getContext().getDrawable(i);
        final String string = this.c.getContext().getString(i2);
        if (imageView.getVisibility() != 0) {
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(string);
        } else {
            imageView.clearAnimation();
            imageView.animate().scaleX(0.0f).scaleY(0.0f).setDuration(75L).setInterpolator(new AccelerateInterpolator()).withEndAction(new Runnable() { // from class: cxsb
                @Override // java.lang.Runnable
                public final void run() {
                    ImageView imageView2 = imageView;
                    imageView2.setImageDrawable(drawable);
                    imageView2.setContentDescription(string);
                    cxsr.this.e.animate().scaleX(1.0f).scaleY(1.0f).setDuration(75L).setInterpolator(new DecelerateInterpolator()).start();
                }
            }).start();
        }
    }

    final void c() {
        ImageView imageView = this.v;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        this.k.l(R.id.compress_info_image_view, this.d.getVisibility());
        TransitionManager.beginDelayedTransition(a(), this.n);
        this.k.b(a());
    }

    public final void d(boolean z) {
        TransitionInflater from = TransitionInflater.from(this.c.getContext());
        boolean booleanValue = ((Boolean) ctjd.aX.e()).booleanValue();
        int i = R.transition.compose_icons_collapse_transition_magic_compose;
        if (!booleanValue && (!z || !g())) {
            i = R.transition.compose_icons_collapse_transition;
        }
        this.m = from.inflateTransition(i);
        TransitionInflater from2 = TransitionInflater.from(this.c.getContext());
        boolean booleanValue2 = ((Boolean) ctjd.aX.e()).booleanValue();
        int i2 = R.transition.compose_icons_expand_transition_magic_compose;
        if (!booleanValue2 && (!z || !g())) {
            i2 = R.transition.compose_icons_expand_transition;
        }
        this.n = from2.inflateTransition(i2);
    }
}
