package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecfn {
    public static engw a(List list, long j, long j2) {
        if (j < 0 && j2 < 0) {
            Stream map = Collection.EL.stream(list).map(new Function() { // from class: ecfi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((ecfm) obj).d();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            return (engw) map.collect(endq.a);
        }
        Iterator it = list.iterator();
        long j3 = 0;
        while (it.hasNext()) {
            j3 += ((ecfm) it.next()).b();
        }
        if (list.size() <= j && j3 <= j2) {
            Stream map2 = Collection.EL.stream(list).map(new Function() { // from class: ecfi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((ecfm) obj).d();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i2 = engw.d;
            return (engw) map2.collect(endq.a);
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        int i3 = engw.d;
        engr engrVar = new engr();
        int size = arrayList.size();
        long j4 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            ecfm ecfmVar = (ecfm) arrayList.get(i5);
            i4++;
            j4 += ecfmVar.b();
            if ((j >= 0 && i4 > j) || (j2 >= 0 && j4 > j2)) {
                break;
            }
            engrVar.h(ecfmVar.d());
        }
        return engrVar.g();
    }
}
