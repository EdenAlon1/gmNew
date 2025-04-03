package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehbv {
    public final MaterialButton a;
    public ehow b;
    public ehpo c;
    public lem d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public Drawable o;
    public boolean r;
    public LayerDrawable t;
    public int u;
    public boolean p = false;
    public boolean q = false;
    public boolean s = true;

    public ehbv(MaterialButton materialButton, ehow ehowVar) {
        this.a = materialButton;
        this.b = ehowVar;
    }

    private final ehop f(boolean z) {
        LayerDrawable layerDrawable = this.t;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (ehop) ((LayerDrawable) ((InsetDrawable) this.t.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final ehop a() {
        return f(false);
    }

    public final ehop b() {
        return f(true);
    }

    public final void c() {
        this.p = true;
        this.a.h(this.l);
        this.a.i(this.k);
    }

    public final void d(ehow ehowVar) {
        this.b = ehowVar;
        this.c = null;
        e();
    }

    public final void e() {
        ehop a = a();
        if (a != null) {
            ehpo ehpoVar = this.c;
            if (ehpoVar != null) {
                a.S(ehpoVar);
            } else {
                a.fy(this.b);
            }
            lem lemVar = this.d;
            if (lemVar != null) {
                a.M(lemVar);
            }
        }
        ehop b = b();
        if (b != null) {
            ehpo ehpoVar2 = this.c;
            if (ehpoVar2 != null) {
                b.S(ehpoVar2);
            } else {
                b.fy(this.b);
            }
            lem lemVar2 = this.d;
            if (lemVar2 != null) {
                b.M(lemVar2);
            }
        }
        LayerDrawable layerDrawable = this.t;
        ehph ehphVar = null;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            ehphVar = this.t.getNumberOfLayers() > 2 ? (ehph) this.t.getDrawable(2) : (ehph) this.t.getDrawable(1);
        }
        if (ehphVar != null) {
            ehphVar.fy(this.b);
            if (ehphVar instanceof ehop) {
                ehop ehopVar = (ehop) ehphVar;
                ehpo ehpoVar3 = this.c;
                if (ehpoVar3 != null) {
                    ehopVar.S(ehpoVar3);
                }
                lem lemVar3 = this.d;
                if (lemVar3 != null) {
                    ehopVar.M(lemVar3);
                }
            }
        }
    }
}
