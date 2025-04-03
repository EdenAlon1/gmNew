package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a;
import defpackage.ecvo;
import defpackage.eczs;
import defpackage.edab;
import defpackage.emwl;
import defpackage.emxf;
import defpackage.erny;
import defpackage.eroh;
import defpackage.erqc;
import defpackage.eull;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhenotypeBackgroundRecv", a.a(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
                return;
            }
            final ecvo a = ecvo.a(context);
            if (a == null) {
                ecvo.g();
                emxf.l(false);
                return;
            }
            Map a2 = eczs.a(context);
            if (a2.isEmpty()) {
                return;
            }
            final eczs eczsVar = (eczs) a2.get(stringExtra);
            if (eczsVar == null || !eczsVar.b.equals(eull.FILE)) {
                Log.i("PhenotypeBackgroundRecv", a.a(stringExtra, "Skipping ", " which doesn't use ProcessStable flags."));
                return;
            }
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            final erqc p = ((erqc) erny.g(erqc.o(erny.f(erqc.o(edab.a(a).a()), new emwl() { // from class: eczz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    int i = edab.a;
                    ecyg ecygVar = ecyg.a;
                    eyhm eyhmVar = ((ecym) obj).b;
                    String str = stringExtra;
                    if (eyhmVar.containsKey(str)) {
                        ecygVar = (ecyg) eyhmVar.get(str);
                    }
                    return ecygVar.c;
                }
            }, a.e())), new eroh() { // from class: edar
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    String str;
                    List list = (List) obj;
                    final eczs eczsVar2 = eczs.this;
                    if (!eczsVar2.e) {
                        list = engw.r("");
                    }
                    int i = engw.d;
                    engr engrVar = new engr();
                    Iterator it = list.iterator();
                    while (true) {
                        final ecvo ecvoVar = a;
                        if (!it.hasNext()) {
                            return erqt.a(engrVar.g()).a(new Callable() { // from class: edaq
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return null;
                                }
                            }, ecvoVar.e());
                        }
                        String str2 = stringExtra;
                        final String str3 = (String) it.next();
                        eczn ecznVar = edau.b;
                        if (ecznVar == null || !ecznVar.a(str2, str3)) {
                            final edbv edbvVar = new edbv(ecvoVar, str2, str3, eczsVar2.c);
                            if (eczsVar2.d) {
                                Context context2 = ecvoVar.d;
                                str = edan.a(context2).getString(eczsVar2.a, "");
                            } else {
                                str = str3;
                            }
                            final ListenableFuture a3 = edbvVar.a(str);
                            engrVar.h(erny.g(erny.g(erqc.o(a3), new eroh() { // from class: edao
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    return edbv.this.b((edbx) obj2);
                                }
                            }, ecvoVar.e()), new eroh() { // from class: edap
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    final edbx edbxVar = (edbx) erqt.q(a3);
                                    if (edbxVar.c.isEmpty()) {
                                        return erre.a;
                                    }
                                    final String str4 = str3;
                                    final eczs eczsVar3 = eczsVar2;
                                    final ecvo ecvoVar2 = ecvo.this;
                                    erqc o = erqc.o(edab.a(ecvoVar2).a());
                                    final String str5 = eczsVar3.a;
                                    return erny.g(erqc.o(erny.f(o, new emwl() { // from class: edaa
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            int i2 = edab.a;
                                            String str6 = str5;
                                            ecyg ecygVar = ecyg.a;
                                            str6.getClass();
                                            eyhm eyhmVar = ((ecym) obj3).b;
                                            if (eyhmVar.containsKey(str6)) {
                                                ecygVar = (ecyg) eyhmVar.get(str6);
                                            }
                                            return ecygVar.d;
                                        }
                                    }, ecvoVar2.e())), new eroh() { // from class: edat
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj3) {
                                            String str6 = str4;
                                            if (!((String) obj3).equals(str6)) {
                                                return erre.a;
                                            }
                                            eczn ecznVar2 = edau.b;
                                            if (ecznVar2 != null && ecznVar2.a(eczsVar3.a, str6)) {
                                                return erre.a;
                                            }
                                            return ecvoVar2.b().a(edbxVar.c);
                                        }
                                    }, ecvoVar2.e());
                                }
                            }, ecvoVar.e()));
                        }
                    }
                }
            }, a.e())).p(25L, TimeUnit.SECONDS, a.e());
            p.b(new Runnable() { // from class: edas
                @Override // java.lang.Runnable
                public final void run() {
                    erqc erqcVar = erqc.this;
                    String str = stringExtra;
                    BroadcastReceiver.PendingResult pendingResult = goAsync;
                    try {
                        try {
                            erqt.q(erqcVar);
                            Log.i("PhenotypeBackgroundRecv", a.t(str, "Successfully updated snapshot for "));
                        } catch (ExecutionException e) {
                            Log.w("PhenotypeBackgroundRecv", a.t(str, "Failed to update local snapshot for "), e);
                        }
                    } finally {
                        pendingResult.finish();
                    }
                }
            }, a.e());
        }
    }
}
