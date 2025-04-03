package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqjn implements cqjl {
    public static final ffbz a = ffca.a(new ffix() { // from class: cqjm
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = cqjn.a;
            return fffi.d((cqkc) cqko.a.a(), (cqkc) cqjt.a.a(), (cqkc) cqjx.a.a(), (cqkc) cqkj.a.a(), (cqkc) cqkj.b.a(), (cqkc) cqkb.b.a());
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:45:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b0  */
    @Override // defpackage.cqjl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cqjj a(defpackage.cqfu r22, java.util.Collection r23) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqjn.a(cqfu, java.util.Collection):cqjj");
    }

    @Override // defpackage.cqjl
    public final cqjk b(cqgj cqgjVar, Collection collection) {
        Object obj;
        cqgjVar.getClass();
        Iterator it = ((Set) a.a()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) ((cqkc) obj).a.a(cqgjVar, collection)).booleanValue()) {
                break;
            }
        }
        cqkc cqkcVar = (cqkc) obj;
        if (cqkcVar == null) {
            return null;
        }
        if (((Boolean) cqkcVar.a.a(cqgjVar, collection)).booleanValue()) {
            return (cqjk) cqkcVar.b.a(cqgjVar, collection);
        }
        Class<?> cls = cqkcVar.getClass();
        int i = fflc.a;
        throw new IllegalStateException("MergeCase " + new ffkb(cls).c() + " is not applicable fornewRequest: " + cqgjVar + " and queuedSyncs " + collection);
    }
}
