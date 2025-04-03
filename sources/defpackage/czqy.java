package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.ui.conversation.suggestions.common.ConversationSuggestionContainerView;
import com.google.android.apps.messaging.ui.conversation.suggestions.common.ConversationSuggestionStickerView;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czqy {
    public static final cskc k = cskc.g("Bugle", "ConversationSuggestionsController");
    private final cstx a;
    private final adsd b;
    private final altk c;
    private final cqoh d;
    private final ffbr e;
    private final czwl f;
    private final fazb g;
    private final ffbr h;
    private final ffbr i;
    private LinearLayout j;
    public cynb l;
    protected final Context m;
    public ctix n;
    public final List o = new ArrayList();
    public final ctiy p;
    public final ctyx q;
    public final elbx r;
    private final bbae s;

    public czqy(Context context, cstx cstxVar, adsd adsdVar, ctiy ctiyVar, ctyx ctyxVar, altk altkVar, cqoh cqohVar, ffbr ffbrVar, bbae bbaeVar, czwl czwlVar, fazb fazbVar, elbx elbxVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.m = context;
        this.a = cstxVar;
        this.b = adsdVar;
        this.p = ctiyVar;
        this.q = ctyxVar;
        this.c = altkVar;
        this.d = cqohVar;
        this.e = ffbrVar;
        this.s = bbaeVar;
        this.f = czwlVar;
        this.g = fazbVar;
        this.r = elbxVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
    }

    private static void h(View view, final cztz cztzVar) {
        Handler handler = view.getHandler();
        if (handler != null) {
            cztzVar.getClass();
            handler.postDelayed(new Runnable() { // from class: czqq
                @Override // java.lang.Runnable
                public final void run() {
                    cztz.this.d();
                }
            }, 500L);
        }
    }

    private final void i(ConversationSuggestionContainerView conversationSuggestionContainerView, SuggestionData suggestionData, cztz cztzVar) {
        List list = this.o;
        czwk a = this.f.a(conversationSuggestionContainerView, suggestionData);
        list.add(a);
        e(a, cztzVar);
        if (cztzVar.e()) {
            k(conversationSuggestionContainerView, suggestionData, cztzVar);
        }
        conversationSuggestionContainerView.setVisibility(0);
        conversationSuggestionContainerView.setTag(suggestionData);
        if (bduu.b(suggestionData) != fbri.ASSISTANT_QUERY) {
            conversationSuggestionContainerView.setTag(R.id.growthkit_view_tag, null);
        } else {
            conversationSuggestionContainerView.setTag(R.id.growthkit_view_tag, "ASSISTANT_SUGGESTION");
            this.b.a(5);
        }
    }

    public static cztz l(czic czicVar, int i) {
        if (czicVar == null) {
            return null;
        }
        return new czqw(czicVar, i);
    }

    public static cztz m(czic czicVar) {
        return l(czicVar, czicVar.b());
    }

    public abstract int a();

    protected abstract int b();

    protected abstract int c();

    protected abstract int d();

    protected void e(czwk czwkVar, cztz cztzVar) {
        int dimensionPixelSize;
        int i;
        int i2;
        boolean z;
        ConversationSuggestionContainerView e = czwkVar.e();
        SuggestionData suggestionData = czwkVar.b;
        if ((suggestionData instanceof SmartSuggestionData) && bduu.b(suggestionData) == fbri.EMOTION) {
            SmartSuggestionData smartSuggestionData = (SmartSuggestionData) suggestionData;
            e.a.setVisibility(8);
            if (TextUtils.isEmpty(smartSuggestionData.u())) {
                e.b.setVisibility(8);
            } else {
                e.b(e.getResources().getDimensionPixelSize(R.dimen.sticker_container_margin_top));
                e.b.setVisibility(0);
                ConversationSuggestionStickerView conversationSuggestionStickerView = e.b;
                Uri parse = Uri.parse(smartSuggestionData.u());
                if (conversationSuggestionStickerView.e == null) {
                    conversationSuggestionStickerView.e = ekmq.a(conversationSuggestionStickerView.b).c().q(rig.e()).f(new cztv(conversationSuggestionStickerView)).p(rff.b());
                }
                conversationSuggestionStickerView.e.i(parse).v(conversationSuggestionStickerView.c);
                if (csjc.d()) {
                    if (((Boolean) ctjd.r.e()).booleanValue()) {
                        ((TextView) conversationSuggestionStickerView.d.b()).setText(smartSuggestionData.o());
                    } else {
                        conversationSuggestionStickerView.d.g(8);
                    }
                }
            }
        } else {
            e.b(0);
            e.b.setVisibility(8);
            e.a.setVisibility(0);
            TextView d = czwkVar.d(c());
            d.setText(czwkVar.c());
            p(czwkVar);
            int g = g(cztzVar);
            int f = f(cztzVar);
            d.setTextColor(g);
            int b = b();
            ImageView imageView = czwkVar.c;
            if (imageView == null) {
                czwkVar.c = (ImageView) czwkVar.a.findViewById(b);
                imageView = czwkVar.c;
            }
            SuggestionData suggestionData2 = czwkVar.b;
            Optional a = czwkVar.a(f);
            fbri b2 = bduu.b(suggestionData2);
            boolean z2 = b2 == fbri.CONTACT;
            boolean z3 = z2 && (suggestionData2 instanceof SmartSuggestionData) && !TextUtils.isEmpty(((SmartSuggestionData) suggestionData2).n());
            Resources resources = this.m.getResources();
            LinearLayout linearLayout = (LinearLayout) imageView.getParent();
            if (z2) {
                dimensionPixelSize = resources.getDimensionPixelSize(true != z3 ? R.dimen.conversation_suggestion_view_contact_share_bubble_container_start_padding : R.dimen.conversation_suggestion_contact_share_bubble_container_start_padding);
                i = resources.getDimensionPixelSize(R.dimen.conversation_suggestion_contact_share_bubble_container_end_padding);
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(a());
                i = dimensionPixelSize;
            }
            linearLayout.setPadding(dimensionPixelSize, linearLayout.getPaddingTop(), i, linearLayout.getPaddingBottom());
            if (a.isEmpty()) {
                imageView.setVisibility(8);
            } else {
                if (z3) {
                    i2 = R.dimen.conversation_suggestion_contact_icon_size;
                    z = true;
                } else {
                    i2 = R.dimen.conversation_suggestion_icon_size;
                    z = false;
                }
                int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(true != z ? R.dimen.conversation_suggestion_icon_right_margin : R.dimen.conversation_suggestion_view_contact_share_icon_end_margin);
                imageView.setAdjustViewBounds(false);
                if (b2 == fbri.ASSISTANT_QUERY || b2 == fbri.EMOTION) {
                    imageView.setAdjustViewBounds(true);
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
                layoutParams.setMarginEnd(dimensionPixelSize3);
                imageView.setLayoutParams(layoutParams);
                ((qqo) a.get()).w(new czqx(imageView, suggestionData2, imageView));
                imageView.setVisibility(0);
            }
        }
        e.setContentDescription(czwkVar.b());
        if (e.isAccessibilityFocused()) {
            h(e, cztzVar);
        }
    }

    protected abstract int f(cztz cztzVar);

    protected abstract int g(cztz cztzVar);

    protected void j(SuggestionData suggestionData, cztz cztzVar, View view) {
        n(suggestionData, cztzVar);
    }

    protected void k(View view, final SuggestionData suggestionData, final cztz cztzVar) {
        view.setOnClickListener(new elay(this.r, "ConversationSuggestionsController#onClick", new View.OnClickListener() { // from class: czqr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                czqy.this.n(suggestionData, cztzVar);
            }
        }));
    }

    public final void n(SuggestionData suggestionData, cztz cztzVar) {
        if (cztzVar != null) {
            if (suggestionData instanceof SmartSuggestionData) {
                ((ctqh) this.e.b()).p(suggestionData, fbrd.CLICKED);
            }
            cztzVar.c(suggestionData);
            if (suggestionData.f()) {
                return;
            }
            this.s.a(cztzVar.b(), this.d.f().toEpochMilli()).t();
            boolean z = suggestionData instanceof RbmSuggestionData;
            this.c.ai(z);
            if (z) {
                this.c.aj();
                this.c.ak();
            }
        }
    }

    public final void o() {
        ctix ctixVar = this.n;
        if (ctixVar != null) {
            this.p.c(ctixVar);
        }
    }

    public final void p(czwk czwkVar) {
        float f;
        GradientDrawable gradientDrawable;
        fbri b;
        SuggestionData suggestionData = czwkVar.b;
        TextView d = czwkVar.d(c());
        CharSequence text = d.getText();
        float dimensionPixelSize = this.m.getResources().getDimensionPixelSize(R.dimen.conversation_suggestion_text_size);
        if ((suggestionData instanceof SmartSuggestionData) && this.a.f() && ((b = bduu.b(suggestionData)) == fbri.EMOJI || (b == fbri.FULL_MESSAGE && text != null && this.a.g(text)))) {
            k.q("Setting emoji suggestion text size");
            if (this.m.getResources().getDimensionPixelSize(R.dimen.conversation_suggestion_emoji_only_text_size) < this.m.getResources().getDimensionPixelSize(R.dimen.conversation_suggestion_bubble_height)) {
                dimensionPixelSize = this.m.getResources().getDimensionPixelSize(R.dimen.conversation_suggestion_emoji_only_text_size);
            }
        }
        if (((Optional) this.g.b()).isPresent()) {
            f = ((cync) ((Optional) this.g.b()).get()).g();
            float floatValue = ((f - ((Float) cync.b.e()).floatValue()) / 2.0f) + ((Float) cync.b.e()).floatValue();
            ViewGroup viewGroup = czwkVar.e().a;
            LayerDrawable layerDrawable = (LayerDrawable) viewGroup.getBackground();
            if (layerDrawable != null && (gradientDrawable = (GradientDrawable) layerDrawable.findDrawableByLayerId(R.id.conversation_suggestion_bubble)) != null) {
                gradientDrawable.setCornerRadius(this.m.getResources().getDimensionPixelSize(R.dimen.conversation_suggestion_bubble_corner_radius_m2) * floatValue);
                viewGroup.setBackground(layerDrawable);
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = (int) (this.m.getResources().getDimensionPixelSize(R.dimen.min_touch_target_size) * floatValue);
            viewGroup.setLayoutParams(layoutParams);
            viewGroup.setMinimumWidth((int) (this.m.getResources().getDimensionPixelOffset(R.dimen.conversation_suggestion_bubble_min_width) * floatValue));
        } else {
            f = 1.0f;
        }
        d.setTextSize(0, dimensionPixelSize * f);
    }

    public final boolean q(final LinearLayout linearLayout, List list, final cztz cztzVar) {
        ((Optional) this.g.b()).ifPresent(new Consumer() { // from class: czqs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cync) obj).k(czqy.this.l);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.l = new cynb() { // from class: czqt
            @Override // defpackage.cynb
            public final void gl() {
                czqy czqyVar = czqy.this;
                if (czqyVar.o.isEmpty()) {
                    return;
                }
                Iterator it = czqyVar.o.iterator();
                while (it.hasNext()) {
                    czqyVar.p((czwk) it.next());
                }
            }
        };
        ((Optional) this.g.b()).ifPresent(new Consumer() { // from class: czqu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cync) obj).h(czqy.this.l);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.o.clear();
        this.j = linearLayout;
        if (linearLayout != null) {
            int i = 0;
            while (true) {
                if (i >= linearLayout.getChildCount()) {
                    break;
                }
                if (linearLayout.getChildAt(i).isAccessibilityFocused()) {
                    h(linearLayout, cztzVar);
                    break;
                }
                i++;
            }
        }
        if (dkta.a(list)) {
            this.j.setVisibility(8);
            return false;
        }
        this.j.setVisibility(0);
        if (list.get(0) instanceof SmartSuggestionData) {
            ((ctqh) this.e.b()).q(list, fbrd.SHOWN);
            if (((Boolean) ((cfup) ctjd.ag.get()).e()).booleanValue() && ((Optional) this.h.b()).isPresent()) {
                linearLayout.removeAllViews();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    final SuggestionData suggestionData = (SuggestionData) list.get(i2);
                    dokm a = ((abad) ((Optional) this.h.b()).get()).a(suggestionData);
                    if (a != null) {
                        ffbr ffbrVar = this.i;
                        ffix ffixVar = new ffix() { // from class: czqv
                            @Override // defpackage.ffix
                            public final Object invoke() {
                                czqy czqyVar = czqy.this;
                                SuggestionData suggestionData2 = suggestionData;
                                cztz cztzVar2 = cztzVar;
                                LinearLayout linearLayout2 = linearLayout;
                                ekzm b = czqyVar.r.b("ConversationSuggestionsController#onClick");
                                try {
                                    czqyVar.j(suggestionData2, cztzVar2, linearLayout2);
                                    b.close();
                                    return ffcu.a;
                                } catch (Throwable th) {
                                    try {
                                        b.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        };
                        ffbrVar.getClass();
                        linearLayout.getClass();
                        Context context = linearLayout.getContext();
                        context.getClass();
                        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
                        composeView.a(new hpw(1231917205, true, new czqp(ffbrVar, a, ffixVar)));
                        linearLayout.addView(composeView);
                    }
                }
                return true;
            }
        }
        int childCount = this.j.getChildCount();
        int size = list.size();
        int min = Math.min(childCount, size);
        for (int i3 = 0; i3 < min; i3++) {
            SuggestionData suggestionData2 = (SuggestionData) list.get(i3);
            ConversationSuggestionContainerView conversationSuggestionContainerView = (ConversationSuggestionContainerView) this.j.getChildAt(i3);
            conversationSuggestionContainerView.setHapticFeedbackEnabled(false);
            i(conversationSuggestionContainerView, suggestionData2, cztzVar);
        }
        LayoutInflater from = LayoutInflater.from(this.m);
        while (min < size) {
            SuggestionData suggestionData3 = (SuggestionData) list.get(min);
            ConversationSuggestionContainerView conversationSuggestionContainerView2 = (ConversationSuggestionContainerView) from.inflate(R.layout.conversation_suggestion_container_view, (ViewGroup) linearLayout, false);
            conversationSuggestionContainerView2.a = (ViewGroup) LayoutInflater.from(conversationSuggestionContainerView2.getContext()).inflate(d(), (ViewGroup) conversationSuggestionContainerView2, false);
            conversationSuggestionContainerView2.addView(conversationSuggestionContainerView2.a);
            linearLayout.addView(conversationSuggestionContainerView2);
            i(conversationSuggestionContainerView2, suggestionData3, cztzVar);
            min++;
        }
        while (size < childCount) {
            this.j.getChildAt(size).setVisibility(8);
            size++;
        }
        return true;
    }
}
