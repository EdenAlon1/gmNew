package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dirg implements disr {
    private static final dktn a = new dktn("DigestBasedHttpRequestExecutor");
    private final dijy b;
    private final InstantMessageConfiguration c;

    public dirg(InstantMessageConfiguration instantMessageConfiguration, dijy dijyVar) {
        this.c = instantMessageConfiguration;
        this.b = dijyVar;
    }

    @Override // defpackage.disr
    public final ListenableFuture a(DefaultHttpClient defaultHttpClient, HttpContext httpContext, HttpRequestBase httpRequestBase) {
        dktn dktnVar = a;
        dkty.l(dktnVar, "Executing authenticated HTTP [%s] request to host [%s]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost());
        if (Objects.isNull(httpContext.getAttribute("preemptive-auth"))) {
            dkty.l(dktnVar, "No preemptive authentication context found. Falling back to the default HTTP context.", new Object[0]);
            return b(defaultHttpClient, httpRequestBase);
        }
        String f = ditn.f(httpRequestBase);
        this.b.d(f, ditn.k(httpRequestBase.getMethod()), enoz.a);
        long longValue = dkvj.a().longValue();
        dkty.p(dktnVar, "Setting up HTTP client authentication!", new Object[0]);
        this.b.a = eyyh.AUTHENTICATION_TYPE_DIGEST;
        InstantMessageConfiguration instantMessageConfiguration = this.c;
        defaultHttpClient.getCredentialsProvider().setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(instantMessageConfiguration.mFtHttpContentServerUser, instantMessageConfiguration.mFtHttpContentServerPassword));
        HttpResponse execute = defaultHttpClient.execute(httpRequestBase, httpContext);
        dkty.l(dktnVar, "completed HTTP [%s] to host [%s] with result [%d]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost(), Integer.valueOf(execute.getStatusLine().getStatusCode()));
        this.b.b(f, execute.getStatusLine().getStatusCode(), dkvj.a().longValue() - longValue);
        return erqt.i(execute);
    }

    @Override // defpackage.disr
    public final ListenableFuture b(DefaultHttpClient defaultHttpClient, HttpRequestBase httpRequestBase) {
        dkty.l(a, "Executing unauthenticated HTTP [%s] request to host [%s]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost());
        String f = ditn.f(httpRequestBase);
        this.b.d(f, ditn.k(httpRequestBase.getMethod()), enoz.a);
        long longValue = dkvj.a().longValue();
        HttpResponse execute = defaultHttpClient.execute(httpRequestBase);
        this.b.b(f, execute.getStatusLine().getStatusCode(), dkvj.a().longValue() - longValue);
        return erqt.i(execute);
    }
}
