package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dybq {
    public final enhk a;
    public final Executor b;
    public final emxc c;

    public dybq(dybp dybpVar) {
        this.a = dybpVar.a.c();
        this.b = dybpVar.b;
        this.c = dybpVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [dwqy, java.lang.Object] */
    public final dwro a(dwro dwroVar) {
        if (this.c.g()) {
            ?? c = this.c.c();
            dwot t = c.t();
            String str = dwroVar.f;
            str.getClass();
            eyhm eyhmVar = t.b;
            long longValue = eyhmVar.containsKey(str) ? ((Long) eyhmVar.get(str)).longValue() : 0L;
            if (longValue > 0) {
                dwrm dwrmVar = (dwrm) dwroVar.toBuilder();
                dwrmVar.copyOnWrite();
                dwro dwroVar2 = (dwro) dwrmVar.instance;
                dwroVar2.b |= 4096;
                dwroVar2.h = longValue;
                dwroVar = (dwro) dwrmVar.build();
            } else {
                dwot t2 = c.t();
                String str2 = dwroVar.e;
                str2.getClass();
                eyhm eyhmVar2 = t2.b;
                long longValue2 = eyhmVar2.containsKey(str2) ? ((Long) eyhmVar2.get(str2)).longValue() : 0L;
                if (longValue2 > 0) {
                    dwrm dwrmVar2 = (dwrm) dwroVar.toBuilder();
                    dwrmVar2.copyOnWrite();
                    dwro dwroVar3 = (dwro) dwrmVar2.instance;
                    dwroVar3.b |= 4096;
                    dwroVar3.h = longValue2;
                    dwroVar = (dwro) dwrmVar2.build();
                }
            }
        }
        dwrm dwrmVar3 = (dwrm) dwroVar.toBuilder();
        dwrmVar3.copyOnWrite();
        dwro dwroVar4 = (dwro) dwrmVar3.instance;
        dwroVar4.c = 1;
        dwroVar4.b = 1 | dwroVar4.b;
        return (dwro) dwrmVar3.build();
    }

    public final ListenableFuture b(emxc emxcVar, ezib ezibVar) {
        if (this.a.containsKey(ezibVar)) {
            return ((dxzx) this.a.get(ezibVar)).a(emxcVar);
        }
        int i = engw.d;
        return erqt.i(enou.a);
    }
}
