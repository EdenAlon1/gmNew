package defpackage;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eftq implements Callable {
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Map map = evqd.a;
        ArrayList arrayList = new ArrayList();
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            Iterator it = ((List) map.get(num)).iterator();
            while (it.hasNext()) {
                String str = ((evpx) it.next()).eW;
                Locale build = new Locale.Builder().setRegion(str).build();
                eftn eftnVar = (eftn) efto.a.createBuilder();
                String displayCountry = build.getDisplayCountry();
                eftnVar.copyOnWrite();
                efto eftoVar = (efto) eftnVar.instance;
                displayCountry.getClass();
                eftoVar.b = displayCountry;
                eftnVar.copyOnWrite();
                efto eftoVar2 = (efto) eftnVar.instance;
                str.getClass();
                eftoVar2.c = str;
                eftnVar.copyOnWrite();
                ((efto) eftnVar.instance).d = intValue;
                arrayList.add((efto) eftnVar.build());
            }
        }
        final Collator collator = Collator.getInstance();
        Collections.sort(arrayList, new Comparator() { // from class: eftp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return collator.compare(((efto) obj).b, ((efto) obj2).b);
            }
        });
        return arrayList;
    }
}
