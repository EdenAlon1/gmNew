package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.ViewOutlineProvider;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aenw extends aag {
    public final fazb c;
    public final fazb d;
    public final ejxn e;
    public aehy f;
    public aenx g;
    public cxhw h;
    private final ffbr i;
    private aeoe j;

    public aenw(ffbr ffbrVar, fazb fazbVar, fazb fazbVar2, ejxn ejxnVar) {
        super(0, 48);
        this.i = ffbrVar;
        this.c = fazbVar2;
        this.d = fazbVar;
        this.e = ejxnVar;
    }

    private final aeoe r(int i) {
        if (this.h == null) {
            return null;
        }
        if (i == 4) {
            Map map = (Map) this.c.b();
            cxhv b = cxhv.b(this.h.c);
            if (b == null) {
                b = cxhv.ARCHIVE;
            }
            return (aeoe) map.get(b);
        }
        if (i != 8) {
            return null;
        }
        Map map2 = (Map) this.c.b();
        cxhv b2 = cxhv.b(this.h.d);
        if (b2 == null) {
            b2 = cxhv.ARCHIVE;
        }
        return (aeoe) map2.get(b2);
    }

    private final aeoj s(int i) {
        aeoe r = r(i);
        if (r == null) {
            return null;
        }
        return r.a();
    }

    private final void t(wr wrVar, aeoh aeohVar) {
        Object apply;
        SelectedConversation J = this.f.J(wrVar);
        if (J != null) {
            apply = aeohVar.a.apply(J);
            aeohVar.c((aeot) apply);
        }
    }

    private final boolean u(wr wrVar, cxhv cxhvVar) {
        if (cxhvVar == cxhv.NONE) {
            return false;
        }
        if (cxhvVar != cxhv.MARK_AS_READ_OR_UNREAD) {
            return true;
        }
        SelectedConversation J = this.f.J(wrVar);
        return (J == null || J.o == 4) ? false : true;
    }

    @Override // defpackage.aag, defpackage.aac
    public final int e(RecyclerView recyclerView, wr wrVar) {
        int g;
        ekzm b = ((elbx) this.i.b()).b("GetSwipeActionFlag");
        try {
            int i = this.b;
            int q = q(recyclerView, wrVar);
            cxhw cxhwVar = this.h;
            int i2 = 0;
            if (cxhwVar != null && q != 0) {
                cxhv b2 = cxhv.b(cxhwVar.c);
                if (b2 == null) {
                    b2 = cxhv.ARCHIVE;
                }
                if (true == u(wrVar, b2)) {
                    i2 = 4;
                }
                cxhv b3 = cxhv.b(this.h.d);
                if (b3 == null) {
                    b3 = cxhv.ARCHIVE;
                }
                if (u(wrVar, b3)) {
                    i2 |= 8;
                }
                g = g(i, i2);
                b.close();
                return g;
            }
            g = g(i, 0);
            b.close();
            return g;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aac
    public final void h(Canvas canvas, RecyclerView recyclerView, wr wrVar, float f, float f2, int i, boolean z) {
        aeoe aeoeVar;
        aeoe aeoeVar2 = null;
        if (this.h != null) {
            if (f < 0.0f) {
                Map map = (Map) this.c.b();
                cxhv b = cxhv.b(this.h.c);
                if (b == null) {
                    b = cxhv.ARCHIVE;
                }
                aeoeVar2 = (aeoe) map.get(b);
            } else if (f > 0.0f) {
                Map map2 = (Map) this.c.b();
                cxhv b2 = cxhv.b(this.h.d);
                if (b2 == null) {
                    b2 = cxhv.ARCHIVE;
                }
                aeoeVar2 = (aeoe) map2.get(b2);
            }
        }
        if (aeoeVar2 != null) {
            this.j = aeoeVar2;
        }
        if (!this.g.a || (aeoeVar = this.j) == null) {
            return;
        }
        aeoeVar.a().b(canvas, recyclerView, wrVar, f, z);
        super.h(canvas, recyclerView, wrVar, f, f2, i, z);
    }

    @Override // defpackage.aac
    public final void i(wr wrVar, int i) {
        aeoe r = r(i);
        r.getClass();
        if (this.g.a) {
            SelectedConversation J = this.f.J(wrVar);
            if (J != null) {
                r.b(wrVar, J);
            }
            wrVar.a.setClipToOutline(false);
            wrVar.a.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        }
    }

    @Override // defpackage.aac
    public final boolean k() {
        aenx aenxVar = this.g;
        return aenxVar != null && aenxVar.a;
    }

    @Override // defpackage.aac
    public final boolean m(RecyclerView recyclerView, wr wrVar, wr wrVar2) {
        return false;
    }

    @Override // defpackage.aac
    public final void p(wr wrVar) {
        if (wrVar != null) {
            aeoj s = s(16);
            if (s instanceof aeoh) {
                t(wrVar, (aeoh) s);
            }
            aeoj s2 = s(32);
            if (s2 instanceof aeoh) {
                t(wrVar, (aeoh) s2);
            }
        }
    }

    @Override // defpackage.aag
    public final int q(RecyclerView recyclerView, wr wrVar) {
        int i = wrVar.f;
        if (i == 2 || i == 0 || i == 3) {
            return 0;
        }
        return this.a;
    }

    @Override // defpackage.aac
    public final float v(float f) {
        return f * 5.0f;
    }
}
