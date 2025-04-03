package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekgy {
    public final Context a;
    public final eixo b;
    public final ekem c;
    public final erqa d;
    public eisx e;
    private final fazb f;
    private final ecvo g;
    private final Map h;

    /* compiled from: PG */
    public interface a {
        ekbo fG();

        ekbo fH();
    }

    public ekgy(Context context, fazb fazbVar, ecvo ecvoVar, eixo eixoVar, ekem ekemVar, Map map) {
        context.getClass();
        fazbVar.getClass();
        ecvoVar.getClass();
        eixoVar.getClass();
        this.a = context;
        this.f = fazbVar;
        this.g = ecvoVar;
        this.b = eixoVar;
        this.c = ekemVar;
        this.h = map;
        this.d = new erqa();
    }

    public final ListenableFuture a(ecwu ecwuVar, eyee eyeeVar, String str, String str2) {
        String str3;
        if (eyeeVar != null) {
            ecvo ecvoVar = this.g;
            Set set = (Set) this.h.get(ecvd.b(str2));
            if (set == null) {
                set = ffen.a;
            }
            str3 = str2;
            ((ecyx) ecvoVar.c).a(eyeeVar, set, str, str3, true, true);
        } else {
            str3 = str2;
        }
        return ((ekdb) this.f.b()).a(str3, ecwuVar);
    }
}
