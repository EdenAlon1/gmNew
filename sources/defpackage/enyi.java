package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyi {
    public final List a;
    public int b;
    private final emwl c;

    public enyi(final List list) {
        emwl emwlVar = new emwl() { // from class: enyh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                List list2 = list;
                enxz enxzVar = (enxz) obj;
                int size = list2.size() - 1;
                int i = 0;
                while (i <= size) {
                    int i2 = (i + size) / 2;
                    int a = ermw.a(((enyg) list2.get(i2)).k(), enxzVar.d);
                    if (a > 0) {
                        size = i2 - 1;
                    } else if (a < 0) {
                        i = i2 + 1;
                    } else {
                        if (i == i2) {
                            return Integer.valueOf(i2);
                        }
                        size = i2;
                    }
                }
                return Integer.valueOf(i);
            }
        };
        this.a = list;
        this.c = emwlVar;
    }

    public final enyg a() {
        return (enyg) this.a.get(this.b);
    }

    public final void b(enxz enxzVar) {
        this.b = ((Integer) this.c.apply(enxzVar)).intValue();
    }

    public final boolean c() {
        return this.b == 0;
    }

    public final boolean d() {
        return this.b == this.a.size();
    }

    public final void e() {
        int i = this.b;
        if (i > 0) {
            this.b = i - 1;
        }
    }
}
