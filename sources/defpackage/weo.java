package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerView;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class weo {
    public final wee a;
    public final SimPickerView b;
    public Optional c;
    public LinearLayout d;
    public final RecyclerView e;
    public boolean f = false;

    public weo(Optional optional, wee weeVar, SimPickerView simPickerView) {
        this.c = Optional.empty();
        this.a = weeVar;
        this.b = simPickerView;
        RecyclerView recyclerView = (RecyclerView) simPickerView.findViewById(R.id.sim_list);
        this.e = recyclerView;
        simPickerView.getContext();
        recyclerView.ap(new LinearLayoutManager());
        recyclerView.am(weeVar);
        if (cnvu.a()) {
            this.d = (LinearLayout) simPickerView.findViewById(R.id.send_option_layout);
            final crly crlyVar = new crly(simPickerView, R.id.scheduled_send_entry_point, R.id.scheduled_send_entry_point);
            this.c = optional.map(new Function() { // from class: wej
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ellq ellqVar = (ellq) ((aktt) obj).a.b();
                    ellqVar.getClass();
                    return new aktu(ellqVar, crly.this);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        a(false, null);
    }

    public final void a(boolean z, final Runnable runnable) {
        if (!cnvu.a()) {
            this.b.clearAnimation();
            this.e.clearAnimation();
            long a = csmj.a(this.b.getContext());
            if (!z || a <= 0) {
                this.b.setAlpha(0.0f);
                this.e.setTranslationY(r1.getHeight());
                this.b.setVisibility(8);
                return;
            }
            this.b.setVisibility(0);
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(a).withEndAction(new Runnable() { // from class: wek
                @Override // java.lang.Runnable
                public final void run() {
                    weo.this.b.setVisibility(8);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            });
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setInterpolator(ddzb.a);
            translateAnimation.setDuration(a);
            this.e.startAnimation(translateAnimation);
            return;
        }
        this.d.getClass();
        this.b.clearAnimation();
        this.d.clearAnimation();
        long a2 = csmj.a(this.b.getContext());
        if (!z || a2 <= 0) {
            this.b.setAlpha(0.0f);
            this.d.setTranslationY(r1.getHeight());
            this.b.setVisibility(8);
            return;
        }
        this.b.setVisibility(0);
        this.b.setAlpha(1.0f);
        this.b.animate().alpha(0.0f).setDuration(a2).withEndAction(new Runnable() { // from class: wel
            @Override // java.lang.Runnable
            public final void run() {
                weo.this.b.setVisibility(8);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation2.setInterpolator(ddzb.a);
        translateAnimation2.setDuration(a2);
        this.d.startAnimation(translateAnimation2);
    }

    public final void b(boolean z) {
        if (cnvu.a()) {
            this.f = z;
        }
    }
}
