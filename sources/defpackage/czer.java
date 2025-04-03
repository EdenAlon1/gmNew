package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czer extends PopupWindow implements czel {
    public final Context a;
    public final czdp b;
    public final LayoutInflater c;
    public final List d;
    public czep e;
    public GridLayoutManager f;
    public View g;
    public View h;
    public View i;
    public View j;
    public int k;
    public int l;
    public FrameLayout.LayoutParams m;
    public czee n;

    public czer(Context context, czdp czdpVar) {
        super(context);
        this.d = new ArrayList();
        this.a = context;
        this.b = czdpVar;
        this.c = LayoutInflater.from(context);
    }

    public final void a() {
        Point a = ddzc.a(this.j);
        int i = a.x;
        int d = ((a.y - ddzb.d(this.a)) + this.j.getHeight()) - this.h.getHeight();
        this.h.setTranslationX(i);
        this.h.setTranslationY(d);
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.j.getWidth();
        }
        Point a2 = ddzc.a(this.j);
        int c = cskf.c((a2.x + (this.j.getWidth() / 2)) - (this.i.getWidth() / 2), this.l, (ddzd.b(this.a).x - this.i.getWidth()) - this.l);
        int d2 = (((a2.y - ddzb.d(this.a)) + this.j.getHeight()) - this.h.getHeight()) - this.i.getHeight();
        this.i.setTranslationX(c);
        this.i.setTranslationY(d2);
    }

    public final boolean b() {
        return this.j != null && this.i.getHeight() > 0 && this.h.getHeight() > 0;
    }
}
