package defpackage;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pfg implements pfj {
    public static final Set a = new HashSet();
    private final String b;
    private final String c;

    public pfg(String str, String str2) {
        this.b = str;
        this.c = str2;
        a.add(this);
    }

    public abstract boolean a();

    @Override // defpackage.pfj
    public final String b() {
        return this.b;
    }

    @Override // defpackage.pfj
    public final boolean c() {
        return a() || d();
    }

    public boolean d() {
        Set set = pex.a;
        String str = this.c;
        if (set.contains(str)) {
            return true;
        }
        return ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) && set.contains(str.concat(":dev"));
    }
}
