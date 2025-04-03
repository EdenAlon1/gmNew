package defpackage;

import android.graphics.Bitmap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmv extends dzpj {
    public emxc a;
    private dzpt b;
    private emxc c;
    private emxc d;
    private emxc e;
    private boolean f;
    private long g;
    private long h;
    private boolean i;
    private Map j;
    private engw k;
    private long l;
    private long m;
    private eyee n;
    private long o;
    private long p;
    private byte q;

    public dzmv() {
        emux emuxVar = emux.a;
        this.c = emuxVar;
        this.d = emuxVar;
        this.e = emuxVar;
        this.a = emuxVar;
    }

    @Override // defpackage.dzpj
    public final dzpk a() {
        dzpt dzptVar;
        Map map;
        engw engwVar;
        eyee eyeeVar;
        if (this.q == -1 && (dzptVar = this.b) != null && (map = this.j) != null && (engwVar = this.k) != null && (eyeeVar = this.n) != null) {
            return new dzmw(dzptVar, this.c, this.d, this.e, this.f, this.g, this.h, this.i, map, this.a, engwVar, this.l, this.m, eyeeVar, this.o, this.p);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" conversationId");
        }
        if ((this.q & 1) == 0) {
            sb.append(" isImageStale");
        }
        if ((this.q & 2) == 0) {
            sb.append(" expirationTimeMillis");
        }
        if ((this.q & 4) == 0) {
            sb.append(" lastDeletedTimeMillis");
        }
        if ((this.q & 8) == 0) {
            sb.append(" blockable");
        }
        if (this.j == null) {
            sb.append(" appData");
        }
        if (this.k == null) {
            sb.append(" capabilities");
        }
        if ((this.q & 16) == 0) {
            sb.append(" propertiesExpirationTimeMillis");
        }
        if ((this.q & 32) == 0) {
            sb.append(" serverTimestampUs");
        }
        if (this.n == null) {
            sb.append(" conversationContext");
        }
        if ((this.q & 64) == 0) {
            sb.append(" createdTimestampMs");
        }
        if ((this.q & 128) == 0) {
            sb.append(" localUpdateTimestampMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzpj
    public final void b(Map map) {
        if (map == null) {
            throw new NullPointerException("Null appData");
        }
        this.j = map;
    }

    @Override // defpackage.dzpj
    public final void c(boolean z) {
        this.i = z;
        this.q = (byte) (this.q | 8);
    }

    @Override // defpackage.dzpj
    public final void d(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null capabilities");
        }
        this.k = engwVar;
    }

    @Override // defpackage.dzpj
    public final void e(eyee eyeeVar) {
        if (eyeeVar == null) {
            throw new NullPointerException("Null conversationContext");
        }
        this.n = eyeeVar;
    }

    @Override // defpackage.dzpj
    public final void f(dzpt dzptVar) {
        if (dzptVar == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.b = dzptVar;
    }

    @Override // defpackage.dzpj
    public final void g(long j) {
        this.o = j;
        this.q = (byte) (this.q | 64);
    }

    @Override // defpackage.dzpj
    public final void h(long j) {
        this.g = j;
        this.q = (byte) (this.q | 2);
    }

    @Override // defpackage.dzpj
    public final void i(Bitmap bitmap) {
        this.e = emxc.j(bitmap);
    }

    @Override // defpackage.dzpj
    public final void j(String str) {
        this.d = emxc.j(str);
    }

    @Override // defpackage.dzpj
    public final void k(boolean z) {
        this.f = z;
        this.q = (byte) (this.q | 1);
    }

    @Override // defpackage.dzpj
    public final void l(long j) {
        this.h = j;
        this.q = (byte) (this.q | 4);
    }

    @Override // defpackage.dzpj
    public final void m(long j) {
        this.p = j;
        this.q = (byte) (this.q | Byte.MIN_VALUE);
    }

    @Override // defpackage.dzpj
    public final void n(long j) {
        this.l = j;
        this.q = (byte) (this.q | 16);
    }

    @Override // defpackage.dzpj
    public final void o(long j) {
        this.m = j;
        this.q = (byte) (this.q | 32);
    }

    @Override // defpackage.dzpj
    public final void p(String str) {
        this.c = emxc.j(str);
    }

    public dzmv(dzpk dzpkVar) {
        emux emuxVar = emux.a;
        this.c = emuxVar;
        this.d = emuxVar;
        this.e = emuxVar;
        this.a = emuxVar;
        dzmw dzmwVar = (dzmw) dzpkVar;
        this.b = dzmwVar.a;
        this.c = dzmwVar.b;
        this.d = dzmwVar.c;
        this.e = dzmwVar.d;
        this.f = dzmwVar.e;
        this.g = dzmwVar.f;
        this.h = dzmwVar.g;
        this.i = dzmwVar.h;
        this.j = dzmwVar.i;
        this.a = dzmwVar.j;
        this.k = dzmwVar.k;
        this.l = dzmwVar.l;
        this.m = dzmwVar.m;
        this.n = dzmwVar.n;
        this.o = dzmwVar.o;
        this.p = dzmwVar.p;
        this.q = (byte) -1;
    }
}
