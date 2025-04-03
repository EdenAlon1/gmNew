package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxsn extends cxrx {
    final /* synthetic */ ImageView d;
    final /* synthetic */ cxpv e;
    final /* synthetic */ cxrw f;
    final /* synthetic */ cxrw g;
    final /* synthetic */ cxrw h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxsn(BiConsumer biConsumer, cxrv cxrvVar, ImageView imageView, cxpv cxpvVar, cxrw cxrwVar, cxrw cxrwVar2, cxrw cxrwVar3) {
        super(biConsumer, cxrvVar);
        this.d = imageView;
        this.e = cxpvVar;
        this.f = cxrwVar;
        this.g = cxrwVar2;
        this.h = cxrwVar3;
    }

    @Override // defpackage.cxrx
    public final View a() {
        return this.d;
    }

    @Override // defpackage.cxrx
    public final void b(cxrv cxrvVar) {
        cxrw cxrwVar;
        int ordinal = cxrvVar.ordinal();
        if (ordinal == 0) {
            cxrwVar = this.f;
        } else if (ordinal == 1) {
            cxrwVar = this.g;
        } else {
            if (ordinal != 2) {
                throw new IllegalStateException("Unhandled state ".concat(String.valueOf(String.valueOf(cxrvVar))));
            }
            cxrwVar = this.h;
        }
        ObjectAnimator duration = ObjectAnimator.ofInt(this.e, (Property<cxpv, Integer>) cxxl.b, cxrvVar == cxrv.OPEN ? 10000 : 0).setDuration(250L);
        duration.setInterpolator(new ljm());
        duration.start();
        this.d.setColorFilter(cxrwVar.b);
        ImageView imageView = this.d;
        Context context = imageView.getContext();
        if (cxrwVar.e == null) {
            cxrwVar.e = context.getString(cxrwVar.c);
        }
        imageView.setContentDescription(cxrwVar.e);
        Integer num = cxrwVar.d;
        if (num == null) {
            this.d.setBackground(null);
            return;
        }
        ImageView imageView2 = this.d;
        num.intValue();
        imageView2.setBackgroundResource(R.drawable.compose_audio_button_selected_background);
    }
}
