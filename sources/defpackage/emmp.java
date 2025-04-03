package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Random;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emmp {
    public static final enru a = enru.c("com/google/chat/smartmessaging/smartreply/android/emotivecontentproviders/StickerProvider");
    public final enhk b;
    public engw c;
    private final enhk d;
    private String e;
    private final Random f;

    public emmp(enhk enhkVar, enhk enhkVar2, String str, engw engwVar, Random random) {
        this.e = "";
        int i = engw.d;
        engw engwVar2 = enou.a;
        this.d = enhkVar;
        this.b = enhkVar2;
        this.e = str;
        this.c = engwVar;
        this.f = random;
    }

    public static engw a(String str) {
        return engw.n(emye.b(',').f().a().i(str));
    }

    public static int c(String str) {
        if (str.toLowerCase().endsWith(".gif")) {
            return 5;
        }
        if (str.toLowerCase().endsWith(".png")) {
            return 4;
        }
        return str.toLowerCase().endsWith(".webp") ? 3 : 2;
    }

    public final ewnk b(String str, final String str2, String str3, final engw engwVar) {
        if (!this.e.equals(str3)) {
            this.c = a(str3);
            this.e = str3;
        }
        ewnk ewnkVar = ewnk.a;
        String lowerCase = str.toLowerCase();
        if (this.d.containsKey(lowerCase)) {
            enhk enhkVar = this.d;
            Optional empty = Optional.empty();
            Stream filter = Collection.EL.stream((engw) enhkVar.get(lowerCase)).filter(new Predicate() { // from class: emlz
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    emmp emmpVar = emmp.this;
                    String str4 = (String) obj;
                    if (emmpVar.c.contains(str4) || !emmpVar.b.containsKey(str4)) {
                        return false;
                    }
                    ewmw ewmwVar = ((ewnk) emmpVar.b.get(str4)).g;
                    if (ewmwVar == null) {
                        ewmwVar = ewmw.a;
                    }
                    return !engwVar.contains(ewmwVar.c);
                }
            });
            int i = engw.d;
            engw engwVar2 = (engw) filter.collect(endq.a);
            if (str2 != null) {
                empty = Collection.EL.stream(engwVar2).filter(new Predicate() { // from class: emmg
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        ewmw ewmwVar = ((ewnk) emmp.this.b.get((String) obj)).g;
                        if (ewmwVar == null) {
                            ewmwVar = ewmw.a;
                        }
                        return str2.equals(ewmwVar.c);
                    }
                }).findAny();
            }
            if (!engwVar2.isEmpty()) {
                if (!empty.isEmpty()) {
                    return (ewnk) this.b.get(empty.get());
                }
                return (ewnk) this.b.getOrDefault(engwVar2.get(this.f.nextInt(engwVar2.size())), ewnk.a);
            }
        }
        return ewnkVar;
    }
}
