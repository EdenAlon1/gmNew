package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elig implements elcg {
    private static final enru c = enru.c("com/google/apps/tiktok/tracing/debug/DebugTraceListener");
    public final Context a;
    public final eljg b;
    private final errl d;

    public elig(Context context, eljg eljgVar, errl errlVar) {
        this.a = context;
        this.b = eljgVar;
        this.d = errlVar;
    }

    static /* synthetic */ void a(ListenableFuture listenableFuture) {
        try {
            erqt.q(listenableFuture);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((enrr) ((enrr) ((enrr) c.i()).g(e.getCause())).h("com/google/apps/tiktok/tracing/debug/DebugTraceListener", "listen", 'B', "DebugTraceListener.java")).q("Error reading application debug trace setting");
        }
    }

    @Override // defpackage.elcg
    public final void b(final eldq eldqVar, SparseArray sparseArray) {
        final ListenableFuture j = elfr.j(erqt.i(true), new emwl() { // from class: elie
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                final eldq eldqVar2 = eldqVar;
                final elig eligVar = elig.this;
                dubc.b(eligVar.a, eldl.l(new Runnable() { // from class: elid
                    @Override // java.lang.Runnable
                    public final void run() {
                        long j2;
                        final ContentValues contentValues = new ContentValues(4);
                        eldq eldqVar3 = eldqVar2;
                        long j3 = Long.MIN_VALUE;
                        for (ekzx ekzxVar : eldqVar3.e) {
                            if (ekzxVar.e == -1) {
                                contentValues.put("name", ekzxVar.c);
                                j2 = eldqVar3.f + ekzxVar.f;
                                contentValues.put("start_time", Long.valueOf(j2));
                                if (j2 > j3) {
                                    j3 = j2;
                                }
                            } else {
                                j2 = eldqVar3.f + ekzxVar.f + ekzxVar.h;
                                if (j2 > j3) {
                                    j3 = j2;
                                }
                            }
                        }
                        if (eljg.b(contentValues.getAsString("name"))) {
                            return;
                        }
                        elig eligVar2 = elig.this;
                        contentValues.put("end_time", Long.valueOf(j3));
                        eljv createBuilder = eljw.a.createBuilder();
                        createBuilder.copyOnWrite();
                        eljw eljwVar = (eljw) createBuilder.instance;
                        eldqVar3.getClass();
                        eljwVar.c = eldqVar3;
                        eljwVar.b |= 1;
                        contentValues.put("trace_data", createBuilder.build().toByteArray());
                        final ListenableFuture e = eligVar2.b.c.e(new efkr() { // from class: elja
                            @Override // defpackage.efkr
                            public final void a(efks efksVar) {
                                int i = eljg.d;
                                efksVar.c("tracing", contentValues, 0);
                            }
                        });
                        e.b(eldl.l(new Runnable() { // from class: eljb
                            @Override // java.lang.Runnable
                            public final void run() {
                                eljg.a(ListenableFuture.this);
                            }
                        }), erpp.a);
                    }
                }));
                return null;
            }
        }, this.d);
        j.b(new Runnable() { // from class: elif
            @Override // java.lang.Runnable
            public final void run() {
                elig.a(ListenableFuture.this);
            }
        }, erpp.a);
    }
}
