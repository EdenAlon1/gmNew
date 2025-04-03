package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class engs extends enbi {
    private final engw a;

    public engs(engw engwVar, int i) {
        super(engwVar.size(), i);
        this.a = engwVar;
    }

    @Override // defpackage.enbi
    protected final Object a(int i) {
        return this.a.get(i);
    }
}
