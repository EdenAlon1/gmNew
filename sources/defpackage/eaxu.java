package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import com.google.android.libraries.onegoogle.account.disc.RingFrameLayout;
import com.google.android.libraries.onegoogle.common.CirclePulseDrawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaxu {
    public final AvatarView a;
    public final RingFrameLayout b;
    public dvxb c;
    public ebvw d;
    public emxc e;
    public emxc f;
    private AnimatorSet g = new AnimatorSet();

    public eaxu(AvatarView avatarView, RingFrameLayout ringFrameLayout) {
        emux emuxVar = emux.a;
        this.e = emuxVar;
        this.f = emuxVar;
        this.a = avatarView;
        this.b = ringFrameLayout;
        avatarView.d();
        avatarView.g = new ksp() { // from class: eaxr
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                emxc j = emxc.j((Integer) obj);
                eaxu eaxuVar = eaxu.this;
                eaxuVar.f = j;
                eaxuVar.b(eaxuVar.e);
            }
        };
        avatarView.c(avatarView.d);
        ringFrameLayout.setVisibility(0);
    }

    public final void a(emxc emxcVar, boolean z) {
        Drawable drawable;
        if (this.g.isRunning()) {
            this.g.cancel();
        }
        if (!this.f.g()) {
            this.e = emxcVar;
            return;
        }
        int intValue = ((Integer) this.f.c()).intValue();
        dvxb dvxbVar = null;
        if (emxcVar.g()) {
            eawc eawcVar = (eawc) emxcVar.c();
            if (eawcVar.b != null) {
                drawable = new eaxj(new eaxp(new eaxq(this.a.getResources())));
            } else {
                ebin ebinVar = eawcVar.d;
                if (ebinVar == null) {
                    throw new IllegalStateException("RingContent must have a ring drawable factory.");
                }
                ebinVar.a.setAlpha(128);
                AnimatorSet animatorSet = ebinVar.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    ebinVar.b.removeAllListeners();
                }
                CirclePulseDrawable circlePulseDrawable = ebinVar.a;
                int i = intValue + intValue;
                AnimatorSet a = ebin.a(circlePulseDrawable, "firstPulseSize", i, 950L, 900L);
                AnimatorSet a2 = ebin.a(circlePulseDrawable, "secondPulseSize", i, 900L, 834L);
                a2.setStartDelay(400L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(a, a2);
                ebinVar.b = animatorSet2;
                ebinVar.b.addListener(new ebim(ebinVar));
                if (ebinVar.c) {
                    ebinVar.b.start();
                }
                drawable = ebinVar.a;
            }
        } else {
            drawable = null;
        }
        int i2 = engw.d;
        engr engrVar = new engr();
        AvatarView avatarView = this.a;
        if (avatarView.e != null) {
            ObjectAnimator duration = ObjectAnimator.ofInt(avatarView, "currRingThickness", intValue, -1).setDuration(200L);
            duration.addListener(new eaxs(this));
            engrVar.h(duration);
        }
        if (drawable != null) {
            ObjectAnimator duration2 = ObjectAnimator.ofInt(this.a, "currRingThickness", -1, intValue).setDuration(200L);
            duration2.addListener(new eaxt(this, emxcVar, drawable));
            engrVar.h(duration2);
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(engrVar.g());
        this.g = animatorSet3;
        if (!z || this.a.e == drawable) {
            this.g.setDuration(0L);
        }
        this.g.start();
        if (emxcVar.g()) {
            eawc eawcVar2 = (eawc) emxcVar.c();
            if (eawcVar2.c != 0) {
                eyfw eyfwVar = ebvr.a;
                ebvu ebvuVar = (ebvu) ebvv.a.createBuilder();
                epnp epnpVar = (epnp) epnq.a.createBuilder();
                epnm epnmVar = (epnm) epno.a.createBuilder();
                int i3 = eawcVar2.c;
                epnmVar.copyOnWrite();
                epno epnoVar = (epno) epnmVar.instance;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                epnoVar.c = i4;
                epnoVar.b |= 1;
                epnpVar.copyOnWrite();
                epnq epnqVar = (epnq) epnpVar.instance;
                epno epnoVar2 = (epno) epnmVar.build();
                epnoVar2.getClass();
                epnqVar.f = epnoVar2;
                epnqVar.c |= 8;
                ebvuVar.copyOnWrite();
                ebvv ebvvVar = (ebvv) ebvuVar.instance;
                epnq epnqVar2 = (epnq) epnpVar.build();
                epnqVar2.getClass();
                ebvvVar.c = epnqVar2;
                ebvvVar.b |= 1;
                dvxbVar = new dvxb(eyfwVar, (ebvv) ebvuVar.build());
            }
        }
        this.c = dvxbVar;
        ebvw ebvwVar = this.d;
        if (ebvwVar == null) {
            return;
        }
        this.b.ho(ebvwVar);
        dvxb dvxbVar2 = this.c;
        if (dvxbVar2 != null) {
            this.b.c(this.d, dvxbVar2);
        } else {
            this.b.b(this.d);
        }
    }

    final void b(emxc emxcVar) {
        efbd.c();
        a(emxcVar, false);
    }
}
