package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egdh extends egdg {
    private static final enru a = enru.c("com/google/android/libraries/user/profile/photopicker/common/logging/ObakeLoggerImpl");
    private final dfld b;
    private final exel c;
    private final Context d;

    public egdh(Context context, dfld dfldVar, exel exelVar) {
        this.d = context;
        this.b = dfldVar;
        this.c = exelVar;
    }

    private final exem f() {
        exem exemVar = (exem) exen.a.createBuilder();
        exemVar.copyOnWrite();
        exen exenVar = (exen) exemVar.instance;
        exenVar.c = this.c;
        exenVar.b |= 1;
        return exemVar;
    }

    private final void g(exen exenVar) {
        dflc j = this.b.j(exenVar, dtql.b(this.d, new exeo()));
        ((enrr) ((enrr) a.e()).h("com/google/android/libraries/user/profile/photopicker/common/logging/ObakeLoggerImpl", "logObakeExtension", 42, "ObakeLoggerImpl.java")).t("extension=%s", exenVar);
        j.c();
    }

    private static void h(exgc exgcVar) {
        exgg exggVar = exgcVar.d;
        if (exggVar == null) {
            exggVar = exgg.a;
        }
        if ((exggVar.b & 1) == 0) {
            throw new IllegalArgumentException("OperationEntries require an OperationSummary with a set EntryType.");
        }
    }

    @Override // defpackage.egdg
    public final void a(exfn exfnVar) {
        exem f = f();
        exep exepVar = (exep) exeq.a.createBuilder();
        exfj exfjVar = (exfj) exfk.a.createBuilder();
        exfjVar.copyOnWrite();
        exfk exfkVar = (exfk) exfjVar.instance;
        exfkVar.c = 2;
        exfkVar.b |= 1;
        exfjVar.copyOnWrite();
        exfk exfkVar2 = (exfk) exfjVar.instance;
        exfnVar.getClass();
        exfkVar2.f = exfnVar;
        exfkVar2.b |= 8;
        exepVar.copyOnWrite();
        exeq exeqVar = (exeq) exepVar.instance;
        exfk exfkVar3 = (exfk) exfjVar.build();
        exfkVar3.getClass();
        exeqVar.c = exfkVar3;
        exeqVar.b |= 1;
        f.copyOnWrite();
        exen exenVar = (exen) f.instance;
        exeq exeqVar2 = (exeq) exepVar.build();
        exen exenVar2 = exen.a;
        exeqVar2.getClass();
        exenVar.d = exeqVar2;
        exenVar.b |= 2;
        g((exen) f.build());
    }

    @Override // defpackage.egdg
    public final void b(exfs exfsVar) {
        exem f = f();
        exep exepVar = (exep) exeq.a.createBuilder();
        exfj exfjVar = (exfj) exfk.a.createBuilder();
        exfjVar.copyOnWrite();
        exfk exfkVar = (exfk) exfjVar.instance;
        exfkVar.c = 3;
        exfkVar.b |= 1;
        exfjVar.copyOnWrite();
        exfk exfkVar2 = (exfk) exfjVar.instance;
        exfsVar.getClass();
        exfkVar2.g = exfsVar;
        exfkVar2.b |= 16;
        exepVar.copyOnWrite();
        exeq exeqVar = (exeq) exepVar.instance;
        exfk exfkVar3 = (exfk) exfjVar.build();
        exfkVar3.getClass();
        exeqVar.c = exfkVar3;
        exeqVar.b |= 1;
        f.copyOnWrite();
        exen exenVar = (exen) f.instance;
        exeq exeqVar2 = (exeq) exepVar.build();
        exen exenVar2 = exen.a;
        exeqVar2.getClass();
        exenVar.d = exeqVar2;
        exenVar.b |= 2;
        g((exen) f.build());
    }

    @Override // defpackage.egdg
    public final void c(exgc exgcVar) {
        h(exgcVar);
        exem f = f();
        exep exepVar = (exep) exeq.a.createBuilder();
        exfj exfjVar = (exfj) exfk.a.createBuilder();
        exfjVar.copyOnWrite();
        exfk exfkVar = (exfk) exfjVar.instance;
        exfkVar.c = 1;
        exfkVar.b |= 1;
        exfjVar.copyOnWrite();
        exfk exfkVar2 = (exfk) exfjVar.instance;
        exgcVar.getClass();
        exfkVar2.e = exgcVar;
        exfkVar2.b |= 4;
        exepVar.copyOnWrite();
        exeq exeqVar = (exeq) exepVar.instance;
        exfk exfkVar3 = (exfk) exfjVar.build();
        exfkVar3.getClass();
        exeqVar.c = exfkVar3;
        exeqVar.b |= 1;
        f.copyOnWrite();
        exen exenVar = (exen) f.instance;
        exeq exeqVar2 = (exeq) exepVar.build();
        exen exenVar2 = exen.a;
        exeqVar2.getClass();
        exenVar.d = exeqVar2;
        exenVar.b |= 2;
        g((exen) f.build());
    }

    @Override // defpackage.egdg
    public final void d(exgc exgcVar, exes exesVar) {
        h(exgcVar);
        exem f = f();
        exep exepVar = (exep) exeq.a.createBuilder();
        exepVar.copyOnWrite();
        exeq exeqVar = (exeq) exepVar.instance;
        exesVar.getClass();
        exeqVar.d = exesVar;
        exeqVar.b |= 2;
        exfj exfjVar = (exfj) exfk.a.createBuilder();
        exfjVar.copyOnWrite();
        exfk exfkVar = (exfk) exfjVar.instance;
        exfkVar.c = 1;
        exfkVar.b |= 1;
        exfjVar.copyOnWrite();
        exfk exfkVar2 = (exfk) exfjVar.instance;
        exgcVar.getClass();
        exfkVar2.e = exgcVar;
        exfkVar2.b |= 4;
        exepVar.copyOnWrite();
        exeq exeqVar2 = (exeq) exepVar.instance;
        exfk exfkVar3 = (exfk) exfjVar.build();
        exfkVar3.getClass();
        exeqVar2.c = exfkVar3;
        exeqVar2.b |= 1;
        f.copyOnWrite();
        exen exenVar = (exen) f.instance;
        exeq exeqVar3 = (exeq) exepVar.build();
        exen exenVar2 = exen.a;
        exeqVar3.getClass();
        exenVar.d = exeqVar3;
        exenVar.b |= 2;
        g((exen) f.build());
    }

    @Override // defpackage.egdg
    public final void e(exge exgeVar) {
        exem f = f();
        exep exepVar = (exep) exeq.a.createBuilder();
        exfj exfjVar = (exfj) exfk.a.createBuilder();
        exfjVar.copyOnWrite();
        exfk exfkVar = (exfk) exfjVar.instance;
        exfkVar.c = 4;
        exfkVar.b |= 1;
        exfjVar.copyOnWrite();
        exfk exfkVar2 = (exfk) exfjVar.instance;
        exgeVar.getClass();
        exfkVar2.d = exgeVar;
        exfkVar2.b |= 2;
        exepVar.copyOnWrite();
        exeq exeqVar = (exeq) exepVar.instance;
        exfk exfkVar3 = (exfk) exfjVar.build();
        exfkVar3.getClass();
        exeqVar.c = exfkVar3;
        exeqVar.b |= 1;
        f.copyOnWrite();
        exen exenVar = (exen) f.instance;
        exeq exeqVar2 = (exeq) exepVar.build();
        exen exenVar2 = exen.a;
        exeqVar2.getClass();
        exenVar.d = exeqVar2;
        exenVar.b |= 2;
        g((exen) f.build());
    }
}
