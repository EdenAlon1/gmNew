package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csre {
    public static final int a() {
        bqzs a = bqzv.a();
        a.z("getContactCount");
        a.u();
        int i = 0;
        a.n(new dtzq("COUNT(distinct $V)", new Object[]{bqzv.c.b}), "count");
        dtsu o = a.b().o();
        try {
            bqyp bqypVar = (bqyp) o;
            if (bqypVar.moveToNext()) {
                String dd = bqypVar.dd("count");
                dd.getClass();
                i = Integer.parseInt(dd);
            }
            ffig.a(o, null);
            return i;
        } finally {
        }
    }
}
