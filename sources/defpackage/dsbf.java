package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Size;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsbf extends dsas implements dsau {
    public dsbx a;
    private final dszr ag;
    private final ffbz ah;
    private final ffbz ai;
    private final ffbz aj;
    private final ffbz ak;
    private dsbg al;
    public Optional b;
    public Optional c;
    public View d;
    public dsaz e;

    public dsbf() {
        super(Integer.valueOf(R.layout.shortcuts_screen));
        this.ag = dszr.e;
        this.ah = ffca.a(new ffix() { // from class: dsav
            @Override // defpackage.ffix
            public final Object invoke() {
                Optional optional = dsbf.this.b;
                if (optional == null) {
                    ffkj.c("useUpdatedShortcutConfigurationOverride");
                    optional = null;
                }
                Boolean bool = (Boolean) fflm.a(optional, false);
                bool.booleanValue();
                return bool;
            }
        });
        this.ai = ffca.a(new ffix() { // from class: dsaw
            @Override // defpackage.ffix
            public final Object invoke() {
                Optional optional = dsbf.this.c;
                if (optional == null) {
                    ffkj.c("useShortcutConfigurationFlow");
                    optional = null;
                }
                Boolean bool = (Boolean) fflm.a(optional, false);
                bool.booleanValue();
                return bool;
            }
        });
        this.aj = ffca.a(new ffix() { // from class: dsax
            @Override // defpackage.ffix
            public final Object invoke() {
                dsbf dsbfVar = dsbf.this;
                return fgdm.a(dsbfVar.r().a((dsat) dsbfVar.bA(), dsbfVar.bg()));
            }
        });
        this.ak = ffca.a(new ffix() { // from class: dsay
            @Override // defpackage.ffix
            public final Object invoke() {
                dsbf dsbfVar = dsbf.this;
                return dsbfVar.r().a((dsat) dsbfVar.bA(), dsbfVar.bg());
            }
        });
    }

    public static final /* synthetic */ dsat e(dsbf dsbfVar) {
        return (dsat) dsbfVar.bA();
    }

    @Override // defpackage.dsau
    public final void a(int i) {
        Object obj;
        Iterator it = ((dsat) bA()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((dsar) obj).a == i) {
                    break;
                }
            }
        }
        dsar dsarVar = (dsar) obj;
        if (dsarVar == null) {
            throw new IllegalStateException(a.f(i, "Couldn't find a shortcut with label ", "."));
        }
        ffqy.d(bF(), null, null, new dsbe(this, dsarVar, null), 3);
    }

    public final fgcm aU() {
        return (fgcm) this.aj.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    @Override // defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ap(android.view.View r4, android.os.Bundle r5) {
        /*
            r3 = this;
            r4.getClass()
            r3.d = r4
            android.os.Bundle r5 = r3.m
            r0 = 0
            if (r5 == 0) goto L24
            java.lang.String r1 = "auto_launch_shortcut"
            r2 = -1
            int r5 = r5.getInt(r1, r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r1 = r5.intValue()
            if (r1 != r2) goto L1c
            r5 = r0
        L1c:
            if (r5 == 0) goto L24
            dsbg r1 = new dsbg
            r1.<init>(r5)
            goto L25
        L24:
            r1 = r0
        L25:
            r3.al = r1
            if (r1 == 0) goto L34
            java.lang.Integer r5 = r1.a
            if (r5 == 0) goto L34
            int r5 = r5.intValue()
            r3.a(r5)
        L34:
            dsaz r5 = new dsaz
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r5.<init>(r4)
            r3.e = r5
            dslw r4 = r3.bA()
            dsat r4 = (defpackage.dsat) r4
            java.lang.Integer r4 = r4.b
            if (r4 == 0) goto L6c
            int r4 = r4.intValue()
            dsaz r5 = r3.e
            java.lang.String r1 = "views"
            if (r5 != 0) goto L55
            defpackage.ffkj.c(r1)
            r5 = r0
        L55:
            dsaz r2 = r3.e
            if (r2 != 0) goto L5d
            defpackage.ffkj.c(r1)
            r2 = r0
        L5d:
            android.view.ViewGroup r5 = r5.a
            android.view.ViewGroup r1 = r2.a
            android.content.Context r1 = r1.getContext()
            android.graphics.drawable.Drawable r4 = defpackage.ku.a(r1, r4)
            r5.setBackground(r4)
        L6c:
            ffsk r4 = r3.bF()
            dsbd r5 = new dsbd
            r5.<init>(r3, r0)
            r1 = 3
            defpackage.ffqy.d(r4, r0, r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsbf.ap(android.view.View, android.os.Bundle):void");
    }

    public final void bb(RecyclerView recyclerView, Size size, dsat dsatVar) {
        dsbw f = f();
        size.getClass();
        if (f.g) {
            f.l = dsatVar;
            f.h = ffmk.f(ffmk.g(size.getWidth() / f.m(), ffmk.g(f.l.a.size(), 7)), 1);
        } else {
            f.h = ffmk.f(ffmk.g(size.getWidth() / f.m(), f.k), 1);
        }
        f.i.d(dsbw.a[0], Integer.valueOf(Math.max(1, size.getWidth() / f.h)));
        Math.ceil(f.a() / f.h);
        f.j.d(dsbw.a[1], Integer.valueOf(((Number) f.o.a()).intValue()));
        int i = f().h;
        vx vxVar = recyclerView.o;
        GridLayoutManager gridLayoutManager = vxVar instanceof GridLayoutManager ? (GridLayoutManager) vxVar : null;
        if (gridLayoutManager == null || gridLayoutManager.b != i) {
            recyclerView.getContext();
            recyclerView.ap(new GridLayoutManager(i));
        }
        if (bg() || !ffkj.e(recyclerView.n, f())) {
            recyclerView.am(f());
        }
        bJ();
    }

    public final boolean bg() {
        return ((Boolean) this.ai.a()).booleanValue();
    }

    public final dsbw f() {
        if (!gX() || bg()) {
            dsbw dsbwVar = (dsbw) this.ak.a();
            dsbwVar.getClass();
            return dsbwVar;
        }
        Object c = aU().c();
        c.getClass();
        return (dsbw) c;
    }

    @Override // defpackage.dslv
    public final /* bridge */ /* synthetic */ void gW(dslw dslwVar) {
        super.gW((dsat) dslwVar);
        if (bg()) {
            return;
        }
        aU().f(r().a((dsat) bA(), bg()));
    }

    @Override // defpackage.dslv
    public final boolean gX() {
        return ((Boolean) this.ah.a()).booleanValue();
    }

    public final dsbx r() {
        dsbx dsbxVar = this.a;
        if (dsbxVar != null) {
            return dsbxVar;
        }
        ffkj.c("shortcutsAdapterFactory");
        return null;
    }

    @Override // defpackage.dsyk
    public final dsyj s() {
        dsaz dsazVar = this.e;
        if (dsazVar != null) {
            return dsyh.a(dsazVar.b);
        }
        return null;
    }

    @Override // defpackage.dtaa
    public final dszr t() {
        return this.ag;
    }
}
