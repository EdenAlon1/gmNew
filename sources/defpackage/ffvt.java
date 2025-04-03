package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffvt {
    public static final Object a(ffgu ffguVar) {
        Object obj;
        ffhd u = ffguVar.u();
        ffui.f(u);
        ffgu c = ffhi.c(ffguVar);
        fggk fggkVar = c instanceof fggk ? (fggk) c : null;
        if (fggkVar == null) {
            obj = ffcu.a;
        } else {
            if (fggkVar.a.ex(u)) {
                fggkVar.a(u, ffcu.a);
            } else {
                ffvs ffvsVar = new ffvs();
                fggkVar.a(u.plus(ffvsVar), ffcu.a);
                if (ffvsVar.b) {
                    ffcu ffcuVar = ffcu.a;
                    boolean z = ffso.a;
                    ThreadLocal threadLocal = ffvi.a;
                    ffti a = ffvi.a();
                    if (!a.r()) {
                        if (a.q()) {
                            fggkVar.c = ffcuVar;
                            fggkVar.e = 1;
                            a.o(fggkVar);
                            obj = ffhh.a;
                        } else {
                            a.p(true);
                            try {
                                fggkVar.run();
                                do {
                                } while (a.s());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = ffcu.a;
                }
            }
            obj = ffhh.a;
        }
        ffhh ffhhVar = ffhh.a;
        if (obj == ffhhVar) {
            ffguVar.getClass();
        }
        return obj == ffhhVar ? obj : ffcu.a;
    }
}
