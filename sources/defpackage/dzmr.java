package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzmr extends dzpa {
    private dzpg a;
    private emxc b;
    private emxc c;
    private emxc d;
    private emxc e;
    private boolean f;
    private long g;
    private engw h;
    private engw i;
    private emxc j;
    private emxc k;
    private long l;
    private byte m;

    public dzmr() {
        emux emuxVar = emux.a;
        this.b = emuxVar;
        this.c = emuxVar;
        this.d = emuxVar;
        this.e = emuxVar;
        this.j = emuxVar;
        this.k = emuxVar;
    }

    @Override // defpackage.dzpa
    public final dzpb a() {
        dzpg dzpgVar;
        engw engwVar;
        engw engwVar2;
        if (this.m == 7 && (dzpgVar = this.a) != null && (engwVar = this.h) != null && (engwVar2 = this.i) != null) {
            return new dzms(dzpgVar, this.b, this.c, this.d, this.e, this.f, this.g, engwVar, engwVar2, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" contactId");
        }
        if ((this.m & 1) == 0) {
            sb.append(" isImageStale");
        }
        if ((this.m & 2) == 0) {
            sb.append(" expirationTimeMillis");
        }
        if (this.h == null) {
            sb.append(" menuItems");
        }
        if (this.i == null) {
            sb.append(" toolbarButtons");
        }
        if ((this.m & 4) == 0) {
            sb.append(" serverTimestampUs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzpa
    public final void b(String str) {
        this.c = emxc.j(str);
    }

    @Override // defpackage.dzpa
    public final void c(dzpg dzpgVar) {
        if (dzpgVar == null) {
            throw new NullPointerException("Null contactId");
        }
        this.a = dzpgVar;
    }

    @Override // defpackage.dzpa
    public final void d(dzpu dzpuVar) {
        this.j = emxc.j(dzpuVar);
    }

    @Override // defpackage.dzpa
    public final void e(long j) {
        this.g = j;
        this.m = (byte) (this.m | 2);
    }

    @Override // defpackage.dzpa
    public final void f(Bitmap bitmap) {
        this.e = emxc.j(bitmap);
    }

    @Override // defpackage.dzpa
    public final void g(String str) {
        this.d = emxc.j(str);
    }

    @Override // defpackage.dzpa
    public final void h(boolean z) {
        this.f = z;
        this.m = (byte) (this.m | 1);
    }

    @Override // defpackage.dzpa
    public final void i(dzqf dzqfVar) {
        this.k = emxc.j(dzqfVar);
    }

    @Override // defpackage.dzpa
    public final void j(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null menuItems");
        }
        this.h = engwVar;
    }

    @Override // defpackage.dzpa
    public final void k(String str) {
        this.b = emxc.j(str);
    }

    @Override // defpackage.dzpa
    public final void l(long j) {
        this.l = j;
        this.m = (byte) (this.m | 4);
    }

    @Override // defpackage.dzpa
    public final void m(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null toolbarButtons");
        }
        this.i = engwVar;
    }

    public dzmr(dzpb dzpbVar) {
        emux emuxVar = emux.a;
        this.b = emuxVar;
        this.c = emuxVar;
        this.d = emuxVar;
        this.e = emuxVar;
        this.j = emuxVar;
        this.k = emuxVar;
        dzms dzmsVar = (dzms) dzpbVar;
        this.a = dzmsVar.a;
        this.b = dzmsVar.b;
        this.c = dzmsVar.c;
        this.d = dzmsVar.d;
        this.e = dzmsVar.e;
        this.f = dzmsVar.f;
        this.g = dzmsVar.g;
        this.h = dzmsVar.h;
        this.i = dzmsVar.i;
        this.j = dzmsVar.j;
        this.k = dzmsVar.k;
        this.l = dzmsVar.l;
        this.m = (byte) 7;
    }
}
