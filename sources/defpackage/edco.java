package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edco {
    public final String a;
    public final emyl b;
    final /* synthetic */ edcp c;

    public edco(edcp edcpVar, String str, final int i, final int i2) {
        this.c = edcpVar;
        this.a = str;
        this.b = new edcl(new emyl() { // from class: edcn
            @Override // defpackage.emyl
            public final Object get() {
                eulo euloVar = (eulo) eulq.a.createBuilder();
                edco edcoVar = edco.this;
                int i3 = i;
                try {
                    Resources a = edcoVar.c.a();
                    if (a == null) {
                        Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from " + edcoVar.c.a);
                        return null;
                    }
                    try {
                        edcoVar.a(euloVar, a, i3);
                        long longValue = ((Long) edcoVar.c.b.get()).longValue();
                        euloVar.copyOnWrite();
                        eulq eulqVar = (eulq) euloVar.instance;
                        eulqVar.b |= 128;
                        eulqVar.l = longValue;
                        String str2 = eulqVar.g;
                        int indexOf = str2.indexOf(35);
                        if (indexOf >= 0) {
                            str2 = str2.substring(0, indexOf);
                        }
                        String str3 = edcoVar.a;
                        emxf.p(str2.equals(str3), "Resource package does not match expected package, expected package: %s", str3);
                        eulq eulqVar2 = (eulq) euloVar.instance;
                        String str4 = eulqVar2.g;
                        edcp edcpVar2 = edcoVar.c;
                        boolean z = eulqVar2.h;
                        if (str4.isEmpty()) {
                            throw new IllegalArgumentException("Empty configuration package");
                        }
                        if (z) {
                            if (str4.indexOf(35) >= 0) {
                                throw new IllegalArgumentException(String.format("When %s is present, %s should not contain subpackage separator %s (config package=%s)", "auto-subpackage", "configuration-package", '#', str4));
                            }
                            str4 = str4 + "#" + edcpVar2.a;
                        }
                        if (((eulq) euloVar.instance).c != 2) {
                            Integer num = (Integer) edcoVar.c.c.get();
                            num.intValue();
                            euloVar.copyOnWrite();
                            eulq eulqVar3 = (eulq) euloVar.instance;
                            eulqVar3.c = 2;
                            eulqVar3.d = num;
                        }
                        int i4 = i2;
                        euloVar.copyOnWrite();
                        eulq eulqVar4 = (eulq) euloVar.instance;
                        str4.getClass();
                        eulqVar4.b |= 1;
                        eulqVar4.g = str4;
                        edcp edcpVar3 = edcoVar.c;
                        euloVar.copyOnWrite();
                        eulq eulqVar5 = (eulq) euloVar.instance;
                        String str5 = edcpVar3.a;
                        str5.getClass();
                        eulqVar5.e = 7;
                        eulqVar5.f = str5;
                        euloVar.copyOnWrite();
                        eulq eulqVar6 = (eulq) euloVar.instance;
                        eulqVar6.k = 3;
                        eulqVar6.b |= 32;
                        if (i4 == 0) {
                            return (eulq) euloVar.build();
                        }
                        edci edciVar = (edci) edcj.a.createBuilder();
                        try {
                            edcoVar.a(edciVar, a, i4);
                            emxf.r(((edcj) edciVar.instance).c.equals(edcoVar.a), "Package in HeterodyneInfo binary %s does not match resource lookup for %s", ((edcj) edciVar.instance).c, edcoVar.a);
                            edciVar.copyOnWrite();
                            edcj edcjVar = (edcj) edciVar.instance;
                            edcjVar.b &= -2;
                            edcjVar.c = edcj.a.c;
                            eyee byteString = ((edcj) edciVar.build()).toByteString();
                            euloVar.copyOnWrite();
                            eulq eulqVar7 = (eulq) euloVar.instance;
                            eulqVar7.b |= 256;
                            eulqVar7.m = byteString;
                            return (eulq) euloVar.build();
                        } catch (IOException unused) {
                            Log.i("PhenotypeResourceReader", "Failed to read Phenotype HeterodyneInfo resources from ".concat(String.valueOf(edcoVar.c.a)));
                            return null;
                        }
                    } catch (IOException | NullPointerException unused2) {
                        Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from ".concat(String.valueOf(edcoVar.c.a)));
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from ".concat(String.valueOf(edcoVar.c.a)));
                }
            }
        });
    }

    public final void a(eyhr eyhrVar, Resources resources, int i) {
        InputStream openRawResource = resources.openRawResource(i);
        try {
            this.c.e.c++;
            eyel N = eyel.N(openRawResource, Math.max(512, Math.min(4096, openRawResource.available())));
            eyfc eyfcVar = eyfc.a;
            eyib eyibVar = eyib.a;
            eyhrVar.mergeFrom(N, eyfc.a);
            if (openRawResource != null) {
                openRawResource.close();
            }
        } catch (Throwable th) {
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
