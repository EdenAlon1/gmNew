package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsga implements Animation.AnimationListener {
    public static final /* synthetic */ int a = 0;
    private final ffji b;
    private final ffji c;
    private final ffji d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dsga() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsga.<init>():void");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        this.c.invoke(animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
        this.d.invoke(animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        this.b.invoke(animation);
    }

    public /* synthetic */ dsga(ffji ffjiVar, ffji ffjiVar2, int i) {
        ffjiVar = (i & 1) != 0 ? new ffji() { // from class: dsfx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                int i2 = dsga.a;
                ((Animation) obj).getClass();
                return ffcu.a;
            }
        } : ffjiVar;
        ffjiVar2 = (i & 2) != 0 ? new ffji() { // from class: dsfy
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                int i2 = dsga.a;
                ((Animation) obj).getClass();
                return ffcu.a;
            }
        } : ffjiVar2;
        ffji ffjiVar3 = new ffji() { // from class: dsfz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                int i2 = dsga.a;
                ((Animation) obj).getClass();
                return ffcu.a;
            }
        };
        ffjiVar.getClass();
        ffjiVar2.getClass();
        this.b = ffjiVar;
        this.c = ffjiVar2;
        this.d = ffjiVar3;
    }
}
