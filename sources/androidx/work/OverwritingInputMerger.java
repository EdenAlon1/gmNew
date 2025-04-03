package androidx.work;

import defpackage.pon;
import defpackage.pot;
import defpackage.ppd;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends ppd {
    @Override // defpackage.ppd
    public final pot a(List list) {
        pon ponVar = new pon();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((pot) it.next()).e());
        }
        ponVar.c(linkedHashMap);
        return ponVar.a();
    }
}
