package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbal implements fbas {
    private volatile Object a;
    private final Object b = new Object();
    private final boolean c;
    private final View d;

    /* compiled from: PG */
    public interface b {
        akkx bh();
    }

    /* compiled from: PG */
    public interface c {
        aklx N();
    }

    public fbal(View view, boolean z) {
        this.d = view;
        this.c = z;
    }

    private final Context b(Class cls, boolean z) {
        Context context = this.d.getContext();
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context != fazn.a(context.getApplicationContext())) {
            return context;
        }
        fbau.a(z, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.d.getClass());
        return null;
    }

    private final fbas c(boolean z) {
        if (this.c) {
            Context b2 = b(a.class, z);
            if (b2 instanceof a) {
                fbau.a(b2.getClass().equals(a.class), "%s, Only account views can attach to account fragments.", this.d.getClass());
                return (fbas) ((a) b2).a();
            }
            if (z) {
                return null;
            }
            fbau.a(!(r6 instanceof fbas), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.d.getClass(), b(fbas.class, false).getClass().getName());
        } else {
            Object b3 = b(fbas.class, z);
            if (b3 instanceof fbas) {
                return (fbas) b3;
            }
            if (z) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.d.getClass()));
    }

    public final fbas a() {
        return c(true);
    }

    @Override // defpackage.fbas
    public final Object aX() {
        Object akkzVar;
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    fbas c2 = c(false);
                    if (this.c) {
                        aklx N = ((c) fazh.a(c2, c.class)).N();
                        N.a = this.d;
                        akkzVar = N.a();
                    } else {
                        akkx bh = ((b) fazh.a(c2, b.class)).bh();
                        bh.d = this.d;
                        fbbe.a(bh.d, View.class);
                        akkzVar = new akkz(bh.a, bh.b, bh.c);
                    }
                    this.a = akkzVar;
                }
            }
        }
        return this.a;
    }

    /* compiled from: PG */
    public class a extends ContextWrapper {
        public ea a;
        public LayoutInflater b;
        public LayoutInflater c;
        private final lkp d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ea eaVar) {
            super(context);
            fbau.b(context);
            fbak fbakVar = new fbak(this);
            this.d = fbakVar;
            this.b = null;
            this.a = eaVar;
            eaVar.P().c(fbakVar);
        }

        public final ea a() {
            fbau.c(this.a, "The fragment has already been destroyed.");
            return this.a;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.c == null) {
                if (this.b == null) {
                    this.b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.c = this.b.cloneInContext(this);
            }
            return this.c;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(android.view.LayoutInflater r2, defpackage.ea r3) {
            /*
                r1 = this;
                defpackage.fbau.b(r2)
                android.content.Context r0 = r2.getContext()
                defpackage.fbau.b(r0)
                r1.<init>(r0)
                fbak r0 = new fbak
                r0.<init>(r1)
                r1.d = r0
                r1.b = r2
                r1.a = r3
                lkk r2 = r3.P()
                r2.c(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fbal.a.<init>(android.view.LayoutInflater, ea):void");
        }
    }
}
