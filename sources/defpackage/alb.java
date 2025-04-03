package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alb {
    public final boolean a;
    private final apd b;
    private final aqf c;

    public alb(apd apdVar) {
        this.b = apdVar;
        this.c = aqf.b(apdVar);
        int[] iArr = (int[]) apdVar.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int i = 0;
            while (true) {
                if (i >= iArr.length) {
                    break;
                }
                if (iArr[i] == 18) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.a = z;
    }

    private static aua b(aua auaVar, Collection collection, Set set) {
        if (auaVar.h == 1) {
            return null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aua auaVar2 = (aua) it.next();
            ksw.i(auaVar2, "Fully specified DynamicRange cannot be null.");
            int i = auaVar2.h;
            ksw.d(auaVar2.b(), "Fully specified DynamicRange must have fully defined encoding.");
            if (i != 1 && e(auaVar, auaVar2, set)) {
                return auaVar2;
            }
        }
        return null;
    }

    private static void c(Set set, aua auaVar, aqf aqfVar) {
        ksw.d(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set b = aqfVar.a.b(auaVar);
        if (b.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(b);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", auaVar, TextUtils.join("\n  ", b), TextUtils.join("\n  ", hashSet)));
        }
    }

    private static boolean d(aua auaVar, aua auaVar2) {
        ksw.d(auaVar2.b(), "Fully specified range is not actually fully specified.");
        int i = auaVar.h;
        if (i == 2) {
            if (auaVar2.h == 1) {
                return false;
            }
            i = 2;
        }
        if (i != 2 && i != 0 && i != auaVar2.h) {
            return false;
        }
        int i2 = auaVar.i;
        return i2 == 0 || i2 == auaVar2.i;
    }

    private static boolean e(aua auaVar, aua auaVar2, Set set) {
        if (set.contains(auaVar2)) {
            return d(auaVar, auaVar2);
        }
        avw.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", auaVar, auaVar2));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map a(java.util.List r22, java.util.List r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alb.a(java.util.List, java.util.List, java.util.List):java.util.Map");
    }
}
