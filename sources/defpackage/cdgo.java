package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgo implements cdgt {
    private final int a;
    private final String b;

    public cdgo(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.cdgt
    public final void a(epds epdsVar) {
        epey epeyVar = (epey) epfa.a.createBuilder();
        epeyVar.getClass();
        epeyVar.copyOnWrite();
        epfa epfaVar = (epfa) epeyVar.instance;
        int i = 2;
        epfaVar.b |= 2;
        epfaVar.d = this.b;
        int i2 = this.a;
        if (i2 == 1) {
            i = 4;
        } else if (i2 == 2) {
            i = 3;
        } else if (i2 != 3) {
            i = i2 != 7 ? 1 : 6;
        }
        epeyVar.copyOnWrite();
        epfa epfaVar2 = (epfa) epeyVar.instance;
        epfaVar2.c = i - 1;
        epfaVar2.b = 1 | epfaVar2.b;
        epfa epfaVar3 = (epfa) epeyVar.build();
        epdsVar.copyOnWrite();
        epdt epdtVar = (epdt) epdsVar.instance;
        epdt epdtVar2 = epdt.a;
        epfaVar3.getClass();
        eygr eygrVar = epdtVar.h;
        if (!eygrVar.c()) {
            epdtVar.h = eyfy.mutableCopy(eygrVar);
        }
        epdtVar.h.add(epfaVar3);
    }

    @Override // defpackage.cdgt
    public final void c(bqiv bqivVar) {
        bqivVar.e(this.a);
        bqivVar.d(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdgo)) {
            return false;
        }
        cdgo cdgoVar = (cdgo) obj;
        return this.a == cdgoVar.a && ffkj.e(this.b, cdgoVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CmsBackupDependencyMissingContext(dependencyTableType=" + this.a + ", dependencyBugleId=" + this.b + ")";
    }

    @Override // defpackage.cdgt
    public final /* synthetic */ void b(epep epepVar) {
    }
}
