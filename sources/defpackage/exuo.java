package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exuo {
    public final exui a;

    public exuo(exui exuiVar) {
        this.a = exuiVar;
    }

    public final /* synthetic */ exuj a() {
        eyfy build = this.a.build();
        build.getClass();
        return (exuj) build;
    }

    public final exvx b() {
        exvx exvxVar = ((exuj) this.a.instance).d;
        if (exvxVar == null) {
            exvxVar = exvx.a;
        }
        exvxVar.getClass();
        return exvxVar;
    }

    public final void c(exvx exvxVar) {
        exui exuiVar = this.a;
        exuiVar.copyOnWrite();
        exuj exujVar = (exuj) exuiVar.instance;
        exuj exujVar2 = exuj.a;
        exujVar.d = exvxVar;
        exujVar.b |= 2;
    }
}
