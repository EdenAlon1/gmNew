package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class duav {
    public final List a = new ArrayList();

    public static final Iterable at(Iterable iterable) {
        return enjk.f(iterable, new emwl() { // from class: duas
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (obj == null) {
                    return null;
                }
                return obj instanceof Boolean ? true != ((Boolean) obj).booleanValue() ? "0" : "1" : obj instanceof Enum ? Integer.toString(((Enum) obj).ordinal()) : obj.toString();
            }
        });
    }

    public static final Iterable au(int[] iArr) {
        return enkr.g(dtub.p(iArr, Integer.class), new emwl() { // from class: duar
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return String.valueOf((Integer) obj);
            }
        });
    }

    public static final Iterable av(String... strArr) {
        return enkr.g(Arrays.asList(strArr), new emwl() { // from class: duaq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (String) obj;
            }
        });
    }

    public abstract duap a();

    public final void aq(duaw duawVar) {
        this.a.add(duawVar);
    }

    public final void ar(duav... duavVarArr) {
        aq(new dtxf(duavVarArr));
    }

    public final void as(dtzj dtzjVar) {
        aq(new dtvt(dtzjVar));
    }
}
