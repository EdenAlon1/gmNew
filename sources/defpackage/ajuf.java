package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajuf implements ajud {
    public static final entd a = entd.c("BugleReplies");

    @Override // defpackage.ajud
    public final boolean a(bcqs bcqsVar, bcse bcseVar) {
        bcseVar.getClass();
        boolean q = bcqsVar.q();
        ajue.a("isRcsSendingEnabled", q);
        if (!q) {
            return false;
        }
        boolean p = bcqsVar.p();
        ajue.a("hasNoRbmBot", !p);
        if (p) {
            return false;
        }
        boolean contains = ajrc.a.contains(Integer.valueOf(bcseVar.f()));
        ajue.a("hasDisplayableStatus", contains);
        if (!contains) {
            return false;
        }
        boolean aM = bcseVar.aM();
        ajue.a("isRcs", aM);
        if (!aM) {
            return false;
        }
        boolean n = bcqsVar.n();
        ajue.a("allowReply", n);
        return n;
    }
}
