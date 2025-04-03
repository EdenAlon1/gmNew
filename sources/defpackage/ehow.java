package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehow {
    public static final ehoh a = new ehos(0.5f);
    public final ehoi b;
    public final ehoi c;
    public final ehoi d;
    public final ehoi e;
    public final ehoh f;
    public final ehoh g;
    public final ehoh h;
    public final ehoh i;
    final ehok j;
    final ehok k;
    final ehok l;
    final ehok m;

    public ehow() {
        this.b = new ehot();
        this.c = new ehot();
        this.d = new ehot();
        this.e = new ehot();
        this.f = new ehoe(0.0f);
        this.g = new ehoe(0.0f);
        this.h = new ehoe(0.0f);
        this.i = new ehoe(0.0f);
        this.j = new ehok();
        this.k = new ehok();
        this.l = new ehok();
        this.m = new ehok();
    }

    public static ehoh a(TypedArray typedArray, int i, ehoh ehohVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            if (peekValue.type == 5) {
                return new ehoe(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (peekValue.type == 6) {
                return new ehos(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return ehohVar;
    }

    public static ehou b(Context context, int i, int i2) {
        return i(context, i, i2, new ehoe(0.0f));
    }

    public static ehou c(Context context, AttributeSet attributeSet, int i, int i2, ehoh ehohVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehor.a, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return i(context, resourceId, resourceId2, ehohVar);
    }

    public static ehou h(Context context, AttributeSet attributeSet, int i, int i2) {
        return c(context, attributeSet, i, i2, new ehoe(0.0f));
    }

    private static ehou i(Context context, int i, int i2, ehoh ehohVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ehor.b);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            ehoh a2 = a(obtainStyledAttributes, 5, ehohVar);
            ehoh a3 = a(obtainStyledAttributes, 8, a2);
            ehoh a4 = a(obtainStyledAttributes, 9, a2);
            ehoh a5 = a(obtainStyledAttributes, 7, a2);
            ehoh a6 = a(obtainStyledAttributes, 6, a2);
            ehou ehouVar = new ehou();
            ehouVar.e(ehoq.a(i4));
            ehouVar.e = a3;
            ehouVar.g(ehoq.a(i5));
            ehouVar.f = a4;
            ehouVar.c(ehoq.a(i6));
            ehouVar.g = a5;
            ehouVar.a(ehoq.a(i7));
            ehouVar.h = a6;
            return ehouVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final ehow d(float f) {
        ehou ehouVar = new ehou(this);
        ehouVar.i(f);
        return new ehow(ehouVar);
    }

    public final ehow e(ehov ehovVar) {
        ehou ehouVar = new ehou(this);
        ehouVar.e = ehovVar.a(this.f);
        ehouVar.f = ehovVar.a(this.g);
        ehouVar.h = ehovVar.a(this.i);
        ehouVar.g = ehovVar.a(this.h);
        return new ehow(ehouVar);
    }

    public final boolean f() {
        return (this.c instanceof ehot) && (this.b instanceof ehot) && (this.d instanceof ehot) && (this.e instanceof ehot);
    }

    public final boolean g(RectF rectF) {
        boolean z = this.m.getClass().equals(ehok.class) && this.k.getClass().equals(ehok.class) && this.j.getClass().equals(ehok.class) && this.l.getClass().equals(ehok.class);
        float a2 = this.f.a(rectF);
        return z && ((this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0 && (this.i.a(rectF) > a2 ? 1 : (this.i.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0) && f();
    }

    public final String toString() {
        ehoh ehohVar = this.i;
        ehoh ehohVar2 = this.h;
        ehoh ehohVar3 = this.g;
        return "[" + String.valueOf(this.f) + ", " + String.valueOf(ehohVar3) + ", " + String.valueOf(ehohVar2) + ", " + String.valueOf(ehohVar) + "]";
    }

    public ehow(ehou ehouVar) {
        this.b = ehouVar.a;
        this.c = ehouVar.b;
        this.d = ehouVar.c;
        this.e = ehouVar.d;
        this.f = ehouVar.e;
        this.g = ehouVar.f;
        this.h = ehouVar.g;
        this.i = ehouVar.h;
        this.j = ehouVar.i;
        this.k = ehouVar.j;
        this.l = ehouVar.k;
        this.m = ehouVar.l;
    }
}
