package defpackage;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euta implements eutd, eutf {
    public final euug a;
    public final euug b;
    private final Context c;
    private final Set d;
    private final Executor e;

    public euta(final Context context, final String str, Set set, euug euugVar, Executor executor) {
        this.a = new euug() { // from class: eusw
            @Override // defpackage.euug
            public final Object a() {
                return new eutg(context, str);
            }
        };
        this.d = set;
        this.e = executor;
        this.b = euugVar;
        this.c = context;
    }

    @Override // defpackage.eutd
    public final dhre a() {
        return !krb.a(this.c) ? dhrt.c("") : dhrt.a(this.e, new Callable() { // from class: eusx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String byteArrayOutputStream;
                euta eutaVar = euta.this;
                synchronized (eutaVar) {
                    Object a = eutaVar.a.a();
                    List a2 = ((eutg) a).a();
                    ((eutg) a).b();
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < a2.size(); i++) {
                        euth euthVar = (euth) a2.get(i);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", euthVar.a());
                        jSONObject.put("dates", new JSONArray((Collection) euthVar.b()));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, "2");
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        try {
                            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                        } finally {
                        }
                    } finally {
                    }
                }
                return byteArrayOutputStream;
            }
        });
    }

    @Override // defpackage.eutf
    public final synchronized int b() {
        euug euugVar = this.a;
        long currentTimeMillis = System.currentTimeMillis();
        Object a = euugVar.a();
        if (!((eutg) a).g(currentTimeMillis)) {
            return 1;
        }
        ((eutg) a).c();
        return 3;
    }

    public final void c() {
        if (this.d.size() <= 0) {
            dhrt.c(null);
        } else if (krb.a(this.c)) {
            dhrt.a(this.e, new Callable() { // from class: eusz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    euta eutaVar = euta.this;
                    synchronized (eutaVar) {
                        ((eutg) eutaVar.a.a()).d(System.currentTimeMillis(), ((euyu) eutaVar.b.a()).a());
                    }
                    return null;
                }
            });
        } else {
            dhrt.c(null);
        }
    }
}
