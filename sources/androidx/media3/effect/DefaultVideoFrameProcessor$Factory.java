package androidx.media3.effect;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory;
import defpackage.lpo;
import defpackage.lpr;
import defpackage.lqg;
import defpackage.lsf;
import defpackage.lsg;
import defpackage.lsh;
import defpackage.lvf;
import defpackage.lza;
import defpackage.mac;
import defpackage.mbk;
import defpackage.mdr;
import defpackage.mdt;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DefaultVideoFrameProcessor$Factory implements lsg {
    public final boolean a;
    public final lqg b;
    public final ExecutorService c;
    public final mbk d;
    public final int e;

    /* compiled from: PG */
    public static final class Builder {
        public ExecutorService a;
        public lqg b;
        public mbk c;
        public int d;
        private final boolean e;

        public Builder() {
            this.e = true;
        }

        public DefaultVideoFrameProcessor$Factory build() {
            return new DefaultVideoFrameProcessor$Factory(!this.e, this.b, this.a, this.c, this.d);
        }

        public Builder(DefaultVideoFrameProcessor$Factory defaultVideoFrameProcessor$Factory) {
            this.a = defaultVideoFrameProcessor$Factory.c;
            this.b = defaultVideoFrameProcessor$Factory.b;
            this.c = defaultVideoFrameProcessor$Factory.d;
            this.d = defaultVideoFrameProcessor$Factory.e;
            this.e = !defaultVideoFrameProcessor$Factory.a;
        }
    }

    public DefaultVideoFrameProcessor$Factory(boolean z, lqg lqgVar, ExecutorService executorService, mbk mbkVar, int i) {
        this.a = z;
        this.b = lqgVar;
        this.c = executorService;
        this.d = mbkVar;
        this.e = i;
    }

    @Override // defpackage.lsg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mac a(final Context context, final lpr lprVar, final lpo lpoVar, final boolean z, final Executor executor, final lsh lshVar) {
        ExecutorService executorService = this.c;
        if (executorService == null) {
            executorService = lvf.Q("Effect:DefaultVideoFrameProcessor:GlThread");
        }
        ExecutorService executorService2 = executorService;
        final mdt mdtVar = new mdt(executorService2, this.c == null, new mdr() { // from class: lzz
            @Override // defpackage.mdr
            public final void a(lsf lsfVar) {
                lsh.this.b(lsfVar);
            }
        });
        lqg lqgVar = this.b;
        final boolean z2 = lqgVar == null || this.c == null;
        if (lqgVar == null) {
            lqgVar = new lza();
        }
        final lqg lqgVar2 = lqgVar;
        try {
            return (mac) executorService2.submit(new Callable() { // from class: maa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Pair i;
                    int i2 = mac.l;
                    lqg lqgVar3 = lqgVar2;
                    EGLDisplay h = ltz.h();
                    lpo lpoVar2 = lpoVar;
                    int[] iArr = lpo.i(lpoVar2) ? ltz.b : ltz.a;
                    try {
                        i = mac.i(lqgVar3, h, 3, iArr);
                    } catch (lty unused) {
                        i = mac.i(lqgVar3, h, 2, iArr);
                    }
                    Pair pair = i;
                    DefaultVideoFrameProcessor$Factory defaultVideoFrameProcessor$Factory = DefaultVideoFrameProcessor$Factory.this;
                    boolean z3 = z2;
                    lsh lshVar2 = lshVar;
                    Executor executor2 = executor;
                    mdt mdtVar2 = mdtVar;
                    boolean z4 = z;
                    lpr lprVar2 = lprVar;
                    Context context2 = context;
                    lpo lpoVar3 = new lpo(lpoVar2.c, lpoVar2.d, 1, null, lpoVar2.g, lpoVar2.h);
                    if (true != lpo.i(lpoVar2)) {
                        lpoVar3 = lpoVar2;
                    }
                    return new mac(context2, lqgVar3, z3, h, new mbo(context2, lpoVar3, lqgVar3, mdtVar2, executor2, new lzu(lshVar2), defaultVideoFrameProcessor$Factory.a), mdtVar2, lshVar2, executor2, new max(context2, h, (EGLContext) pair.first, (EGLSurface) pair.second, lpoVar2, mdtVar2, executor2, lshVar2, defaultVideoFrameProcessor$Factory.d, defaultVideoFrameProcessor$Factory.e, z4), z4, lpoVar2, lprVar2);
                }
            }).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new lsf(e);
        } catch (ExecutionException e2) {
            throw new lsf(e2);
        }
    }
}
