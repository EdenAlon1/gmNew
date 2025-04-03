package defpackage;

import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avc implements bhg, bes {
    public final bfh a;

    public avc() {
        this(bfh.a());
    }

    public static avc a(bdp bdpVar) {
        return new avc(bfh.b(bdpVar));
    }

    public final avk b() {
        Integer num = (Integer) this.a.m(beo.d, null);
        if (num != null) {
            this.a.c(beq.C, num);
        } else if (avk.u(this.a)) {
            this.a.c(beq.C, 32);
        } else if (avk.v(this.a)) {
            this.a.c(beq.C, 32);
            this.a.c(beq.D, 256);
        } else if (avk.w(this.a)) {
            this.a.c(beq.C, 4101);
            this.a.c(beq.o, aua.a);
        } else {
            this.a.c(beq.C, 256);
        }
        beo c = c();
        ber.d(c);
        avk avkVar = new avk(c);
        Size size = (Size) this.a.m(beo.I, null);
        if (size != null) {
            avkVar.e = new Rational(size.getWidth(), size.getHeight());
        }
        ksw.i((Executor) this.a.m(beo.O, bjl.a()), "The IO executor can't be null");
        if (this.a.s(beo.b)) {
            Integer num2 = (Integer) this.a.l(beo.b);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                Objects.toString(num2);
                throw new IllegalArgumentException("The flash mode is not allowed to set: ".concat(String.valueOf(num2)));
            }
            if (num2.intValue() == 3 && this.a.m(beo.j, null) == null) {
                throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
            }
        }
        return avkVar;
    }

    @Override // defpackage.bhg
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final beo c() {
        return new beo(bfn.f(this.a));
    }

    @Override // defpackage.aub
    public final bfh f() {
        return this.a;
    }

    @Override // defpackage.bes
    @Deprecated
    public final /* bridge */ /* synthetic */ void g(Size size) {
        this.a.c(beo.I, size);
    }

    @Override // defpackage.bes
    public final /* bridge */ /* synthetic */ void h(int i) {
        this.a.c(beo.F, Integer.valueOf(i));
    }

    public final void i(Executor executor) {
        this.a.c(beo.O, executor);
    }

    @Override // defpackage.bes
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(boy boyVar) {
        this.a.c(bet.M, boyVar);
    }

    public final void k(String str) {
        this.a.c(beo.m, str);
    }

    private avc(bfh bfhVar) {
        this.a = bfhVar;
        Class cls = (Class) bfhVar.m(bli.n, null);
        if (cls != null && !cls.equals(avk.class)) {
            throw new IllegalArgumentException(a.j(cls, this, "Invalid target class configuration for ", ": "));
        }
        bfhVar.c(bhh.x, bhj.IMAGE_CAPTURE);
        bfhVar.c(beo.n, avk.class);
        if (bfhVar.m(beo.m, null) == null) {
            k(a.u(avk.class));
        }
    }
}
