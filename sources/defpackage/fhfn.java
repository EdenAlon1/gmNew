package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhfn {
    private final boolean a;
    private String[] b;
    private String[] c;
    private boolean d;

    public fhfn(fhfo fhfoVar) {
        this.a = fhfoVar.c;
        this.b = fhfoVar.e;
        this.c = fhfoVar.f;
        this.d = fhfoVar.d;
    }

    public final fhfo a() {
        return new fhfo(this.a, this.d, this.b, this.c);
    }

    public final void b(String... strArr) {
        strArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.b = (String[]) strArr.clone();
    }

    @ffbs
    public final void c() {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        this.d = true;
    }

    public final void d(String... strArr) {
        strArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.c = (String[]) strArr.clone();
    }

    public final void e(fhfk... fhfkVarArr) {
        fhfkVarArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fhfkVarArr.length);
        for (fhfk fhfkVar : fhfkVarArr) {
            arrayList.add(fhfkVar.t);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void f(fhhh... fhhhVarArr) {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fhhhVarArr.length);
        for (fhhh fhhhVar : fhhhVarArr) {
            arrayList.add(fhhhVar.f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public fhfn(boolean z) {
        this.a = z;
    }
}
