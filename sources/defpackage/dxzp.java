package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxzp implements dxxr {
    private final emyl a;
    private final Executor b;

    public dxzp(dxzo dxzoVar) {
        this.b = dxzoVar.b;
        this.a = dxzoVar.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.dxxr
    public final ListenableFuture a(final List list) {
        return elfr.j(elfr.j(this.a.get(), new emwl() { // from class: dxzl
            /* JADX WARN: Code restructure failed: missing block: B:98:0x017f, code lost:
            
                if (r4 <= (r8.h + 2.220446049250313E-16d)) goto L33;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r24) {
                /*
                    Method dump skipped, instructions count: 646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dxzl.apply(java.lang.Object):java.lang.Object");
            }
        }, this.b), new emwl() { // from class: dxzm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                List list2 = (List) obj;
                int i = engw.d;
                engr engrVar = new engr();
                for (dwph dwphVar : list) {
                    Iterator it = emye.d(":").a().g(dwphVar.c).iterator();
                    if (it.hasNext() && list2.contains(it.next())) {
                        engrVar.h(dwphVar);
                    }
                }
                return engrVar.g();
            }
        }, this.b);
    }
}
