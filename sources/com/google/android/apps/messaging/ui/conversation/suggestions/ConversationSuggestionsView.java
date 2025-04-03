package com.google.android.apps.messaging.ui.conversation.suggestions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import com.google.android.apps.messaging.ui.conversation.suggestions.tooltip.ConversationSuggestionsBugleTooltipView;
import defpackage.adtc;
import defpackage.akvg;
import defpackage.alef;
import defpackage.bdhb;
import defpackage.cfup;
import defpackage.crly;
import defpackage.csjy;
import defpackage.csmd;
import defpackage.csmj;
import defpackage.ctix;
import defpackage.ctjd;
import defpackage.czkr;
import defpackage.czqm;
import defpackage.czrj;
import defpackage.cztz;
import defpackage.ddzb;
import defpackage.dkta;
import defpackage.engw;
import defpackage.enou;
import defpackage.ffbr;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationSuggestionsView extends czrj implements czkr<ConversationSuggestionsView> {
    public akvg a;
    public adtc b;
    public ffbr c;
    public czqm d;
    public Optional e;
    private LinearLayout f;
    private HorizontalScrollView g;
    private crly h;
    private MessageIdType i;

    public ConversationSuggestionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void h(final ctix ctixVar) {
        ConversationSuggestionsBugleTooltipView conversationSuggestionsBugleTooltipView = (ConversationSuggestionsBugleTooltipView) this.h.b();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: czqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ctix ctixVar2 = ctixVar;
                ConversationSuggestionsView conversationSuggestionsView = ConversationSuggestionsView.this;
                if (ctixVar2 == ctix.c) {
                    alef alefVar = (alef) conversationSuggestionsView.c.b();
                    eojk eojkVar = (eojk) eojn.a.createBuilder();
                    eojkVar.getClass();
                    eogw.c(2, eojkVar);
                    eogw.b(4, eojkVar);
                    eojo eojoVar = (eojo) eojp.a.createBuilder();
                    eojoVar.getClass();
                    eyfy build = eojoVar.build();
                    build.getClass();
                    eojkVar.copyOnWrite();
                    eojn eojnVar = (eojn) eojkVar.instance;
                    eojnVar.j = (eojp) build;
                    eojnVar.b |= 128;
                    alefVar.a(eogw.a(eojkVar));
                } else if (ctixVar2 == ctix.d) {
                    conversationSuggestionsView.e.ifPresent(new Consumer() { // from class: czrh
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((cnla) obj).w(11, 7);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                conversationSuggestionsView.d();
            }
        };
        View view = conversationSuggestionsBugleTooltipView.a;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public final void c(List list, cztz cztzVar) {
        ctix ctixVar;
        if (!dkta.a(list)) {
            MessageIdType x = ((SuggestionData) list.get(0)).x();
            if (!Objects.equals(this.i, x)) {
                this.i = x;
                this.g.fullScroll(17);
            }
        }
        if (!this.d.q(this.f, list, cztzVar)) {
            setVisibility(8);
            csjy.n("Bugle", "ConversationSuggestionsView (Chip List) rendering was unsuccessful.");
            return;
        }
        if (cztzVar.f()) {
            czqm czqmVar = this.d;
            czqmVar.n = ctix.a;
            if (list == null || list.isEmpty() || !(list.get(0) instanceof SmartSuggestionData) || ((Boolean) ((cfup) ctjd.bb.get()).e()).booleanValue()) {
                ctixVar = czqmVar.n;
            } else {
                ctix a = czqmVar.p.a((SuggestionData) list.get(0));
                if (!czqmVar.p.e(a)) {
                    a = ctix.a;
                }
                czqmVar.n = a;
                if (ctix.c.equals(czqmVar.n)) {
                    czqmVar.q.h("has_shown_assistant_tooltip", true);
                }
                ctixVar = czqmVar.n;
            }
            int ordinal = ctixVar.ordinal();
            if (ordinal == 1) {
                this.h.g(0);
                ((ConversationSuggestionsBugleTooltipView) this.h.b()).b(getResources().getString(R.string.p2p_conversation_suggestions_tooltip_title_text));
                ((ConversationSuggestionsBugleTooltipView) this.h.b()).a(getResources().getText(R.string.p2p_conversation_suggestions_tooltip_text), engw.r(new View.OnClickListener() { // from class: czrb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ConversationSuggestionsView.this.e();
                    }
                }));
                h(ctix.b);
                return;
            }
            if (ordinal == 2) {
                this.h.g(0);
                ((ConversationSuggestionsBugleTooltipView) this.h.b()).b(getResources().getString(R.string.assistant_suggestions_tooltip_title_text));
                ((ConversationSuggestionsBugleTooltipView) this.h.b()).a(getResources().getText(R.string.assistant_suggestions_tooltip_text), engw.s(new View.OnClickListener() { // from class: czrd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ConversationSuggestionsView conversationSuggestionsView = ConversationSuggestionsView.this;
                        Activity f = ddzb.f(conversationSuggestionsView);
                        if (f != null) {
                            ((alef) conversationSuggestionsView.c.b()).c(4, 2);
                            conversationSuggestionsView.b.f(f, (String) ctjd.w.e());
                            conversationSuggestionsView.d();
                        }
                    }
                }, new View.OnClickListener() { // from class: czre
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ConversationSuggestionsView conversationSuggestionsView = ConversationSuggestionsView.this;
                        ((alef) conversationSuggestionsView.c.b()).b(4);
                        conversationSuggestionsView.e();
                    }
                }));
                ((alef) this.c.b()).d(4);
                h(ctix.c);
                return;
            }
            if (ordinal == 3) {
                this.h.g(0);
                ((ConversationSuggestionsBugleTooltipView) this.h.b()).b(getResources().getString(R.string.reminder_suggestions_tooltip_title_text));
                ((ConversationSuggestionsBugleTooltipView) this.h.b()).a(getResources().getText(R.string.reminder_suggestions_tooltip_text), engw.r(new View.OnClickListener() { // from class: czrf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ConversationSuggestionsView conversationSuggestionsView = ConversationSuggestionsView.this;
                        conversationSuggestionsView.e.ifPresent(new Consumer() { // from class: czra
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                ((cnla) obj).w(11, 8);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        conversationSuggestionsView.e();
                    }
                }));
                this.e.ifPresent(new Consumer() { // from class: czrg
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((cnla) obj).x(6);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                h(ctix.d);
                return;
            }
            if (ordinal == 4) {
                this.h.g(0);
                ((ConversationSuggestionsBugleTooltipView) this.h.b()).b(getResources().getString(R.string.emotion_suggestions_tooltip_title_text));
                ((ConversationSuggestionsBugleTooltipView) this.h.b()).a(getResources().getText(R.string.emotion_suggestions_tooltip_text), engw.r(new View.OnClickListener() { // from class: czrc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ConversationSuggestionsView.this.e();
                    }
                }));
                h(ctix.e);
                return;
            }
            if (ordinal != 5) {
                this.h.g(8);
                return;
            }
            this.h.g(0);
            ((ConversationSuggestionsBugleTooltipView) this.h.b()).b(getResources().getString(R.string.calendar_suggestions_tooltip_title_text));
            ConversationSuggestionsBugleTooltipView conversationSuggestionsBugleTooltipView = (ConversationSuggestionsBugleTooltipView) this.h.b();
            CharSequence text = getResources().getText(R.string.calendar_suggestions_tooltip_text);
            int i = engw.d;
            conversationSuggestionsBugleTooltipView.a(text, enou.a);
            h(ctix.f);
        }
    }

    public final void d() {
        this.d.o();
        final View b = this.h.b();
        long a = csmj.a(b.getContext());
        Animator e = csmj.e(b, 8, a);
        b.getClass();
        ValueAnimator duration = ValueAnimator.ofInt(b.getMeasuredHeight(), 0).setDuration(a);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: csma
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                View view = b;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                layoutParams.height = ((Integer) animatedValue).intValue();
                view.setLayoutParams(layoutParams);
            }
        });
        duration.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(e, duration);
        animatorSet.setInterpolator(csmj.b);
        animatorSet.addListener(new csmd(b));
        b.clearAnimation();
        animatorSet.start();
    }

    public final void e() {
        this.a.h(getContext());
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (((Boolean) ((cfup) ctjd.ag.get()).e()).booleanValue()) {
            ddzb.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.d.b = bdhb.a;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (LinearLayout) findViewById(R.id.suggestion_list_container);
        crly crlyVar = new crly(this, R.id.p2p_conversation_suggestions_tooltip_view_stub, R.id.p2p_conversation_suggestions_tooltip);
        this.h = crlyVar;
        crlyVar.f(R.layout.bugle_tooltip_view_gm3);
        this.g = (HorizontalScrollView) findViewById(R.id.suggestion_list_scroll_view);
    }

    @Override // defpackage.czkr
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }

    @Override // defpackage.czkr
    public final void b() {
    }
}
