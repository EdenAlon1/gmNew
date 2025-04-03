package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwdl {
    public final Context a;
    public final errl b;
    public final ListenableFuture c;

    public dwdl(Context context, errl errlVar) {
        this.a = context;
        this.b = errlVar;
        this.c = errlVar.submit(new Callable() { // from class: dwdi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dwdl.this.a.getSharedPreferences("com.google.geo_sdk.PREFERENCES_FILE", 0);
            }
        });
    }

    public final ListenableFuture a() {
        final ffji ffjiVar = new ffji() { // from class: dwdg
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                String string = sharedPreferences.getString("zb", "");
                return string == null ? "" : string;
            }
        };
        return erny.f(this.c, new emwl() { // from class: dwdh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }
        }, this.b);
    }
}
