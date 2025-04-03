package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkz implements qlf {
    public static final qkz a = new qkz();
    private static final qli b = qli.a("c", "v", "i", "o");

    private qkz() {
    }

    @Override // defpackage.qlf
    public final /* bridge */ /* synthetic */ Object a(qlk qlkVar, float f) {
        if (qlkVar.q() == 1) {
            qlkVar.h();
        }
        qlkVar.i();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (qlkVar.o()) {
            int c = qlkVar.c(b);
            if (c == 0) {
                z = qlkVar.p();
            } else if (c == 1) {
                list = qkm.d(qlkVar, f);
            } else if (c == 2) {
                list2 = qkm.d(qlkVar, f);
            } else if (c != 3) {
                qlkVar.m();
                qlkVar.n();
            } else {
                list3 = qkm.d(qlkVar, f);
            }
        }
        qlkVar.k();
        if (qlkVar.q() == 2) {
            qlkVar.j();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new qiv(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = list.size();
        PointF pointF = (PointF) list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) list.get(i);
            int i2 = i - 1;
            arrayList.add(new qhm(qlr.c((PointF) list.get(i2), (PointF) list3.get(i2)), qlr.c(pointF2, (PointF) list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = (PointF) list.get(0);
            int i3 = size - 1;
            arrayList.add(new qhm(qlr.c((PointF) list.get(i3), (PointF) list3.get(i3)), qlr.c(pointF3, (PointF) list2.get(0)), pointF3));
        }
        return new qiv(pointF, z, arrayList);
    }
}
