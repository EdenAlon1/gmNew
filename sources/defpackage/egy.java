package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egy {
    public final efr a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final List g;
    public int h;
    private List i;

    public egy(efr efrVar) {
        this.a = efrVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new egv());
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.i = ffel.a;
    }

    public final int a(int i) {
        if (b() <= 0) {
            return 0;
        }
        if (i >= b()) {
            dwv.c("ItemIndex > total count");
        }
        return i / this.h;
    }

    public final int b() {
        return this.a.c.b;
    }

    public final egx c(int i) {
        List list;
        int i2 = this.h;
        int i3 = i * i2;
        int g = ffmk.g(i2, b() - i3);
        int size = this.i.size();
        int f = ffmk.f(g, 0);
        if (f == size) {
            list = this.i;
        } else {
            ArrayList arrayList = new ArrayList(f);
            for (int i4 = 0; i4 < f; i4++) {
                arrayList.add(new efi());
            }
            this.i = arrayList;
            list = arrayList;
        }
        return new egx(i3, list);
    }
}
