package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebap implements View.OnTouchListener {
    public final ebbb a;
    public final SelectedAccountDisc b;
    public boolean c;
    final GestureDetector.SimpleOnGestureListener d;
    private final ktq e;
    private final ebvw f;

    public ebap(ebbb ebbbVar, SelectedAccountDisc selectedAccountDisc) {
        ebam ebamVar = new ebam(this);
        this.d = ebamVar;
        this.a = ebbbVar;
        this.b = selectedAccountDisc;
        ktq ktqVar = new ktq(selectedAccountDisc.getContext(), ebamVar);
        this.e = ktqVar;
        ktqVar.a(true);
        this.f = ((ebbg) ebbbVar).k;
    }

    public static Object c(List list, Object obj, int i, emxc emxcVar) {
        Object obj2;
        if (!list.isEmpty()) {
            int i2 = i - 1;
            int i3 = 1;
            if (i2 == 1) {
                i3 = -1;
            } else if (i2 != 2) {
                throw new RuntimeException();
            }
            int indexOf = list.indexOf(obj);
            if (indexOf != -1) {
                int i4 = indexOf;
                do {
                    int i5 = ((enou) list).c;
                    i4 = ((i4 + i3) + i5) % i5;
                    if (i4 != indexOf) {
                        obj2 = list.get(i4);
                        if (!emxcVar.g()) {
                            break;
                        }
                    }
                } while (((eayy) emxcVar.c()).a.a(obj2));
                return obj2;
            }
        }
        return obj;
    }

    public static boolean e(int i) {
        return i == 4 || i == 5;
    }

    public static boolean f(int i) {
        return i == 3 || i == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.animation.ObjectAnimator g(com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r4, int r5) {
        /*
            r0 = 3
            r1 = 0
            r2 = 1
            if (r5 == r0) goto Lc
            r0 = 4
            if (r5 != r0) goto La
            r5 = r0
            goto Lc
        La:
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            boolean r5 = f(r5)
            if (r5 == 0) goto L18
            int r3 = r4.getMeasuredHeight()
            goto L1c
        L18:
            int r3 = r4.getMeasuredWidth()
        L1c:
            if (r2 == r0) goto L22
            r0 = -1093874483(0xffffffffbecccccd, float:-0.4)
            goto L25
        L22:
            r0 = 1053609165(0x3ecccccd, float:0.4)
        L25:
            float r3 = (float) r3
            float r3 = r3 * r0
            float[] r0 = new float[r2]
            r0[r1] = r3
            if (r2 == r5) goto L30
            java.lang.String r5 = "translationX"
            goto L32
        L30:
            java.lang.String r5 = "translationY"
        L32:
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r5, r0)
            r0 = 100
            android.animation.ObjectAnimator r4 = r4.setDuration(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebap.g(com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc, int):android.animation.ObjectAnimator");
    }

    public final boolean a(Object obj, Object obj2) {
        eave eaveVar = ((ebbg) this.a).c;
        return eaveVar.b(obj).equals(eaveVar.b(obj2));
    }

    public final AnimatorSet b(int i, AnimatorListenerAdapter animatorListenerAdapter, Runnable runnable) {
        AccountParticleDisc accountParticleDisc = this.b.c;
        ObjectAnimator duration = ObjectAnimator.ofFloat(accountParticleDisc, "alpha", 1.0f, 0.0f).setDuration(50L);
        duration.setStartDelay(50L);
        engw s = engw.s(g(accountParticleDisc, i), duration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(s);
        animatorSet.addListener(new eban(this, runnable, animatorListenerAdapter));
        return animatorSet;
    }

    public final void d(int i) {
        int i2;
        int i3 = i - 1;
        if (i3 != 1) {
            i2 = 2;
            if (i3 == 2) {
                i2 = 5;
            } else if (i3 != 3) {
                i2 = 3;
            }
        } else {
            i2 = 4;
        }
        ebvw ebvwVar = this.f;
        dvxf dvxfVar = new dvxf(22);
        eyfw eyfwVar = dvzr.b;
        dvzs dvzsVar = (dvzs) dvzt.a.createBuilder();
        dvzsVar.copyOnWrite();
        dvzt dvztVar = (dvzt) dvzsVar.instance;
        dvztVar.c = i2 - 1;
        dvztVar.b = 1 | dvztVar.b;
        dvxfVar.b(new dvxg(eyfwVar, (dvzt) dvzsVar.build()));
        ebvwVar.f(dvxfVar, this.b);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        emxf.m(view == this.b, "View must be the selectedAccountDisc passed on the c'tor.");
        if (motionEvent.getAction() == 0) {
            this.b.requestDisallowInterceptTouchEvent(true);
        }
        return this.e.b(motionEvent);
    }
}
