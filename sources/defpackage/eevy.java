package defpackage;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eevy implements eevs {
    private static void b(eevp eevpVar, Class cls, String str) {
        try {
            try {
                eevpVar.b(cls, Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Failed to instantiate ".concat(str), e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("Failed to instantiate ".concat(str), e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("Failed to instantiate ".concat(str), e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("Failed to instantiate ".concat(str), e4);
            }
        } catch (ClassNotFoundException e5) {
            if (Log.isLoggable("Binder", 5)) {
                Log.w("Binder", "Cannot find ".concat(str), e5);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.eevs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r3, defpackage.eevp r4) {
        /*
            r2 = this;
            java.lang.String r0 = "gen_binder.root.RootModule$Generated"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            eewa r0 = (defpackage.eewa) r0     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            boolean r1 = r4.c     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            java.util.concurrent.CopyOnWriteArrayList r1 = r4.b     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            r1.add(r0)     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            r0.b()     // Catch: java.lang.ClassNotFoundException -> L17 java.lang.InstantiationException -> L5b java.lang.IllegalAccessException -> L64
            goto L38
        L17:
            java.lang.String r0 = "com.google.android.apps.photos.PhotosApplication"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L28
            android.content.Context r3 = r3.getApplicationContext()
            boolean r3 = r0.isInstance(r3)
            defpackage.emxf.l(r3)
        L28:
            java.lang.String r3 = "Binder"
            r0 = 5
            boolean r3 = android.util.Log.isLoggable(r3, r0)
            if (r3 == 0) goto L38
            java.lang.String r3 = "Binder"
            java.lang.String r0 = "To use Binder more efficiently, your android_binary target should include \"//java/com/google/android/libraries/stitch/binder:rootmodule\" in srcs."
            android.util.Log.w(r3, r0)
        L38:
            java.lang.Class<eevw> r3 = defpackage.eevw.class
            java.lang.String r0 = "gen_binder.root.RootActivityModule$Generated$Factory"
            b(r4, r3, r0)
            java.lang.Class<eevz> r3 = defpackage.eevz.class
            java.lang.String r0 = "gen_binder.root.RootFragmentModule$Generated$Factory"
            b(r4, r3, r0)
            monitor-enter(r4)
            eevr r3 = r4.d     // Catch: java.lang.Throwable -> L58
            boolean r3 = r3 instanceof defpackage.eewb     // Catch: java.lang.Throwable -> L58
            if (r3 != 0) goto L4f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L58
            goto L57
        L4f:
            eevu r3 = new eevu     // Catch: java.lang.Throwable -> L58
            r3.<init>()     // Catch: java.lang.Throwable -> L58
            r4.d = r3     // Catch: java.lang.Throwable -> L58
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L58
        L57:
            return
        L58:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L58
            throw r3
        L5b:
            r3 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to instantiate root module gen_binder.root.RootModule$Generated"
            r4.<init>(r0, r3)
            throw r4
        L64:
            r3 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to instantiate root module gen_binder.root.RootModule$Generated"
            r4.<init>(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eevy.a(android.content.Context, eevp):void");
    }
}
