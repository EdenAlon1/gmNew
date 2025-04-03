package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iwr implements Comparator {
    public static final iwr a = new iwr();

    private iwr() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        iui iuiVar = (iui) obj;
        iui iuiVar2 = (iui) obj2;
        int a2 = ffkj.a(iuiVar2.n, iuiVar.n);
        return a2 != 0 ? a2 : ffkj.a(iuiVar.hashCode(), iuiVar2.hashCode());
    }
}
