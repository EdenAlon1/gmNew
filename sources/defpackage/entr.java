package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class entr extends ents {
    public static final entr a = new entr();

    private entr() {
    }

    @Override // defpackage.ents
    public final int b() {
        return 0;
    }

    @Override // defpackage.ents
    public final ensn c(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // defpackage.ents
    public final Object d(ensn ensnVar) {
        return null;
    }

    @Override // defpackage.ents
    public final Object e(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }
}
