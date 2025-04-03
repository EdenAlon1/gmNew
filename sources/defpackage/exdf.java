package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exdf {
    public final List a;
    public final List b;
    public final List c;

    public exdf(exdd exddVar, List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(exddVar);
        this.a = new ArrayList();
        this.b = arrayList;
        this.c = list;
    }

    public exdf(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        this.a = list;
        this.b = arrayList;
        this.c = list2;
    }
}
