package defpackage;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drqt {
    public static final drme a(drqq drqqVar) {
        int ordinal = drqqVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return drme.a;
            }
            if (ordinal == 2) {
                return drme.b;
            }
            if (ordinal == 3) {
                return drme.c;
            }
            if (ordinal == 4) {
                return drme.d;
            }
            if (ordinal != 5) {
                throw new ffcd();
            }
        }
        Class<?> cls = drqqVar.getClass();
        int i = fflc.a;
        ffkb ffkbVar = new ffkb(cls);
        ffkbVar.toString();
        throw new IllegalStateException("Unknown media quality in serialized media: ".concat(ffkbVar.toString()));
    }

    public static final void b(drqu drquVar, drqr drqrVar) {
        String str = drqrVar.d;
        str.getClass();
        drquVar.j(drjz.d(str));
        drqq b = drqq.b(drqrVar.c);
        if (b == null) {
            b = drqq.UNRECOGNIZED;
        }
        b.getClass();
        drquVar.o(a(b));
        String str2 = drqrVar.e;
        str2.getClass();
        drquVar.u(str2);
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(drqrVar.f);
        if (true == unmodifiableMap.isEmpty()) {
            unmodifiableMap = null;
        }
        drquVar.k(unmodifiableMap);
        drquVar.r(drqrVar.i);
    }

    public static final void c(drqu drquVar, drqs drqsVar, ffjm ffjmVar) {
        eygr eygrVar = drqsVar.b;
        eygrVar.getClass();
        Object T = ffdx.T(eygrVar);
        T.getClass();
        ffjmVar.a(drquVar, T);
    }

    public static final void d(drqx drqxVar, drqr drqrVar) {
        b(drqxVar, drqrVar);
        drqxVar.v(drqrVar.g);
        drqxVar.l(drqrVar.h);
    }

    public static final drqs e(List list) {
        drqn drqnVar = (drqn) drqs.a.createBuilder();
        drqnVar.getClass();
        DesugarCollections.unmodifiableList(((drqs) drqnVar.instance).b).getClass();
        drqnVar.copyOnWrite();
        drqs drqsVar = (drqs) drqnVar.instance;
        eygr eygrVar = drqsVar.b;
        if (!eygrVar.c()) {
            drqsVar.b = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(list, drqsVar.b);
        eyfy build = drqnVar.build();
        build.getClass();
        return (drqs) build;
    }
}
