package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exbe implements View.OnClickListener {
    final /* synthetic */ ImageButton a;
    final /* synthetic */ exbu b;

    public exbe(exbu exbuVar, ImageButton imageButton) {
        this.a = imageButton;
        this.b = exbuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        exbu exbuVar = this.b;
        if (exbuVar.N) {
            this.a.setImageDrawable(exbuVar.m);
            this.b.m.start();
            exbu exbuVar2 = this.b;
            int width = exbuVar2.I.getWidth();
            ViewGroup viewGroup = exbuVar2.f;
            int width2 = viewGroup.getWidth();
            float f = width2;
            float x = viewGroup.getX();
            exbp exbpVar = new exbp(exbuVar2, width, width2, x, x + viewGroup.getWidth());
            int height = exbuVar2.I.getHeight();
            ViewGroup viewGroup2 = exbuVar2.f;
            exbq exbqVar = new exbq(exbuVar2, height, viewGroup2.getHeight(), viewGroup2.getY() + viewGroup2.getHeight());
            float x2 = exbuVar2.i.getX();
            exbc exbcVar = new exbc(exbuVar2, x2, exbuVar2.q() ? (x2 - f) + exbuVar2.i.getWidth() : (f + x2) - exbuVar2.i.getWidth(), width2);
            exbpVar.setInterpolator(exbuVar2.p);
            exbpVar.setDuration(exbuVar2.t());
            exbqVar.setInterpolator(exbuVar2.o);
            exbqVar.setDuration(exbuVar2.t());
            exbcVar.setInterpolator(exbuVar2.p);
            exbcVar.setDuration(exbuVar2.t());
            exbuVar2.w.getAnimations().clear();
            exbuVar2.w.addAnimation(exbpVar);
            exbuVar2.w.addAnimation(exbqVar);
            exbuVar2.w.addAnimation(exbcVar);
            exbuVar2.f.startAnimation(exbuVar2.w);
            exbuVar2.N = false;
            exbuVar2.g.animate().alpha(1.0f).withLayer().setInterpolator(exbuVar2.r).setDuration(100L).start();
            exbuVar2.h.animate().alpha(0.0f).withLayer().setInterpolator(exbuVar2.q).setDuration(150L).start();
            return;
        }
        this.a.setImageDrawable(exbuVar.l);
        this.b.l.start();
        exbu exbuVar3 = this.b;
        int width3 = exbuVar3.H.getWidth();
        float f2 = width3;
        int height2 = exbuVar3.H.getHeight();
        ViewGroup viewGroup3 = exbuVar3.f;
        int width4 = viewGroup3.getWidth();
        int height3 = viewGroup3.getHeight();
        float y = viewGroup3.getY();
        float x3 = viewGroup3.getX();
        exbm exbmVar = new exbm(exbuVar3, width3, width4, x3, x3 + viewGroup3.getWidth());
        exbn exbnVar = new exbn(exbuVar3, height2, height3, y);
        float x4 = exbuVar3.i.getX();
        exbo exboVar = new exbo(exbuVar3, x4, exbuVar3.q() ? (f2 + x4) - exbuVar3.i.getWidth() : (x4 - f2) + exbuVar3.i.getWidth(), width4);
        exbmVar.setInterpolator(exbuVar3.o);
        exbmVar.setDuration(exbuVar3.t());
        exbnVar.setInterpolator(exbuVar3.p);
        exbnVar.setDuration(exbuVar3.t());
        exboVar.setInterpolator(exbuVar3.p);
        exboVar.setDuration(exbuVar3.t());
        exbuVar3.v.getAnimations().clear();
        exbuVar3.v.getAnimations().clear();
        exbuVar3.v.addAnimation(exbmVar);
        exbuVar3.v.addAnimation(exbnVar);
        exbuVar3.v.addAnimation(exboVar);
        exbuVar3.f.startAnimation(exbuVar3.v);
        exbuVar3.N = true;
        exbuVar3.g.animate().alpha(0.0f).withLayer().setInterpolator(exbuVar3.q).setDuration(250L).start();
        exbuVar3.h.setAlpha(1.0f);
    }
}
