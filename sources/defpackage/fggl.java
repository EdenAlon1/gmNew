package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fggl {
    public static final fgho a = new fgho("UNDEFINED");
    public static final fgho b = new fgho("REUSABLE_CLAIMED");

    public static final void a(ffgu ffguVar, Object obj) {
        if (!(ffguVar instanceof fggk)) {
            ffguVar.w(obj);
            return;
        }
        fggk fggkVar = (fggk) ffguVar;
        Object b2 = ffrv.b(obj);
        if (fggkVar.a.ex(fggkVar.u())) {
            fggkVar.c = b2;
            fggkVar.e = 1;
            fggkVar.a.a(fggkVar.u(), fggkVar);
            return;
        }
        boolean z = ffso.a;
        ThreadLocal threadLocal = ffvi.a;
        ffti a2 = ffvi.a();
        if (a2.q()) {
            fggkVar.c = b2;
            fggkVar.e = 1;
            a2.o(fggkVar);
            return;
        }
        a2.p(true);
        try {
            ffud ffudVar = (ffud) fggkVar.u().get(ffud.c);
            if (ffudVar == null || ffudVar.v()) {
                ffgu ffguVar2 = fggkVar.b;
                Object obj2 = fggkVar.d;
                ffhd u = ffguVar2.u();
                Object b3 = fghv.b(u, obj2);
                ffvo c = b3 != fghv.a ? ffsa.c(ffguVar2, u, b3) : null;
                try {
                    fggkVar.b.w(obj);
                } finally {
                    if (c == null || c.f()) {
                        fghv.c(u, b3);
                    }
                }
            } else {
                fggkVar.w(ffci.a(ffudVar.p()));
            }
            while (a2.s()) {
            }
        } catch (Throwable th) {
            try {
                fggkVar.K(th);
            } finally {
                a2.n(true);
            }
        }
    }
}
