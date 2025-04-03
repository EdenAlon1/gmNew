package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.support.v7.widget.AppCompatImageView;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.message.MessageAttachmentsView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czjd implements czlq {
    private final Optional B;
    private final cstx C;
    private final Optional D;
    private final cxqh E;
    private final altk F;
    private final bzqa G;
    private final ffbr H;
    private final ffbr I;
    private final Context J;
    private final crly K;
    private boolean L;
    private boolean M;
    private final boolean N;
    private CharSequence O;
    private final Optional P;
    private final cqoh Q;
    private final Optional R;
    public final ddxs a;
    public final azzw b;
    public final errl c;
    public final vyw d;
    public final cpdg e;
    public final fazb f;
    public final ffbr g;
    public final ConversationMessageView h;
    public bcse i;
    public final ViewGroup j;
    public final TextView k;
    public final TextView l;
    public final crly m;
    public final Optional n;
    public TextView o;
    public TextView p;
    public boolean q;
    public cziz r;
    public boolean s;
    public czjc t;
    public ListenableFuture u;
    public CharSequence w;
    public cynb x;
    public final ffbr y;
    public crly z;
    public final AtomicReference v = new AtomicReference();
    public elfl A = null;

    public czjd(Context context, Optional optional, cstx cstxVar, Optional optional2, cuye cuyeVar, ddxs ddxsVar, azzw azzwVar, errl errlVar, cxqh cxqhVar, vyw vywVar, altk altkVar, cpdg cpdgVar, bzqa bzqaVar, fazb fazbVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, Optional optional3, cqoh cqohVar, Optional optional4, ConversationMessageView conversationMessageView, ViewGroup viewGroup, crly crlyVar, final crly crlyVar2, bcse bcseVar) {
        this.J = context;
        this.B = optional;
        this.C = cstxVar;
        this.D = optional2;
        this.a = ddxsVar;
        this.b = azzwVar;
        this.c = errlVar;
        this.E = cxqhVar;
        this.d = vywVar;
        this.F = altkVar;
        this.e = cpdgVar;
        this.G = bzqaVar;
        this.f = fazbVar;
        this.H = ffbrVar;
        this.g = ffbrVar2;
        this.I = ffbrVar3;
        this.y = ffbrVar4;
        this.h = conversationMessageView;
        this.j = viewGroup;
        this.K = crlyVar;
        this.i = bcseVar;
        this.P = optional3;
        this.Q = cqohVar;
        this.R = optional4;
        this.N = cuyeVar.c();
        TextView textView = (TextView) viewGroup.findViewById(R.id.message_text);
        this.k = textView;
        textView.setOnClickListener(conversationMessageView);
        this.l = (TextView) viewGroup.findViewById(R.id.urgent_indicator);
        this.m = new crly(viewGroup, R.id.message_subject_view_stub, R.id.subject_container, new crlx() { // from class: cziv
            @Override // defpackage.crlx
            public final void a(Object obj) {
                View view = (View) obj;
                TextView textView2 = (TextView) view.findViewById(R.id.subject_label);
                czjd czjdVar = czjd.this;
                czjdVar.o = textView2;
                czjdVar.p = (TextView) view.findViewById(R.id.subject_text);
            }
        });
        if (crlyVar2 != null) {
            this.n = ((Optional) ffbrVar3.b()).map(new Function() { // from class: cziw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((ajur) obj).a(crly.this);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            this.n = Optional.empty();
        }
    }

    public final int a() {
        return c().getColor(R.color.google_yellow400);
    }

    public final int b() {
        return c().getColor(R.color.gm3_ref_palette_neutral10);
    }

    final Context c() {
        return this.h.getContext();
    }

    public final void d() {
        crly crlyVar;
        if (!((Optional) this.f.b()).isPresent() || !this.P.isPresent() || (crlyVar = this.z) == null || ((AppCompatImageView) crlyVar.b()).getVisibility() == 8) {
            return;
        }
        float g = ((cync) ((Optional) this.f.b()).get()).g();
        float applyDimension = TypedValue.applyDimension(1, ((Integer) czhm.d.e()).intValue(), this.h.getResources().getDisplayMetrics());
        crly crlyVar2 = this.z;
        LinearLayout.LayoutParams layoutParams = crlyVar2 == null ? null : (LinearLayout.LayoutParams) ((AppCompatImageView) crlyVar2.b()).getLayoutParams();
        if (layoutParams != null) {
            int i = (int) (applyDimension * g);
            layoutParams.width = i;
            layoutParams.height = i;
            crly crlyVar3 = this.z;
            if (crlyVar3 != null) {
                ((AppCompatImageView) crlyVar3.b()).setLayoutParams(layoutParams);
            }
        }
    }

    @Override // defpackage.czlq
    public final void e(int i) {
        this.j.setVisibility(i);
    }

    public final void f() {
        float dimension = this.h.getResources().getDimension(R.dimen.conversation_message_text_size);
        if (this.C.f() && !TextUtils.isEmpty(this.O) && this.C.g(this.O)) {
            dimension = TypedValue.applyDimension(1, ((Integer) czhm.d.e()).intValue(), this.h.getResources().getDisplayMetrics());
        }
        if (((Optional) this.f.b()).isPresent()) {
            dimension *= ((cync) ((Optional) this.f.b()).get()).g();
        }
        if (this.k.getTextSize() != dimension) {
            this.k.setTextSize(0, dimension);
        }
    }

    public final void g() {
        if (this.m.i()) {
            ((Optional) this.H.b()).ifPresent(new Consumer() { // from class: czik
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    czjd czjdVar = czjd.this;
                    cyne cyneVar = (cyne) obj;
                    cyneVar.a(czjdVar.o, R.dimen.conversation_message_text_size);
                    cyneVar.a(czjdVar.p, R.dimen.conversation_message_text_size);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public final void h() {
        this.k.setVisibility(8);
        crly crlyVar = this.z;
        if (crlyVar != null) {
            ((AppCompatImageView) crlyVar.b()).setVisibility(0);
        }
        d();
    }

    public final void i() {
        crly crlyVar = this.z;
        if (crlyVar != null) {
            ((AppCompatImageView) crlyVar.b()).setVisibility(8);
        }
        f();
        this.k.setVisibility(0);
    }

    @Override // defpackage.czlq
    public final void j(String str, final String str2) {
        if (TextUtils.isEmpty(str) || this.i.ay()) {
            csix.f(this.i.ay());
            this.k.setVisibility(8);
            this.k.setText((CharSequence) null);
            this.s = false;
            return;
        }
        this.O = this.b.d(null, str, str2, null, b(), a());
        if (!TextUtils.equals(this.h.u, str2) || !TextUtils.equals(this.w, this.O) || this.i.A().a()) {
            this.h.u = str2;
            this.k.setText(this.O);
            bcse bcseVar = this.i;
            CharSequence text = this.k.getText();
            Pattern pattern = cuxt.a;
            SpannableStringBuilder append = new SpannableStringBuilder().append(text);
            for (SpanWatcher spanWatcher : (SpanWatcher[]) append.getSpans(0, append.length(), SpanWatcher.class)) {
                append.removeSpan(spanWatcher);
            }
            czjc czjcVar = new czjc(this, bcseVar, append, this.B, this.D, this.e, this.F);
            this.t = czjcVar;
            elfl e = czjcVar.d.isEmpty() ? elfo.e(null) : elfl.g(((cglo) czjcVar.d.get()).a(SpannableStringBuilder.valueOf(czjcVar.c), czjcVar.a.c(), new czja(czjcVar)));
            final Function function = new Function() { // from class: czif
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    czjd czjdVar = czjd.this;
                    Pair pair = (Pair) obj;
                    czjc czjcVar2 = czjdVar.t;
                    if (czjcVar2 != null) {
                        Spannable spannable = (Spannable) pair.first;
                        boolean z = (pair.second == null || ((enhk) pair.second).isEmpty()) ? false : true;
                        if (czjdVar.t == czjcVar2) {
                            String str3 = str2;
                            czjdVar.t = null;
                            boolean z2 = z | czjdVar.s;
                            czjdVar.s = z2;
                            czjdVar.k.setFocusable(z2);
                            czjdVar.k.setFocusableInTouchMode(czjdVar.s);
                            if (str3 != null) {
                                for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spannable.getSpans(0, spannable.length(), BackgroundColorSpan.class)) {
                                    int spanStart = spannable.getSpanStart(backgroundColorSpan);
                                    int spanEnd = spannable.getSpanEnd(backgroundColorSpan);
                                    int spanFlags = spannable.getSpanFlags(backgroundColorSpan);
                                    if (((ClickableSpan[]) spannable.getSpans(spanStart, spanEnd, ClickableSpan.class)).length != 0) {
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(czjdVar.b());
                                        spannable.setSpan(new BackgroundColorSpan(czjdVar.a()), spanStart, spanEnd, spanFlags);
                                        spannable.setSpan(foregroundColorSpan, spanStart, spanEnd, spanFlags);
                                    }
                                }
                            }
                            czjdVar.w = czjcVar2.c;
                            czjdVar.k.setText(spannable);
                            egyl.c(czjdVar.k);
                            if (czjdVar.k.getLinksClickable()) {
                                if (((Boolean) czhm.a.e()).booleanValue()) {
                                    czjdVar.k.setLongClickable(true);
                                }
                                egyl.d(czjdVar.k, LinkMovementMethod.getInstance());
                                if (czjdVar.i.A().b() && czjdVar.i.bd()) {
                                    egyl.d(czjdVar.k, new dedh(czjdVar.i, czjdVar.a, czjdVar.k.getMovementMethod()));
                                } else if (((cvnv) czjdVar.g.b()).a(czjdVar.i)) {
                                    cvnv cvnvVar = (cvnv) czjdVar.g.b();
                                    bcse bcseVar2 = czjdVar.i;
                                    TextView textView = czjdVar.k;
                                    cvnx cvnxVar = (cvnx) cvnvVar.a.b();
                                    ffbr ffbrVar = cvnxVar.a;
                                    ffbr ffbrVar2 = cvnxVar.b;
                                    MovementMethod movementMethod = textView.getMovementMethod();
                                    bcseVar2.getClass();
                                    movementMethod.getClass();
                                    egyl.d(textView, new cvnw(ffbrVar, ffbrVar2, bcseVar2, movementMethod));
                                }
                            }
                            czlu czluVar = czjdVar.h.ai;
                            if (czluVar.b.i()) {
                                ((MessageAttachmentsView) czluVar.b.b()).d();
                            }
                        }
                    }
                    return null;
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            };
            this.v.set(function);
            this.u = e.i(new eroh() { // from class: czig
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final Pair pair = (Pair) obj;
                    final czjd czjdVar = czjd.this;
                    final Function function2 = function;
                    return kfg.a(new kfd() { // from class: czip
                        @Override // defpackage.kfd
                        public final Object a(final kfb kfbVar) {
                            final czjd czjdVar2 = czjd.this;
                            final Function function3 = function2;
                            final Pair pair2 = pair;
                            efbd.e(new Runnable() { // from class: czio
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Function function4 = function3;
                                    czjd czjdVar3 = czjd.this;
                                    Pair pair3 = pair2;
                                    kfb kfbVar2 = kfbVar;
                                    try {
                                        AtomicReference atomicReference = czjdVar3.v;
                                        Function function5 = new Function() { // from class: cziu
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function6) {
                                                return Function$CC.$default$andThen(this, function6);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                return null;
                                            }

                                            public final /* synthetic */ Function compose(Function function6) {
                                                return Function$CC.$default$compose(this, function6);
                                            }
                                        };
                                        while (true) {
                                            if (atomicReference.compareAndSet(function4, function5)) {
                                                function4.apply(pair3);
                                                break;
                                            } else if (atomicReference.get() != function4) {
                                                break;
                                            }
                                        }
                                        kfbVar2.b(null);
                                    } catch (Throwable th) {
                                        kfbVar2.c(th);
                                    }
                                }
                            });
                            return "linkifyCallback";
                        }
                    });
                }
            }, this.c);
        }
        if (this.i.aJ() && this.C.g(this.O)) {
            this.k.setGravity(8388613);
        } else {
            this.k.setGravity(8388611);
        }
        if (Float.valueOf(Settings.Global.getFloat(this.J.getContentResolver(), "animator_duration_scale", 1.0f)).equals(Float.valueOf(0.0f)) || !this.P.isPresent()) {
            i();
            return;
        }
        if (!this.P.isPresent() || this.C.b(this.k.getText().toString()) != eoos.EMOJI_STATUS_SINGLE_EMOJI_ONLY) {
            i();
            return;
        }
        crly crlyVar = new crly(this.h, R.id.message_animated_emoji_view_stub, R.id.message_animated_emoji_view);
        this.z = crlyVar;
        AppCompatImageView appCompatImageView = (AppCompatImageView) crlyVar.b();
        if (appCompatImageView == null) {
            i();
            return;
        }
        h();
        String charSequence = this.k.getText().toString();
        TextView textView = this.k;
        ((czlz) this.P.get()).a(this.k.getText().toString(), appCompatImageView, new cxrf(charSequence, textView.getTypeface(), textView.getTextSize(), textView.getCurrentTextColor()), new ffix() { // from class: czih
            @Override // defpackage.ffix
            public final Object invoke() {
                czjd.this.i();
                return ffcu.a;
            }
        }, (!this.i.aJ() || this.Q.f().toEpochMilli() - this.i.k() > ((long) ((Integer) czhm.e.e()).intValue())) ? (!this.i.az() || this.i.c.af()) ? czmi.a : czmi.b : czmi.c);
        this.R.ifPresent(new Consumer() { // from class: czim
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                elfl b = ((cwqs) obj).b();
                final czjd czjdVar = czjd.this;
                czjdVar.A = b.h(new emwl() { // from class: czii
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        final Boolean bool = (Boolean) obj2;
                        final czjd czjdVar2 = czjd.this;
                        efbd.e(new Runnable() { // from class: czij
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean equals = Boolean.TRUE.equals(bool);
                                czjd czjdVar3 = czjd.this;
                                if (equals) {
                                    czjdVar3.h();
                                } else {
                                    czjdVar3.i();
                                }
                            }
                        });
                        return null;
                    }
                }, czjdVar.c);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0137, code lost:
    
        r3 = r16;
        r17 = r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // defpackage.czlq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czjd.k():void");
    }

    @Override // defpackage.czlq
    public final boolean l(View view) {
        return view == this.k;
    }
}
