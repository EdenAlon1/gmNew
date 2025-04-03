package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import defpackage.koa;
import defpackage.qcd;
import defpackage.qce;
import defpackage.qcg;
import defpackage.qch;
import defpackage.qci;
import defpackage.qcq;
import defpackage.qdb;
import defpackage.qdd;
import defpackage.qdf;
import defpackage.qdg;
import defpackage.qdk;
import defpackage.qdn;
import defpackage.qdo;
import defpackage.qdp;
import defpackage.qhk;
import defpackage.qhq;
import defpackage.qlw;
import defpackage.qlz;
import defpackage.qmb;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final qdd a = new qdd() { // from class: qcb
        @Override // defpackage.qdd
        public final void a(Object obj) {
            Throwable th = (Throwable) obj;
            qdd qddVar = LottieAnimationView.a;
            ThreadLocal threadLocal = qlw.a;
            if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
            qlp.b("Unable to load composition.", th);
        }
    };
    public int b;
    public final qdb c;
    public boolean d;
    private final qdd e;
    private final qdd f;
    private String g;
    private int h;
    private boolean i;
    private boolean j;
    private final Set k;
    private final Set l;
    private qdk m;

    public LottieAnimationView(Context context) {
        super(context);
        this.e = new qdd() { // from class: qbz
            @Override // defpackage.qdd
            public final void a(Object obj) {
                LottieAnimationView.this.h((qci) obj);
            }
        };
        this.f = new qcd(this);
        this.b = 0;
        this.c = new qdb();
        this.i = false;
        this.j = false;
        this.d = true;
        this.k = new HashSet();
        this.l = new HashSet();
        q(null, R.attr.lottieAnimationViewStyle);
    }

    private final void p() {
        qdk qdkVar = this.m;
        if (qdkVar != null) {
            qdkVar.g(this.e);
            this.m.f(this.f);
        }
    }

    private final void q(AttributeSet attributeSet, int i) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, qdn.a, i, 0);
        this.d = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(12);
        boolean hasValue2 = obtainStyledAttributes.hasValue(7);
        boolean hasValue3 = obtainStyledAttributes.hasValue(17);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(12, 0);
            if (resourceId != 0) {
                f(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(7);
            if (string2 != null) {
                g(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(17)) != null) {
            r(this.d ? qcq.l(getContext(), string, "url_".concat(string)) : qcq.l(getContext(), string, null));
        }
        this.b = obtainStyledAttributes.getResourceId(6, 0);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.j = true;
        }
        if (obtainStyledAttributes.getBoolean(10, false)) {
            this.c.v(-1);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            m(obtainStyledAttributes.getInt(15, 1));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            l(obtainStyledAttributes.getInt(14, -1));
        }
        if (obtainStyledAttributes.hasValue(16)) {
            n(obtainStyledAttributes.getFloat(16, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.c.o(obtainStyledAttributes.getBoolean(2, true));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            String string3 = obtainStyledAttributes.getString(4);
            qdb qdbVar = this.c;
            qdbVar.g = string3;
            qhk f = qdbVar.f();
            if (f != null) {
                f.e = string3;
            }
        }
        i(obtainStyledAttributes.getString(9));
        s(obtainStyledAttributes.getFloat(11, 0.0f), obtainStyledAttributes.hasValue(11));
        this.c.j(obtainStyledAttributes.getBoolean(5, false));
        if (obtainStyledAttributes.hasValue(3)) {
            this.c.g(new qhq("**"), qdg.K, new qlz(new qdp(koa.d(getContext(), obtainStyledAttributes.getResourceId(3, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            int i2 = obtainStyledAttributes.getInt(13, qdo.AUTOMATIC.ordinal());
            if (i2 >= qdo.values().length) {
                i2 = qdo.AUTOMATIC.ordinal();
            }
            this.c.u(qdo.values()[i2]);
        }
        this.c.d = obtainStyledAttributes.getBoolean(8, false);
        if (obtainStyledAttributes.hasValue(18)) {
            this.c.b.l = obtainStyledAttributes.getBoolean(18, false);
        }
        obtainStyledAttributes.recycle();
        qdb qdbVar2 = this.c;
        boolean z = qlw.b(getContext()) != 0.0f;
        Boolean.valueOf(z).getClass();
        qdbVar2.c = z;
    }

    private final void r(qdk qdkVar) {
        this.k.add(qch.SET_ANIMATION);
        this.c.i();
        p();
        qdkVar.e(this.e);
        qdkVar.d(this.f);
        this.m = qdkVar;
    }

    private final void s(float f, boolean z) {
        if (z) {
            this.k.add(qch.SET_PROGRESS);
        }
        this.c.t(f);
    }

    public final float a() {
        return this.c.c();
    }

    public final void b(qhq qhqVar, Object obj, qmb qmbVar) {
        this.c.g(qhqVar, obj, new qce(qmbVar));
    }

    public final void c() {
        this.k.add(qch.PLAY_OPTION);
        this.c.h();
    }

    public final void d() {
        this.k.add(qch.PLAY_OPTION);
        this.c.l();
    }

    public final void e() {
        this.k.add(qch.PLAY_OPTION);
        this.c.n();
    }

    public final void f(final int i) {
        this.h = i;
        this.g = null;
        r(isInEditMode() ? new qdk(new Callable() { // from class: qcc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                if (!lottieAnimationView.d) {
                    return qcq.e(lottieAnimationView.getContext(), i2, null);
                }
                Context context = lottieAnimationView.getContext();
                return qcq.e(context, i2, qcq.m(context, i2));
            }
        }, true) : this.d ? qcq.j(getContext(), i) : qcq.k(getContext(), i, null));
    }

    public final void g(final String str) {
        this.g = str;
        this.h = 0;
        r(isInEditMode() ? new qdk(new Callable() { // from class: qca
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                return lottieAnimationView.d ? qcq.a(lottieAnimationView.getContext(), str2) : qcq.b(lottieAnimationView.getContext(), str2, null);
            }
        }, true) : this.d ? qcq.h(getContext(), str) : qcq.i(getContext(), str, null));
    }

    public final void h(qci qciVar) {
        this.c.setCallback(this);
        this.i = true;
        boolean x = this.c.x(qciVar);
        this.i = false;
        if (getDrawable() == this.c) {
            if (!x) {
                return;
            }
        } else if (!x) {
            boolean o = o();
            setImageDrawable(null);
            setImageDrawable(this.c);
            if (o) {
                this.c.n();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((qdf) it.next()).a();
        }
    }

    public final void i(String str) {
        this.c.f = str;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof qdb) {
            if ((((qdb) drawable).k ? qdo.SOFTWARE : qdo.HARDWARE) == qdo.SOFTWARE) {
                this.c.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        qdb qdbVar = this.c;
        if (drawable2 == qdbVar) {
            super.invalidateDrawable(qdbVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j(float f) {
        this.c.s(f);
    }

    public final void k(float f) {
        s(f, true);
    }

    public final void l(int i) {
        this.k.add(qch.SET_REPEAT_COUNT);
        this.c.v(i);
    }

    public final void m(int i) {
        this.k.add(qch.SET_REPEAT_MODE);
        this.c.b.setRepeatMode(i);
    }

    public final void n(float f) {
        this.c.b.c = f;
    }

    public final boolean o() {
        return this.c.w();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.j) {
            return;
        }
        this.c.l();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof qcg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qcg qcgVar = (qcg) parcelable;
        super.onRestoreInstanceState(qcgVar.getSuperState());
        this.g = qcgVar.a;
        if (!this.k.contains(qch.SET_ANIMATION) && !TextUtils.isEmpty(this.g)) {
            g(this.g);
        }
        this.h = qcgVar.b;
        if (!this.k.contains(qch.SET_ANIMATION) && (i = this.h) != 0) {
            f(i);
        }
        if (!this.k.contains(qch.SET_PROGRESS)) {
            s(qcgVar.c, false);
        }
        if (!this.k.contains(qch.PLAY_OPTION) && qcgVar.d) {
            d();
        }
        if (!this.k.contains(qch.SET_IMAGE_ASSETS)) {
            i(qcgVar.e);
        }
        if (!this.k.contains(qch.SET_REPEAT_MODE)) {
            m(qcgVar.f);
        }
        if (this.k.contains(qch.SET_REPEAT_COUNT)) {
            return;
        }
        l(qcgVar.g);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        boolean z;
        qcg qcgVar = new qcg(super.onSaveInstanceState());
        qcgVar.a = this.g;
        qcgVar.b = this.h;
        qcgVar.c = this.c.c();
        qdb qdbVar = this.c;
        if (qdbVar.isVisible()) {
            z = qdbVar.b.k;
        } else {
            int i = qdbVar.m;
            z = i == 2 || i == 3;
        }
        qcgVar.d = z;
        qdb qdbVar2 = this.c;
        qcgVar.e = qdbVar2.f;
        qcgVar.f = qdbVar2.b.getRepeatMode();
        qcgVar.g = this.c.e();
        return qcgVar;
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        p();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        p();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        p();
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        qdb qdbVar;
        if (!this.i && drawable == (qdbVar = this.c) && qdbVar.w()) {
            this.j = false;
            this.c.k();
        } else if (!this.i && (drawable instanceof qdb)) {
            qdb qdbVar2 = (qdb) drawable;
            if (qdbVar2.w()) {
                qdbVar2.k();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new qdd() { // from class: qbz
            @Override // defpackage.qdd
            public final void a(Object obj) {
                LottieAnimationView.this.h((qci) obj);
            }
        };
        this.f = new qcd(this);
        this.b = 0;
        this.c = new qdb();
        this.i = false;
        this.j = false;
        this.d = true;
        this.k = new HashSet();
        this.l = new HashSet();
        q(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new qdd() { // from class: qbz
            @Override // defpackage.qdd
            public final void a(Object obj) {
                LottieAnimationView.this.h((qci) obj);
            }
        };
        this.f = new qcd(this);
        this.b = 0;
        this.c = new qdb();
        this.i = false;
        this.j = false;
        this.d = true;
        this.k = new HashSet();
        this.l = new HashSet();
        q(attributeSet, i);
    }
}
