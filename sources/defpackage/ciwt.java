package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class ciwt {
    public static ciwr t() {
        citb citbVar = new citb();
        citbVar.b(ciws.BASIC_STYLE);
        citbVar.b = Optional.empty();
        citbVar.c = Optional.empty();
        citbVar.m = Optional.empty();
        citbVar.o = Optional.empty();
        citbVar.n = Optional.empty();
        citbVar.f = Optional.empty();
        citbVar.l = Optional.empty();
        citbVar.i = Optional.empty();
        citbVar.d = Optional.empty();
        citbVar.e = Optional.empty();
        citbVar.j = Optional.empty();
        citbVar.h = Optional.empty();
        citbVar.k = Optional.empty();
        citbVar.g = Optional.empty();
        return citbVar;
    }

    public static ciwr u(cixt cixtVar, List list, CharSequence charSequence, Boolean bool) {
        citb citbVar = new citb();
        citbVar.b(ciws.MESSAGING_STYLE);
        citbVar.b = Optional.empty();
        citbVar.c = Optional.empty();
        citbVar.i = Optional.of(cixtVar);
        citbVar.g = Optional.of(engw.n(list));
        citbVar.l = Optional.empty();
        citbVar.o = Optional.empty();
        citbVar.f = Optional.empty();
        citbVar.p = Optional.empty();
        citbVar.n = Optional.empty();
        citbVar.d = Optional.empty();
        citbVar.e = Optional.empty();
        citbVar.j = Optional.of(charSequence);
        citbVar.h = Optional.empty();
        citbVar.k = Optional.of(bool);
        citbVar.m = Optional.empty();
        return citbVar;
    }

    public abstract int a();

    public abstract IconCompat b();

    public abstract ciws c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract Optional i();

    public abstract Optional j();

    public abstract Optional k();

    public abstract Optional l();

    public abstract Optional m();

    public abstract Optional n();

    public abstract Optional o();

    public abstract Optional p();

    public abstract Optional q();

    public abstract Optional r();

    public abstract CharSequence s();
}
