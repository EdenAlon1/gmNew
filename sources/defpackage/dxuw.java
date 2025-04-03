package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxuw {
    public final dxih a;
    public final dxpn b;
    public final efbm c;
    public final dxsy d;
    public final Context e;
    public final dwxf f;
    public final emxc g;
    public final Executor h;

    public dxuw(Context context, dxih dxihVar, dxpn dxpnVar, efbm efbmVar, dxsy dxsyVar, dwxf dwxfVar, emxc emxcVar, Executor executor) {
        this.e = context;
        this.a = dxihVar;
        this.b = dxpnVar;
        this.c = efbmVar;
        this.d = dxsyVar;
        this.f = dwxfVar;
        this.g = emxcVar;
        this.h = executor;
    }

    public static final String a(dwtm dwtmVar) {
        return dwtmVar.c + "|" + dwtmVar.d;
    }

    public static final Set b(Map map, String str) {
        Set set = (Set) map.get(str);
        if (set != null) {
            return set;
        }
        map.put(str, new HashSet());
        return (Set) map.get(str);
    }
}
