package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwqu extends dwqv {
    private final eyee a;

    public dwqu(eyee eyeeVar) {
        this.a = eyeeVar;
    }

    @Override // defpackage.dwqv, defpackage.dwqw
    public final eyee a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwqw) {
            dwqw dwqwVar = (dwqw) obj;
            dwqwVar.b();
            if (this.a.equals(dwqwVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dwqw
    public final void b() {
    }
}
