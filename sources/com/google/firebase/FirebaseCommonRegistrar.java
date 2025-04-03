package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.eumr;
import defpackage.eunf;
import defpackage.eupl;
import defpackage.eupm;
import defpackage.eupr;
import defpackage.euqd;
import defpackage.euqq;
import defpackage.euta;
import defpackage.eutb;
import defpackage.eutd;
import defpackage.eutf;
import defpackage.euyq;
import defpackage.euys;
import defpackage.euyt;
import defpackage.euyu;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<eupm<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        eupl b = eupm.b(euyu.class);
        b.b(new euqd(euyq.class, 2, 0));
        b.c = new eupr() { // from class: euyn
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                Set d = eupn.d(eupoVar, euyq.class);
                euyp euypVar = euyp.a;
                if (euypVar == null) {
                    synchronized (euyp.class) {
                        euypVar = euyp.a;
                        if (euypVar == null) {
                            euypVar = new euyp();
                            euyp.a = euypVar;
                        }
                    }
                }
                return new euyo(d, euypVar);
            }
        };
        arrayList.add(b.a());
        final euqq euqqVar = new euqq(eunf.class, Executor.class);
        eupl euplVar = new eupl(euta.class, eutd.class, eutf.class);
        euplVar.b(new euqd(Context.class, 1, 0));
        euplVar.b(new euqd(eumr.class, 1, 0));
        euplVar.b(new euqd(eutb.class, 2, 0));
        euplVar.b(new euqd(euyu.class, 1, 1));
        euplVar.b(new euqd(euqqVar, 1, 0));
        euplVar.c = new eupr() { // from class: eusy
            @Override // defpackage.eupr
            public final Object a(eupo eupoVar) {
                return new euta((Context) eupoVar.e(Context.class), ((eumr) eupoVar.e(eumr.class)).h(), eupn.d(eupoVar, eutb.class), eupoVar.b(euyu.class), (Executor) eupoVar.d(euqq.this));
            }
        };
        arrayList.add(euplVar.a());
        arrayList.add(euyt.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(euyt.a("fire-core", "21.0.0_1p"));
        arrayList.add(euyt.a("device-name", a(Build.PRODUCT)));
        arrayList.add(euyt.a("device-model", a(Build.DEVICE)));
        arrayList.add(euyt.a("device-brand", a(Build.BRAND)));
        arrayList.add(euyt.b("android-target-sdk", new euys() { // from class: eumw
            @Override // defpackage.euys
            public final String a(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            }
        }));
        arrayList.add(euyt.b("android-min-sdk", new euys() { // from class: eumx
            @Override // defpackage.euys
            public final String a(Object obj) {
                int i;
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                if (applicationInfo == null) {
                    return "";
                }
                i = applicationInfo.minSdkVersion;
                return String.valueOf(i);
            }
        }));
        arrayList.add(euyt.b("android-platform", new euys() { // from class: eumy
            @Override // defpackage.euys
            public final String a(Object obj) {
                Context context = (Context) obj;
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        arrayList.add(euyt.b("android-installer", new euys() { // from class: eumz
            @Override // defpackage.euys
            public final String a(Object obj) {
                Context context = (Context) obj;
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
            }
        }));
        return arrayList;
    }
}
