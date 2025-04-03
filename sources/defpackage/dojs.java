package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dojs implements dojx {
    private final int a;
    private final boolean b;

    public dojs() {
        this(false, 3);
    }

    @Override // defpackage.dojx
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dojx
    public final boolean b() {
        return this.b;
    }

    public /* synthetic */ dojs(boolean z, int i) {
        this.a = 1 != (i & 1) ? 0 : 20;
        this.b = z & ((i & 2) == 0);
    }
}
