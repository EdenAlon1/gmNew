package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enss {
    public static final enss c = new enso();
    public static final enss d = new enso();

    protected enss() {
    }

    static enss b(enss enssVar, enss enssVar2) {
        enss enssVar3;
        enss enssVar4;
        if (enssVar != null) {
            if (enssVar2 == null || enssVar == (enssVar3 = c) || enssVar2 == (enssVar4 = d)) {
                return enssVar;
            }
            if (enssVar2 != enssVar3 && enssVar != enssVar4) {
                return new ensp(enssVar, enssVar2);
            }
        }
        return enssVar2;
    }

    protected abstract void a();
}
