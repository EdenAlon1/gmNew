package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evic extends enuq {
    public static final /* synthetic */ int c = 0;
    private static final long d = TimeUnit.HOURS.toSeconds(1);
    public final Context a;
    public final dfmp b;
    private final evid e;
    private final ffbr f;
    private final evij g;
    private final ffbr h;

    public evic(Context context, evid evidVar, dfmp dfmpVar, ffbr ffbrVar, String str) {
        super(null);
        this.g = new evij(d);
        this.a = context;
        this.e = evidVar;
        this.b = dfmpVar;
        this.h = ffbrVar;
        this.f = new evhz(context, str, ffbrVar);
    }

    private final void e(evix evixVar, ListenableFuture listenableFuture) {
        ListenableFuture i;
        long serializedSize = evixVar.getSerializedSize();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = (-86400000) + elapsedRealtime;
        ekma ekmaVar = (ekma) this.e;
        ekly eklyVar = ekmaVar.c;
        if (j > 0) {
            for (eklx eklxVar = (eklx) eklyVar.a.peek(); eklxVar != null && eklxVar.b() <= j; eklxVar = (eklx) eklyVar.a.peek()) {
                if (eklyVar.a.remove(eklxVar)) {
                    eklyVar.b.addAndGet(-eklxVar.a());
                }
            }
        }
        long j2 = eklyVar.b.get();
        for (int i2 = 0; i2 < 10 && j2 + serializedSize < 1048576; i2++) {
            j2 = eklyVar.b.get();
            if (eklyVar.b.compareAndSet(j2, j2 + serializedSize)) {
                eklyVar.a.offer(new ekls(elapsedRealtime, serializedSize));
                evif evifVar = ekmaVar.a;
                ectu ectuVar = evifVar.b;
                if (ectuVar == null) {
                    synchronized (evifVar) {
                        ectuVar = evifVar.b;
                        if (ectuVar == null) {
                            ectuVar = new ectu();
                            evifVar.b = ectuVar;
                        }
                    }
                }
                i = ectuVar.a(evifVar.a, evifVar.d, true);
                erqt.r(i, eldl.i(new evib(this, listenableFuture, evixVar)), erpp.a);
            }
        }
        Log.w("TikTokClientLogging", "Log rate too high, dropping logs.");
        i = erqt.i(false);
        erqt.r(i, eldl.i(new evib(this, listenableFuture, evixVar)), erpp.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [evho, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [evho, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [evho, java.lang.Object] */
    @Override // defpackage.ento
    public final void b(entl entlVar) {
        ArrayList<evih> arrayList;
        this.h.b().e();
        ekma ekmaVar = (ekma) this.e;
        evif evifVar = ekmaVar.a;
        String str = (String) evht.a(entlVar, evhv.a);
        emxc j = str == null ? emux.a : emxc.j(erqt.i(str));
        if (!j.g()) {
            emxc i = emxc.i((eisx) evht.a(entlVar, eklr.a));
            if (!i.g()) {
                elaa b = eleg.b(eisy.a);
                if (b.b()) {
                    i = emxc.j((eisx) b.a());
                }
            }
            j = i.g() ? emxc.j(ernq.f(((ejar) ekmaVar.b.b()).b((eisx) i.c()), eizq.class, eldl.a(new emwl() { // from class: ejaq
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return null;
                }
            }), erpp.a)) : emux.a;
        }
        ListenableFuture listenableFuture = (ListenableFuture) j.e(erqt.i(null));
        evih evihVar = new evih(((evhz) this.f).b().b(entlVar, 3, evht.b), listenableFuture, entlVar.d());
        String str2 = entlVar.j() != null ? entlVar.j().b : null;
        evij evijVar = this.g;
        evhw evhwVar = new evhw(entlVar.e(), str2);
        synchronized (evijVar) {
            long j2 = evihVar.c;
            if (j2 >= evijVar.b || evijVar.c.size() >= 1000) {
                Collection values = evijVar.c.values();
                long nanos = TimeUnit.SECONDS.toNanos(evijVar.a);
                Iterator it = values.iterator();
                int size = evijVar.c.size();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    evih evihVar2 = (evih) it.next();
                    long j3 = evihVar2.c + nanos;
                    if (j3 >= j2 && size <= 1000) {
                        evijVar.b = j3;
                        break;
                    }
                    if (evihVar2.d > 0 && evijVar.d.size() < 1000) {
                        evijVar.d.add(evihVar2);
                    }
                    it.remove();
                    size--;
                }
            }
            evih evihVar3 = (evih) evijVar.c.get(evhwVar);
            if (evihVar3 != null) {
                evihVar3.d++;
                evij evijVar2 = this.g;
                synchronized (evijVar2) {
                    arrayList = evijVar2.d;
                    evijVar2.d = new ArrayList();
                }
                for (evih evihVar4 : arrayList) {
                    evit evitVar = evihVar4.a;
                    long j4 = evihVar4.d;
                    evitVar.copyOnWrite();
                    evix evixVar = (evix) evitVar.instance;
                    evix evixVar2 = evix.a;
                    evixVar.b |= 2;
                    evixVar.d = j4;
                    e((evix) evitVar.build(), evihVar4.b);
                }
                return;
            }
            evijVar.c.put(evhwVar, evihVar);
            evid evidVar = this.e;
            evht b2 = ((evhz) this.f).b();
            evif evifVar2 = ((ekma) evidVar).a;
            evhr d2 = evhs.d();
            d2.b(true);
            d2.c(true);
            d2.d(fdln.a.get().a(evifVar2.a));
            evit b3 = b2.b(entlVar, 2, d2.a());
            Throwable th = (Throwable) evht.a(entlVar, enrz.a);
            evifVar2.c.b().d();
            if (entlVar.m().intValue() >= Integer.MAX_VALUE && !(th instanceof ensi)) {
                erhq erhqVar = ((evix) b3.instance).g;
                if (erhqVar == null) {
                    erhqVar = erhq.a;
                }
                erhp erhpVar = (erhp) erhqVar.toBuilder();
                evifVar2.c.b().d();
                erhv c2 = erkv.c(new evie(th));
                erhpVar.copyOnWrite();
                erhq erhqVar2 = (erhq) erhpVar.instance;
                eria eriaVar = (eria) c2.build();
                eriaVar.getClass();
                erhqVar2.k = eriaVar;
                erhqVar2.b |= 1024;
                erhq erhqVar3 = (erhq) erhpVar.build();
                b3.copyOnWrite();
                evix evixVar3 = (evix) b3.instance;
                erhqVar3.getClass();
                evixVar3.g = erhqVar3;
                evixVar3.b |= 32;
            }
            evix evixVar4 = (evix) b3.build();
            boolean z = ekyf.a;
            int i2 = engw.d;
            engr engrVar = new engr();
            for (elat c3 = ekyf.c(); c3 != null; c3 = c3.a()) {
                engrVar.h(c3.c());
            }
            List f = enkr.f(engrVar.g());
            if (!f.isEmpty()) {
                evit evitVar2 = (evit) evixVar4.toBuilder();
                evip evipVar = (evip) eviq.a.createBuilder();
                evipVar.copyOnWrite();
                eviq eviqVar = (eviq) evipVar.instance;
                eygr eygrVar = eviqVar.b;
                if (!eygrVar.c()) {
                    eviqVar.b = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(f, eviqVar.b);
                evitVar2.copyOnWrite();
                evix evixVar5 = (evix) evitVar2.instance;
                eviq eviqVar2 = (eviq) evipVar.build();
                eviqVar2.getClass();
                evixVar5.h = eviqVar2;
                evixVar5.b |= 64;
                evixVar4 = (evix) evitVar2.build();
            }
            e(evixVar4, listenableFuture);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [evho, java.lang.Object] */
    @Override // defpackage.ento
    public final boolean c(Level level) {
        return this.h.b().c(level);
    }

    @Override // defpackage.enuq, defpackage.ento
    public final void g(RuntimeException runtimeException, entl entlVar) {
        Log.e("ClientLoggingBackend", "Internal logging error", runtimeException);
    }
}
