package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehon extends Drawable.ConstantState {
    public ehow a;
    ehpo b;
    ehfz c;
    ColorFilter d;
    ColorStateList e;
    ColorStateList f;
    ColorStateList g;
    ColorStateList h;
    PorterDuff.Mode i;
    public Rect j;
    float k;
    public float l;
    float m;
    int n;
    float o;
    float p;
    float q;
    int r;
    int s;
    int t;
    int u;
    boolean v;
    Paint.Style w;

    public ehon(ehon ehonVar) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = PorterDuff.Mode.SRC_IN;
        this.j = null;
        this.k = 1.0f;
        this.l = 1.0f;
        this.n = PrivateKeyType.INVALID;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = Paint.Style.FILL_AND_STROKE;
        this.a = ehonVar.a;
        this.b = ehonVar.b;
        this.c = ehonVar.c;
        this.m = ehonVar.m;
        this.d = ehonVar.d;
        this.e = ehonVar.e;
        this.f = ehonVar.f;
        this.i = ehonVar.i;
        this.h = ehonVar.h;
        this.n = ehonVar.n;
        this.k = ehonVar.k;
        this.t = ehonVar.t;
        this.r = ehonVar.r;
        boolean z = ehonVar.v;
        this.v = false;
        this.l = ehonVar.l;
        this.o = ehonVar.o;
        this.p = ehonVar.p;
        float f = ehonVar.q;
        this.q = 0.0f;
        this.s = ehonVar.s;
        this.u = ehonVar.u;
        ColorStateList colorStateList = ehonVar.g;
        this.g = null;
        this.w = ehonVar.w;
        Rect rect = ehonVar.j;
        if (rect != null) {
            this.j = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        ehop ehopVar = new ehop(this);
        ehopVar.u = true;
        ehopVar.v = true;
        return ehopVar;
    }

    public ehon(ehow ehowVar) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = PorterDuff.Mode.SRC_IN;
        this.j = null;
        this.k = 1.0f;
        this.l = 1.0f;
        this.n = PrivateKeyType.INVALID;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = Paint.Style.FILL_AND_STROKE;
        this.a = ehowVar;
        this.c = null;
    }
}
