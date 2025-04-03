package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import defpackage.ea;
import defpackage.efmg;
import defpackage.efoi;
import defpackage.efor;
import defpackage.efpb;
import defpackage.efpe;
import defpackage.efsj;
import defpackage.efsk;
import defpackage.efsv;
import defpackage.efsw;
import defpackage.fahb;
import defpackage.fahc;
import defpackage.fain;
import defpackage.fajp;
import defpackage.fdvv;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SurveyViewPager extends ViewPager {
    public efsj l;

    public SurveyViewPager(Context context) {
        super(context);
        E();
    }

    private final View D() {
        efpe v;
        if (this.b == null || (v = v()) == null) {
            return null;
        }
        return v.Q;
    }

    private final void E() {
        final efsv efsvVar = new efsv(this);
        d(efsvVar);
        post(new Runnable() { // from class: efsu
            @Override // java.lang.Runnable
            public final void run() {
                efsvVar.b(SurveyViewPager.this.c);
            }
        });
    }

    public final boolean A() {
        return this.c == 0;
    }

    public final boolean B() {
        efsw efswVar = (efsw) this.b;
        if (efswVar == null) {
            Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
            return false;
        }
        if (!efor.a() || v() == null || efswVar.o(this.c) == null || (efswVar.o(this.c).b & 1) == 0) {
            efpb efpbVar = efor.c;
            if (efor.c(fdvv.b(efor.b))) {
                return this.c == efswVar.j() - (efswVar.b == efmg.CARD ? 2 : 1);
            }
            return this.c == efswVar.j() + (-2);
        }
        fajp fajpVar = ((efsw) this.b).o(this.c).k;
        if (fajpVar == null) {
            fajpVar = fajp.a;
        }
        fahc fahcVar = fajpVar.d;
        if (fahcVar == null) {
            fahcVar = fahc.a;
        }
        int a = fahb.a(fahcVar.b);
        return a != 0 && a == 5;
    }

    public final boolean C() {
        efpb efpbVar = efor.c;
        if (!efor.c(fdvv.b(efor.b))) {
            return this.c == this.b.j() + (-1);
        }
        efsw efswVar = (efsw) this.b;
        if (efswVar != null) {
            return ((efsk) efswVar.a.get(this.c)).b == 5;
        }
        Log.e("SurveyViewPager", "Error, survey view pager adapter is null!");
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        switch (keyCode) {
            case 19:
            case 20:
            case 21:
            case 22:
                return false;
            default:
                switch (keyCode) {
                    case 268:
                    case 269:
                    case 270:
                    case 271:
                        return false;
                    default:
                        return super.dispatchKeyEvent(keyEvent);
                }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    protected final void onMeasure(int i, int i2) {
        efpb efpbVar = efor.c;
        if (efor.c(fdvv.a.get().a(efor.b))) {
            View D = D();
            if (D == null) {
                super.onMeasure(i, i2);
                return;
            }
            efsj efsjVar = this.l;
            View findViewById = efsjVar != null ? efsjVar.b().findViewById(R.id.survey_controls_container) : null;
            efsj efsjVar2 = this.l;
            super.onMeasure(i, efoi.b(this, D, i, i2, D.findViewById(R.id.survey_question_header_logo_text), findViewById, efsjVar2 == null || efsjVar2.aV()));
            return;
        }
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
        }
        View D2 = D();
        if (D2 == null) {
            super.onMeasure(i, i2);
            return;
        }
        D2.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = D2.getMeasuredHeight();
        Rect rect = new Rect();
        D2.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - D2.findViewById(R.id.survey_question_header_logo_text).getHeight();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.survey_card_vertical_margin);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(measuredHeight, height - (dimensionPixelSize + dimensionPixelSize)), 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final efpe v() {
        efsj efsjVar = this.l;
        if (efsjVar == null) {
            return null;
        }
        int i = this.c;
        for (ea eaVar : efsjVar.a().p()) {
            if (efsw.m(eaVar) == i && (eaVar instanceof efpe)) {
                return (efpe) eaVar;
            }
        }
        return null;
    }

    public final fain w() {
        efpe v = v();
        if (v == null) {
            return null;
        }
        return v.e();
    }

    public final void x() {
        l(this.b.j() - 1, true);
        v().f();
    }

    public final void y(int i) {
        l(i, true);
        v().f();
    }

    public final void z(final String str) {
        efpe v = v();
        if (v != null) {
            v.q(str);
        } else {
            post(new Runnable() { // from class: efst
                @Override // java.lang.Runnable
                public final void run() {
                    SurveyViewPager.this.v().q(str);
                }
            });
        }
    }

    public SurveyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        E();
    }
}
