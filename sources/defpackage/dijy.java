package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dijy {
    public eyyh a;
    final /* synthetic */ dijz b;
    private final String c;
    private final int d;

    public dijy(dijz dijzVar, String str, int i) {
        this.b = dijzVar;
        this.c = str;
        this.d = i;
    }

    public final void a(eyyl eyylVar) {
        this.b.g(this.d, this.c, 5, Optional.ofNullable(this.a), Optional.ofNullable(eyylVar));
    }

    public final void b(String str, int i, long j) {
        Optional ofNullable = Optional.ofNullable(this.a);
        eyze eyzeVar = (eyze) eyzf.a.createBuilder();
        eyzeVar.copyOnWrite();
        eyzf eyzfVar = (eyzf) eyzeVar.instance;
        eyzfVar.b |= 1;
        eyzfVar.c = i;
        eyzeVar.copyOnWrite();
        eyzf eyzfVar2 = (eyzf) eyzeVar.instance;
        eyzfVar2.b |= 2;
        eyzfVar2.d = (int) j;
        eyyr eyyrVar = (eyyr) eyyt.a.createBuilder();
        eyyrVar.copyOnWrite();
        eyyt eyytVar = (eyyt) eyyrVar.instance;
        eyzf eyzfVar3 = (eyzf) eyzeVar.build();
        eyzfVar3.getClass();
        eyytVar.d = eyzfVar3;
        eyytVar.c = 2;
        eyyrVar.copyOnWrite();
        eyyt eyytVar2 = (eyyt) eyyrVar.instance;
        eyytVar2.e = 1;
        eyytVar2.b |= 1;
        if (djae.n()) {
            eyyrVar.copyOnWrite();
            eyyt eyytVar3 = (eyyt) eyyrVar.instance;
            str.getClass();
            eyytVar3.b |= 4;
            eyytVar3.g = str;
        }
        String str2 = this.c;
        int i2 = this.d;
        dijz dijzVar = this.b;
        eyyi f = dijz.f(i2, str2, ofNullable);
        f.copyOnWrite();
        eyyn eyynVar = (eyyn) f.instance;
        eyyt eyytVar4 = (eyyt) eyyrVar.build();
        eyyn eyynVar2 = eyyn.a;
        eyytVar4.getClass();
        eyynVar.d = eyytVar4;
        eyynVar.b |= 2;
        dijzVar.e(f);
    }

    public final void c(int i) {
        this.b.g(this.d, this.c, i, Optional.ofNullable(this.a), Optional.empty());
    }

    public final void d(String str, int i, Map map) {
        Optional ofNullable = Optional.ofNullable(this.a);
        eyyu eyyuVar = (eyyu) eyzd.a.createBuilder();
        eyyuVar.copyOnWrite();
        eyzd eyzdVar = (eyzd) eyyuVar.instance;
        eyzdVar.c = i - 1;
        eyzdVar.b |= 1;
        eyyuVar.copyOnWrite();
        ((eyzd) eyyuVar.instance).a().putAll(map);
        eyyr eyyrVar = (eyyr) eyyt.a.createBuilder();
        eyyrVar.copyOnWrite();
        eyyt eyytVar = (eyyt) eyyrVar.instance;
        eyzd eyzdVar2 = (eyzd) eyyuVar.build();
        eyzdVar2.getClass();
        eyytVar.d = eyzdVar2;
        eyytVar.c = 1;
        eyyrVar.copyOnWrite();
        eyyt eyytVar2 = (eyyt) eyyrVar.instance;
        eyytVar2.e = 1;
        eyytVar2.b |= 1;
        if (djae.n()) {
            eyyrVar.copyOnWrite();
            eyyt eyytVar3 = (eyyt) eyyrVar.instance;
            str.getClass();
            eyytVar3.b |= 4;
            eyytVar3.g = str;
        }
        String str2 = this.c;
        int i2 = this.d;
        dijz dijzVar = this.b;
        eyyi f = dijz.f(i2, str2, ofNullable);
        f.copyOnWrite();
        eyyn eyynVar = (eyyn) f.instance;
        eyyt eyytVar4 = (eyyt) eyyrVar.build();
        eyyn eyynVar2 = eyyn.a;
        eyytVar4.getClass();
        eyynVar.d = eyytVar4;
        eyynVar.b |= 2;
        dijzVar.e(f);
    }

    public final void e(String str) {
        Optional ofNullable = Optional.ofNullable(this.a);
        eyyo eyyoVar = (eyyo) eyyq.a.createBuilder();
        eyyoVar.copyOnWrite();
        eyyq eyyqVar = (eyyq) eyyoVar.instance;
        eyyqVar.c = 2;
        eyyqVar.b |= 1;
        eyyr eyyrVar = (eyyr) eyyt.a.createBuilder();
        eyyrVar.copyOnWrite();
        eyyt eyytVar = (eyyt) eyyrVar.instance;
        eyyq eyyqVar2 = (eyyq) eyyoVar.build();
        eyyqVar2.getClass();
        eyytVar.d = eyyqVar2;
        eyytVar.c = 3;
        eyyrVar.copyOnWrite();
        eyyt eyytVar2 = (eyyt) eyyrVar.instance;
        eyytVar2.e = 1;
        eyytVar2.b |= 1;
        if (djae.n()) {
            eyyrVar.copyOnWrite();
            eyyt eyytVar3 = (eyyt) eyyrVar.instance;
            str.getClass();
            eyytVar3.b |= 4;
            eyytVar3.g = str;
        }
        String str2 = this.c;
        int i = this.d;
        dijz dijzVar = this.b;
        eyyi f = dijz.f(i, str2, ofNullable);
        f.copyOnWrite();
        eyyn eyynVar = (eyyn) f.instance;
        eyyt eyytVar4 = (eyyt) eyyrVar.build();
        eyyn eyynVar2 = eyyn.a;
        eyytVar4.getClass();
        eyynVar.d = eyytVar4;
        eyynVar.b |= 2;
        dijzVar.e(f);
    }
}
