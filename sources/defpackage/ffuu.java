package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffuu extends ffsd {
    protected final String g() {
        ffuu ffuuVar;
        ffsd ffsdVar = fftc.a;
        ffuu ffuuVar2 = fghh.a;
        if (this == ffuuVar2) {
            return "Dispatchers.Main";
        }
        try {
            ffuuVar = ffuuVar2.j();
        } catch (UnsupportedOperationException unused) {
            ffuuVar = null;
        }
        if (this == ffuuVar) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // defpackage.ffsd
    public final ffsd i(int i) {
        fggy.a(1);
        return this;
    }

    public abstract ffuu j();

    @Override // defpackage.ffsd
    public String toString() {
        String g = g();
        if (g != null) {
            return g;
        }
        return ffsp.a(this) + "@" + ffsp.b(this);
    }
}
