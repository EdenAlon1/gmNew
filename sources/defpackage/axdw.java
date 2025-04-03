package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axdw {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Map a(final ffji ffjiVar) {
        bsob e = bsom.e();
        e.z("queryConversationsProfile");
        e.g(new Function() { // from class: axdn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bskp bskpVar = (bskp) obj;
                bskpVar.getClass();
                return bskpVar.al;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.v(bsom.c.al);
        e.i(new Function() { // from class: axdo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (bsol) ffji.this.invoke((bsol) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.n(new dtzr("COUNT(*)"), "countAsName");
        e.r();
        dtsu o = e.b().o();
        try {
            bskr bskrVar = (bskr) o;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (bskrVar.moveToNext()) {
                csgg l = bskrVar.l();
                l.getClass();
                linkedHashMap.putAll(e(linkedHashMap, l, (dtsr) bskrVar));
            }
            ffig.a(o, null);
            return linkedHashMap;
        } finally {
        }
    }

    public static final int b(final bqkx bqkxVar) {
        bqkn a = bqkv.a();
        a.z("queryDlqForRestore");
        a.c(new Function() { // from class: axdj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqku bqkuVar = (bqku) obj;
                bqkx bqkxVar2 = bqkx.this;
                bqkuVar.aq(new dtwe("cms_dead_letter_queue.cms_data_type", 1, Integer.valueOf(bqkxVar2 == null ? 0 : bqkxVar2.ordinal())));
                bqkuVar.b(bqkw.INITIAL_RESTORE_MAX_RETRIED, bqkw.INITIAL_RESTORE_NON_RETRIABLE);
                return bqkuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return a.b().i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Map c(final ffji ffjiVar) {
        buxo d = MessagesTable.d();
        d.z("queryMessagesProfile");
        d.f(new Function() { // from class: axdr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                buumVar.getClass();
                return buumVar.ad;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.v(MessagesTable.c.ad);
        d.h(new Function() { // from class: axds
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (buxz) ffji.this.invoke((buxz) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.n(new dtzr("COUNT(*)"), "countAsName");
        d.r();
        dtsu o = d.b().o();
        try {
            buuo buuoVar = (buuo) o;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (buuoVar.moveToNext()) {
                csgg t = buuoVar.t();
                t.getClass();
                linkedHashMap.putAll(e(linkedHashMap, t, (dtsr) buuoVar));
            }
            ffig.a(o, null);
            return linkedHashMap;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Map d(final ffji ffjiVar) {
        bvvn e = ParticipantsTable.e();
        e.z("queryParicipantsProfile");
        e.f(new Function() { // from class: axdu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvtg bvtgVar = (bvtg) obj;
                bvtgVar.getClass();
                return bvtgVar.M;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.v(ParticipantsTable.c.M);
        e.h(new Function() { // from class: axdi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (bvvw) ffji.this.invoke((bvvw) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.n(new dtzr("COUNT(*)"), "countAsName");
        e.r();
        dtsu o = e.b().o();
        try {
            bvti bvtiVar = (bvti) o;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (bvtiVar.moveToNext()) {
                csgg j = bvtiVar.j();
                j.getClass();
                linkedHashMap.putAll(e(linkedHashMap, j, (dtsr) bvtiVar));
            }
            ffig.a(o, null);
            return linkedHashMap;
        } finally {
        }
    }

    private static final Map e(Map map, csgg csggVar, dtsr dtsrVar) {
        Map m = ffew.m(map);
        if (csggVar == csgg.RESTORED_FROM_CMS || csggVar == csgg.MERGED_FROM_CMS || csggVar == csgg.SUCCEED_VIA_BATCH_BACKUP) {
            axdv axdvVar = axdv.a;
            int intValue = ((Number) Map.EL.getOrDefault(map, axdvVar, 0)).intValue();
            String dd = dtsrVar.dd("countAsName");
            dd.getClass();
            m.put(axdvVar, Integer.valueOf(intValue + Integer.parseInt(dd)));
            return m;
        }
        if (csggVar != csgg.CMS_RESTORE_FAILED && csggVar != csgg.FAILED_VIA_BATCH_BACKUP) {
            return m;
        }
        axdv axdvVar2 = axdv.b;
        int intValue2 = ((Number) Map.EL.getOrDefault(map, axdvVar2, 0)).intValue();
        String dd2 = dtsrVar.dd("countAsName");
        dd2.getClass();
        m.put(axdvVar2, Integer.valueOf(intValue2 + Integer.parseInt(dd2)));
        return m;
    }
}
