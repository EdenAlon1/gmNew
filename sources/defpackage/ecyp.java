package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecyp implements ecyy {
    public final boolean a;
    public final boolean b;
    public final edbj c;
    private final boolean d;
    private final Set e;
    private final edbj f;

    public ecyp(boolean z, boolean z2, boolean z3, Set set, edbj edbjVar, edbj edbjVar2) {
        this.a = z;
        this.b = z2;
        this.d = z3;
        this.e = set;
        this.f = edbjVar;
        this.c = edbjVar2;
    }

    @Override // defpackage.ecyy
    public final Object a(String str, String str2) {
        try {
            return this.f.a(str2);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("PhenotypeCombinedFlags", "Invalid Phenotype flag value for flag ".concat(str), e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eczp b(final ecvo ecvoVar, final String str) {
        eczp eczpVar;
        eczp[] eczpVarArr;
        int length;
        final boolean z = this.d;
        final Set set = this.e;
        final boolean z2 = this.b;
        eczo eczoVar = eczp.a;
        emyl a = emys.a(new emyl() { // from class: eczk
            @Override // defpackage.emyl
            public final Object get() {
                return new eczp(ecvo.this, str, z2, z, set);
            }
        });
        AtomicReference atomicReference = (AtomicReference) ConcurrentMap.EL.computeIfAbsent(eczoVar.a, str, new Function() { // from class: eczl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new AtomicReference();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        loop0: while (true) {
            eczp[] eczpVarArr2 = (eczp[]) atomicReference.get();
            if (eczpVarArr2 == null || (length = eczpVarArr2.length) == 0) {
                eczp eczpVar2 = (eczp) a.get();
                eczpVar = eczpVar2;
                eczpVarArr = new eczp[]{eczpVar2};
            } else {
                eczp eczpVar3 = eczpVarArr2[0];
                if (eczpVar3.e.equals("")) {
                    eczpVar = eczpVar3;
                    eczpVarArr = null;
                } else {
                    eczpVar = (eczp) a.get();
                    eczpVarArr = new eczp[length + 1];
                    eczpVarArr[0] = eczpVar;
                    System.arraycopy(eczpVarArr2, 0, eczpVarArr, 1, length);
                }
            }
            if (eczpVarArr == null) {
                break;
            }
            while (!atomicReference.compareAndSet(eczpVarArr2, eczpVarArr)) {
                if (atomicReference.get() != eczpVarArr2) {
                    break;
                }
            }
            break loop0;
        }
        if (eczpVarArr != null) {
            Context context = ecvoVar.d;
            eczm eczmVar = new eczm(eczoVar);
            eczn ecznVar = new eczn(eczoVar);
            if (edau.a == null) {
                synchronized (edau.class) {
                    if (edau.a == null) {
                        if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                            if (dfyw.c()) {
                                context.registerReceiver(new edau(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                            } else {
                                context.registerReceiver(new edau(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                            }
                        }
                        edau.a = eczmVar;
                        edau.b = ecznVar;
                    }
                }
            }
        }
        boolean z3 = eczpVar.f;
        emxf.f(true, "Package %s cannot be registered both with and without stickyAccountSupport", str);
        return eczpVar;
    }

    @Override // defpackage.ecyy
    public final eczv c(ecvo ecvoVar, String str) {
        ecvo.g();
        if (this.a) {
            str = ecvd.c(ecvoVar.d, str);
        }
        return b(ecvoVar, str).h;
    }
}
