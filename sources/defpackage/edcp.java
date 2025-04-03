package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edcp {
    public final String a;
    final emyl b;
    final emyl c;
    Resources d;
    public final /* synthetic */ edcq e;

    public edcp(final edcq edcqVar, final String str, emyl emylVar) {
        this.e = edcqVar;
        this.a = str;
        this.b = new edcl(new emyl() { // from class: edcm
            @Override // defpackage.emyl
            public final Object get() {
                eukn euknVar;
                edcp edcpVar = edcp.this;
                edcq edcqVar2 = edcqVar;
                String str2 = str;
                try {
                    PackageManager packageManager = edcqVar2.a;
                    eukn euknVar2 = euko.a;
                    if (str2 == null) {
                        throw null;
                    }
                    Intent intent = new Intent("com.google.android.build.data.Properties");
                    intent.setPackage(str2);
                    List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 787072);
                    if (queryIntentServices.isEmpty()) {
                        euknVar = euko.a;
                    } else {
                        if (queryIntentServices.size() > 1) {
                            throw new IOException("Failed to resolve target AndroidBuildData");
                        }
                        int i = queryIntentServices.get(0).serviceInfo.metaData.getInt("com.google.android.build.data.properties");
                        if (i == 0) {
                            euknVar = euko.a;
                        } else {
                            try {
                                InputStream openRawResource = edcpVar.a().openRawResource(i);
                                eyfc eyfcVar = eyfc.a;
                                eyib eyibVar = eyib.a;
                                euknVar = (eukn) eyfy.parseFrom(eukn.a, openRawResource, eyfc.a);
                            } catch (PackageManager.NameNotFoundException unused) {
                                euknVar = euko.a;
                            }
                        }
                    }
                    return Long.valueOf(euknVar.b);
                } catch (IOException e) {
                    Log.e("PhenotypeResourceReader", "Failed to read baseline CL for package ".concat(String.valueOf(str2)), e);
                    return -1L;
                }
            }
        });
        this.c = emylVar;
    }

    public final Resources a() {
        Resources resources = this.d;
        if (resources != null) {
            return resources;
        }
        edcq edcqVar = this.e;
        Resources resourcesForApplication = edcqVar.a.getResourcesForApplication(this.a);
        this.d = resourcesForApplication;
        return resourcesForApplication;
    }
}
