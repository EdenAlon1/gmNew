package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cncr {
    private final cmrq a;

    public cncr(cmrq cmrqVar) {
        this.a = cmrqVar;
    }

    public final cmrl a(String str, char c) {
        int indexOf = str.indexOf(8202, 1);
        int indexOf2 = str.indexOf(c) + 1;
        int indexOf3 = str.indexOf(c, indexOf2);
        if (indexOf3 != -1 && indexOf3 < indexOf) {
            return this.a.b(str.substring(indexOf2, indexOf3));
        }
        int lastIndexOf = str.lastIndexOf(8202, str.length() - 2);
        int lastIndexOf2 = str.lastIndexOf(c);
        int lastIndexOf3 = str.lastIndexOf(c, lastIndexOf2 - 1);
        if (lastIndexOf3 == -1 || lastIndexOf >= lastIndexOf3) {
            return cmrq.a(cmrv.REACTION_TYPE_UNSPECIFIED);
        }
        return this.a.b(str.substring(lastIndexOf3 + 1, lastIndexOf2));
    }
}
