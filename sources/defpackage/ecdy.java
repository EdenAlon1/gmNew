package defpackage;

import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecdy implements ecto {
    private final ffbr a;
    private final ffbr b;
    private final Set c;

    public ecdy(ffbr ffbrVar, ffbr ffbrVar2, Set set) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = set;
    }

    private final String c(String str) {
        return ((SharedPreferences) this.b.b()).getString(d(str), null);
    }

    private static final String d(String str) {
        return "federatedLearningLastScheduledSession_".concat(str);
    }

    @Override // defpackage.ecto
    public final ectn a() {
        return new ectn(-10);
    }

    @Override // defpackage.ecto
    public final ListenableFuture b(fgqx fgqxVar) {
        ecdq ecdqVar = (ecdq) this.a.b();
        for (ecdp ecdpVar : this.c) {
            if (!((fbcq) ecdpVar.c.b()).e) {
                emxc emxcVar = ecdpVar.b;
                if (((fbcq) ecdpVar.c.b()).b) {
                    enip a = ecdpVar.a(fgqxVar);
                    if (!a.isEmpty()) {
                        List<eyee> g = enkr.g(a.g(), new emwl() { // from class: ecdx
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                return eyee.A((String) obj);
                            }
                        });
                        String replace = ((fbcq) ecdpVar.c.b()).c.replace("%PACKAGE_NAME%", ecdpVar.d.getPackageName()).replace("%METRIC_NAME%", ecdpVar.a);
                        String str = ((fbcq) ecdpVar.c.b()).d;
                        String str2 = ecdpVar.a;
                        ecdqVar.a(str, g);
                        ecdqVar.c(replace);
                        String c = c(str2);
                        if (c != null && !replace.equals(c)) {
                            ecdqVar.b(c);
                            ((SharedPreferences) this.b.b()).edit().putString(d(str2), replace).commit();
                        }
                    }
                }
            }
            String c2 = c(ecdpVar.a);
            if (c2 != null) {
                ecdqVar.b(c2);
            }
        }
        return erre.a;
    }
}
