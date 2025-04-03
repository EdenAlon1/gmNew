package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csmk {
    private final ctvb a;
    private final aolr b;

    public csmk(ctvb ctvbVar, aolr aolrVar) {
        this.a = ctvbVar;
        this.b = aolrVar;
    }

    public static final int c(Optional optional) {
        if (optional.isEmpty()) {
            return 0;
        }
        return ((djtp) optional.get()).o().mMaxSize1toM;
    }

    public static final int d(Optional optional) {
        if (optional.isEmpty()) {
            return 0;
        }
        return ((djtp) optional.get()).o().mMaxAdhocGroupSize;
    }

    public static final int e(Optional optional) {
        if (optional.isEmpty()) {
            return 0;
        }
        return ((djtp) optional.get()).o().mMaxSize1to1;
    }

    @Deprecated
    public final Optional a(djtp djtpVar) {
        String b = b(djtpVar);
        return emxe.c(b) ? Optional.empty() : Optional.of(this.b.r(b));
    }

    public final String b(djtp djtpVar) {
        djtr m = djtpVar.m();
        if (m == null) {
            return "";
        }
        String w = m.w();
        return !emxe.c(w) ? emxe.b(dkut.k(w, this.a)) : "";
    }
}
