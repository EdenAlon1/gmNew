package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class disi implements disr {
    public static final dktn a = new dktn("GbaBasedHttpRequestExecutor");
    static final diyy b = diyv.b("enable_http_gba_failure_logging");
    public final disn c;
    public final dijy d;
    public final errl e;
    public final ffbr f;
    private final InstantMessageConfiguration g;

    public disi(disn disnVar, errl errlVar, ffbr ffbrVar, InstantMessageConfiguration instantMessageConfiguration, dijy dijyVar) {
        this.c = disnVar;
        this.d = dijyVar;
        this.e = errlVar;
        this.f = ffbrVar;
        this.g = instantMessageConfiguration;
    }

    public static final void d(Header[] headerArr, String str) {
        final ArrayList arrayList = new ArrayList();
        Iterable$EL.forEach(Arrays.asList(headerArr), new Consumer() { // from class: disc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Header header = (Header) obj;
                dktn dktnVar = disi.a;
                arrayList.add(String.format("%s: %s", header.getName(), dktx.GENERIC.c(header.getValue())));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dkty.d(a, "%s headers:\n%s", str, Collection.EL.stream(arrayList).map(new Function() { // from class: disd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((String) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining("\n")));
    }

    public static final void e(Header[] headerArr) {
        d(headerArr, "Request");
    }

    private final void f(ListenableFuture listenableFuture, long j, String str) {
        erqt.r(listenableFuture, new dish(this, str, j), this.e);
    }

    @Override // defpackage.disr
    public final ListenableFuture a(final DefaultHttpClient defaultHttpClient, final HttpContext httpContext, final HttpRequestBase httpRequestBase) {
        if (Objects.isNull(httpContext.getAttribute("preemptive-auth"))) {
            dkty.r(a, "No preemptive authentication context found. Falling back to the default HTTP context.", new Object[0]);
            return b(defaultHttpClient, httpRequestBase);
        }
        dkty.l(a, "Executing authenticated HTTP [%s] request to host [%s]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost());
        InstantMessageConfiguration instantMessageConfiguration = this.g;
        disn disnVar = this.c;
        final String str = instantMessageConfiguration.mFtHttpContentServerUri;
        ListenableFuture g = erny.g(c(disnVar.a(str, false), defaultHttpClient, httpRequestBase, httpContext), new eroh() { // from class: disb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                HttpResponse httpResponse = (HttpResponse) obj;
                dktn dktnVar = disi.a;
                HttpRequestBase httpRequestBase2 = httpRequestBase;
                dkty.l(dktnVar, "Obtained HTTP %s response: %s", httpRequestBase2.getMethod(), httpResponse.getStatusLine());
                disi.d(httpResponse.getAllHeaders(), "Response");
                if (httpResponse.getStatusLine().getStatusCode() != 401) {
                    return erqt.i(httpResponse);
                }
                disi disiVar = disi.this;
                HttpContext httpContext2 = httpContext;
                DefaultHttpClient defaultHttpClient2 = defaultHttpClient;
                String str2 = str;
                dkty.r(disi.a, "HTTP request with GBA authentication failed with %d. Forcing bootstrapping and making a second request.", 401);
                return disiVar.c(disiVar.c.a(str2, true), defaultHttpClient2, httpRequestBase2, httpContext2);
            }
        }, this.e);
        return g;
    }

    @Override // defpackage.disr
    public final ListenableFuture b(final DefaultHttpClient defaultHttpClient, final HttpRequestBase httpRequestBase) {
        long longValue = dkvj.a().longValue();
        String method = httpRequestBase.getMethod();
        dkty.l(a, "Executing unauthenticated HTTP [%s] request to host [%s]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost());
        this.d.a = eyyh.AUTHENTICATION_TYPE_NONE;
        String f = ditn.f(httpRequestBase);
        this.d.d(f, ditn.k(method), enoz.a);
        e(httpRequestBase.getAllHeaders());
        ListenableFuture submit = this.e.submit(new Callable() { // from class: dise
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dktn dktnVar = disi.a;
                return defaultHttpClient.execute(httpRequestBase);
            }
        });
        f(submit, longValue, f);
        return submit;
    }

    public final ListenableFuture c(ListenableFuture listenableFuture, final DefaultHttpClient defaultHttpClient, final HttpRequestBase httpRequestBase, final HttpContext httpContext) {
        long longValue = dkvj.a().longValue();
        final String method = httpRequestBase.getMethod();
        final String f = ditn.f(httpRequestBase);
        ListenableFuture g = erny.g(listenableFuture, new eroh() { // from class: disg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                String str = method;
                dkty.l(disi.a, "Obtained GBA credentials, making authenticated %s request.", str);
                disi disiVar = disi.this;
                dijy dijyVar = disiVar.d;
                dijyVar.a = eyyh.AUTHENTICATION_TYPE_GBA;
                dijyVar.d(f, ditn.k(str), enoz.a);
                final DefaultHttpClient defaultHttpClient2 = defaultHttpClient;
                defaultHttpClient2.getCredentialsProvider().setCredentials(AuthScope.ANY, (Credentials) obj);
                final HttpRequestBase httpRequestBase2 = httpRequestBase;
                disi.e(httpRequestBase2.getAllHeaders());
                final HttpContext httpContext2 = httpContext;
                return disiVar.e.submit(new Callable() { // from class: disf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dktn dktnVar = disi.a;
                        return defaultHttpClient2.execute(httpRequestBase2, httpContext2);
                    }
                });
            }
        }, this.e);
        f(g, longValue, f);
        return g;
    }
}
