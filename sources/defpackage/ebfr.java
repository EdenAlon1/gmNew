package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebfr extends ebfn {
    public Drawable a;
    public View.OnClickListener b;
    public ebfq c;
    public lld d;
    private int e;
    private int f;
    private String g;
    private int h;
    private boolean i;
    private ebfm j;
    private emxc k;
    private emxc l;
    private byte m;

    public ebfr() {
        emux emuxVar = emux.a;
        this.k = emuxVar;
        this.l = emuxVar;
    }

    @Override // defpackage.ebfn
    public final ebfp a() {
        String str;
        View.OnClickListener onClickListener;
        ebfm ebfmVar;
        if (this.m == 15 && (str = this.g) != null && (onClickListener = this.b) != null && (ebfmVar = this.j) != null) {
            return new ebfs(this.e, this.a, this.f, str, this.h, onClickListener, this.c, this.d, this.i, ebfmVar, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.m & 1) == 0) {
            sb.append(" id");
        }
        if ((this.m & 2) == 0) {
            sb.append(" iconResId");
        }
        if (this.g == null) {
            sb.append(" label");
        }
        if ((this.m & 4) == 0) {
            sb.append(" veId");
        }
        if (this.b == null) {
            sb.append(" onClickListener");
        }
        if ((this.m & 8) == 0) {
            sb.append(" visibleOnIncognito");
        }
        if (this.j == null) {
            sb.append(" actionType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ebfn
    public final void c(ebfm ebfmVar) {
        if (ebfmVar == null) {
            throw new NullPointerException("Null actionType");
        }
        this.j = ebfmVar;
    }

    @Override // defpackage.ebfn
    public final void d(emxc emxcVar) {
        this.k = emxcVar;
    }

    @Override // defpackage.ebfn
    public final void e(int i) {
        this.f = i;
        this.m = (byte) (this.m | 2);
    }

    @Override // defpackage.ebfn
    public final void f(int i) {
        this.e = i;
        this.m = (byte) (this.m | 1);
    }

    @Override // defpackage.ebfn
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null label");
        }
        this.g = str;
    }

    @Override // defpackage.ebfn
    public final void h(int i) {
        this.h = i;
        this.m = (byte) (this.m | 4);
    }

    @Override // defpackage.ebfn
    public final void i(boolean z) {
        this.i = z;
        this.m = (byte) (this.m | 8);
    }

    public ebfr(ebfp ebfpVar) {
        emux emuxVar = emux.a;
        this.k = emuxVar;
        this.l = emuxVar;
        ebfs ebfsVar = (ebfs) ebfpVar;
        this.e = ebfsVar.a;
        this.a = ebfsVar.b;
        this.f = ebfsVar.c;
        this.g = ebfsVar.d;
        this.h = ebfsVar.e;
        this.b = ebfsVar.f;
        this.c = ebfsVar.g;
        this.d = ebfsVar.h;
        this.i = ebfsVar.i;
        this.j = ebfsVar.j;
        this.k = ebfsVar.k;
        this.l = ebfsVar.l;
        this.m = (byte) 15;
    }
}
