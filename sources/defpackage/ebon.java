package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebon {
    public final View.OnClickListener a;
    public emxc b = emux.a;
    public Runnable c;
    public Runnable d;
    public Runnable e;

    public ebon(View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    public final void a(final ebom ebomVar, final int i) {
        this.c = new Runnable() { // from class: eboh
            @Override // java.lang.Runnable
            public final void run() {
                ebom ebomVar2 = ebom.this;
                ebtx ebtxVar = ebomVar2.a;
                Object a = ebomVar2.c.a();
                ezon ezonVar = (ezon) ebomVar2.b.toBuilder();
                ezonVar.copyOnWrite();
                ezoo ezooVar = (ezoo) ezonVar.instance;
                ezooVar.c = i - 1;
                ezooVar.b |= 1;
                ebtxVar.a(a, (ezoo) ezonVar.build());
            }
        };
    }
}
