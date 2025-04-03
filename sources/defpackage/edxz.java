package defpackage;

import android.os.Build;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edxz {
    public static final /* synthetic */ int a = 0;
    private static final enhk b;
    private final emto c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("arm64-v8a", emtl.ARM_64);
        enhdVar.k("armeabi-v7a", emtl.ARM_32);
        enhdVar.k("x86_64", emtl.X86_64);
        enhdVar.k("x86", emtl.X86_32);
        b = enhdVar.c();
    }

    public edxz(String str) {
        emtm emtmVar = (emtm) emto.a.createBuilder();
        String str2 = Build.BOARD;
        emtmVar.copyOnWrite();
        emto emtoVar = (emto) emtmVar.instance;
        str2.getClass();
        emtoVar.d = str2;
        String str3 = Build.VERSION.RELEASE;
        emtmVar.copyOnWrite();
        emto emtoVar2 = (emto) emtmVar.instance;
        str3.getClass();
        emtoVar2.f = str3;
        emtmVar.copyOnWrite();
        ((emto) emtmVar.instance).b = emtn.a(5);
        if (Build.SUPPORTED_ABIS.length > 0) {
            enhk enhkVar = b;
            if (enhkVar.containsKey(emuz.c(Build.SUPPORTED_ABIS[0]))) {
                emtl emtlVar = (emtl) enhkVar.getOrDefault(emuz.c(Build.SUPPORTED_ABIS[0]), emtl.UNKNOWN_ARCH);
                emtmVar.copyOnWrite();
                ((emto) emtmVar.instance).c = emtlVar.a();
            }
        }
        if (!emxe.c(str)) {
            emtmVar.copyOnWrite();
            ((emto) emtmVar.instance).g = str;
        }
        this.c = (emto) emtmVar.build();
    }

    public final emto a(final emtc emtcVar, enjc enjcVar) {
        emtm emtmVar = (emtm) emto.a.createBuilder();
        Iterator<E> it = new eygk(emtcVar.n, emtc.a).iterator();
        while (it.hasNext()) {
            int i = 0;
            switch ((emtp) it.next()) {
                case OS:
                    int i2 = this.c.b;
                    if (i2 == 0) {
                        i = 2;
                    } else if (i2 == 1) {
                        i = 3;
                    } else if (i2 == 2) {
                        i = 4;
                    } else if (i2 == 3) {
                        i = 5;
                    }
                    int i3 = i != 0 ? i : 1;
                    emtmVar.copyOnWrite();
                    ((emto) emtmVar.instance).b = emtn.a(i3);
                    break;
                case ARCH:
                    int i4 = this.c.c;
                    emtl emtlVar = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? null : emtl.ARM_32 : emtl.X86_32 : emtl.X86 : emtl.ARM_64 : emtl.X86_64 : emtl.UNKNOWN_ARCH;
                    if (emtlVar == null) {
                        emtlVar = emtl.UNRECOGNIZED;
                    }
                    emtmVar.copyOnWrite();
                    ((emto) emtmVar.instance).c = emtlVar.a();
                    break;
                case BOARD_NAME:
                    String str = this.c.d;
                    emtmVar.copyOnWrite();
                    emto emtoVar = (emto) emtmVar.instance;
                    str.getClass();
                    emtoVar.d = str;
                    break;
                case PRODUCT_NAME:
                    String str2 = this.c.e;
                    emtmVar.copyOnWrite();
                    emto emtoVar2 = (emto) emtmVar.instance;
                    str2.getClass();
                    emtoVar2.e = str2;
                    break;
                case SYSTEM_VERSION:
                    String str3 = this.c.f;
                    emtmVar.copyOnWrite();
                    emto emtoVar3 = (emto) emtmVar.instance;
                    str3.getClass();
                    emtoVar3.f = str3;
                    break;
                case APP_VERSION:
                    String str4 = this.c.g;
                    emtmVar.copyOnWrite();
                    emto emtoVar4 = (emto) emtmVar.instance;
                    str4.getClass();
                    emtoVar4.g = str4;
                    break;
                case CHANNEL:
                    String str5 = this.c.h;
                    emtmVar.copyOnWrite();
                    emto emtoVar5 = (emto) emtmVar.instance;
                    str5.getClass();
                    emtoVar5.h = str5;
                    break;
                case BUILD_TYPE:
                    int i5 = this.c.i;
                    if (i5 == 0) {
                        i = 2;
                    } else if (i5 == 1) {
                        i = 3;
                    } else if (i5 == 2) {
                        i = 4;
                    } else if (i5 == 3) {
                        i = 5;
                    } else if (i5 == 4) {
                        i = 6;
                    }
                    if (i == 0) {
                        i = 1;
                    }
                    emtmVar.copyOnWrite();
                    emto emtoVar6 = (emto) emtmVar.instance;
                    if (i == 1) {
                        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                    }
                    emtoVar6.i = i - 2;
                    break;
                case EXPERIMENT_IDS:
                    Stream filter = Collection.EL.stream(enjcVar).filter(new Predicate() { // from class: edxy
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
                            int i6 = edxz.a;
                            return emtc.this.o.contains((Long) obj);
                        }
                    });
                    int i6 = engw.d;
                    Iterable iterable = (Iterable) filter.collect(endq.a);
                    emtmVar.copyOnWrite();
                    emto emtoVar7 = (emto) emtmVar.instance;
                    eygl eyglVar = emtoVar7.j;
                    if (!eyglVar.c()) {
                        emtoVar7.j = eyfy.mutableCopy(eyglVar);
                    }
                    eydl.addAll(iterable, emtoVar7.j);
                    break;
                case UNRECOGNIZED:
                    throw new AssertionError("Unrecognized SystemProfileField");
            }
        }
        return (emto) emtmVar.build();
    }
}
