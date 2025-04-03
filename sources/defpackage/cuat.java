package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuat {
    public static final cskc a = cskc.g("Bugle", "BugleExternalProcessUidVerifier");
    private static final engw e;
    private static final enhk f;
    public boolean c;
    private final Context g;
    public final Object b = new Object();
    public final Set d = new HashSet();

    static {
        engw s = engw.s("AE41481F52E0F58DF2806D5A38EB3DBCA5AE02B0", "6DDB6673E07F05A1BECE93343651AD167FADDC10");
        e = s;
        f = enhk.l("com.google.android.ims", s);
    }

    public cuat(Context context) {
        this.g = context;
    }

    public final void a() {
        synchronized (this.b) {
            this.d.clear();
            enqu listIterator = f.entrySet().listIterator();
            while (listIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) listIterator.next();
                int a2 = dkqd.a(this.g, (String) entry.getKey(), (List) entry.getValue());
                if (a2 != -1) {
                    this.d.add(Integer.valueOf(a2));
                }
            }
            this.c = true;
            csjb a3 = a.a();
            a3.I("Finished update for verified Bugle uids");
            a3.A("verified uids", this.d);
            a3.r();
        }
    }
}
