package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eith implements dvwe {
    public final emxc a;
    private final eixo b;
    private final Executor c;

    public eith(eixo eixoVar, Executor executor, emxc emxcVar) {
        this.b = eixoVar;
        this.c = executor;
        this.a = emxcVar;
    }

    @Override // defpackage.dvwe
    public final ListenableFuture a(dvwk dvwkVar) {
        eyfw checkIsLite;
        if (dvwkVar instanceof dvvy) {
            return ((dvvy) dvwkVar).a();
        }
        if (dvwkVar instanceof dvzx) {
            dvxr a = ((dvzx) dvwkVar).a();
            checkIsLite = eyfy.checkIsLite(eitc.a);
            a.b(checkIsLite);
            Object l = a.r.l(checkIsLite.d);
            eitb eitbVar = (eitb) (l == null ? checkIsLite.b : checkIsLite.c(l));
            if (eitbVar.d) {
                return erqt.i(new dvvz(3, null));
            }
            if ((eitbVar.b & 1) != 0) {
                return erny.f(ernq.f(erqc.o(this.b.c(eisx.b(eitbVar.c))), Exception.class, new emwl() { // from class: eitf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return null;
                    }
                }, this.c), eldl.a(new emwl() { // from class: eitg
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        eixn eixnVar = (eixn) obj;
                        if (eixnVar == null) {
                            return new dvvz(4, null);
                        }
                        eith eithVar = eith.this;
                        String str = eixnVar.b().k;
                        if (((String) ((emxn) eithVar.a).a).equals(str)) {
                            return dvvz.a(eixnVar.b().g);
                        }
                        if ("pseudonymous".equals(str)) {
                            return new dvvz(2, null);
                        }
                        if ("incognito".equals(str)) {
                            return new dvvz(3, null);
                        }
                        return null;
                    }
                }), this.c);
            }
        }
        return erqt.i(null);
    }
}
