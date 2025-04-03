package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qsf implements emwl {
    final /* synthetic */ qqs a;
    final /* synthetic */ cgzi b;

    public qsf(cgzi cgziVar, qqs qqsVar) {
        this.b = cgziVar;
        this.a = qqsVar;
    }

    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        qsk qskVar = (qsk) obj;
        try {
            cgzi cgziVar = this.b;
            Object obj2 = qskVar.b;
            cgzv cgzvVar = cgziVar.a;
            AtomicReference atomicReference = cgziVar.b;
            eyee eyeeVar = eyee.b;
            eyed eyedVar = new eyed();
            eyee b = ((Bitmap) obj2).compress(cgzvVar.y, ((Integer) cgzv.c.e()).intValue(), eyedVar) ? eyedVar.b() : null;
            if (b != null) {
                atomicReference.set(b);
            }
            return null;
        } finally {
            this.a.l(qskVar.a);
        }
    }
}
