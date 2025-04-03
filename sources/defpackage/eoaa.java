package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoaa extends eoac {
    private static final long serialVersionUID = 1;
    private final eobb a;
    private final eobb b;

    public eoaa(eobb eobbVar, eobb eobbVar2) {
        this.a = eobbVar;
        this.b = eobbVar2;
    }

    @Override // defpackage.eoac
    public final int a() {
        return 2;
    }

    @Override // defpackage.eoac
    public final eobb b(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
