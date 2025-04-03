package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eai extends kwi implements Runnable, View.OnAttachStateChangeListener, kud {
    private final ech a;
    private boolean d;
    private boolean e;
    private kxh f;

    public eai(ech echVar) {
        super(!echVar.h ? 1 : 0);
        this.a = echVar;
    }

    @Override // defpackage.kwi
    public final kxh b(kxh kxhVar, List list) {
        ech.c(this.a, kxhVar);
        return this.a.h ? kxh.a : kxhVar;
    }

    @Override // defpackage.kwi
    public final void c(kwr kwrVar) {
        this.d = false;
        this.e = false;
        kxh kxhVar = this.f;
        if (kwrVar.b() != 0 && kxhVar != null) {
            this.a.a(kxhVar);
            this.a.b(kxhVar);
            ech.c(this.a, kxhVar);
        }
        this.f = null;
    }

    @Override // defpackage.kwi
    public final void d() {
        this.d = true;
        this.e = true;
    }

    @Override // defpackage.kwi
    public final kwh e(kwh kwhVar) {
        this.d = false;
        return kwhVar;
    }

    @Override // defpackage.kud
    public final kxh ey(View view, kxh kxhVar) {
        this.f = kxhVar;
        this.a.b(kxhVar);
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            this.a.a(kxhVar);
            ech.c(this.a, kxhVar);
        }
        return this.a.h ? kxh.a : kxhVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            kxh kxhVar = this.f;
            if (kxhVar != null) {
                this.a.a(kxhVar);
                ech.c(this.a, kxhVar);
                this.f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
