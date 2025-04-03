package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaxc extends AnimatorListenerAdapter {
    final /* synthetic */ eawt a;
    final /* synthetic */ DrawableBadgeViewHolder b;

    public eaxc(DrawableBadgeViewHolder drawableBadgeViewHolder, eawt eawtVar) {
        this.a = eawtVar;
        this.b = drawableBadgeViewHolder;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        DrawableBadgeViewHolder drawableBadgeViewHolder = this.b;
        dvxb dvxbVar = null;
        drawableBadgeViewHolder.d = null;
        if (this.a != null) {
            switch (r1.b()) {
                case APP_CUSTOM:
                    i = 8;
                    break;
                case YELLOW_ALERT:
                    i = 5;
                    break;
                case RED_ALERT:
                    i = 6;
                    break;
                case UPLOAD_ARROW:
                    i = 9;
                    break;
                case PAUSED_UPLOAD_ARROW:
                    i = 10;
                    break;
                case COMPLETED_CHECKMARK:
                    i = 11;
                    break;
                case SYNCING_OFF:
                    i = 12;
                    break;
                case OBAKE:
                    i = 7;
                    break;
                default:
                    i = 1;
                    break;
            }
            eyfw eyfwVar = ebvr.a;
            ebvu ebvuVar = (ebvu) ebvv.a.createBuilder();
            epnp epnpVar = (epnp) epnq.a.createBuilder();
            epnk epnkVar = (epnk) epnl.a.createBuilder();
            epnkVar.copyOnWrite();
            epnl epnlVar = (epnl) epnkVar.instance;
            epnlVar.c = i - 1;
            epnlVar.b |= 1;
            epnl epnlVar2 = (epnl) epnkVar.build();
            epnpVar.copyOnWrite();
            epnq epnqVar = (epnq) epnpVar.instance;
            epnlVar2.getClass();
            epnqVar.d = epnlVar2;
            epnqVar.c |= 2;
            epnq epnqVar2 = (epnq) epnpVar.build();
            ebvuVar.copyOnWrite();
            ebvv ebvvVar = (ebvv) ebvuVar.instance;
            epnqVar2.getClass();
            ebvvVar.c = epnqVar2;
            ebvvVar.b |= 1;
            dvxbVar = new dvxb(eyfwVar, (ebvv) ebvuVar.build());
        }
        drawableBadgeViewHolder.e = dvxbVar;
        ebvw ebvwVar = drawableBadgeViewHolder.c;
        if (ebvwVar == null) {
            return;
        }
        drawableBadgeViewHolder.a.ho(ebvwVar);
        dvxb dvxbVar2 = drawableBadgeViewHolder.e;
        if (dvxbVar2 != null) {
            drawableBadgeViewHolder.a.c(drawableBadgeViewHolder.c, dvxbVar2);
        } else {
            drawableBadgeViewHolder.a.b(drawableBadgeViewHolder.c);
        }
    }
}
