package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csbt {
    public final cryl a;

    public csbt(cryl crylVar) {
        this.a = crylVar;
    }

    public static Optional b(eszz eszzVar, final String str) {
        etao etaoVar = eszzVar.i;
        if (etaoVar == null) {
            etaoVar = etao.a;
        }
        return Collection.EL.stream(etaoVar.b).filter(new Predicate() { // from class: csbs
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((etaq) obj).f.equals(str);
            }
        }).findFirst();
    }

    public final esjh a(eszz eszzVar) {
        Optional b = b(eszzVar, csbj.OBJECT_PAYLOAD_PART_ENCRYPTED_RARELY_CHANGED.d);
        if (b.isEmpty()) {
            return esjh.a;
        }
        eydq eydqVar = ((etaq) b.get()).g;
        if (eydqVar == null) {
            eydqVar = eydq.a;
        }
        esjg esjgVar = (esjg) ((esjh) this.a.a((esij) eyfy.parseFrom(esij.a, eydqVar.c), esjh.a)).toBuilder();
        String str = eszzVar.c;
        esjgVar.copyOnWrite();
        esjh esjhVar = (esjh) esjgVar.instance;
        str.getClass();
        esjhVar.d = str;
        return (esjh) esjgVar.build();
    }
}
