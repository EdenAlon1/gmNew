package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itb implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        iui iuiVar = (iui) obj;
        iui iuiVar2 = (iui) obj2;
        int a = ffkj.a(iuiVar.n, iuiVar2.n);
        return a != 0 ? a : ffkj.a(iuiVar.hashCode(), iuiVar2.hashCode());
    }
}
