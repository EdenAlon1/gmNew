package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzy implements Comparator {
    public static final hzy a = new hzy();

    private hzy() {
    }

    private static final hne a(iui iuiVar) {
        hne hneVar = new hne(new iui[16]);
        while (iuiVar != null) {
            hneVar.f(0, iuiVar);
            iuiVar = iuiVar.u();
        }
        return hneVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        FocusTargetNode focusTargetNode = (FocusTargetNode) obj;
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) obj2;
        int i = 0;
        if (!hzw.d(focusTargetNode) || !hzw.d(focusTargetNode2)) {
            if (hzw.d(focusTargetNode)) {
                return -1;
            }
            return hzw.d(focusTargetNode2) ? 1 : 0;
        }
        iui d = isx.d(focusTargetNode);
        iui d2 = isx.d(focusTargetNode2);
        if (ffkj.e(d, d2)) {
            return 0;
        }
        hne a2 = a(d);
        hne a3 = a(d2);
        int min = Math.min(a2.b - 1, a3.b - 1);
        if (min >= 0) {
            while (ffkj.e(a2.a[i], a3.a[i])) {
                if (i != min) {
                    i++;
                }
            }
            return ffkj.a(((iui) a2.a[i]).o(), ((iui) a3.a[i]).o());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
