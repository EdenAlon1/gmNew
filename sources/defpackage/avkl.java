package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avkl {
    public final engw a;
    public final boolean b;
    private final Optional c;

    public avkl(awui awuiVar) {
        this.a = engw.r(awuiVar);
        this.c = Optional.empty();
        this.b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r3.a.size() == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.awui a() {
        /*
            r3 = this;
            boolean r0 = r3.d()
            r1 = 0
            if (r0 != 0) goto L11
            engw r0 = r3.a
            int r0 = r0.size()
            r2 = 1
            if (r0 != r2) goto L11
            goto L12
        L11:
            r2 = r1
        L12:
            java.lang.String r0 = "Recipients descriptor is not for 1 to 1 chat"
            defpackage.emxf.m(r2, r0)
            engw r0 = r3.a
            java.lang.Object r0 = r0.get(r1)
            awui r0 = (defpackage.awui) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avkl.a():awui");
    }

    public final awwf b() {
        emxf.m(this.c.isPresent(), "Recipients descriptor is not for group chat");
        return (awwf) this.c.get();
    }

    public final engw c() {
        emxf.m(this.c.isPresent(), "Recipients descriptor is not for group chat");
        return this.a;
    }

    public final boolean d() {
        return this.c.isPresent();
    }

    public avkl(awwf awwfVar, engw engwVar, boolean z) {
        this.a = engwVar;
        this.c = Optional.of(awwfVar);
        this.b = z;
    }
}
