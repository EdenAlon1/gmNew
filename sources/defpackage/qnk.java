package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qnk implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        qnl qnlVar = (qnl) obj;
        qnl qnlVar2 = (qnl) obj2;
        return enem.b.b(qnlVar.getPref(), qnlVar2.getPref()).b(qnlVar.getAppearanceOrder(), qnlVar2.getAppearanceOrder()).a();
    }
}
