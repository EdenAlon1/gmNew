package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igl extends View {
    public static final /* synthetic */ int h = 0;
    private static final ViewOutlineProvider i = new igk();
    public boolean a;
    public Outline b;
    public boolean c;
    public jzn d;
    public kah e;
    public ffji f;
    public iga g;
    private final ibu j;
    private final ifm k;

    public igl(View view, ibu ibuVar, ifm ifmVar) {
        super(view.getContext());
        this.j = ibuVar;
        this.k = ifmVar;
        setOutlineProvider(i);
        this.c = true;
        this.d = ifp.a;
        this.e = kah.a;
        this.f = igc.a;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        ibu ibuVar = this.j;
        iau iauVar = ibuVar.a;
        Canvas canvas2 = iauVar.a;
        iauVar.a = canvas;
        jzn jznVar = this.d;
        kah kahVar = this.e;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = Float.floatToRawIntBits(width);
        long floatToRawIntBits2 = Float.floatToRawIntBits(height);
        ifm ifmVar = this.k;
        ifl iflVar = ifmVar.b;
        iga igaVar = this.g;
        ffji ffjiVar = this.f;
        jzn c = iflVar.c();
        kah d = ifmVar.b.d();
        ibt b = ifmVar.b.b();
        long a = ifmVar.b.a();
        ifl iflVar2 = ifmVar.b;
        iga igaVar2 = iflVar2.a;
        iflVar2.f(jznVar);
        iflVar2.g(kahVar);
        iflVar2.e(iauVar);
        iflVar2.h((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L));
        iflVar2.a = igaVar;
        iauVar.l();
        try {
            ffjiVar.invoke(ifmVar);
            iauVar.j();
            ifl iflVar3 = ifmVar.b;
            iflVar3.f(c);
            iflVar3.g(d);
            iflVar3.e(b);
            iflVar3.h(a);
            iflVar3.a = igaVar2;
            ibuVar.a.a = canvas2;
            this.a = false;
        } catch (Throwable th) {
            iauVar.j();
            ifl iflVar4 = ifmVar.b;
            iflVar4.f(c);
            iflVar4.g(d);
            iflVar4.e(b);
            iflVar4.h(a);
            iflVar4.a = igaVar2;
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.a) {
            return;
        }
        this.a = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }
}
