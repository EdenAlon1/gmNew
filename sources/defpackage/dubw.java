package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dubw implements Serializable, dubx {
    private static final long serialVersionUID = -2512461138929551103L;
    private final ezib a;

    public dubw(ezib ezibVar) {
        if (ezibVar == null) {
            throw new NullPointerException("Null value");
        }
        this.a = ezibVar;
    }

    @Override // defpackage.dubx
    public final ezib a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return dubx.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dubx) {
            return this.a.equals(((dubx) obj).a());
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.a.hashCode() ^ 1335633679;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.libraries.geller.annotations.GellerCorpusKey(" + this.a + ')';
    }
}
