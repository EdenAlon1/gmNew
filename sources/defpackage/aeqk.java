package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aeqk {
    public aeqn a;
    protected aese b;

    public static final String f(Context context, int i, int i2) {
        if (true == ((Boolean) cjja.c.e()).booleanValue()) {
            i = i2;
        }
        String string = context.getString(i);
        string.getClass();
        return string;
    }

    protected abstract aeqn a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, ffji ffjiVar);

    protected abstract aesa b();

    public final aeqn c() {
        aeqn aeqnVar = this.a;
        if (aeqnVar != null) {
            return aeqnVar;
        }
        ffkj.c("binding");
        return null;
    }

    protected final void d(final aerw aerwVar) {
        aese aeseVar = this.b;
        if (aeseVar == null) {
            ffkj.c("eventLogger");
            aeseVar = null;
        }
        final aesa b = b();
        aeseVar.o(new Supplier() { // from class: aesb
            @Override // java.util.function.Supplier
            public final Object get() {
                eqca eqcaVar = (eqca) eqcb.a.createBuilder();
                eqcaVar.getClass();
                aerw aerwVar2 = aerwVar;
                aesa aesaVar = aesa.this;
                if (aesaVar instanceof aerz) {
                    eqch eqchVar = (eqch) eqci.a.createBuilder();
                    eqchVar.getClass();
                    int a = aerm.a(aerwVar2);
                    eqchVar.copyOnWrite();
                    eqci eqciVar = (eqci) eqchVar.instance;
                    eqciVar.c = a - 1;
                    eqciVar.b |= 1;
                    eyfy build = eqchVar.build();
                    build.getClass();
                    eqcaVar.copyOnWrite();
                    eqcb eqcbVar = (eqcb) eqcaVar.instance;
                    eqcbVar.c = (eqci) build;
                    eqcbVar.b = 1;
                } else if (aesaVar instanceof aerx) {
                    eqcc eqccVar = (eqcc) eqcd.a.createBuilder();
                    eqccVar.getClass();
                    int a2 = aerm.a(aerwVar2);
                    eqccVar.copyOnWrite();
                    eqcd eqcdVar = (eqcd) eqccVar.instance;
                    eqcdVar.c = a2 - 1;
                    eqcdVar.b |= 1;
                    drsq drsqVar = ((aerx) aesaVar).a;
                    eqccVar.copyOnWrite();
                    eqcd eqcdVar2 = (eqcd) eqccVar.instance;
                    eqcdVar2.d = drsqVar.e;
                    eqcdVar2.b |= 2;
                    eyfy build2 = eqccVar.build();
                    build2.getClass();
                    eqcaVar.copyOnWrite();
                    eqcb eqcbVar2 = (eqcb) eqcaVar.instance;
                    eqcbVar2.c = (eqcd) build2;
                    eqcbVar2.b = 2;
                } else {
                    if (!(aesaVar instanceof aery)) {
                        throw new ffcd();
                    }
                    eqcf eqcfVar = (eqcf) eqcg.a.createBuilder();
                    eqcfVar.getClass();
                    int a3 = aerm.a(aerwVar2);
                    eqcfVar.copyOnWrite();
                    eqcg eqcgVar = (eqcg) eqcfVar.instance;
                    eqcgVar.c = a3 - 1;
                    eqcgVar.b |= 1;
                    eyfy build3 = eqcfVar.build();
                    build3.getClass();
                    eqcaVar.copyOnWrite();
                    eqcb eqcbVar3 = (eqcb) eqcaVar.instance;
                    eqcbVar3.c = (eqcg) build3;
                    eqcbVar3.b = 3;
                }
                eyfy build4 = eqcaVar.build();
                build4.getClass();
                return (eqcb) build4;
            }
        });
    }

    public final void e() {
        d(aert.a);
    }
}
