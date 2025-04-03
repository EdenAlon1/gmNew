package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lot extends loo {
    public final los a;
    private final lkr b;

    public lot(lkr lkrVar, lmx lmxVar) {
        this.b = lkrVar;
        this.a = (los) new lmw(lmxVar, los.a).a(los.class);
    }

    public static boolean e(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    @Override // defpackage.loo
    public final void b(int i) {
        if (this.a.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (e(2)) {
            Log.v("LoaderManager", "destroyLoader in " + this + " of " + i);
        }
        lop a = this.a.a(i);
        if (a != null) {
            a.c();
            cpo cpoVar = this.a.b;
            int a2 = cpu.a(cpoVar.b, cpoVar.d, i);
            if (a2 >= 0) {
                Object[] objArr = cpoVar.c;
                Object obj = objArr[a2];
                Object obj2 = cpp.a;
                if (obj != obj2) {
                    objArr[a2] = obj2;
                    cpoVar.a = true;
                }
            }
        }
    }

    @Override // defpackage.loo
    public final void c(int i, Bundle bundle, lon lonVar) {
        if (this.a.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        lop a = this.a.a(i);
        if (e(2)) {
            Log.v("LoaderManager", a.j(bundle, this, "initLoader in ", ": args="));
        }
        if (a != null) {
            if (e(3)) {
                Objects.toString(a);
                Log.d("LoaderManager", "  Re-using existing loader ".concat(a.toString()));
            }
            a.p(this.b, lonVar);
            return;
        }
        try {
            this.a.c = true;
            lox a2 = lonVar.a(i, bundle);
            if (a2 == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (a2.getClass().isMemberClass() && !Modifier.isStatic(a2.getClass().getModifiers())) {
                throw new IllegalArgumentException(a.n(a2, "Object returned from onCreateLoader must not be a non-static inner member class: "));
            }
            lop lopVar = new lop(i, bundle, a2);
            if (e(3)) {
                Log.d("LoaderManager", a.n(lopVar, "  Created new loader "));
            }
            this.a.b.f(i, lopVar);
            this.a.b();
            lopVar.p(this.b, lonVar);
        } catch (Throwable th) {
            this.a.b();
            throw th;
        }
    }

    @Override // defpackage.loo
    @Deprecated
    public final void d(String str, PrintWriter printWriter) {
        los losVar = this.a;
        if (losVar.b.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            for (int i = 0; i < losVar.b.c(); i++) {
                String concat = str.concat("    ");
                lop lopVar = (lop) losVar.b.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(losVar.b.b(i));
                printWriter.print(": ");
                printWriter.println(lopVar.toString());
                printWriter.print(concat);
                printWriter.print("mId=");
                printWriter.print(lopVar.a);
                printWriter.print(" mArgs=");
                printWriter.println(lopVar.h);
                printWriter.print(concat);
                printWriter.print("mLoader=");
                printWriter.println(lopVar.i);
                lopVar.i.g(concat.concat("  "), printWriter);
                if (lopVar.j != null) {
                    printWriter.print(concat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(lopVar.j);
                    loq loqVar = lopVar.j;
                    printWriter.print(concat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(loqVar.c);
                }
                printWriter.print(concat);
                printWriter.print("mData=");
                lox loxVar = lopVar.i;
                printWriter.println(lox.r(lopVar.a()));
                printWriter.print(concat);
                printWriter.print("mStarted=");
                printWriter.println(lopVar.n());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.b.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.b)));
        sb.append("}}");
        return sb.toString();
    }
}
