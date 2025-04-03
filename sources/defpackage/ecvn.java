package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecvn {
    public Context a;
    public emyl b;
    public emyl c;
    public emyl d;
    public emyl e;
    private emyl f;

    public final ecvo a() {
        this.a.getClass();
        if (this.b == null) {
            this.b = ecvo.b;
        }
        if (this.c == null) {
            this.c = ecvo.d(this.a);
        }
        if (this.d == null) {
            this.d = new emyl() { // from class: ecvk
                @Override // defpackage.emyl
                public final Object get() {
                    return emxc.j(new edam(ecvn.this.b));
                }
            };
        }
        if (this.e == null) {
            Context context = this.a;
            Context context2 = ecvo.a;
            final ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, new efbp(new efbo(context)), new efce());
            this.e = emys.a(new emyl() { // from class: ecvh
                @Override // defpackage.emyl
                public final Object get() {
                    Context context3 = ecvo.a;
                    return new efbm(arrayList);
                }
            });
        }
        if (this.f == null) {
            this.f = new emyl() { // from class: ecvl
                @Override // defpackage.emyl
                public final Object get() {
                    Context context3 = ecvn.this.a;
                    Context context4 = ecvo.a;
                    try {
                        return emxc.j(context3.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                    } catch (PackageManager.NameNotFoundException unused) {
                        return emux.a;
                    }
                }
            };
        }
        return new ecvo(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
