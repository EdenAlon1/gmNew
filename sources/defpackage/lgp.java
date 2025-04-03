package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgp implements lgo {
    public int a = -1;
    public int b = -1;
    private final int c;

    public lgp(int i) {
        this.c = i;
    }

    @Override // defpackage.lgo
    public final boolean b(CharSequence charSequence, int i, int i2, lhc lhcVar) {
        int i3 = this.c;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.a = i;
        this.b = i2;
        return false;
    }

    @Override // defpackage.lgo
    public final /* bridge */ /* synthetic */ Object a() {
        return this;
    }
}
