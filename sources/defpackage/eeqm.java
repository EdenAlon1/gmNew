package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import java.lang.ref.WeakReference;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeqm<T> {
    private T a;
    private WeakReference b;
    private boolean c = false;
    private boolean d = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, android.graphics.Paint, java.lang.Object] */
    public final synchronized Object a() {
        if (!this.c) {
            this.c = true;
            Set set = eeqo.a;
            if (efbd.g()) {
                eeqo.a.add(this);
                int i = eeqo.b;
                if (i != -1) {
                    b(i);
                }
            } else {
                efbd.e(new eeqn(this));
            }
        }
        T t = this.a;
        if (t != null) {
            return t;
        }
        WeakReference weakReference = this.b;
        Object obj = weakReference == null ? (T) null : weakReference.get();
        if (obj == 0) {
            eeqm eeqmVar = efub.a;
            obj = (T) new Paint();
            obj.setAntiAlias(true);
            obj.setTextAlign(Paint.Align.CENTER);
            obj.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
            if (this.d) {
                this.a = obj;
                this.b = null;
            } else {
                this.b = new WeakReference(obj);
            }
        }
        return obj;
    }

    final synchronized void b(int i) {
        boolean z = i < 20;
        if (z != this.d) {
            this.d = z;
            if (!z) {
                T t = this.a;
                if (t != null) {
                    this.b = new WeakReference(t);
                    this.a = null;
                }
            } else if (this.a == null) {
                WeakReference weakReference = this.b;
                T t2 = weakReference == null ? null : (T) weakReference.get();
                if (t2 != null) {
                    this.a = t2;
                } else {
                    this.b = null;
                }
            }
        }
    }
}
