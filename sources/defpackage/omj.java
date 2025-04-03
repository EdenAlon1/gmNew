package defpackage;

import android.util.SparseBooleanArray;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omj {
    public static final omh a = new omf();
    public final List b;
    public final List c;
    public final omi f;
    public final SparseBooleanArray e = new SparseBooleanArray();
    public final cpn d = new cpn();

    public omj(List list, List list2) {
        this.b = list;
        this.c = list2;
        int size = list.size();
        omi omiVar = null;
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            omi omiVar2 = (omi) this.b.get(i2);
            int i3 = omiVar2.b;
            omiVar = i3 > i ? omiVar2 : omiVar;
            if (i3 > i) {
                i = i3;
            }
        }
        this.f = omiVar;
    }

    public final omi a(omk omkVar) {
        return (omi) this.d.get(omkVar);
    }
}
