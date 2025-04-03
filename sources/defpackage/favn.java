package defpackage;

import j$.util.Comparator;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class favn {
    public static final /* synthetic */ int a = 0;

    static {
        fauz fauzVar = (fauz) fava.a.createBuilder();
        fauzVar.copyOnWrite();
        ((fava) fauzVar.instance).b = 24;
        fauzVar.copyOnWrite();
        ((fava) fauzVar.instance).c = 0;
        fauzVar.copyOnWrite();
        ((fava) fauzVar.instance).d = 0;
        fauzVar.copyOnWrite();
        ((fava) fauzVar.instance).e = 0;
        Comparator.EL.thenComparingInt(Comparator.EL.thenComparingInt(Comparator.EL.thenComparingInt(Comparator.CC.comparingInt(new ToIntFunction() { // from class: favj
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((fava) obj).b;
            }
        }), new ToIntFunction() { // from class: favk
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((fava) obj).c;
            }
        }), new ToIntFunction() { // from class: favl
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((fava) obj).d;
            }
        }), new ToIntFunction() { // from class: favm
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((fava) obj).e;
            }
        });
    }
}
