package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvhc implements dvgl {
    private final dvdy a;
    private final ConnectivityManager b;

    public dvhc(Context context, dvdy dvdyVar) {
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.a = dvdyVar;
    }

    private final boolean c() {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // defpackage.dvgl
    public final dvgk a() {
        return dvgk.NETWORK;
    }

    @Override // defpackage.emva
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        ewag ewagVar = (ewag) obj;
        dvgn dvgnVar = (dvgn) obj2;
        evyp evypVar = ewagVar.c;
        if (evypVar == null) {
            evypVar = evyp.a;
        }
        evsy b = evsy.b(evypVar.c);
        if (b == null) {
            b = evsy.CONNECTIVITY_UNKNOWN;
        }
        int ordinal = b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (!c()) {
                        this.a.c(dvgnVar.a(), "Offline but want online", new Object[0]);
                    }
                    return c();
                }
                dvdy dvdyVar = this.a;
                dvdp a = dvgnVar.a();
                evyp evypVar2 = ewagVar.c;
                if (evypVar2 == null) {
                    evypVar2 = evyp.a;
                }
                evsy b2 = evsy.b(evypVar2.c);
                if (b2 == null) {
                    b2 = evsy.CONNECTIVITY_UNKNOWN;
                }
                dvdyVar.d(a, "Invalid Connectivity value: %s", b2);
                return true;
            }
            if (c()) {
                this.a.c(dvgnVar.a(), "Online but want offline", new Object[0]);
            }
            if (c()) {
                return false;
            }
        }
        return true;
    }
}
