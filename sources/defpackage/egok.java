package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egok {
    public final egdg a;
    public final ffbr b;
    public emxc c = emux.a;

    public egok(egdg egdgVar, ffbr ffbrVar) {
        this.a = egdgVar;
        this.b = ffbrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(List list) {
        if (this.c.g()) {
            exgf exgfVar = (exgf) exgg.a.createBuilder();
            exgfVar.copyOnWrite();
            exgg exggVar = (exgg) exgfVar.instance;
            exggVar.c = 12;
            exggVar.b |= 1;
            emyg emygVar = (emyg) this.c.c();
            emygVar.g();
            long a = emygVar.a(TimeUnit.MICROSECONDS);
            exgfVar.copyOnWrite();
            exgg exggVar2 = (exgg) exgfVar.instance;
            exggVar2.b |= 2;
            exggVar2.d = a;
            enqv it = ((engw) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                exfw exfwVar = (exfw) it.next();
                if ((exfwVar.b & 2) != 0) {
                    exfu exfuVar = exfwVar.f;
                    if (exfuVar == null) {
                        exfuVar = exfu.a;
                    }
                    exgfVar.copyOnWrite();
                    exgg exggVar3 = (exgg) exgfVar.instance;
                    exfuVar.getClass();
                    exggVar3.e = exfuVar;
                    exggVar3.b |= 4;
                }
            }
            egdg egdgVar = this.a;
            exgb exgbVar = (exgb) exgc.a.createBuilder();
            exgbVar.a(list);
            exgbVar.copyOnWrite();
            exgc exgcVar = (exgc) exgbVar.instance;
            exgg exggVar4 = (exgg) exgfVar.build();
            exggVar4.getClass();
            exgcVar.d = exggVar4;
            exgcVar.b |= 1;
            egdgVar.c((exgc) exgbVar.build());
            this.c = emux.a;
        }
    }
}
