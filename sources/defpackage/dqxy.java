package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.cardview.widget.CardView;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqxy extends PopupWindow implements dqxh {
    public final Activity a;
    public final FrameLayout b;
    public View c;
    public final ValueAnimator d;
    public final ValueAnimator e;
    public ffji f;
    public final ffji g;
    private final CardView h;
    private final View i;
    private dqwt j;
    private final ffbz k;
    private final ffbz l;
    private final ffbz m;
    private final ffbz n;
    private final ffbz o;
    private int p;
    private final ffbz q;
    private final ffbz r;
    private final ffbz s;
    private final ffbz t;
    private final ffbz u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqxy(Activity activity) {
        super(activity);
        activity.getClass();
        this.a = activity;
        this.k = ffca.a(new ffix() { // from class: dqxi
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(dqxy.this.a.getResources().getDimensionPixelSize(R.dimen.emoji_variant_menu_descender_height));
            }
        });
        this.l = ffca.a(new ffix() { // from class: dqxv
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(dqxy.this.a.getResources().getDimensionPixelSize(R.dimen.emoji_item_default_width));
            }
        });
        this.m = ffca.a(new ffix() { // from class: dqxw
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(dqxy.this.a.getResources().getDimensionPixelSize(R.dimen.emoji_variant_menu_size_margin));
            }
        });
        this.n = ffca.a(new ffix() { // from class: dqxx
            @Override // defpackage.ffix
            public final Object invoke() {
                return Long.valueOf(dqxy.this.a.getResources().getInteger(R.integer.short_animation_ms));
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setDuration(k());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dqxj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                dqxy.this.f(((Float) animatedValue).floatValue());
            }
        });
        this.d = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        ofFloat2.setDuration(k());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dqxk
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                dqxy.this.f(((Float) animatedValue).floatValue());
            }
        });
        this.e = ofFloat2;
        this.o = ffca.a(new ffix() { // from class: dqxl
            @Override // defpackage.ffix
            public final Object invoke() {
                Rect rect = new Rect();
                dqxy.this.a.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                return Integer.valueOf(rect.top);
            }
        });
        this.g = new ffji() { // from class: dqxm
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dqof dqofVar = (dqof) obj;
                dqofVar.getClass();
                dqxy dqxyVar = dqxy.this;
                ffji ffjiVar = dqxyVar.f;
                if (ffjiVar != null) {
                    ffjiVar.invoke(dqofVar);
                }
                dqxyVar.f = null;
                dqxyVar.dismiss();
                return ffcu.a;
            }
        };
        setWidth(-1);
        setHeight(-1);
        setBackgroundDrawable(null);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.emoji_variant_menu, (ViewGroup) null);
        setContentView(inflate);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: dqxn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dqxy.this.dismiss();
            }
        });
        CardView cardView = (CardView) inflate.findViewById(R.id.panel);
        this.h = cardView;
        this.i = inflate.findViewById(R.id.descender);
        this.b = (FrameLayout) inflate.findViewById(R.id.emoji_set_view_container);
        setAnimationStyle(R.style.VariantMenuAnimation);
        cardView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: dqxo
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                dqxy dqxyVar = dqxy.this;
                if (dqxyVar.g()) {
                    dqxyVar.d();
                    dqxyVar.e();
                }
            }
        });
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: dqxp
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                dqxy dqxyVar = dqxy.this;
                dqxyVar.d.cancel();
                dqxyVar.e.cancel();
                dqxyVar.e.start();
                dqxyVar.c = null;
            }
        });
        this.q = ffca.b(1, new ffix() { // from class: dqxq
            @Override // defpackage.ffix
            public final Object invoke() {
                dqky dqkyVar = dqxg.a;
                dqxy dqxyVar = dqxy.this;
                Activity activity2 = dqxyVar.a;
                int c = dqxyVar.c();
                activity2.getClass();
                ffji ffjiVar = dqxyVar.g;
                ffjiVar.getClass();
                dqwt a = dqxg.a(activity2, c, ffjiVar, new ffjm() { // from class: dqwu
                    @Override // defpackage.ffjm
                    public final Object a(Object obj, Object obj2) {
                        ((Integer) obj).intValue();
                        dqqh dqqhVar = (dqqh) obj2;
                        dqky dqkyVar2 = dqxg.a;
                        if (dqqhVar != null) {
                            return dqqhVar.a;
                        }
                        return null;
                    }
                }, 1, new ffji() { // from class: dqww
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        dqky dqkyVar2 = dqxg.a;
                        return 1;
                    }
                });
                dqxyVar.b.addView(a);
                return a;
            }
        });
        this.r = ffca.b(1, new ffix() { // from class: dqxr
            @Override // defpackage.ffix
            public final Object invoke() {
                dqky dqkyVar = dqxg.a;
                dqxy dqxyVar = dqxy.this;
                Activity activity2 = dqxyVar.a;
                int c = dqxyVar.c();
                activity2.getClass();
                ffji ffjiVar = dqxyVar.g;
                ffjiVar.getClass();
                ffbz ffbzVar = dqnz.a;
                final int size = dqny.a().size();
                dqwt a = dqxg.a(activity2, c, ffjiVar, new ffjm() { // from class: dqxb
                    @Override // defpackage.ffjm
                    public final Object a(Object obj, Object obj2) {
                        int intValue = ((Integer) obj).intValue();
                        dqqi dqqiVar = (dqqi) obj2;
                        dqky dqkyVar2 = dqxg.a;
                        if (dqqiVar == null) {
                            return null;
                        }
                        Object obj3 = dqxg.b.get(intValue);
                        obj3.getClass();
                        return dqqiVar.b((dqnz) obj3);
                    }
                }, size, new ffji() { // from class: dqxc
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        dqky dqkyVar2 = dqxg.a;
                        return Integer.valueOf(size);
                    }
                });
                dqxyVar.b.addView(a);
                return a;
            }
        });
        this.s = ffca.b(1, new ffix() { // from class: dqxs
            @Override // defpackage.ffix
            public final Object invoke() {
                dqky dqkyVar = dqxg.a;
                dqxy dqxyVar = dqxy.this;
                Activity activity2 = dqxyVar.a;
                int c = dqxyVar.c();
                activity2.getClass();
                ffji ffjiVar = dqxyVar.g;
                ffjiVar.getClass();
                ffjm ffjmVar = new ffjm() { // from class: dqwx
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
                    @Override // defpackage.ffjm
                    public final Object a(Object obj, Object obj2) {
                        int intValue = ((Integer) obj).intValue();
                        dqqg dqqgVar = (dqqg) obj2;
                        dqky dqkyVar2 = dqxg.a;
                        dqqgVar.getClass();
                        return dqqgVar.b((dqnw) dqxg.a.invoke(dqqgVar.c()).get(intValue));
                    }
                };
                ffbz ffbzVar = dqnw.a;
                dqwt a = dqxg.a(activity2, c, ffjiVar, ffjmVar, dqnv.a().size(), new ffji() { // from class: dqwy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Set c2;
                        dqqg dqqgVar = (dqqg) obj;
                        dqky dqkyVar2 = dqxg.a;
                        int i = 0;
                        if (dqqgVar != null && (c2 = dqqgVar.c()) != null) {
                            i = c2.size();
                        }
                        return Integer.valueOf(i);
                    }
                });
                dqxyVar.b.addView(a);
                return a;
            }
        });
        this.t = ffca.b(1, new ffix() { // from class: dqxt
            @Override // defpackage.ffix
            public final Object invoke() {
                dqky dqkyVar = dqxg.a;
                dqxy dqxyVar = dqxy.this;
                Activity activity2 = dqxyVar.a;
                int c = dqxyVar.c();
                activity2.getClass();
                ffji ffjiVar = dqxyVar.g;
                ffjiVar.getClass();
                dqwt a = dqxg.a(activity2, c, ffjiVar, new ffjm() { // from class: dqwz
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
                    @Override // defpackage.ffjm
                    public final Object a(Object obj, Object obj2) {
                        int intValue = ((Integer) obj).intValue();
                        dqqe dqqeVar = (dqqe) obj2;
                        dqky dqkyVar2 = dqxg.a;
                        dqqeVar.getClass();
                        dqnw dqnwVar = (dqnw) dqxg.a.invoke(dqqeVar.c()).get(intValue / dqxg.b.size());
                        List list = dqxg.b;
                        Object obj3 = list.get(intValue % list.size());
                        obj3.getClass();
                        return dqqeVar.b(dqnwVar, (dqnz) obj3);
                    }
                }, dqxg.b.size(), new ffji() { // from class: dqxa
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        Set c2;
                        dqqe dqqeVar = (dqqe) obj;
                        dqky dqkyVar2 = dqxg.a;
                        int i = 0;
                        if (dqqeVar != null && (c2 = dqqeVar.c()) != null) {
                            i = c2.size();
                        }
                        ffbz ffbzVar = dqnz.a;
                        return Integer.valueOf(i * dqny.a().size());
                    }
                });
                dqxyVar.b.addView(a);
                return a;
            }
        });
        this.u = ffca.b(1, new ffix() { // from class: dqxu
            @Override // defpackage.ffix
            public final Object invoke() {
                dqky dqkyVar = dqxg.a;
                dqxy dqxyVar = dqxy.this;
                Activity activity2 = dqxyVar.a;
                int c = dqxyVar.c();
                activity2.getClass();
                ffji ffjiVar = dqxyVar.g;
                ffjiVar.getClass();
                final int size = dqxg.b.size() - 1;
                dqwt a = dqxg.a(activity2, c, ffjiVar, new ffjm() { // from class: dqxe
                    @Override // defpackage.ffjm
                    public final Object a(Object obj, Object obj2) {
                        int intValue = ((Integer) obj).intValue();
                        dqqb dqqbVar = (dqqb) obj2;
                        dqky dqkyVar2 = dqxg.a;
                        dqqbVar.getClass();
                        int i = size;
                        Object obj3 = dqxg.b.get(i - (intValue % i));
                        obj3.getClass();
                        dqnz dqnzVar = (dqnz) obj3;
                        Object obj4 = dqxg.b.get((intValue / i) + 1);
                        obj4.getClass();
                        dqnz dqnzVar2 = (dqnz) obj4;
                        if (true != dqqbVar.e().contains(new ffcf(dqnzVar, dqnzVar2))) {
                            dqqbVar = null;
                        }
                        if (dqqbVar != null) {
                            return dqqbVar.d(dqnzVar, dqnzVar2);
                        }
                        return null;
                    }
                }, size, new ffji() { // from class: dqwv
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        dqky dqkyVar2 = dqxg.a;
                        int i = size;
                        return Integer.valueOf(i * i);
                    }
                });
                dqxyVar.b.addView(a);
                return a;
            }
        });
    }

    private final int h() {
        return ((Number) this.k.a()).intValue();
    }

    private final int i() {
        return ((Number) this.m.a()).intValue();
    }

    private final int j() {
        return ((Number) this.o.a()).intValue();
    }

    private final long k() {
        return ((Number) this.n.a()).longValue();
    }

    private final void l(dqwt dqwtVar, int i) {
        int j = i - j();
        dqwtVar.f.d(dqwt.a[2], Integer.valueOf(j));
    }

    @Override // defpackage.dqxh
    public final void a() {
        dismiss();
    }

    @Override // defpackage.dqxh
    public final void b(dqqj dqqjVar, View view, dqsv dqsvVar, ffji ffjiVar) {
        dqwt dqwtVar;
        dqsvVar.getClass();
        if (dqqjVar instanceof dqqh) {
            dqwtVar = (dqwt) this.q.a();
            dqwtVar.e(dqqjVar);
        } else if (dqqjVar instanceof dqqi) {
            dqwtVar = (dqwt) this.r.a();
            dqwtVar.e(dqqjVar);
        } else if (dqqjVar instanceof dqqg) {
            dqwtVar = (dqwt) this.s.a();
            dqwtVar.e(dqqjVar);
        } else if (dqqjVar instanceof dqqe) {
            dqwtVar = (dqwt) this.t.a();
            dqwtVar.e(dqqjVar);
        } else {
            if (!(dqqjVar instanceof dqqb)) {
                throw new ffcd();
            }
            dqwtVar = (dqwt) this.u.a();
            dqwtVar.e(dqqjVar);
        }
        dqwtVar.d.d(dqwt.a[0], dqsvVar);
        l(dqwtVar, dslh.a(view).y);
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.b.getChildAt(i).setVisibility(8);
        }
        this.j = dqwtVar;
        dqwtVar.setVisibility(0);
        dqwtVar.requestFocus();
        this.c = view;
        showAsDropDown(view, 0, 0, 48);
        d();
        if (g()) {
            e();
        }
        this.d.cancel();
        this.e.cancel();
        this.d.start();
        getContentView().requestFocus();
        this.f = ffjiVar;
    }

    public final int c() {
        return ((Number) this.l.a()).intValue();
    }

    public final void d() {
        View view = this.c;
        if (view == null) {
            return;
        }
        Point a = dslh.a(view);
        int i = a.x;
        this.p = ((a.y - j()) + view.getHeight()) - h();
        View view2 = this.i;
        view2.setTranslationX(i);
        view2.setTranslationY(this.p);
        view2.getLayoutParams().width = view.getWidth();
        view2.requestLayout();
    }

    public final void e() {
        View view = this.c;
        if (view == null) {
            return;
        }
        Point a = dslh.a(view);
        int width = a.x + (view.getWidth() / 2);
        int width2 = this.h.getWidth() / 2;
        int i = i();
        Context context = view.getContext();
        context.getClass();
        int i2 = ffmk.i(width - width2, i, (dskj.c(context).x - this.h.getWidth()) - i());
        dqwt dqwtVar = this.j;
        if (dqwtVar != null) {
            l(dqwtVar, a.y);
        }
        int j = ((((a.y - j()) + view.getHeight()) - this.i.getHeight()) + i()) - this.h.getHeight();
        this.h.setTranslationX(i2);
        this.h.setTranslationY(j);
    }

    public final void f(float f) {
        float f2 = 1.0f - f;
        View view = this.i;
        view.setTranslationY(this.p - (h() * f2));
        view.setAlpha(f);
        View contentView = getContentView();
        contentView.setTranslationY(f2 * h());
        contentView.setAlpha(f);
    }

    public final boolean g() {
        return this.c != null && this.j != null && this.h.getHeight() > 0 && this.i.getHeight() > 0;
    }
}
