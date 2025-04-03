package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzn extends dvxi {
    public final dvwa a;
    private final dvwi b;

    public dvzn(dvwi dvwiVar, dvwa dvwaVar) {
        this.b = dvwiVar;
        this.a = dvwaVar;
    }

    @Override // defpackage.dvxi
    public final void b(final dvxh dvxhVar, final dvxe dvxeVar) {
        this.b.c(new dvwh() { // from class: dvzm
            @Override // defpackage.dvwh
            public final List a() {
                dvxe dvxeVar2 = dvxeVar;
                erhm a = dvvx.a();
                emxf.m(dvxeVar2 != null, "View is not instrumented.");
                dvzc dvzcVar = dvxeVar2.e;
                if (!dvzcVar.a.isEmpty()) {
                    if (Log.isLoggable("GIL", 2)) {
                        Log.v("GIL", "Interaction: ".concat(String.valueOf(String.valueOf(dvxeVar2))));
                    }
                    Iterator it = dvzcVar.a.iterator();
                    while (it.hasNext()) {
                        ((dvyz) it.next()).f();
                    }
                }
                emxf.r(dvxeVar2.f(), "VE is not impressed: %s {attached=%s}", dvxeVar2, Boolean.valueOf(dvxeVar2.f.o()));
                emxf.p(dvxeVar2.h() == 1, "VE is not visible: %s", dvxeVar2);
                dvxh dvxhVar2 = dvxhVar;
                dvzn dvznVar = dvzn.this;
                ArrayList arrayList = new ArrayList();
                dvzd.a(dvxeVar2, arrayList);
                return engw.r(new dwaa(a, arrayList, dvxhVar2, dvznVar.a.a(), false));
            }
        });
    }
}
