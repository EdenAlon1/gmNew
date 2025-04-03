package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzq implements lsg {
    public static final /* synthetic */ int a = 0;
    private static final emyl b = emys.a(new emyl() { // from class: mzp
        @Override // defpackage.emyl
        public final Object get() {
            int i = mzq.a;
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object invoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                lti.f(invoke);
                return (lsg) invoke;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    });

    @Override // defpackage.lsg
    public final lsi a(Context context, lpr lprVar, lpo lpoVar, boolean z, Executor executor, lsh lshVar) {
        return ((lsg) b.get()).a(context, lprVar, lpoVar, z, executor, lshVar);
    }
}
