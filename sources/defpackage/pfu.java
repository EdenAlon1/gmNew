package defpackage;

import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfu extends peu {
    private WebMessagePort a;
    private WebMessagePortBoundaryInterface b;

    public pfu(WebMessagePort webMessagePort) {
        this.a = webMessagePort;
    }

    public static peu[] f(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        peu[] peuVarArr = new peu[webMessagePortArr.length];
        for (int i = 0; i < webMessagePortArr.length; i++) {
            peuVarArr[i] = new pfu(webMessagePortArr[i]);
        }
        return peuVarArr;
    }

    private final WebMessagePort g() {
        if (this.a == null) {
            pgg pggVar = pgb.a;
            this.a = (WebMessagePort) pggVar.a.convertWebMessagePort(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    private final WebMessagePortBoundaryInterface h() {
        if (this.b == null) {
            pgg pggVar = pgb.a;
            this.b = (WebMessagePortBoundaryInterface) fimp.a(WebMessagePortBoundaryInterface.class, pggVar.a.convertWebMessagePort(this.a));
        }
        return this.b;
    }

    @Override // defpackage.peu
    public final WebMessagePort a() {
        return g();
    }

    @Override // defpackage.peu
    public final InvocationHandler b() {
        return Proxy.getInvocationHandler(h());
    }

    @Override // defpackage.peu
    public final void c() {
        pey peyVar = pga.a;
        g().close();
    }

    @Override // defpackage.peu
    public final void d(pes pesVar) {
        int i = pesVar.c;
        pey peyVar = pga.a;
        if (i == 0) {
            g().postMessage(pfi.a(pesVar));
        } else {
            if (!peyVar.d() || !pfq.b(pesVar.c)) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            h().postMessage(new fimo(new pfq(pesVar)));
        }
    }

    @Override // defpackage.peu
    public final void e(pet petVar) {
        if (pga.c.d()) {
            h().setWebMessageCallback(new fimo(new pfr(petVar)));
        } else {
            g().setWebMessageCallback(new pfh(petVar));
        }
    }

    public pfu(InvocationHandler invocationHandler) {
        this.b = (WebMessagePortBoundaryInterface) fimp.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
