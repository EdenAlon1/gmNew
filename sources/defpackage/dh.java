package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dh extends hj {
    public dh(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private final void k(Map map, View view) {
        int[] iArr = kvo.a;
        String f = kvd.f(view);
        if (f != null) {
            map.put(f, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    childAt.getClass();
                    k(map, childAt);
                }
            }
        }
    }

    private static final void l(cmh cmhVar, Collection collection) {
        ffee.u(cmhVar.entrySet(), new dg(collection), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03cb A[LOOP:7: B:80:0x03c5->B:82:0x03cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03e7  */
    /* JADX WARN: Type inference failed for: r27v0, types: [dh, hj] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // defpackage.hj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh.a(java.util.List, boolean):void");
    }
}
