package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class comv {
    public static comu c() {
        colz colzVar = new colz();
        colzVar.b(false);
        return colzVar;
    }

    public abstract comb a();

    public abstract Optional b();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof comv) {
            comv comvVar = (comv) obj;
            if (a().equals(comvVar.a()) && b().equals(comvVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((a().hashCode() ^ 1000003) * 1000003) ^ b().hashCode();
    }
}
