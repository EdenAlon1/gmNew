package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsju implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ dsjf b;
    final /* synthetic */ jpo c;
    final /* synthetic */ jzn d;

    public dsju(View view, dsjf dsjfVar, jpo jpoVar, jzn jznVar) {
        this.a = view;
        this.b = dsjfVar;
        this.c = jpoVar;
        this.d = jznVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.getWidth() <= 0 || this.a.getHeight() <= 0) {
            return;
        }
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.getWidth();
        View view = this.a;
        dsjf dsjfVar = this.b;
        int height = view.getHeight();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(iby.b(this.c.f()));
        shapeDrawable.setIntrinsicHeight(height);
        shapeDrawable.setIntrinsicWidth(Integer.valueOf(this.d.eo(2.0f)).intValue());
        shapeDrawable.setBounds(0, 0, shapeDrawable.getIntrinsicWidth(), shapeDrawable.getIntrinsicHeight());
        dsjfVar.setTextCursorDrawable(shapeDrawable);
    }
}
