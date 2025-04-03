package defpackage;

import android.content.ContentValues;
import android.content.Context;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.DesugarCollections;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewbp implements dgtt {
    public final dgtt a;
    public final ewbt b;
    private final Executor c;
    private final ewbg d;
    private final ewdi e;
    private final String f;
    private volatile Deque g = null;
    private final int h;

    public ewbp(Context context, Executor executor, ewbg ewbgVar, dgtt dgttVar, int i, ewdi ewdiVar, String str, ewdr ewdrVar) {
        ewdz ewdzVar;
        this.c = new ersb(executor);
        if ((ewbgVar.b & 8) != 0) {
            ewee eweeVar = ewbgVar.g;
            ewdzVar = (eweeVar == null ? ewee.a : eweeVar).d;
            if (ewdzVar == null) {
                ewdzVar = ewdz.a;
            }
        } else {
            eweb ewebVar = ewbgVar.c;
            ewdzVar = (ewebVar == null ? eweb.a : ewebVar).d;
            if (ewdzVar == null) {
                ewdzVar = ewdz.a;
            }
        }
        this.b = new ewbt(context, ewdzVar, ewdrVar);
        this.d = ewbgVar;
        this.a = dgttVar;
        this.h = i;
        this.e = ewdiVar;
        this.f = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean d() {
        SettableFuture create = SettableFuture.create();
        this.a.a(new ewbo(create));
        try {
            emxc emxcVar = (emxc) create.get();
            if (!emxcVar.g()) {
                return true;
            }
            try {
                byte[] bArr = (byte[]) emxcVar.c();
                eyfc eyfcVar = eyfc.a;
                eyib eyibVar = eyib.a;
                fivj fivjVar = (fivj) eyfy.parseFrom(fivj.a, bArr, eyfc.a);
                ewbt ewbtVar = this.b;
                ContentValues contentValues = new ContentValues();
                fivp fivpVar = fivjVar.c;
                if (fivpVar == null) {
                    fivpVar = fivp.a;
                }
                Iterator it = DesugarCollections.unmodifiableMap(fivpVar.b).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (!ewbtVar.c.d.isEmpty()) {
                            contentValues.put(ewbtVar.c.d, "Outis");
                        }
                        ewbtVar.b.getWritableDatabase().insertOrThrow(ewbtVar.c.b, null, contentValues);
                        return false;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (ewbtVar.d.contains(str)) {
                        fivm fivmVar = (fivm) entry.getValue();
                        emxf.f(!contentValues.containsKey(str), "Column name `%s` already present in the specified contentValues.", str);
                        int i = fivmVar.b;
                        int b = fivl.b(i);
                        if (b == 0) {
                            throw null;
                        }
                        int i2 = b - 1;
                        if (i2 == 0) {
                            fivh fivhVar = i == 1 ? (fivh) fivmVar.c : fivh.a;
                            emxf.d(fivhVar.b.size() == 1, "Expected %s to be scalar, but bytes_list.value count was: %d", fivhVar.b.size());
                            contentValues.put(str, ((eyee) fivhVar.b.get(0)).I());
                        } else if (i2 == 1) {
                            fivr fivrVar = i == 2 ? (fivr) fivmVar.c : fivr.a;
                            emxf.d(fivrVar.b.size() == 1, "Expected %s to be scalar, but float_list.value count was: %d", fivrVar.b.size());
                            contentValues.put(str, Float.valueOf(fivrVar.b.d(0)));
                        } else {
                            if (i2 != 2) {
                                throw new AssertionError();
                            }
                            fivt fivtVar = i == 3 ? (fivt) fivmVar.c : fivt.a;
                            emxf.d(fivtVar.b.size() == 1, "Expected %s to be scalar, but int64_list.value count was: %d", fivtVar.b.size());
                            contentValues.put(str, Long.valueOf(fivtVar.b.a(0)));
                        }
                    } else if (ewbtVar.e.containsKey(str)) {
                        Map map = ewbtVar.f;
                        fivm fivmVar2 = (fivm) entry.getValue();
                        ewnz ewnzVar = (ewnz) ewbtVar.e.get(str);
                        ewcz ewczVar = (ewcz) ewda.a.createBuilder();
                        switch (ewnzVar) {
                            case UNSPECIFIED:
                            case UNRECOGNIZED:
                                throw new AssertionError();
                            case INT32:
                                ewct ewctVar = (ewct) ewcu.a.createBuilder();
                                ewctVar.a(ewbu.b(fivmVar2));
                                ewcu ewcuVar = (ewcu) ewctVar.build();
                                ewczVar.copyOnWrite();
                                ewda ewdaVar = (ewda) ewczVar.instance;
                                ewcuVar.getClass();
                                ewdaVar.c = ewcuVar;
                                ewdaVar.b = 1;
                                map.put(str, (ewda) ewczVar.build());
                                break;
                            case INT64:
                                ewcv ewcvVar = (ewcv) ewcw.a.createBuilder();
                                ewcvVar.a(ewbu.b(fivmVar2));
                                ewcw ewcwVar = (ewcw) ewcvVar.build();
                                ewczVar.copyOnWrite();
                                ewda ewdaVar2 = (ewda) ewczVar.instance;
                                ewcwVar.getClass();
                                ewdaVar2.c = ewcwVar;
                                ewdaVar2.b = 2;
                                map.put(str, (ewda) ewczVar.build());
                                break;
                            case BOOL:
                                ewck ewckVar = (ewck) ewcl.a.createBuilder();
                                ewckVar.a(ewbu.b(fivmVar2) == 1);
                                ewcl ewclVar = (ewcl) ewckVar.build();
                                ewczVar.copyOnWrite();
                                ewda ewdaVar3 = (ewda) ewczVar.instance;
                                ewclVar.getClass();
                                ewdaVar3.c = ewclVar;
                                ewdaVar3.b = 3;
                                map.put(str, (ewda) ewczVar.build());
                                break;
                            case FLOAT:
                                ewcr ewcrVar = (ewcr) ewcs.a.createBuilder();
                                ewcrVar.a(ewbu.a(fivmVar2));
                                ewcs ewcsVar = (ewcs) ewcrVar.build();
                                ewczVar.copyOnWrite();
                                ewda ewdaVar4 = (ewda) ewczVar.instance;
                                ewcsVar.getClass();
                                ewdaVar4.c = ewcsVar;
                                ewdaVar4.b = 4;
                                map.put(str, (ewda) ewczVar.build());
                                break;
                            case DOUBLE:
                                ewcp ewcpVar = (ewcp) ewcq.a.createBuilder();
                                ewcpVar.a(ewbu.a(fivmVar2));
                                ewcq ewcqVar = (ewcq) ewcpVar.build();
                                ewczVar.copyOnWrite();
                                ewda ewdaVar5 = (ewda) ewczVar.instance;
                                ewcqVar.getClass();
                                ewdaVar5.c = ewcqVar;
                                ewdaVar5.b = 5;
                                map.put(str, (ewda) ewczVar.build());
                                break;
                            case BYTES:
                                ewcn ewcnVar = (ewcn) ewco.a.createBuilder();
                                ewcnVar.a(ewbu.c(fivmVar2));
                                ewco ewcoVar = (ewco) ewcnVar.build();
                                ewczVar.copyOnWrite();
                                ewda ewdaVar6 = (ewda) ewczVar.instance;
                                ewcoVar.getClass();
                                ewdaVar6.c = ewcoVar;
                                ewdaVar6.b = 7;
                                map.put(str, (ewda) ewczVar.build());
                                break;
                            case STRING:
                                ewcx ewcxVar = (ewcx) ewcy.a.createBuilder();
                                ewcxVar.a(ewbu.c(fivmVar2).E());
                                ewcy ewcyVar = (ewcy) ewcxVar.build();
                                ewczVar.copyOnWrite();
                                ewda ewdaVar7 = (ewda) ewczVar.instance;
                                ewcyVar.getClass();
                                ewdaVar7.c = ewcyVar;
                                ewdaVar7.b = 6;
                                map.put(str, (ewda) ewczVar.build());
                                break;
                            default:
                                map.put(str, (ewda) ewczVar.build());
                                break;
                        }
                    } else {
                        continue;
                    }
                }
            } catch (eygu e) {
                throw new ewbj(e);
            }
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            cause.getClass();
            ewbq ewbqVar = (ewbq) cause;
            throw new ewbq(ewbqVar.a, ewbqVar.getMessage(), e2);
        }
    }

    private static String[] e(ewbg ewbgVar, String str, ewdi ewdiVar) {
        if ((ewbgVar.b & 4) != 0) {
            ewbb ewbbVar = ewbgVar.f;
            if (ewbbVar == null) {
                ewbbVar = ewbb.a;
            }
            if (!ewbbVar.b) {
                eyja eyjaVar = (eyja) DesugarCollections.unmodifiableMap(ewdiVar.b).get(str);
                return new String[]{eyjaVar != null ? String.valueOf(eykm.b(eyjaVar)) : "0"};
            }
        }
        return new String[0];
    }

    @Override // defpackage.dgtt
    public final void a(final dgts dgtsVar) {
        this.c.execute(new Runnable() { // from class: ewbn
            @Override // java.lang.Runnable
            public final void run() {
                ewbp.this.c(dgtsVar);
            }
        });
    }

    @Override // defpackage.dgtt
    public final void b() {
        ewbr.a.b("request() called");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x08d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[Catch: UnsupportedOperationException -> 0x0b82, InterruptedException -> 0x0b84, ewbk -> 0x0b88, SYNTHETIC, TryCatch #10 {ewbk -> 0x0b88, InterruptedException -> 0x0b84, UnsupportedOperationException -> 0x0b82, blocks: (B:18:0x0039, B:21:0x0041, B:22:0x005a, B:28:0x007d, B:29:0x009e, B:31:0x00a4, B:33:0x00c4, B:258:0x08b8, B:317:0x08da, B:316:0x08d7, B:349:0x08db, B:350:0x08ed, B:352:0x08ee, B:354:0x0933, B:355:0x0939, B:357:0x0966), top: B:15:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void c(defpackage.dgts r31) {
        /*
            Method dump skipped, instructions count: 3094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewbp.c(dgts):void");
    }

    @Override // defpackage.dgtt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.execute(new Runnable() { // from class: ewbm
            @Override // java.lang.Runnable
            public final void run() {
                ewbp ewbpVar = ewbp.this;
                ewbpVar.b.close();
                ewbpVar.a.close();
            }
        });
    }
}
