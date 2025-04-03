package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fbae implements fbas {
    private volatile Object a;
    private final Object b = new Object();
    private final ea c;
    private final fbag d;

    /* compiled from: PG */
    public interface a {
        akgp bg();
    }

    public fbae(ea eaVar) {
        this.c = eaVar;
        this.d = new fbag(eaVar);
    }

    public static final Context d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static final void e(ea eaVar) {
        if (eaVar.m == null) {
            eaVar.at(new Bundle());
        }
    }

    @Override // defpackage.fbas
    public final Object aX() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    fbau.c(this.c.X(), "Hilt Fragments must be attached before creating the component.");
                    ea eaVar = this.c;
                    fbau.a(eaVar.X() instanceof fbas, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", eaVar.X().getClass());
                    c(this.c);
                    akgp bg = ((a) fazh.a(this.c.X(), a.class)).bg();
                    bg.e = this.d.aX();
                    bg.d = this.c;
                    fbbe.a(bg.d, ea.class);
                    fbbe.a(bg.e, fazl.class);
                    this.a = new akgt(bg.a, bg.b, bg.c, bg.d);
                }
            }
        }
        return this.a;
    }

    protected void c(ea eaVar) {
    }
}
