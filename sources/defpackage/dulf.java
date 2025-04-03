package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.hats20.view.RatingView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dulf implements View.OnClickListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ int b;
    final /* synthetic */ RatingView c;

    public dulf(RatingView ratingView, ViewGroup viewGroup, int i) {
        this.a = viewGroup;
        this.b = i;
        this.c = ratingView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 0;
        while (true) {
            ViewGroup viewGroup = this.a;
            if (i >= viewGroup.getChildCount()) {
                break;
            }
            viewGroup.getChildAt(i).setOnClickListener(null);
            viewGroup.getChildAt(i).setClickable(false);
            i++;
        }
        dulh dulhVar = this.c.a;
        if (dulhVar != null) {
            dulhVar.a(this.b);
        }
    }
}
