package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgb implements eivv {
    final /* synthetic */ ejgc a;

    public ejgb(ejgc ejgcVar) {
        this.a = ejgcVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        final eisx a = eivtVar.a();
        final ejgc ejgcVar = this.a;
        ejjz.c(ejgcVar.a.c(eldl.d(new eroh() { // from class: ejga
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ejgc ejgcVar2 = ejgc.this;
                final ejgf ejgfVar = (ejgf) obj;
                final eisx eisxVar = a;
                if (eisxVar != null) {
                    return erny.f(ejgcVar2.c.c(eisxVar), eldl.a(new emwl() { // from class: ejfy
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            eixn eixnVar = (eixn) obj2;
                            emxf.l(eixnVar.c() == 2);
                            boolean equals = eixnVar.b().k.equals("incognito");
                            ejgf ejgfVar2 = ejgfVar;
                            if (equals) {
                                return ejgfVar2;
                            }
                            eisx eisxVar2 = eisxVar;
                            ejgc ejgcVar3 = ejgc.this;
                            ejgd ejgdVar = (ejgd) ejgfVar2.toBuilder();
                            String str = ejgcVar3.b;
                            int a2 = eisxVar2.a();
                            str.getClass();
                            ejgdVar.copyOnWrite();
                            ((ejgf) ejgdVar.instance).a().put(str, Integer.valueOf(a2));
                            return (ejgf) ejgdVar.build();
                        }
                    }), erpp.a);
                }
                ejgd ejgdVar = (ejgd) ejgfVar.toBuilder();
                ejgdVar.a(ejgcVar2.b);
                return erqt.i((ejgf) ejgdVar.build());
            }
        }), erpp.a), "Failed to set default account.", new Object[0]);
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
    }
}
