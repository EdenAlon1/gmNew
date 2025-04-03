package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dllu {
    public dexc a;
    public Context b;
    public dllm c;
    public engw d;
    public engw e;
    public final Map f;
    public dllt g;
    public boolean h;
    public boolean i;

    public dllu() {
        this.a = dexc.UNKNOWN;
        int i = engw.d;
        this.e = enou.a;
        this.f = new HashMap();
        this.d = null;
    }

    public final dllv a() {
        emxf.m(this.a != dexc.UNKNOWN, "Entry Point must be set.");
        if (this.c == null) {
            Log.w("AppDoctorFixerContext", "No AppDoctorLogger set.");
            this.c = new dlme();
        }
        return new dllv(this);
    }

    public final void b(dllq dllqVar) {
        this.f.put(dllqVar.a, dllqVar);
    }

    public final void c() {
        this.i = true;
    }

    public final void d(dllp dllpVar, int i) {
        if (this.f.containsKey(dllpVar.a)) {
            int i2 = i - 2;
            b(new dllq(dllpVar.a, i2 != 2 ? i2 != 4 ? 3 : 6 : 5));
        } else {
            throw new IllegalArgumentException("Status of '" + dllpVar.b() + "' cannot be updated since no original status was set.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dllu(dllv dllvVar) {
        this.a = dexc.UNKNOWN;
        int i = engw.d;
        this.e = enou.a;
        this.f = new HashMap();
        this.a = dllvVar.a;
        this.b = dllvVar.b;
        this.c = dllvVar.c;
        this.d = dllvVar.d;
        this.e = dllvVar.e;
        engw g = dllvVar.f.values().g();
        for (int i2 = 0; i2 < g.size(); i2++) {
            dllq dllqVar = (dllq) g.get(i2);
            this.f.put(dllqVar.a, dllqVar);
        }
        this.g = dllvVar.g;
        this.h = dllvVar.h;
        this.i = dllvVar.i;
    }
}
