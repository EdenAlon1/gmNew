package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pgr extends pgs {
    private final Object a;
    private final String b;
    private final String c;
    private final pgw d;
    private final int e;

    public pgr(Object obj, String str, String str2, int i) {
        Collection collection;
        this.a = obj;
        this.b = str;
        this.c = str2;
        this.e = i;
        pgw pgwVar = new pgw(c(obj, str2));
        StackTraceElement[] stackTrace = pgwVar.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length;
        int f = ffmk.f(length - 2, 0);
        if (f < 0) {
            throw new IllegalArgumentException(a.f(f, "Requested element count ", " is less than zero."));
        }
        if (f == 0) {
            collection = ffel.a;
        } else if (f >= length) {
            collection = ffdo.L(stackTrace);
        } else if (f == 1) {
            collection = ffdx.g(stackTrace[length - 1]);
        } else {
            ArrayList arrayList = new ArrayList(f);
            for (int i2 = length - f; i2 < length; i2++) {
                arrayList.add(stackTrace[i2]);
            }
            collection = arrayList;
        }
        pgwVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.d = pgwVar;
    }

    @Override // defpackage.pgs
    public final Object b() {
        int i = this.e - 1;
        if (i == 0) {
            throw this.d;
        }
        if (i != 1) {
            return null;
        }
        Log.d(this.b, c(this.a, this.c));
        return null;
    }

    @Override // defpackage.pgs
    public final pgs a(String str, ffji ffjiVar) {
        return this;
    }
}
