package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.messaging.R;
import defpackage.in;
import defpackage.is;
import defpackage.kb;
import defpackage.kt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AlertController {
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final Handler I;
    public final Context a;
    public final kb b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public ListView f;
    public View g;
    public int h;
    public Button j;
    public CharSequence k;
    public Message l;
    public Button m;
    public CharSequence n;
    public Message o;
    public Button p;
    public CharSequence q;
    public Message r;
    public NestedScrollView s;
    public Drawable u;
    public ImageView v;
    public TextView w;
    public TextView x;
    public View y;
    public ListAdapter z;
    public boolean i = false;
    public int t = 0;
    public int A = -1;
    public final View.OnClickListener J = new in(this);

    /* compiled from: PG */
    public static class RecycleListView extends ListView {
        public final int a;
        public final int b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kt.v);
            this.b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public AlertController(Context context, kb kbVar, Window window) {
        this.a = context;
        this.b = kbVar;
        this.c = window;
        this.I = new is(kbVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, kt.f, R.attr.alertDialogStyle, 0);
        this.B = obtainStyledAttributes.getResourceId(0, 0);
        this.C = obtainStyledAttributes.getResourceId(2, 0);
        this.D = obtainStyledAttributes.getResourceId(4, 0);
        this.E = obtainStyledAttributes.getResourceId(5, 0);
        this.F = obtainStyledAttributes.getResourceId(7, 0);
        this.G = obtainStyledAttributes.getResourceId(3, 0);
        this.H = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        kbVar.g();
    }

    public static boolean c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static final void d(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static final ViewGroup e(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void a(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.c.setTitle(charSequence);
    }

    public final void b(View view) {
        this.g = view;
        this.h = 0;
        this.i = false;
    }

    public final void f(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.I.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.q = charSequence;
            this.r = obtainMessage;
        } else if (i != -2) {
            this.k = charSequence;
            this.l = obtainMessage;
        } else {
            this.n = charSequence;
            this.o = obtainMessage;
        }
    }
}
