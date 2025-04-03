package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duug extends AbstractList {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList");
    public final int b;
    public final List c;
    public final int[] d;
    public int e;
    private final int[] f;
    private final int g;
    private final int h;

    public duug(engw engwVar, int i, int i2) {
        ArrayList arrayList = new ArrayList(engwVar);
        this.c = arrayList;
        this.g = i;
        this.h = i2;
        int size = arrayList.size();
        this.b = size;
        this.f = new int[size];
        this.d = new int[size];
        e();
        if (engwVar.isEmpty()) {
            ((enrr) a.a(duwj.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "<init>", 44, "ItemViewDataFlatList.java")).q("Initialized with empty categorized sources");
        }
    }

    private final void e() {
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            engw engwVar = (engw) this.c.get(i2);
            int size = engwVar.size();
            this.d[i2] = i;
            int max = Math.max((int) Math.ceil(size / this.h), this.g);
            int i3 = (size == 0 || (size == 1 && (engwVar.get(0) instanceof dutx))) ? (max > 0 ? (max - 1) * this.h : 0) + 2 : (max * this.h) + 1;
            this.f[i2] = i3;
            i += i3;
        }
        this.e = i;
    }

    final int a(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= this.b || i < this.d[i3]) {
                break;
            }
            i2 = i3;
        }
        return i2;
    }

    final int b(int i) {
        if (i < this.b) {
            return this.f[i];
        }
        ((enrr) a.a(duwj.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "getCategorySize", 140, "ItemViewDataFlatList.java")).u("Too large categoryIndex (%s vs %s)", i, this.b);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final duuf get(int i) {
        int[] iArr = this.d;
        int a2 = a(i);
        int i2 = i - iArr[a2];
        if (i2 >= 0) {
            return i2 == 0 ? new durh(a2, 0) : i2 < ((engw) this.c.get(a2)).size() + 1 ? (duuf) ((engw) this.c.get(a2)).get(i2 - 1) : (i2 == 1 && ((engw) this.c.get(a2)).isEmpty()) ? dutx.b : durj.b;
        }
        ((enrr) a.a(duwj.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "get", 89, "ItemViewDataFlatList.java")).u("position (%d) for category (%d) is invalid", i, a2);
        return durj.b;
    }

    final void d(int i, engw engwVar) {
        if (this.b == 0) {
            ((enrr) a.a(duwj.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "updateSourcesByIndex", 50, "ItemViewDataFlatList.java")).q("Couldn't update due to empty categorizes sources");
        } else {
            this.c.set(0, engwVar);
            e();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
