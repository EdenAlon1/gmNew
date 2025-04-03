package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctcm extends ctco {
    private final String a;

    public ctcm(String str) {
        this.a = str;
    }

    @Override // defpackage.ctco, defpackage.ctch
    public final String d() {
        return this.a;
    }

    @Override // defpackage.ctch
    public final int e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctch) {
            ctch ctchVar = (ctch) obj;
            if (ctchVar.e() == 2 && this.a.equals(ctchVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DataSource{filePath=" + this.a + "}";
    }
}
