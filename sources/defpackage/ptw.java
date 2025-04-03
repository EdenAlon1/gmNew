package defpackage;

import android.database.Cursor;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ptw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ pua b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptw(pua puaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = puaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ptw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        final ptt ptqVar;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                pua puaVar = this.b;
                ffuf ffufVar = puaVar.j;
                ptv ptvVar = new ptv(puaVar, null);
                this.a = 1;
                obj = ffra.a(ffufVar, ptvVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            ptqVar = (ptt) obj;
        } catch (pti e) {
            ptqVar = new pts(e.a);
        } catch (CancellationException unused) {
            ptqVar = new ptq(null);
        } catch (Throwable th) {
            String str = puc.a;
            ppt.c();
            Log.e(str, "Unexpected error in WorkerWrapper", th);
            ptqVar = new ptq(null);
        }
        final pua puaVar2 = this.b;
        Object f = puaVar2.e.f(new Callable() { // from class: ptu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                pua puaVar3 = puaVar2;
                ptt pttVar = ptt.this;
                boolean z = true;
                if (pttVar instanceof ptr) {
                    ppq ppqVar = ((ptr) pttVar).a;
                    pyk pykVar = puaVar3.f;
                    String str2 = puaVar3.c;
                    WorkDatabase workDatabase = puaVar3.e;
                    pqp a = pykVar.a(str2);
                    workDatabase.C().a(str2);
                    if (a != null) {
                        if (a == pqp.RUNNING) {
                            if (ppqVar instanceof ppp) {
                                String str3 = puc.a;
                                ppt.c();
                                Log.i(str3, "Worker result SUCCESS for ".concat(puaVar3.h));
                                if (puaVar3.a.f()) {
                                    puaVar3.d();
                                } else {
                                    puaVar3.f.m(pqp.SUCCEEDED, puaVar3.c);
                                    pot potVar = ((ppp) ppqVar).a;
                                    potVar.getClass();
                                    puaVar3.f.i(puaVar3.c, potVar);
                                    pwz pwzVar = puaVar3.g;
                                    String str4 = puaVar3.c;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    for (String str5 : pwzVar.a(str4)) {
                                        if (puaVar3.f.a(str5) == pqp.BLOCKED) {
                                            pwz pwzVar2 = puaVar3.g;
                                            otj a2 = otj.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                                            a2.g(1, str5);
                                            pxb pxbVar = (pxb) pwzVar2;
                                            pxbVar.a.m();
                                            Cursor a3 = ovn.a(pxbVar.a, a2, false);
                                            try {
                                                if (a3.moveToFirst() && a3.getInt(0) != 0) {
                                                    String valueOf = String.valueOf(str5);
                                                    String str6 = puc.a;
                                                    ppt.c();
                                                    Log.i(str6, "Setting status to enqueued for ".concat(valueOf));
                                                    puaVar3.f.m(pqp.ENQUEUED, str5);
                                                    puaVar3.f.h(str5, currentTimeMillis);
                                                }
                                            } finally {
                                                a3.close();
                                                a2.j();
                                            }
                                        }
                                    }
                                }
                            } else if (ppqVar instanceof ppo) {
                                String str7 = puc.a;
                                ppt.c();
                                Log.i(str7, "Worker result RETRY for ".concat(puaVar3.h));
                                puaVar3.c(-256);
                            } else {
                                String str8 = puc.a;
                                ppt.c();
                                Log.i(str8, "Worker result FAILURE for ".concat(puaVar3.h));
                                if (puaVar3.a.f()) {
                                    puaVar3.d();
                                } else {
                                    puaVar3.e(ppqVar);
                                }
                            }
                        } else if (!a.a()) {
                            puaVar3.c(-512);
                        }
                    }
                    z = false;
                } else {
                    if (pttVar instanceof ptq) {
                        puaVar3.e(((ptq) pttVar).a);
                    } else {
                        if (!(pttVar instanceof pts)) {
                            throw new ffcd();
                        }
                        int i = ((pts) pttVar).a;
                        pqp a4 = puaVar3.f.a(puaVar3.c);
                        if (a4 == null || a4.a()) {
                            String str9 = puc.a;
                            ppt.c().a(str9, "Status for " + puaVar3.c + " is " + a4 + " ; not doing any work");
                        } else {
                            String str10 = puc.a;
                            ppt.c().a(str10, "Status for " + puaVar3.c + " is " + a4 + "; not doing any work and rescheduling for later execution");
                            puaVar3.f.m(pqp.ENQUEUED, puaVar3.c);
                            puaVar3.f.j(puaVar3.c, i);
                            puaVar3.f.l(puaVar3.c, -1L);
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
        f.getClass();
        return f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ptw(this.b, ffguVar);
    }
}
