package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsz implements acus {
    private static final cskc b = cskc.g("Bugle", "DownloadFileRequestHandler");
    public final Context a;
    private final errl c;
    private final errl d;

    public acsz(Context context, errl errlVar, errl errlVar2) {
        this.a = context;
        this.c = errlVar;
        this.d = errlVar2;
    }

    @Override // defpackage.acus
    public final elfl a(final esnk esnkVar, final esnl esnlVar) {
        b.p("Received DownloadFileRequest from Ditto");
        final esmh esmhVar = esnkVar.b == 207 ? (esmh) esnkVar.c : esmh.a;
        try {
            final InputStream m = esmhVar.c.m();
            try {
                elfl h = elfo.g(new Callable() { // from class: acsx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return cbgi.g(m, acsz.this.a);
                    }
                }, this.c).h(new emwl() { // from class: acsy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            esmh esmhVar2 = esmhVar;
                            acsz acszVar = acsz.this;
                            Intent a = akuv.c(acszVar.a, DittoWebActivity.class, "android.intent.action.VIEW").a();
                            a.setDataAndType(uri, esmhVar2.b);
                            a.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                            eldl.p(acszVar.a, a);
                        }
                        esnk esnkVar2 = esnkVar;
                        esnl esnlVar2 = esnlVar;
                        String str = esnkVar2.d;
                        esnlVar2.copyOnWrite();
                        esnn esnnVar = (esnn) esnlVar2.instance;
                        esnn esnnVar2 = esnn.a;
                        str.getClass();
                        esnnVar.d = str;
                        fagh faghVar = fagh.OK;
                        esnlVar2.copyOnWrite();
                        ((esnn) esnlVar2.instance).e = faghVar.a();
                        eyex eyexVar = eyex.a;
                        esnlVar2.copyOnWrite();
                        esnn esnnVar3 = (esnn) esnlVar2.instance;
                        eyexVar.getClass();
                        esnnVar3.c = eyexVar;
                        esnnVar3.b = 207;
                        return esnlVar2.build();
                    }
                }, this.d);
                m.close();
                return h;
            } finally {
            }
        } catch (IOException e) {
            String str = esnkVar.d;
            esnlVar.copyOnWrite();
            esnn esnnVar = (esnn) esnlVar.instance;
            esnn esnnVar2 = esnn.a;
            str.getClass();
            esnnVar.d = str;
            fagh faghVar = fagh.INTERNAL;
            esnlVar.copyOnWrite();
            ((esnn) esnlVar.instance).e = faghVar.a();
            String str2 = (String) Optional.ofNullable(e.getMessage()).orElse("Unknown Error");
            esnlVar.copyOnWrite();
            esnn esnnVar3 = (esnn) esnlVar.instance;
            str2.getClass();
            esnnVar3.f = str2;
            return elfo.e(esnlVar.build());
        }
    }
}
