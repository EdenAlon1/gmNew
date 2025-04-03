package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eenf {
    public static String a(eenj eenjVar) {
        int indexOf;
        String j = eenjVar.j("CSeq");
        if (j == null || (indexOf = j.indexOf(32)) == -1) {
            return null;
        }
        return j.substring(indexOf + 1);
    }

    public static void b(eelv eelvVar, String str) {
        try {
            eemm a = eemr.a(str.trim() + "\n");
            if (a == null) {
                dkty.g("Unable to create parser", new Object[0]);
            } else {
                eelvVar.k(a.b());
            }
        } catch (eeje e) {
            dkty.i(e, "Unable to add header", new Object[0]);
        }
    }
}
