package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctsj implements ctsa {
    private final ffbz a = ffca.a(new ffix() { // from class: ctsf
        @Override // defpackage.ffix
        public final Object invoke() {
            eygr eygrVar = ((emho) ctjd.ac.e()).b;
            eygrVar.getClass();
            ArrayList arrayList = new ArrayList(ffdx.n(eygrVar, 10));
            Iterator<E> it = eygrVar.iterator();
            while (it.hasNext()) {
                arrayList.add(ctsc.b((emhr) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Optional) obj).isPresent()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(ffdx.n(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add((ctsc) ((Optional) it2.next()).get());
            }
            return arrayList3;
        }
    });

    public static final fbwv b(String str, String str2, int i) {
        fbwu fbwuVar = (fbwu) fbwv.a.createBuilder();
        fbwuVar.getClass();
        fbqk.b(fbrc.REACTION_CLASSIFICATION, fbwuVar);
        fbvq fbvqVar = (fbvq) fbvt.a.createBuilder();
        fbvqVar.getClass();
        fbvqVar.copyOnWrite();
        ((fbvt) fbvqVar.instance).e = fbvr.a(4);
        str.getClass();
        fbvqVar.copyOnWrite();
        ((fbvt) fbvqVar.instance).b = str;
        str2.getClass();
        fbvqVar.copyOnWrite();
        ((fbvt) fbvqVar.instance).c = str2;
        fbvqVar.copyOnWrite();
        ((fbvt) fbvqVar.instance).d = fbvs.a(i);
        eyfy build = fbvqVar.build();
        build.getClass();
        fbwuVar.copyOnWrite();
        fbwv fbwvVar = (fbwv) fbwuVar.instance;
        fbwvVar.c = (fbvt) build;
        fbwvVar.b = 2;
        return fbqk.a(fbwuVar);
    }

    @Override // defpackage.ctsa
    public final Optional a(final String str) {
        Object obj;
        ekzz f = eleg.f("XmsReactionMessageClassifier#classify");
        try {
            ffoj ffojVar = new ffoj((ffok) ffno.i(ffdx.as((List) this.a.a()), new ffji() { // from class: ctsg
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    final ctsc ctscVar = (ctsc) obj2;
                    ctscVar.getClass();
                    String str2 = str;
                    Optional a = ctscVar.a(str2);
                    final ffji ffjiVar = new ffji() { // from class: ctsd
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            ctsb ctsbVar = (ctsb) obj3;
                            return ctsj.b(ctsbVar.b(), ctsbVar.a(), ctsc.this.a);
                        }
                    };
                    Optional map = a.map(new Function() { // from class: ctse
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            return ffji.this.invoke(obj3);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    if (true != map.isPresent()) {
                        map = null;
                    }
                    if (map != null) {
                        return map;
                    }
                    Optional a2 = ctscVar.a(str2 != null ? ffpc.aa(str2).toString() : null);
                    final ffji ffjiVar2 = new ffji() { // from class: ctsh
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            ctsb ctsbVar = (ctsb) obj3;
                            return ctsj.b(ffpc.aa(ctsbVar.b()).toString(), ffpc.aa(ctsbVar.a()).toString(), ctsc.this.a);
                        }
                    };
                    Optional map2 = a2.map(new Function() { // from class: ctsi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            return ffji.this.invoke(obj3);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    map2.getClass();
                    return map2;
                }
            }));
            while (true) {
                if (!ffojVar.hasNext()) {
                    obj = null;
                    break;
                }
                obj = ffojVar.next();
                if (((Optional) obj).isPresent()) {
                    break;
                }
            }
            Optional optional = (Optional) obj;
            if (optional == null) {
                optional = Optional.empty();
            }
            ffig.a(f, null);
            return optional;
        } finally {
        }
    }
}
