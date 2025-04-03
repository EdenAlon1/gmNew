package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeoo implements aeot {
    public final Context a;
    public final String b;
    public float c = 1.0f;
    private final errl d;

    public aeoo(Context context, errl errlVar, String str) {
        this.a = context;
        this.d = errlVar;
        this.b = str;
    }

    @Override // defpackage.aeot
    public final float a() {
        return this.c;
    }

    @Override // defpackage.aeot
    public final Drawable b() {
        final qdb qdbVar = new qdb();
        elfo.g(new Callable() { // from class: aeom
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aeoo aeooVar = aeoo.this;
                return qcq.a(aeooVar.a, aeooVar.b);
            }
        }, this.d).k(axnw.c(new Consumer() { // from class: aeon
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aeoo aeooVar = aeoo.this;
                float f = aeooVar.a.getResources().getDisplayMetrics().density * 48.0f;
                Object obj2 = ((qdh) obj).a;
                if (obj2 != null) {
                    qdbVar.x((qci) obj2);
                    aeooVar.c = f / r4.i.right;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.d);
        return qdbVar;
    }

    @Override // defpackage.aeot
    public final void c(Drawable drawable, int i) {
        ((qdb) drawable).g(new qhq("**"), qdg.a, new qlz(Integer.valueOf(i)));
    }

    @Override // defpackage.aeot
    public final void d(Drawable drawable, float f, boolean z) {
        ((qdb) drawable).t(cskf.a(f, 0.0f, true != z ? 1.0f : 0.6f));
    }
}
