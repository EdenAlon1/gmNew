package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebun {
    public final emyl a;

    public ebun(emyl emylVar) {
        this.a = emys.a(emylVar);
    }

    public abstract void a(Runnable runnable);

    public final void b(final String str, final String str2) {
        a(new Runnable() { // from class: ebuk
            @Override // java.lang.Runnable
            public final void run() {
                ((efkw) ((ebvd) ebun.this.a.get()).i.get()).a(str, str2);
            }
        });
    }

    public final void c(final String str, final String str2, final String str3, final String str4, final boolean z) {
        a(new Runnable() { // from class: ebug
            @Override // java.lang.Runnable
            public final void run() {
                ((efkw) ((ebvd) ebun.this.a.get()).f.get()).a(str, str2, str3, str4, Boolean.valueOf(z));
            }
        });
    }

    public final void d(final String str, final String str2, final String str3) {
        a(new Runnable() { // from class: ebud
            @Override // java.lang.Runnable
            public final void run() {
                ((efkw) ((ebvd) ebun.this.a.get()).e.get()).a(str, str2, str3);
            }
        });
    }

    public final void e(final String str, final String str2, final int i, final String str3, final boolean z) {
        a(new Runnable() { // from class: ebue
            @Override // java.lang.Runnable
            public final void run() {
                ((efkw) ((ebvd) ebun.this.a.get()).d.get()).a(str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }

    public final void f(final String str, final boolean z, final boolean z2, final boolean z3, final int i, final String str2) {
        a(new Runnable() { // from class: ebul
            @Override // java.lang.Runnable
            public final void run() {
                ((efkw) ((ebvd) ebun.this.a.get()).c.get()).a(str, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i), str2);
            }
        });
    }

    public final void g(final double d, final String str, final String str2, final String str3, final String str4, final boolean z) {
        a(new Runnable() { // from class: ebuh
            @Override // java.lang.Runnable
            public final void run() {
                ((efky) ((ebvd) ebun.this.a.get()).h.get()).b(d, str, str2, str3, str4, Boolean.valueOf(z));
            }
        });
    }

    public final void h(final double d, final String str, final String str2, final int i, final String str3, final boolean z) {
        a(new Runnable() { // from class: ebui
            @Override // java.lang.Runnable
            public final void run() {
                ((efky) ((ebvd) ebun.this.a.get()).g.get()).b(d, str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }
}
