package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exav extends exbw {
    public Drawable a;
    public exbx b;
    public CharSequence c;
    private int d;
    private int e;
    private int f;
    private CharSequence g;
    private int h;
    private byte i;

    @Override // defpackage.exbw
    public final exby a() {
        CharSequence charSequence;
        exbx exbxVar;
        if (this.i == 15 && (charSequence = this.g) != null && (exbxVar = this.b) != null) {
            return new exaw(this.d, this.e, this.f, charSequence, this.a, exbxVar, this.c, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.i & 1) == 0) {
            sb.append(" itemId");
        }
        if ((this.i & 2) == 0) {
            sb.append(" groupId");
        }
        if ((this.i & 4) == 0) {
            sb.append(" order");
        }
        if (this.g == null) {
            sb.append(" title");
        }
        if (this.b == null) {
            sb.append(" onMenuItemClickListener");
        }
        if ((this.i & 8) == 0) {
            sb.append(" showAsAction");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.exbw
    public final void b(int i) {
        this.e = i;
        this.i = (byte) (this.i | 2);
    }

    @Override // defpackage.exbw
    public final void c(int i) {
        this.d = i;
        this.i = (byte) (this.i | 1);
    }

    @Override // defpackage.exbw
    public final void d(int i) {
        this.f = i;
        this.i = (byte) (this.i | 4);
    }

    @Override // defpackage.exbw
    public final void e(int i) {
        this.h = i;
        this.i = (byte) (this.i | 8);
    }

    @Override // defpackage.exbw
    public final void f(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null title");
        }
        this.g = charSequence;
    }
}
