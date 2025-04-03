package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iu {
    public final ir a;
    private final int b;

    public iu(Context context) {
        this(context, iv.a(context, 0));
    }

    public final iv a() {
        iv create = create();
        create.show();
        return create;
    }

    public final void b(Drawable drawable) {
        this.a.c = drawable;
    }

    public final void c(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public iv create() {
        ListAdapter itVar;
        iv ivVar = new iv(this.a.a, this.b);
        AlertController alertController = ivVar.a;
        ir irVar = this.a;
        View view = irVar.e;
        if (view != null) {
            alertController.y = view;
        } else {
            CharSequence charSequence = irVar.d;
            if (charSequence != null) {
                alertController.a(charSequence);
            }
            Drawable drawable = irVar.c;
            if (drawable != null) {
                alertController.u = drawable;
                alertController.t = 0;
                ImageView imageView = alertController.v;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    alertController.v.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = irVar.f;
        if (charSequence2 != null) {
            alertController.e = charSequence2;
            TextView textView = alertController.x;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = irVar.g;
        if (charSequence3 != null) {
            alertController.f(-1, charSequence3, irVar.h);
        }
        CharSequence charSequence4 = irVar.i;
        if (charSequence4 != null) {
            alertController.f(-2, charSequence4, irVar.j);
        }
        CharSequence charSequence5 = irVar.k;
        if (charSequence5 != null) {
            alertController.f(-3, charSequence5, irVar.l);
        }
        if (irVar.q != null || irVar.r != null) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) irVar.b.inflate(alertController.D, (ViewGroup) null);
            if (irVar.v) {
                itVar = new io(irVar, irVar.a, alertController.E, irVar.q, recycleListView);
            } else {
                int i = irVar.w ? alertController.F : alertController.G;
                ListAdapter listAdapter = irVar.r;
                itVar = listAdapter != null ? listAdapter : new it(irVar.a, i, irVar.q);
            }
            alertController.z = itVar;
            alertController.A = irVar.x;
            if (irVar.s != null) {
                recycleListView.setOnItemClickListener(new ip(irVar, alertController));
            } else if (irVar.y != null) {
                recycleListView.setOnItemClickListener(new iq(irVar, recycleListView, alertController));
            }
            if (irVar.w) {
                recycleListView.setChoiceMode(1);
            } else if (irVar.v) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f = recycleListView;
        }
        View view2 = irVar.t;
        if (view2 != null) {
            alertController.b(view2);
        }
        ivVar.setCancelable(this.a.m);
        if (this.a.m) {
            ivVar.setCanceledOnTouchOutside(true);
        }
        ivVar.setOnCancelListener(this.a.n);
        ivVar.setOnDismissListener(this.a.o);
        DialogInterface.OnKeyListener onKeyListener = this.a.p;
        if (onKeyListener != null) {
            ivVar.setOnKeyListener(onKeyListener);
        }
        return ivVar;
    }

    public final void d(int i, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.k = irVar.a.getText(i);
        irVar.l = onClickListener;
    }

    public final void e(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.r = listAdapter;
        irVar.s = onClickListener;
        irVar.x = i;
        irVar.w = true;
    }

    public final void f(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.q = charSequenceArr;
        irVar.s = onClickListener;
        irVar.x = i;
        irVar.w = true;
    }

    public final void g(int i) {
        ir irVar = this.a;
        irVar.d = irVar.a.getText(i);
    }

    public Context getContext() {
        return this.a.a;
    }

    public final void h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.i = charSequence;
        irVar.j = onClickListener;
    }

    public final void i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.g = charSequence;
        irVar.h = onClickListener;
    }

    public iu setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.i = irVar.a.getText(i);
        irVar.j = onClickListener;
        return this;
    }

    public iu setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.g = irVar.a.getText(i);
        irVar.h = onClickListener;
        return this;
    }

    public iu setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public iu setView(View view) {
        this.a.t = view;
        return this;
    }

    public iu(Context context, int i) {
        this.a = new ir(new ContextThemeWrapper(context, iv.a(context, i)));
        this.b = i;
    }
}
