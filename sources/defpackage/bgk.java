package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgk {
    private static final List i = Arrays.asList(1, 5, 3);
    public final List a;
    public final bgh b;
    public final List c;
    public final List d;
    public final List e;
    public final bge f;
    public final bdk g;
    public final InputConfiguration h;

    public bgk(List list, List list2, List list3, List list4, bdk bdkVar, bge bgeVar, InputConfiguration inputConfiguration, bgh bghVar) {
        this.a = list;
        this.c = DesugarCollections.unmodifiableList(list2);
        this.d = DesugarCollections.unmodifiableList(list3);
        this.e = DesugarCollections.unmodifiableList(list4);
        this.f = bgeVar;
        this.g = bdkVar;
        this.h = inputConfiguration;
        this.b = bghVar;
    }

    public static int a(int i2, int i3) {
        List list = i;
        return list.indexOf(Integer.valueOf(i2)) >= list.indexOf(Integer.valueOf(i3)) ? i2 : i3;
    }

    public static bgk d() {
        return new bgk(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new bdi().b(), null, null, null);
    }

    public final int b() {
        return this.g.f;
    }

    public final bdp c() {
        return this.g.e;
    }

    public final List e() {
        return this.g.h;
    }

    public final List f() {
        ArrayList arrayList = new ArrayList();
        for (bgh bghVar : this.a) {
            arrayList.add(bghVar.c());
            Iterator it = bghVar.d().iterator();
            while (it.hasNext()) {
                arrayList.add((bdy) it.next());
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
