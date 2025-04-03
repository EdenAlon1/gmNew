package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.widget.AppCompatImageView;
import android.util.Property;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.ui.conversation.suggestions.shortcuts.SuggestionShortcutView;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czva {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public boolean d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;

    public czva(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.a = ffbrVar4;
        this.b = ffbrVar5;
        this.c = ffbrVar6;
        this.h = ffbrVar7;
    }

    public final void a(List list, final czic czicVar, final MessageIdType messageIdType) {
        czicVar.getClass();
        messageIdType.getClass();
        if (list == null) {
            return;
        }
        List K = czicVar.K(ffdx.am(list), 2);
        SuggestionShortcutView suggestionShortcutView = (SuggestionShortcutView) this.e.b();
        if (K.isEmpty()) {
            if (suggestionShortcutView.getVisibility() == 0) {
                csmj.f(suggestionShortcutView, 8, csmj.a(suggestionShortcutView.getContext()), new Runnable() { // from class: czus
                    @Override // java.lang.Runnable
                    public final void run() {
                        czva.this.b();
                    }
                }).start();
                return;
            }
            return;
        }
        this.d = true;
        Object obj = K.get(0);
        obj.getClass();
        final SmartSuggestionData smartSuggestionData = (SmartSuggestionData) obj;
        czwk a = ((czwl) this.f.b()).a(suggestionShortcutView, smartSuggestionData);
        Optional a2 = a.a(ehdr.d(suggestionShortcutView.getContext(), R.attr.colorPrimaryBrandIcon, "SuggestionShortcutViewPeer"));
        final AppCompatImageView appCompatImageView = (AppCompatImageView) suggestionShortcutView.findViewById(R.id.suggestion_shortcut_icon);
        final ffji ffjiVar = new ffji() { // from class: czut
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                ekms ekmsVar = (ekms) obj2;
                ekmsVar.getClass();
                AppCompatImageView appCompatImageView2 = AppCompatImageView.this;
                appCompatImageView2.getClass();
                ekmsVar.w(new czuz(appCompatImageView2));
                return ffcu.a;
            }
        };
        a2.ifPresent(new Consumer() { // from class: czuu
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                ffji.this.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        LottieAnimationView lottieAnimationView = (LottieAnimationView) suggestionShortcutView.findViewById(R.id.animated_background);
        suggestionShortcutView.setContentDescription(a.b());
        if (suggestionShortcutView.getVisibility() != 0) {
            lottieAnimationView.k(1.0f);
            suggestionShortcutView.setVisibility(0);
            appCompatImageView.getClass();
            lottieAnimationView.getClass();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) cxxl.a, 1.0f, 0.9754f);
            ofFloat.setDuration(100L);
            ofFloat.setInterpolator(new csje(1.0f, 0.0f, 0.87f, 0.99f));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) cxxl.a, 0.9754f, 1.0377f);
            ofFloat2.setDuration(183L);
            ofFloat2.setInterpolator(new csje(0.95f, -0.07f, 0.67f, 1.0f));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) cxxl.a, 1.0377f, 1.0f);
            ofFloat3.setDuration(167L);
            ofFloat3.setInterpolator(new csje(0.33f, 0.0f, 0.67f, 1.0f));
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(lottieAnimationView, (Property<LottieAnimationView, Float>) cxxl.a, 1.0f, 0.9754f);
            ofFloat4.setDuration(100L);
            ofFloat4.setInterpolator(new csje(1.0f, 0.0f, 0.87f, 0.99f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(lottieAnimationView, (Property<LottieAnimationView, Float>) cxxl.a, 0.9754f, 1.0377f);
            ofFloat5.setDuration(183L);
            ofFloat5.setInterpolator(new csje(0.95f, -0.07f, 0.67f, 1.0f));
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(lottieAnimationView, (Property<LottieAnimationView, Float>) cxxl.a, 1.0377f, 1.0f);
            ofFloat6.setDuration(167L);
            ofFloat6.setInterpolator(new csje(0.33f, 0.0f, 0.67f, 1.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet.playSequentially(ofFloat4, ofFloat5, ofFloat6);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(animatorSet, animatorSet2);
            animatorSet3.start();
        }
        Optional optional = (Optional) this.h.b();
        final ffji ffjiVar2 = new ffji() { // from class: czuw
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                czvg czvgVar = (czvg) obj2;
                czvgVar.getClass();
                SuggestionData suggestionData = SuggestionData.this;
                czvgVar.c(suggestionData);
                if ((suggestionData instanceof SmartSuggestionItemSuggestionData) && ((SmartSuggestionItemSuggestionData) suggestionData).l() == fbri.STARRING) {
                    czvgVar.d(messageIdType);
                }
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: czux
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                ffji.this.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        suggestionShortcutView.setOnClickListener(new elay((elbx) this.g.b(), "SuggestionShortcutViewPeer#onClick", new View.OnClickListener() { // from class: czuv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czic czicVar2 = czic.this;
                SmartSuggestionData smartSuggestionData2 = smartSuggestionData;
                czicVar2.i(smartSuggestionData2);
                czva czvaVar = this;
                Object b = czvaVar.b.b();
                b.getClass();
                axol.k((ffsk) b, null, new czuy(czvaVar, smartSuggestionData2, null), 3);
            }
        }));
    }

    public final void b() {
        ((SuggestionShortcutView) this.e.b()).setVisibility(8);
        this.d = false;
    }
}
