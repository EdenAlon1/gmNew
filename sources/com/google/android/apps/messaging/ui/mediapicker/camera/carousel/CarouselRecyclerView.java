package com.google.android.apps.messaging.ui.mediapicker.camera.carousel;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;
import defpackage.csix;
import defpackage.dcsb;
import defpackage.dcsc;
import defpackage.dcsd;
import defpackage.uw;
import defpackage.uy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CarouselRecyclerView extends RecyclerView implements dcsb {
    public boolean ac;
    public int ad;
    public int ae;
    public int af;
    private CarouselLayoutManager ag;
    private uy ah;
    private DecelerateInterpolator ai;
    private int aj;

    public CarouselRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ac = false;
        this.ad = -1;
        this.ae = -1;
        this.aj = 0;
    }

    private final int aR(int i) {
        View aH = this.ag.aH(i);
        if (aH != null) {
            return (aH.getLeft() + (aH.getWidth() / 2)) - (getWidth() / 2);
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void Z(int i) {
        if (i == 1) {
            this.ad = -1;
            this.ae = -1;
        }
    }

    public final int a() {
        int abs;
        int at = this.ag.at();
        uy uyVar = this.ah;
        if (uyVar == null || at == 0) {
            return -1;
        }
        int j = this.ag.bm() ? uyVar.j() + (uyVar.k() / 2) : uyVar.e() / 2;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        View view = null;
        for (int i2 = 0; i2 < at; i2++) {
            View aH = this.ag.aH(i2);
            if (aH != null && (abs = Math.abs((aH.getLeft() + (aH.getWidth() / 2)) - j)) < i) {
                view = aH;
                i = abs;
            }
        }
        if (view != null) {
            return gp(view);
        }
        return -1;
    }

    public final int aP(int i) {
        View aH = this.ag.aH(0);
        View aH2 = this.ag.aH(r1.at() - 1);
        if (aH != null && aH2 != null) {
            int gp = gp(aH);
            int gp2 = gp(aH2);
            if (i >= gp && i <= gp2) {
                return i - gp;
            }
        }
        return -1;
    }

    public final void aQ(boolean z) {
        this.ag.a = z;
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void ak(int i) {
        if (i < 0) {
            return;
        }
        if (aP(i) != -1) {
            this.ae = -1;
            as(aR(aP(i)), 0);
            return;
        }
        this.ae = i;
        dcsc dcscVar = new dcsc(getContext(), 1.0f);
        dcscVar.g = i;
        dcscVar.a = this;
        this.ag.bl(dcscVar);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void at(int i, int i2, Interpolator interpolator) {
        if (csix.n()) {
            super.scrollBy(i, i2);
        } else {
            aM(i, i2, interpolator);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void au(int i) {
        if (i < 0) {
            return;
        }
        if (aP(i) != -1) {
            this.ad = -1;
            at(aR(aP(i)), 0, this.ai);
            return;
        }
        this.ad = i;
        dcsc dcscVar = new dcsc(getContext(), 150.0f);
        dcscVar.g = i;
        dcscVar.a = this;
        this.ag.bl(dcscVar);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        getContext();
        this.ai = new DecelerateInterpolator();
        CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager();
        this.ag = carouselLayoutManager;
        ap(carouselLayoutManager);
        this.ah = new uw(this.ag);
        new dcsd().f(this);
        post(new Runnable() { // from class: dcrz
            @Override // java.lang.Runnable
            public final void run() {
                CarouselRecyclerView.this.w(new dcsa());
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.aj == 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 4096 || i == 8192) {
            return false;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        this.aj += true == z ? -1 : 1;
        super.setEnabled(z);
    }
}
