package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.firebase.appindexing.internal.IAppIndexingService;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euoo extends dfuo {
    final /* synthetic */ euop a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public euoo(euop euopVar) {
        super(null, false, 9002);
        this.a = euopVar;
    }

    @Override // defpackage.dfuo
    protected final /* bridge */ /* synthetic */ void a(dfqk dfqkVar, dhri dhriVar) {
        euoj mutate = ((IAppIndexingService) ((euoi) dfqkVar).w()).mutate(new euon(this, dhriVar), this.a.a, ApiMetadata.a);
        int i = mutate == null ? 2 : mutate.a;
        boolean z = true;
        euop euopVar = null;
        if (i == 3) {
            if (eupa.a(4)) {
                Log.i("FirebaseAppIndex", "Queue was full. API call will be retried.");
            }
            if (dhriVar.d(null)) {
                synchronized (this.a.c.b) {
                    euoq euoqVar = this.a.c;
                    if (euoqVar.c == 0) {
                        euop euopVar2 = (euop) euoqVar.b.peek();
                        dfwv.i(euopVar2 == this.a);
                        euopVar = euopVar2;
                    } else {
                        euoqVar.c = 2;
                    }
                }
            }
        } else {
            if (i != 1) {
                String h = a.h(i, "API call failed. Status code: ");
                if (eupa.a(6)) {
                    Log.e("FirebaseAppIndex", h);
                }
                if (dhriVar.d(null)) {
                    this.a.b.a(new eunl("Indexing error."));
                }
            }
            synchronized (this.a.c.b) {
                if (((euop) this.a.c.b.poll()) != this.a) {
                    z = false;
                }
                dfwv.i(z);
                euopVar = (euop) this.a.c.b.peek();
                this.a.c.c = 0;
            }
        }
        if (euopVar != null) {
            euopVar.a();
        }
    }
}
