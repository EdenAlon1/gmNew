package defpackage;

import android.content.Context;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyes implements dydc, dyfl, dyfm {
    public final dyfn a;
    public final Context b;
    public final dfpi c;
    public final dyfk d;
    public final dycv e;
    public final dyez f;
    private final Map g = new LinkedHashMap();
    private final Object h = new Object();

    public dyes(dyfn dyfnVar, Context context, dyfk dyfkVar, dycv dycvVar, dfpi dfpiVar, dyez dyezVar) {
        this.a = dyfnVar;
        this.b = context;
        this.d = dyfkVar;
        this.e = dycvVar;
        this.c = dfpiVar;
        this.f = dyezVar;
    }

    public static boolean o(dyff dyffVar) {
        dyfe dyfeVar = dyffVar.c;
        if (dyfeVar == null) {
            dyfeVar = dyfe.a;
        }
        return !dyfeVar.equals(dyfe.a);
    }

    public static boolean p(dyff dyffVar) {
        return !dyff.a.equals(dyffVar);
    }

    public static boolean q(dyff dyffVar, dydb dydbVar) {
        ewrq ewrqVar = dyffVar.b;
        if (ewrqVar == null) {
            ewrqVar = ewrq.a;
        }
        eisq a = dygu.a(ewrqVar);
        if (a != null) {
            return ((dycx) dydbVar).a || !a.e;
        }
        return false;
    }

    private final ListenableFuture r() {
        return elfl.g(s()).i(new eroh() { // from class: dydy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dyff dyffVar = (dyff) obj;
                return dyes.p(dyffVar) ? erqt.i(dyffVar) : dyes.this.l();
            }
        }, erpp.a).h(new emwl() { // from class: dydz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ewrq ewrqVar = ((dyff) obj).b;
                return ewrqVar == null ? ewrq.a : ewrqVar;
            }
        }, erpp.a);
    }

    private final ListenableFuture s() {
        return elfl.g(this.e.a()).f(IOException.class, new eroh() { // from class: dydv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                IOException iOException = (IOException) obj;
                if (emyt.b(iOException) instanceof FileNotFoundException) {
                    return dyes.this.l();
                }
                throw iOException;
            }
        }, erpp.a);
    }

    private final ListenableFuture t(byte[] bArr, ewsd ewsdVar) {
        eisa eisaVar = (eisa) eisc.a.createBuilder();
        eisaVar.copyOnWrite();
        eisc eiscVar = (eisc) eisaVar.instance;
        eygi eygiVar = eiscVar.b;
        if (!eygiVar.c()) {
            eiscVar.b = eyfy.mutableCopy(eygiVar);
        }
        dyfn dyfnVar = this.a;
        eiscVar.b.h(2);
        ewsdVar.copyOnWrite();
        ewse ewseVar = (ewse) ewsdVar.instance;
        eisc eiscVar2 = (eisc) eisaVar.build();
        ewse ewseVar2 = ewse.a;
        eiscVar2.getClass();
        ewseVar.f = eiscVar2;
        ewseVar.b |= 4;
        eyee x = eyee.x(bArr);
        ewsdVar.copyOnWrite();
        ((ewse) ewsdVar.instance).d = x;
        ewsdVar.copyOnWrite();
        ((ewse) ewsdVar.instance).c = 2;
        dyft dyftVar = (dyft) dyfnVar;
        return elfr.k(duin.a(((dhep) dyftVar.a).b(3, ((ewse) ewsdVar.build()).toByteArray(), new SyncOptions(), dyftVar.b, true, 15901)), new eroh() { // from class: dyfq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                eyfc eyfcVar = eyfc.a;
                eyib eyibVar = eyib.a;
                eyfc eyfcVar2 = eyfc.a;
                return erqt.i((ewsg) eyfy.parseFrom(ewsg.a, (byte[]) obj, eyfcVar2));
            }
        }, erpp.a);
    }

    @Override // defpackage.dydc
    public final ListenableFuture a() {
        return elfl.g(elfl.g(elfr.j(r(), new emwl() { // from class: dydk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ewrq ewrqVar = (ewrq) obj;
                emxf.m(ewrqVar.b.size() == 1, "Cache must be initialized with data for exactly one person ('me') before updates!");
                eisi eisiVar = ((ewrw) ewrqVar.b.get(0)).c;
                if (eisiVar == null) {
                    eisiVar = eisi.a;
                }
                return eisiVar.f;
            }
        }, erpp.a)).h(new emwl() { // from class: dyer
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str = (String) obj;
                ewsh ewshVar = (ewsh) ewsi.a.createBuilder();
                ewsc ewscVar = ewsc.PROFILE;
                ewshVar.copyOnWrite();
                ((ewsi) ewshVar.instance).f = ewscVar.a();
                eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
                eyfgVar.a("person.photo");
                ewshVar.copyOnWrite();
                ewsi ewsiVar = (ewsi) ewshVar.instance;
                eyfh eyfhVar = (eyfh) eyfgVar.build();
                eyfhVar.getClass();
                ewsiVar.e = eyfhVar;
                ewsiVar.b |= 2;
                ewshVar.copyOnWrite();
                ((ewsi) ewshVar.instance).c = "me";
                ewshVar.copyOnWrite();
                ((ewsi) ewshVar.instance).g = false;
                eish eishVar = (eish) eisi.a.createBuilder();
                eishVar.copyOnWrite();
                eisi eisiVar = (eisi) eishVar.instance;
                eisiVar.b |= 1;
                eisiVar.c = "me";
                eishVar.copyOnWrite();
                eisi eisiVar2 = (eisi) eishVar.instance;
                str.getClass();
                eisiVar2.b |= 4;
                eisiVar2.f = str;
                ewshVar.copyOnWrite();
                ewsi ewsiVar2 = (ewsi) ewshVar.instance;
                eisi eisiVar3 = (eisi) eishVar.build();
                eisiVar3.getClass();
                ewsiVar2.d = eisiVar3;
                ewsiVar2.b |= 1;
                return (ewsi) ewshVar.build();
            }
        }, erpp.a).i(new eroh() { // from class: dydi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                byte[] byteArray = ((ewsi) obj).toByteArray();
                SyncOptions syncOptions = new SyncOptions();
                final dyes dyesVar = dyes.this;
                dyft dyftVar = (dyft) dyesVar.a;
                return elfr.f(elfr.k(duin.a(dyftVar.a.a(2, byteArray, syncOptions, dyftVar.b)), new eroh() { // from class: dyfp
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        eyfc eyfcVar = eyfc.a;
                        eyib eyibVar = eyib.a;
                        eyfc eyfcVar2 = eyfc.a;
                        return erqt.i((ewsk) eyfy.parseFrom(ewsk.a, (byte[]) obj2, eyfcVar2));
                    }
                }, erpp.a), dfqu.class, new eroh() { // from class: dyej
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final dfqu dfquVar = (dfqu) obj2;
                        int i = dfquVar.a.f;
                        dyes dyesVar2 = dyes.this;
                        return (i == 38006 || (i == 7 && dyesVar2.c.i(dyesVar2.b, 202100000) != 0)) ? elfl.g(dyesVar2.l()).f(Exception.class, new eroh() { // from class: dyed
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                return erqt.h(dfqu.this);
                            }
                        }, erpp.a).i(new eroh() { // from class: dyee
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                return erqt.h(new dyde(dfqu.this));
                            }
                        }, erpp.a) : erqt.h(dfquVar);
                    }
                }, erpp.a);
            }
        }, erpp.a).h(new emwl() { // from class: dydj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ewrw ewrwVar = ((ewsk) obj).b;
                if (ewrwVar == null) {
                    ewrwVar = ewrw.a;
                }
                eisq b = dygu.b(ewrwVar);
                if (b == null) {
                    return ewre.a;
                }
                ewrd ewrdVar = (ewrd) ewre.a.createBuilder();
                String str = b.d;
                ewrdVar.copyOnWrite();
                ewre ewreVar = (ewre) ewrdVar.instance;
                str.getClass();
                ewreVar.b = str;
                return (ewre) ewrdVar.build();
            }
        }, erpp.a)).f(Exception.class, new eroh() { // from class: dydo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                throw ((Exception) obj);
            }
        }, erpp.a).h(new emwl() { // from class: dydp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (ewre) obj;
            }
        }, erpp.a);
    }

    @Override // defpackage.dydc
    public final ListenableFuture b() {
        return elfl.g(elfl.g(s()).h(new emwl() { // from class: dydh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dyff dyffVar = (dyff) obj;
                if (!dyes.p(dyffVar)) {
                    return dyes.this.j();
                }
                ewrq ewrqVar = dyffVar.b;
                if (ewrqVar == null) {
                    ewrqVar = ewrq.a;
                }
                return emxc.j(ewrqVar);
            }
        }, erpp.a)).f(Exception.class, new eroh() { // from class: dydq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                throw ((Exception) obj);
            }
        }, erpp.a).h(new emwl() { // from class: dyeb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                emxc emxcVar = (emxc) obj;
                emxcVar.g();
                return emxcVar;
            }
        }, erpp.a);
    }

    @Override // defpackage.dydc
    public final ListenableFuture c(final dydb dydbVar, final int i) {
        return elfl.g(s()).i(new eroh() { // from class: dyds
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dyff dyffVar = (dyff) obj;
                boolean p = dyes.p(dyffVar);
                final dyes dyesVar = dyes.this;
                if (!p || !dyes.o(dyffVar)) {
                    return erqt.i(dyesVar.j());
                }
                dyfk dyfkVar = dyesVar.d;
                dyfe dyfeVar = dyffVar.c;
                if (dyfeVar == null) {
                    dyfeVar = dyfe.a;
                }
                int i2 = i;
                final dydb dydbVar2 = dydbVar;
                return elfl.g(dyfkVar.a(dyfeVar, i2)).h(new dyeo(), erpp.a).e(Exception.class, new emwl() { // from class: dydm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return emux.a;
                    }
                }, erpp.a).i(new eroh() { // from class: dydn
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        emxc emxcVar = (emxc) obj2;
                        if (!emxcVar.g()) {
                            return erqt.i(dyes.this.j());
                        }
                        if (dyes.q(dyffVar, dydbVar2)) {
                            return erqt.i(emxcVar);
                        }
                        dyfu.a((InputStream) emxcVar.c());
                        return erqt.h(new dydf());
                    }
                }, erpp.a);
            }
        }, erpp.a).f(Exception.class, new eroh() { // from class: dydt
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                throw ((Exception) obj);
            }
        }, erpp.a).h(new emwl() { // from class: dydu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                emxc emxcVar = (emxc) obj;
                emxcVar.g();
                return emxcVar;
            }
        }, erpp.a);
    }

    @Override // defpackage.dydc
    public final ListenableFuture d() {
        return elfl.g(r()).f(Exception.class, new eroh() { // from class: dyea
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                throw ((Exception) obj);
            }
        }, erpp.a).h(new emwl() { // from class: dyec
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (ewrq) obj;
            }
        }, erpp.a);
    }

    @Override // defpackage.dydc
    public final ListenableFuture e(final dydb dydbVar, final int i) {
        return elfl.g(s()).i(new eroh() { // from class: dyeg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dyff dyffVar = (dyff) obj;
                boolean p = dyes.p(dyffVar);
                final dyes dyesVar = dyes.this;
                final dydb dydbVar2 = dydbVar;
                final int i2 = i;
                if (!p || !dyes.o(dyffVar)) {
                    return dyesVar.k(dydbVar2, i2);
                }
                dyfk dyfkVar = dyesVar.d;
                dyfe dyfeVar = dyffVar.c;
                if (dyfeVar == null) {
                    dyfeVar = dyfe.a;
                }
                return elfl.g(dyfkVar.a(dyfeVar, i2)).h(new dyeo(), erpp.a).e(Exception.class, new emwl() { // from class: dyep
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return emux.a;
                    }
                }, erpp.a).i(new eroh() { // from class: dyeq
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        emxc emxcVar = (emxc) obj2;
                        boolean g = emxcVar.g();
                        dydb dydbVar3 = dydbVar2;
                        if (!g) {
                            return dyes.this.k(dydbVar3, i2);
                        }
                        if (dyes.q(dyffVar, dydbVar3)) {
                            return erqt.i((InputStream) emxcVar.c());
                        }
                        dyfu.a((InputStream) emxcVar.c());
                        return erqt.h(new dydf());
                    }
                }, erpp.a);
            }
        }, erpp.a).f(Exception.class, new eroh() { // from class: dyeh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                throw ((Exception) obj);
            }
        }, erpp.a).h(new emwl() { // from class: dyei
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (InputStream) obj;
            }
        }, erpp.a);
    }

    @Override // defpackage.dydc
    public final ListenableFuture f(byte[] bArr, ewse ewseVar) {
        ewsd ewsdVar = (ewsd) ewse.a.createBuilder();
        if ((ewseVar.b & 1) != 0) {
            ewry ewryVar = ewseVar.e;
            if (ewryVar == null) {
                ewryVar = ewry.a;
            }
            ewsdVar.copyOnWrite();
            ewse ewseVar2 = (ewse) ewsdVar.instance;
            ewryVar.getClass();
            ewseVar2.e = ewryVar;
            ewseVar2.b |= 1;
        }
        return elfl.g(t(bArr, ewsdVar)).f(Exception.class, new eroh() { // from class: dyel
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                throw ((Exception) obj);
            }
        }, erpp.a).h(new emwl() { // from class: dyem
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (ewsg) obj;
            }
        }, erpp.a);
    }

    @Override // defpackage.dydc
    public final void g(dyda dydaVar, Executor executor) {
        executor.getClass();
        synchronized (this.h) {
            this.g.put(dydaVar, executor);
        }
    }

    @Override // defpackage.dydc
    public final void h(dyda dydaVar) {
        synchronized (this.h) {
            this.g.remove(dydaVar);
        }
    }

    @Override // defpackage.dydc
    public final ListenableFuture i(byte[] bArr) {
        ewsd ewsdVar = (ewsd) ewse.a.createBuilder();
        ewsdVar.copyOnWrite();
        ((ewse) ewsdVar.instance).g = 2;
        return elfl.g(t(bArr, ewsdVar)).f(Exception.class, new eroh() { // from class: dydw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                throw ((Exception) obj);
            }
        }, erpp.a).h(new emwl() { // from class: dydx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (ewsg) obj;
            }
        }, erpp.a);
    }

    public final emxc j() {
        this.a.a();
        return emux.a;
    }

    public final ListenableFuture k(final dydb dydbVar, final int i) {
        return elfr.k(l(), new eroh() { // from class: dydr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dyff dyffVar = (dyff) obj;
                if (!dyes.q(dyffVar, dydbVar)) {
                    return erqt.h(new dydf());
                }
                dyes dyesVar = dyes.this;
                dyfe dyfeVar = dyffVar.c;
                if (dyfeVar == null) {
                    dyfeVar = dyfe.a;
                }
                return dyesVar.d.a(dyfeVar, i);
            }
        }, erpp.a);
    }

    public final ListenableFuture l() {
        return elfr.k(this.a.a(), new eroh() { // from class: dyef
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final dyes dyesVar = dyes.this;
                final ewrq ewrqVar = (ewrq) obj;
                return elfr.k(dyesVar.e.a(), new eroh() { // from class: dydl
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        dyff dyffVar = (dyff) obj2;
                        fdqp fdqpVar = fdqo.a.get();
                        dyes dyesVar2 = dyes.this;
                        if (fdqpVar.c(dyesVar2.b) && ewrqVar.b.size() > 0) {
                            ewrq ewrqVar2 = dyffVar.b;
                            if (ewrqVar2 == null) {
                                ewrqVar2 = ewrq.a;
                            }
                            if (ewrqVar2.b.size() == 0) {
                                dyez dyezVar = dyesVar2.f;
                                dyezVar.a.a.b(dyezVar.b);
                                return dyesVar2.e.a();
                            }
                        }
                        return erqt.i(dyffVar);
                    }
                }, erpp.a);
            }
        }, erpp.a);
    }

    @Override // defpackage.dyfl
    public final void m() {
        enhk j;
        synchronized (this.h) {
            j = enhk.j(this.g);
        }
        enqu listIterator = j.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            Executor executor = (Executor) entry.getValue();
            final dyda dydaVar = (dyda) entry.getKey();
            dydaVar.getClass();
            executor.execute(eldl.l(new Runnable() { // from class: dyen
                @Override // java.lang.Runnable
                public final void run() {
                    dyda.this.a();
                }
            }));
        }
    }

    @Override // defpackage.dyfm
    public final void n() {
        enhk j;
        synchronized (this.h) {
            j = enhk.j(this.g);
        }
        enqu listIterator = j.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            Executor executor = (Executor) entry.getValue();
            final dyda dydaVar = (dyda) entry.getKey();
            dydaVar.getClass();
            executor.execute(eldl.l(new Runnable() { // from class: dyek
                @Override // java.lang.Runnable
                public final void run() {
                    dyda.this.b();
                }
            }));
        }
    }
}
