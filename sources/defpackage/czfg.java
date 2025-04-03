package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czfg extends czfj {
    public final Context a;
    public final czff b;
    public final Runnable c;
    public boolean d;
    public boolean e;
    public boolean f;

    public czfg(Context context, czfi czfiVar, czff czffVar, dede dedeVar) {
        super(czfiVar, dedeVar);
        this.c = new czfe(this);
        this.d = false;
        this.e = false;
        this.f = false;
        this.a = context;
        this.b = czffVar;
    }

    @Override // defpackage.czfj
    public final void a(boolean z) {
        PlainTextEditText v = ((cxtc) ((czgj) this.h).b).v();
        if (v == null) {
            return;
        }
        czfi czfiVar = this.h;
        ((czgj) czfiVar).l.removeCallbacks(this.c);
        this.h.b();
        if (z && (this.e || this.f)) {
            this.b.z(48);
            if (this.e) {
                this.h.f();
            }
            if (!((Boolean) cful.g.e()).booleanValue() ? this.f : !(!this.f || ((czgj) this.h).n)) {
                this.h.e(-1, false);
                this.h.h(true);
            }
        } else if (!this.h.g()) {
            this.b.z(16);
        }
        this.i.i(v.getContext(), v);
        this.f = false;
        this.e = false;
    }

    @Override // defpackage.czfj
    public final void b() {
        PlainTextEditText v;
        boolean z = false;
        this.f = false;
        this.e = false;
        this.l = 1;
        czha czhaVar = ((czgj) this.h).b;
        if (czhaVar == null || (v = ((cxtc) czhaVar).v()) == null) {
            return;
        }
        v.requestFocus();
        boolean z2 = this.i.b;
        if (!this.k && !z2 && !((czgj) this.h).m) {
            z = true;
        }
        this.b.z(48);
        ((czgj) this.h).l.removeCallbacks(this.c);
        this.h.b();
        this.h.e(-1, z);
        if (z2) {
            this.i.i(v.getContext(), v);
        }
        this.h.h(true);
        if (z) {
            return;
        }
        czhaVar.S();
    }

    @Override // defpackage.czfj
    public final void c() {
        this.b.z(48);
    }
}
