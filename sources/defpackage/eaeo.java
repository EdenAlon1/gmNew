package defpackage;

import java.io.File;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaeo {
    public final String a;
    public final File b;
    public final String c;
    public final eaez d;
    final boolean f;
    final boolean g;
    public final dxbf k;
    public final efdi l;
    private eaen n;
    public final enkg e = new enct();
    int h = 0;
    private boolean m = false;
    public eaem i = null;
    public int j = -1;

    public eaeo(eaez eaezVar, String str, File file, String str2, dxbf dxbfVar, efdi efdiVar) {
        this.n = eaen.WIFI_ONLY;
        this.a = str;
        this.b = file;
        this.c = str2;
        this.k = dxbfVar;
        this.d = eaezVar;
        this.l = efdiVar;
        boolean b = eaej.b(str);
        this.f = b;
        boolean f = f(str);
        this.g = f;
        if (f || b) {
            this.n = eaen.NONE;
        }
    }

    public static boolean f(String str) {
        return str.startsWith("file:");
    }

    public final synchronized eaen a() {
        return this.n;
    }

    final synchronized void b() {
    }

    final synchronized void c() {
    }

    final synchronized void d() {
        this.m = true;
    }

    public final synchronized boolean e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eaeo)) {
            return false;
        }
        eaeo eaeoVar = (eaeo) obj;
        return emxb.a(this.a, eaeoVar.a) && emxb.a(this.b, eaeoVar.b) && emxb.a(this.c, eaeoVar.c) && emxb.a(this.n, eaeoVar.n) && this.m == eaeoVar.m;
    }

    public final void g(eaen eaenVar) {
        if (this.g || this.f) {
            return;
        }
        this.n = eaenVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.n, Boolean.valueOf(this.m)});
    }

    public final String toString() {
        emwz a = emxa.a(eaeo.class);
        a.b("", this.a);
        a.b("targetDirectory", this.b);
        a.b("fileName", this.c);
        a.b("requiredConnectivity", this.n);
        a.h("canceled", this.m);
        return a.toString();
    }
}
