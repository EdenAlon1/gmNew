package defpackage;

import android.net.Uri;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aolm {
    private final ffbr a;

    public aolm(ffbr ffbrVar) {
        this.a = new alxb(new ffbr() { // from class: aokv
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return true;
            }
        }, ffbrVar);
    }

    public static Uri a(aoku aokuVar) {
        Optional e = aokuVar.e();
        if (e.isPresent()) {
            return b((awui) e.get());
        }
        String i = aokuVar.i(true);
        if (i != null) {
            return Uri.parse("tel:".concat(i));
        }
        throw new IllegalArgumentException("No rcs identifier found in messaging identity");
    }

    public static Uri b(awui awuiVar) {
        if ((awuiVar.b & 2) == 0) {
            throw new IllegalArgumentException("No rcs identifier found in ChatEndpoint");
        }
        String str = awuiVar.d;
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                awuh b2 = awuh.b(awuiVar.c);
                if (b2 == null) {
                    b2 = awuh.UNKNOWN_TYPE;
                }
                throw new IllegalArgumentException("Unsupported endpoint type: ".concat(String.valueOf(b2.name())));
            }
            cskc cskcVar = cpdg.a;
            if (aoqw.h(str)) {
                return Uri.parse("sip:".concat(String.valueOf(str)));
            }
        }
        return Uri.parse("tel:".concat(String.valueOf(str)));
    }

    public static aora e(aoku aokuVar) {
        final aoqx aoqxVar = (aoqx) aora.a.createBuilder();
        aoqz a = aokuVar.a();
        aoqxVar.copyOnWrite();
        ((aora) aoqxVar.instance).c = a.a();
        String o = aokuVar.o();
        aoqxVar.copyOnWrite();
        ((aora) aoqxVar.instance).h = o;
        String n = aokuVar.n();
        if (n != null) {
            aoqxVar.copyOnWrite();
            ((aora) aoqxVar.instance).k = n;
        }
        String str = aokuVar.G().a;
        if (str != null) {
            aoqxVar.copyOnWrite();
            ((aora) aoqxVar.instance).f = str;
        }
        String j = aokuVar.j();
        if (j != null) {
            aoqxVar.copyOnWrite();
            ((aora) aoqxVar.instance).d = j;
        }
        String m = aokuVar.m(true);
        if (m != null) {
            aoqxVar.copyOnWrite();
            ((aora) aoqxVar.instance).e = m;
        }
        Optional c = aokuVar.c();
        aoqxVar.getClass();
        c.ifPresent(new Consumer() { // from class: aoky
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aoqx aoqxVar2 = aoqx.this;
                String str2 = (String) obj;
                aoqxVar2.copyOnWrite();
                aora aoraVar = (aora) aoqxVar2.instance;
                aora aoraVar2 = aora.a;
                str2.getClass();
                aoraVar.g = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        aokuVar.f().map(new Function() { // from class: aokz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ctvf) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).ifPresent(new Consumer() { // from class: aola
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aoqx aoqxVar2 = aoqx.this;
                String str2 = (String) obj;
                aoqxVar2.copyOnWrite();
                aora aoraVar = (aora) aoqxVar2.instance;
                aora aoraVar2 = aora.a;
                str2.getClass();
                aoraVar.j = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        aokuVar.g().ifPresent(new Consumer() { // from class: aolb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aoqx aoqxVar2 = aoqx.this;
                String str2 = (String) obj;
                aoqxVar2.copyOnWrite();
                aora aoraVar = (aora) aoqxVar2.instance;
                aora aoraVar2 = aora.a;
                str2.getClass();
                aoraVar.l = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        aokuVar.e().ifPresent(new Consumer() { // from class: aolc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aoqx aoqxVar2 = aoqx.this;
                awui awuiVar = (awui) obj;
                aoqxVar2.copyOnWrite();
                aora aoraVar = (aora) aoqxVar2.instance;
                aora aoraVar2 = aora.a;
                awuiVar.getClass();
                aoraVar.i = awuiVar;
                aoraVar.b |= 1;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return (aora) aoqxVar.build();
    }

    public static eyjv f(aoku aokuVar) {
        return new ProtoParsers.InternalDontUse(null, e(aokuVar));
    }

    public final aoku c(eyjv eyjvVar) {
        return d((aora) eyjvVar.a(aora.a, eyfc.a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aoku d(final defpackage.aora r19) {
        /*
            r18 = this;
            r0 = r19
            awui r1 = r0.i
            if (r1 != 0) goto L8
            awui r1 = defpackage.awui.a
        L8:
            int r1 = r1.b
            r1 = r1 & 2
            if (r1 == 0) goto L25
            awui r1 = r0.i
            if (r1 != 0) goto L15
            awui r2 = defpackage.awui.a
            goto L16
        L15:
            r2 = r1
        L16:
            int r2 = r2.b
            r2 = r2 & 1
            if (r2 == 0) goto L25
            if (r1 != 0) goto L20
            awui r1 = defpackage.awui.a
        L20:
            j$.util.Optional r1 = j$.util.Optional.of(r1)
            goto L29
        L25:
            j$.util.Optional r1 = j$.util.Optional.empty()
        L29:
            java.lang.String r2 = r0.g
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L36
            j$.util.Optional r2 = j$.util.Optional.empty()
            goto L3c
        L36:
            java.lang.String r2 = r0.g
            j$.util.Optional r2 = j$.util.Optional.of(r2)
        L3c:
            java.lang.String r3 = r0.j
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L49
            j$.util.Optional r3 = j$.util.Optional.empty()
            goto L58
        L49:
            ctvf r3 = new ctvf
            java.lang.String r4 = r0.j
            int r4 = java.lang.Integer.parseInt(r4)
            r3.<init>(r4)
            j$.util.Optional r3 = j$.util.Optional.of(r3)
        L58:
            java.lang.String r4 = r0.l
            j$.util.Optional r4 = j$.util.Optional.of(r4)
            aold r5 = new aold
            r5.<init>()
            j$.util.Optional r4 = r4.filter(r5)
            r5 = r18
            ffbr r6 = r5.a
            java.lang.Object r6 = r6.b()
            r7 = r6
            aokt r7 = (defpackage.aokt) r7
            r0.getClass()
            aolf r8 = new aolf
            r8.<init>()
            aolg r9 = new aolg
            r9.<init>()
            aolh r10 = new aolh
            r10.<init>()
            aoli r11 = new aoli
            r11.<init>()
            aolj r12 = new aolj
            r12.<init>()
            aolk r13 = new aolk
            r13.<init>()
            aoll r14 = new aoll
            r14.<init>()
            aokw r15 = new aokw
            r15.<init>()
            aokx r0 = new aokx
            r0.<init>()
            aole r1 = new aole
            r1.<init>()
            r16 = r0
            r17 = r1
            aoks r0 = r7.c(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aolm.d(aora):aoku");
    }
}
