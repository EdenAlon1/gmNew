package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgy extends dzha {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private emxc g;
    private emxc h;

    public dzgy() {
        emux emuxVar = emux.a;
        this.g = emuxVar;
        this.h = emuxVar;
    }

    @Override // defpackage.dzha
    public final dzhb a() {
        if (this.a != null && this.b != null && this.c != null && this.d != null && this.e != null && this.f != null) {
            return new dzgz(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" messageText");
        }
        if (this.b == null) {
            sb.append(" title");
        }
        if (this.c == null) {
            sb.append(" description");
        }
        if (this.d == null) {
            sb.append(" imageUrl");
        }
        if (this.e == null) {
            sb.append(" domain");
        }
        if (this.f == null) {
            sb.append(" canonicalUrl");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzha
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null canonicalUrl");
        }
        this.f = str;
    }

    @Override // defpackage.dzha
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.c = str;
    }

    @Override // defpackage.dzha
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null domain");
        }
        this.e = str;
    }

    @Override // defpackage.dzha
    public final void e(long j) {
        this.h = emxc.j(Long.valueOf(j));
    }

    @Override // defpackage.dzha
    public final void f(Bitmap bitmap) {
        this.g = emxc.j(bitmap);
    }

    @Override // defpackage.dzha
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.d = str;
    }

    @Override // defpackage.dzha
    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null messageText");
        }
        this.a = str;
    }

    @Override // defpackage.dzha
    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.b = str;
    }

    public dzgy(dzhb dzhbVar) {
        emux emuxVar = emux.a;
        this.g = emuxVar;
        this.h = emuxVar;
        dzgz dzgzVar = (dzgz) dzhbVar;
        this.a = dzgzVar.a;
        this.b = dzgzVar.b;
        this.c = dzgzVar.c;
        this.d = dzgzVar.d;
        this.e = dzgzVar.e;
        this.f = dzgzVar.f;
        this.g = dzgzVar.g;
        this.h = dzgzVar.h;
    }
}
