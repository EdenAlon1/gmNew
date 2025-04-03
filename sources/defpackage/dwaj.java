package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwaj {
    private final Map a;
    private final eyfc b = eyfc.a();
    private final dvyy c;

    public dwaj(Map map, dvyy dvyyVar) {
        this.a = map;
        this.c = dvyyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(eyft eyftVar, List list, eyhr eyhrVar, List list2) {
        eyfw checkIsLite;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            num.intValue();
            ffbr ffbrVar = (ffbr) this.a.get(num);
            dwai dwaiVar = ffbrVar == null ? null : (dwai) ffbrVar.b();
            if (dwaiVar != null) {
                eyfw b = this.b.b((eyft) eyftVar.getDefaultInstanceForType(), num.intValue());
                if (b == null) {
                    this.c.a(new IllegalStateException("Extension with tag #" + num + " not found. Ensure " + String.valueOf(eyftVar.getClass()) + "is properly extended."));
                } else {
                    checkIsLite = eyfy.checkIsLite(b);
                    eyftVar.b(checkIsLite);
                    Object l = eyftVar.r.l(checkIsLite.d);
                    ListenableFuture a = dwaiVar.a((eyhs) (l == null ? checkIsLite.b : checkIsLite.c(l)));
                    if (dwai.b.equals(a)) {
                        continue;
                    } else if (eyhrVar != null) {
                        try {
                            ((dwah) erqt.q(a)).a(eyhrVar);
                        } catch (ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        list2.add(a);
                    }
                }
            }
        }
    }
}
