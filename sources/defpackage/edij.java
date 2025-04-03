package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edij {
    public final edkp a;
    public final dlpw b;
    public final edjc c;
    public final edip d;
    public final edkq e;
    private final exit f;
    private final edik g;
    private final fdxp h;

    public edij(edkq edkqVar, feau feauVar, edkp edkpVar, dlpw dlpwVar, edjc edjcVar, edip edipVar, edik edikVar, fdxp fdxpVar) {
        this.e = edkqVar;
        this.f = (exit) exit.h(new exis(), feauVar);
        this.g = edikVar;
        this.a = edkpVar;
        this.b = dlpwVar;
        this.c = edjcVar;
        this.d = edipVar;
        this.h = fdxpVar;
    }

    public final ListenableFuture a() {
        emxf.m(this.e.c(), "ApiConfig must be initialized.");
        return erqt.i(edfs.a);
    }

    public final dhre b(final edrs edrsVar, final int i) {
        edqs edqsVar = (edqs) edrsVar;
        if (edqsVar.a.isEmpty()) {
            return dhrt.b(new dfqu(new Status(9012, "Place id must not be an empty string.")));
        }
        List list = edqsVar.b;
        if (list.isEmpty()) {
            return dhrt.b(new dfqu(new Status(9012, "Place fields must not be empty.")));
        }
        final long a = this.b.a();
        ArrayList arrayList = new ArrayList(edir.a(list));
        arrayList.add("attributions");
        final String a2 = edhm.a(arrayList, false, new ArrayList());
        final ListenableFuture a3 = a();
        final ListenableFuture g = erny.g(a3, new eroh() { // from class: edid
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                edij edijVar = edij.this;
                exit c = edijVar.c(a2, (edfs) obj);
                Locale b = edijVar.e.b();
                exhk exhkVar = (exhk) exhl.a.createBuilder();
                exhkVar.copyOnWrite();
                ((exhl) exhkVar.instance).b = "places/".concat(((edqs) edrsVar).a);
                String languageTag = b.toLanguageTag();
                exhkVar.copyOnWrite();
                exhl exhlVar = (exhl) exhkVar.instance;
                languageTag.getClass();
                exhlVar.c = languageTag;
                exhl exhlVar2 = (exhl) exhkVar.build();
                fdxk fdxkVar = c.a;
                febs febsVar = exiu.d;
                if (febsVar == null) {
                    synchronized (exiu.class) {
                        febsVar = exiu.d;
                        if (febsVar == null) {
                            febp a4 = febs.a();
                            a4.c = febr.UNARY;
                            a4.d = febs.c("google.maps.places.v1.Places", "GetPlace");
                            a4.b();
                            exhl exhlVar3 = exhl.a;
                            eyfc eyfcVar = ffag.a;
                            a4.a = new ffae(exhlVar3);
                            a4.b = new ffae(exir.a);
                            febsVar = a4.a();
                            exiu.d = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, c.b), exhlVar2);
            }
        }, erpp.a);
        dhqd dhqdVar = edqsVar.c;
        if (dhqdVar != null) {
            dhqdVar.a(new dhrb() { // from class: edie
                @Override // defpackage.dhrb
                public final void a() {
                    ListenableFuture.this.cancel(true);
                }
            });
        }
        return duik.a(g).f(new dhrd() { // from class: edif
            @Override // defpackage.dhrd
            public final dhre a(Object obj) {
                dhri dhriVar = new dhri();
                dhriVar.b(new edqt(edij.this.d.a((exir) obj)));
                return dhriVar.a;
            }
        }).d(new dhqh() { // from class: edig
            @Override // defpackage.dhqh
            public final Object a(dhre dhreVar) {
                if (((dhrm) dhreVar).d) {
                    return dhreVar;
                }
                ListenableFuture listenableFuture = a3;
                int i2 = i;
                long j = a;
                edij edijVar = edij.this;
                edijVar.a.d(dhreVar, j, edijVar.b.a(), 3, i2, (edfs) ((erre) listenableFuture).b);
                return dhreVar;
            }
        });
    }

    public final exit c(String str, edfs edfsVar) {
        fdxp[] fdxpVarArr = new fdxp[3];
        String a = this.e.a();
        febo feboVar = new febo();
        febf febfVar = febo.c;
        int i = febj.d;
        feboVar.g(new febe("X-Goog-Api-Key", febfVar), a);
        edik edikVar = this.g;
        Context context = edikVar.a;
        String a2 = edtc.a(context.getPackageManager(), context.getPackageName());
        if (!TextUtils.isEmpty(a2)) {
            feboVar.g(new febe("X-Android-Package", febo.c), edikVar.a.getPackageName());
            feboVar.g(new febe("X-Places-Android-Sdk", febo.c), "4.2.0");
            feboVar.g(new febe("X-Android-Cert", febo.c), a2);
        }
        if (!str.isEmpty()) {
            feboVar.g(new febe("X-Goog-FieldMask", febo.c), str);
        }
        exit exitVar = this.f;
        fdxpVarArr[0] = new ffaw(feboVar);
        edfsVar.b();
        fdxpVarArr[1] = new ffaw(new febo());
        fdxpVarArr[2] = this.h;
        return (exit) exitVar.l(fdxpVarArr);
    }
}
