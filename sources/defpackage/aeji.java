package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeji extends wr {
    public final LottieAnimationView s;
    public final LottieAnimationView t;

    private aeji(View view) {
        super(view);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.ghost_loading_intro);
        this.s = lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) view.findViewById(R.id.ghost_loading_loop);
        this.t = lottieAnimationView2;
        egxt c = egxs.c(view.getContext());
        egxp.d(egxy.a, lottieAnimationView, c);
        egxp.d(egxz.a, lottieAnimationView2, c);
        view.addOnAttachStateChangeListener(new aejg(this));
    }

    public static aeji C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new aeji(layoutInflater.inflate(R.layout.conversation_list_loading_item_lottie, viewGroup, false));
    }
}
