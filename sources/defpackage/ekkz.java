package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import defpackage.fbal;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekkz implements fbas {
    private volatile Object a;
    private final Object b = new Object();
    private final View c;

    /* compiled from: PG */
    public final class a extends fbal.a {
        public a(Context context, ea eaVar) {
            super(context, eaVar);
        }

        public a(LayoutInflater layoutInflater, ea eaVar) {
            super(layoutInflater, eaVar);
        }
    }

    /* compiled from: PG */
    public interface b {
        akks ah();
    }

    /* compiled from: PG */
    public interface c {
        aklx N();
    }

    public ekkz(View view) {
        this.c = view;
    }

    private final Context a(Class cls) {
        Context b2 = b(this.c.getContext(), cls);
        emxf.p(b2 != b(b2.getApplicationContext(), fbas.class), "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", this.c.getClass());
        return b2;
    }

    private static Context b(Context context, Class cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        Object a2;
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    Context a3 = a(fbal.a.class);
                    if (a3 instanceof a) {
                        akks ah = ((b) ((fbas) ((fbal.a) a3).a()).aX()).ah();
                        ah.e = this.c;
                        fbbe.a(ah.e, View.class);
                        View view = ah.e;
                        a2 = new akkw(ah.a, ah.b, ah.c, ah.d, view);
                    } else {
                        if (!(a3 instanceof fbal.a)) {
                            Context a4 = a(fbas.class);
                            emxf.r(!(a4 instanceof fbas), "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context: %s", this.c.getClass(), a4.getClass().getName());
                            throw new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity. Was attached to context: %s", this.c.getClass(), a4.getClass().getName()));
                        }
                        emxf.p(true, "%s, Account views may only attach to account fragments.", this.c.getClass());
                        aklx N = ((c) ((fbas) ((fbal.a) a3).a()).aX()).N();
                        N.a = this.c;
                        a2 = N.a();
                    }
                    this.a = a2;
                }
            }
        }
        return this.a;
    }
}
