package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfg {
    public static ListenableFuture a(kfd kfdVar) {
        kfb kfbVar = new kfb();
        kff kffVar = new kff(kfbVar);
        kfbVar.b = kffVar;
        kfbVar.a = kfdVar.getClass();
        try {
            Object a = kfdVar.a(kfbVar);
            if (a != null) {
                kfbVar.a = a;
                return kffVar;
            }
        } catch (Exception e) {
            kffVar.a(e);
        }
        return kffVar;
    }
}
