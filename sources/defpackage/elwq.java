package defpackage;

import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elwq {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public boolean c;
    private final Class d;

    public elwq(Class cls) {
        this.d = cls;
    }

    public final elws a() {
        return new elwf(DesugarCollections.unmodifiableList(this.a), this.b, this.c, this.d);
    }

    public final void b(Enum... enumArr) {
        DesugarArrays.stream(enumArr).forEach(new Consumer() { // from class: elwp
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Enum r2 = (Enum) obj;
                r2.getClass();
                elwq.this.a.add(new elwa(r2));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.c = true;
    }
}
