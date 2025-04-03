package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lop extends llg {
    public final int a;
    public final Bundle h;
    public final lox i;
    public loq j;
    private lkr k;

    public lop(int i, Bundle bundle, lox loxVar) {
        this.a = i;
        this.h = bundle;
        this.i = loxVar;
        if (loxVar.i != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        loxVar.i = this;
        loxVar.b = i;
    }

    public final void b() {
        lkr lkrVar = this.k;
        loq loqVar = this.j;
        if (lkrVar == null || loqVar == null) {
            return;
        }
        super.k(loqVar);
        f(lkrVar, loqVar);
    }

    final void c() {
        if (lot.e(3)) {
            toString();
            Log.d("LoaderManager", "  Destroying: ".concat(toString()));
        }
        this.i.h();
        this.i.e = true;
        loq loqVar = this.j;
        if (loqVar != null) {
            k(loqVar);
            if (loqVar.c) {
                if (lot.e(2)) {
                    lox loxVar = loqVar.a;
                    Objects.toString(loxVar);
                    Log.v("LoaderManager", "  Resetting: ".concat(String.valueOf(loxVar)));
                }
                loqVar.b.c(loqVar.a);
            }
        }
        lox loxVar2 = this.i;
        lop lopVar = loxVar2.i;
        if (lopVar == null) {
            throw new IllegalStateException("No listener register");
        }
        if (lopVar != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        loxVar2.i = null;
        loxVar2.l();
        loxVar2.f = true;
        loxVar2.d = false;
        loxVar2.e = false;
        loxVar2.g = false;
        loxVar2.h = false;
    }

    @Override // defpackage.lld
    protected final void h() {
        if (lot.e(2)) {
            toString();
            Log.v("LoaderManager", "  Starting: ".concat(toString()));
        }
        this.i.o();
    }

    @Override // defpackage.lld
    protected final void i() {
        if (lot.e(2)) {
            toString();
            Log.v("LoaderManager", "  Stopping: ".concat(toString()));
        }
        this.i.p();
    }

    @Override // defpackage.lld
    public final void k(llh llhVar) {
        super.k(llhVar);
        this.k = null;
        this.j = null;
    }

    final void p(lkr lkrVar, lon lonVar) {
        loq loqVar = new loq(this.i, lonVar);
        f(lkrVar, loqVar);
        llh llhVar = this.j;
        if (llhVar != null) {
            k(llhVar);
        }
        this.k = lkrVar;
        this.j = loqVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.a);
        sb.append(" : ");
        sb.append(this.i.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.i)));
        sb.append("}}");
        return sb.toString();
    }
}
