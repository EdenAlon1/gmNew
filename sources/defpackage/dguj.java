package defpackage;

import android.content.Context;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dguj extends dgty {
    private ewbr a;

    protected abstract dgur a(Context context);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dgty, defpackage.dgua
    public final void b(String str, byte[] bArr, byte[] bArr2, dgtx dgtxVar, ewdr ewdrVar) {
        int i;
        ewbz ewbzVar;
        eyja eyjaVar;
        dgtx dgtxVar2;
        ewbr ewbrVar = this.a;
        ewbg ewbgVar = null;
        try {
            eydq eydqVar = (eydq) eyfy.parseFrom(eydq.a, bArr, eyfc.a());
            if (eydqVar.b.equals("type.googleapis.com/fedsql.SelectionCriteria")) {
                ewbg ewbgVar2 = (ewbg) eyfy.parseFrom(ewbg.a, eydqVar.c, eyfc.a());
                eaee eaeeVar = ewbr.a;
                eaeeVar.a(Level.INFO, eaeeVar.a, null, "Parsed selection criteria: %s", ewbgVar2);
                ewbgVar = ewbgVar2;
            }
        } catch (eygu e) {
            eaee eaeeVar2 = ewbr.a;
            eaeeVar2.a(Level.WARNING, eaeeVar2.a, e, "Could not parse SQL selection criteria.", new Object[0]);
        }
        ewdn ewdnVar = ewdrVar.b;
        if (ewdnVar == null) {
            ewdnVar = ewdn.a;
        }
        int i2 = ewdnVar.d;
        int i3 = 3;
        int i4 = i2 != 0 ? i2 != 1 ? 0 : 3 : 2;
        if (i4 == 0) {
            i4 = 1;
        }
        if (ewbgVar == null) {
            ewbr.a.b("Not a SQL query; caller should handle query.");
            if (Log.isLoggable("ExampleStoreSvc", 3)) {
                Log.d("ExampleStoreSvc", "startQuery called with collection ".concat(String.valueOf(str)));
            }
            try {
                eydq eydqVar2 = (eydq) eyfy.parseFrom(eydq.a, bArr, eyfc.a());
                try {
                    if (!eydqVar2.b.isEmpty() && !"type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria".equals(eydqVar2.b)) {
                        throw new eygu(String.format("Incorrect type url: %s, expected: %s", eydqVar2.b, "type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria"));
                    }
                    ewbzVar = (ewbz) eyfy.parseFrom(ewbz.a, eydqVar2.c, eyfc.a());
                    eyjaVar = ewbzVar.f;
                    if (eyjaVar == null) {
                        eyjaVar = eyja.a;
                    }
                } catch (eygu e2) {
                    e = e2;
                }
                try {
                    if (eyjaVar.b < 0) {
                        throw new eygu("Start date less than zero");
                    }
                    eyja eyjaVar2 = ewbzVar.f;
                    if ((eyjaVar2 == null ? eyja.a : eyjaVar2).c >= 0) {
                        if ((eyjaVar2 == null ? eyja.a : eyjaVar2).c <= 999999999) {
                            eyja eyjaVar3 = ewbzVar.g;
                            if ((eyjaVar3 == null ? eyja.a : eyjaVar3).b < 0) {
                                throw new eygu("End date less than zero");
                            }
                            if ((eyjaVar3 == null ? eyja.a : eyjaVar3).c >= 0) {
                                if ((eyjaVar3 == null ? eyja.a : eyjaVar3).c <= 999999999) {
                                    if (eyjaVar3 == null) {
                                        eyjaVar3 = eyja.a;
                                    }
                                    long j = eyjaVar3.b;
                                    if (eyjaVar2 == null) {
                                        eyjaVar2 = eyja.a;
                                    }
                                    if (j < eyjaVar2.b) {
                                        throw new eygu("End date before start date");
                                    }
                                    try {
                                        eydq eydqVar3 = (eydq) eyfy.parseFrom(eydq.a, bArr2, eyfc.a());
                                        try {
                                            if (!eydqVar3.equals(eydq.a) && !"type.googleapis.com/intelligence.brella.proto.examplestore.ResumptionPoint".equals(eydqVar3.b)) {
                                                throw new eygu(String.format("Incorrect type url: %s, expected: %s", eydqVar3.b, "type.googleapis.com/intelligence.brella.proto.examplestore.ResumptionPoint"));
                                            }
                                            ewbw ewbwVar = (ewbw) eyfy.parseFrom(ewbw.a, eydqVar3.c, eyfc.a());
                                            if ((ewbwVar.b == 1 ? ((Long) ewbwVar.c).longValue() : 0L) >= 0) {
                                                dgur a = a(this);
                                                dgur.a(str);
                                                dgtxVar.b(new dgum(a.b, str, ewbzVar, ewbwVar, a.c));
                                                return;
                                            } else {
                                                dgtxVar2 = dgtxVar;
                                                try {
                                                    throw new eygu("LastReturnedId less than zero");
                                                } catch (eygu e3) {
                                                    e = e3;
                                                    Log.w("ExampleStoreSvc", e.getMessage());
                                                    dgtxVar2.a(10, e.getMessage());
                                                    return;
                                                }
                                            }
                                        } catch (eygu e4) {
                                            e = e4;
                                            dgtxVar2 = dgtxVar;
                                        }
                                    } catch (eygu unused) {
                                        Log.w("ExampleStoreSvc", "Error parsing Any proto from resumptionPoint");
                                        dgtxVar.a(10, "Error parsing Any proto from resumptionPoint");
                                        return;
                                    }
                                }
                            }
                            throw new eygu("Invalid end date nanos");
                        }
                    }
                    throw new eygu("Invalid start date nanos");
                } catch (eygu e5) {
                    e = e5;
                    String concat = "Error parsing SelectionCriteria proto: ".concat(String.valueOf(e.getMessage()));
                    Log.w("ExampleStoreSvc", concat);
                    dgtxVar.a(10, concat);
                    return;
                }
            } catch (eygu unused2) {
                Log.w("ExampleStoreSvc", "Error parsing Any proto from criteria");
                dgtxVar.a(10, "Error parsing Any proto from criteria");
                return;
            }
        }
        try {
            int i5 = ewbgVar.e;
            emxf.b(i5 > 0, "min_client_sql_version must be set to a positive value");
            if (i5 > 6) {
                throw new ewbh(i5);
            }
            ArrayList arrayList = new ArrayList();
            int i6 = i4 - 2;
            if (i6 == -1 || i6 == 0) {
                i = 0;
                emxf.b(1 == (ewbgVar.b & 1), "client_query must be set.");
                emxf.b(!((ewbgVar.b & 8) != 0), "client_queries must not be set.");
                eweb ewebVar = ewbgVar.c;
                if (ewebVar == null) {
                    ewebVar = eweb.a;
                }
                arrayList.add(ewebVar);
            } else {
                i = 0;
                emxf.b(1 == ((ewbgVar.b & 1) ^ 1), "client_query must not be set for lightweight client tasks.");
                emxf.b((ewbgVar.b & 8) != 0, "client_queries must be set.");
                ewee eweeVar = ewbgVar.g;
                if (eweeVar == null) {
                    eweeVar = ewee.a;
                }
                emxf.b(1 == (eweeVar.b & 1), "SqlQuerySet.database_schema must be set.");
                ewdz ewdzVar = eweeVar.d;
                if (ewdzVar == null) {
                    ewdzVar = ewdz.a;
                }
                ewbr.a(ewdzVar);
                arrayList.addAll(DesugarCollections.unmodifiableMap(eweeVar.c).values());
            }
            int size = arrayList.size();
            int i7 = i;
            while (i7 < size) {
                eweb ewebVar2 = (eweb) arrayList.get(i7);
                int i8 = ewebVar2.c;
                int i9 = i8 != 0 ? i8 != 1 ? i : i3 : 2;
                emxf.b((i9 != 0 && i9 == i3) ? 1 : i, "SQLite is the only currently supported client_query.sql_dialect");
                if (i6 == -1 || i6 == 0) {
                    emxf.b(1 != (ewebVar2.b & 1) ? i : 1, "client_query.database_schema must be set");
                    ewdz ewdzVar2 = ewebVar2.d;
                    if (ewdzVar2 == null) {
                        ewdzVar2 = ewdz.a;
                    }
                    ewbr.a(ewdzVar2);
                } else {
                    emxf.b(1 != ((ewebVar2.b & 1) ^ 1) ? i : 1, "SqlQuery.database_schema must not be set for lightweight client tasks");
                }
                emxf.b(!ewebVar2.e.isEmpty(), "client_query.raw_sql must be set.");
                i7++;
                i3 = 3;
            }
            try {
                eydq eydqVar4 = ewdrVar.c;
                if (eydqVar4 == null) {
                    eydqVar4 = eydq.a;
                }
                if (((dgwc) eyfy.parseFrom(dgwc.a, eydqVar4.c, eyfc.a())).b == null) {
                    dgwe dgweVar = dgwe.a;
                }
                eaee eaeeVar3 = ewbr.a;
                eweb ewebVar3 = ewbgVar.c;
                if (ewebVar3 == null) {
                    ewebVar3 = eweb.a;
                }
                Object[] objArr = new Object[1];
                objArr[i] = ewebVar3.e;
                eaeeVar3.c("Handling SQL query: %s", objArr);
                eydq eydqVar5 = ewbgVar.d;
                if (eydqVar5 == null) {
                    eydqVar5 = eydq.a;
                }
                b(str, eydqVar5.toByteArray(), bArr2, new ewbl(ewbrVar, this, ewbgVar, i4, ewdrVar, str, dgtxVar), ewdrVar);
            } catch (eygu e6) {
                dgtxVar.a(8, e6.getMessage());
            }
        } catch (ewbk e7) {
            dgtxVar.a(e7.a, e7.getMessage());
        } catch (IllegalArgumentException e8) {
            e = e8;
            dgtxVar.a(8, e.getMessage());
        } catch (IllegalStateException e9) {
            e = e9;
            dgtxVar.a(8, e.getMessage());
        } catch (NullPointerException e10) {
            e = e10;
            dgtxVar.a(8, e.getMessage());
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.a = new ewbr(Executors.newSingleThreadExecutor());
        if (Log.isLoggable("ExampleStoreSvc", 3)) {
            Log.d("ExampleStoreSvc", "onCreate() called");
        }
    }

    @Override // defpackage.dgty, android.app.Service
    public final void onDestroy() {
        if (Log.isLoggable("ExampleStoreSvc", 3)) {
            Log.d("ExampleStoreSvc", "onDestroy() called");
        }
        super.onDestroy();
    }
}
