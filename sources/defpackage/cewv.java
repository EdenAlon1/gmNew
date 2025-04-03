package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cewv {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueDebugger");
    public final Context b;
    public final errl c;
    public final cexg d;
    public final elbx e;
    public final ffbr f;
    public final fazb g;

    public cewv(Context context, errl errlVar, cexg cexgVar, elbx elbxVar, ffbr ffbrVar, fazb fazbVar) {
        this.b = context;
        this.c = errlVar;
        this.d = cexgVar;
        this.e = elbxVar;
        this.f = ffbrVar;
        this.g = fazbVar;
    }

    public final elfl a(final cetu cetuVar, final EnumSet enumSet, final boolean z, final Pattern pattern, final Pattern pattern2) {
        return elfo.g(new Callable() { // from class: cewl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i;
                int i2;
                long j;
                Object obj;
                Object obj2;
                Object obj3;
                cett a2;
                boolean z2;
                enfy enfyVar;
                Throwable th;
                Pattern pattern3;
                Object obj4;
                ceze cezeVar;
                Locale locale;
                char c;
                char c2;
                Locale locale2;
                int i3;
                String format;
                Object apply;
                EnumSet enumSet2 = enumSet;
                boolean contains = enumSet2.contains(cevf.DUMP_DB);
                cetu cetuVar2 = cetuVar;
                Pattern pattern4 = pattern;
                int i4 = 0;
                int i5 = 1;
                if (contains) {
                    cetuVar2.d(cevf.DUMP_DB.toString());
                    cetuVar2.b("PWQ database dump:");
                    cfba a3 = cfbf.a();
                    a3.z("WorkQueueDebugger#dumpDatabase1");
                    a3.n(new dtzr("COUNT(*)"), "count");
                    apply = new Function() { // from class: cewp
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj5) {
                            cfae cfaeVar = (cfae) obj5;
                            return new cfaf[]{cfaeVar.f, cfaeVar.b};
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }.apply(cfbf.c);
                    a3.c((cfaf[]) apply);
                    a3.v(cfbf.c.f);
                    final cfag cfagVar = (cfag) a3.b().o();
                    try {
                        cett a4 = cetuVar2.a();
                        while (cfagVar.moveToNext()) {
                            try {
                                if (pattern4 == null || pattern4.matcher(cfagVar.f()).matches()) {
                                    cetuVar2.b(cfagVar.e() + " ==> " + cfagVar.dd("count"));
                                    cett a5 = cetuVar2.a();
                                    try {
                                        HashSet hashSet = new HashSet();
                                        HashSet hashSet2 = new HashSet();
                                        cfba a6 = cfbf.a();
                                        a6.z("WorkQueueDebugger#dumpDatabase2");
                                        a6.e(new Function() { // from class: cewq
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj5) {
                                                cfbe cfbeVar = (cfbe) obj5;
                                                cfbeVar.j(cfag.this.f());
                                                return cfbeVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        cfag cfagVar2 = (cfag) a6.b().o();
                                        obj2 = obj2;
                                        while (true) {
                                            try {
                                                ceze cezeVar2 = (ceze) cfagVar2.cQ();
                                                if (cezeVar2 == null) {
                                                    break;
                                                }
                                                int i6 = i4;
                                                int i7 = i5;
                                                String str = cezeVar2.l() + "; " + cezeVar2.r() + "; " + cezeVar2.q();
                                                String o = cezeVar2.o();
                                                if (o != null) {
                                                    str = a.w(o, str, "; ");
                                                }
                                                Date s = cezeVar2.s();
                                                long time = s.getTime();
                                                if (time != 0) {
                                                    str = str + "; " + String.valueOf(s);
                                                }
                                                if (hashSet.contains(o)) {
                                                    str = str.concat(" DEDUPE ERROR");
                                                }
                                                if (hashSet2.contains(Integer.valueOf(Arrays.hashCode(cezeVar2.t())))) {
                                                    str = str.concat(" PROTO DUPE");
                                                }
                                                cetuVar2.b(str);
                                                String o2 = cezeVar2.o();
                                                if (o2 != null) {
                                                    hashSet.add(o2);
                                                }
                                                hashSet2.add(Integer.valueOf(Arrays.hashCode(cezeVar2.t())));
                                                i5 = i7;
                                                i4 = i6;
                                                obj2 = time;
                                            } catch (Throwable th2) {
                                                try {
                                                    cfagVar2.close();
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    th2.addSuppressed(th3);
                                                    throw th2;
                                                }
                                            }
                                        }
                                        int i8 = i4;
                                        int i9 = i5;
                                        cfagVar2.close();
                                        a5.close();
                                        i5 = i9;
                                        i4 = i8;
                                    } finally {
                                    }
                                }
                            } finally {
                                try {
                                    a4.close();
                                    throw th;
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                }
                            }
                        }
                        i = i4;
                        i2 = i5;
                        j = 0;
                        a4.close();
                        cfagVar.close();
                    } finally {
                    }
                } else {
                    i = 0;
                    i2 = 1;
                    j = 0;
                }
                cewv cewvVar = cewv.this;
                if (enumSet2.contains(cevf.DUMP_EXECUTION)) {
                    cetuVar2.d(cevf.DUMP_EXECUTION.toString());
                    ((cfgy) cewvVar.g.b()).c(cetuVar2, pattern4);
                }
                if (!enumSet2.contains(cevf.DUMP_HISTORY)) {
                    return null;
                }
                cetuVar2.d(cevf.DUMP_HISTORY.toString());
                cexg cexgVar = cewvVar.d;
                Object obj5 = cexgVar.d;
                synchronized (obj5) {
                    try {
                        try {
                            cetuVar2.b("PWQ Recent History: (raw number " + cexgVar.e.size() + ")");
                            try {
                                a2 = cetuVar2.a();
                                z2 = z;
                                try {
                                    if (z2) {
                                        try {
                                            enfyVar = new enfy();
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj = obj5;
                                            obj2 = null;
                                            try {
                                                a2.close();
                                                throw th;
                                            } catch (Throwable th6) {
                                                th.addSuppressed(th6);
                                                throw th;
                                            }
                                        }
                                    } else {
                                        enfyVar = null;
                                    }
                                    pattern3 = pattern2;
                                    if (z2) {
                                        Iterator it = cexgVar.e.iterator();
                                        int i10 = -1;
                                        while (it.hasNext()) {
                                            cexf cexfVar = (cexf) it.next();
                                            i10++;
                                            if (cexfVar.a(pattern4, pattern3)) {
                                                Map.EL.putIfAbsent(enfyVar, Long.valueOf(cexg.a(cexfVar.c)), Integer.valueOf(i10));
                                            }
                                        }
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    cetuVar2.b(a.G(th, "caught exception in dumpStateForDebugging "));
                                    obj3 = obj2;
                                    return obj3;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                obj = obj5;
                                obj2 = null;
                            }
                            try {
                                Iterator it2 = cexgVar.e.iterator();
                                while (it2.hasNext()) {
                                    cexf cexfVar2 = (cexf) it2.next();
                                    if (cexfVar2.a(pattern4, pattern3)) {
                                        Object obj6 = cexfVar2.b;
                                        obj4 = null;
                                        obj4 = null;
                                        if (obj6 instanceof ceze) {
                                            try {
                                                cezeVar = (ceze) obj6;
                                                locale = Locale.US;
                                                c = 3;
                                                c2 = 2;
                                                locale2 = Locale.US;
                                                i3 = 4;
                                                obj = obj5;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                obj = obj5;
                                                th = th;
                                                obj2 = obj4;
                                                a2.close();
                                                throw th;
                                            }
                                            try {
                                                String valueOf = String.valueOf(cezeVar.a);
                                                String valueOf2 = String.valueOf(cezeVar.b);
                                                byte[] bArr = cezeVar.c;
                                                String concat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
                                                String valueOf3 = String.valueOf(cezeVar.d);
                                                String valueOf4 = String.valueOf(cezeVar.e);
                                                String valueOf5 = String.valueOf(cezeVar.f);
                                                String valueOf6 = String.valueOf(cezeVar.g);
                                                String valueOf7 = String.valueOf(cezeVar.h);
                                                String valueOf8 = String.valueOf(cezeVar.i);
                                                String valueOf9 = String.valueOf(cezeVar.j);
                                                String valueOf10 = String.valueOf(cezeVar.k);
                                                Object[] objArr = new Object[11];
                                                objArr[i] = valueOf;
                                                objArr[i2] = valueOf2;
                                                objArr[2] = concat;
                                                objArr[3] = valueOf3;
                                                objArr[4] = valueOf4;
                                                objArr[5] = valueOf5;
                                                objArr[6] = valueOf6;
                                                objArr[7] = valueOf7;
                                                objArr[8] = valueOf8;
                                                objArr[9] = valueOf9;
                                                objArr[10] = valueOf10;
                                                Object[] objArr2 = new Object[i2];
                                                objArr2[i] = String.format(locale2, "WorkQueueTable [_id: %s, type: %s, rawdata: %s, attempts: %s, timestamp: %s, queue: %s, deduplication_tag: %s, scheduled_in_workmanager: %s, workmanager_id: %s, minimum_start_time: %s, cancellation_tag: %s]", objArr);
                                                format = String.format(locale, "%s", objArr2);
                                            } catch (Throwable th10) {
                                                th = th10;
                                                th = th;
                                                obj2 = obj4;
                                                a2.close();
                                                throw th;
                                            }
                                        } else {
                                            obj = obj5;
                                            c = 3;
                                            c2 = 2;
                                            i3 = 4;
                                            format = obj6.toString();
                                        }
                                        long j2 = cexfVar2.a - j;
                                        Locale locale3 = Locale.US;
                                        Object[] objArr3 = new Object[1];
                                        objArr3[i] = Long.valueOf(j2);
                                        String format2 = String.format(locale3, "%13d", objArr3);
                                        Locale locale4 = Locale.US;
                                        Long valueOf11 = Long.valueOf(cexfVar2.d);
                                        String c3 = cexg.c(cexfVar2.e);
                                        Object[] objArr4 = new Object[i3];
                                        objArr4[i] = valueOf11;
                                        i2 = 1;
                                        objArr4[1] = format2;
                                        objArr4[c2] = c3;
                                        objArr4[c] = format;
                                        String format3 = String.format(locale4, "tid: %05d +%s %s: %s", objArr4);
                                        if (enfyVar != null) {
                                            format3 = format3 + " [stack: " + String.valueOf(enfyVar.get(Long.valueOf(cexg.a(cexfVar2.c)))) + "]";
                                        }
                                        cetuVar2.b(format3);
                                        j = cexfVar2.a;
                                        obj5 = obj;
                                    }
                                }
                                obj = obj5;
                                obj3 = null;
                                obj4 = null;
                                obj4 = null;
                                obj4 = null;
                                obj4 = null;
                                obj4 = null;
                                if (z2) {
                                    cetuVar2.b(a.f(enfyVar.c, "Stack Dictionary: (count ", ")"));
                                    enfw enfwVar = new enfw((enfx) enfyVar.a().entrySet());
                                    while (enfwVar.hasNext()) {
                                        Map.Entry entry = (Map.Entry) enfwVar.next();
                                        cetuVar2.b("stack code " + String.valueOf(entry.getKey()));
                                        ArrayList arrayList = new ArrayList(cexgVar.e);
                                        cett a7 = cetuVar2.a();
                                        try {
                                            StackTraceElement[] stackTraceElementArr = ((cexf) arrayList.get(((Integer) entry.getKey()).intValue())).c;
                                            int length = stackTraceElementArr.length;
                                            for (int i11 = i; i11 < length; i11++) {
                                                cetuVar2.b(stackTraceElementArr[i11].toString());
                                            }
                                            a7.close();
                                        } catch (Throwable th11) {
                                        }
                                    }
                                }
                                a2.close();
                                return obj3;
                            } catch (Throwable th12) {
                                th = th12;
                                obj = obj5;
                                obj4 = null;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            throw th;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                    }
                }
                throw th;
            }
        }, this.c).i(new eroh() { // from class: cewm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!enumSet.contains(cevf.DUMP_WM)) {
                    return elfo.e(null);
                }
                final Pattern pattern3 = pattern;
                final cetu cetuVar2 = cetuVar;
                cewv cewvVar = cewv.this;
                cetuVar2.d(cevf.DUMP_WM.toString());
                pqs a2 = pqr.a(cewvVar.b);
                cetuVar2.b("PWQ WM State:");
                pte pteVar = (pte) a2;
                WorkDatabase workDatabase = pteVar.e;
                qbc qbcVar = pteVar.m;
                workDatabase.getClass();
                qbcVar.getClass();
                return elfl.g(qap.a(workDatabase, qbcVar, new qal())).h(new emwl() { // from class: cewo
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cetu cetuVar3 = cetu.this;
                        List<pqq> list = (List) obj2;
                        cett a3 = cetuVar3.a();
                        try {
                            for (pqq pqqVar : list) {
                                if (pqqVar.b != pqp.SUCCEEDED) {
                                    Iterator it = pqqVar.c.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            cetuVar3.b("WM " + pqqVar.a.toString() + " ==> " + String.valueOf(pqqVar));
                                            break;
                                        }
                                        String str = (String) it.next();
                                        Pattern pattern4 = pattern3;
                                        if (pattern4 == null || pattern4.matcher(str).matches()) {
                                        }
                                    }
                                }
                            }
                            a3.close();
                            return null;
                        } catch (Throwable th) {
                            try {
                                a3.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, cewvVar.c);
            }
        }, this.c).h(new emwl() { // from class: cewn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Void r2 = (Void) obj;
                cetu.this.c();
                return r2;
            }
        }, erpp.a);
    }
}
