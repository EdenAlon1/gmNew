package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a;
import defpackage.ecvo;
import defpackage.edab;
import defpackage.emwl;
import defpackage.ernq;
import defpackage.erny;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.erqc;
import defpackage.erqt;
import defpackage.erre;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        String stringExtra;
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("accountType")) != null) {
            if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                Bundle extras = intent.getExtras();
                final String string = extras != null ? extras.getString("authAccount") : null;
                if (string != null && (string.contains("../") || string.contains("/.."))) {
                    Log.w("AccountRemovedRecv", a.a(string, "Got an invalid account name for P/H that includes '..':", ". Exiting."));
                    return;
                }
                ecvo.g();
                final ecvo a = ecvo.a(context);
                if (a == null) {
                    Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                    return;
                }
                final BroadcastReceiver.PendingResult goAsync = goAsync();
                ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
                listenableFutureArr[0] = ernq.f(string != null ? erny.g(erqc.o(edab.a(a).b(new emwl() { // from class: eczw
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        int i = edab.a;
                        ecyl ecylVar = (ecyl) ecym.a.createBuilder();
                        for (Map.Entry entry : DesugarCollections.unmodifiableMap(((ecym) obj).b).entrySet()) {
                            String str = string;
                            ecyg ecygVar = (ecyg) entry.getValue();
                            ecyf ecyfVar = (ecyf) ecyg.a.createBuilder();
                            if (!ecygVar.d.equals(str)) {
                                String str2 = ecygVar.d;
                                ecyfVar.copyOnWrite();
                                ecyg ecygVar2 = (ecyg) ecyfVar.instance;
                                str2.getClass();
                                ecygVar2.b |= 1;
                                ecygVar2.d = str2;
                            }
                            for (String str3 : ecygVar.c) {
                                if (!str3.equals(str)) {
                                    ecyfVar.a(str3);
                                }
                            }
                            ecylVar.a((String) entry.getKey(), (ecyg) ecyfVar.build());
                        }
                        return (ecym) ecylVar.build();
                    }
                }, a.e())), new eroh() { // from class: eczx
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        int i = edab.a;
                        int i2 = engw.d;
                        engr engrVar = new engr();
                        ecvo ecvoVar = ecvo.this;
                        engrVar.h(ecvoVar.d);
                        int i3 = dubc.a;
                        engrVar.h(dubc.a(ecvoVar.d));
                        engw g = engrVar.g();
                        int i4 = ((enou) g).c;
                        boolean z = true;
                        for (int i5 = 0; i5 < i4; i5++) {
                            String str = string;
                            File file = new File(String.valueOf(((Context) g.get(i5)).getFilesDir()) + "/phenotype/shared/" + str);
                            Log.i("PhenotypeAccountStore", "Removing snapshots for removed user");
                            if (file.exists()) {
                                z = edab.b(file);
                            }
                        }
                        return z ? erre.a : erqt.h(new IOException("Unable to remove snapshots for removed user"));
                    }
                }, a.e()) : erre.a, IOException.class, new emwl() { // from class: ecyh
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
                    }
                }, erpp.a);
                listenableFutureArr[1] = string != null ? a.e().submit(new Runnable() { // from class: ecyi
                    @Override // java.lang.Runnable
                    public final void run() {
                        SharedPreferences a2 = edan.a(context);
                        SharedPreferences.Editor editor = null;
                        for (Map.Entry<String, ?> entry : a2.getAll().entrySet()) {
                            if (entry.getValue() instanceof String) {
                                if (entry.getValue().equals(string)) {
                                    if (editor == null) {
                                        editor = a2.edit();
                                    }
                                    editor.remove(entry.getKey());
                                }
                            }
                        }
                        if (editor != null) {
                            editor.commit();
                        }
                    }
                }) : erre.a;
                erqt.b(listenableFutureArr).a(new Callable() { // from class: ecyj
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        goAsync.finish();
                        return null;
                    }
                }, erpp.a);
            }
        }
    }
}
