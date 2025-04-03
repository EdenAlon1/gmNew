package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctha implements ctgw {
    public final cthd a;
    private final errl b;

    public ctha(cthd cthdVar, errl errlVar) {
        this.a = cthdVar;
        this.b = errlVar;
    }

    @Override // defpackage.ctgw
    public final elfl a(final String str) {
        final cthd cthdVar = this.a;
        emmt emmtVar = (emmt) cthdVar.f.b();
        emhu emhuVar = (emhu) emhv.a.createBuilder();
        emhw emhwVar = (emhw) emhx.a.createBuilder();
        String str2 = (String) cthd.b.e();
        emhwVar.copyOnWrite();
        emhx emhxVar = (emhx) emhwVar.instance;
        str2.getClass();
        emhxVar.b |= 1;
        emhxVar.c = str2;
        String str3 = (String) cthd.a.e();
        emhwVar.copyOnWrite();
        emhx emhxVar2 = (emhx) emhwVar.instance;
        str3.getClass();
        emhxVar2.b |= 2;
        emhxVar2.d = str3;
        emhuVar.copyOnWrite();
        emhv emhvVar = (emhv) emhuVar.instance;
        emhx emhxVar3 = (emhx) emhwVar.build();
        emhxVar3.getClass();
        emhvVar.c = emhxVar3;
        emhvVar.b |= 1;
        return new elfj(emmtVar.c((emhv) emhuVar.build())).f(new erow() { // from class: cthb
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj) {
                InputStream inputStream = (InputStream) obj;
                if (inputStream == null) {
                    return null;
                }
                emhi emhiVar = (emhi) eyfy.parseFrom(emhi.a, inputStream, eyfc.a());
                if (emhiVar == null) {
                    cthd.c.r("The new configuration is null: no change made to the grammar.");
                    return null;
                }
                cthd cthdVar2 = cthd.this;
                if (cthdVar2.d == emhiVar.d && cthdVar2.e.equals(emhiVar.c)) {
                    return null;
                }
                engr engrVar = new engr();
                try {
                    Iterator<E> it = emhiVar.b.iterator();
                    while (it.hasNext()) {
                        engrVar.h(new emib((emhg) it.next()));
                    }
                    cthdVar2.d = emhiVar.d;
                    cthdVar2.e = emhiVar.c;
                    cthdVar2.i = Optional.of(new emic(engrVar.g()));
                    return null;
                } catch (IllegalStateException | NullPointerException e) {
                    cthd.c.s("Could not reset grammar.", e);
                    return null;
                }
            }
        }, cthdVar.g).h().e(IOException.class, new emwl() { // from class: cthc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cthd.c.s("Could not parse input stream", (IOException) obj);
                return null;
            }
        }, cthdVar.h).h(new emwl() { // from class: ctgy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final engr engrVar = new engr();
                final String str4 = str;
                ctha.this.a.i.ifPresent(new Consumer() { // from class: ctgz
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        int i;
                        int i2;
                        int i3 = engw.d;
                        engr engrVar2 = new engr();
                        engw engwVar = ((emic) obj2).a;
                        int i4 = ((enou) engwVar).c;
                        int i5 = 0;
                        while (i5 < i4) {
                            emib emibVar = (emib) engwVar.get(i5);
                            engw engwVar2 = emibVar.a;
                            int i6 = ((enou) engwVar2).c;
                            int i7 = 0;
                            while (true) {
                                i = i5 + 1;
                                if (i7 < i6) {
                                    String str5 = str4;
                                    emia emiaVar = (emia) engwVar2.get(i7);
                                    Matcher matcher = emiaVar.a.matcher(str5);
                                    engr engrVar3 = new engr();
                                    while (matcher.find()) {
                                        String group = matcher.group(emiaVar.c);
                                        Pattern pattern = emiaVar.b;
                                        if (pattern == null || pattern.matcher(group).matches()) {
                                            engrVar3.h(new emhs(group, matcher.start()));
                                        }
                                    }
                                    engw g = engrVar3.g();
                                    int i8 = ((enou) g).c;
                                    int i9 = 0;
                                    while (true) {
                                        i2 = i7 + 1;
                                        if (i9 < i8) {
                                            emhz emhzVar = (emhz) g.get(i9);
                                            String b = emhzVar.b();
                                            int a = emhzVar.a();
                                            fbuj fbujVar = (fbuj) fbuk.a.createBuilder();
                                            fbujVar.copyOnWrite();
                                            ((fbuk) fbujVar.instance).h = a;
                                            int length = a + b.length();
                                            fbujVar.copyOnWrite();
                                            ((fbuk) fbujVar.instance).i = length;
                                            fbws fbwsVar = (fbws) fbwt.a.createBuilder();
                                            String str6 = emibVar.b;
                                            fbwsVar.copyOnWrite();
                                            fbwt fbwtVar = (fbwt) fbwsVar.instance;
                                            str6.getClass();
                                            fbwtVar.b = str6;
                                            fbujVar.copyOnWrite();
                                            fbuk fbukVar = (fbuk) fbujVar.instance;
                                            fbwt fbwtVar2 = (fbwt) fbwsVar.build();
                                            fbwtVar2.getClass();
                                            fbukVar.d = fbwtVar2;
                                            fbukVar.c = 13;
                                            String str7 = emibVar.b;
                                            fbujVar.copyOnWrite();
                                            fbuk fbukVar2 = (fbuk) fbujVar.instance;
                                            str7.getClass();
                                            fbukVar2.f = str7;
                                            fbqt fbqtVar = fbqt.SIMPLE_ANNOTATION;
                                            fbujVar.copyOnWrite();
                                            ((fbuk) fbujVar.instance).e = fbqtVar.a();
                                            engrVar2.h((fbuk) fbujVar.build());
                                            i9++;
                                        }
                                    }
                                    i7 = i2;
                                }
                            }
                            i5 = i;
                        }
                        engr.this.j(engrVar2.g());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return engrVar.g();
            }
        }, this.b);
    }
}
