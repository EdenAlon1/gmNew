package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.scheduledsend.conversation.ConversationScheduledMessageToggleView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import com.google.android.apps.messaging.ui.conversation.typingindicator.ConversationTypingIndicatorView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class url extends vr {
    public int d;
    private final View e;
    private final long o;
    private final int p;
    private final int q;
    private final cqoh r;
    private final urj s;
    private final Optional t;
    private final List f = new ArrayList();
    private final List g = new ArrayList();
    private final List l = new ArrayList();
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    private final Map m = new cmh();
    private final Map n = new cmh();

    public url(Context context, cqoh cqohVar, Optional optional, View view, urj urjVar, int i) {
        this.r = cqohVar;
        this.e = view;
        this.s = urjVar;
        this.t = optional;
        this.j = i;
        x();
        w();
        Resources resources = context.getResources();
        this.p = resources.getDimensionPixelSize(R.dimen.message_bubble_initial_offset);
        this.q = resources.getDimensionPixelSize(R.dimen.jump_scroll_y_translation);
        this.o = cqohVar.a();
    }

    private final boolean A() {
        return ((uuy) this.s).aO;
    }

    private static void e(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((wr) list.get(size)).a.animate().cancel();
            }
        }
    }

    private static void f(wr wrVar, int i) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(wrVar.a, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f));
        ofPropertyValuesHolder.setStartDelay(50L);
        ofPropertyValuesHolder.setDuration(i);
        ofPropertyValuesHolder.setInterpolator(new ljn());
        ofPropertyValuesHolder.start();
    }

    private final boolean g(wr wrVar, vq vqVar, vq vqVar2) {
        int i = 0;
        if (k(wrVar) || vqVar == null || vqVar2 == null) {
            return false;
        }
        int i2 = vqVar.a;
        int i3 = vqVar.b;
        int i4 = vqVar2.a;
        int i5 = vqVar2.b;
        View view = wrVar.a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) wrVar.a.getTranslationY());
        b(wrVar);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 != 0) {
            i = i6;
        } else if (i7 == 0) {
            p(wrVar);
            return false;
        }
        if (i != 0) {
            view.setTranslationX(-i);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.l.add(new urk(wrVar, translationX, translationY, i4, i5));
        return true;
    }

    private static boolean j(vq vqVar) {
        if (vqVar instanceof uqw) {
            return ((uqw) vqVar).e;
        }
        return false;
    }

    private final boolean k(wr wrVar) {
        if (this.r.a() - this.o >= 1000) {
            return false;
        }
        p(wrVar);
        return true;
    }

    private final boolean y(View view) {
        if (!((Boolean) cnvu.a.e()).booleanValue() || !this.t.isPresent()) {
            return false;
        }
        if (view instanceof ConversationScheduledMessageToggleView) {
            return true;
        }
        return (view instanceof ConversationMessageView) && ((ConversationMessageView) view).e.aQ();
    }

    private final boolean z(wr wrVar) {
        uqw uqwVar = (uqw) this.m.get(wrVar);
        uqw uqwVar2 = (uqw) this.n.get(wrVar);
        if (uqwVar == null || !uqwVar.e) {
            return uqwVar2 != null && uqwVar2.e;
        }
        return true;
    }

    public final void a() {
        if (i()) {
            return;
        }
        q();
    }

    @Override // defpackage.vr
    public final void b(wr wrVar) {
        View view = wrVar.a;
        view.animate().cancel();
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((urk) this.l.get(size)).a == wrVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                p(wrVar);
                this.l.remove(size);
            }
        }
        if (this.f.remove(wrVar)) {
            view.setAlpha(1.0f);
            p(wrVar);
        }
        if (this.g.remove(wrVar)) {
            view.setTranslationY(0.0f);
            view.setAlpha(1.0f);
            p(wrVar);
        }
        a();
    }

    @Override // defpackage.vr
    public final void c() {
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            urk urkVar = (urk) this.l.get(size);
            View view = urkVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            p(urkVar.a);
            this.l.remove(size);
        }
        int size2 = this.f.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            p((wr) this.f.get(size2));
            this.f.remove(size2);
        }
        int size3 = this.g.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            wr wrVar = (wr) this.g.get(size3);
            wrVar.a.setTranslationY(0.0f);
            p(wrVar);
            this.g.remove(size3);
        }
        if (i()) {
            e(this.c);
            e(this.b);
            e(this.a);
            q();
        }
    }

    @Override // defpackage.vr
    public final void d() {
        for (final wr wrVar : this.f) {
            final View view = wrVar.a;
            this.c.add(wrVar);
            if (y(view)) {
                akqa akqaVar = (akqa) this.t.get();
                uri uriVar = new uri(this, wrVar, new Runnable() { // from class: urg
                    @Override // java.lang.Runnable
                    public final void run() {
                        url.this.c.remove(wrVar);
                    }
                }, null);
                akqaVar.a(view, view.getAlpha(), 0.0f, 0L).start();
                ObjectAnimator b = akqaVar.b(view, view.getTranslationY(), akqaVar.a.getResources().getDimension(R.dimen.scheduled_send_message_translation_height), akqaVar.a.getResources().getInteger(R.integer.scheduled_messages_alpha_delay));
                b.addListener(new akpz(uriVar, view, b));
                b.start();
            } else {
                final ViewPropertyAnimator animate = view.animate();
                if (z(wrVar)) {
                    animate.translationYBy(this.q).setInterpolator(new ljm());
                }
                animate.setDuration(this.i).alpha(0.0f).setListener(new uri(this, wrVar, new Runnable() { // from class: urh
                    @Override // java.lang.Runnable
                    public final void run() {
                        animate.setListener(null);
                        View view2 = view;
                        view2.setAlpha(1.0f);
                        url.this.c.remove(wrVar);
                        view2.setTranslationY(0.0f);
                    }
                }, null)).start();
            }
        }
        for (urk urkVar : this.l) {
            final wr wrVar2 = urkVar.a;
            int i = urkVar.b;
            int i2 = urkVar.c;
            int i3 = urkVar.d;
            int i4 = urkVar.e;
            final View view2 = wrVar2.a;
            final int i5 = i3 - i;
            final int i6 = i4 - i2;
            ViewPropertyAnimator animate2 = view2.animate();
            if (i5 != 0) {
                animate2.translationX(0.0f);
            }
            if (i6 != 0) {
                animate2.translationY(0.0f);
            }
            animate2.setInterpolator(new ljm());
            this.b.add(wrVar2);
            animate2.setDuration(m()).setListener(new uri(this, wrVar2, new Runnable() { // from class: urf
                @Override // java.lang.Runnable
                public final void run() {
                    url.this.b.remove(wrVar2);
                }
            }, new Runnable() { // from class: ure
                @Override // java.lang.Runnable
                public final void run() {
                    View view3 = view2;
                    if (i5 != 0) {
                        view3.setTranslationX(0.0f);
                    }
                    if (i6 != 0) {
                        view3.setTranslationY(0.0f);
                    }
                }
            })).start();
        }
        for (final wr wrVar3 : this.g) {
            final View view3 = wrVar3.a;
            this.a.add(wrVar3);
            if (y(view3)) {
                akqa akqaVar2 = (akqa) this.t.get();
                uri uriVar2 = new uri(this, wrVar3, new Runnable() { // from class: urb
                    @Override // java.lang.Runnable
                    public final void run() {
                        url.this.a.remove(wrVar3);
                    }
                }, null);
                akqaVar2.a(view3, 0.0f, 1.0f, akqaVar2.a.getResources().getInteger(R.integer.scheduled_messages_alpha_delay)).start();
                ObjectAnimator b2 = akqaVar2.b(view3, akqaVar2.a.getResources().getDimension(R.dimen.scheduled_send_message_translation_height), 0.0f, 0L);
                b2.addListener(new akpy(uriVar2, view3, b2));
                b2.start();
            } else {
                if (z(wrVar3)) {
                    f(wrVar3, 160);
                } else if (view3 instanceof ConversationMessageView) {
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(wrVar3.a, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, -this.p, 0.0f));
                    ofPropertyValuesHolder.setDuration(133L);
                    ofPropertyValuesHolder.setInterpolator(new ljm());
                    ofPropertyValuesHolder.start();
                    f(wrVar3, 83);
                } else if (view3 instanceof ConversationTypingIndicatorView) {
                    f(wrVar3, 83);
                }
                ViewPropertyAnimator animate3 = view3.animate();
                animate3.setInterpolator(new ljm());
                animate3.translationY(0.0f).setDuration(this.h).setListener(new uri(this, wrVar3, new Runnable() { // from class: urd
                    @Override // java.lang.Runnable
                    public final void run() {
                        url.this.a.remove(wrVar3);
                    }
                }, new Runnable() { // from class: urc
                    @Override // java.lang.Runnable
                    public final void run() {
                        view3.setTranslationY(0.0f);
                    }
                })).start();
            }
        }
        this.f.clear();
        this.l.clear();
        this.g.clear();
        this.m.clear();
        this.n.clear();
    }

    @Override // defpackage.vr
    public final boolean i() {
        return (this.g.isEmpty() && this.l.isEmpty() && this.f.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.a.isEmpty()) ? false : true;
    }

    @Override // defpackage.vr
    public final long m() {
        if (this.j != 0 || (this.f.isEmpty() && this.g.isEmpty())) {
            return this.j;
        }
        return 217L;
    }

    @Override // defpackage.vr
    public final vq n(wo woVar, wr wrVar) {
        uqw uqwVar = new uqw(super.n(woVar, wrVar), A());
        this.n.put(wrVar, uqwVar);
        return uqwVar;
    }

    @Override // defpackage.vr
    public final vq o(wo woVar, wr wrVar, int i, List list) {
        uqw uqwVar = new uqw(super.o(woVar, wrVar, i, list), A());
        this.m.put(wrVar, uqwVar);
        return uqwVar;
    }

    @Override // defpackage.vr
    public final boolean r(wr wrVar, vq vqVar, vq vqVar2) {
        if (k(wrVar)) {
            return false;
        }
        if (j(vqVar) || j(vqVar2)) {
            wrVar.a.setTranslationY(-this.q);
            wrVar.a.setAlpha(0.0f);
            this.g.add(wrVar);
            return true;
        }
        if (vqVar != null && (vqVar.a != vqVar2.a || vqVar.b != vqVar2.b)) {
            return g(wrVar, vqVar, vqVar2);
        }
        if (y(wrVar.a)) {
            akqa akqaVar = (akqa) this.t.get();
            View view = wrVar.a;
            view.setTranslationY(akqaVar.a.getResources().getDimension(R.dimen.scheduled_send_message_translation_height));
            view.setAlpha(0.0f);
            this.g.add(wrVar);
            return true;
        }
        if (vqVar2.d < this.e.getHeight() / 2) {
            p(wrVar);
            return false;
        }
        wrVar.a.setTranslationY((this.e.getHeight() - this.d) - vqVar2.b);
        View view2 = wrVar.a;
        if (view2 instanceof ConversationMessageView) {
            view2.setTranslationX(-this.p);
            wrVar.a.setAlpha(0.0f);
        } else if (view2 instanceof ConversationTypingIndicatorView) {
            view2.setTranslationY(view2.getHeight());
            wrVar.a.setAlpha(0.0f);
        }
        this.g.add(wrVar);
        return true;
    }

    @Override // defpackage.vr
    public final boolean s(wr wrVar, wr wrVar2, vq vqVar, vq vqVar2) {
        if (wrVar == wrVar2) {
            return u(wrVar, vqVar, vqVar2);
        }
        p(wrVar);
        p(wrVar2);
        return false;
    }

    @Override // defpackage.vr
    public final boolean t(wr wrVar, vq vqVar, vq vqVar2) {
        int i = vqVar.a;
        int i2 = vqVar.b;
        View view = wrVar.a;
        int left = vqVar2 == null ? view.getLeft() : vqVar2.a;
        int top = vqVar2 == null ? view.getTop() : vqVar2.b;
        if (i != left || i2 != top) {
            return g(wrVar, vqVar, vqVar2);
        }
        b(wrVar);
        this.f.add(wrVar);
        return true;
    }

    @Override // defpackage.vr
    public final boolean u(wr wrVar, vq vqVar, vq vqVar2) {
        if (wrVar.e == -5) {
            return false;
        }
        if (vqVar.a != vqVar2.a || vqVar.b != vqVar2.b) {
            return g(wrVar, vqVar, vqVar2);
        }
        p(wrVar);
        return false;
    }

    @Override // defpackage.vr
    public final boolean v(wr wrVar) {
        return true;
    }
}
