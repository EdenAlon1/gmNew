package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djvo {
    private static final entd e = entd.c(dktl.a);
    public final ExecutorService a;
    public final dikl b;
    public final djxx c;
    public final ctwb d;
    private final djtw f;
    private final dkpm g;
    private final djvk h;
    private final ffbr i;
    private final ffbr j;

    public djvo(dikl diklVar, djxx djxxVar, djtw djtwVar, dkpm dkpmVar, djvk djvkVar, ctwb ctwbVar, ExecutorService executorService, ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = diklVar;
        this.c = djxxVar;
        this.f = djtwVar;
        this.g = dkpmVar;
        this.h = djvkVar;
        this.d = ctwbVar;
        this.i = ffbrVar;
        this.a = executorService;
        this.j = ffbrVar2;
    }

    private static void e(HttpURLConnection httpURLConnection, djxs djxsVar, djta djtaVar, int i) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        djxsVar.an(djtaVar, i);
    }

    private final void f(Context context, dkbn dkbnVar, int i, String str, String str2, djrm djrmVar) {
        int i2;
        String str3;
        String str4;
        ezez ezezVar = ezez.RCS_PROVISIONING_UNKNOWN_STATE;
        String str5 = (String) Optional.ofNullable(str2).map(new Function() { // from class: dkbf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return emxe.a((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("unknown");
        dkaz dkazVar = new dkaz();
        dkazVar.b(ezezVar);
        dkazVar.f = 2;
        if (str == null) {
            throw new NullPointerException("Null requestId");
        }
        dkazVar.b = str;
        dkazVar.a(str5);
        if (dkazVar.d == null) {
            dkazVar.d = (eyyo) eyyq.a.createBuilder();
        }
        eyyo eyyoVar = dkazVar.d;
        eyyoVar.copyOnWrite();
        eyyq eyyqVar = (eyyq) eyyoVar.instance;
        eyyq eyyqVar2 = eyyq.a;
        eyyqVar.c = i - 1;
        eyyqVar.b |= 1;
        dkazVar.b(dkbnVar.b());
        dkazVar.a(dkbnVar.f());
        dikl diklVar = this.b;
        eyyo eyyoVar2 = dkazVar.d;
        if (eyyoVar2 != null) {
            dkazVar.e = (eyyq) eyyoVar2.build();
        } else if (dkazVar.e == null) {
            dkazVar.e = (eyyq) ((eyyo) eyyq.a.createBuilder()).build();
        }
        ezez ezezVar2 = dkazVar.a;
        if (ezezVar2 != null && (i2 = dkazVar.f) != 0 && (str3 = dkazVar.b) != null && (str4 = dkazVar.c) != null) {
            diklVar.i(context, new dkba(ezezVar2, i2, str3, str4, dkazVar.e), djrmVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (dkazVar.a == null) {
            sb.append(" requestState");
        }
        if (dkazVar.f == 0) {
            sb.append(" provisioningEngineWorker");
        }
        if (dkazVar.b == null) {
            sb.append(" requestId");
        }
        if (dkazVar.c == null) {
            sb.append(" provisioningSessionId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void a(HttpURLConnection httpURLConnection, InputStream inputStream, String str) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                dkty.s(e2, "Unable to close response body input stream in state %s", str);
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    final void b(String str) {
        dkdw dkdwVar = (dkdw) this.i.b();
        int i = engw.d;
        dkdwVar.s(str, enou.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0249 A[Catch: dksb -> 0x0296, dkbs -> 0x0298, IOException -> 0x029a, SocketTimeoutException -> 0x029c, all -> 0x029e, TryCatch #12 {SocketTimeoutException -> 0x029c, IOException -> 0x029a, blocks: (B:5:0x0019, B:7:0x003c, B:8:0x0043, B:10:0x004d, B:11:0x0054, B:13:0x0063, B:18:0x0074, B:20:0x0080, B:22:0x008a, B:33:0x01bb, B:35:0x0249, B:37:0x024f, B:41:0x0279, B:43:0x027e, B:57:0x028e, B:56:0x028b, B:60:0x0290, B:79:0x015f, B:81:0x0173, B:83:0x018b, B:85:0x0199, B:87:0x01a3, B:89:0x01ad), top: B:4:0x0019, outer: #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final j$.util.Optional c(android.content.Context r25, defpackage.djxs r26, android.net.Network r27, java.lang.String r28, int r29, defpackage.dkbn r30, defpackage.djrm r31) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djvo.c(android.content.Context, djxs, android.net.Network, java.lang.String, int, dkbn, djrm):j$.util.Optional");
    }

    final void d(String str, HttpURLConnection httpURLConnection) {
        csix.l(httpURLConnection);
        ArrayList arrayList = new ArrayList();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        ArrayList<String> arrayList2 = new ArrayList();
        if (headerFields != null) {
            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (value != null && ("Set-Cookie".equals(key) || "Set-Cookie2".equals(key))) {
                    arrayList2.addAll(value);
                }
            }
        }
        ArrayList<HttpCookie> arrayList3 = new ArrayList();
        for (String str2 : arrayList2) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    arrayList3.addAll(HttpCookie.parse(str2));
                } catch (IllegalArgumentException unused) {
                    dkty.q("Error parsing a cookie header '%s'", str2);
                }
            }
        }
        for (HttpCookie httpCookie : arrayList3) {
            dkty.o("Found [%s] cookie [%s]", httpCookie.getName(), dktx.GENERIC.c(httpCookie.getValue()));
            if (httpCookie.getDiscard() || httpCookie.hasExpired()) {
                dkty.o("Ignore discarded, expired or empty name cookie", new Object[0]);
            } else {
                arrayList.add(new djte(httpCookie));
            }
        }
        if (arrayList.isEmpty()) {
            dkty.q("Couldn't find cookies", new Object[0]);
        }
        ((dkdw) this.i.b()).s(str, arrayList);
    }
}
