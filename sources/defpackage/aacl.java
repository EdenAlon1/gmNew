package defpackage;

import j$.time.Duration;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aacl implements aaum {
    private static final ffjm b = new ffjm() { // from class: aacd
        @Override // defpackage.ffjm
        public final Object a(Object obj, Object obj2) {
            alxr alxrVar = (alxr) obj;
            alxr alxrVar2 = (alxr) obj2;
            alxrVar.getClass();
            alxrVar2.getClass();
            return Boolean.valueOf(zro.c(alxrVar, alxrVar2));
        }
    };
    private static final ffjm c = new ffjm() { // from class: aace
        @Override // defpackage.ffjm
        public final Object a(Object obj, Object obj2) {
            alxr alxrVar = (alxr) obj;
            alxr alxrVar2 = (alxr) obj2;
            alxrVar.getClass();
            alxrVar2.getClass();
            boolean z = false;
            if ((aack.c(alxrVar.g()) || (alxrVar instanceof aaca)) && aack.c(alxrVar2.g())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    };
    private static final ffjm d = new ffjm() { // from class: aacf
        @Override // defpackage.ffjm
        public final Object a(Object obj, Object obj2) {
            alxr alxrVar = (alxr) obj;
            alxr alxrVar2 = (alxr) obj2;
            alxrVar.getClass();
            alxrVar2.getClass();
            return Boolean.valueOf(alxrVar.a() == alxrVar2.a());
        }
    };
    private static final ffjm e = new ffjm() { // from class: aacg
        @Override // defpackage.ffjm
        public final Object a(Object obj, Object obj2) {
            alxr alxrVar = (alxr) obj;
            alxr alxrVar2 = (alxr) obj2;
            alxrVar.getClass();
            alxrVar2.getClass();
            boolean z = false;
            if (alxrVar.q() == null && alxrVar2.q() == null) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    };
    private static final ffjm f = new ffjm() { // from class: aach
        @Override // defpackage.ffjm
        public final Object a(Object obj, Object obj2) {
            alxr alxrVar = (alxr) obj;
            alxr alxrVar2 = (alxr) obj2;
            alxrVar.getClass();
            alxrVar2.getClass();
            boolean z = false;
            if (alxrVar.e() == null && alxrVar2.e() == null) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    };
    private static final ffjm g = new ffjm() { // from class: aaci
        @Override // defpackage.ffjm
        public final Object a(Object obj, Object obj2) {
            alxr alxrVar = (alxr) obj;
            alxr alxrVar2 = (alxr) obj2;
            alxrVar.getClass();
            alxrVar2.getClass();
            boolean z = true;
            if (cubs.f() && (aack.b(alxrVar.g()) || aack.b(alxrVar2.g()))) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    };
    private static final ffjm h = new ffjm() { // from class: aacj
        @Override // defpackage.ffjm
        public final Object a(Object obj, Object obj2) {
            alxr alxrVar = (alxr) obj;
            alxr alxrVar2 = (alxr) obj2;
            alxrVar.getClass();
            alxrVar2.getClass();
            boolean z = false;
            if (aack.a(alxrVar) && aack.a(alxrVar2)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    };
    public final ffbr a;
    private final aspz i;
    private final ffjm j;

    public aacl(aspz aspzVar, ffbr ffbrVar) {
        ffbrVar.getClass();
        this.i = aspzVar;
        this.a = ffbrVar;
        this.j = new ffjm() { // from class: aacc
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                alxr alxrVar = (alxr) obj;
                alxr alxrVar2 = (alxr) obj2;
                alxrVar.getClass();
                alxrVar2.getClass();
                Duration abs = Duration.between(alxrVar.n(), alxrVar2.n()).abs();
                Object b2 = aacl.this.a.b();
                b2.getClass();
                return Boolean.valueOf(abs.compareTo(Duration.ofSeconds(((Number) b2).longValue())) < 0);
            }
        };
    }

    @Override // defpackage.aaum
    public final /* synthetic */ alxr a(alxr alxrVar, alxr alxrVar2) {
        return new aaca(alxrVar, alxrVar2);
    }

    @Override // defpackage.aaum
    public final boolean b(alxr alxrVar, alxr alxrVar2) {
        if (!this.i.a()) {
            return false;
        }
        List g2 = ffdx.g(b, c, d, this.j, e, f, g, h);
        if (g2.isEmpty()) {
            return true;
        }
        Iterator it = g2.iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((ffjm) it.next()).a(alxrVar, alxrVar2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
