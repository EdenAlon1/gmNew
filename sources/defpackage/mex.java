package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mex {
    final Context a;
    public ltn b;
    emyl c;
    public emyl d;
    public emyl e;
    emyl f;
    emyl g;
    emwl h;
    public Looper i;
    int j;
    lpk k;
    int l;
    boolean m;
    min n;
    long o;
    long p;
    long q;
    long r;
    long s;
    public boolean t;
    public boolean u;
    String v;
    med w;

    public mex(final Context context) {
        this(context, new emyl() { // from class: men
            @Override // defpackage.emyl
            public final Object get() {
                return new mej(context);
            }
        }, new emyl() { // from class: meo
            @Override // defpackage.emyl
            public final Object get() {
                return new msy(context, new ncj());
            }
        });
    }

    public final ExoPlayer a() {
        lti.c(!this.u);
        this.u = true;
        return new mgl(this);
    }

    public final void b(final meg megVar) {
        lti.c(!this.u);
        this.f = new emyl() { // from class: mem
            @Override // defpackage.emyl
            public final Object get() {
                return meg.this;
            }
        };
    }

    public mex(final Context context, emyl emylVar, emyl emylVar2) {
        emyl emylVar3 = new emyl() { // from class: mer
            @Override // defpackage.emyl
            public final Object get() {
                return new mxd(context);
            }
        };
        emyl emylVar4 = new emyl() { // from class: mes
            @Override // defpackage.emyl
            public final Object get() {
                return new meg(new mxt(), 50000, 50000, 1000, 2000);
            }
        };
        emyl emylVar5 = new emyl() { // from class: met
            @Override // defpackage.emyl
            public final Object get() {
                return mxv.e(context);
            }
        };
        emwl emwlVar = new emwl() { // from class: meu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new mlh((ltn) obj);
            }
        };
        lti.f(context);
        this.a = context;
        this.c = emylVar;
        this.d = emylVar2;
        this.e = emylVar3;
        this.f = emylVar4;
        this.g = emylVar5;
        this.h = emwlVar;
        this.i = lvf.E();
        this.k = lpk.a;
        this.l = 1;
        this.m = true;
        this.n = min.b;
        this.o = 5000L;
        this.p = 15000L;
        this.q = 3000L;
        this.w = new med(lvf.u(20L), lvf.u(500L));
        this.b = ltn.a;
        this.r = 500L;
        this.s = 2000L;
        this.t = true;
        this.v = "";
        this.j = -1000;
        if (lvf.a >= 35) {
            int i = mek.a;
        }
    }
}
