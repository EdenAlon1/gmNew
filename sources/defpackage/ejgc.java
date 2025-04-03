package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgc implements eivn, eivo {
    public final effy a;
    public final String b;
    public final eiyk c;
    public final emxc d;

    public ejgc(Context context, effy effyVar, eiyk eiykVar, emxc emxcVar) {
        this.a = effyVar;
        this.b = context.getPackageName();
        this.c = eiykVar;
        this.d = emxcVar;
    }

    @Override // defpackage.eivn, defpackage.eivl
    public final ListenableFuture a(eivr eivrVar) {
        ekzz f = eleg.f("Get Default Account");
        try {
            ListenableFuture d = d();
            f.b(d);
            f.close();
            return d;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.eivn
    public final ListenableFuture b(eisx eisxVar) {
        return erqt.i(null);
    }

    @Override // defpackage.eivn
    public final /* synthetic */ ListenableFuture c(eisx eisxVar) {
        return eivm.a(this, eisxVar);
    }

    public final ListenableFuture d() {
        return erny.f(this.a.a(), eldl.a(new emwl() { // from class: ejfx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ejgf ejgfVar = (ejgf) obj;
                ejgc ejgcVar = ejgc.this;
                String str = ejgcVar.b;
                str.getClass();
                if (!ejgfVar.b.containsKey(str)) {
                    return null;
                }
                String str2 = ejgcVar.b;
                str2.getClass();
                eyhm eyhmVar = ejgfVar.b;
                if (eyhmVar.containsKey(str2)) {
                    return eisx.b(((Integer) eyhmVar.get(str2)).intValue());
                }
                throw new IllegalArgumentException();
            }
        }), erpp.a);
    }
}
