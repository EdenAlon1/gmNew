package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctcn extends ctco {
    private final Integer a;

    public ctcn(Integer num) {
        this.a = num;
    }

    @Override // defpackage.ctco, defpackage.ctch
    public final Integer c() {
        return this.a;
    }

    @Override // defpackage.ctch
    public final int e() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctch) {
            ctch ctchVar = (ctch) obj;
            if (ctchVar.e() == 3 && this.a.equals(ctchVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DataSource{resourceId=" + this.a + "}";
    }
}
