package defpackage;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfmc {
    public final int c;
    public final ReentrantReadWriteLock d;
    public volatile int e;
    public volatile Future f;
    public long g;
    public final Map h;
    public dflv i;
    public final LinkedHashSet j;
    public final dfym l;
    private final String n;
    private final dfld o;
    private ScheduledExecutorService p;
    private volatile dfly q;
    public static final dflt k = new dflt();
    private static final Charset m = Charset.forName("UTF-8");
    static final dflv a = new dflv();
    public static final dflv b = new dflv();

    public dfmc(dfld dfldVar, String str, int i) {
        this(dfldVar, str, i, dfym.a);
    }

    public static long a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(m));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final dflq b(String str, emyl emylVar) {
        this.d.writeLock().lock();
        try {
            dflq dflqVar = (dflq) emylVar.get();
            this.h.put(str, dflqVar);
            return dflqVar;
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final dflu c(final String str) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        this.d.writeLock().lock();
        try {
            Object obj = (dflq) this.h.get(str);
            if (obj == null) {
                obj = (dflu) b(str, new emyl() { // from class: dfll
                    @Override // defpackage.emyl
                    public final Object get() {
                        return new dflu(dfmc.this, str);
                    }
                });
                reentrantReadWriteLock = this.d;
            } else {
                reentrantReadWriteLock = this.d;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return (dflu) obj;
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final dflx d(final String str) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        this.d.writeLock().lock();
        try {
            Object obj = (dflq) this.h.get(str);
            if (obj == null) {
                obj = (dflx) b(str, new emyl() { // from class: dfln
                    @Override // defpackage.emyl
                    public final Object get() {
                        return new dflx(dfmc.this, str);
                    }
                });
                reentrantReadWriteLock = this.d;
            } else {
                reentrantReadWriteLock = this.d;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return (dflx) obj;
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final dflz e(final String str) {
        dflr dflrVar;
        final dflt dfltVar = k;
        this.d.writeLock().lock();
        try {
            dflq dflqVar = (dflq) this.h.get(str);
            if (dflqVar == null) {
                dflrVar = (dflz) b(str, new emyl() { // from class: dflm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return new dflz(dfmc.this, str, dfltVar);
                    }
                });
            } else {
                try {
                    dflr dflrVar2 = (dflr) dflqVar;
                    if (!dfltVar.equals(dflrVar2.f)) {
                        throw new IllegalArgumentException(a.t(str, "alias mismatch: "));
                    }
                    dflrVar = dflrVar2;
                } catch (ClassCastException e) {
                    throw new IllegalArgumentException(a.t(str, "another type of counter exists with name: "), e);
                }
            }
            this.d.writeLock().unlock();
            return (dflz) dflrVar;
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final dhre f() {
        this.d.writeLock().lock();
        try {
            dfmc dfmcVar = new dfmc(this);
            this.d.writeLock().unlock();
            int size = dfmcVar.j.size();
            dflc[] dflcVarArr = new dflc[size];
            Iterator it = dfmcVar.j.iterator();
            int i = 0;
            while (it.hasNext()) {
                dflv dflvVar = (dflv) it.next();
                dfld dfldVar = dfmcVar.o;
                dfwv.n(dflvVar);
                ArrayList arrayList = new ArrayList(dfmcVar.h.size());
                for (dflq dflqVar : dfmcVar.h.values()) {
                    if (dflqVar.c.containsKey(dflvVar)) {
                        arrayList.add(dflqVar);
                    }
                }
                fayb faybVar = (fayb) fayc.a.createBuilder();
                long j = dfmcVar.g;
                faybVar.copyOnWrite();
                fayc faycVar = (fayc) faybVar.instance;
                faycVar.b |= 1;
                faycVar.c = j;
                dfwv.i(!b.equals(dflvVar));
                if (!a.equals(dflvVar)) {
                    eyhs eyhsVar = dflvVar.a;
                    dfwv.n(eyhsVar);
                    eyee byteString = eyhsVar.toByteString();
                    faybVar.copyOnWrite();
                    fayc faycVar2 = (fayc) faybVar.instance;
                    byteString.getClass();
                    faycVar2.b |= 4;
                    faycVar2.e = byteString;
                }
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    dflq dflqVar2 = (dflq) arrayList.get(i2);
                    cno cnoVar = (cno) dflqVar2.c.get(dflvVar);
                    dfwv.n(cnoVar);
                    faxz faxzVar = (faxz) faya.a.createBuilder();
                    long a2 = a(dflqVar2.a);
                    faxzVar.copyOnWrite();
                    faya fayaVar = (faya) faxzVar.instance;
                    dflc[] dflcVarArr2 = dflcVarArr;
                    fayaVar.b = 1;
                    fayaVar.c = Long.valueOf(a2);
                    ArrayList arrayList2 = new ArrayList(cnoVar.b());
                    Iterator it2 = it;
                    int i3 = 0;
                    while (i3 < cnoVar.b()) {
                        faxx faxxVar = (faxx) faxy.a.createBuilder();
                        int i4 = i;
                        dflv dflvVar2 = dflvVar;
                        long j2 = ((long[]) cnoVar.e(i3))[0];
                        faxxVar.copyOnWrite();
                        ArrayList arrayList3 = arrayList;
                        faxy faxyVar = (faxy) faxxVar.instance;
                        int i5 = size2;
                        faxyVar.b |= 2;
                        faxyVar.d = j2;
                        long c = cnoVar.c(i3);
                        if (dflqVar2 instanceof dflu) {
                            dfwv.i(c == 0);
                        } else {
                            faxxVar.copyOnWrite();
                            faxy faxyVar2 = (faxy) faxxVar.instance;
                            faxyVar2.b |= 1;
                            faxyVar2.c = c;
                        }
                        arrayList2.add((faxy) faxxVar.build());
                        i3++;
                        arrayList = arrayList3;
                        i = i4;
                        dflvVar = dflvVar2;
                        size2 = i5;
                    }
                    int i6 = i;
                    dflv dflvVar3 = dflvVar;
                    ArrayList arrayList4 = arrayList;
                    int i7 = size2;
                    Collections.sort(arrayList2, new Comparator() { // from class: dflw
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return Long.compare(((faxy) obj).c, ((faxy) obj2).c);
                        }
                    });
                    faxzVar.copyOnWrite();
                    faya fayaVar2 = (faya) faxzVar.instance;
                    eygr eygrVar = fayaVar2.d;
                    if (!eygrVar.c()) {
                        fayaVar2.d = eyfy.mutableCopy(eygrVar);
                    }
                    eydl.addAll(arrayList2, fayaVar2.d);
                    faya fayaVar3 = (faya) faxzVar.build();
                    faybVar.copyOnWrite();
                    fayc faycVar3 = (fayc) faybVar.instance;
                    fayaVar3.getClass();
                    eygr eygrVar2 = faycVar3.d;
                    if (!eygrVar2.c()) {
                        faycVar3.d = eyfy.mutableCopy(eygrVar2);
                    }
                    faycVar3.d.add(fayaVar3);
                    i2++;
                    it = it2;
                    arrayList = arrayList4;
                    dflcVarArr = dflcVarArr2;
                    i = i6;
                    dflvVar = dflvVar3;
                    size2 = i7;
                }
                dflc[] dflcVarArr3 = dflcVarArr;
                int i8 = i;
                i = i8 + 1;
                dflcVarArr3[i8] = dfldVar.i((fayc) faybVar.build());
                dflcVarArr = dflcVarArr3;
            }
            dflc[] dflcVarArr4 = dflcVarArr;
            dhre dhreVar = null;
            for (int i9 = 0; i9 < size; i9++) {
                dflc dflcVar = dflcVarArr4[i9];
                dflcVar.k = dfmcVar.n;
                dhreVar = dflcVar.c();
            }
            return dhreVar != null ? dhreVar : dhrt.c(null);
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final void g() {
        this.d.writeLock().lock();
        try {
            Future future = this.f;
            if (future != null) {
                future.cancel(false);
            }
            this.f = this.p.schedule(new Runnable() { // from class: dflk
                @Override // java.lang.Runnable
                public final void run() {
                    dfmc dfmcVar = dfmc.this;
                    dfmcVar.d.writeLock().lock();
                    try {
                        dfmcVar.f = null;
                        dfmcVar.d.writeLock().unlock();
                        dfmcVar.f();
                    } catch (Throwable th) {
                        dfmcVar.d.writeLock().unlock();
                        throw th;
                    }
                }
            }, this.e, TimeUnit.MILLISECONDS);
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final void h(ScheduledExecutorService scheduledExecutorService, int i) {
        this.d.writeLock().lock();
        try {
            this.p = scheduledExecutorService;
            if (scheduledExecutorService != null) {
                this.e = i;
                g();
            } else {
                this.e = 0;
            }
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final void i(eyhs eyhsVar) {
        this.d.writeLock().lock();
        try {
            this.i = dflv.a(eyhsVar);
        } finally {
            this.d.writeLock().unlock();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        this.d.readLock().lock();
        try {
            sb.append("{");
            new emww(", ").i(sb, this.j);
            sb.append("}\n");
            new emww("\n").i(sb, this.h.values());
            this.d.readLock().unlock();
            return sb.toString();
        } catch (Throwable th) {
            this.d.readLock().unlock();
            throw th;
        }
    }

    public dfmc(dfld dfldVar, String str, int i, dfym dfymVar) {
        this.d = new ReentrantReadWriteLock();
        this.h = new TreeMap();
        this.i = a;
        this.j = new LinkedHashSet();
        this.q = null;
        this.o = dfldVar;
        this.n = str;
        dfwv.a(true);
        this.c = i;
        this.l = dfymVar;
        this.g = SystemClock.elapsedRealtime();
    }

    private dfmc(dfmc dfmcVar) {
        this(dfmcVar.o, dfmcVar.n, dfmcVar.c, dfmcVar.l);
        dflq dflsVar;
        ReentrantReadWriteLock.WriteLock writeLock = dfmcVar.d.writeLock();
        writeLock.lock();
        try {
            this.i = dfmcVar.i;
            this.g = dfmcVar.g;
            for (Map.Entry entry : dfmcVar.h.entrySet()) {
                Map map = this.h;
                String str = (String) entry.getKey();
                dflq dflqVar = (dflq) entry.getValue();
                if (dflqVar instanceof dflu) {
                    dflsVar = new dflu(this, (dflu) dflqVar);
                } else if (dflqVar instanceof dfmb) {
                    dflsVar = new dfmb(this, (dfmb) dflqVar);
                } else if (dflqVar instanceof dflx) {
                    dflsVar = new dflx(this, (dflx) dflqVar);
                } else if (dflqVar instanceof dflz) {
                    dflsVar = new dflz(this, (dflz) dflqVar);
                } else if (dflqVar instanceof dfls) {
                    dflsVar = new dfls(this, (dfls) dflqVar);
                } else {
                    throw new IllegalArgumentException("Unknown counter type: ".concat(String.valueOf(String.valueOf(dflqVar))));
                }
                map.put(str, dflsVar);
            }
            this.j.addAll(dfmcVar.j);
            dfmcVar.j.clear();
            dfmcVar.g = SystemClock.elapsedRealtime();
        } finally {
            writeLock.unlock();
        }
    }
}
