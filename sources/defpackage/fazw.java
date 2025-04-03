package defpackage;

import android.app.Activity;
import android.app.Application;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fazw implements fazx, fbas {
    protected final Activity a;
    public final fbas b;
    private volatile Object c;
    private final Object d = new Object();

    /* compiled from: PG */
    public interface a {
        akfz O();
    }

    public fazw(Activity activity) {
        this.a = activity;
        this.b = activity instanceof abe ? new fazz((abe) activity) : new fbab(activity);
    }

    protected Object a() {
        if (!(this.a.getApplication() instanceof fbas)) {
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(Application.class.equals(this.a.getApplication().getClass()) ? "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?" : "Found: ".concat(String.valueOf(String.valueOf(this.a.getApplication().getClass())))));
        }
        akfz O = ((a) fazh.a(this.b, a.class)).O();
        O.c = this.a;
        return new akgb(O.a, O.b, O.c);
    }

    @Override // defpackage.fbas
    public final Object aX() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = a();
                }
            }
        }
        return this.c;
    }

    @Override // defpackage.fazx
    public final fazk b() {
        return (fazk) this.b.aX();
    }

    public final fbai c() {
        fazz fazzVar = (fazz) this.b;
        return ((fbaa) fazz.a(fazzVar.a, fazzVar.b).a(fbaa.class)).b;
    }
}
