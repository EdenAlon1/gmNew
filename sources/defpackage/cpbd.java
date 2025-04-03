package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbd {
    public final long a;
    public final ArrayList b;
    public String c;
    public String d;
    public String e;
    public int f;
    public final boolean g;
    public cpay h;

    public cpbd(long j, Collection collection, boolean z) {
        collection.getClass();
        this.a = j;
        this.b = new ArrayList(collection);
        this.f = 0;
        this.g = z;
    }

    public static cpbd a(cpxu cpxuVar, List list, String str, String str2, String str3) {
        cpbd cpbdVar = new cpbd(cpxv.a(cpxuVar), list, false);
        cpbdVar.c = str;
        cpbdVar.d = str2;
        cpbdVar.e = str3;
        cpbdVar.f = 4;
        return cpbdVar;
    }

    public static cpbd b(cpxu cpxuVar, List list, cpay cpayVar) {
        cpbd cpbdVar = new cpbd(cpxv.a(cpxuVar), list, false);
        cpbdVar.h = cpayVar;
        return cpbdVar;
    }

    public final List c() {
        return this.b;
    }
}
