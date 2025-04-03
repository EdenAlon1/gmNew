package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.ArrayMap;
import java.net.Proxy;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caqs implements fbba {
    public static eere a(Context context, errl errlVar, final fazb fazbVar) {
        cskc cskcVar = caqq.a;
        List list = dfld.m;
        dfld c = new dfla(context, "EXPRESSION").c();
        dfmc dfmcVar = new dfmc(c, "EXPRESSION_COUNTERS", 100);
        emyr emyrVar = new emyr(false);
        Context applicationContext = context.getApplicationContext();
        eumc eumcVar = (eumc) eumd.a.createBuilder();
        eumcVar.copyOnWrite();
        ((eumd) eumcVar.instance).b = eulz.a(4);
        String d = crob.d(context);
        eumcVar.copyOnWrite();
        eumd eumdVar = (eumd) eumcVar.instance;
        d.getClass();
        eumdVar.c = d;
        eumd eumdVar2 = (eumd) eumcVar.build();
        emyl a = emys.a(new emyl() { // from class: caqp
            @Override // defpackage.emyl
            public final Object get() {
                cskc cskcVar2 = caqq.a;
                chhs chhsVar = (chhs) fazb.this.b();
                synchronized (chhsVar.q) {
                    feau feauVar = chhsVar.p;
                    if (feauVar != null) {
                        return feauVar;
                    }
                    ensk e = chhs.a.e();
                    e.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/common/GrpcChannelManager", "getExpressiveStickerChannel", 296, "GrpcChannelManager.java")).q("Creating Expressive Sticker gRPC Channel");
                    feau a2 = chhsVar.a((String) chhs.i.e(), chhsVar.g(6));
                    chhsVar.p = a2;
                    return a2;
                }
            }
        });
        String str = (String) caqq.b.e();
        eeuy eeuyVar = new eeuy(Proxy.NO_PROXY, eeuy.a, new ArrayMap(), errlVar);
        Uri parse = Uri.parse((String) caqu.a.e());
        if (errlVar == null) {
            throw new IllegalStateException("bgExecutor == null");
        }
        if (eumdVar2 == null) {
            throw new IllegalStateException("clientInfo == null");
        }
        if (a == null) {
            throw new IllegalStateException("rpcChannelSupplier and rpcChannel both null");
        }
        if (str != null) {
            return new eert(applicationContext, errlVar, eumdVar2, a, str, new eesb(applicationContext), new eeuj(applicationContext, eumdVar2, c, dfmcVar), eeuyVar, parse, emyrVar);
        }
        throw new IllegalStateException("apiKey == null");
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
