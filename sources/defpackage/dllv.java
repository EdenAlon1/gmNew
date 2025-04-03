package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dllv {
    public final dexc a;
    public final Context b;
    public final dllm c;
    public engw d;
    public final engw e;
    public final enhk f;
    public final dllt g;
    public final boolean h;
    public final boolean i;

    public dllv(dllu dlluVar) {
        this.a = dlluVar.a;
        Context context = dlluVar.b;
        context.getClass();
        this.b = context;
        dllm dllmVar = dlluVar.c;
        dllmVar.getClass();
        this.c = dllmVar;
        this.d = dlluVar.d;
        this.e = dlluVar.e;
        this.f = enhk.j(dlluVar.f);
        this.g = dlluVar.g;
        this.h = dlluVar.h;
        this.i = dlluVar.i;
    }

    public final dllq a(dexf dexfVar) {
        dllq dllqVar = (dllq) this.f.get(dexfVar);
        return dllqVar == null ? new dllq(dexfVar, 2) : dllqVar;
    }

    public final engw b() {
        engw engwVar = this.d;
        if (engwVar != null) {
            return engwVar;
        }
        dlly dllyVar = new dlly(this.b);
        try {
            engw n = engw.n((List) erny.f(dllyVar.a.a(), new emwl() { // from class: dllw
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return ((dlnb) obj).b;
                }
            }, dllyVar.b).get());
            this.d = n;
            return n == null ? enou.a : n;
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalArgumentException("Retrieval of recent fix data failed", e);
        }
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("entry_point", this.a);
        b.b("context", this.b);
        b.b("appDoctorLogger", this.c);
        b.b("recentFixes", this.d);
        b.b("fixesExecutedThisIteration", this.e);
        b.b("fixStatusesExecutedThisIteration", this.f);
        b.b("currentFixer", this.g);
        b.h("processRestartNeeded", this.h);
        b.h("appRestartNeeded", this.i);
        return b.toString();
    }
}
