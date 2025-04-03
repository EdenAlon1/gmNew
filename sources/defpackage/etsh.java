package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsh {
    public static final etsh a = (etsh) etto.a(new ettn() { // from class: etsf
        @Override // defpackage.ettn
        public final Object a() {
            etsh etshVar = new etsh();
            etshVar.f(new etrm(etrr.class, ettd.class, new etrn() { // from class: etsg
                @Override // defpackage.etrn
                public final etti a(etfs etfsVar) {
                    return ((etrr) etfsVar).a;
                }
            }));
            return etshVar;
        }
    });
    public final AtomicReference b = new AtomicReference(new ettm(new ettj()));

    public final etfs a(etti ettiVar, etgk etgkVar) {
        ettm ettmVar = (ettm) this.b.get();
        ettk ettkVar = new ettk(ettiVar.getClass(), ((ettd) ettiVar).b);
        if (ettmVar.b.containsKey(ettkVar)) {
            return ((etrl) ettmVar.b.get(ettkVar)).a(ettiVar, etgkVar);
        }
        throw new GeneralSecurityException(a.b(ettkVar, "No Key Parser for requested key type ", " available"));
    }

    public final etgf b(etti ettiVar) {
        ettm ettmVar = (ettm) this.b.get();
        ettk ettkVar = new ettk(ettiVar.getClass(), ((ette) ettiVar).a);
        if (ettmVar.d.containsKey(ettkVar)) {
            return ((etsl) ettmVar.d.get(ettkVar)).a(ettiVar);
        }
        throw new GeneralSecurityException(a.b(ettkVar, "No Parameters Parser for requested key type ", " available"));
    }

    public final etti c(etfs etfsVar, Class cls, etgk etgkVar) {
        ettm ettmVar = (ettm) this.b.get();
        ettl ettlVar = new ettl(etfsVar.getClass(), cls);
        if (ettmVar.a.containsKey(ettlVar)) {
            return ((etro) ettmVar.a.get(ettlVar)).a(etfsVar, etgkVar);
        }
        throw new GeneralSecurityException(a.b(ettlVar, "No Key serializer for ", " available"));
    }

    public final etti d(etgf etgfVar, Class cls) {
        ettm ettmVar = (ettm) this.b.get();
        ettl ettlVar = new ettl(etgfVar.getClass(), cls);
        if (ettmVar.c.containsKey(ettlVar)) {
            return ((etso) ettmVar.c.get(ettlVar)).a(etgfVar);
        }
        throw new GeneralSecurityException(a.b(ettlVar, "No Key Format serializer for ", " available"));
    }

    public final synchronized void e(etrl etrlVar) {
        ettj ettjVar = new ettj((ettm) this.b.get());
        ettk ettkVar = new ettk(etrlVar.c, etrlVar.b);
        if (ettjVar.b.containsKey(ettkVar)) {
            etrl etrlVar2 = (etrl) ettjVar.b.get(ettkVar);
            if (!etrlVar2.equals(etrlVar) || !etrlVar.equals(etrlVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ettkVar.toString()));
            }
        } else {
            ettjVar.b.put(ettkVar, etrlVar);
        }
        this.b.set(new ettm(ettjVar));
    }

    public final synchronized void f(etro etroVar) {
        ettj ettjVar = new ettj((ettm) this.b.get());
        ettl ettlVar = new ettl(etroVar.b, etroVar.c);
        if (ettjVar.a.containsKey(ettlVar)) {
            etro etroVar2 = (etro) ettjVar.a.get(ettlVar);
            if (!etroVar2.equals(etroVar) || !etroVar.equals(etroVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(ettlVar.toString()));
            }
        } else {
            ettjVar.a.put(ettlVar, etroVar);
        }
        this.b.set(new ettm(ettjVar));
    }

    public final synchronized void g(etsl etslVar) {
        ettj ettjVar = new ettj((ettm) this.b.get());
        ettk ettkVar = new ettk(etslVar.c, etslVar.b);
        if (ettjVar.d.containsKey(ettkVar)) {
            etsl etslVar2 = (etsl) ettjVar.d.get(ettkVar);
            if (!etslVar2.equals(etslVar) || !etslVar.equals(etslVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(ettkVar.toString()));
            }
        } else {
            ettjVar.d.put(ettkVar, etslVar);
        }
        this.b.set(new ettm(ettjVar));
    }

    public final synchronized void h(etso etsoVar) {
        ettj ettjVar = new ettj((ettm) this.b.get());
        ettl ettlVar = new ettl(etsoVar.b, etsoVar.c);
        if (ettjVar.c.containsKey(ettlVar)) {
            etso etsoVar2 = (etso) ettjVar.c.get(ettlVar);
            if (!etsoVar2.equals(etsoVar) || !etsoVar.equals(etsoVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(ettlVar.toString()));
            }
        } else {
            ettjVar.c.put(ettlVar, etsoVar);
        }
        this.b.set(new ettm(ettjVar));
    }
}
