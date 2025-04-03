package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehiv {
    public float c;
    public WeakReference e;
    public ehmu f;
    private float g;
    public final TextPaint a = new TextPaint(1);
    public final ehmv b = new ehit(this);
    public boolean d = true;

    public ehiv(ehiu ehiuVar) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(ehiuVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.g;
        }
        b(str);
        return this.g;
    }

    public final void b(String str) {
        this.g = str == null ? 0.0f : this.a.measureText((CharSequence) str, 0, str.length());
        this.c = str != null ? Math.abs(this.a.getFontMetrics().ascent) : 0.0f;
        this.d = false;
    }

    public final void c(ehmu ehmuVar, Context context) {
        if (this.f != ehmuVar) {
            this.f = ehmuVar;
            if (ehmuVar != null) {
                ehmuVar.d(context, this.a, this.b);
                ehiu ehiuVar = (ehiu) this.e.get();
                if (ehiuVar != null) {
                    this.a.drawableState = ehiuVar.getState();
                }
                ehmuVar.c(context, this.a, this.b);
                this.d = true;
            }
            ehiu ehiuVar2 = (ehiu) this.e.get();
            if (ehiuVar2 != null) {
                ehiuVar2.e();
                ehiuVar2.onStateChange(ehiuVar2.getState());
            }
        }
    }

    public final void e() {
        this.d = true;
    }
}
