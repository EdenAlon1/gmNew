package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Executor;
import java.util.function.Function;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aipd extends chgr {
    public final Executor a;
    private final aipn b;
    private final chga c;
    private final Context d;
    private final ffbr e;

    public aipd(Context context, Executor executor, chga chgaVar, aipn aipnVar, ffbr ffbrVar) {
        this.d = context;
        this.a = executor;
        this.c = chgaVar;
        this.b = aipnVar;
        this.e = ffbrVar;
    }

    public final elfl a(final Uri uri, final String str, final String str2, final String str3, final Optional optional) {
        return elfl.g(kfg.a(new kfd() { // from class: aipc
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                String str4 = str;
                aipd aipdVar = aipd.this;
                String str5 = str2;
                Uri uri2 = uri;
                Optional c = aipdVar.c(uri2, kfbVar, str4, str5, optional);
                if (c.isEmpty()) {
                    kfbVar.d();
                    return "Attachment.Download.canceled";
                }
                String str6 = str3;
                ((UrlRequest) c.get()).start();
                csjy.i("BugleNetwork", "starting download of blob " + str6 + " to " + String.valueOf(uri2));
                return "Attachment.Download.start";
            }
        }));
    }

    @Override // defpackage.chgr
    public final ListenableFuture b(fcdu fcduVar, Optional optional, final String str, String str2) {
        final Uri d = cbgi.d(str2, this.d);
        fcid fcidVar = (fcid) fcie.a.createBuilder();
        fcen fcenVar = (fcen) fceo.a.createBuilder();
        fcenVar.copyOnWrite();
        ((fceo) fcenVar.instance).c = 1;
        fcenVar.copyOnWrite();
        fceo fceoVar = (fceo) fcenVar.instance;
        str.getClass();
        fceoVar.b = str;
        fcidVar.copyOnWrite();
        fcie fcieVar = (fcie) fcidVar.instance;
        fceo fceoVar2 = (fceo) fcenVar.build();
        fceoVar2.getClass();
        fcieVar.d = fceoVar2;
        fcieVar.b |= 2;
        fcfn a = this.c.a((((Boolean) cgcv.a.e()).booleanValue() && optional.isPresent()) ? "GDitto" : "Bugle");
        eyee eyeeVar = fcduVar.b;
        a.copyOnWrite();
        fcfo fcfoVar = (fcfo) a.instance;
        fcfo fcfoVar2 = fcfo.a;
        eyeeVar.getClass();
        fcfoVar.f = eyeeVar;
        fcidVar.copyOnWrite();
        fcie fcieVar2 = (fcie) fcidVar.instance;
        fcfo fcfoVar3 = (fcfo) a.build();
        fcfoVar3.getClass();
        fcieVar2.c = fcfoVar3;
        fcieVar2.b |= 1;
        final String encodeToString = Base64.encodeToString(((fcie) fcidVar.build()).toByteArray(), 2);
        final String str3 = (String) cgyj.a.e();
        return ((Boolean) cgcv.a.e()).booleanValue() ? optional.isPresent() ? elfl.g(((aipq) this.e.b()).a((eisx) optional.get())).i(new eroh() { // from class: aipa
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return aipd.this.a(d, str3, encodeToString, str, Optional.of((aipo) obj));
            }
        }, this.a) : a(d, str3, encodeToString, str, Optional.empty()) : kfg.a(new kfd() { // from class: aipb
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                String str4 = str3;
                aipd aipdVar = aipd.this;
                String str5 = encodeToString;
                Uri uri = d;
                Optional c = aipdVar.c(uri, kfbVar, str4, str5, Optional.empty());
                if (c.isEmpty()) {
                    kfbVar.d();
                    return "Attachment.Download.canceled";
                }
                String str6 = str;
                ((UrlRequest) c.get()).start();
                csjy.i("BugleNetwork", "starting download of blob " + str6 + " to " + String.valueOf(uri));
                return "Attachment.Download.start";
            }
        });
    }

    public final Optional c(Uri uri, kfb kfbVar, final String str, final String str2, final Optional optional) {
        final aioy aioyVar = new aioy(uri, kfbVar, this.d);
        return this.b.a().map(new Function() { // from class: aioz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                UrlRequest.Builder trafficStatsTag = ((CronetEngine) obj).newUrlRequestBuilder(str, aioyVar, aipd.this.a).setPriority(2).addHeader("X-Goog-Download-Metadata", str2).setTrafficStatsTag(8195);
                Optional optional2 = optional;
                if (optional2.isPresent()) {
                    trafficStatsTag.addHeader(((aipo) optional2.get()).a, ((aipo) optional2.get()).b);
                }
                return trafficStatsTag.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
