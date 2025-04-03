package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqm {
    private static igz a;

    public static final igz a() {
        igz igzVar = a;
        if (igzVar != null) {
            return igzVar;
        }
        igx igxVar = new igx("Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = iii.a;
        idl idlVar = new idl(ibw.a);
        ArrayList arrayList = new ArrayList(32);
        iha.i(20.0f, 11.0f, arrayList);
        iha.e(7.83f, arrayList);
        iha.h(5.59f, -5.59f, arrayList);
        iha.g(12.0f, 4.0f, arrayList);
        iha.h(-8.0f, 8.0f, arrayList);
        iha.h(8.0f, 8.0f, arrayList);
        iha.h(1.41f, -1.41f, arrayList);
        iha.g(7.83f, 13.0f, arrayList);
        iha.e(20.0f, arrayList);
        iha.m(-2.0f, arrayList);
        iha.b(arrayList);
        igxVar.c(arrayList, 0, "", idlVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
        igz a2 = igxVar.a();
        a = a2;
        a2.getClass();
        return a2;
    }
}
