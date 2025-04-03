package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edva {
    public static final enru a = enru.c("com/google/android/libraries/privatetelemetry/mobalt/db/DataService");
    public static final Duration b = Duration.ofDays(2);
    public final efiv c;

    public edva(efiv efivVar) {
        this.c = efivVar;
    }

    public static final engw d(efks efksVar, int i, efkn efknVar) {
        edue edueVar;
        HashMap hashMap = new HashMap();
        Cursor d = efksVar.d(efknVar);
        while (d.moveToNext()) {
            try {
                OptionalInt empty = OptionalInt.empty();
                OptionalInt empty2 = OptionalInt.empty();
                Optional empty3 = Optional.empty();
                String string = d.getString(d.getColumnIndexOrThrow("event_vector"));
                if (string.isEmpty()) {
                    int i2 = engw.d;
                    edueVar = new edue(enou.a);
                } else {
                    Stream map = DesugarArrays.stream(string.split(",")).map(new Function() { // from class: edvj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Integer.valueOf(Integer.parseInt((String) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i3 = engw.d;
                    edueVar = new edue((engw) map.collect(endq.a));
                }
                long j = d.getLong(d.getColumnIndexOrThrow("system_profile_hash"));
                emto emtoVar = (emto) eyfy.parseFrom(emto.a, d.getBlob(d.getColumnIndexOrThrow("system_profile")), eyfc.a());
                if (emtoVar == null) {
                    throw new NullPointerException("Null systemProfile");
                }
                int columnIndex = d.getColumnIndex("min_day_index");
                if (columnIndex != -1 && (empty = OptionalInt.of(d.getInt(columnIndex))) == null) {
                    throw new NullPointerException("Null minDayIndex");
                }
                OptionalInt optionalInt = empty;
                int columnIndex2 = d.getColumnIndex("max_day_index");
                if (columnIndex2 != -1 && (empty2 = OptionalInt.of(d.getInt(columnIndex2))) == null) {
                    throw new NullPointerException("Null maxDayIndex");
                }
                OptionalInt optionalInt2 = empty2;
                int columnIndex3 = d.getColumnIndex("aggregate_value");
                if (columnIndex3 != -1) {
                    empty3 = Optional.of((edxp) eyfy.parseFrom(edxp.a, d.getBlob(columnIndex3), eyfc.a()));
                }
                edub edubVar = new edub(edueVar, j, emtoVar, optionalInt, optionalInt2, empty3);
                List list = (List) hashMap.get(edubVar.a);
                if (list == null) {
                    hashMap.put(edubVar.a, enkr.c(edubVar));
                } else {
                    int i4 = i - 2;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i == 1) {
                                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                                }
                                throw new IllegalStateException(a.h(i4, "Unexpected value for system_profile_selection: "));
                            }
                            list.add(edubVar);
                        } else if (((edtz) list.get(0)).f().orElseThrow() > edubVar.b.orElseThrow()) {
                            hashMap.put(edubVar.a, enkr.c(edubVar));
                        }
                    } else if (((edtz) list.get(0)).e().orElseThrow() < edubVar.c.orElseThrow()) {
                        hashMap.put(edubVar.a, enkr.c(edubVar));
                    }
                }
            } finally {
            }
        }
        if (d != null) {
            d.close();
        }
        Stream flatMap = Collection.EL.stream(hashMap.values()).flatMap(new Function() { // from class: edul
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Collection.EL.stream((List) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i5 = engw.d;
        Iterable iterable = (Iterable) flatMap.collect(endq.a);
        emwl emwlVar = new emwl() { // from class: edum
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((edtz) obj).a());
            }
        };
        engx engxVar = new engx();
        for (Object obj : iterable) {
            obj.getClass();
            engxVar.b(emwlVar.apply(obj), obj);
        }
        return (engw) Collection.EL.stream(engxVar.a().map.values()).map(new Function() { // from class: edun
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                java.util.Collection collection = (java.util.Collection) obj2;
                emxf.b(!collection.isEmpty(), "There must be at least one AggregateData");
                final edtz edtzVar = (edtz) collection.iterator().next();
                emto c = edtzVar.c();
                Stream map2 = Collection.EL.stream(collection).peek(new Consumer() { // from class: edvd
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        emxf.b(((edtz) obj3).a() == edtz.this.a(), "All the AggregateData must be for the same SystemProfile.");
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }).sorted(Comparator.CC.comparingInt(new ToIntFunction() { // from class: edve
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj3) {
                        edtz edtzVar2 = (edtz) obj3;
                        if (edtzVar2.f().isPresent()) {
                            return edtzVar2.f().orElseThrow();
                        }
                        return 0;
                    }
                })).map(new Function() { // from class: edvf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        edtz edtzVar2 = (edtz) obj3;
                        Optional.empty();
                        return new edud(edvk.b(((edue) edtzVar2.b()).a), edtzVar2.d());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i6 = engw.d;
                engw engwVar = (engw) map2.collect(endq.a);
                emxf.b(!engwVar.isEmpty(), "There must be at least one event record");
                return new educ(c, engwVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a);
    }

    public static final int e(efks efksVar, edvr edvrVar, int i, int i2) {
        efko efkoVar = new efko();
        efkoVar.b("SELECT last_sent_day_index FROM Reports");
        efkoVar.b(" WHERE ");
        efkoVar.b("customer_id = ?");
        eduh eduhVar = (eduh) edvrVar;
        efkoVar.c(Long.valueOf(eduhVar.a));
        efkoVar.b(" AND project_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.b));
        efkoVar.b(" AND metric_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.c));
        efkoVar.b(" AND report_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.d));
        Cursor d = efksVar.d(efkoVar.a());
        try {
            int i3 = i + 1;
            if (!d.moveToFirst()) {
                efksVar.c("Reports", edvt.a(edvrVar, i), 4);
            } else if (!d.isNull(d.getColumnIndexOrThrow("last_sent_day_index"))) {
                i3 = d.getInt(d.getColumnIndexOrThrow("last_sent_day_index")) + 1;
            }
            if (d != null) {
                d.close();
            }
            int i4 = i - 3;
            if (i3 < i4) {
                i3 = i4;
            }
            return i3 < i2 ? i2 : i3;
        } catch (Throwable th) {
            if (d != null) {
                try {
                    d.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static final void f(efks efksVar, edvr edvrVar, int i, emto emtoVar, int i2, edvk edvkVar, long j, Object obj, BiFunction biFunction) {
        Object apply;
        Object apply2;
        Object apply3;
        Object apply4;
        Object apply5;
        int i3 = eodh.a;
        long c = eocx.a.b(emtoVar.toByteArray()).c();
        ContentValues contentValues = new ContentValues();
        Long valueOf = Long.valueOf(c);
        contentValues.put("system_profile_hash", valueOf);
        contentValues.put("system_profile", emtoVar.toByteArray());
        efksVar.c("SystemProfiles", contentValues, 4);
        efksVar.c("Reports", edvt.a(edvrVar, i - 1), 4);
        emxf.b(i2 == 4 || i2 == 3 || i2 == 5, "System profile selection must be one of SELECT_FIRST, SELECT_LAST, OR REPORT_ALL");
        efko efkoVar = new efko();
        efkoVar.b("SELECT system_profile_hash, aggregate_value");
        efkoVar.b(" FROM AggregateStore");
        efkoVar.b(" WHERE customer_id = ?");
        eduh eduhVar = (eduh) edvrVar;
        efkoVar.c(Long.valueOf(eduhVar.a));
        efkoVar.b(" AND project_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.b));
        efkoVar.b(" AND metric_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.c));
        efkoVar.b(" AND report_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.d));
        efkoVar.b(" AND day_index = ?");
        efkoVar.c(Long.valueOf(i));
        efkoVar.b(" AND event_vector = ?");
        efkoVar.d(edvkVar.c());
        efkoVar.b(" ORDER BY system_profile_hash == ? DESC");
        efkoVar.c(valueOf);
        efkoVar.b(", system_profile_hash ASC");
        efkoVar.b(" LIMIT 1");
        Cursor d = efksVar.d(efkoVar.a());
        try {
            if (d.moveToFirst()) {
                long j2 = d.getLong(d.getColumnIndexOrThrow("system_profile_hash"));
                if (j2 == c) {
                    Optional empty = Optional.empty();
                    apply4 = biFunction.apply(obj, Optional.of(g(d)));
                    j(efksVar, edvrVar, i, j2, empty, edvkVar, j, (Optional) apply4);
                } else {
                    int i4 = i2 - 2;
                    if (i4 == 1) {
                        Optional of = Optional.of(valueOf);
                        apply = biFunction.apply(obj, Optional.of(g(d)));
                        j(efksVar, edvrVar, i, j2, of, edvkVar, j, (Optional) apply);
                    } else if (i4 == 2) {
                        Optional empty2 = Optional.empty();
                        apply2 = biFunction.apply(obj, Optional.of(g(d)));
                        j(efksVar, edvrVar, i, j2, empty2, edvkVar, j, (Optional) apply2);
                    } else {
                        if (i4 != 3) {
                            throw new AssertionError(a.t(i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNRECOGNIZED" : "REPORT_ALL" : "SELECT_FIRST" : "SELECT_LAST" : "SYSTEM_PROFILE_SELECTION_POLICY_UNSET", "Unsupported system profile selection policy: "));
                        }
                        apply3 = biFunction.apply(obj, Optional.empty());
                        i(efksVar, edvrVar, i, c, edvkVar, j, (Optional) apply3);
                    }
                }
            } else {
                apply5 = biFunction.apply(obj, Optional.empty());
                i(efksVar, edvrVar, i, c, edvkVar, j, (Optional) apply5);
            }
            if (d != null) {
                d.close();
            }
        } finally {
        }
    }

    private static eduz g(Cursor cursor) {
        byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("aggregate_value"));
        if (blob == null) {
            return eduz.b();
        }
        return new eduz(Optional.of((edxp) eyfy.parseFrom(edxp.a, blob, eyfc.a())));
    }

    private static final boolean h(efks efksVar, edvr edvrVar, int i, long j, edvk edvkVar, long j2) {
        boolean z = true;
        if (j2 == 0) {
            return true;
        }
        efko efkoVar = new efko();
        efkoVar.b("SELECT COUNT(DISTINCT event_vector) AS num_event_vectors");
        efkoVar.b(" FROM AggregateStore");
        efkoVar.b(" WHERE customer_id = ?");
        eduh eduhVar = (eduh) edvrVar;
        efkoVar.c(Long.valueOf(eduhVar.a));
        efkoVar.b(" AND project_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.b));
        efkoVar.b(" AND metric_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.c));
        efkoVar.b(" AND report_id = ?");
        efkoVar.c(Long.valueOf(eduhVar.d));
        efkoVar.b(" AND day_index = ?");
        efkoVar.c(Long.valueOf(i));
        efkoVar.b(" AND system_profile_hash = ?");
        efkoVar.c(Long.valueOf(j));
        Cursor d = efksVar.d(efkoVar.a());
        try {
            d.moveToFirst();
            if (d.getLong(d.getColumnIndexOrThrow("num_event_vectors")) >= j2) {
                ((enrr) ((enrr) a.j()).h("com/google/android/libraries/privatetelemetry/mobalt/db/DataService", "canAddEventVectorToSystemProfile", 234, "DataService.java")).J("Dropping eventVector %s for report %s, due to exceeding event_vector_buffer_max %s", edvkVar, edvrVar, Long.valueOf(j2));
                z = false;
            }
            if (d != null) {
                d.close();
            }
            return z;
        } catch (Throwable th) {
            if (d != null) {
                try {
                    d.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static final void i(efks efksVar, edvr edvrVar, int i, long j, edvk edvkVar, long j2, Optional optional) {
        if (!optional.isEmpty() && h(efksVar, edvrVar, i, j, edvkVar, j2)) {
            eduz eduzVar = (eduz) optional.get();
            if (eduzVar.d()) {
                efksVar.c("AggregateStore", edua.a(edvrVar, i, j, edvkVar, Optional.empty()), 1);
            } else {
                efksVar.c("AggregateStore", edua.a(edvrVar, i, j, edvkVar, Optional.of(eduzVar.c())), 1);
            }
        }
    }

    private static final void j(efks efksVar, edvr edvrVar, int i, long j, Optional optional, edvk edvkVar, long j2, Optional optional2) {
        if (optional.isEmpty() && optional2.isEmpty()) {
            return;
        }
        boolean z = true;
        if (!optional.isEmpty()) {
            if (((Long) optional.get()).equals(Long.valueOf(j))) {
                z = false;
            }
        }
        emxf.b(z, "New system profile has must differ from the existing system profile");
        if (!optional.isPresent() || h(efksVar, edvrVar, i, ((Long) optional.get()).longValue(), edvkVar, j2)) {
            if (optional.isPresent() && optional2.isPresent()) {
                eduz eduzVar = (eduz) optional2.get();
                if (eduzVar.d()) {
                    efksVar.g(edua.b(edvrVar, i, edvkVar, j, ((Long) optional.get()).longValue()));
                    return;
                }
                Long l = (Long) optional.get();
                l.longValue();
                edxp c = eduzVar.c();
                efko efkoVar = new efko();
                efkoVar.b("UPDATE AggregateStore SET system_profile_hash = ? ");
                efkoVar.c(l);
                efkoVar.b(", aggregate_value = ? ");
                efkoVar.e(c.toByteArray());
                efkoVar.b(" WHERE customer_id = ?");
                eduh eduhVar = (eduh) edvrVar;
                efkoVar.c(Long.valueOf(eduhVar.a));
                efkoVar.b(" AND project_id = ?");
                efkoVar.c(Long.valueOf(eduhVar.b));
                efkoVar.b(" AND metric_id = ?");
                efkoVar.c(Long.valueOf(eduhVar.c));
                efkoVar.b(" AND report_id = ?");
                efkoVar.c(Long.valueOf(eduhVar.d));
                efkoVar.b(" AND day_index = ?");
                efkoVar.c(Long.valueOf(i));
                efkoVar.b(" AND event_vector = ?");
                efkoVar.d(edvkVar.c());
                efkoVar.b(" AND system_profile_hash = ?");
                efkoVar.c(Long.valueOf(j));
                efksVar.g(efkoVar.a());
                return;
            }
            if (optional.isPresent()) {
                efksVar.g(edua.b(edvrVar, i, edvkVar, j, ((Long) optional.get()).longValue()));
                return;
            }
            if (optional2.isPresent()) {
                eduz eduzVar2 = (eduz) optional2.get();
                if (eduzVar2.d()) {
                    throw new AssertionError("Empty system profile and NULL value while updating value for ".concat(edvrVar.toString()));
                }
                edxp c2 = eduzVar2.c();
                efko efkoVar2 = new efko();
                efkoVar2.b("UPDATE AggregateStore SET aggregate_value = ? ");
                efkoVar2.e(c2.toByteArray());
                efkoVar2.b(" WHERE customer_id = ?");
                eduh eduhVar2 = (eduh) edvrVar;
                efkoVar2.c(Long.valueOf(eduhVar2.a));
                efkoVar2.b(" AND project_id = ?");
                efkoVar2.c(Long.valueOf(eduhVar2.b));
                efkoVar2.b(" AND metric_id = ?");
                efkoVar2.c(Long.valueOf(eduhVar2.c));
                efkoVar2.b(" AND report_id = ?");
                efkoVar2.c(Long.valueOf(eduhVar2.d));
                efkoVar2.b(" AND day_index = ?");
                efkoVar2.c(Long.valueOf(i));
                efkoVar2.b(" AND event_vector = ?");
                efkoVar2.d(edvkVar.c());
                efkoVar2.b(" AND system_profile_hash = ?");
                efkoVar2.c(Long.valueOf(j));
                efksVar.g(efkoVar2.a());
            }
        }
    }

    public final elfl a(final Instant instant) {
        return elfl.g(this.c.e(new efkr() { // from class: edup
            @Override // defpackage.efkr
            public final void a(efks efksVar) {
                enru enruVar = edva.a;
                efksVar.c("GlobalValues", edvl.a("start_disabled_time", Instant.this.toString()), 4);
            }
        }));
    }

    public final elfl b(final Instant instant) {
        return elfl.g(this.c.d(new efkq() { // from class: edui
            @Override // defpackage.efkq
            public final Object a(efks efksVar) {
                char c;
                enru enruVar = edva.a;
                efko efkoVar = new efko();
                efkoVar.b("SELECT key_id, value");
                efkoVar.b(" FROM GlobalValues");
                efkoVar.b(" WHERE key_id IN (?, ?)");
                efkoVar.d("initial_enabled_time");
                efkoVar.d("start_disabled_time");
                Cursor d = efksVar.d(efkoVar.a());
                Instant instant2 = null;
                Instant instant3 = null;
                while (d.moveToNext()) {
                    try {
                        String string = d.getString(d.getColumnIndexOrThrow("key_id"));
                        int hashCode = string.hashCode();
                        if (hashCode != -1579654618) {
                            if (hashCode == -345489005 && string.equals("start_disabled_time")) {
                                c = 1;
                            }
                            c = 65535;
                        } else {
                            if (string.equals("initial_enabled_time")) {
                                c = 0;
                            }
                            c = 65535;
                        }
                        if (c == 0) {
                            instant3 = Instant.parse(d.getString(d.getColumnIndexOrThrow(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE)));
                        } else if (c == 1) {
                            instant2 = Instant.parse(d.getString(d.getColumnIndexOrThrow(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE)));
                        }
                    } catch (Throwable th) {
                        if (d != null) {
                            try {
                                d.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (d != null) {
                    d.close();
                }
                Instant instant4 = Instant.this;
                if (instant2 != null) {
                    Instant instant5 = Duration.between(instant2, instant4).compareTo(edva.b) <= 0 ? instant3 : null;
                    StringBuilder sb = new StringBuilder();
                    ArrayList arrayList = new ArrayList();
                    sb.append("key_id = ?");
                    arrayList.add("start_disabled_time");
                    efksVar.a(efkm.a("GlobalValues", sb, arrayList));
                    instant3 = instant5;
                }
                if (instant3 != null) {
                    return instant3;
                }
                efksVar.c("GlobalValues", edvl.a("initial_enabled_time", instant4.toString()), 5);
                return instant4;
            }
        }));
    }

    public final elfl c() {
        return elfl.g(this.c.d(new efkq() { // from class: eduv
            @Override // defpackage.efkq
            public final Object a(efks efksVar) {
                enru enruVar = edva.a;
                int i = engw.d;
                engr engrVar = new engr();
                efko efkoVar = new efko();
                efkoVar.b("SELECT observation_store_id, observation_batch FROM ObservationStore ORDER BY observation_store_id");
                Cursor d = efksVar.d(efkoVar.a());
                int i2 = 0;
                while (d.moveToNext()) {
                    try {
                        long j = d.getLong(d.getColumnIndexOrThrow("observation_store_id"));
                        byte[] blob = d.getBlob(d.getColumnIndexOrThrow("observation_batch"));
                        if (i2 > 0 && blob.length + i2 > 100000) {
                            break;
                        }
                        engrVar.h(new edug(j, (edxt) eyfy.parseFrom(edxt.a, blob, eyfc.a())));
                        i2 += blob.length;
                    } catch (Throwable th) {
                        if (d != null) {
                            try {
                                d.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (d != null) {
                    d.close();
                }
                return engrVar.g();
            }
        }));
    }
}
