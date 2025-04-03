package defpackage;

import android.os.Parcelable;
import java.io.Serializable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzjd implements Serializable, Parcelable {
    private final dzpg h(String str) {
        dzil dzilVar = new dzil();
        dzilVar.c(str);
        dzilVar.e(dzpf.DEVICE_ID);
        dzilVar.d(c());
        return dzilVar.a();
    }

    private final dzpg i(String str) {
        dzil dzilVar = new dzil();
        dzilVar.c(str);
        dzilVar.e(dzpf.EMAIL);
        dzilVar.d(c());
        return dzilVar.a();
    }

    public abstract emxc a();

    public abstract emxc b();

    public abstract String c();

    public abstract Set d();

    public final dzpg e(String str) {
        dzil dzilVar = new dzil();
        dzilVar.c(str);
        dzilVar.e(dzpf.PHONE_NUMBER);
        dzilVar.d(c());
        return dzilVar.a();
    }

    public final dzpg f() {
        return b().g() ? i((String) b().c()) : a().g() ? h((String) a().c()) : e((String) d().iterator().next());
    }

    public final engw g() {
        int i = engw.d;
        engr engrVar = new engr();
        if (b().g()) {
            engrVar.h(i((String) b().c()));
        }
        if (a().g()) {
            engrVar.h(h((String) a().c()));
        }
        engrVar.j(enfc.d(d()).f(new emwl() { // from class: dzjb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return dzjd.this.e((String) obj);
            }
        }));
        return engrVar.g();
    }
}
