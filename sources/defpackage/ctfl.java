package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctfl {
    private final akzt a;
    private final alwx b;
    private final epll c;

    public ctfl(akzt akztVar, alwx alwxVar) {
        epll epllVar = (epll) eplp.a.createBuilder();
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplpVar.c = eplm.a(3);
        eplpVar.b |= 1;
        epllVar.copyOnWrite();
        eplp eplpVar2 = (eplp) epllVar.instance;
        eplpVar2.t = epln.a(5);
        eplpVar2.b |= 131072;
        this.c = epllVar;
        this.a = akztVar;
        this.b = alwxVar;
    }

    public final eplp a() {
        return (eplp) this.c.build();
    }

    public final void b() {
        final eplp eplpVar = (eplp) this.c.build();
        this.b.a.a(new Supplier() { // from class: alww
            @Override // java.util.function.Supplier
            public final Object get() {
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.BUGLE_TRANSCODING;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                eplp eplpVar2 = eplp.this;
                eplpVar2.getClass();
                eolvVar2.r = eplpVar2;
                eolvVar2.b |= 512;
                return eoluVar;
            }
        });
    }

    public final void c(int i) {
        epll epllVar = this.c;
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.b |= 128;
        eplpVar.j = i;
    }

    public final void d(String str) {
        epll epllVar = this.c;
        eplo a = alwv.a(str);
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.i = a.a();
        eplpVar.b |= 64;
    }

    public final void e(int i) {
        epll epllVar = this.c;
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.b |= 256;
        eplpVar.k = i;
    }

    public final void f(Duration duration) {
        float millis = duration.toMillis();
        float millis2 = TimeUnit.SECONDS.toMillis(1L);
        epll epllVar = this.c;
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.b |= 4;
        eplpVar.e = millis / millis2;
    }

    public final void g(int i) {
        epll epllVar = this.c;
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.b |= 8;
        eplpVar.f = i;
    }

    public final void h(int i) {
        epll epllVar = this.c;
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.b |= 32;
        eplpVar.h = i;
    }

    public final void i(int i) {
        epll epllVar = this.c;
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.b |= 262144;
        eplpVar.u = i;
    }

    public final void j(int i) {
        epll epllVar = this.c;
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.b |= 16;
        eplpVar.g = i;
    }

    public final void k(Duration duration) {
        float millis = duration.toMillis();
        float millis2 = TimeUnit.SECONDS.toMillis(1L);
        epll epllVar = this.c;
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.b |= 2;
        eplpVar.d = millis / millis2;
    }

    public final void l(int i) {
        epll epllVar = this.c;
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.b |= 65536;
        eplpVar.s = i;
    }

    public final void m(int i) {
        epll epllVar = this.c;
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.b |= 2048;
        eplpVar.n = i;
    }

    public final void n(String str) {
        epll epllVar = this.c;
        eplo a = alwv.a(str);
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.l = a.a();
        eplpVar.b |= 512;
    }

    public final void o(int i) {
        epll epllVar = this.c;
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.b |= 1024;
        eplpVar.m = i;
    }

    public final void p(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            epll epllVar = this.c;
            epllVar.copyOnWrite();
            eplp eplpVar = (eplp) epllVar.instance;
            eplp eplpVar2 = eplp.a;
            eplpVar.c = eplm.a(2);
            eplpVar.b = 1 | eplpVar.b;
            return;
        }
        if (i2 != 1) {
            epll epllVar2 = this.c;
            epllVar2.copyOnWrite();
            eplp eplpVar3 = (eplp) epllVar2.instance;
            eplp eplpVar4 = eplp.a;
            eplpVar3.c = eplm.a(4);
            eplpVar3.b = 1 | eplpVar3.b;
            return;
        }
        epll epllVar3 = this.c;
        epllVar3.copyOnWrite();
        eplp eplpVar5 = (eplp) epllVar3.instance;
        eplp eplpVar6 = eplp.a;
        eplpVar5.c = eplm.a(3);
        eplpVar5.b = 1 | eplpVar5.b;
    }

    public final void q(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            this.a.e("Bugle.Media.Attachment.Resize.Failure.Video.Error.Counts", 1);
            return;
        }
        if (i2 == 2) {
            this.a.e("Bugle.Media.Attachment.Resize.Failure.Video.Error.Counts", 2);
        } else if (i2 != 3) {
            this.a.e("Bugle.Media.Attachment.Resize.Failure.Video.Error.Counts", 4);
        } else {
            this.a.e("Bugle.Media.Attachment.Resize.Failure.Video.Error.Counts", 3);
        }
    }

    public final void r(int i) {
        int i2;
        switch (i - 1) {
            case 1:
                i2 = 3;
                break;
            case 2:
                i2 = 5;
                break;
            case 3:
                i2 = 6;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 7;
                break;
            case 6:
                i2 = 8;
                break;
            case 7:
                i2 = 9;
                break;
            case 8:
                i2 = 10;
                break;
            case 9:
                i2 = 14;
                break;
            case 10:
                i2 = 15;
                break;
            case 11:
                i2 = 16;
                break;
            case 12:
                i2 = 17;
                break;
            default:
                i2 = 18;
                break;
        }
        epll epllVar = this.c;
        epllVar.copyOnWrite();
        eplp eplpVar = (eplp) epllVar.instance;
        eplp eplpVar2 = eplp.a;
        eplpVar.v = eplk.a(i2);
        eplpVar.b |= 524288;
    }
}
