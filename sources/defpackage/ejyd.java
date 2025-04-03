package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejyd extends ejxx implements ljv {
    private final ejxx a;
    private final ejvw b;
    private final Executor c;
    private final Map d;

    public ejyd(ejxx ejxxVar, eklq eklqVar, ejvw ejvwVar, Executor executor, lkr lkrVar) {
        this.a = ejxxVar;
        this.b = ejvwVar;
        this.c = executor;
        this.d = (Map) eklqVar.b(R.id.result_propagator_map, lkrVar, new ekll() { // from class: ejya
            @Override // defpackage.ekll
            public final Object a() {
                return new cmh();
            }
        }, new eklk() { // from class: ejyb
            @Override // defpackage.eklk
            public final void a(Object obj) {
                cmh cmhVar = (cmh) obj;
                for (ejza ejzaVar : cmhVar.values()) {
                    efbd.c();
                    emxf.l(!ejzaVar.e);
                    ejyz ejyzVar = ejzaVar.b;
                    if (ejyzVar != null) {
                        ejzaVar.a.e(ejyzVar.a, ejyzVar);
                        ejzaVar.b.close();
                        ejzaVar.b = null;
                    }
                    ejzaVar.e = true;
                }
                cmhVar.clear();
            }
        });
        lkrVar.P().c(this);
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        efbd.c();
        for (ejza ejzaVar : this.d.values()) {
            efbd.c();
            ejzaVar.d = false;
        }
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        efbd.c();
        for (ejza ejzaVar : this.d.values()) {
            efbd.c();
            emxf.l(!ejzaVar.e);
            ejzaVar.c = null;
        }
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        efbd.c();
        for (ejza ejzaVar : this.d.values()) {
            efbd.c();
            ejzaVar.d = true;
            ejyz ejyzVar = ejzaVar.b;
            if (ejyzVar != null) {
                ejyzVar.b();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [ejxi, java.lang.Object] */
    @Override // defpackage.ejxx
    public final ejxm i(int i, ejxk ejxkVar, emxc emxcVar) {
        efbd.c();
        Map map = this.d;
        ejxm i2 = this.a.i(i, ejxkVar, emxcVar);
        Integer valueOf = Integer.valueOf(i);
        ejza ejzaVar = (ejza) map.get(valueOf);
        if (ejzaVar == null) {
            ejza ejzaVar2 = new ejza(this.b, this.c);
            this.d.put(valueOf, ejzaVar2);
            if (emxcVar.g()) {
                ejzaVar2.a(emxcVar.c());
            }
            ejzaVar = ejzaVar2;
        }
        efbd.c();
        emxf.l(!ejzaVar.e);
        ejzaVar.c = i2;
        ejyz ejyzVar = ejzaVar.b;
        if (ejyzVar != null) {
            ejyzVar.b();
        }
        return new ejyc(i2, ejzaVar);
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }
}
